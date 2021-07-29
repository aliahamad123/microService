package com.udiseservices.utility;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.noise.CurvedLineNoiseProducer;
import cn.apiclub.captcha.text.producer.DefaultTextProducer;
import cn.apiclub.captcha.text.renderer.DefaultWordRenderer;

public class CaptchaUtil {
	
	
	//create Captcha 
	
	public  static Captcha createCaptch(Integer width, Integer height) {
	
		return new Captcha.Builder(width, height)
				.addBackground(new GradiatedBackgroundProducer())
				.addText(new DefaultTextProducer(),new DefaultWordRenderer())
				.addNoise(new CurvedLineNoiseProducer())
				.build();
	}
	
	
	//Converting to binary String
	
	public static String encodedCaptch(Captcha captcha) {
		
		String image = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			ImageIO.write(captcha.getImage(), "jpg", bos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte bytearray [] = Base64.getEncoder().encode(bos.toByteArray());
		image = new String(bytearray);
		return image;
		
	}

}
