package com.dao.model;

public class menu {
	
		private int menuid;
		private int restaurentid;
		private String name;
		private String description;
		private int price;
		private boolean isavailable;
		private String imagepath;
		public int getMenuid() {
			return menuid;
		}
		public void setMenuid(int menuid) {
			this.menuid = menuid;
		}
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public boolean isIsavailable() {
			return isavailable;
		}
		public void setIsavailable(boolean isavailable) {
			this.isavailable = isavailable;
		}
		public String getImagepath() {
			return imagepath;
		}
		public void setImagepath(String imagepath) {
			this.imagepath = imagepath;
		}
		public menu(int i, int j, String string, String string2, String string3, int k, String string4, String string5) {
			super();
		}
		public menu(int menuid, int restaurentid, String name, String description, int price, boolean isavailable,
				String imagepath) {
			super();
			this.menuid = menuid;
			this.restaurentid = restaurentid;
			this.name = name;
			this.description = description;
			this.price = price;
			this.isavailable = isavailable;
			this.imagepath = imagepath;
		}

		@Override
		public String toString() {
			return menuid + " " + restaurentid + " " + name + " "
					+ description + " " + price + " " + isavailable + " " + imagepath;
		}
		public boolean getisavailable() {
			return false;
		}
		

}
