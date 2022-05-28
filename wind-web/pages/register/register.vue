<template>
	  <view class="container" >
		  <view class="login-icon" >
			  
		  </view>
		  
		  <view class="login-from" v-if="true">
			  <view class="head">
				  <text>风校园生活圈</text>
			  </view>
			  <!-- 头像 -->
			  <view class="hi-image">
			  		<image style="margin-left:30%; width: 250rpx;height: 231rpx;" src="../../static/HI.jpg"></image> 
			  </view>
			  <!--  账号 -->
			  <view class="inputView">
				  <image class="nameImage" src="../../static/用户名.jpg"></image>
				  <input class="inputText" v-model="userInfo.username" placeholder="账号"/>
			  </view>
			  <!-- 密码 -->
			  <view class="inputView">
			  	  <image class="nameImage" src="../../static/密码.jpg"></image>
			  	   <input class="inputText" v-model="userInfo.password" password="true"  placeholder="密码"/>
			  </view>
			  <!-- 确认密码 -->
			  <view class="inputView">
			  	  <image class="nameImage" src="../../static/密码.jpg"></image>
			  	   <input class="inputText" v-model="userInfo.password" password="true"  placeholder="确认密码"/>
			  </view>
			  <!--注册-->
			  <view class="registerview">
				  <text class="len" @tap="logins()">登录</text>
			  </view>
			  <!-- 登录按钮 -->
			  <view class="loginBtnView" @click="login()">
				  注册
			  </view>
			  <!-- 微信图标 -->
			  <view class="wei-image">
			  		<image style="margin-left:30%; width: 80rpx;height: 80rpx;" src="../../static/微信.jpg"></image> 
			  		<text class="w">微信登录</text>
			  </view>
		  </view>
		  <view>
		  		<u-toast ref="uToast" />
		  </view>
	  </view>
</template>
 
<script>
	export default {
		data(){
			return{
				userInfo:{
					username:"",
					password:""
				},	
				loginOK:0 //用户第一次登录是0，登录过后变成1，第二次以后自动登录
			}
		},
		// 自动登录的制作
		async onLoad(){
			this.userInfo.username = await uni.getStorageSync("username")
			this.userInfo.password = await uni.getStorageSync("password")
			this.loginOK = await uni.getStorageSync("loginOK")
			if(this.loginOK === 6)
			{
				this.login()
			}
		},
		methods:{
			logins(){
							uni.navigateTo({
								url:"../login/login"
							})
							},
			async login(){
				if(this.userInfo.username==='')
				{
					this.$refs.uToast.show({title: '账号不能为空'})
					return
				}
				const username = this.userInfo.username
				const password = md5Libs.md5(this.userInfo.password)
				let params = {username,password}
				await uni.setStorageSync('username', this.userInfo.username)
				await uni.setStorageSync('password', this.userInfo.password)
				const res = await this.$u.api.login(params)
				
				if(res.flag){
					console.log(JSON.stringify(res))
					await this.$store.dispatch('user/login',res) //保存token
					await uni.setStorageSync('loginOK', 1)     //设置是否自动登录
					uni.reLaunch({url:'/pages/index/index'}) //要用这个才可以
				}
				else
				{
					this.$refs.uToast.show({title: res.msg})
				}
			}
		}
	}
</script>
 
<style>
/* #ifndef H5 */
page {
	height: 100%;
	background-color: #eeeeee;
}
/* #endif */
</style>
 
<style lang="scss" scoped>
	page{ 
	 height: 100%; 
	} 
	.container { 
	background-color: #F5C92C;
	 height: 100%; 
	 display: flex; 
	 // flex-direction: column;
	 padding: 0; 
	 box-sizing: border-box; 
	 // background-color: #FFFFFF;
	 .head{
	 	font-size:47rpx ;
	 	margin-left: 27%;
	 }
	   /*登录图片*/
	   .login-icon{ 
		 height: 100%;
		 .login-img{
		  width: 100%;
		 		position: fixed;
				width: 100%;
				height: 100%;
				top: 0;
				left: 0;
				z-index: -1;
		 } 
	   } 
	   
	   /*表单内容*/
	   .login-from view:nth-child(2){
	   			  margin-top: 148rpx;
	   }
	   .login-from view:nth-child(3){
	   			  margin-top: 42rpx;
	   }
	   .login-from { 
	    margin-top: 168rpx; 
	   	margin-left: 10%;
	    position: relative;
	    height:748rpx;
	   	width: 656rpx;
			  hi-image{
				 display: flex;
				 flex-direction: column;
				 height:200rpx;
			  }
	   		  .inputView {
	   		   background-color: #FFFFFF; 
	   		   display: flex;
	   		   height: 13%;
	   		   border-radius: 38rpx;
			   margin-top: 37rpx;
	   		   width: 90%;
	   		        /*输入框*/
	   			   .nameImage{ 
	   				margin-left: 22rpx; 
	   				margin-top: 40rpx;
	   				width: 24rpx; 
	   				height: 24rpx
	   			   }  
	   			   .inputText {
	   				margin-left: 25rpx; 
	   				margin-top: 32rpx;
	   				color: #727272; 
	   				font-size: 30rpx;
	   			   }  
	   		  } 
			  .registerview{
				  .len{
					  float: left;
					  margin-top: 45rpx;
					  margin-bottom: 45rpx;
				  }
			  }
	   		  .loginBtnView{
	   			  margin-top: 145rpx;
	   			  background: #FF006E;
	   			  padding-top: 33rpx;
	   			  text-align: center;
	   			  font-size: 32rpx;
	   			  letter-spacing:4rpx;
	   			  color: #f5ffed;
	   			  height: 9%;
	   			  width: 90%;
	   			  border-radius: 38rpx;
	   		  }
			  .wei-image{
			  				  display: flex;
			  				  flex-direction: column;
			  				  height:200rpx;
			  				  margin-top: 50rpx;
			  				  margin-left: 13%;
			  				  .w{
			  					 margin-left: 27%; 
			  				  }
			  }
	   		  
	   		     
	   } 
	} 
</style>

