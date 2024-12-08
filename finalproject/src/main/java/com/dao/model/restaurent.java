package com.dao.model;

public class restaurent {

	
		private int restaurentid;
		private String name;
		private String cuisinetype;
		private int delivarytime;
		private String address;
		private float ratings;
		private boolean isactive;
		private String imagepath;
		public int getRestaurentid() {
			return restaurentid;
		}
		public void setRestaurentid(int restaurentid) {
			this.restaurentid = restaurentid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCuisinetype() {
			return cuisinetype;
		}
		public void setCuisinetype(String cuisinetype) {
			this.cuisinetype = cuisinetype;
		}
		public int getDelivarytime() {
			return delivarytime;
		}
		public void setDelivarytime(int delivarytime) {
			this.delivarytime = delivarytime;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public float getRatings() {
			return ratings;
		}
		public void setRatings(float ratings) {
			this.ratings = ratings;
		}
		public boolean isIsactive() {
			return isactive;
		}
		public void setIsactive(boolean isactive) {
			this.isactive = isactive;
		}
		public String getImagepath() {
			return imagepath;
		}
		public void setImagepath(String imagepath) {
			this.imagepath = imagepath;
		}
		public restaurent() {
			super();
		}
		public restaurent(int restaurentid, String name, String cuisinetype, int delivarytime, String address,
				float ratings, boolean isactive, String imagepath) {
			super();
			this.restaurentid = restaurentid;
			this.name = name;
			this.cuisinetype = cuisinetype;
			this.delivarytime = delivarytime;
			this.address = address;
			this.ratings = ratings;
			this.isactive = isactive;
			this.imagepath = imagepath;
		}
		@Override
		public String toString() {
			return  restaurentid + " " + name + " " + cuisinetype
					+ " " + delivarytime + ", " + address + " " + ratings + " "
					+ isactive + " " + imagepath;
		}
		
}
