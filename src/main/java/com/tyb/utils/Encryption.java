package com.tyb.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * 散列函数MD5、SHA-1、SHA-256加密
 * @author 北辰不落雪
 *
 */
@SuppressWarnings("restriction")
public class Encryption {
	
	 /** 加盐参数  */
	 private final static String POLARIS = "polaris"; 
	 
	 /** 加密类型 */
	 public final static String algorithm_SHA256 = "SHA-256";
	 public final static String algorithm_SHA1 = "SHA-1";
	 public final static String algorithm_MD5 = "MD5";
	 
	 /**
	  * 加密+base64编码
	  * @param str 
	  * @return  返回编码后的字符串
	  * @throws NoSuchAlgorithmException
	  * @throws UnsupportedEncodingException
	  */
	public static String Encoder(String str, String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		if(str == null){
        	throw new NullPointerException();
        }
		//确定计算方法
        MessageDigest md = MessageDigest.getInstance(algorithm);
        BASE64Encoder base64en = new BASE64Encoder();
        //将密码与加盐串混合再加密，然后base64编码
        String newstr=base64en.encode(md.digest((POLARIS+str).getBytes("utf-8")));
        return newstr;
	 }
	 
	 
	 public static void main(String[] args) {
		try {
			String md = Encryption.Encoder("x",algorithm_SHA256);
			System.err.println(md);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


