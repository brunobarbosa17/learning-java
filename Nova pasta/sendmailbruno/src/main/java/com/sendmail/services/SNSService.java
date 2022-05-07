package com.sendmail.services;

import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;

public class SNSService {

  private static final String TOPIC_ARN = "arn:aws:sns:us-east-1:755977887883:bruno-aula";

  public static void sendMessage(String message) {
    AwsCredentialsProvider credentialsProvider = new AwsCredentialsProvider() {
      @Override
      public AwsCredentialsProvider resolveCredentials() {
        return new AwsCredentials() {
          @Override
          public String acessKeyId() {
            return System.getenv("AWS_ACESS_KEY");
          }
        };
      }
    };
    
  }
    
}