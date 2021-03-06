package com.udiseservices.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.udiseservices.beans.SessionBean;
import com.udiseservices.beans.SessionManage;
import com.udiseservices.models.UserMaster;

@RestController
@SessionAttributes("session")
public class CaptchaController {
	
	@Autowired Captcha captcha;
//	@Inject
	//SessionManage sessionManage;
	//@Resource(name="sessionScopedBean")
	//SessionBean sessionScopedBean;
	@Autowired
	private SessionManage sessionManage;
	
	@ResponseBody
	@RequestMapping(value = "searchCaptcha", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	//@Scope(value = WebApplicationContext.SCOPE_SESSION)
	//@Scope("session")

	public byte[] advanceSearch(HttpSession session) throws IOException {
	//System.out.println("Ali");
		int width = 130;
		int height = 26;
		Random random = new Random();
		int randomNumber = random.nextInt();
		String hashString = Integer.toHexString(randomNumber);
		String captchaKey = hashString.substring(0, 6);
		session.setAttribute("CAPTCHA_KEY", captchaKey);
		sessionManage.getSessionbean().setCaptchaString(captchaKey);
		
		System.out.println(sessionManage.getSessionbean().getCaptchaString());
	//	sessionScopedBean.setCaptchaString(captchaKey);
		//captcha.setCaptcha(captchaKey);

		Color background = new Color(255, 255, 255);
		Color fbl = new Color(255, 0, 0);
		Font fnt = new Font("Verdana", Font.HANGING_BASELINE, 31);
		BufferedImage cpimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics2D g = cpimg.createGraphics();
		g.setColor(background);
		g.fillRect(0, 0, width, height);
		g.setColor(fbl);

		g.setFont(fnt);
		g.drawString(captchaKey, 10, 25);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(cpimg, "jpg", baos);
		baos.flush();
		byte[] imageInByte = baos.toByteArray();
		return imageInByte;
	}

}
