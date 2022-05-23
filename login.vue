<template>
	<view>
		<image class="t" src="../../static/HI.jpg" ></image>
		<view class="zh">
			<text>账号：</text>
			<input type="text" value="" v-model="user_name"/>
		</view>
		<view class="mm">
			<text>密码：</text>
			<input type="text" value="" v-model="password"/>
		</view>
		<view class="zw">
			<button type="default" @tap="register()">注册</button>
			<button type="default">忘记密码</button>
		</view>
		<view class="dl">
			<button type="default">登录</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				user_name:"",
				password:""
			}
		},
		methods: {
			register(){
				uni.navigateTo({
					url:"../register/register"
				})
			}
		}
	}
</script>

<style>
.zh,.mm{display: flex;}
.zh input,.mm input{
	background: #007AFF;
}
</style>
