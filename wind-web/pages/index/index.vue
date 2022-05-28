<template>
	<view>
		<!-- 搜索框 -->
		<view>
			<sui-search placeholder="风" @blur="blur" class="search"></sui-search>
		</view>
		<!-- 顶部按钮 -->
		<view class="top-button">
			<view class="typeface1">代拿快递</view>
			<view class="typeface2">点击发布，风雨无阻！</view>
			<view>
				<image src="../../picture/图片/主页/底色空白恐龙蛋.jpg" class="button_pic1"></image>
			</view>
			<view>
				<image src="../../picture/图片/主页/透明手图片.png" class="button_pic2"></image>
			</view>
		</view>
		<!-- 中心分割线 -->
		<view class="center">
			<view class="line1">
				<view style="display: flex;margin-top:20rpx ;">
					<view style="background-color:#999999; width: 100%; height: 1rpx;"></view>
				</view>
			</view>
			<view class="typeface3">
				推荐
			</view>
			<view class="line2">
				<view style="display: flex;margin-top:20rpx ;">
					<view style="background-color:#999999; width: 100%; height: 1rpx;"></view>
				</view>
			</view>
			<view>
				<image src="../../picture/图片/主页/推荐logo.jpg" class="center_pic"></image>
			</view>
		</view>
		<!-- 主体部分 -->
		<view class="subject">
			<view class="goods1">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">小包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/包裹1.jpeg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥4
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button">
					<view class="letter1">接单</view>
				</button>
			</view>

			<view class="goods2">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">中包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/中包裹.jpg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥6
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button">
					<view class="letter1">接单</view>
				</button>
			</view>

			<view class="goods3">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">小包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/包裹1.jpeg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥4
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button">
					<view class="letter1">接单</view>
				</button>
			</view>

			<view class="goods4">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">中包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/中包裹.jpg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥6
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button">
					<view class="letter1">接单</view>
				</button>
			</view>

			<view class="goods5">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">小包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/包裹1.jpeg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥4
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button">
					<view class="letter1">接单</view>
				</button>
			</view>

			<view class="goods6">
				<view>
					<image src="../../picture/图片/主页/包裹小标签.png" class="goods_pic1">
						<view class="letter2">小包</view>
					</image>
				</view>
				<view>
					<image src="../../picture/图片/主页/中包裹.jpg" class="goods_pic2"></image>
				</view>
				<view class=" figure1">
					￥6
				</view>
				<view class=" figure2">
					2022-4-5 21:00
				</view>
				<button class="button"> 
					<view class="letter1">接单</view>
				</button>
			</view>
		</view>
	</view>
</template>

<script>
</script>

<style lang="scss" scoped>
	/* 搜索框 */
	.search {
		margin: 20rpx 20rpx 0rpx 20rpx;
	}

	/* 顶部按钮 */
	.top-button {
		height: 150px;
		width: 95%;
		background-color: rgb(0, 230, 195);
		border-radius: 10px;
		margin: 10px;
		position: relative;
	}

	.typeface1 {
		height: 75px;
		width: 120px;
		margin-top: 40px;
		margin-left: 50px;
		position: absolute;
		font-size: 28px;
	}

	.typeface2 {
		height: 75px;
		width: 120px;
		margin-top: 80px;
		margin-left: 50px;
		position: absolute;
		font-size: 1px;
		color: #FFFFFF;
	}

	.button_pic1 {
		height: 250rpx;
		width: 200rpx;
		float: right;
		margin-right: 80rpx;
		margin-top: 20rpx;
	}

	.button_pic2 {
		height: 90rpx;
		width: 90rpx;
		margin-left: 570rpx;
		margin-top: 190rpx;
		position: absolute;
	}

	/* 中心分割线 */
	.center {
		height: 80rpx;
		width: 100%;
		position: relative;
	}

	.line1 {
		height: 20rpx;
		width: 320rpx;
		float: left;

	}

	.typeface3 {
		height: 40rpx;
		width: 70rpx;
		font-weight: 700;
		float: right;
		margin-right: 340rpx;
	}

	.line2 {
		height: 20rpx;
		width: 300rpx;
		float: right;
		position: absolute;
		margin-left: 430rpx;
	}

	.center_pic {
		height: 25rpx;
		width: 30rpx;
		margin-left: 360rpx;
	}

	/* 主体模块 */
	.subject {
		height: 1500rpx;
		width: 100%;
		position: relative;
	}

	.goods1 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-top: 60rpx;
		margin-left: 55rpx;
	}

	.goods2 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-left: 400rpx;
		margin-top: 60rpx;
	}

	.goods3 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-top: 520rpx;
		margin-left: 55rpx;
	}

	.goods4 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-left: 400rpx;
		margin-top: 520rpx;
	}

	.goods5 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-left: 55rpx;
		margin-top: 980rpx;
	}

	.goods6 {
		height: 400rpx;
		width: 300rpx;
		position: absolute;
		margin-left: 400rpx;
		margin-top: 980rpx;
	}
	.goods_pic1{
		height: 50rpx;
		width: 130rpx;
		position: absolute;
		
	}
	.goods_pic2{
		height: 210rpx;
		width: 230rpx;
		position: absolute;
		margin-top: 40rpx;
		margin-left: 40rpx;
	}
	.figure1{
		height: 20rpx;
		width: 300rpx;
		margin-top: 260rpx;
		position: absolute;
		text-align: right;
	}
	.figure2{
		height: 20rpx;
		width: 300rpx;
		margin-top: 290rpx;
		position: absolute;
		text-align: right;
	}
	.button {
		height: 50rpx;
		width: 100rpx;
		background-color: rgb(255, 0, 110);
		border-radius: 50rpx;
		float: right;
		margin-top: 350rpx;
	}
	.letter1 {
		color: #FFFFFF;
		font-size: xx-small;
	}
	.letter2{
		color: #FFFFFF;
		position: absolute;
		font-size: x-small;
		margin-left:40rpx ;
		margin-top: 5rpx;
		
	}
</style>
