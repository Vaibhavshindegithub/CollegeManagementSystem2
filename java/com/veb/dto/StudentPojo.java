package com.veb.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class StudentPojo {
	
	@Id
		@Column(name = "uname")
		private String Uname;
		@Column(name = "passsword")
		private String Password;
		public String getUname() {
			return Uname;
		}
		public void setUname(String uname) {
			Uname = uname;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		@Override
		public String toString() {
			return "User_Validate [Uname=" + Uname + ", Password=" + Password + "]";
		}

		
	}

