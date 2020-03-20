
/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.zhongshi.redis.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhongshi.factory.result.AbstractBaseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * 	功能说明：Redis Rest接口
 * 
 *	功能作者：彭晋龙 ( 联系方式QQ/微信：1095071913 )
 *
 *	创建日期：2019-10-31 ：20:16:00
 *
 *	版权归属：蓝河团队
 *
 *	协议说明：Apache2.0（ 文件顶端 ）
 *
 */

//@FeignClient(value = "mountain-shop-redis", fallback = RedisServiceFallback.class)
@Api("Redis接口")
@RestController
@RequestMapping("/redis")
public interface RedisServiceRest {

	@PostMapping("/getString")
	@ApiOperation(value = "Redis中获取")
	AbstractBaseResult getString(@RequestParam("key") String key);

	@PostMapping("/delKey")
	@ApiOperation(value = "Redis中删除")
	AbstractBaseResult delKey(@RequestParam("key") String key);

	@PostMapping("/setString")
	@ApiOperation(value = "Redis中设值")
	AbstractBaseResult setString(@RequestParam("key") String key, @RequestParam("data") @RequestBody Object data,
			@RequestParam(value = "timeout", required = false) Long timeout);

}