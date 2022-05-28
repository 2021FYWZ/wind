<template>
	<view class="help-all">
		<view class="help-one" @tap="help1()">
			<view class="help-p">如何发布？</view>
			<image class="help-img" style="width: 35rpx;height: 35rpx;" src="../../static/箭头.png"></image>
		</view>
		<view class="help-one" @tap="help2()">
			<view class="help-p">如何接单？</view>
			<image class="help-img" style="width: 35rpx;height: 35rpx;" src="../../static/箭头.png"></image>
		</view>
		<view class="help-one" @tap="help3()">
			<view class="help-p">如何取消？</view>
			<image class="help-img" style="width: 35rpx;height: 35rpx;" src="../../static/箭头.png"></image>
		</view>
		<view class="help-one" @tap="help4()">
			<view class="help-p">忘了密码怎么办？</view>
			<image class="help-img" style="width: 35rpx;height: 35rpx;" src="../../static/箭头.png"></image>
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
			help1(){
				uni.navigateTo({
					url:"help1/help1"
				})
			},
			help2(){
				uni.navigateTo({
					url:"help2/help2"
				})
			},
			help3(){
				uni.navigateTo({
					url:"help3/help3"
				})
			},
			help4(){
				uni.navigateTo({
					url:"help4/help4"
				})
			}
		}
	}
</script>

<style lang="scss" scoped>
	page {
		height: 100%;
	}

	.help-all {
		font-size: 40rpx;
		margin-top: 45rpx;
	}
	.help-one{
		display: flex;
	}
	.help-p{
		margin: 20rpx;
	}
	.help-img{
		float: right;
		margin-top: 25rpx;
	}
</style>
