package com.example.demo.controller;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;


public class WebSocketMesssageBroker {
	
	
//	@Configuration
//	@EnableWebSocket
//	public class WebSocketConfig implements WebSocketConfigurer {
//	    @Override
//	    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//	        registry.addHandler(tradeWebSocketHandler(), "/stocks").setAllowedOrigins("*");
//	    }
//
//	    @Bean
//	    public WebSocketHandler tradeWebSocketHandler() {
//	        return (WebSocketHandler) new TradeWebSocketHandler();
//	    }
//	}
//
//
//	public class TradeWebSocketHandler extends TextWebSocketHandler {
//	    private final ObjectMapper objectMapper = new ObjectMapper();
//	    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();
//
//	    Random r = new Random();
//
//	    @Override
//	    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//	        float oldPrice = 0.0f;
//
//	        //Publishing new stock prices every one second for 100 times
//	        for (int i=0; i < 100; i ++){
//	            //Calculating Random stock price between 12$ to 13$
//	            float stockPrice = 12 + r.nextFloat() * (13 - 12);
//	            float roundedPrice = (float) (Math.round(stockPrice * 100.0) / 100.0);
//
//	            //Creating a Stock Object
//	            Stock stock = new Stock("Amazon",
//	                    "https://cdn.cdnlogo.com/logos/a/77/amazon-dark.svg",
//	                    roundedPrice);
//	            //Finding whether the stock pric increased or decreased
//	            if (roundedPrice > oldPrice){
//	                stock.setIncreased(true);
//	            }
//	            oldPrice = roundedPrice;
//
//	            //Sending StockPrice
//	            TextMessage message = new TextMessage(objectMapper.writeValueAsString(stock));
//	            session.sendMessage(message);
//	            Thread.sleep(1000);
//	        }
//	        sessions.add(session);
//	    }
//	}
//
//	// Stock Modal Class
//	public class Stock {
//	    String name;
//	    String icon;
//	    float price;
//	    boolean increased;
//
//	    public Stock(String name, String icon, float price) {
//	        this.name = name;
//	        this.icon = icon;
//	        this.price = price;
//	    }
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getIcon() {
//			return icon;
//		}
//
//		public void setIcon(String icon) {
//			this.icon = icon;
//		}
//
//		public float getPrice() {
//			return price;
//		}
//
//		public void setPrice(float price) {
//			this.price = price;
//		}
//
//		public boolean isIncreased() {
//			return increased;
//		}
//
//		public void setIncreased(boolean increased) {
//			this.increased = increased;
//		}
//	    
//	    
//
//	  // Getters & setters ...
//	}

}
