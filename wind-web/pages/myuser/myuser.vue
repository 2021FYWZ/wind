<template>
	<view class="all">
		<view class="my-from" v-if="true">
			<!-- 绿色部分 -->
			<view class="green">
				<view class="green-1">
					<image style="width: 80rpx;height: 66rpx;" src="../../static/右上角设置.jpg" @tap="set()" ></image>
				</view>
				<view class="green-2">个人中心</view>
				<view @tap="login()">
					<view class="green-3">
						<image style="width: 200rpx;height: 200rpx;" src="../../static/头像.png"></image>
					</view>
					<view class="green-4">昵称</view>
				</view>
				
			</view>
			<!-- 白色部分 -->
			<view class="withall">
				<view>
					<view class="with">
						<image style="width: 122rpx;height: 115rpx;" src="../../static/我的订单logo.jpg" class="pagel"></image>
						<text class="texts">我的订单</text>
						<image style="width: 60rpx;height: 55rpx;" src="../../static/箭头.png" class="page2"></image>
					</view>
					<view class="with">
						<image style="width: 122rpx;height: 115rpx;" src="../../static/推送通知logo.jpg"class="pagel"></image>
						<text class="texts">推送通知</text>
						<image v-show="showImag" style="width: 70rpx;height: 55rpx;" src="../../static/推送通知右侧按钮（关）.jpg" class="page2" @click="changeImage()"></image>
						<image v-show="!showImag" style="width: 70rpx;height: 55rpx;" src="../../static/推送通知右侧按钮（开）.jpg" class="page2" @click="changeImage()"></image>
					</view>
					<view class="with" @tap="feed()">
						<image style="width: 122rpx;height: 115rpx;" src="../../static/反馈logo.jpg" class="pagel"></image>
						<text class="texts-1">反馈</text>
						<image style="width: 60rpx;height: 55rpx;" src="../../static/箭头.png" class="page2"></image>
					</view>
					<view class="with" @tap="help()">
						<image style="width: 122rpx;height: 115rpx;" src="../../static/帮助logo.jpg" class="pagel"></image>
						<text class="texts-1">帮助</text>
						<image style="width: 60rpx;height: 55rpx;" src="../../static/箭头.png" class="page2"></image>
					</view>
					<view class="outlogin" @tap="login()">退出登录</view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				showImag:true
			}
		},
		methods: {
			changeImage(){
				this.showImag=!this.showImag
			},
			feed(){
				uni.navigateTo({
					url:"../feedback/feedback"
				})
			},
			login(){
				uni.navigateTo({
					url:"../login/login"
				})
			},
			help(){
				uni.navigateTo({
					url:"../help/help"
				})
			},
			set(){
				uni.navigateTo({
					url:"../set/set"
				})
			}
		}
	}
</script>

<style lang="scss" scoped>
	page {
		height: 100%;
	}

	.all {
		background-color: #F7F7F7;
		height: 100%;
		display: flex;
		padding: 0;
		box-sizing: border-box;

		// .my-from view:nth-child(2) {
		// 	margin-top: 148rpx;
		// }

		// .my-from view:nth-child(3) {
		// 	margin-top: 42rpx;
		// }

		.my-from {
			width: 758rpx;
			height: 100%;
			.withall{
				padding-top:70%;
				position: relative;
				
				.with{
					font-size: 40rpx;
					display:flex;
					width: 95%;
					height:150rpx;
					border: 8rpx solid #D4D4D4;
					border-radius:45rpx ;
					background-color: #FFFFFF;
					margin-left: 2%;
					margin-top: 50rpx;
					//padding-bottom: 70rpx;
					  .pagel{
						  margin-right: 90rpx;
						  margin-left: 90rpx;
						  margin-top:23rpx ;
					  }
					  .texts{
						  padding-top: 50rpx;
						  height: 50rpx;
						  padding-bottom: 330rpx;
						  letter-spacing:5rpx;
					  }
					  .texts-1{
						  padding-top: 50rpx;
						  margin-left: 10rpx;
						  margin-right: 70rpx;
						  
					  }
					  .page2{
						  margin-top: 50rpx;
						  margin-left: 100rpx;
						  margin-bottom: 25rpx;
					  }
				}
			}
			.green {
				z-index: 999;
				position: fixed;
				height: 33%;
				width: 100%;
				background-color: #09D0B2;
				border-bottom-left-radius: 30%;
				border-bottom-right-radius: 30%;
				.green-1{
					margin-left: 85%;
					margin-top: 40rpx;
				}
				.green-2{
					text-align: center;
					font-size: 45rpx;
				}
				.green-3{
					text-align: center;
					margin-top: 80rpx;
				}
				.green-4{
					text-align: center;
				}
			}
			.outlogin{
				margin-top: 40rpx;
				margin-left: 10%;
				background: #FFFFFF;
				padding-top: 13rpx;
				padding-bottom: 13rpx;
				text-align: center;
				font-size: 32rpx;
				letter-spacing:4rpx;
				height: 9%;
				width: 80%;
				border-radius: 38rpx;
			}
		}
	}
</style>
