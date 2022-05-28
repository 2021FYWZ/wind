<template>
	<view class="set-all">
		<view class="set-white">
			<view class="set1">
				<image class="set-img" src="../../picture/图片/设置界面/密码.jpg" style="width: 150rpx; height: 154rpx;"></image>
				<view class="set-text">登录密码</view>
				<view class="setbut" @tap="reset()">重置</view>
			</view>
			<view class="set1">
				<image class="set-img" src="../../picture/图片/设置界面/邮箱.jpg" style="width: 150rpx; height: 154rpx;"></image>
				<view class="set-text">登录密码</view>
				<view class="setbut" @tap="bind()">绑定</view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			reset(){
				uni.navigateTo({
					url:"reset/reset"
				})
			},
			bind(){
				uni.navigateTo({
					url:"bind/bind"
				})
			}
		}
	}
</script>

<style lang="scss" scoped>
page {
		height: 100%;
		background-color: #09D0B2;
	}
	.set-all{
		height: 100%;
		background-color: #09D0B2;
		.set-white{
			font-size: 45rpx;
			height: 90%;
			width: 86%;
			margin-left:6%;
			margin-top: 60rpx;
			background-color: #FFFFFF;
			border: 15rpx solid #C0C0C0;
			border-radius: 65rpx;	
			.set1{
				color: #808080;
				display: flex;
				margin-top: 40rpx;
				.set-img{
					margin-left: 45rpx;
				}
				.set-text{
					margin-top: 50rpx;
					margin-left: 20rpx;
					margin-right:50rpx ;
					
				}
				.setbut{
					text-align: center;
					padding-left: 8rpx;
					padding-top: 5rpx;
					margin-top: 45rpx;
					width: 165rpx;
					height: 70rpx;
					background-color:#C0C0C0 ;
					border-radius: 50rpx;
				}
			}
		}
	}
</style>
