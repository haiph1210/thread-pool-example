package com.haiph;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class MainRSA {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Dữ liệu cần mã hóa
        String originalData = "Hello, this is a secret message.";

        // Mã hóa dữ liệu bằng khóa công khai
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(originalData.getBytes());

        // In dữ liệu đã mã hóa
        System.out.println("Dữ liệu đã mã hóa: " + new String(encryptedBytes));

        // Giải mã dữ liệu bằng khóa riêng tư
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        // In dữ liệu đã giải mã
        String decryptedData = new String(decryptedBytes);
        System.out.println("Dữ liệu đã giải mã: " + decryptedData);
    }
}
