/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.auth;

import com.twitter.clientlib.Pair;
import  com.twitter.clientlib.ApiException;

import okhttp3.Credentials;

import java.net.URI;
import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.oauth2.clientauthentication.ClientAuthentication;
import com.github.scribejava.core.oauth2.clientauthentication.RequestBodyAuthenticationScheme;

import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuth implements Authentication {
  private static final Logger log = Logger.getLogger(OAuth.class.getName());

  private String tokenUrl;
  private String absoluteTokenUrl;
  private OAuthFlow flow = OAuthFlow.application;
  private OAuth20Service service;
  private TwitterOAuth20Api authApi;
  private String scope;
  private String username;
  private String password;
  private String code;
  private volatile OAuth2AccessToken accessToken;

  public OAuth(String basePath, String tokenUrl) {
    this.tokenUrl = tokenUrl;
    this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
    authApi = TwitterOAuth20Api.instance();
  }

  private static String createAbsoluteTokenUrl(String basePath, String tokenUrl) {
    return  basePath + tokenUrl;
  }

    @Override
     public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
      if (accessToken == null) {
        obtainAccessToken(null);
      }
      if (accessToken != null) {
        headerParams.put("Authorization", "Bearer " + accessToken.getAccessToken());
      }
    }

    public OAuth2AccessToken renewAccessToken() throws ApiException {
      String refreshToken = null;
      if (accessToken != null) {
        refreshToken = accessToken.getRefreshToken();
        accessToken = null;
      }
      return obtainAccessToken(refreshToken);
    }

    public synchronized OAuth2AccessToken obtainAccessToken(String refreshToken) throws ApiException {
      if (service == null) {
        log.log(Level.FINE, "service is null in obtainAccessToken.");
        return null;
      }
      try {
        if (refreshToken != null) {
          return service.refreshAccessToken(refreshToken);
        }
      } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
        log.log(Level.FINE, "Refreshing the access token using the refresh token failed", e);
        throw new ApiException(e);
      }
      try {
        switch (flow) {
          case password:
            if (username != null && password != null) {
              accessToken = service.getAccessTokenPasswordGrant(username, password, scope);
            }
            break;
          case accessCode:
            if (code != null) {
              accessToken = service.getAccessToken(code);
              code = null;
            }
            break;
          case application:
            accessToken = service.getAccessTokenClientCredentialsGrant(scope);
            break;
          default:
            log.log(Level.SEVERE, "Invalid flow in obtainAccessToken: " + flow);
      }
      } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
        throw new ApiException(e);
      }
      return accessToken;
    }

    public OAuth2AccessToken getAccessToken() {
      return accessToken;
    }

    public OAuth setAccessToken(OAuth2AccessToken accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    public OAuth setAccessToken(String accessToken) {
      this.accessToken = new OAuth2AccessToken(accessToken);
      return this;
    }

    public OAuth setScope(String scope) {
      this.scope = scope;
      return this;
    }

    public OAuth setCredentials(String clientId, String clientSecret, Boolean debug) {
      service = new ServiceBuilder(clientId).apiSecret(clientSecret).build(authApi);
      return this;
    }

    public OAuth usePasswordFlow(String username, String password) {
      this.flow = OAuthFlow.password;
      this.username = username;
      this.password = password;
      return this;
    }

    public OAuth useAuthorizationCodeFlow(String code) {
      this.flow = OAuthFlow.accessCode;
      this.code = code;
      return this;
    }

    public OAuth setFlow(OAuthFlow flow) {
      this.flow = flow;
      return this;
    }

    public void setBasePath(String basePath) {
      this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
    }
  }
