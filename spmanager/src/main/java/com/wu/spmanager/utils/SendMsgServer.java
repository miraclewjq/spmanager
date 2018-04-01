package com.wu.spmanager.utils;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 发送短信验证码//todo:暂时没有
 */
public class SendMsgServer {

	private static final Logger logger = LoggerFactory
			.getLogger(SendMsgServer.class);

	private static final String SERVER_URL="https://api.netease.im/sms/sendtemplate.action";//请求的URL
	private static final String APP_KEY="c7b3e1cc24ea246d92a0598028fe3dbd";//账号
	private static final String APP_SECRET="878045bf767c";//密码
	private static final String MOULD_ID="3892552";//模板ID
	private static final String NONCE="123456";

	public static String SendMsg(String phoneNum)  {
		//TODO
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost(SERVER_URL);
		String curTime=String.valueOf((new Date().getTime()/1000L));
		String checkSum=CheckSumBuilder.getCheckSum(APP_SECRET,NONCE,curTime);

		//设置请求的header
		post.addHeader("AppKey",APP_KEY);
		post.addHeader("Nonce",NONCE);
		post.addHeader("CurTime",curTime);
		post.addHeader("CheckSum",checkSum);
		post.addHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");

		//设置请求参数
		List<NameValuePair> nameValuePairs =new ArrayList<>();
		nameValuePairs.add(new BasicNameValuePair("mobile",phoneNum));
		try {
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs,"utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		//执行请求
		HttpResponse response= null;
		try {
			response = httpclient.execute(post);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String responseEntity= null;
		try {
			responseEntity = EntityUtils.toString(response.getEntity(),"utf-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//判断是否发送成功，发送成功返回true
		return responseEntity;
	}

}
