<template>
	<view class="container">
		<view class="login-from" v-if="true">
			<!--  标题 -->
			<view class="submitView">
				<input class="submitText" v-model="feedbacktest" placeholder="输入标题" />
			</view>
			<!--  正文 -->
			<view class="problemView">
				<textarea v-model="problemtest" placeholder="请输入内容" maxlength="200" @input="descInput"></textarea>
				<view class="num">{{remnant}}/200</view>
			</view>
			<!-- 提交按钮 -->
			<view class="submitbtView" @tap="feedbackgo()">
				<text>提交</text>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				remnant:0,
				feedbacktest: "",
				problemtest:""
			}
		},
		methods: {
			feedbackgo() {
				uni.navigateTo({
					url:"./minfeedback/minfeedback"
				})
			},
			//字数
			// descInput(){
			// 	this.remnant=this.
			// }
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
	page {
		height: 100%;
	}

	.container {
		background-color: #F7F7F7;
		height: 100%;
		display: flex;
		// flex-direction: column;
		padding: 0;
		box-sizing: border-box;
		// background-color: #FFFFFF;

		/*表单内容*/
		.login-from view:nth-child(2) {
			margin-top: 48rpx;
		}

		.login-from view:nth-child(3) {
			margin-top: 100rpx;
		}

		.login-from {
			margin-top: 100rpx;
			margin-left: 10%;
			position: relative;
			height: 748rpx;
			width: 656rpx;

			.submitView {
				background-color: #FFFFFF;
				display: flex;
				height: 13%;
				border-radius: 20rpx;
				margin-top: 37rpx;
				width: 90%;

				.submitText {
					margin-left: 25rpx;
					margin-top: 32rpx;
					color: #727272;
					font-size: 30rpx;
				}
			}
			.problemView{
				height: 50%;
				width: 800rpx;
				margin-left: 15rpx;
				display: flex;
				.num{
					float: right;
					color: #999999;
					margin-top: 360rpx;
					margin-right: 195rpx;
				}
			}

			.submitbtView {
				margin-top: 140rpx;
				background: #999999;
				padding-top: 25rpx;
				text-align: center;
				font-size: 32rpx;
				letter-spacing: 4rpx;
				color: #f5ffed;
				height: 8%;
				width: 90%;
				border-radius: 38rpx;
			}
		}
	}
</style>
