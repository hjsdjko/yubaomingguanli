package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZiliaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 公共资料留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("ziliao_liuyan")
public class ZiliaoLiuyanView extends ZiliaoLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 用户
		/**
		* 用户名称
		*/

		@ColumnInfo(comment="用户名称",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;
	//级联表 公共资料
		/**
		* 公共资料编号
		*/

		@ColumnInfo(comment="公共资料编号",type="varchar(200)")
		private String ziliaoUuidNumber;
		/**
		* 公共资料名称
		*/

		@ColumnInfo(comment="公共资料名称",type="varchar(200)")
		private String ziliaoName;
		/**
		* 公共资料照片
		*/

		@ColumnInfo(comment="公共资料照片",type="varchar(200)")
		private String ziliaoPhoto;
		/**
		* 资料文件
		*/

		@ColumnInfo(comment="资料文件",type="varchar(200)")
		private String ziliaoFile;
		/**
		* 资料视频
		*/

		@ColumnInfo(comment="资料视频",type="varchar(200)")
		private String ziliaoVideo;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 公共资料类型
		*/
		@ColumnInfo(comment="公共资料类型",type="int(11)")
		private Integer ziliaoTypes;
			/**
			* 公共资料类型的值
			*/
			@ColumnInfo(comment="公共资料类型的字典表值",type="varchar(200)")
			private String ziliaoValue;
		/**
		* 公共资料热度
		*/

		@ColumnInfo(comment="公共资料热度",type="int(11)")
		private Integer ziliaoClicknum;
		/**
		* 公共资料介绍
		*/

		@ColumnInfo(comment="公共资料介绍",type="longtext")
		private String ziliaoContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer ziliaoDelete;



	public ZiliaoLiuyanView() {

	}

	public ZiliaoLiuyanView(ZiliaoLiuyanEntity ziliaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, ziliaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 用户

		/**
		* 获取： 用户名称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户名称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}
	//级联表的get和set 公共资料

		/**
		* 获取： 公共资料编号
		*/
		public String getZiliaoUuidNumber() {
			return ziliaoUuidNumber;
		}
		/**
		* 设置： 公共资料编号
		*/
		public void setZiliaoUuidNumber(String ziliaoUuidNumber) {
			this.ziliaoUuidNumber = ziliaoUuidNumber;
		}

		/**
		* 获取： 公共资料名称
		*/
		public String getZiliaoName() {
			return ziliaoName;
		}
		/**
		* 设置： 公共资料名称
		*/
		public void setZiliaoName(String ziliaoName) {
			this.ziliaoName = ziliaoName;
		}

		/**
		* 获取： 公共资料照片
		*/
		public String getZiliaoPhoto() {
			return ziliaoPhoto;
		}
		/**
		* 设置： 公共资料照片
		*/
		public void setZiliaoPhoto(String ziliaoPhoto) {
			this.ziliaoPhoto = ziliaoPhoto;
		}

		/**
		* 获取： 资料文件
		*/
		public String getZiliaoFile() {
			return ziliaoFile;
		}
		/**
		* 设置： 资料文件
		*/
		public void setZiliaoFile(String ziliaoFile) {
			this.ziliaoFile = ziliaoFile;
		}

		/**
		* 获取： 资料视频
		*/
		public String getZiliaoVideo() {
			return ziliaoVideo;
		}
		/**
		* 设置： 资料视频
		*/
		public void setZiliaoVideo(String ziliaoVideo) {
			this.ziliaoVideo = ziliaoVideo;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 公共资料类型
		*/
		public Integer getZiliaoTypes() {
			return ziliaoTypes;
		}
		/**
		* 设置： 公共资料类型
		*/
		public void setZiliaoTypes(Integer ziliaoTypes) {
			this.ziliaoTypes = ziliaoTypes;
		}


			/**
			* 获取： 公共资料类型的值
			*/
			public String getZiliaoValue() {
				return ziliaoValue;
			}
			/**
			* 设置： 公共资料类型的值
			*/
			public void setZiliaoValue(String ziliaoValue) {
				this.ziliaoValue = ziliaoValue;
			}

		/**
		* 获取： 公共资料热度
		*/
		public Integer getZiliaoClicknum() {
			return ziliaoClicknum;
		}
		/**
		* 设置： 公共资料热度
		*/
		public void setZiliaoClicknum(Integer ziliaoClicknum) {
			this.ziliaoClicknum = ziliaoClicknum;
		}

		/**
		* 获取： 公共资料介绍
		*/
		public String getZiliaoContent() {
			return ziliaoContent;
		}
		/**
		* 设置： 公共资料介绍
		*/
		public void setZiliaoContent(String ziliaoContent) {
			this.ziliaoContent = ziliaoContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getZiliaoDelete() {
			return ziliaoDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setZiliaoDelete(Integer ziliaoDelete) {
			this.ziliaoDelete = ziliaoDelete;
		}


	@Override
	public String toString() {
		return "ZiliaoLiuyanView{" +
			", ziliaoUuidNumber=" + ziliaoUuidNumber +
			", ziliaoName=" + ziliaoName +
			", ziliaoPhoto=" + ziliaoPhoto +
			", ziliaoFile=" + ziliaoFile +
			", ziliaoVideo=" + ziliaoVideo +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", ziliaoClicknum=" + ziliaoClicknum +
			", ziliaoContent=" + ziliaoContent +
			", ziliaoDelete=" + ziliaoDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
