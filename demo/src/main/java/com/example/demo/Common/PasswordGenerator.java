package com.example.demo.Common;

import java.util.Random;

/**
 *
 * @author tool-taro.com
 */
public class PasswordGenerator {

    public String password() {

        //�p�X���[�h����
        int length = 16;
        //�L���g�p�L��
        boolean useSign = true;
        //�A���t�@�x�b�g�啶���������̃X�^�C��(normal/lowerCase/upperCase)
        String style = "normal";

        //��������
        StringBuilder result = new StringBuilder();
        //�p�X���[�h�Ɏg�p���镶�����i�[
        StringBuilder source = new StringBuilder();
        //����
        for (int i = 0x30; i < 0x3A; i++) {
            source.append((char) i);
        }
        //�L��
        if (useSign) {
            for (int i = 0x21; i < 0x30; i++) {
                source.append((char) i);
            }
        }
        //�A���t�@�x�b�g������
        switch (style) {
            case "lowerCase":
                break;
            default:
                for (int i = 0x41; i < 0x5b; i++) {
                    source.append((char) i);
                }
                break;
        }
        //�A���t�@�x�b�g�啶��
        switch (style) {
            case "upperCase":
                break;
            default:
                for (int i = 0x61; i < 0x7b; i++) {
                    source.append((char) i);
                }
                break;
        }

        int sourceLength = source.length();
        Random random = new Random();
        while (result.length() < length) {
            result.append(source.charAt(Math.abs(random.nextInt()) % sourceLength));
        }
        //�W���o��
        System.out.format("��������=%1$s", result);
        return result.toString();
    }
}