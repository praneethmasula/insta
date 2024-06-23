package com.example.demo.dto;

public class MessageModel {
	 private String message;
	    private String from;
	    private String to;
	    private String time;
	    
	    
	    

	    public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public String getFrom() {
	        return from;
	    }

	    public void setFrom(String fromLogin) {
	        this.from = fromLogin;
	    }
	    
	    

	    @Override
	    public String toString() {
	        return "MessageModel{" +
	                "message='" + message + '\'' +
	                ", fromLogin='" + from + '\'' +
	                '}';
	    }

}
