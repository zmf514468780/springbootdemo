package com.zmf.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.http.HttpClientConnection;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class TestMain {
	@Test
	public void test() throws ClientProtocolException, IOException {
		CloseableHttpClient createDefault = HttpClients.createDefault();
		// HttpGet hp = new HttpGet("http://localhost:8080/login");

		HttpPost httpPost = new HttpPost("http://localhost:8080/login");
		  List<NameValuePair> nvps = new ArrayList<NameValuePair>(); 
		  nvps.add(new BasicNameValuePair("name", "ccc"));
		  nvps.add(new BasicNameValuePair("password", "mima"));
		  httpPost.setEntity(new UrlEncodedFormEntity(nvps,"UTF-8"));
		CloseableHttpResponse response = createDefault.execute(httpPost);
		int statusCode = response.getStatusLine().getStatusCode();
		
		if (statusCode == 200) {
			System.out.println(EntityUtils.toString(response.getEntity()));
		}
	}
}
