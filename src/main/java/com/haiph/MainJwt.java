//package com.haiph;
//
//import java.security.InvalidParameterException;
//import java.util.Base64;
//
//public class MainJwt {
//    public static void main(String[] args) {
//
//    }
//
//    private static String[] split(String jwt) {
//        return jwt.split("\\.");
//    }
//
//    public static JsonObject toJson(String jwt) throws InvalidParameterException {
//        String[] data = split(jwt);
//        if (data.length != 3) {
//            throw new InvalidParameterException("jwt is invalid");
//        } else {
//            return new JsonObject(decode(data[1]));
//        }
//    }
//
//    private static String decode(String encodedString) {
//        return new String(Base64.getUrlDecoder().decode(encodedString));
//    }
//
//    public static JsonObject base64Decode(String encode) {
//        String json = new String(Base64.getDecoder().decode(encode));
//        return new JsonObject(json);
//    }
//}
