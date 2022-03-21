
<a name="paths"></a>
## 资源

<a name="525e261ff8864b8642d77467febd78dd"></a>
### Auth管理
Auth Controller


<a name="refreshtokenusingpost"></a>
#### 刷新token
```
POST /auth/refreshToken
```


##### 说明
刷新token<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.auth.AuthController.refreshToken()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/auth/refreshToken
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="testusingget"></a>
#### test
```
GET /auth/test
```


##### 说明
test<br/>public void com.youxiake.yxkapp.controller.auth.AuthController.test()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/auth/test
```


###### 请求 header
```
json :
"string"
```


<a name="tokenusingget"></a>
#### 生成token
```
GET /auth/token
```


##### 说明
生成token<br/>public java.lang.Object com.youxiake.yxkapp.controller.auth.AuthController.token(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*可选*|uid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|object|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/auth/token
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="web_resource"></a>
### Web
Web Controller


<a name="couponhelpusingget"></a>
#### 代金券帮助
```
GET /app/coupon/help
```


##### 说明
代金券帮助<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.couponHelp()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/help
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="h5newsdetailusingget"></a>
#### h5游侠攻略详情
```
GET /app/h5/newsdetail
```


##### 说明
h5游侠攻略详情<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.h5NewsDetail(java.lang.Integer,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Query**|**id**  <br>*可选*|攻略id|integer (int32)|`0`|
|**Query**|**uid**  <br>*可选*|用户id|integer (int32)|`0`|
|**Query**|**version**  <br>*可选*|version|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/h5/newsdetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0,
  "uid" : 0,
  "version" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="htmltipsusingget"></a>
#### 扫码帮助
```
GET /app/help/html/tips
```


##### 说明
扫码帮助<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.htmlTips()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/help/html/tips
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="htmlaboutususingget"></a>
#### 关于我们
```
GET /app/html/aboutus
```


##### 说明
关于我们<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.htmlAboutus()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/html/aboutus
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="htmllicenceusingget"></a>
#### 软件协议
```
GET /app/html/licence
```


##### 说明
软件协议<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.htmlLicence()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/html/licence
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="batchordersusingget"></a>
#### 获取产品批次报名单-废弃
```
GET /app/n/product/batchorders
```


##### 说明
获取产品批次报名单-废弃<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.batchorders(javax.servlet.http.HttpServletRequest,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|批次id|string|
|**Query**|**pid**  <br>*必填*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/batchorders
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : "string",
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="dailypkgusingget"></a>
#### 获取产品行程-废弃
```
GET /app/n/product/dailypkg
```


##### 说明
获取产品行程-废弃<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.dailypkg(javax.servlet.http.HttpServletRequest,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*必填*|产品id|string|
|**Query**|**pkgid**  <br>*可选*|pkgid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/dailypkg
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string",
  "pkgid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="ordersrefundusingget"></a>
#### 退款说明
```
GET /app/orders/refund/tips
```


##### 说明
退款说明<br/>public org.springframework.web.servlet.ModelAndView com.youxiake.yxkapp.controller.web.WebController.ordersRefund()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/refund/tips
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="6bc058ce0b8ce0dc8219a540f9201f70"></a>
### 产品
Product No Auth Controller


<a name="channelusingget"></a>
#### 获取频道筛选
```
GET /app/n/product/channel
```


##### 说明
获取频道筛选<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.channel(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pager**  <br>*必填*|频道类型|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ChannelVo»](#a07c4cbd17284c37acf8618c93bef124)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/channel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pager" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "ads" : {
      "items" : [ {
        "handler" : "string",
        "thumb" : "string",
        "title" : "string",
        "url" : "string"
      } ],
      "title" : "string"
    },
    "channel_tag" : [ {
      "img_url" : "string",
      "tag_id" : 0,
      "tag_name" : "string"
    } ],
    "filters" : {
      "string" : "[channelfilterdetailvo](#channelfilterdetailvo)"
    },
    "flashes" : [ {
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "tags" : [ {
      "img_url" : "string",
      "tag_id" : 0,
      "tag_name" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="channellinesusingget"></a>
#### 获取频道线路
```
GET /app/n/product/channel/lines
```


##### 说明
获取频道线路<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.channelLines(java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**filters**  <br>*可选*|筛选条件json|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**pager**  <br>*必填*|频道类型|string||
|**Query**|**type**  <br>*可选*|类型|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ProductJihediDataVo»»»](#e8ea83804a7d1a373c6b6f58d54683cf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/channel/lines
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "filters" : "string",
  "page" : "string",
  "pager" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="channelhwlinesusingget"></a>
#### 获取户外游频道线路
```
GET /app/n/product/channel/lines/huwai
```


##### 说明
获取户外游频道线路<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.channelHWLines(java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**filters**  <br>*可选*|筛选条件json|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**pager**  <br>*必填*|频道类型|string||
|**Query**|**tag_id**  <br>*可选*|标签id|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HWProductsVo»](#f89ff859e6fd8474902daa45bc7afe4e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/channel/lines/huwai
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "filters" : "string",
  "page" : "string",
  "pager" : "string",
  "tag_id" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "filters" : {
      "string" : "[channelfilterdetailvo](#channelfilterdetailvo)"
    },
    "products" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="channelrecommendusingget"></a>
#### 频道页产品推荐
```
GET /app/n/product/channel/recommend
```


##### 说明
频道页产品推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.channelRecommend(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pager**  <br>*必填*|频道类型|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ChannelRecommendListVo»](#1385a4373356650c281ca5f342bfb701)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/channel/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pager" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "content" : [ {
      "product" : [ {
        "ageLabel" : "string",
        "brandTag" : [ "string" ],
        "checking" : 0,
        "class_theme_id" : 0,
        "days" : "string",
        "firstBatchStatus" : "string",
        "free" : 0,
        "handler" : "string",
        "isFree" : 0,
        "liangdian" : [ "string" ],
        "liangdianLabel" : "string",
        "linquan" : "string",
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "marketingTagName" : "string",
        "maxPrice" : "string",
        "outDoorLabel" : "string",
        "peopleCount" : 0,
        "peopleCountLabel" : "string",
        "peopleCountLabelFull" : "string",
        "pid" : 0,
        "place_label" : "string",
        "price" : 0.0,
        "price_label" : "string",
        "pro_pic" : "string",
        "productPreferentialList" : [ {
          "couponAmount" : 0.0,
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "product_type2" : "string",
        "psid" : 0,
        "salePriceLabel" : "string",
        "showStatus" : 0,
        "simpleName" : "string",
        "starttime" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "thumbList" : [ "string" ],
        "type" : 0,
        "type_or_cat" : "string",
        "typetwoOrCat" : "string",
        "url" : "string",
        "weight" : 0.0
      } ],
      "title" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="detailusingget_5"></a>
#### 获取产品详情
```
GET /app/n/product/detail
```


##### 说明
获取产品详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.detail(java.lang.Integer,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**defaultDetail**  <br>*可选*|默认选中数据json|string|
|**Query**|**oid**  <br>*可选*|oid|integer (int32)|
|**Query**|**pid**  <br>*必填*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductDetailVo»](#4efa0b0cc1071f9b9eb2a91510d27d6d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "defaultDetail" : "string",
  "oid" : 0,
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adultNum" : 0,
    "applyInfoList" : [ {
      "avatar" : "string",
      "tip" : "string"
    } ],
    "bargainRemain" : {
      "bargainTime" : 0,
      "bargainTotal" : "string",
      "msgTitle" : "string",
      "status" : 0,
      "statusTitle" : "string"
    },
    "batches_label" : "string",
    "batches_list" : [ {
      "bid" : 0,
      "cornerTip" : "string",
      "cornerTipColour" : "string",
      "dateline" : "string",
      "diff_num" : "string",
      "pkgId" : 0,
      "pkg_name" : "string",
      "prepayTip" : "string",
      "price" : "string",
      "saleTip" : "string",
      "starttime" : 0
    } ],
    "batches_url" : "string",
    "childAgeDescribe" : "string",
    "childNum" : 0,
    "comment" : {
      "avg_score" : "string",
      "avg_score_color" : "string",
      "content" : {
        "addtime" : 0,
        "avatar" : "string",
        "comment" : "string",
        "img" : "string",
        "quality" : 0,
        "score" : "string",
        "scoreColor" : "string",
        "username" : "string"
      },
      "contentlist" : [ {
        "addtime" : 0,
        "avatar" : "string",
        "comment" : "string",
        "img" : "string",
        "quality" : 0,
        "score" : "string",
        "scoreColor" : "string",
        "username" : "string"
      } ],
      "lineContentList" : [ {
        "addtime" : 0,
        "avatar" : "string",
        "comment" : "string",
        "img" : "string",
        "quality" : 0,
        "score" : "string",
        "scoreColor" : "string",
        "username" : "string"
      } ],
      "pj_num" : 0,
      "tags" : [ {
        "num" : 0,
        "tname" : "string"
      } ]
    },
    "commentListUrl" : "string",
    "coupon" : {
      "couponsInfoList" : [ "string" ],
      "maxGetAmount" : 0.0,
      "order_coupons" : {
        "data" : [ {
          "amount" : 0.0,
          "cid" : 0,
          "exp" : "string",
          "label" : "string",
          "name" : "string",
          "status" : 0,
          "use_condition" : "string"
        } ],
        "title" : "string"
      },
      "product_coupons" : {
        "data" : [ {
          "amount" : 0.0,
          "cid" : 0,
          "exp" : "string",
          "label" : "string",
          "name" : "string",
          "status" : 0,
          "use_condition" : "string"
        } ],
        "title" : "string"
      },
      "tip" : "string"
    },
    "dailyPkgList" : [ {
      "basicRefundId" : 0,
      "dailyPkgId" : 0,
      "fullRefundId" : 0
    } ],
    "dailypkgUrl" : "string",
    "dateList" : [ {
      "avatarList" : [ "string" ],
      "bid" : 0,
      "cornerTip" : "string",
      "cornerTipColor" : "string",
      "day" : "string",
      "festival" : "string",
      "fontColor" : "string",
      "memberCount" : 0,
      "memberUrl" : "string",
      "month" : "string",
      "price" : "string",
      "rest" : 0,
      "starttime" : 0,
      "week" : "string",
      "year" : "string"
    } ],
    "destAddress" : {
      "bdDestLatitude" : 0.0,
      "bdDestLongitude" : 0.0,
      "destAddress" : "string",
      "destLatitude" : 0.0,
      "destLongitude" : 0.0,
      "distance" : "string",
      "rightBtnName" : "string"
    },
    "discount" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "discountList" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "discuss" : {
      "answerNum" : 0,
      "comment" : {
        "addtime" : 0,
        "auditStatus" : 0,
        "avatar" : "string",
        "content" : "string",
        "dis_id" : 0,
        "sub" : [ {
          "addtime" : 0,
          "content" : "string",
          "dis_id" : 0,
          "reid" : 0,
          "reuid" : 0,
          "reuname" : "string",
          "uid" : 0,
          "uname" : "string"
        } ],
        "uid" : 0,
        "username" : "string"
      },
      "commentList" : [ {
        "addtime" : 0,
        "auditStatus" : 0,
        "avatar" : "string",
        "content" : "string",
        "dis_id" : 0,
        "sub" : [ {
          "addtime" : 0,
          "content" : "string",
          "dis_id" : 0,
          "reid" : 0,
          "reuid" : 0,
          "reuname" : "string",
          "uid" : 0,
          "uname" : "string"
        } ],
        "uid" : 0,
        "username" : "string"
      } ],
      "num" : 0,
      "sub" : {
        "addtime" : 0,
        "content" : "string",
        "dis_id" : 0,
        "reid" : 0,
        "reuid" : 0,
        "reuname" : "string",
        "uid" : 0,
        "uname" : "string"
      }
    },
    "earlybird" : {
      "list" : [ "string" ],
      "maxAmountLabel" : "string",
      "timeLimitStr" : "string",
      "tip" : "string"
    },
    "fissionBottom" : "string",
    "fissionList" : [ {
      "amount" : 0.0,
      "endTime" : "string",
      "fissionStatus" : 0,
      "helpCount" : 0,
      "id" : 0,
      "minAmount" : 0.0,
      "newRegister" : 0,
      "title" : "string",
      "userNumber" : 0
    } ],
    "fissionRule" : "string",
    "fissionRuleTitle" : "string",
    "hotel" : {
      "address" : "string",
      "hid" : 0,
      "hotelImages" : [ "string" ],
      "hotelLevelLabel" : "string",
      "hotelName" : "string",
      "hotelTags" : [ "string" ],
      "hotelTitle" : "string",
      "lat" : "string",
      "lng" : "string",
      "placeType" : 0,
      "room" : {
        "roomDes" : [ "string" ],
        "roomId" : 0,
        "roomImages" : [ "string" ],
        "roomName" : "string",
        "roomPkgList" : [ {
          "difPrice" : "string",
          "isAvailable" : 0,
          "maxPersonNum" : 0,
          "pkgRemark" : "string",
          "price" : 0.0,
          "roomPkgDes" : [ "string" ],
          "roomPkgId" : 0,
          "roomPkgName" : "string",
          "roomTagDownList" : [ {
            "describeList" : [ "string" ],
            "title" : "string"
          } ],
          "roomTagUpList" : [ {
            "describeList" : [ "string" ],
            "title" : "string"
          } ],
          "selected" : 0,
          "selectedNum" : 0,
          "unitName" : "string"
        } ]
      },
      "topTitle" : "string"
    },
    "is_over" : 0,
    "is_sale" : {
      "adultAmount" : 0.0,
      "adult_num" : 0,
      "canApply" : 0,
      "childAmount" : 0.0,
      "child_num" : 0,
      "foreshow" : 0,
      "joinType" : 0,
      "overtime" : 0,
      "price" : "string",
      "price_child" : "string",
      "saleInfo" : "string",
      "saleOvertime" : 0,
      "saleStarttime" : 0,
      "starttime" : 0,
      "status" : 0,
      "tip" : "string",
      "userTip" : "string",
      "userType" : 0
    },
    "jihedi_lines" : {
      "data" : [ {
        "ageLabel" : "string",
        "brandTag" : [ "string" ],
        "checking" : 0,
        "class_theme_id" : 0,
        "days" : "string",
        "firstBatchStatus" : "string",
        "free" : 0,
        "handler" : "string",
        "isFree" : 0,
        "liangdian" : [ "string" ],
        "liangdianLabel" : "string",
        "linquan" : "string",
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "marketingTagName" : "string",
        "maxPrice" : "string",
        "outDoorLabel" : "string",
        "peopleCount" : 0,
        "peopleCountLabel" : "string",
        "peopleCountLabelFull" : "string",
        "pid" : 0,
        "place_label" : "string",
        "price" : 0.0,
        "price_label" : "string",
        "pro_pic" : "string",
        "productPreferentialList" : [ {
          "couponAmount" : 0.0,
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "product_type2" : "string",
        "psid" : 0,
        "salePriceLabel" : "string",
        "showStatus" : 0,
        "simpleName" : "string",
        "starttime" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "thumbList" : [ "string" ],
        "type" : 0,
        "type_or_cat" : "string",
        "typetwoOrCat" : "string",
        "url" : "string",
        "weight" : 0.0
      } ],
      "title" : "string"
    },
    "latest_orders" : {
      "psid_cnt" : "string",
      "url" : "string",
      "users" : [ "string" ]
    },
    "loadTime" : "string",
    "nonEarlybirdList" : [ {
      "overtime" : "string",
      "pkgname" : "string",
      "starttime" : "string"
    } ],
    "non_earlybird" : "string",
    "perfectDiscount" : {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    },
    "pkgList" : [ {
      "batchList" : [ {
        "bid" : 0,
        "dateLabel" : "string",
        "dateNightLabel" : "string",
        "endDate" : "string",
        "pkgid" : 0,
        "price" : 0.0,
        "priceLabel" : "string",
        "selected" : 0,
        "startDate" : "string"
      } ],
      "name" : "string",
      "pkgId" : 0,
      "selected" : 0
    } ],
    "product" : {
      "aboard_point" : "string",
      "adultprice" : "string",
      "brandTag" : "string",
      "childprice" : "string",
      "city" : "string",
      "closeShare" : 0,
      "companyName" : "string",
      "companyUrl" : "string",
      "dailyAdultPrice" : "string",
      "dailyChildPrice" : "string",
      "days" : 0,
      "daysLabel" : "string",
      "detailColor" : "string",
      "detailImgUrl" : "string",
      "favorite" : "string",
      "flash_pic" : [ "string" ],
      "html_details" : "string",
      "imagesDetail" : [ {
        "img_description" : "string",
        "img_url" : "string"
      } ],
      "liangdian" : [ "string" ],
      "lineQrcodeUrl" : "string",
      "lowPriceTip" : "string",
      "marketingTag" : "string",
      "minPrice" : 0.0,
      "minPriceLabel" : "string",
      "minPriceTip" : [ "string" ],
      "minPriceTitle" : "string",
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string",
      "nights" : 0,
      "online_service_id" : 0,
      "pid" : 0,
      "product_cate_type" : [ "string" ],
      "product_name" : "string",
      "province" : "string",
      "qiyu" : {
        "data" : "string",
        "groupid" : 0
      },
      "registrationPolicy" : "string",
      "sellNum" : "string",
      "serial_id" : 0,
      "shareOtherPareams" : {
        "string" : "string"
      },
      "share_cover" : "string",
      "sitecode" : 0,
      "sub_name" : "string",
      "topVideo" : "string",
      "url_string" : "string",
      "yxbTip" : "string"
    },
    "productBargainShowVo" : {
      "howBargainUrl" : "string",
      "maxBargainAmount" : "string",
      "numLabel" : "string",
      "overtime" : 0
    },
    "productBargainVo" : {
      "etime" : "string",
      "money" : "string",
      "msg" : "string",
      "now" : 0,
      "numLimit" : 0,
      "numRemain" : 0,
      "numRemainLabel" : "string",
      "status" : 0,
      "stime" : "string",
      "timeRemain" : 0
    },
    "productCache" : {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    },
    "productCard" : {
      "alreadyHave" : 0,
      "bottomBtnLabel" : "string",
      "tipLabel" : "string",
      "url" : "string"
    },
    "productDiscounts" : {
      "explain" : "string",
      "infoList" : [ "string" ],
      "maxSale" : 0.0
    },
    "productIPShow" : {
      "imgUrl" : "string",
      "url" : "string"
    },
    "productMarketing" : {
      "adultprice" : "string",
      "backgroundImage" : "string",
      "childprice" : "string",
      "explain" : "string",
      "leftTip" : "string",
      "maxReduceAmount" : "string",
      "rightTip" : "string",
      "tipUrl" : "string"
    },
    "productMarketingV2" : {
      "backgroundImage" : "string",
      "distanceOvertime" : 0,
      "distanceStarttime" : 0,
      "leftTip" : "string",
      "logoImage" : "string",
      "overtime" : 0,
      "priceStyle" : 0,
      "priceTip" : "string",
      "rightTip" : "string",
      "saleAdultAmount" : "string",
      "saleChildAmount" : "string",
      "saleInfoList" : [ {
        "amount" : "string",
        "num" : 0,
        "tip" : "string"
      } ],
      "servertime" : 0,
      "starttime" : 0,
      "styleType" : 0,
      "tipBackground" : "string",
      "tipUrl" : "string"
    },
    "productOutdoorLevel" : {
      "hollowStar" : 0,
      "leftTitle" : "string",
      "levelTip" : "string",
      "popupContent" : "string",
      "popupTitle" : "string",
      "solidStar" : 0
    },
    "productServes" : {
      "explain" : "string",
      "infoList" : [ "string" ],
      "serviceUrl" : "string"
    },
    "productVoucherVO" : {
      "bottomBtnLabel" : "string",
      "tip" : "string",
      "url" : "string"
    },
    "recommend" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "recommend_title" : "string",
    "remindMobile" : "string",
    "saleMsgTitle" : "string",
    "saleRemind" : 0,
    "saleStatusTitle" : "string",
    "serveList" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "tickets" : {
      "ticketList" : [ {
        "date" : "string",
        "dateLabel" : "string",
        "need" : 0,
        "pkgTicketId" : 0,
        "pkgTicketName" : "string",
        "price" : 0.0,
        "selectedNum" : 0
      } ],
      "ticketTitle" : "string",
      "topTitle" : "string"
    },
    "type" : 0,
    "view_id" : 0,
    "visaRecommend" : [ {
      "countLabel" : "string",
      "coverImg" : "string",
      "handler" : "string",
      "status" : 0,
      "visaId" : 0,
      "visaName" : "string",
      "visaPrice" : 0.0
    } ]
  },
  "msg" : "string"
}
```


<a name="discusslistusingget"></a>
#### 获取产品咨询列表
```
GET /app/n/product/discuss/list
```


##### 说明
获取产品咨询列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.discussList(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**dis_id**  <br>*可选*|咨询id|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**pid**  <br>*必填*|产品id|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscussListVo»](#b2a5c799854805a3091897dfb41e964b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/discuss/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "dis_id" : "string",
  "page" : "string",
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "comments" : [ {
      "addtime" : 0,
      "auditStatus" : 0,
      "avatar" : "string",
      "content" : "string",
      "dis_id" : 0,
      "sub" : [ {
        "addtime" : 0,
        "content" : "string",
        "dis_id" : 0,
        "reid" : 0,
        "reuid" : 0,
        "reuname" : "string",
        "uid" : 0,
        "uname" : "string"
      } ],
      "uid" : 0,
      "username" : "string"
    } ],
    "current_page" : 0,
    "num" : 0,
    "product_name" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="evaluationlistusingget_1"></a>
#### 获取产品评价列表
```
GET /app/n/product/evaluation/list
```


##### 说明
获取产品评价列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductNoAuthController.evaluationList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**pid**  <br>*必填*|产品id|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«EvaluationListVo»](#b293e8c139c5806f7c072a3cd3466839)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/evaluation/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "addtime" : 0,
      "avatar" : "string",
      "averageStar" : 0.0,
      "channel" : 0,
      "content" : "string",
      "imgs" : [ { } ],
      "isTalent" : true,
      "pkgname" : "string",
      "quality" : 0,
      "reply" : "string",
      "stars" : [ { } ],
      "startTime" : "string",
      "username" : "string"
    } ],
    "num" : 0,
    "pagesize" : 0,
    "product_name" : "string",
    "tags" : [ {
      "num" : 0,
      "tname" : "string"
    } ],
    "totalpage" : 0
  },
  "msg" : "string"
}
```


<a name="bargainremindusingpost"></a>
#### 砍价提醒确认
```
POST /app/product/bargain/remind
```


##### 说明
砍价提醒确认<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.bargainRemind(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|
|**Query**|**pid**  <br>*必填*|pid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MicroBargainReminVO»](#a0ea3146e5f42576c426f8b000caedaa)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/bargain/remind
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string",
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "mobile" : "string",
    "title" : "string"
  },
  "msg" : "string"
}
```


<a name="discusssaveusingpost"></a>
#### 产品咨询or回复
```
POST /app/product/discuss/save
```


##### 说明
产品咨询or回复<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.discussSave(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*必填*|内容|string|
|**Query**|**currReid**  <br>*可选*|被回复的咨询id当前点击的那条|string|
|**Query**|**pid**  <br>*必填*|pid|string|
|**Query**|**reid**  <br>*可选*|被回复的父级咨询id|string|
|**Query**|**uid**  <br>*可选*|被回复的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscussSaveVo»](#69d4bca98df10171999620a8c31eaa42)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/discuss/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string",
  "currReid" : "string",
  "pid" : "string",
  "reid" : "string",
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "addtime" : 0,
    "avatar" : "string",
    "content" : "string",
    "disId" : 0,
    "sub" : [ {
      "addtime" : 0,
      "content" : "string",
      "dis_id" : 0,
      "reid" : 0,
      "reuid" : 0,
      "reuname" : "string",
      "uid" : 0,
      "uname" : "string"
    } ],
    "uid" : 0,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="evaluationaddusingget_1"></a>
#### 订单产品评价输入页信息
```
GET /app/product/evaluation/add
```


##### 说明
订单产品评价输入页信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationAdd(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEvaluationAddVO»](#7a08ed05a7212de00b980ce9e4f801ea)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "allowDiscoverText" : "string",
    "amount_tips" : "string",
    "giveCouponAmount" : 0,
    "giveCredits" : 0,
    "html" : "string",
    "oid" : 0,
    "product" : {
      "batchesTime" : "string",
      "name" : "string",
      "pic" : "string"
    },
    "ruleUrl" : "string",
    "tags" : [ {
      "desc" : "string",
      "leader" : {
        "lid" : 0,
        "lname" : "string"
      },
      "stars" : [ {
        "star" : [ {
          "name" : "string",
          "tag_id" : 0
        } ]
      } ],
      "type" : 0
    } ],
    "thanks_tips" : "string",
    "tips1" : "string",
    "tips2" : "string",
    "wordsCredits" : 0,
    "wordsNumber" : 0
  },
  "msg" : "string"
}
```


<a name="evaluationdetailsusingget_1"></a>
#### 订单产品评价查看
```
GET /app/product/evaluation/details
```


##### 说明
订单产品评价查看<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationDetails(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductEvaluationDetailVO»](#e41293f4f8eafacd0830f79f9d5d83df)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/details
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "addtime" : 0,
    "avatar" : "string",
    "averageStar" : 0.0,
    "batchesTime" : "string",
    "content" : "string",
    "editDeadline" : "string",
    "editTip" : "string",
    "imgs" : [ {
      "height" : 0,
      "labels_info" : [ {
        "content" : "string",
        "position" : "string",
        "x" : "string",
        "y" : "string"
      } ],
      "shareUrl" : "string",
      "url" : "string",
      "url_l" : "string",
      "url_m" : "string",
      "url_xl" : "string",
      "width" : 0
    } ],
    "isTalent" : true,
    "pic" : "string",
    "pkgname" : "string",
    "product_name" : "string",
    "quality" : 0,
    "reply" : "string",
    "stars" : [ {
      "classId" : 0,
      "class_type" : "string",
      "color" : "string",
      "content" : "string",
      "star" : "string",
      "starLevel" : 0
    } ],
    "startTime" : "string",
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="evaluationeditusingget"></a>
#### 订单产品评价修改页面信息
```
GET /app/product/evaluation/edit
```


##### 说明
订单产品评价修改页面信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationEdit(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEvaluationEditVO»](#941ce74641f8fab79d499ad1c23ca8d7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/edit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "content" : "string",
    "imageList" : [ {
      "fid" : 0,
      "height" : 0,
      "url" : "string",
      "width" : 0
    } ],
    "oid" : 0,
    "product" : {
      "batchesTime" : "string",
      "name" : "string",
      "pic" : "string"
    },
    "tags" : [ {
      "canEdit" : 0,
      "desc" : "string",
      "leader" : {
        "lid" : 0,
        "lname" : "string"
      },
      "pdId" : 0,
      "selectedStar" : 0,
      "stars" : [ {
        "star" : [ {
          "name" : "string",
          "selected" : true,
          "tag_id" : 0
        } ]
      } ],
      "type" : 0
    } ],
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="evaluationmddsaveusingpost"></a>
#### 订单产品评价心愿目的地保存
```
POST /app/product/evaluation/mdd/save
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationMddSave(com.youxiake.microservice.entity.http.order.request.evaluation.OrderEvaluationMddRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mdd**  <br>*可选*|心愿目的地|string|
|**Query**|**qid**  <br>*可选*|评价ID|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/mdd/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mdd" : "string",
  "qid" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="evaluationsaveusingpost_1"></a>
#### 订单产品评价保存
```
POST /app/product/evaluation/save
```


##### 说明
订单产品评价保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationSave(com.youxiake.model.master.product.vo.EvaluationSaveVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**allowDiscover**  <br>*可选*|用户是否同意同步至遇见 1 是 0 否|integer (int32)|
|**Query**|**content**  <br>*可选*|评价内容|string|
|**Query**|**oid**  <br>*可选*|oid|integer (int32)|
|**Query**|**stars**  <br>*可选*|评价星级json，[{'pdId':1,'tags':[{'tag_id':1,'name':'2'}],'type':1,'starNum':1,'leader':{'lid':1,'lname':''}}]|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEvaluationSaveVO»](#714dfbe252930b30fb56f7974ec46d0d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "allowDiscover" : 0,
  "content" : "string",
  "oid" : 0,
  "stars" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "credits" : 0,
    "qid" : 0,
    "showCoupon" : 0,
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="evaluationeditsaveusingpost"></a>
#### 订单产品评价修改保存
```
POST /app/product/evaluation/update
```


##### 说明
订单产品评价修改保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.evaluationEditSave(com.youxiake.model.master.product.vo.EvaluationSaveVoV2)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**allowDiscover**  <br>*可选*|用户是否同意同步至遇见 1 是 0 否|integer (int32)|
|**Query**|**content**  <br>*可选*|评价内容|string|
|**Query**|**images**  <br>*可选*|评价图片json，[{'fid':1,'file':'','width':'','height':''}]|string|
|**Query**|**oid**  <br>*可选*|oid|integer (int32)|
|**Query**|**stars**  <br>*可选*|评价星级json，[{'pdId':1,'tags':[{'tag_id':1,'name':'2'}],'type':1,'starNum':1,'leader':{'lid':1,'lname':''}}]|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/evaluation/update
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "allowDiscover" : 0,
  "content" : "string",
  "images" : "string",
  "oid" : 0,
  "stars" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="favoriteusingpost_1"></a>
#### 产品收藏或取消
```
POST /app/product/favorite
```


##### 说明
产品收藏或取消<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.favorite(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**code**  <br>*可选*|code|string|
|**Query**|**pid**  <br>*必填*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/favorite
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "code" : "string",
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="favoritelistusingget"></a>
#### 产品收藏列表
```
GET /app/product/favorite/list
```


##### 说明
产品收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.favoriteList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ProductJihediDataVo»»»](#e8ea83804a7d1a373c6b6f58d54683cf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/favorite/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="saleremindusingpost"></a>
#### 特惠提醒确认
```
POST /app/product/sale/remind
```


##### 说明
特惠提醒确认<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductController.saleRemind(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|
|**Query**|**pid**  <br>*必填*|pid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«string»](#88ce995f16678bc660cc2af146abdb26)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/product/sale/remind
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string",
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "string",
  "msg" : "string"
}
```


<a name="c2502b0ebb92e59d5b817929a1cf834b"></a>
### 产品API
Product Remote Controller


<a name="recommendlinesusingget"></a>
#### 获取线路推荐
```
GET /app/remote/product/recommend/lines
```


##### 说明
获取线路推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.ProductRemoteController.recommendLines(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*必填*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«List«ProductJihediDataVo»»](#25fd5bbc22cb291fd54e0a5b8422795b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/remote/product/recommend/lines
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "ageLabel" : "string",
    "brandTag" : [ "string" ],
    "checking" : 0,
    "class_theme_id" : 0,
    "days" : "string",
    "firstBatchStatus" : "string",
    "free" : 0,
    "handler" : "string",
    "isFree" : 0,
    "liangdian" : [ "string" ],
    "liangdianLabel" : "string",
    "linquan" : "string",
    "listColor" : "string",
    "listColorV2" : "string",
    "listImgUrl" : "string",
    "listImgUrlV2" : "string",
    "marketingIco" : "string",
    "marketingList" : [ "string" ],
    "marketingTag" : "string",
    "marketingTagName" : "string",
    "maxPrice" : "string",
    "outDoorLabel" : "string",
    "peopleCount" : 0,
    "peopleCountLabel" : "string",
    "peopleCountLabelFull" : "string",
    "pid" : 0,
    "place_label" : "string",
    "price" : 0.0,
    "price_label" : "string",
    "pro_pic" : "string",
    "productPreferentialList" : [ {
      "couponAmount" : 0.0,
      "detailRemark" : "string",
      "shortRemark" : "string",
      "type" : 0
    } ],
    "product_cat" : "string",
    "product_name" : "string",
    "product_type" : "string",
    "product_type2" : "string",
    "psid" : 0,
    "salePriceLabel" : "string",
    "showStatus" : 0,
    "simpleName" : "string",
    "starttime" : "string",
    "sub_name" : "string",
    "thumb" : "string",
    "thumbList" : [ "string" ],
    "type" : 0,
    "type_or_cat" : "string",
    "typetwoOrCat" : "string",
    "url" : "string",
    "weight" : 0.0
  } ],
  "msg" : "string"
}
```


<a name="2072adb08bbd2060049d18da625f9f9b"></a>
### 产品v2
Product Controller V 2


<a name="evaluationlistusingget"></a>
#### 获取产品评价列表v2
```
GET /app/v2/product/evaluation/list
```


##### 说明
获取产品评价列表v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.v2.ProductControllerV2.evaluationList(java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|
|**Query**|**pid**  <br>*可选*|产品ID|integer (int32)||
|**Query**|**sortName**  <br>*可选*|排序名称all:所有，highQuality：好评，img：有图，latest:最新|string||
|**Query**|**tagName**  <br>*可选*|标签名称：传标签中文名字|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«APPEvaluationListV2VO»](#7536f48ef38c068c213d9a0b951986dc)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/product/evaluation/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pid" : 0,
  "sortName" : "string",
  "tagName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "addtime" : 0,
      "avatar" : "string",
      "averageStar" : 0.0,
      "channel" : 0,
      "content" : "string",
      "imgs" : [ { } ],
      "isTalent" : true,
      "pkgname" : "string",
      "quality" : 0,
      "reply" : "string",
      "stars" : [ { } ],
      "startTime" : "string",
      "username" : "string"
    } ],
    "num" : 0,
    "pagesize" : 0,
    "product_name" : "string",
    "tags" : [ {
      "label" : "string",
      "num" : 0,
      "tname" : "string",
      "type" : 0
    } ],
    "totalpage" : 0
  },
  "msg" : "string"
}
```


<a name="evaluationsavev2usingpost"></a>
#### 订单产品评价保存v2
```
POST /app/v2/product/evaluation/save
```


##### 说明
订单产品评价保存v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.v2.ProductControllerV2.evaluationSaveV2(com.youxiake.model.master.product.vo.EvaluationSaveVoV2)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**allowDiscover**  <br>*可选*|用户是否同意同步至遇见 1 是 0 否|integer (int32)|
|**Query**|**content**  <br>*可选*|评价内容|string|
|**Query**|**images**  <br>*可选*|评价图片json，[{'fid':1,'file':'','width':'','height':''}]|string|
|**Query**|**oid**  <br>*可选*|oid|integer (int32)|
|**Query**|**stars**  <br>*可选*|评价星级json，[{'pdId':1,'tags':[{'tag_id':1,'name':'2'}],'type':1,'starNum':1,'leader':{'lid':1,'lname':''}}]|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEvaluationSaveVO»](#714dfbe252930b30fb56f7974ec46d0d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/product/evaluation/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "allowDiscover" : 0,
  "content" : "string",
  "images" : "string",
  "oid" : 0,
  "stars" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "credits" : 0,
    "qid" : 0,
    "showCoupon" : 0,
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="871d5cdb3c179538a8951516847de760"></a>
### 产品订单管理
Orders Controller


<a name="orderbookusingget_1"></a>
#### 订单预订-选择日期
```
GET /app/book/batches
```


##### 说明
订单预订-选择日期<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.orderBook(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**pid**  <br>*可选*|产品id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductCalendarBatchVO»](#d681e08a83d1b81b16a0ae80b1e0f0f7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/batches
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "batchsCrossDays" : 0,
    "batchsDesc" : "string",
    "batchsList" : [ {
      "adultprice" : "string",
      "batch" : 0,
      "bid" : 0,
      "childprice" : "string",
      "daily_pkg" : [ {
        "pkg_name" : "string",
        "pkgid" : 0
      } ],
      "diff_num" : "string",
      "different" : 0,
      "is_over" : 0,
      "limit_max" : 0,
      "overtime" : 0,
      "parent_bid" : 0,
      "people_count" : 0,
      "pid" : 0,
      "pkg_name" : "string",
      "pkgid" : 0,
      "prepayTip" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "price_status" : "string",
      "saleAdultprice" : "string",
      "saleChildprice" : "string",
      "saleTip" : "string",
      "serial_code" : "string",
      "starttime" : 0,
      "status" : "string",
      "status_label" : "string",
      "status_remark" : "string",
      "status_title" : "string"
    } ],
    "batchsPreview" : [ {
      "caleLabel" : "string",
      "caleMonth" : "string",
      "price" : 0.0,
      "price_label" : "string"
    } ],
    "calenderEnd" : 0,
    "calenderStart" : 0,
    "daily_pkg_list" : [ {
      "batch_list" : [ {
        "pkg_name" : "string",
        "pkgid" : 0
      } ],
      "dailyPkgVoucherLabel" : {
        "labelName" : "string"
      },
      "pkg_name" : "string",
      "pkgid" : 0
    } ],
    "package_list" : [ {
      "daily_pkg" : [ {
        "pkg_name" : "string",
        "pkgid" : 0
      } ],
      "data" : [ {
        "adultprice" : "string",
        "batch" : 0,
        "bid" : 0,
        "childprice" : "string",
        "daily_pkg" : [ {
          "pkg_name" : "string",
          "pkgid" : 0
        } ],
        "diff_num" : "string",
        "different" : 0,
        "is_over" : 0,
        "limit_max" : 0,
        "overtime" : 0,
        "parent_bid" : 0,
        "people_count" : 0,
        "pid" : 0,
        "pkg_name" : "string",
        "pkgid" : 0,
        "prepayTip" : "string",
        "price" : 0.0,
        "price_label" : "string",
        "price_status" : "string",
        "saleAdultprice" : "string",
        "saleChildprice" : "string",
        "saleTip" : "string",
        "serial_code" : "string",
        "starttime" : 0,
        "status" : "string",
        "status_label" : "string",
        "status_remark" : "string",
        "status_title" : "string"
      } ],
      "months" : [ {
        "caleLabel" : "string",
        "caleMonth" : "string",
        "price" : 0.0,
        "price_label" : "string"
      } ],
      "pkg_name" : "string",
      "pkgid" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="orderfeedetailusingpost"></a>
#### 计算费用
```
POST /app/book/calcfee
```


##### 说明
计算费用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.orderFeeDetail(com.youxiake.model.master.order.vo.request.BookCalcFeeRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|批次bid|integer (int32)|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child_num**  <br>*可选*|儿童人数|integer (int32)|
|**Query**|**codeid**  <br>*可选*|codeid|integer (int32)|
|**Query**|**discountAmount**  <br>*可选*|满减金额|number|
|**Query**|**discountId**  <br>*可选*|满减id|integer (int32)|
|**Query**|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）|integer (int32)|
|**Query**|**earlybirdAmount**  <br>*可选*|早鸟金额|number|
|**Query**|**earlybirdId**  <br>*可选*|早鸟id|integer (int32)|
|**Query**|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）|integer (int32)|
|**Query**|**insurance**  <br>*可选*|保险|string|
|**Query**|**num**  <br>*可选*|成人人数|integer (int32)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|
|**Query**|**pid**  <br>*可选*|产品id|integer (int32)|
|**Query**|**pkgTicketList**  <br>*可选*|套餐门票选择jsonArray（pkgTicketId：套餐门票id，date：使用日期yyyy-MM-dd，num：选择数量）格式：[{pkgTicketId:1,date:yyyy-MM-dd,num:1}]|string|
|**Query**|**roomPkgId**  <br>*可选*|房型套餐id|integer (int32)|
|**Query**|**roomPkgNum**  <br>*可选*|房型套餐选择间数|integer (int32)|
|**Query**|**saleAmount**  <br>*可选*|特惠金额|number|
|**Query**|**saleId**  <br>*可选*|特惠id|integer (int32)|
|**Query**|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）|integer (int32)|
|**Query**|**type**  <br>*可选*|优惠类型|integer (int32)|
|**Query**|**voucherAmount**  <br>*可选*|预售券抵扣金额|number|
|**Query**|**voucherIncreaseAmount**  <br>*可选*|预售券加价金额|number|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FeeVO»](#06a6cf6b484aa37b6204e05a0add961b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/calcfee
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "cardMembers" : "string",
  "child_num" : 0,
  "codeid" : 0,
  "discountAmount" : 0.0,
  "discountId" : 0,
  "discountSn" : 0,
  "earlybirdAmount" : 0.0,
  "earlybirdId" : 0,
  "earlybirdSn" : 0,
  "insurance" : "string",
  "num" : 0,
  "oid" : 0,
  "pid" : 0,
  "pkgTicketList" : "string",
  "roomPkgId" : 0,
  "roomPkgNum" : 0,
  "saleAmount" : 0.0,
  "saleId" : 0,
  "saleSn" : 0,
  "type" : 0,
  "voucherAmount" : 0.0,
  "voucherIncreaseAmount" : 0.0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "html" : "string"
  },
  "msg" : "string"
}
```


<a name="getcardmemberlistusingget"></a>
#### 获取预订时权益卡出行人信息列表
```
GET /app/book/card/member/list
```


##### 说明
获取预订时权益卡出行人信息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getCardMemberList(com.youxiake.model.master.order.vo.request.BookCardMemberListRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|批次id|integer (int32)|
|**Query**|**midList**  <br>*可选*|选中的出行人列表|< integer (int32) > array(multi)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderCardVO»](#4d444dcfd0b700c6dbca0abee5030a82)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/card/member/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "midList" : 0,
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "orderMemberCardList" : [ {
      "birth" : 0,
      "birthStr" : "string",
      "cardName" : "string",
      "cardUserId" : 0,
      "cardUserName" : "string",
      "cardno" : "string",
      "cardnoHideAfter" : "string",
      "mid" : 0,
      "name" : "string",
      "ruleUrl" : "string",
      "selected" : 0,
      "sex" : 0,
      "sexLabel" : "string",
      "type" : 0,
      "typeLabel" : "string",
      "unusableReason" : "string",
      "validityTime" : "string"
    } ],
    "tip" : "string",
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="confirmorderusingpost"></a>
#### 预订下单-填写订单信息
```
POST /app/book/confirm
```


##### 说明
预订下单-填写订单信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.confirmOrder(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**bid**  <br>*可选*|bid|string|`"0"`|
|**Query**|**daily_pkgid**  <br>*可选*|行程套餐id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderConfirmVO»](#d2659752d7e5e12801f6357d36da10a9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/confirm
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : "string",
  "daily_pkgid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adult" : 0,
    "adultprice" : "string",
    "agentDesc" : "string",
    "bargainTip" : {
      "howBargainUrl" : "string",
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "batchInfo" : {
      "overDate" : "string",
      "overWeekDay" : "string",
      "startDate" : "string",
      "startWeekDay" : "string"
    },
    "batch_fees" : [ {
      "fees" : [ {
        "count" : 0,
        "fee_name" : "string",
        "fee_price" : 0.0,
        "fee_type" : 0,
        "fid" : 0,
        "required" : 0,
        "requiredNum" : 0
      } ],
      "is_require" : 0,
      "name" : "string",
      "tip" : "string"
    } ],
    "beneficialTravel" : {
      "cardRight" : {
        "subTitle" : "string",
        "title" : "string"
      },
      "voucherRight" : {
        "subTitle" : "string",
        "title" : "string"
      }
    },
    "bid" : 0,
    "bookingReminder" : "string",
    "cardTypeIds" : [ 0 ],
    "cardTypeTip" : "string",
    "cardUsable" : 0,
    "child" : 0,
    "childprice" : "string",
    "class_region_id" : 0,
    "confirmTerms" : [ {
      "comfirmType" : 0,
      "handler" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "contact_email" : "string",
    "contact_name" : "string",
    "contact_phone" : "string",
    "contractTip" : "string",
    "daily_pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "days" : 0,
    "discount" : {
      "content" : "string",
      "title" : "string",
      "url" : "string"
    },
    "discountList" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "fileMax" : 0,
    "fileNumMax" : 0,
    "healthTip" : "string",
    "hetongTip" : "string",
    "hetong_msg" : "string",
    "hk_exp" : 0,
    "hk_pass" : 0,
    "hk_tip" : "string",
    "hotelInfo" : {
      "allPrice" : 0.0,
      "endDateLabel" : "string",
      "endDateWeekLabel" : "string",
      "name" : "string",
      "num" : 0,
      "numLabel" : "string",
      "personNumLabel" : "string",
      "price" : 0.0,
      "roomPkgId" : 0,
      "roomPkgName" : "string",
      "startDateLabel" : "string",
      "startDateWeekLabel" : "string",
      "title" : "string"
    },
    "insurance" : {
      "cancelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "desc" : "string",
      "tip" : "string",
      "tip_url" : "string",
      "title" : "string",
      "title_tip" : "string",
      "travelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "url" : "string"
    },
    "isNeedConfirm" : 0,
    "isNeedContract" : 0,
    "is_free" : 0,
    "is_mail" : 0,
    "jihe_msg" : "string",
    "jihe_tip" : "string",
    "jihe_title" : "string",
    "jihedian" : [ {
      "city" : "string",
      "label" : "string",
      "lat" : 0.0,
      "lid" : 0,
      "lng" : 0.0,
      "location" : "string",
      "name" : "string",
      "remark" : "string",
      "timearea" : "string"
    } ],
    "limited" : [ "string" ],
    "needOrderattach" : 0,
    "needPsgNum" : 0,
    "need_psg" : 0,
    "nights" : 0,
    "no_passport" : 0,
    "oid" : 0,
    "orderRefund" : {
      "desc" : "string",
      "title" : "string",
      "url" : "string"
    },
    "orderRemark" : "string",
    "orderRemarkTip" : "string",
    "orderTip" : "string",
    "orderattachRemark" : "string",
    "passport_exp" : 0,
    "passport_tip" : "string",
    "pid" : 0,
    "pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "prepay" : {
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "price_label" : "string",
    "prodcut_free" : 0,
    "product_cate_type" : [ "string" ],
    "product_name" : "string",
    "product_sub_name" : "string",
    "refundTip" : "string",
    "requireOrderRemark" : 0,
    "requireOrderattach" : 0,
    "starttime" : "string",
    "ticketsInfo" : {
      "allPrice" : 0.0,
      "ticketList" : [ {
        "date" : "string",
        "dateLabel" : "string",
        "dateWeekLabel" : "string",
        "name" : "string",
        "num" : 0,
        "numLabel" : "string",
        "pkgTicketId" : 0,
        "price" : 0.0
      } ],
      "title" : "string"
    },
    "tips_children" : "string",
    "type" : 0,
    "yxbTip" : {
      "amountTip" : "string",
      "percentTip" : "string",
      "tip" : "string",
      "title" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="getlinecouponbyamountlistusingget"></a>
#### 获取可用代金券-线路下单
```
GET /app/book/getcouponlist
```


##### 说明
获取可用代金券-线路下单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getLineCouponByAmountList(com.youxiake.model.master.order.vo.request.BookCouponRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**addNum**  <br>*可选*|是否进行过增加人数操作（修改订单使用）|integer (int32)|
|**Query**|**adult**  <br>*可选*|成人数量|integer (int32)|
|**Query**|**bid**  <br>*可选*|批次bid|integer (int32)|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child**  <br>*可选*|儿童数量|integer (int32)|
|**Query**|**codeid**  <br>*可选*|codeid|integer (int32)|
|**Query**|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）|integer (int32)|
|**Query**|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）|integer (int32)|
|**Query**|**num**  <br>*可选*|人数|integer (int32)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|订单价格，需要除去保险价格和优惠价格|number|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pid**  <br>*可选*|产品id|integer (int32)|
|**Query**|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）|integer (int32)|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»](#ec4a56bf083eec985000c11b8463cbbf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/getcouponlist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "addNum" : 0,
  "adult" : 0,
  "bid" : 0,
  "cardMembers" : "string",
  "child" : 0,
  "codeid" : 0,
  "discountSn" : 0,
  "earlybirdSn" : 0,
  "num" : 0,
  "oid" : 0,
  "order_amount" : 0.0,
  "page" : 0,
  "pid" : 0,
  "saleSn" : 0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getdeductionusingget"></a>
#### 查询预订时候账户抵扣信息
```
GET /app/book/getdeduction
```


##### 说明
查询预订时候账户抵扣信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getDeduction(com.youxiake.model.master.order.vo.request.BookDeductionRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**orderAmount**  <br>*可选*|总价格（需要支付的金额，账户抵扣前金额）|number|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderDeductionVo»](#b8c66e0d83e78a9055069c7fefb08753)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/getdeduction
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "orderAmount" : 0.0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "balanceClose" : 0,
    "balanceTitle" : "string",
    "moneyLabel" : "string",
    "selected" : 0,
    "title" : "string",
    "yxbAmount" : 0.0,
    "yxbClose" : 0,
    "yxbMoneyLabel" : "string",
    "yxbSelected" : 0,
    "yxbTitle" : "string"
  },
  "msg" : "string"
}
```


<a name="getdiscountusingget"></a>
#### 查询预订时候优惠信息
```
GET /app/book/getdiscount
```


##### 说明
查询预订时候优惠信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getDiscount(com.youxiake.model.master.order.vo.request.BookCouponRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**addNum**  <br>*可选*|是否进行过增加人数操作（修改订单使用）|integer (int32)|
|**Query**|**adult**  <br>*可选*|成人数量|integer (int32)|
|**Query**|**bid**  <br>*可选*|批次bid|integer (int32)|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child**  <br>*可选*|儿童数量|integer (int32)|
|**Query**|**codeid**  <br>*可选*|codeid|integer (int32)|
|**Query**|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）|integer (int32)|
|**Query**|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）|integer (int32)|
|**Query**|**num**  <br>*可选*|人数|integer (int32)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|订单价格，需要除去保险价格和优惠价格|number|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pid**  <br>*可选*|产品id|integer (int32)|
|**Query**|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）|integer (int32)|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SaleInfoBean»](#a4d33377db10310822c392b74139f98e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/getdiscount
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "addNum" : 0,
  "adult" : 0,
  "bid" : 0,
  "cardMembers" : "string",
  "child" : 0,
  "codeid" : 0,
  "discountSn" : 0,
  "earlybirdSn" : 0,
  "num" : 0,
  "oid" : 0,
  "order_amount" : 0.0,
  "page" : 0,
  "pid" : 0,
  "saleSn" : 0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "card" : {
      "amount" : 0.0,
      "cardName" : "string",
      "url" : "string"
    },
    "change_label" : "string",
    "coupon" : {
      "amount" : 0.0,
      "codeid" : 0
    },
    "couponShow" : 0,
    "couponStatus" : 0,
    "couponStatuslabel" : "string",
    "discount" : {
      "amount" : 0.0,
      "desc" : "string",
      "discountId" : 0,
      "discountSn" : 0,
      "num" : 0
    },
    "earlybird" : {
      "amount" : 0.0,
      "earlybirdId" : 0,
      "earlybirdSn" : 0,
      "remark" : "string",
      "title" : "string"
    },
    "sale" : {
      "amount" : 0.0,
      "appSpecial" : 0,
      "desc" : "string",
      "firstSpecial" : 0,
      "remark" : [ "string" ],
      "saleId" : 0,
      "saleSn" : 0,
      "unusable" : 0
    },
    "type" : 0,
    "voucherBean" : {
      "voucherAmount" : 0.0,
      "voucherIncreaseAmount" : 0.0
    }
  },
  "msg" : "string"
}
```


<a name="getunlinecouponbyamountlistusingget"></a>
#### 获取不可用优惠券信息列表-线路下单
```
GET /app/book/getunavailablelist
```


##### 说明
获取不可用优惠券信息列表-线路下单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getUnLineCouponByAmountList(com.youxiake.model.master.order.vo.request.BookCouponRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**addNum**  <br>*可选*|是否进行过增加人数操作（修改订单使用）|integer (int32)|
|**Query**|**adult**  <br>*可选*|成人数量|integer (int32)|
|**Query**|**bid**  <br>*可选*|批次bid|integer (int32)|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child**  <br>*可选*|儿童数量|integer (int32)|
|**Query**|**codeid**  <br>*可选*|codeid|integer (int32)|
|**Query**|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）|integer (int32)|
|**Query**|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）|integer (int32)|
|**Query**|**num**  <br>*可选*|人数|integer (int32)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|订单价格，需要除去保险价格和优惠价格|number|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pid**  <br>*可选*|产品id|integer (int32)|
|**Query**|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）|integer (int32)|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»](#ec4a56bf083eec985000c11b8463cbbf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/getunavailablelist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "addNum" : 0,
  "adult" : 0,
  "bid" : 0,
  "cardMembers" : "string",
  "child" : 0,
  "codeid" : 0,
  "discountSn" : 0,
  "earlybirdSn" : 0,
  "num" : 0,
  "oid" : 0,
  "order_amount" : 0.0,
  "page" : 0,
  "pid" : 0,
  "saleSn" : 0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getvoucherlistusingget"></a>
#### 获取预订时预售券信息列表
```
GET /app/book/voucher/list
```


##### 说明
获取预订时预售券信息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.getVoucherList(com.youxiake.model.master.order.vo.request.BookVoucherListRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*必填*|批次id|integer (int32)|
|**Query**|**oid**  <br>*可选*|当前订单id|integer (int32)|
|**Query**|**page**  <br>*必填*|页码|integer (int32)|
|**Query**|**type**  <br>*必填*|类型：1可用2不可用|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderVoucherVO»](#b1f72884929986e641a11513d2327e0e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/book/voucher/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "oid" : 0,
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "dataList" : {
      "currentPage" : 0,
      "list" : [ {
        "unusableReason" : "string",
        "url" : "string",
        "validityTime" : "string",
        "voucherCode" : "string",
        "voucherId" : 0,
        "voucherName" : "string"
      } ],
      "pageSize" : 0,
      "recordCount" : 0,
      "totalPage" : 0
    },
    "tip" : "string",
    "unusableCount" : 0,
    "usableCount" : 0
  },
  "msg" : "string"
}
```


<a name="insuranceadviceusingget"></a>
#### 出险咨询
```
GET /app/insurance/advice
```


##### 说明
出险咨询<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.InsuranceController.insuranceAdvice()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HtmlVO»](#958ce38781bac00c1ea784091aadb1c1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/advice
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "html" : "string"
  },
  "msg" : "string"
}
```


<a name="buyinsuranceusingpost"></a>
#### 购买保险
```
POST /app/insurance/buy
```


##### 说明
购买保险<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.InsuranceController.buyInsurance(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**insurance**  <br>*可选*|保险id，用英文逗号分割|string|`"0"`|
|**Query**|**oid**  <br>*可选*|oid|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/buy
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "insurance" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="insurancedetailusingget"></a>
#### 保险产品详情
```
GET /app/insurance/detail
```


##### 说明
保险产品详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.InsuranceController.insuranceDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*可选*|id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HtmlVO»](#958ce38781bac00c1ea784091aadb1c1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "html" : "string"
  },
  "msg" : "string"
}
```


<a name="getbuyinsurancelistusingget"></a>
#### 获取保险列表-保险详情调用
```
GET /app/insurance/list
```


##### 说明
获取保险列表-保险详情调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.InsuranceController.getBuyInsuranceList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|oid|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«InsuranceBean»](#eab4d283c212b5a592ef06754f96ac65)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "cancelList" : {
      "list" : [ {
        "insurance_id" : 0,
        "name" : "string",
        "price" : 0.0,
        "select" : 0,
        "show" : 0,
        "tags" : "string",
        "url" : "string"
      } ],
      "multi" : 0,
      "shownum" : 0,
      "title" : "string"
    },
    "desc" : "string",
    "tip" : "string",
    "tip_url" : "string",
    "title" : "string",
    "title_tip" : "string",
    "travelList" : {
      "list" : [ {
        "insurance_id" : 0,
        "name" : "string",
        "price" : 0.0,
        "select" : 0,
        "show" : 0,
        "tags" : "string",
        "url" : "string"
      } ],
      "multi" : 0,
      "shownum" : 0,
      "title" : "string"
    },
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="contractresendusingpost"></a>
#### 使用新的手机号发送合同
```
POST /app/order/contract/resend
```


##### 说明
使用新的手机号发送合同<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.contractResend(com.youxiake.microservice.entity.http.order.request.OrderContractResendRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**request**  <br>*必填*|request|[OrderContractResendRQ](#ordercontractresendrq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderBestSignContractVO»](#3ef1e4e14144b8c1bca95d203f300ebd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/order/contract/resend
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "enableIDCert" : 0,
  "mobile" : "string",
  "name" : "string",
  "orderBestSignId" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "btnType" : 0,
    "contractReceiver" : "string",
    "contractReceiverPhone" : "string",
    "contractType" : 0,
    "orderBestSignId" : 0,
    "popTips" : "string",
    "status" : 0,
    "tips" : "string",
    "title" : "string",
    "url" : "string",
    "urlType" : 0
  },
  "msg" : "string"
}
```


<a name="contractsignremindusingpost"></a>
#### 合同签署提醒
```
POST /app/order/contract/sign-remind
```


##### 说明
合同签署提醒<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.contractSignRemind(com.youxiake.microservice.entity.http.order.request.OrderContractSignRemindRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**request**  <br>*必填*|request|[OrderContractSignRemindRQ](#ordercontractsignremindrq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderContractSignRemindVO»](#afffb9df3357973a25439cdbd6471bd0)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/order/contract/sign-remind
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "orderBestSignId" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "popMessage" : "string"
  },
  "msg" : "string"
}
```


<a name="sharedinfousingget"></a>
#### 订单已共享展示页面信息
```
GET /app/order/shared/info
```


##### 说明
订单已共享展示页面信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.sharedInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|oid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderSharedVO»](#1d8f39c65872ef184e8efe782fe9e0f8)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/order/shared/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "carouselContents" : [ "string" ],
    "shareHelpUrl" : "string",
    "shareItemList" : [ {
      "name" : "string",
      "phone" : "string",
      "shareId" : 0,
      "statusLabel" : "string"
    } ],
    "sharePic" : "string",
    "shareText" : "string",
    "shareVO" : {
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string"
    },
    "shareableNum" : 0,
    "sharedNum" : 0,
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="sharedrevokeusingpost"></a>
#### 订单共享撤销
```
POST /app/order/shared/revoke
```


##### 说明
订单共享撤销<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.sharedRevoke(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**shareId**  <br>*可选*|共享Id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/order/shared/revoke
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "shareId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bargainshareusingpost"></a>
#### 砍价分享
```
POST /app/orders/bargain/share
```


##### 说明
砍价分享<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.bargainShare(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|
|**Query**|**type**  <br>*可选*|1点击邀请砍价按钮，会返回分享内容2点击分享到微信，触发计时|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BargainShareVo»](#676c1adf5015a50317a09e88d769ac87)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/bargain/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "imgUrl" : "string",
    "miniAppId" : "string",
    "miniUrl" : "string",
    "title" : "string"
  },
  "msg" : "string"
}
```


<a name="cancelusingpost"></a>
#### 订单取消
```
POST /app/orders/cancel
```


##### 说明
订单取消<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.cancel(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/cancel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="orderscountusingget"></a>
#### 用户各种状态产品订单数
```
GET /app/orders/count
```


##### 说明
用户各种状态产品订单数<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.ordersCount()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrdersCountVo»](#db81068fcffb101f2b022e190af14599)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/count
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "all" : 0,
    "coupon" : 0,
    "pj" : 0,
    "refund" : 0,
    "success" : 0,
    "tibu" : 0,
    "unpay" : 0
  },
  "msg" : "string"
}
```


<a name="detailusingget_4"></a>
#### 订单详情
```
GET /app/orders/details
```


##### 说明
订单详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.detail(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**first**  <br>*可选*|first|integer (int32)|`0`|
|**Query**|**isFirst**  <br>*可选*|首次下单跳转传1|string|`"0"`|
|**Query**|**needPay**  <br>*可选*|是否需要自动支付弹窗校验|string|`"0"`|
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderDetailVO»](#4870d16b33051bec7dcaa992b52d698b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/details
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "first" : 0,
  "isFirst" : "string",
  "needPay" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "addtime" : "string",
    "adult" : 0,
    "adverts" : [ {
      "exp" : 0,
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "amount" : "string",
    "applyTime" : "string",
    "auditTip" : "string",
    "bargainShow" : {
      "bargainAfterPrice" : "string",
      "bargainBeforePrice" : "string",
      "bargainPriceTip" : "string",
      "bargainRuleContent" : "string",
      "bargainRuleTitle" : "string",
      "bargainStatus" : 0,
      "btnTip" : "string",
      "cancelTip" : "string",
      "firstBargainPriceLabel" : "string",
      "firstBargainTip" : "string",
      "firstOldPriceLabel" : "string",
      "firstTip" : "string",
      "maxBargainPirce" : "string",
      "maxBargainPirceLabel" : "string",
      "orderPassLabel" : "string",
      "overLabel" : "string",
      "overPayLabel" : "string",
      "overPaytime" : 0,
      "overtime" : 0,
      "payPastTip" : "string",
      "payTip" : "string"
    },
    "batch_name" : "string",
    "batch_time" : "string",
    "bestSignContractList" : [ {
      "btnType" : 0,
      "contractReceiver" : "string",
      "contractReceiverPhone" : "string",
      "contractType" : 0,
      "orderBestSignId" : 0,
      "popTips" : "string",
      "status" : 0,
      "tips" : "string",
      "title" : "string",
      "url" : "string",
      "urlType" : 0
    } ],
    "canPay" : 0,
    "canPayTip" : "string",
    "cancelLabel" : "string",
    "cancelReason" : [ {
      "reasonId" : 0,
      "reasonValue" : "string"
    } ],
    "child" : 0,
    "contact_email" : "string",
    "contact_name" : "string",
    "contact_phone" : "string",
    "contractList" : [ {
      "openType" : 0,
      "pdfName" : "string",
      "readStatus" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "urlTitle" : "string",
      "urlType" : 0
    } ],
    "contractTip" : "string",
    "coupon" : {
      "amount" : 0.0,
      "codeid" : 0
    },
    "daily_pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "deleted" : 0,
    "editTip" : "string",
    "expireTime" : "string",
    "extra_service" : {
      "yiyu8" : {
        "car_name" : "string",
        "car_status" : 0,
        "car_url" : "string"
      }
    },
    "feeTip" : "string",
    "fee_details" : "string",
    "files" : [ {
      "fid" : 0,
      "filePath" : "string"
    } ],
    "firstAidCardBtnShow" : 0,
    "healthTip" : "string",
    "hotelInfo" : {
      "allPrice" : 0.0,
      "endDateLabel" : "string",
      "endDateWeekLabel" : "string",
      "name" : "string",
      "num" : 0,
      "numLabel" : "string",
      "personNumLabel" : "string",
      "price" : 0.0,
      "roomPkgId" : 0,
      "roomPkgName" : "string",
      "startDateLabel" : "string",
      "startDateWeekLabel" : "string",
      "title" : "string"
    },
    "html_status" : "string",
    "insurance" : {
      "buyInfo" : {
        "buy" : 0,
        "buy_tip" : "string",
        "hideBtn" : 0
      },
      "detail" : {
        "advice" : 0,
        "advice_title" : "string",
        "list" : [ {
          "insurance_id" : 0,
          "members" : [ {
            "insurance_file" : "string",
            "insurance_no" : "string",
            "omid" : 0,
            "status" : 0,
            "status_label" : "string",
            "truename" : "string"
          } ],
          "name" : "string",
          "num" : 0,
          "price" : 0.0
        } ],
        "title" : "string",
        "title_tip" : "string",
        "url" : "string"
      }
    },
    "insuranceChange" : 0,
    "isNeedSignContract" : 0,
    "jihedian" : {
      "bd_location" : {
        "lat" : 0.0,
        "lng" : 0.0
      },
      "city" : "string",
      "gd_location" : {
        "lat" : 0.0,
        "lng" : 0.0
      },
      "label" : "string",
      "lid" : 0,
      "name" : "string",
      "timearea" : "string"
    },
    "medicalCard" : {
      "isShow" : 0,
      "tips" : "string",
      "title" : "string",
      "url" : "string"
    },
    "members" : [ {
      "birth" : "string",
      "cardName" : "string",
      "cardexp" : 0,
      "cardno" : "string",
      "city" : "string",
      "contact" : 0,
      "mid" : 0,
      "name" : "string",
      "passport_cid" : 0,
      "phone" : "string",
      "sex" : "string",
      "statusColor" : "string",
      "statusName" : "string",
      "type" : "string"
    } ],
    "miniPayed_amount" : 0.0,
    "office_url" : "string",
    "oid" : 0,
    "option" : {
      "cancel" : 0,
      "cancelConfirmContent" : "string",
      "cancelTip" : "string",
      "delete_status" : 0,
      "edit" : 0,
      "editConfirmTip" : "string",
      "editLabel" : "string",
      "invoice" : 0,
      "invoice_tip" : "string",
      "isPayRemind" : 0,
      "pay" : 0,
      "payBtnLabel" : "string",
      "payGray" : 0,
      "payRemindBtn" : "string",
      "payRemindContent" : "string",
      "payTip" : "string",
      "pjTip" : "string",
      "pj_status" : 0,
      "pj_url" : "string",
      "rebookStatus" : 0,
      "refund_label" : "string",
      "refund_status" : 0,
      "refund_tip" : "string",
      "refund_url" : "string",
      "showPjUrl" : "string"
    },
    "orderAddFund" : {
      "feeDetailList" : [ {
        "amount" : "string",
        "desc" : "string",
        "fid" : 0
      } ],
      "title" : "string"
    },
    "orderBargain" : {
      "canBargainMaxPrice" : "string",
      "canBargainTip" : "string",
      "canBargainUrl" : "string",
      "cancelTip" : "string",
      "howBargainTip" : "string",
      "howBargainUrl" : "string",
      "limitTip" : "string",
      "maxPriceTip" : "string",
      "payTip" : "string",
      "payUrl" : "string"
    },
    "orderCompany" : {
      "list" : [ {
        "leftTip" : "string",
        "rightTip" : "string",
        "rightUrl" : "string",
        "type" : 0
      } ],
      "title" : "string"
    },
    "orderFeePo" : {
      "add_amount" : 0.0,
      "add_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "adult_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "bargain_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "card_amount" : 0.0,
      "card_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "child_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "coupon_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "deduction_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "discount_amount" : 0.0,
      "discount_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "earlybird_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "insurance_amount" : 0.0,
      "insurance_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "isCalcuing" : 0,
      "other_amount" : 0.0,
      "other_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "pro_amount" : 0.0,
      "refund_amount" : 0.0,
      "refund_desc" : [ {
        "name" : "string",
        "numLabel" : "string"
      } ],
      "refund_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "room_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "sale_amount" : 0.0,
      "ticket_fee" : [ {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      } ],
      "total_fee" : 0.0,
      "type" : 0,
      "voucherAmount" : 0.0,
      "voucherFee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "voucherIncreaseAmount" : 0.0,
      "voucherIncreaseFee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      },
      "yxb_fee" : {
        "amount" : 0.0,
        "count" : 0,
        "desc" : "string",
        "price" : 0.0,
        "returned" : 0,
        "tag" : "string"
      }
    },
    "orderShare" : {
      "orderShareTipStr" : "string",
      "shareDetailPlanList" : [ {
        "subTitle" : "string",
        "title" : "string"
      } ],
      "shareDetailTip" : "string",
      "shareLabel" : "string",
      "shareStatus" : 0
    },
    "orderno" : "string",
    "payInfo" : "string",
    "payed_amount" : 0.0,
    "pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "prepay" : {
      "bottomDesc" : "string",
      "descList" : [ {
        "leftDesc" : "string",
        "pass" : 0,
        "rightDesc" : "string"
      } ],
      "explainUrl" : "string"
    },
    "product" : {
      "bid" : 0,
      "cate" : "string",
      "cover" : "string",
      "name" : "string",
      "pid" : 0,
      "productCateType" : [ "string" ],
      "qiyu" : {
        "data" : "string",
        "groupid" : "string"
      },
      "service_id" : "string",
      "statisticsCode" : "string",
      "sub_name" : "string",
      "type" : "string",
      "url_string" : "string"
    },
    "recommendTags" : [ {
      "name" : "string",
      "tagId" : 0
    } ],
    "remark" : "string",
    "signHelp" : "string",
    "signHelpUrl" : "string",
    "similarBtnTip" : "string",
    "similarTip" : "string",
    "similarUrl" : "string",
    "sportSignVo" : {
      "isCheck" : 0,
      "qrcodeTip" : "string",
      "qrcodeUrl" : "string"
    },
    "status" : 0,
    "statusStepList" : [ {
      "name" : "string",
      "pass" : 0,
      "selected" : 0
    } ],
    "status_steps" : [ "string" ],
    "ticketsInfo" : {
      "allPrice" : 0.0,
      "ticketList" : [ {
        "date" : "string",
        "dateLabel" : "string",
        "dateWeekLabel" : "string",
        "name" : "string",
        "num" : 0,
        "numLabel" : "string",
        "pkgTicketId" : 0,
        "price" : 0.0
      } ],
      "title" : "string"
    },
    "tipLabel" : "string",
    "unpayed_amount" : "string",
    "upgrade_label" : "string",
    "upgrade_map" : 0
  },
  "msg" : "string"
}
```


<a name="detailrecommendusingget"></a>
#### 订单详情-推荐
```
GET /app/orders/details/recommend
```


##### 说明
订单详情-推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.detailRecommend(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**pageType**  <br>*可选*|页面类型：1订单详情页2支付成功页|string|`"1"`|
|**Query**|**type**  <br>*可选*|tab类型|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductOrderDetailRecommendVo»](#0d3247e79c52b6b59e4ce4b0c7625511)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/details/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string",
  "page" : "string",
  "pageType" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "days" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price_label" : "string",
      "product_cat" : "string",
      "product_name" : "string",
      "sell_label" : "string",
      "statisticsCode" : "string",
      "thumb" : "string",
      "url" : "string"
    } ],
    "productList" : [ {
      "dataDetail" : "object",
      "identityCode" : "string",
      "indexFlowBangdanVo" : {
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowChannelVo" : {
        "handler" : "string",
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typeImage" : "string",
        "typeImageV2" : "string",
        "url" : "string"
      },
      "indexFlowDiscoverVo" : {
        "address" : "string",
        "avatar" : "string",
        "did" : 0,
        "discus" : "string",
        "image" : "string",
        "numLabel" : "string",
        "prised" : 0,
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowFilmVo" : {
        "ad" : true,
        "address" : "string",
        "fid" : 0,
        "image" : "string",
        "mediaUrl" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "timeLabel" : "string",
        "title" : "string"
      },
      "indexFlowMddVo" : {
        "image" : "string",
        "mddId" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowNewsVo" : {
        "ad" : true,
        "image" : "string",
        "newsId" : 0,
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowProductVo" : {
        "ageLabel" : "string",
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "outDoorLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productCat" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "type" : 0,
        "typetwoOrCat" : "string"
      },
      "indexFlowTravelarticleVo" : {
        "avatar" : "string",
        "image" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "tid" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowVoucherVo" : {
        "handler" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "priceLabel" : "string",
        "salePriceLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowZhuantiVo" : {
        "blurColor" : "string",
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "type" : 0
    } ],
    "recommendTags" : [ {
      "name" : "string",
      "tagId" : 0
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="editinfousingget"></a>
#### 订单修改信息
```
GET /app/orders/edit
```


##### 说明
订单修改信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.editInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEditVO»](#dde1adad2722f259f864fb89be9fb8a0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/edit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adult" : 0,
    "adultprice" : "string",
    "agentDesc" : "string",
    "bargainTip" : {
      "howBargainUrl" : "string",
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "batchInfo" : {
      "overDate" : "string",
      "overWeekDay" : "string",
      "startDate" : "string",
      "startWeekDay" : "string"
    },
    "batch_fees" : [ {
      "fees" : [ {
        "count" : 0,
        "fee_name" : "string",
        "fee_price" : 0.0,
        "fee_type" : 0,
        "fid" : 0,
        "required" : 0,
        "requiredNum" : 0
      } ],
      "is_require" : 0,
      "name" : "string",
      "tip" : "string"
    } ],
    "beneficialTravel" : {
      "cardRight" : {
        "subTitle" : "string",
        "title" : "string"
      },
      "voucherRight" : {
        "subTitle" : "string",
        "title" : "string"
      }
    },
    "bid" : 0,
    "bookingReminder" : "string",
    "cardTypeIds" : [ 0 ],
    "cardTypeTip" : "string",
    "child" : 0,
    "child_num" : 0,
    "childprice" : "string",
    "chosen_jhd" : 0,
    "class_region_id" : 0,
    "confirmTerms" : [ {
      "comfirmType" : 0,
      "handler" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "contact_email" : "string",
    "contact_name" : "string",
    "contact_phone" : "string",
    "contractTip" : "string",
    "daily_pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "days" : 0,
    "discount" : {
      "content" : "string",
      "title" : "string",
      "url" : "string"
    },
    "discountList" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "fileMax" : 0,
    "fileNumMax" : 0,
    "files" : [ {
      "fid" : 0,
      "filePath" : "string"
    } ],
    "healthTip" : "string",
    "hetongTip" : "string",
    "hetong_msg" : "string",
    "hk_exp" : 0,
    "hk_pass" : 0,
    "hk_tip" : "string",
    "insurance" : {
      "cancelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "desc" : "string",
      "tip" : "string",
      "tip_url" : "string",
      "title" : "string",
      "title_tip" : "string",
      "travelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "url" : "string"
    },
    "isNeedConfirm" : 0,
    "isNeedContract" : 0,
    "is_free" : 0,
    "is_mail" : 0,
    "jihe_msg" : "string",
    "jihe_tip" : "string",
    "jihe_title" : "string",
    "jihedian" : [ {
      "city" : "string",
      "label" : "string",
      "lat" : 0.0,
      "lid" : 0,
      "lng" : 0.0,
      "location" : "string",
      "name" : "string",
      "remark" : "string",
      "timearea" : "string"
    } ],
    "limited" : [ "string" ],
    "limitedLs" : [ "string" ],
    "membersList" : [ {
      "bindCard" : 0,
      "birth" : "string",
      "birthStr" : "string",
      "cardName" : "string",
      "cardUserId" : 0,
      "cardexp" : 0,
      "cardno" : "string",
      "cardnoHideAfter" : "string",
      "city" : "string",
      "contact" : 0,
      "mid" : 0,
      "name" : "string",
      "passport_cid" : 0,
      "phone" : "string",
      "sex" : "string",
      "type" : "string"
    } ],
    "needOrderattach" : 0,
    "need_psg" : 0,
    "nights" : 0,
    "no_passport" : 0,
    "num" : 0,
    "office_fee" : 0.0,
    "oid" : 0,
    "orderRefund" : {
      "desc" : "string",
      "title" : "string",
      "url" : "string"
    },
    "orderRemark" : "string",
    "orderRemarkTip" : "string",
    "orderTip" : "string",
    "orderattachRemark" : "string",
    "passport_exp" : 0,
    "passport_tip" : "string",
    "pid" : 0,
    "pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "prepay" : {
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "prodcut_free" : 0,
    "product_cate_type" : [ "string" ],
    "product_name" : "string",
    "product_sub_name" : "string",
    "refundTip" : "string",
    "remark" : "string",
    "requireOrderRemark" : 0,
    "requireOrderattach" : 0,
    "sale_info" : {
      "card" : {
        "amount" : 0.0,
        "cardName" : "string",
        "url" : "string"
      },
      "change_label" : "string",
      "coupon" : {
        "amount" : 0.0,
        "codeid" : 0
      },
      "couponShow" : 0,
      "couponStatus" : 0,
      "couponStatuslabel" : "string",
      "discount" : {
        "amount" : 0.0,
        "desc" : "string",
        "discountId" : 0,
        "discountSn" : 0,
        "num" : 0
      },
      "earlybird" : {
        "amount" : 0.0,
        "earlybirdId" : 0,
        "earlybirdSn" : 0,
        "remark" : "string",
        "title" : "string"
      },
      "sale" : {
        "amount" : 0.0,
        "appSpecial" : 0,
        "desc" : "string",
        "firstSpecial" : 0,
        "remark" : [ "string" ],
        "saleId" : 0,
        "saleSn" : 0,
        "unusable" : 0
      },
      "type" : 0,
      "voucherBean" : {
        "voucherAmount" : 0.0,
        "voucherIncreaseAmount" : 0.0
      }
    },
    "starttime" : "string",
    "starttime_mini" : "string",
    "sub_name" : "string",
    "tips_children" : "string",
    "total_fee" : "string",
    "type" : 0,
    "yxbTip" : {
      "amountTip" : "string",
      "percentTip" : "string",
      "tip" : "string",
      "title" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="orderfeedetailusingget"></a>
#### 订单费用明细
```
GET /app/orders/fee
```


##### 说明
订单费用明细<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.orderFeeDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FeeVO»](#06a6cf6b484aa37b6204e05a0add961b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/fee
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "html" : "string"
  },
  "msg" : "string"
}
```


<a name="orderslistusingget"></a>
#### 产品订单列表
```
GET /app/orders/list
```


##### 说明
产品订单列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.ordersList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**status**  <br>*可选*|状态|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«OrdersListItemVo»»»](#e390009ee46a0f7df3d0e3dab11e2f07)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "status" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "addFund" : 0,
      "addtime" : 0,
      "adult" : 0,
      "amount" : "string",
      "bargain" : 0,
      "bargainEndLabel" : "string",
      "bargainEndTime" : 0,
      "bargainPayOverLabel" : "string",
      "bargainPayOverTime" : 0,
      "batch_name" : "string",
      "bid" : 0,
      "child" : 0,
      "date" : "string",
      "deleted" : 0,
      "extra_service" : "object",
      "hotelName" : "string",
      "isFree" : 0,
      "isShare" : 0,
      "oid" : 0,
      "orderno" : "string",
      "payBtnLabel" : "string",
      "payInfo" : "string",
      "pay_status" : 0,
      "pay_status_label" : "string",
      "payed" : 0,
      "pid" : 0,
      "pj_status" : 0,
      "pj_url" : "string",
      "pkgid" : 0,
      "prepay" : 0,
      "product_cate" : "string",
      "product_name" : "string",
      "product_pic" : "string",
      "product_sub_name" : "string",
      "product_type" : "string",
      "rebookStatus" : 0,
      "refund_label" : "string",
      "refund_status" : 0,
      "refund_url" : "string",
      "roomNum" : 0,
      "roomPkgName" : "string",
      "shareMsg" : "string",
      "similarBtnTip" : "string",
      "similarTip" : "string",
      "similarUrl" : "string",
      "sitecode" : 0,
      "status" : 0,
      "statusColour" : "string",
      "status_label" : "string",
      "type" : 0,
      "typeName" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ordersrefundlistusingget"></a>
#### 产品退款&取消订单列表
```
GET /app/orders/list/refund
```


##### 说明
产品退款&取消订单列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.ordersRefundList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«OrdersListItemVo»»»](#e390009ee46a0f7df3d0e3dab11e2f07)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/list/refund
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "addFund" : 0,
      "addtime" : 0,
      "adult" : 0,
      "amount" : "string",
      "bargain" : 0,
      "bargainEndLabel" : "string",
      "bargainEndTime" : 0,
      "bargainPayOverLabel" : "string",
      "bargainPayOverTime" : 0,
      "batch_name" : "string",
      "bid" : 0,
      "child" : 0,
      "date" : "string",
      "deleted" : 0,
      "extra_service" : "object",
      "hotelName" : "string",
      "isFree" : 0,
      "isShare" : 0,
      "oid" : 0,
      "orderno" : "string",
      "payBtnLabel" : "string",
      "payInfo" : "string",
      "pay_status" : 0,
      "pay_status_label" : "string",
      "payed" : 0,
      "pid" : 0,
      "pj_status" : 0,
      "pj_url" : "string",
      "pkgid" : 0,
      "prepay" : 0,
      "product_cate" : "string",
      "product_name" : "string",
      "product_pic" : "string",
      "product_sub_name" : "string",
      "product_type" : "string",
      "rebookStatus" : 0,
      "refund_label" : "string",
      "refund_status" : 0,
      "refund_url" : "string",
      "roomNum" : 0,
      "roomPkgName" : "string",
      "shareMsg" : "string",
      "similarBtnTip" : "string",
      "similarTip" : "string",
      "similarUrl" : "string",
      "sitecode" : 0,
      "status" : 0,
      "statusColour" : "string",
      "status_label" : "string",
      "type" : 0,
      "typeName" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ordersmembercheckusingget"></a>
#### 线路订单出行人选择验证
```
GET /app/orders/member/check
```


##### 说明
线路订单出行人选择验证<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.ordersMemberCheck(java.lang.Integer,java.util.List)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*必填*|bid|integer (int32)|
|**Query**|**memberIds**  <br>*必填*|memberIds|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/member/check
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "memberIds" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="removeusingpost"></a>
#### 订单删除
```
POST /app/orders/remove
```


##### 说明
订单删除<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.remove(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/remove
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="ordersaveusingpost_1"></a>
#### 保存订单
```
POST /app/orders/save
```


##### 说明
保存订单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.orderSave(com.youxiake.model.master.order.vo.request.SaveOrderRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**basicRefundId**  <br>*可选*|基础退订政策id|integer (int32)|
|**Query**|**bid**  <br>*可选*|批次id|integer (int32)|
|**Query**|**booking_privacy**  <br>*可选*|booking_privacy|string|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child_num**  <br>*可选*|儿童报名人数|integer (int32)|
|**Query**|**codeid**  <br>*可选*|代金券id|integer (int32)|
|**Query**|**contact_email**  <br>*可选*|联系人邮箱|string|
|**Query**|**contact_name**  <br>*可选*|联系人姓名|string|
|**Query**|**contact_phone**  <br>*可选*|联系人电话|string|
|**Query**|**daily_pkgid**  <br>*可选*|日程id|integer (int32)|
|**Query**|**discountId**  <br>*可选*|满减id|integer (int32)|
|**Query**|**earlybirdId**  <br>*可选*|早鸟id|integer (int32)|
|**Query**|**files**  <br>*可选*|附件地址[{fid:0,filePath:""}]|string|
|**Query**|**fullRefundId**  <br>*可选*|无损退订政策id|integer (int32)|
|**Query**|**insurance**  <br>*可选*|保险id 用英文逗号分割|string|
|**Query**|**isRebook**  <br>*可选*|订单总金额|integer (int32)|
|**Query**|**lid**  <br>*可选*|集合点id|integer (int32)|
|**Query**|**loadTime**  <br>*可选*|产品详情里的传过来|string|
|**Query**|**mid**  <br>*可选*|出行人ids逗号隔开|string|
|**Query**|**num**  <br>*可选*|成人报名人数|integer (int32)|
|**Query**|**remark**  <br>*可选*|备注|string|
|**Query**|**saleId**  <br>*可选*|特惠id|integer (int32)|
|**Query**|**sourceOid**  <br>*可选*|来源oid，重新预定时传过来|integer (int32)|
|**Query**|**totalAmount**  <br>*可选*|订单总金额|number|
|**Query**|**type**  <br>*可选*|优惠类型|integer (int32)|
|**Query**|**view_id**  <br>*可选*|view_id|integer (int32)|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SaveVO»](#fbf374364bcef5e5a7fd29354ab436f3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "basicRefundId" : 0,
  "bid" : 0,
  "booking_privacy" : "string",
  "cardMembers" : "string",
  "child_num" : 0,
  "codeid" : 0,
  "contact_email" : "string",
  "contact_name" : "string",
  "contact_phone" : "string",
  "daily_pkgid" : 0,
  "discountId" : 0,
  "earlybirdId" : 0,
  "files" : "string",
  "fullRefundId" : 0,
  "insurance" : "string",
  "isRebook" : 0,
  "lid" : 0,
  "loadTime" : "string",
  "mid" : "string",
  "num" : 0,
  "remark" : "string",
  "saleId" : 0,
  "sourceOid" : 0,
  "totalAmount" : 0.0,
  "type" : 0,
  "view_id" : 0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "oid" : 0,
    "priceInfo" : "string"
  },
  "msg" : "string"
}
```


<a name="shareinfousingget_1"></a>
#### 订单共享页面信息
```
GET /app/orders/share/info
```


##### 说明
订单共享页面信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.shareInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderShareInfoVO»](#a94b9b00ac875562f5ecf39216482ef5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/share/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "incompleteItemVOList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "num" : 0,
    "oid" : 0,
    "phoneList" : [ "string" ],
    "shareInfoItemList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="sharesaveusingpost"></a>
#### 订单共享保存
```
POST /app/orders/share/save
```


##### 说明
订单共享保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.shareSave(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**jsonList**  <br>*必填*|数据格式['name':'','phone':'']|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderShareInfoVO»](#a94b9b00ac875562f5ecf39216482ef5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/share/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "jsonList" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "incompleteItemVOList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "num" : 0,
    "oid" : 0,
    "phoneList" : [ "string" ],
    "shareInfoItemList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="shareverifyusingpost"></a>
#### 订单共享校验
```
POST /app/orders/share/verify
```


##### 说明
订单共享校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.shareVerify(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**jsonList**  <br>*必填*|数据格式['name':'','phone':'']|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderShareInfoVO»](#a94b9b00ac875562f5ecf39216482ef5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/share/verify
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "jsonList" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "incompleteItemVOList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "num" : 0,
    "oid" : 0,
    "phoneList" : [ "string" ],
    "shareInfoItemList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="orderupdateusingpost"></a>
#### 订单更新
```
POST /app/orders/update
```


##### 说明
订单更新<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersController.orderUpdate(com.youxiake.model.master.order.vo.request.UpdateOrderRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**basicRefundId**  <br>*可选*|基础退订政策id|integer (int32)|
|**Query**|**bid**  <br>*可选*|批次id|integer (int32)|
|**Query**|**booking_privacy**  <br>*可选*|booking_privacy|string|
|**Query**|**cardMembers**  <br>*可选*|权益卡出行人[{mid:0,cardUserId:0}]|string|
|**Query**|**child_num**  <br>*可选*|儿童报名人数|integer (int32)|
|**Query**|**codeid**  <br>*可选*|代金券id|integer (int32)|
|**Query**|**contact_email**  <br>*可选*|联系人邮箱|string|
|**Query**|**contact_name**  <br>*可选*|联系人姓名|string|
|**Query**|**contact_phone**  <br>*可选*|联系人电话|string|
|**Query**|**daily_pkgid**  <br>*可选*|日程id|integer (int32)|
|**Query**|**discountId**  <br>*可选*|满减id|integer (int32)|
|**Query**|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）|integer (int32)|
|**Query**|**earlybirdId**  <br>*可选*|早鸟id|integer (int32)|
|**Query**|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）|integer (int32)|
|**Query**|**files**  <br>*可选*|附件地址[{fid:0,filePath:""}]|string|
|**Query**|**fullRefundId**  <br>*可选*|无损退订政策id|integer (int32)|
|**Query**|**insurance**  <br>*可选*|保险id 用英文逗号分割|string|
|**Query**|**isRebook**  <br>*可选*|订单总金额|integer (int32)|
|**Query**|**lid**  <br>*可选*|集合点id|integer (int32)|
|**Query**|**loadTime**  <br>*可选*|产品详情里的传过来|string|
|**Query**|**mid**  <br>*可选*|出行人ids逗号隔开|string|
|**Query**|**num**  <br>*可选*|成人报名人数|integer (int32)|
|**Query**|**oid**  <br>*可选*|订单id|integer (int32)|
|**Query**|**remark**  <br>*可选*|备注|string|
|**Query**|**saleId**  <br>*可选*|特惠id|integer (int32)|
|**Query**|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）|integer (int32)|
|**Query**|**sourceOid**  <br>*可选*|来源oid，重新预定时传过来|integer (int32)|
|**Query**|**totalAmount**  <br>*可选*|订单总金额|number|
|**Query**|**type**  <br>*可选*|优惠类型|integer (int32)|
|**Query**|**view_id**  <br>*可选*|view_id|integer (int32)|
|**Query**|**voucherList**  <br>*可选*|选择的预售券id数组|< integer (int32) > array(multi)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SaveVO»](#fbf374364bcef5e5a7fd29354ab436f3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orders/update
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "basicRefundId" : 0,
  "bid" : 0,
  "booking_privacy" : "string",
  "cardMembers" : "string",
  "child_num" : 0,
  "codeid" : 0,
  "contact_email" : "string",
  "contact_name" : "string",
  "contact_phone" : "string",
  "daily_pkgid" : 0,
  "discountId" : 0,
  "discountSn" : 0,
  "earlybirdId" : 0,
  "earlybirdSn" : 0,
  "files" : "string",
  "fullRefundId" : 0,
  "insurance" : "string",
  "isRebook" : 0,
  "lid" : 0,
  "loadTime" : "string",
  "mid" : "string",
  "num" : 0,
  "oid" : 0,
  "remark" : "string",
  "saleId" : 0,
  "saleSn" : 0,
  "sourceOid" : 0,
  "totalAmount" : 0.0,
  "type" : 0,
  "view_id" : 0,
  "voucherList" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "oid" : 0,
    "priceInfo" : "string"
  },
  "msg" : "string"
}
```


<a name="rebookusingpost"></a>
#### 重新预定
```
POST /app/rebook
```


##### 说明
重新预定-获取订单信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.BookController.rebook(com.youxiake.microservice.entity.http.order.request.OrderLineEditRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderEditVO»](#dde1adad2722f259f864fb89be9fb8a0)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/rebook
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adult" : 0,
    "adultprice" : "string",
    "agentDesc" : "string",
    "bargainTip" : {
      "howBargainUrl" : "string",
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "batchInfo" : {
      "overDate" : "string",
      "overWeekDay" : "string",
      "startDate" : "string",
      "startWeekDay" : "string"
    },
    "batch_fees" : [ {
      "fees" : [ {
        "count" : 0,
        "fee_name" : "string",
        "fee_price" : 0.0,
        "fee_type" : 0,
        "fid" : 0,
        "required" : 0,
        "requiredNum" : 0
      } ],
      "is_require" : 0,
      "name" : "string",
      "tip" : "string"
    } ],
    "beneficialTravel" : {
      "cardRight" : {
        "subTitle" : "string",
        "title" : "string"
      },
      "voucherRight" : {
        "subTitle" : "string",
        "title" : "string"
      }
    },
    "bid" : 0,
    "bookingReminder" : "string",
    "cardTypeIds" : [ 0 ],
    "cardTypeTip" : "string",
    "child" : 0,
    "child_num" : 0,
    "childprice" : "string",
    "chosen_jhd" : 0,
    "class_region_id" : 0,
    "confirmTerms" : [ {
      "comfirmType" : 0,
      "handler" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "contact_email" : "string",
    "contact_name" : "string",
    "contact_phone" : "string",
    "contractTip" : "string",
    "daily_pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "days" : 0,
    "discount" : {
      "content" : "string",
      "title" : "string",
      "url" : "string"
    },
    "discountList" : [ {
      "explain" : "string",
      "explainTitle" : "string",
      "handler" : "string",
      "icon" : "string",
      "leftTitle" : "string",
      "title" : "string",
      "type" : 0,
      "typeValue" : 0,
      "url" : "string"
    } ],
    "fileMax" : 0,
    "fileNumMax" : 0,
    "files" : [ {
      "fid" : 0,
      "filePath" : "string"
    } ],
    "healthTip" : "string",
    "hetongTip" : "string",
    "hetong_msg" : "string",
    "hk_exp" : 0,
    "hk_pass" : 0,
    "hk_tip" : "string",
    "insurance" : {
      "cancelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "desc" : "string",
      "tip" : "string",
      "tip_url" : "string",
      "title" : "string",
      "title_tip" : "string",
      "travelList" : {
        "list" : [ {
          "insurance_id" : 0,
          "name" : "string",
          "price" : 0.0,
          "select" : 0,
          "show" : 0,
          "tags" : "string",
          "url" : "string"
        } ],
        "multi" : 0,
        "shownum" : 0,
        "title" : "string"
      },
      "url" : "string"
    },
    "isNeedConfirm" : 0,
    "isNeedContract" : 0,
    "is_free" : 0,
    "is_mail" : 0,
    "jihe_msg" : "string",
    "jihe_tip" : "string",
    "jihe_title" : "string",
    "jihedian" : [ {
      "city" : "string",
      "label" : "string",
      "lat" : 0.0,
      "lid" : 0,
      "lng" : 0.0,
      "location" : "string",
      "name" : "string",
      "remark" : "string",
      "timearea" : "string"
    } ],
    "limited" : [ "string" ],
    "limitedLs" : [ "string" ],
    "membersList" : [ {
      "bindCard" : 0,
      "birth" : "string",
      "birthStr" : "string",
      "cardName" : "string",
      "cardUserId" : 0,
      "cardexp" : 0,
      "cardno" : "string",
      "cardnoHideAfter" : "string",
      "city" : "string",
      "contact" : 0,
      "mid" : 0,
      "name" : "string",
      "passport_cid" : 0,
      "phone" : "string",
      "sex" : "string",
      "type" : "string"
    } ],
    "needOrderattach" : 0,
    "need_psg" : 0,
    "nights" : 0,
    "no_passport" : 0,
    "num" : 0,
    "office_fee" : 0.0,
    "oid" : 0,
    "orderRefund" : {
      "desc" : "string",
      "title" : "string",
      "url" : "string"
    },
    "orderRemark" : "string",
    "orderRemarkTip" : "string",
    "orderTip" : "string",
    "orderattachRemark" : "string",
    "passport_exp" : 0,
    "passport_tip" : "string",
    "pid" : 0,
    "pkg" : {
      "pkg_name" : "string",
      "pkgid" : 0
    },
    "prepay" : {
      "leftTip" : "string",
      "rightTip" : "string"
    },
    "prodcut_free" : 0,
    "product_cate_type" : [ "string" ],
    "product_name" : "string",
    "product_sub_name" : "string",
    "refundTip" : "string",
    "remark" : "string",
    "requireOrderRemark" : 0,
    "requireOrderattach" : 0,
    "sale_info" : {
      "card" : {
        "amount" : 0.0,
        "cardName" : "string",
        "url" : "string"
      },
      "change_label" : "string",
      "coupon" : {
        "amount" : 0.0,
        "codeid" : 0
      },
      "couponShow" : 0,
      "couponStatus" : 0,
      "couponStatuslabel" : "string",
      "discount" : {
        "amount" : 0.0,
        "desc" : "string",
        "discountId" : 0,
        "discountSn" : 0,
        "num" : 0
      },
      "earlybird" : {
        "amount" : 0.0,
        "earlybirdId" : 0,
        "earlybirdSn" : 0,
        "remark" : "string",
        "title" : "string"
      },
      "sale" : {
        "amount" : 0.0,
        "appSpecial" : 0,
        "desc" : "string",
        "firstSpecial" : 0,
        "remark" : [ "string" ],
        "saleId" : 0,
        "saleSn" : 0,
        "unusable" : 0
      },
      "type" : 0,
      "voucherBean" : {
        "voucherAmount" : 0.0,
        "voucherIncreaseAmount" : 0.0
      }
    },
    "starttime" : "string",
    "starttime_mini" : "string",
    "sub_name" : "string",
    "tips_children" : "string",
    "total_fee" : "string",
    "type" : 0,
    "yxbTip" : {
      "amountTip" : "string",
      "percentTip" : "string",
      "tip" : "string",
      "title" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="1a93ab6bf4052e12cb4f0348fb6c7fe9"></a>
### 产品订单管理v2
Book Controller V 2


<a name="orderbookusingget"></a>
#### 订单预订-选择日期V2
```
GET /app/v2/book/batches
```


##### 说明
订单预订-选择日期V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.v2.BookControllerV2.orderBook(com.youxiake.model.master.order.vo.request.OrderBookV2RQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**monthFmt**  <br>*可选*|月份，当请求月份时只会返回批次列表数据|string|
|**Query**|**pid**  <br>*必填*|产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductCalendarBatchV2VO»](#a3e27cb4fa350b0400a87fcf82422b55)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/book/batches
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "monthFmt" : "string",
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "batchList" : [ {
      "adultPrice" : 0.0,
      "adultPriceLabel" : "string",
      "adultSaleTagList" : [ "string" ],
      "batchId" : 0,
      "batchPkgId" : 0,
      "childPrice" : 0.0,
      "childPriceLabel" : "string",
      "childSaleTagList" : [ "string" ],
      "dailyPkgId" : 0,
      "dateFmt" : "string",
      "keyList" : [ "string" ],
      "prepayTip" : "string",
      "price" : 0.0,
      "priceLabel" : "string",
      "saleAdultprice" : "string",
      "saleChildprice" : "string",
      "selected" : 0,
      "status" : 0,
      "statusLabel" : "string",
      "statusTip" : "string",
      "topLeftTip" : "string",
      "topLeftType" : 0
    } ],
    "batchMonthListMap" : {
      "string" : [ "[productbatchmonthbean](#productbatchmonthbean)" ]
    },
    "batchPkgList" : [ {
      "batchPkgId" : 0,
      "batchPkgName" : "string",
      "dailyPkgId" : 0,
      "dateList" : [ "string" ],
      "selected" : 0
    } ],
    "curBatchMonthList" : [ {
      "dateFmt" : "string",
      "monthLabel" : "string",
      "price" : 0.0,
      "priceLabel" : "string",
      "selected" : 0,
      "topLeftTip" : "string"
    } ],
    "dailyPkgList" : [ {
      "dailyPkgId" : 0,
      "dailyPkgName" : "string",
      "dateList" : [ "string" ],
      "selected" : 0,
      "voucherLabel" : "string"
    } ],
    "discountTip" : "string",
    "holidayMap" : {
      "string" : "[holidaybean](#holidaybean)"
    }
  },
  "msg" : "string"
}
```


<a name="cancelv2usingpost"></a>
#### 订单取消v2
```
POST /app/v2/orders/cancel
```


##### 说明
订单取消v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.v2.OrdersControllerV2.cancelv2(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**cancelId**  <br>*可选*|订单id|string|`"0"`|
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/orders/cancel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "cancelId" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="shareinfousingget"></a>
#### 订单共享页面信息v2
```
GET /app/v2/orders/share/info
```


##### 说明
订单共享页面信息v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.v2.OrdersControllerV2.shareInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderShareInfoVO»](#a94b9b00ac875562f5ecf39216482ef5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/orders/share/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "incompleteItemVOList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "num" : 0,
    "oid" : 0,
    "phoneList" : [ "string" ],
    "shareInfoItemList" : [ {
      "cardFlag" : 0,
      "isEdit" : 0,
      "name" : "string",
      "phone" : "string",
      "statusLabel" : "string"
    } ],
    "topTip" : "string"
  },
  "msg" : "string"
}
```


<a name="c34796748ab2f881b3be5f3d4a2c2e7e"></a>
### 代金券管理
Coupon Controller


<a name="couponacquisitionusingpost"></a>
#### 领券
```
POST /app/coupon/acquisition
```


##### 说明
领券<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.couponAcquisition(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**coupon_id**  <br>*必填*|领券码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/acquisition
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "coupon_id" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="couponbindusingpost"></a>
#### 代金券兑换
```
POST /app/coupon/bind
```


##### 说明
代金券兑换<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.couponBind(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**code**  <br>*必填*|兑换码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/bind
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "code" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="coupondetailusingget"></a>
#### 代金券详情
```
GET /app/coupon/detail
```


##### 说明
代金券详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.couponDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**codeid**  <br>*必填*|用户代金券id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CouponsLinesListVO»](#797a5b8f20c319e465c19d199344f2fb)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "codeid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "category" : 0,
    "categoryColor" : "string",
    "categoryName" : "string",
    "channel" : 0,
    "channel_label" : "string",
    "cid" : 0,
    "class_region_id" : 0,
    "codeid" : 0,
    "exp" : 0,
    "expLabelColor" : "string",
    "exp_label" : "string",
    "map" : 0,
    "map_label" : "string",
    "min_amount" : 0.0,
    "oid" : 0,
    "productList" : [ {
      "cheapType" : 0,
      "days" : "string",
      "image" : "string",
      "liangdian" : [ "string" ],
      "marketingTag" : "string",
      "numLabel" : "string",
      "pid" : 0,
      "placeLabel" : "string",
      "priceLabel" : "string",
      "productType" : "string",
      "saleOne" : {
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      },
      "saleOtherList" : [ {
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "salePriceLabel" : "string",
      "statisticsCode" : "string",
      "subTitle" : "string",
      "tagList" : [ "string" ],
      "title" : "string",
      "typetwoOrCat" : "string"
    } ],
    "productListTopTip" : "string",
    "products" : [ {
      "adultprice" : 0.0,
      "class_theme_id" : 0,
      "days_label" : "string",
      "liangdian" : [ "string" ],
      "pid" : 0,
      "place_label" : "string",
      "price_label" : "string",
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "shortTitle" : "string",
      "statisticsCode" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "type" : 0
    } ],
    "remark" : "string",
    "sitecode" : 0,
    "status" : 0,
    "tip_label" : "string",
    "title" : "string",
    "type" : 0,
    "type_label" : "string",
    "unusableReason" : "string"
  },
  "msg" : "string"
}
```


<a name="getdiscountusingget_1"></a>
#### 签证-获取优惠券信息
```
GET /app/coupon/get
```


##### 说明
签证-获取优惠券信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getDiscount(com.youxiake.model.master.visa.vo.request.VisaCouponRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|签证套餐id|integer (int32)|
|**Query**|**num**  <br>*可选*|签证人数数量|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|总价格|number (double)|
|**Query**|**pid**  <br>*可选*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderCouponVO»](#5596891877c8a0e87a1e2e77d9fb7cf4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/get
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "num" : 0,
  "order_amount" : 0.0,
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "codeid" : 0
  },
  "msg" : "string"
}
```


<a name="getdiscountlistusingget"></a>
#### 签证-获取优惠券信息列表
```
GET /app/coupon/list
```


##### 说明
签证-获取优惠券信息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getDiscountList(com.youxiake.model.master.visa.vo.request.VisaCouponListRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|签证套餐id|integer (int32)|
|**Query**|**codeid**  <br>*可选*|分页|integer (int32)|
|**Query**|**num**  <br>*可选*|签证人数数量|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|总价格|number|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pid**  <br>*可选*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsListVO»»»](#e7dd2a33152c9aaad5ba7d09fcce40ae)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "codeid" : 0,
  "num" : 0,
  "order_amount" : 0.0,
  "page" : 0,
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "products" : [ {
        "minpric" : "string",
        "pid" : 0,
        "price_label" : "string",
        "pro_pic" : "string",
        "product_name" : "string",
        "thumb" : "string"
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getusercouponslistusingget"></a>
#### 用户代金券列表
```
GET /app/coupon/list/all
```


##### 说明
用户代金券列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getUserCouponsList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»](#ec4a56bf083eec985000c11b8463cbbf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/list/all
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getusercouponsdisabledlistusingget"></a>
#### 用户代金券列表-失效
```
GET /app/coupon/list/disabled
```


##### 说明
用户代金券列表-失效<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getUserCouponsDisabledList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**category**  <br>*可选*|类型 0：全部；1：线路；2：签证；|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»](#ec4a56bf083eec985000c11b8463cbbf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/list/disabled
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "category" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getusercouponsusablelistusingget"></a>
#### 用户代金券列表-可用
```
GET /app/coupon/list/usable
```


##### 说明
用户代金券列表-可用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getUserCouponsUsableList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**category**  <br>*可选*|类型 0：全部；1：线路；2：签证；|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»](#ec4a56bf083eec985000c11b8463cbbf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/list/usable
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "category" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getvisabycodeidusingget"></a>
#### 签证-代金券使用的相关签证产品
```
GET /app/coupon/product
```


##### 说明
签证-代金券使用的相关签证产品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getVisaBycodeid(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**codeid**  <br>*必填*|codeid|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CouponsListVO»](#09d5cfd503fd13c1ac96dbf157ff4988)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/product
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "codeid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : 0.0,
    "category" : 0,
    "categoryColor" : "string",
    "categoryName" : "string",
    "channel" : 0,
    "channel_label" : "string",
    "cid" : 0,
    "class_region_id" : 0,
    "codeid" : 0,
    "exp" : 0,
    "exp_label" : "string",
    "map" : 0,
    "map_label" : "string",
    "min_amount" : 0.0,
    "oid" : 0,
    "products" : [ {
      "minpric" : "string",
      "pid" : 0,
      "price_label" : "string",
      "pro_pic" : "string",
      "product_name" : "string",
      "thumb" : "string"
    } ],
    "remark" : "string",
    "sitecode" : 0,
    "status" : 0,
    "tip_label" : "string",
    "title" : "string",
    "type" : 0,
    "type_label" : "string",
    "unusableReason" : "string"
  },
  "msg" : "string"
}
```


<a name="couponproductlistusingpost"></a>
#### 代金券可用产品列表
```
POST /app/coupon/product/list
```


##### 说明
代金券可用产品列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.couponProductList(com.youxiake.microservice.entity.http.user.request.coupon.CouponProductListRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**request**  <br>*必填*|request|[CouponProductListRQ](#couponproductlistrq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerInfoListWrap«CouponProductInfoVO,List«CouponProductVO»»»](#12dc45fb3cbb62f3ca901847360f615e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/product/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "codeid" : 0,
  "couponId" : 0,
  "day" : "string",
  "order" : 0,
  "page" : 0,
  "sitecode" : 0,
  "type" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "info" : {
      "category" : 0,
      "classTypeList" : [ {
        "label" : "string",
        "value" : "string"
      } ],
      "dayList" : [ {
        "label" : "string",
        "value" : "string"
      } ],
      "exp" : 0,
      "isShowScreen" : 0,
      "minAmount" : 0.0,
      "orderList" : [ {
        "label" : "string",
        "value" : "string"
      } ],
      "systemTime" : 0
    },
    "infoName" : "string",
    "list" : [ {
      "cheapType" : 0,
      "days" : "string",
      "image" : "string",
      "liangdian" : [ "string" ],
      "marketingTag" : "string",
      "numLabel" : "string",
      "pid" : 0,
      "placeLabel" : "string",
      "priceLabel" : "string",
      "productType" : "string",
      "saleOne" : {
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      },
      "saleOtherList" : [ {
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "salePriceLabel" : "string",
      "statisticsCode" : "string",
      "subTitle" : "string",
      "tagList" : [ "string" ],
      "title" : "string",
      "typetwoOrCat" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="couponshareusingget"></a>
#### 裂变券-app分享
```
GET /app/coupon/share
```


##### 说明
裂变券-app分享<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.couponShare(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*必填*|裂变券id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CouponShareVO»](#ab4579c07e57133427a95651976b9e8d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "fissionList" : [ {
      "amount" : 0.0,
      "endTime" : "string",
      "fissionStatus" : 0,
      "helpCount" : 0,
      "id" : 0,
      "minAmount" : 0.0,
      "newRegister" : 0,
      "title" : "string",
      "userNumber" : 0
    } ],
    "imgUrl" : "string",
    "miniAppId" : "string",
    "miniUrl" : "string",
    "title" : "string"
  },
  "msg" : "string"
}
```


<a name="getundiscountlistusingget"></a>
#### 签证-获取不可用优惠券信息列表
```
GET /app/coupon/unlist
```


##### 说明
签证-获取不可用优惠券信息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.coupon.CouponController.getUnDiscountList(com.youxiake.model.master.visa.vo.request.VisaCouponListRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|签证套餐id|integer (int32)|
|**Query**|**codeid**  <br>*可选*|分页|integer (int32)|
|**Query**|**num**  <br>*可选*|签证人数数量|integer (int32)|
|**Query**|**order_amount**  <br>*可选*|总价格|number|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pid**  <br>*可选*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«CouponsListVO»»»](#e7dd2a33152c9aaad5ba7d09fcce40ae)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/coupon/unlist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "codeid" : 0,
  "num" : 0,
  "order_amount" : 0.0,
  "page" : 0,
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "products" : [ {
        "minpric" : "string",
        "pid" : 0,
        "price_label" : "string",
        "pro_pic" : "string",
        "product_name" : "string",
        "thumb" : "string"
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="a8dfeff52003896f1705feab772994f5"></a>
### 会员信息服务
Member Controller


<a name="membersaveusingpost"></a>
#### 办签人列表-添加办签人护照
```
POST /app/members/add
```


##### 说明
添加办签人护照<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.member.MemberController.memberSave(com.youxiake.model.master.visa.vo.request.RqMemberVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**birth**  <br>*可选*|出生年月日|integer (int64)|
|**Query**|**cardexp**  <br>*可选*|护照有效期|integer (int64)|
|**Query**|**cardno**  <br>*可选*|护照号码|string|
|**Query**|**mid**  <br>*可选*|编号 新增时为空|integer (int32)|
|**Query**|**name**  <br>*可选*|姓名|string|
|**Query**|**passportCid**  <br>*可选*|护照签发地|integer (int32)|
|**Query**|**sex**  <br>*可选*|性别 1、男，2、女|integer (int32)|
|**Query**|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[MemberVO](#membervo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/members/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "birth" : 0,
  "cardexp" : 0,
  "cardno" : "string",
  "mid" : 0,
  "name" : "string",
  "passportCid" : 0,
  "sex" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "birth" : "string",
  "cardexp" : "string",
  "cardno" : "string",
  "mid" : 0,
  "name" : "string",
  "passportCid" : 0,
  "sex" : 0,
  "type" : 0
}
```


<a name="memberdelusingpost"></a>
#### 办签人列表-删除办签人护照
```
POST /app/members/del
```


##### 说明
删除办签人护照<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.member.MemberController.memberDel(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mid**  <br>*必填*|办签人编号|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[RpMemberVO](#rpmembervo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/members/del
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mid" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "isSuccess" : 0,
  "message" : "string"
}
```


<a name="membereditusingpost"></a>
#### 办签人列表-编辑办签人护照
```
POST /app/members/edit
```


##### 说明
编辑办签人护照<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.member.MemberController.memberEdit(com.youxiake.model.master.visa.vo.request.RqMemberVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**birth**  <br>*可选*|出生年月日|integer (int64)|
|**Query**|**cardexp**  <br>*可选*|护照有效期|integer (int64)|
|**Query**|**cardno**  <br>*可选*|护照号码|string|
|**Query**|**mid**  <br>*可选*|编号 新增时为空|integer (int32)|
|**Query**|**name**  <br>*可选*|姓名|string|
|**Query**|**passportCid**  <br>*可选*|护照签发地|integer (int32)|
|**Query**|**sex**  <br>*可选*|性别 1、男，2、女|integer (int32)|
|**Query**|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[MemberVO](#membervo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/members/edit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "birth" : 0,
  "cardexp" : 0,
  "cardno" : "string",
  "mid" : 0,
  "name" : "string",
  "passportCid" : 0,
  "sex" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "birth" : "string",
  "cardexp" : "string",
  "cardno" : "string",
  "mid" : 0,
  "name" : "string",
  "passportCid" : 0,
  "sex" : 0,
  "type" : 0
}
```


<a name="memberslistusingget"></a>
#### 办签人列表
```
GET /app/members/list
```


##### 说明
办签人列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.member.MemberController.membersList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«MembersExtPO»»»](#c04e9d2b7ee475f7d267cca1ea5f7b23)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/members/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "addtime" : 0,
      "area_name" : "string",
      "bindCardStatus" : 0,
      "birth" : 0,
      "birthday" : 0,
      "birthmonth" : 0,
      "birthyear" : 0,
      "cardName" : "string",
      "cardexp" : 0,
      "cardno" : "string",
      "cardtype" : 0,
      "firstAddtime" : 0,
      "firstCreated" : "string",
      "id" : 0,
      "isDel" : 0,
      "isSave" : 0,
      "mid" : 0,
      "name" : "string",
      "passportCid" : 0,
      "passport_cid" : 0,
      "phone" : "string",
      "sex" : "string",
      "type" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="fe9f4d7e73152bdf13e048585c428580"></a>
### 位置信息
Location Controller


<a name="locationv2usingget"></a>
#### 定位信息
```
GET /app/location
```


##### 说明
定位信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.location.LocationController.locationV2(java.lang.Integer,double,double)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**lat**  <br>*可选*|经度|number (double)|
|**Query**|**lng**  <br>*可选*|维度|number (double)|
|**Query**|**selcode**  <br>*可选*|用户选择的定位城市|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AppLocationVOV2»](#8c7d77039420ccebd1bc9ab6820bedb8)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/location
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lat" : 0.0,
  "lng" : 0.0,
  "selcode" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "cityTip" : "string",
    "ipCity" : {
      "city" : "string",
      "country" : "string",
      "province" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="205bf964e7164dd3b5030fa0bd79d9a0"></a>
### 侠魁
Travelarticle Week Top Controller


<a name="weektopusingget"></a>
#### 侠魁榜
```
GET /app/travelWeekTop/weekTop
```


##### 说明
侠魁榜<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleWeekTopController.weekTop(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**time**  <br>*可选*|时间（例如201807或者2018年份）|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TopVO»](#3f7cc6c276e531650e4dae58b42e08ee)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelWeekTop/weekTop
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "time" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "handler" : "string",
    "hint" : "string",
    "hintTid" : 0,
    "shareDescription" : "string",
    "shareImageUrl" : "string",
    "shareRedirectUrl" : "string",
    "shareTitle" : "string",
    "times" : [ {
      "month" : [ "string" ],
      "year" : "string"
    } ],
    "weekTopVos" : [ {
      "imageUrl" : "string",
      "price" : "string",
      "tid" : 0,
      "title" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="weektopcalenderusingget"></a>
#### 侠魁日历
```
GET /app/travelWeekTop/weekTopCalender
```


##### 说明
侠魁日历<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleWeekTopController.weekTopCalender(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|当前页|string|
|**Query**|**year**  <br>*可选*|显示的年份|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«WeekTopCalenderVO»»»](#c1703258849e7a5b1efd30f1b090caaf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelWeekTop/weekTopCalender
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "year" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "calender" : [ {
        "imageUrl" : "string",
        "index" : "string",
        "tid" : 0
      } ],
      "month" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="630b790be6a2e2d74163b470533b8702"></a>
### 共用接口
Common Controller


<a name="commonrewardusingget"></a>
#### 通用奖励 例如 search_travel_product(去首页搜索1条你喜欢的线路) 
```
GET /app/commonReward
```


##### 说明
通用奖励 例如 首页搜索到任意一个结果页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.commonReward(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**type**  <br>*可选*|分享类型 search_travel_product(去首页搜索1条你喜欢的线路)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/commonReward
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getfilterwordusingpost"></a>
#### 获取内容敏感词和过滤词
```
POST /app/content/filterWord/get
```


##### 说明
获取内容敏感词和过滤词<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.getFilterWord(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*可选*|content|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ContentFilterVO»](#dd474b544e41675fa44db79db55271c2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/content/filterWord/get
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "filterInfos" : [ {
      "type" : 0,
      "words" : [ "string" ]
    } ],
    "tip" : "string"
  },
  "msg" : "string"
}
```


<a name="getfilterwordusingget"></a>
#### 获取内容敏感词和过滤词
```
GET /app/content/filterWord/get
```


##### 说明
获取内容敏感词和过滤词<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.getFilterWord(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*可选*|content|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ContentFilterVO»](#dd474b544e41675fa44db79db55271c2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/content/filterWord/get
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "filterInfos" : [ {
      "type" : 0,
      "words" : [ "string" ]
    } ],
    "tip" : "string"
  },
  "msg" : "string"
}
```


<a name="quitcontentdetailusingpost"></a>
#### 退出详情页
```
POST /app/detail/quit
```


##### 说明
退出详情页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.quitContentDetail(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*可选*|id|string|`"0"`|
|**Query**|**shared**  <br>*可选*|1为分享过|integer (int32)|`0`|
|**Query**|**type**  <br>*可选*|mdd_detail(目的地详情), discover_topic(遇见话题合集), travel_detail(游记详情), news_detail(攻略详情),album_detail(摄影详情), film_detail(视频详情), product_detail(线路详情), visa_detail(签证详情)document_detail(专题详情)|string||
|**Query**|**viewTime**  <br>*可选*|浏览时间|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/detail/quit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "shared" : 0,
  "type" : "string",
  "viewTime" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="linkopenusingpost"></a>
#### 解析链接获得协议
```
POST /app/link/open
```


##### 说明
解析链接获得协议<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.linkOpen(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**link**  <br>*必填*|link|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LinkOpenVo»](#74ba9f3cc4ea8efa56e25601fae0d07d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/link/open
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "link" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "handler" : "string",
    "otherParameters" : {
      "string" : "string"
    },
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="notinterestedusingpost"></a>
#### 添加不感兴趣记录
```
POST /app/not-interested
```


##### 说明
添加不感兴趣记录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.notInterested(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**targetId**  <br>*必填*|不感兴趣的对象id|integer (int32)|
|**Query**|**type**  <br>*必填*|对象类型 1：遇见，2：态度观点，3摄影|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/not-interested
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "targetId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="saveuploadlogusingpost"></a>
#### 七牛图片日志上传保存
```
POST /app/qiniu/upload/log
```


##### 说明
七牛图片日志上传保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.saveUploadLog(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**log**  <br>*必填*|日志数组转json  格式:[{url:图片地址, qnResponseInfo:xxxx}]|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/qiniu/upload/log
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "log" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="reportusingpost"></a>
#### 举报接口
```
POST /app/report
```


##### 说明
举报接口<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.report(java.lang.String,java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**moduleType**  <br>*必填*|举报的模块:   <br>'youji':游记, <br>'photography':摄影作品,<br>'discover':遇见,<br>'discover_comment':遇见评论<br>'view_point':观点<br>'view_point_comment':观点评论<br>'photography_comment':摄影作品评论，<br>‘ask’:问答问题，<br>'ask_answer':问答回答|string|
|**Query**|**reason**  <br>*必填*|举报内容|string|
|**Query**|**remark**  <br>*可选*|补充内容|string|
|**Query**|**targetId**  <br>*必填*|举报的对象id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "moduleType" : "string",
  "reason" : "string",
  "remark" : "string",
  "targetId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getcreditsandgoldsusingpost"></a>
#### 分享成功通用接口
```
POST /app/share/success
```


##### 说明
分享成功通用接口<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.getCreditsAndGolds(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*可选*|id|string|`"0"`|
|**Query**|**type**  <br>*可选*|(find_detail,遇见),    (bbs_detail,游记),    (travel_wx,游记分享到微信),    (news_wx,攻略分享到微信),    (mdd_detail,目的地),    (product,产品),    (film,视频),    (album_detail,摄影作品),|string|`"find_detail"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/share/success
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getsysconfigusingget"></a>
#### 系统配置接口
```
GET /app/sys/config
```


##### 说明
系统配置接口<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.getSysConfig(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**key**  <br>*必填*|配置键|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«string»](#88ce995f16678bc660cc2af146abdb26)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/sys/config
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "key" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "string",
  "msg" : "string"
}
```


<a name="getuploadtokenusingget"></a>
#### 获取上传token
```
GET /app/upload/token
```


##### 说明
获取上传token<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.common.CommonController.getUploadToken(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bucket**  <br>*可选*|存储槽位置bucket（special,yxk-net都是bucket）  1、special -> qimg4.youxiake.com2、yxk-net -> img4.youxiake.com  3、youxiakeapp -> qimg5.youxiake.com  4、img-youxiake-com -> img.youxiake.com5、guideapp -> qimg3.youxiake.com  6、yxkavatar -> img2.youxiake.com  7、yxk-bbs -> img3.youxiake.com 8、yxk-user-private -> img6.youxiake.com 9、yxk-temp-test -> r2e8ogiiu.hn-bkt.clouddn.com  10、yxk-temp -> temp.youxiake.com|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«QiniuPrivateVo»](#02b0beca1ed87e13b590ba392aa2bb47)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/upload/token
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bucket" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "domain" : "string",
    "path" : "string",
    "token" : "string"
  },
  "msg" : "string"
}
```


<a name="f491839962ed737561606d29e41fde4a"></a>
### 医疗急救卡
Members First Aid Card Controller


<a name="705f2b720850437774438cb85f59f46a"></a>
#### 获取医疗急救卡
```
GET /app/first/aid/one
```


##### 说明
获取医疗急救卡<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MembersFirstAidCardController.getMemberFirstAidCard(java.lang.Long,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**firstAidCardId**  <br>*可选*|医疗急救卡id|string|
|**Query**|**memberId**  <br>*可选*|出行人id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MemberFirstAidCardVO»](#405d871c8b95dff441f6c3c423dc846e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/first/aid/one
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "firstAidCardId" : "string",
  "memberId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "bloodList" : [ {
      "label" : "string",
      "value" : "string"
    } ],
    "memberFirstAidCard" : {
      "allergyHistory" : "string",
      "blood" : "string",
      "firstAidCardId" : 0,
      "height" : 0,
      "linkname" : "string",
      "medicalHistory" : "string",
      "memberId" : 0,
      "phone" : "string",
      "relation" : 0,
      "weight" : 0
    },
    "orderMember" : {
      "cardName" : "string",
      "cardno" : "string",
      "firstAidCardId" : 0,
      "memberCardStatus" : 0,
      "mid" : 0,
      "name" : "string",
      "sex" : "string",
      "type" : "string"
    },
    "relationList" : [ {
      "label" : "string",
      "value" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="ab989507692a159550010af22fedbdc3"></a>
#### 获取订单出行人列表
```
GET /app/first/aid/order/member/list
```


##### 说明
获取订单出行人列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MembersFirstAidCardController.orderMemberList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderMemberVO»](#687973f6fa47c82445ca6a4c576b9279)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/first/aid/order/member/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "orderMemberList" : [ {
      "cardName" : "string",
      "cardno" : "string",
      "firstAidCardId" : 0,
      "memberCardStatus" : 0,
      "mid" : 0,
      "name" : "string",
      "sex" : "string",
      "type" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="491b08277ab366b312ef9b210c1a24fe"></a>
#### 保存出行人医疗急救卡
```
POST /app/first/aid/save
```


##### 说明
保存出行人医疗急救卡<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MembersFirstAidCardController.saveMemberFirstAidCard(com.youxiake.microservice.entity.http.order.request.MemberFirstAidCardSaveRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**request**  <br>*必填*|request|[MemberFirstAidCardSaveRQ_1](#memberfirstaidcardsaverq_1)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MemberFirstAidCardSaveRQ»](#c4903219c3d4b945fc1b6aca420160f9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/first/aid/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "allergyHistory" : "string",
  "blood" : "string",
  "firstAidCardId" : 0,
  "height" : "string",
  "linkname" : "string",
  "medicalHistory" : "string",
  "memberId" : 0,
  "phone" : "string",
  "relation" : 0,
  "weight" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "allergyHistory" : "string",
    "blood" : "string",
    "firstAidCardId" : 0,
    "height" : "string",
    "linkname" : "string",
    "medicalHistory" : "string",
    "memberId" : 0,
    "notEmpty" : true,
    "phone" : "string",
    "relation" : 0,
    "weight" : "string"
  },
  "msg" : "string"
}
```


<a name="3b9ac6b4f4938259188a1278858eda48"></a>
### 发票管理
Invoice Controller


<a name="orderdetailusingget"></a>
#### 发票进度
```
GET /app/invoce/detail
```


##### 说明
发票进度<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.orderDetail(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*必填*|发票id|integer (int32)||
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)||
|**Query**|**type**  <br>*可选*|type：1为线路发票 2为签证发票 4为权益卡|integer (int32)|`2`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderInvoiceDetailVO»](#6e119281cecf6033a4b210131df22295)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoce/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0,
  "oid" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "iaddress" : "string",
    "iemail" : "string",
    "iexpno" : "string",
    "iexpress" : "string",
    "iexptype" : 0,
    "iexptype2" : 0,
    "istatus" : 0,
    "phone" : "string",
    "time" : "string",
    "tips" : "string"
  },
  "msg" : "string"
}
```


<a name="getinvoiceusingget"></a>
#### 索取发票输入页信息
```
GET /app/invoce/get
```


##### 说明
索取发票输入页信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.getInvoice(java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)||
|**Query**|**parameterJsonStr**  <br>*可选*|开票额外参数json字符串|string||
|**Query**|**type**  <br>*可选*|type：1为线路发票 2为签证发票 4为权益卡 6为房券|integer (int32)|`2`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderInvoiceInfoVO»](#23f42eb5e079ff856b51375e384a291a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoce/get
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0,
  "parameterJsonStr" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "amount" : 0.0,
    "batch_time" : "string",
    "bottomTip" : "string",
    "exp_type" : [ "object" ],
    "invoiceTypeList" : [ 0 ],
    "invoice_type" : [ "object" ],
    "oid" : 0,
    "product_name" : "string",
    "shop_url" : "string",
    "vat" : 0,
    "vat_tip" : "string"
  },
  "msg" : "string"
}
```


<a name="ordersaveusingpost"></a>
#### 索取发票保存
```
POST /app/invoce/save
```


##### 说明
索取发票保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.orderSave(com.youxiake.model.master.common.vo.request.InvoiceRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**iaddress**  <br>*可选*|收件地址|string|
|**Query**|**iamount**  <br>*可选*|开票金额|number|
|**Query**|**iemail**  <br>*可选*|接收邮箱|string|
|**Query**|**iexptype**  <br>*可选*|快递方式  1:挂号信  2:快递  3:自取|integer (int32)|
|**Query**|**iname**  <br>*可选*|收件人名称|string|
|**Query**|**info_id**  <br>*可选*|info_id|integer (int32)|
|**Query**|**iremark**  <br>*可选*|用户备注|string|
|**Query**|**itel**  <br>*可选*|收件人电话|string|
|**Query**|**itype**  <br>*可选*|发票类型    1、旅游费2、团费3、考察费4、旅游综合费5、疗休养费6、观光费|integer (int32)|
|**Query**|**izipcode**  <br>*可选*|邮政编码|string|
|**Query**|**oid**  <br>*可选*|oid|integer (int32)|
|**Query**|**parameterJsonStr**  <br>*可选*|开票额外参数json字符串|string|
|**Query**|**type**  <br>*可选*|type：1为线路发票 2为签证发票 4权益卡发票  6房券发票|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoce/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "iaddress" : "string",
  "iamount" : 0.0,
  "iemail" : "string",
  "iexptype" : 0,
  "iname" : "string",
  "info_id" : 0,
  "iremark" : "string",
  "itel" : "string",
  "itype" : 0,
  "izipcode" : "string",
  "oid" : 0,
  "parameterJsonStr" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="invoiceinfoaddusingget"></a>
#### 开票输入页信息
```
GET /app/invoice/info/add
```


##### 说明
开票输入页信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.invoiceInfoAdd()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«InvoiceInfoAddVo»](#e7733121e4348970787c1e7e0380f7c8)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoice/info/add
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "invoice_type" : [ {
      "label" : "string",
      "value" : 0
    } ],
    "issue_type" : [ {
      "label" : "string",
      "value" : 0
    } ],
    "tips" : "string"
  },
  "msg" : "string"
}
```


<a name="invoiceinfolistusingget"></a>
#### 开票信息列表
```
GET /app/invoice/info/list
```


##### 说明
开票信息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.invoiceInfoList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«InvoiceInfoListItemVo»»»](#7c9651dce4e2460451eb76fe3b1be4b8)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoice/info/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "baccount" : "string",
      "bname" : "string",
      "id" : 0,
      "invoice_label" : "string",
      "invoice_type" : 0,
      "issue_label" : "string",
      "issue_type" : 0,
      "ititle" : "string",
      "raddress" : "string",
      "rphone" : "string",
      "tax_num" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="invoiceinfodeleteusingpost"></a>
#### 删除开票信息
```
POST /app/invoice/info/remove
```


##### 说明
删除开票信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.invoiceInfoDelete(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*必填*|开票信息id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoice/info/remove
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="invoiceinfosaveusingpost"></a>
#### 开票信息新增或修改
```
POST /app/invoice/info/save
```


##### 说明
开票信息新增或修改<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.invoice.InvoiceController.invoiceInfoSave(com.youxiake.model.master.common.vo.response.InvoiceInfoSaveVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**baccount**  <br>*可选*|开户账号|string|
|**Query**|**bname**  <br>*可选*|开户银行名称|string|
|**Query**|**id**  <br>*可选*|id|integer (int32)|
|**Query**|**invoice_type**  <br>*可选*|发票类型|integer (int32)|
|**Query**|**issue_type**  <br>*可选*|开具类型|integer (int32)|
|**Query**|**ititle**  <br>*可选*|发票抬头|string|
|**Query**|**raddress**  <br>*可选*|注册场地地址|string|
|**Query**|**rphone**  <br>*可选*|注册固定电话|string|
|**Query**|**tax_num**  <br>*可选*|税务登记证号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/invoice/info/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "baccount" : "string",
  "bname" : "string",
  "id" : 0,
  "invoice_type" : 0,
  "issue_type" : 0,
  "ititle" : "string",
  "raddress" : "string",
  "rphone" : "string",
  "tax_num" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="47fbea69d4781e8304be9dbaed41e9cd"></a>
### 守麦专用
Shou Mai Remote Controller


<a name="regbyyoucardusingpost_1"></a>
#### 送660元代金券
```
POST /app/user/send/coupon
```


##### 说明
送660元代金券<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.ShouMaiRemoteController.regByYoucard(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**sign**  <br>*必填*|sign|string|
|**Query**|**uid**  <br>*必填*|uid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/send/coupon
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "sign" : "string",
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usershowcouponusingpost"></a>
#### 新人券信息
```
POST /app/user/show/coupon
```


##### 说明
新人券信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.ShouMaiRemoteController.userShowCoupon(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**sign**  <br>*必填*|sign|string|
|**Query**|**uid**  <br>*必填*|uid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ShowCouponVO»](#d1f420ca01398f4ba0b1085af4b9596c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/show/coupon
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "sign" : "string",
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "isShowCoupon" : 0,
    "overTime" : 0,
    "startTime" : 0
  },
  "msg" : "string"
}
```


<a name="3200fee93a0b11fc592673a61b2dd196"></a>
### 态度PK
Attitude Controller


<a name="addcommentusingpost"></a>
#### 观点评论
```
POST /app/attitude/topic/addComment
```


##### 说明
观点评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.addComment(com.youxiake.model.master.attitude.request.AttitudeViewPointCommenttRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*可选*|评论id,有评论id说明是回复评论|integer (int32)|
|**Query**|**content**  <br>*必填*|评论内容|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverCommentVO»](#29e0810781853dbdbcf732d72c6d897c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/addComment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0,
  "content" : "string",
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "cid" : 0,
    "commentedUserId" : 0,
    "commentedUserName" : "string",
    "content" : "string",
    "createTime" : "string",
    "gmt_create" : 0,
    "grouplist" : [ {
      "certTitle" : "string",
      "certType" : "string"
    } ],
    "hasPrised" : true,
    "isAuthor" : true,
    "isDelete" : true,
    "isTalent" : true,
    "official" : 0,
    "priseNum" : 0,
    "replyComments" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "isTalent" : true,
      "official" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "replyId" : 0,
    "type" : 0,
    "uid" : 0,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="changequalityusingpost"></a>
#### 设置观点为经典观点
```
POST /app/attitude/topic/changeClassic
```


##### 说明
设置观点为经典观点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.changeQuality(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/changeClassic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="changewonderfulusingpost"></a>
#### 设置观点为精彩观点
```
POST /app/attitude/topic/changeWonderful
```


##### 说明
设置观点为精彩观点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.changeWonderful(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/changeWonderful
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="chooseoptionusingpost"></a>
#### 态度选项投票
```
POST /app/attitude/topic/chooseOption
```


##### 说明
态度选项投票<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.chooseOption(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«AttitudeOptionInfoVO»»](#386c44bf73617bdbd00a47e20e392db6)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/chooseOption
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "choose" : true,
      "lastVoteUserAvatar" : "string",
      "optionColor" : 0,
      "optionId" : 0,
      "optionPercent" : "string",
      "optionUserCount" : "string",
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="collectusingpost"></a>
#### 观点收藏
```
POST /app/attitude/topic/collect
```


##### 说明
观点收藏<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.collect(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/collect
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="collectlistusingpost"></a>
#### 观点收藏列表
```
POST /app/attitude/topic/collectList
```


##### 说明
观点收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.collectList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«AttitudeUserCollectVO»»»](#e6f7e97039e08dbfcec81c93d7512b01)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/collectList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "comment" : "string",
      "content" : "string",
      "createTime" : "string",
      "id" : 0,
      "optionColor" : 0,
      "optionContent" : "string",
      "prise" : "string",
      "prised" : true,
      "talent" : 0,
      "topicId" : 0,
      "topicTitle" : "string",
      "topicType" : 0,
      "type" : 0,
      "userAvatar" : "string",
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="deletecommentusingpost"></a>
#### 删除观点评论
```
POST /app/attitude/topic/deleteComment
```


##### 说明
删除观点评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.deleteComment(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*必填*|评论id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/deleteComment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="deleteviewpointusingpost"></a>
#### 删除观点
```
POST /app/attitude/topic/deleteViewPoint
```


##### 说明
删除观点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.deleteViewPoint(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/deleteViewPoint
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="detailusingget"></a>
#### 态度话题详情
```
GET /app/attitude/topic/detail
```


##### 说明
态度话题详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.detail(com.youxiake.model.master.attitude.request.AttitudeTopicDetailRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**optionId**  <br>*可选*|筛选观点id 0或者不传代表全部|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**topicId**  <br>*必填*|态度话题id|integer (int32)|
|**Query**|**type**  <br>*可选*|观点类型 1最新 2热门|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«态度话题详情»](#8b5d3d4023081ccaab4539ac1bbe9a63)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "optionId" : 0,
  "page" : 0,
  "topicId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "activity" : {
      "priseDesc" : "string",
      "rule" : "string"
    },
    "desc" : "string",
    "end" : true,
    "endTime" : 0,
    "hasPrise" : 0,
    "miniShareVO" : {
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string"
    },
    "optionInfo" : [ {
      "choose" : true,
      "lastVoteUserAvatar" : "string",
      "optionColor" : 0,
      "optionId" : 0,
      "optionPercent" : "string",
      "optionUserCount" : "string",
      "title" : "string"
    } ],
    "options" : [ {
      "optionColor" : 0,
      "optionId" : 0,
      "title" : "string"
    } ],
    "publishTip" : "string",
    "publishedContent" : true,
    "showViewpointCarousel" : true,
    "title" : "string",
    "topicId" : 0,
    "totalPage" : 0,
    "type" : 0,
    "userCount" : "string",
    "viewPoints" : [ {
      "auditStatus" : 0,
      "avatar" : "string",
      "comment" : "string",
      "content" : "string",
      "createTime" : "string",
      "createdAt" : 0,
      "favorited" : true,
      "followed" : true,
      "id" : 0,
      "images" : [ {
        "height" : 0,
        "id" : 0,
        "url" : "string",
        "width" : 0
      } ],
      "isReported" : true,
      "notInterested" : true,
      "optionColor" : 0,
      "optionContent" : "string",
      "optionId" : 0,
      "prise" : "string",
      "priseUserAvatar" : [ {
        "avatar" : "string",
        "pid" : 0,
        "uid" : 0
      } ],
      "prised" : true,
      "talent" : 0,
      "topicId" : 0,
      "topicType" : 0,
      "type" : 0,
      "uid" : 0,
      "userGroup" : [ {
        "certTitle" : "string",
        "certType" : 0
      } ],
      "username" : "string"
    } ],
    "viewpointCarousel" : [ {
      "avatar" : "string",
      "viewpointContent" : "string"
    } ],
    "voted" : true
  },
  "msg" : "string"
}
```


<a name="listpersonalviewpointsusingget"></a>
#### 个人主页-我的态度列表
```
GET /app/attitude/topic/home/list
```


##### 说明
个人主页-我的态度列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.listPersonalViewPoints(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|目标页|integer (int32)|
|**Query**|**userId**  <br>*必填*|目标用户id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«AttitudeViewPointSingleVO»»»](#6d6db7e7bf0f0a721c1ab0c9616e20fa)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/home/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "topic" : {
        "activity" : {
          "priseDesc" : "string",
          "rule" : "string"
        },
        "desc" : "string",
        "end" : true,
        "endTime" : 0,
        "hasPrise" : 0,
        "miniShareVO" : {
          "mini_app_cover" : "string",
          "mini_app_id" : "string",
          "mini_app_url" : "string"
        },
        "optionInfo" : [ {
          "choose" : true,
          "lastVoteUserAvatar" : "string",
          "optionColor" : 0,
          "optionId" : 0,
          "optionPercent" : "string",
          "optionUserCount" : "string",
          "title" : "string"
        } ],
        "options" : [ {
          "optionColor" : 0,
          "optionId" : 0,
          "title" : "string"
        } ],
        "publishTip" : "string",
        "publishedContent" : true,
        "showViewpointCarousel" : true,
        "title" : "string",
        "topicId" : 0,
        "totalPage" : 0,
        "type" : 0,
        "userCount" : "string",
        "viewPoints" : [ {
          "auditStatus" : 0,
          "avatar" : "string",
          "comment" : "string",
          "content" : "string",
          "createTime" : "string",
          "createdAt" : 0,
          "favorited" : true,
          "followed" : true,
          "id" : 0,
          "images" : [ {
            "height" : 0,
            "id" : 0,
            "url" : "string",
            "width" : 0
          } ],
          "isReported" : true,
          "notInterested" : true,
          "optionColor" : 0,
          "optionContent" : "string",
          "optionId" : 0,
          "prise" : "string",
          "priseUserAvatar" : [ {
            "avatar" : "string",
            "pid" : 0,
            "uid" : 0
          } ],
          "prised" : true,
          "talent" : 0,
          "topicId" : 0,
          "topicType" : 0,
          "type" : 0,
          "uid" : 0,
          "userGroup" : [ {
            "certTitle" : "string",
            "certType" : 0
          } ],
          "username" : "string"
        } ],
        "viewpointCarousel" : [ {
          "avatar" : "string",
          "viewpointContent" : "string"
        } ],
        "voted" : true
      },
      "type" : "string",
      "viewPoint" : {
        "auditStatus" : 0,
        "avatar" : "string",
        "comment" : "string",
        "content" : "string",
        "createTime" : "string",
        "createdAt" : 0,
        "favorited" : true,
        "followed" : true,
        "id" : 0,
        "images" : [ {
          "height" : 0,
          "id" : 0,
          "url" : "string",
          "width" : 0
        } ],
        "isReported" : true,
        "notInterested" : true,
        "optionColor" : 0,
        "optionContent" : "string",
        "optionId" : 0,
        "prise" : "string",
        "priseUserAvatar" : [ {
          "avatar" : "string",
          "pid" : 0,
          "uid" : 0
        } ],
        "prised" : true,
        "talent" : 0,
        "topicId" : 0,
        "topicType" : 0,
        "type" : 0,
        "uid" : 0,
        "userGroup" : [ {
          "certTitle" : "string",
          "certType" : 0
        } ],
        "username" : "string"
      }
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="priseusingpost"></a>
#### 观点评论点赞
```
POST /app/attitude/topic/prise
```


##### 说明
观点评论点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.prise(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**targetId**  <br>*必填*|id  评论id或观点id|integer (int32)|
|**Query**|**type**  <br>*必填*|1 为观点点赞 2为评论点赞|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AttitudePriseVO»](#378e368206ef02692f59785bd844d911)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/prise
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "targetId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "prise" : "string",
    "prised" : true
  },
  "msg" : "string"
}
```


<a name="publishcontentusingpost"></a>
#### 写观点
```
POST /app/attitude/topic/publishContent
```


##### 说明
写观点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.publishContent(com.youxiake.model.master.attitude.request.AttitudeViewPointContentRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*必填*|观点内容|string|
|**Query**|**optionId**  <br>*可选*|选项id|integer (int32)|
|**Query**|**photos**  <br>*可选*|图片  数组json串[{ width: 33, height: 33, url: 'http://gallery.youxiake.com/Public/Data/upload/productimg/201911/29/5de0d8d535516.jpg'}]|string|
|**Query**|**topicId**  <br>*必填*|态度话题id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/publishContent
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string",
  "optionId" : 0,
  "photos" : "string",
  "topicId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="detailusingget_1"></a>
#### 态度话题广场
```
GET /app/attitude/topic/square
```


##### 说明
态度话题广场<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.detail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«态度广场列表»](#7a4d0035df24cdb07e8b368330af5515)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/square
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "tags" : [ { } ],
    "topics" : [ {
      "end" : true,
      "endTime" : 0,
      "hasPrise" : 0,
      "optionInfo" : [ {
        "choose" : true,
        "lastVoteUserAvatar" : "string",
        "optionColor" : 0,
        "optionId" : 0,
        "optionPercent" : "string",
        "optionUserCount" : "string",
        "title" : "string"
      } ],
      "options" : [ {
        "optionColor" : 0,
        "optionId" : 0,
        "title" : "string"
      } ],
      "publishedContent" : true,
      "title" : "string",
      "topicId" : 0,
      "type" : 0,
      "userCount" : "string",
      "voted" : true
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getviewpointcommentsusingget"></a>
#### 观点评论列表
```
GET /app/attitude/topic/view-point/comment
```


##### 说明
观点评论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.getViewPointComments(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**lastId**  <br>*可选*|最后一条id,第一页不传或传0|integer (int32)|`0`|
|**Query**|**type**  <br>*必填*|上一页：1，下一页：2 ,消息页跳转：3|integer (int32)||
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverCommentVO»»»](#f757c2ba6e7f969c396a1151b7f4c04b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/view-point/comment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lastId" : 0,
  "type" : 0,
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserId" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "hasPrised" : true,
      "isAuthor" : true,
      "isDelete" : true,
      "isTalent" : true,
      "official" : 0,
      "priseNum" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "replyId" : 0,
      "type" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getviewpointdetailusingget"></a>
#### 观点详情
```
GET /app/attitude/topic/view-point/detail
```


##### 说明
观点详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.getViewPointDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«态度话题观点详情»](#e0087654e33a58fc698b20303a981e7b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/view-point/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "attitudeViewPointVO" : {
      "auditStatus" : 0,
      "avatar" : "string",
      "comment" : "string",
      "content" : "string",
      "createTime" : "string",
      "createdAt" : 0,
      "favorited" : true,
      "followed" : true,
      "id" : 0,
      "images" : [ {
        "height" : 0,
        "id" : 0,
        "url" : "string",
        "width" : 0
      } ],
      "isReported" : true,
      "notInterested" : true,
      "optionColor" : 0,
      "optionContent" : "string",
      "optionId" : 0,
      "prise" : "string",
      "priseUserAvatar" : [ {
        "avatar" : "string",
        "pid" : 0,
        "uid" : 0
      } ],
      "prised" : true,
      "talent" : 0,
      "topicId" : 0,
      "topicType" : 0,
      "type" : 0,
      "uid" : 0,
      "userGroup" : [ {
        "certTitle" : "string",
        "certType" : 0
      } ],
      "username" : "string"
    },
    "discoverComments" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "isTalent" : true,
      "official" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "isMoreComment" : true,
    "remainFloorNum" : 0,
    "topicOrMdd" : [ { } ]
  },
  "msg" : "string"
}
```


<a name="recommenddiscoverstreamusingget"></a>
#### 观点详情-精彩推荐
```
GET /app/attitude/topic/view-point/recommend
```


##### 说明
观点详情-精彩推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.attitude.AttitudeController.recommendDiscoverStream(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**lastId**  <br>*必填*|上一页最后一条的id|integer (int32)|`0`|
|**Query**|**page**  <br>*必填*|页数|integer (int32)|`1`|
|**Query**|**viewPointId**  <br>*必填*|观点id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»](#ad0c913e1185074fad13a042f119771a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/attitude/topic/view-point/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lastId" : 0,
  "page" : 0,
  "viewPointId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "uitype" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="dd4dc6ef17c9ce93e7afbf86613ec9cd"></a>
### 房券产品
Voucher Product Controller


<a name="getvoucherfavoritelistusingget"></a>
#### 房券收藏页
```
GET /app/voucher/favorite/list
```


##### 说明
房券收藏页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.voucher.VoucherProductController.getVoucherFavoriteList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«VoucherFavoriteListVO»»»](#d66e2cda9bdfa81948d8ec8df6c25b26)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/voucher/favorite/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "dest" : "string",
      "destId" : 0,
      "imageUrl" : "string",
      "murl" : "string",
      "peopleCountTip" : "string",
      "salePrice" : "string",
      "tag" : "string",
      "voucherId" : 0,
      "voucherName" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="df1f23dc986592e4676e1ce90b35fdc0"></a>
### 搜索
Search Controller


<a name="searchallusingpost"></a>
#### 综合搜索
```
POST /app/search/all
```


##### 说明
综合搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchAll(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|keyword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«线路:0    频道:5  签证产品:6»](#ea40868c7b346660b5e56698afafcecd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/all
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "advertisement" : [ {
      "pic" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string"
    } ],
    "bbs" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "dests" : [ {
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "type" : 0,
      "wantedNum" : "string"
    } ],
    "film" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "lines" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ {
        "content" : "string",
        "count" : 0,
        "handler" : "string",
        "item" : [ { } ],
        "thumb" : "string",
        "title" : "string",
        "type" : 0,
        "typeName" : "string",
        "url" : "string"
      } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "news" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "photo" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="searchallv2usingpost"></a>
#### 综合搜索-v2
```
POST /app/search/all/v2
```


##### 说明
综合搜索-v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchAllV2(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|keyword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«线路:0    频道:5  签证产品:6»](#ea40868c7b346660b5e56698afafcecd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/all/v2
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "advertisement" : [ {
      "pic" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string"
    } ],
    "bbs" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "dests" : [ {
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "type" : 0,
      "wantedNum" : "string"
    } ],
    "film" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "lines" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ {
        "content" : "string",
        "count" : 0,
        "handler" : "string",
        "item" : [ { } ],
        "thumb" : "string",
        "title" : "string",
        "type" : 0,
        "typeName" : "string",
        "url" : "string"
      } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "news" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    },
    "photo" : {
      "content" : "string",
      "handler" : "string",
      "list" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "url" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="searchanalyzeusingpost"></a>
#### 分词搜索
```
POST /app/search/analyze
```


##### 说明
分词搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchAnalyze(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|keyword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«List«string»»](#633fe231c28490a61bee7bf32422df2b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/analyze
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ "string" ],
  "msg" : "string"
}
```


<a name="searchbbsusingpost"></a>
#### 游记搜索
```
POST /app/search/bbs
```


##### 说明
游记搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchBbs(com.youxiake.microservice.entity.http.request.search.EsSearchRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**num**  <br>*可选*|数量|integer (int32)|
|**Query**|**orderType**  <br>*可选*|排序类型 1 评论 2 最多|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**searchType**  <br>*可选*|查询类型 1 只看精华 2 只看侠魁|integer (int32)|
|**Query**|**sitecode**  <br>*可选*|分站|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«Map«string,object»»»»](#2e871a2f1c7024459c395f7553bc29b5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/bbs
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "num" : 0,
  "orderType" : 0,
  "page" : 0,
  "searchType" : 0,
  "sitecode" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ { } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchdiscoverusingget"></a>
#### 遇见搜索
```
GET /app/search/discover
```


##### 说明
遇见搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchDiscover(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**keyword**  <br>*可选*|搜索词|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»_1](#57eba1c1e2353734fb97131a99590b38)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/discover
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "activityType" : 0,
      "address" : "string",
      "avatar" : "string",
      "content" : "string",
      "cover" : "string",
      "discuss" : "string",
      "featured" : 0,
      "firstImg" : {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      },
      "isTalent" : true,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quoteId" : 0,
      "recordingDuration" : 0,
      "uid" : 0,
      "uitype" : 0,
      "username" : "string",
      "video" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchfilmusingpost"></a>
#### 视频搜索
```
POST /app/search/film
```


##### 说明
视频搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchFilm(com.youxiake.microservice.entity.http.request.search.EsSearchRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**num**  <br>*可选*|数量|integer (int32)|
|**Query**|**orderType**  <br>*可选*|排序类型 1 评论 2 最多|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**searchType**  <br>*可选*|查询类型 1 只看精华 2 只看侠魁|integer (int32)|
|**Query**|**sitecode**  <br>*可选*|分站|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«Map«string,object»»»»](#2e871a2f1c7024459c395f7553bc29b5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/film
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "num" : 0,
  "orderType" : 0,
  "page" : 0,
  "searchType" : 0,
  "sitecode" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ { } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchmallusingpost"></a>
#### 商城搜索
```
POST /app/search/mall
```


##### 说明
商城搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchMall(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|keyword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BaseHandlerVO«Line»»](#583de3d5a8de483e67b8cf351b7f483f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/mall
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "content" : "string",
    "handler" : "string",
    "list" : [ {
      "content" : "string",
      "count" : 0,
      "handler" : "string",
      "item" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "typeName" : "string",
      "url" : "string"
    } ],
    "thumb" : "string",
    "title" : "string",
    "type" : 0,
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="searchmallv2usingpost"></a>
#### 商城搜索-v2
```
POST /app/search/mall/v2
```


##### 说明
商城搜索-v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchMallV2(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|keyword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BaseHandlerVO«Line»»](#583de3d5a8de483e67b8cf351b7f483f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/mall/v2
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "content" : "string",
    "handler" : "string",
    "list" : [ {
      "content" : "string",
      "count" : 0,
      "handler" : "string",
      "item" : [ { } ],
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "typeName" : "string",
      "url" : "string"
    } ],
    "thumb" : "string",
    "title" : "string",
    "type" : 0,
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="searchspnewsusingpost"></a>
#### 攻略搜索
```
POST /app/search/news
```


##### 说明
攻略搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchSpnews(com.youxiake.microservice.entity.http.request.search.EsSearchRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**num**  <br>*可选*|数量|integer (int32)|
|**Query**|**orderType**  <br>*可选*|排序类型 1 评论 2 最多|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**searchType**  <br>*可选*|查询类型 1 只看精华 2 只看侠魁|integer (int32)|
|**Query**|**sitecode**  <br>*可选*|分站|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«Map«string,object»»»»](#2e871a2f1c7024459c395f7553bc29b5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/news
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "num" : 0,
  "orderType" : 0,
  "page" : 0,
  "searchType" : 0,
  "sitecode" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ { } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchpsusingpost"></a>
#### 摄影搜索
```
POST /app/search/photo
```


##### 说明
摄影搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchPs(com.youxiake.microservice.entity.http.request.search.EsSearchRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**num**  <br>*可选*|数量|integer (int32)|
|**Query**|**orderType**  <br>*可选*|排序类型 1 评论 2 最多|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**searchType**  <br>*可选*|查询类型 1 只看精华 2 只看侠魁|integer (int32)|
|**Query**|**sitecode**  <br>*可选*|分站|integer (int32)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«Map«string,object»»»»](#2e871a2f1c7024459c395f7553bc29b5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/photo
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "num" : 0,
  "orderType" : 0,
  "page" : 0,
  "searchType" : 0,
  "sitecode" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ { } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchproduceusingpost"></a>
#### 产品搜索
```
POST /app/search/product
```


##### 说明
产品搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchProduce(com.youxiake.microservice.entity.http.request.search.EsProductSearchRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**age**  <br>*可选*|年龄|< string > array(multi)|
|**Query**|**classThemeId**  <br>*可选*|性质id|integer (int32)|
|**Query**|**classThemeId2**  <br>*可选*|二级性质id|integer (int32)|
|**Query**|**day**  <br>*可选*|行程天数 多个用逗号分割 如 1,2,3|string|
|**Query**|**endTime**  <br>*可选*|自定义出行时间-结束时间|string|
|**Query**|**holiday**  <br>*可选*|节假日 可以多个 通过,隔开|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**maxPrice**  <br>*可选*|价格区间-最高|number (double)|
|**Query**|**mdd**  <br>*可选*|目的地|string|
|**Query**|**minPrice**  <br>*可选*|价格区间-最低|number (double)|
|**Query**|**notShowLineVoucher**  <br>*可选*|是否搜索预售券|boolean|
|**Query**|**num**  <br>*可选*|数量|integer (int32)|
|**Query**|**order**  <br>*可选*|价格排序 1：升序  2:降序  3：销量优先|integer (int32)|
|**Query**|**orderType**  <br>*可选*|排序类型 1 评论 2 最多|integer (int32)|
|**Query**|**outdoorLevel**  <br>*可选*|徒步星级|< integer (int32) > array(multi)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**pids**  <br>*可选*|推荐线路不因查出来的线路id|string|
|**Query**|**place**  <br>*可选*|出发地 可以多个 通过,隔开|string|
|**Query**|**platform_m**  <br>*可选*|m站搜索标识(因为PHP platform 均为PC,所以ma站所搜新增该参数作为区分)|string|
|**Query**|**productTagId**  <br>*可选*|线路标签id|integer (int32)|
|**Query**|**productType**  <br>*可选*|1为搜索线路  2为搜索酒套|integer (int32)|
|**Query**|**region**  <br>*可选*|国内 境外 在线  多个用,分割传入字符串|string|
|**Query**|**sale**  <br>*可选*|促销优惠 1：早鸟特惠  2:满减优惠|integer (int32)|
|**Query**|**searchType**  <br>*可选*|查询类型 1 只看精华 2 只看侠魁|integer (int32)|
|**Query**|**sitecode**  <br>*可选*|分站|integer (int32)|
|**Query**|**sourcePids**  <br>*可选*|推荐线路来源pids|string|
|**Query**|**startDate**  <br>*可选*|出行日期 可以多个 通过,隔开|string|
|**Query**|**startTime**  <br>*可选*|自定义出行时间-出发时间|string|
|**Query**|**subType**  <br>*可选*|二级类型 如: 全部 深度游 户外游 摄影游|integer (int32)|
|**Query**|**type**  <br>*可选*|类型 如: 全部 跟团游 当地玩乐 自由行 大型活动 体育赛事 分享会   9999 为自定义签证类型|integer (int32)|
|**Query**|**typeList**  <br>*可选*|类型数组--不要与type同时使用不然失效|< integer (int32) > array(multi)|
|**Query**|**uid**  <br>*可选*||integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerInfoListWrap«JSONObject,List«Map«string,object»»»»](#7976f528ea4964f7a5a7961be8657c0b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/search/product
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "age" : "string",
  "classThemeId" : 0,
  "classThemeId2" : 0,
  "day" : "string",
  "endTime" : "string",
  "holiday" : "string",
  "keyword" : "string",
  "maxPrice" : 0.0,
  "mdd" : "string",
  "minPrice" : 0.0,
  "notShowLineVoucher" : true,
  "num" : 0,
  "order" : 0,
  "orderType" : 0,
  "outdoorLevel" : 0,
  "page" : 0,
  "pids" : "string",
  "place" : "string",
  "platform_m" : "string",
  "productTagId" : 0,
  "productType" : 0,
  "region" : "string",
  "sale" : 0,
  "searchType" : 0,
  "sitecode" : 0,
  "sourcePids" : "string",
  "startDate" : "string",
  "startTime" : "string",
  "subType" : 0,
  "type" : 0,
  "typeList" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "info" : {
      "string" : "object"
    },
    "infoName" : "string",
    "list" : [ { } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchuserusingpost"></a>
#### 搜索用户
```
POST /app/user/search
```


##### 说明
搜索用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchUser(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**groupId**  <br>*可选*|groupId|integer (int32)||
|**Query**|**group_id**  <br>*可选*|组id|string|`"0"`|
|**Query**|**keyword**  <br>*可选*|搜索词|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ContactSearchVO»»»](#0f46104bf7980f07f9f5b5334bbaf91e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/search
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupId" : 0,
  "group_id" : "string",
  "keyword" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "city" : "string",
      "intro" : "string",
      "isin" : 0,
      "province" : "string",
      "realname" : "string",
      "relation" : "string",
      "sex" : 0,
      "tags" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchfrontusingget"></a>
#### 搜索前置页面
```
GET /app/user/search/front
```


##### 说明
搜索前置页面<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchFront(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SearchFrontVo»](#5fc2b56707a5fb8722d93853ec37cd37)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/search/front
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "hotSerach" : [ {
      "cover" : "string",
      "statisticsCode" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "productNewRecommends" : [ {
      "days" : "string",
      "img" : "string",
      "name" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : "string",
      "productType" : "string",
      "statisticsCode" : "string"
    } ],
    "recommendSearch" : [ {
      "cover" : "string",
      "statisticsCode" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string"
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchtagsusingget"></a>
#### 商城搜索标签
```
GET /app/user/search/tags
```


##### 说明
商城搜索标签<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.searchTags(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SearchTagVo»](#3a3cb77563e5e22f8b135ee98454d92f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/search/tags
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "tags" : [ {
      "count" : 0,
      "subTag" : [ {
        "count" : 0,
        "subTag" : [ "..." ],
        "title" : "string",
        "type" : 0
      } ],
      "title" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="timesearchusingget"></a>
#### 实时内容搜索
```
GET /app/user/search/timesearch
```


##### 说明
实时内容搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.search.SearchController.timeSearch(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TimeSerachResultVo»](#0926cafe5e63f49c2e28933ad6d7f073)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/search/timesearch
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "desc" : "string",
      "handle" : "string",
      "label" : [ "string" ],
      "mddLevel" : "string",
      "productTypeCounts" : [ {
        "count" : 0,
        "title" : "string",
        "type" : 0
      } ],
      "title" : "string",
      "type" : 0,
      "url" : "string"
    } ],
    "productRecommend" : [ {
      "days" : "string",
      "img" : "string",
      "name" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : "string",
      "productType" : "string",
      "statisticsCode" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="b3c6f5313dbd71ec483c191779d2efbb"></a>
### 摄影
Photography Controller


<a name="allusingget"></a>
#### 全部作品
```
GET /app/photos/all
```


##### 说明
全部作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.all()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoAllVO»](#18ec2982b0181e16958c8a79e0d1dd8e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/all
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "themes" : [ {
      "albums" : [ {
        "album_id" : 0,
        "copyright" : "string",
        "cover" : 0,
        "editor_choice" : "string",
        "thumb" : "string",
        "title" : "string"
      } ],
      "more_url" : "string",
      "themeName" : "string",
      "totalPage" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="categorysusingget"></a>
#### 摄影作品主题列表
```
GET /app/photos/categorys
```


##### 说明
摄影作品主题列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.categorys()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CategorysVO»](#1933e72e4b08a423b6b4177eb876174b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/categorys
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "themes" : [ {
      "more_url" : "string",
      "themeName" : "string",
      "theme_id" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="collectionusingpost"></a>
#### 收藏摄影作品
```
POST /app/photos/collection
```


##### 说明
收藏摄影作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.collection(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CollectVO»](#549a8552408992a4a154dbb51cd4c74e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/collection
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "is_collect" : 0,
    "msg" : "string"
  },
  "msg" : "string"
}
```


<a name="collectionlistusingget"></a>
#### 摄影作品收藏列表
```
GET /app/photos/collection/list
```


##### 说明
摄影作品收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.collectionlist(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumCollectsVO»](#d4ad47d988f29595942e266646661912)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/collection/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "albumId" : 0,
      "album_id" : 0,
      "copyright" : {
        "copyright_id" : 0,
        "copyright_name" : "string"
      },
      "copyrightInt" : 0,
      "cover" : 0,
      "editor_choice" : 0,
      "imageNum" : 0,
      "thumb" : "string",
      "title" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="commentusingpost"></a>
#### 摄影作品评论
```
POST /app/photos/comment
```


##### 说明
摄影作品评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.comment(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)||
|**Query**|**channel**  <br>*可选*|评论渠道|integer (int32)||
|**Query**|**comment_type**  <br>*可选*|是不是回复1、是，0、不是|integer (int32)|`1`|
|**Query**|**content**  <br>*可选*|评论内容|string||
|**Query**|**qid**  <br>*可选*|评论引用|integer (int32)||
|**Query**|**quid**  <br>*可选*|被评论引用uid|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap«string,object»»](#fe6f1977bb4d94e22130450552b8a7cd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/comment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0,
  "channel" : 0,
  "comment_type" : 0,
  "content" : "string",
  "qid" : 0,
  "quid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="commentdelusingpost"></a>
#### 删除摄影评论
```
POST /app/photos/comment/del
```


##### 说明
删除摄影评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.commentDel(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/comment/del
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="commentlistusingget"></a>
#### 摄影作品评论列表
```
GET /app/photos/commentlist
```


##### 说明
摄影作品评论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.commentlist(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|`1`|
|**Query**|**cid**  <br>*可选*|评论的id 推送点开用|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|分页大小|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|分页大小|integer (int32)|`10`|
|**Query**|**pid**  <br>*可选*|照片的id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Commentslist»](#4b5676b0ba913f5a9321cf942bcd9b02)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/commentlist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0,
  "cid" : 0,
  "page" : 0,
  "pageSize" : 0,
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "comments" : [ {
      "album_id" : 0,
      "comment_id" : 0,
      "comment_image" : "string",
      "content" : "string",
      "from" : {
        "headImage" : "string",
        "name" : "string",
        "uid" : 0
      },
      "gmt_create" : 0,
      "image_sizeInfo" : {
        "height" : "string",
        "width" : "string"
      },
      "thumbs" : 0,
      "to" : {
        "headImage" : "string",
        "name" : "string",
        "uid" : 0
      }
    } ],
    "current_page" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="competitionalbumsusingget"></a>
#### 摄影大赛作品
```
GET /app/photos/competition/albums
```


##### 说明
摄影大赛作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.competitionAlbums(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**competition_id**  <br>*可选*|大赛id|integer (int32)|`1`|
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页数大小|integer (int32)|`10`|
|**Query**|**type**  <br>*可选*|hot:热门 or all:全部|string|`"hot"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CompetitionAward»](#d476abf8ac24741fc9a63d03b9545b89)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/competition/albums
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "competition_id" : 0,
  "page" : 0,
  "pageSize" : 0,
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "album_id" : 0,
      "copyright" : {
        "copyright_id" : 0,
        "copyright_name" : "string"
      },
      "copyrightInt" : 0,
      "cover" : 0,
      "editor_choice" : 0,
      "thumb" : "string",
      "title" : "string"
    } ],
    "award_albums" : [ {
      "albums" : [ {
        "album_id" : 0,
        "cover" : 0,
        "editor_choice" : 0,
        "thumb" : "string",
        "thumb_height" : 0,
        "thumb_width" : 0,
        "title" : "string"
      } ],
      "award_name" : "string"
    } ],
    "competition" : {
      "album_count" : 0,
      "competition_id" : 0,
      "competition_status" : "string",
      "cover" : "string",
      "desc" : "string",
      "detail" : "string",
      "is_px" : 0,
      "left_days" : 0,
      "subtitle" : "string",
      "title" : "string"
    },
    "share_url" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="competitionlistusingget"></a>
#### 获取摄影大赛列表
```
GET /app/photos/competitionlist
```


##### 说明
获取摄影大赛列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.competitionlist(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ResultCompetition»](#ec8a4a805152fe0c0b398dfa85c43565)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/competitionlist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "competitions" : [ {
      "album_count" : 0,
      "competition_id" : 0,
      "competition_status" : "string",
      "cover" : "string",
      "desc" : "string",
      "detail" : "string",
      "is_px" : 0,
      "left_days" : 0,
      "subtitle" : "string",
      "title" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="copyrightlistusingget"></a>
#### 获取摄影版权列表
```
GET /app/photos/copyrightlist
```


##### 说明
获取摄影版权列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.copyrightlist()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CopyrightsVO»](#c72fcad652706c546ddd09f9ffba5f4e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/copyrightlist
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "copyright_list" : [ {
      "copyright_content" : "string",
      "copyright_desc" : "string",
      "copyright_id" : 0,
      "copyright_name" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="deleteworkusingpost"></a>
#### 删除摄影作品
```
POST /app/photos/deletework
```


##### 说明
删除摄影作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.deletework(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/deletework
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="destinationlistusingget"></a>
#### 获取摄影目的地列表
```
GET /app/photos/destinationlist
```


##### 说明
获取摄影目的地列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.destinationlist()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestinationVO»](#6afab422bc0c06653a46ded3c43c37df)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/destinationlist
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "civil_list" : [ {
      "name" : "string",
      "tag_id" : 0
    } ],
    "foreign_list" : [ {
      "name" : "string",
      "tag_id" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="destinationsearchusingpost"></a>
#### 获取摄影目的地搜索
```
POST /app/photos/destinationsearch
```


##### 说明
获取摄影目的地搜索<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.destinationsearch(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**keyword**  <br>*可选*|keyword|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|
|**Query**|**page_size**  <br>*可选*|page_size|integer (int32)|`150`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SearchVO»](#e1a6acebcb57d0bbde3fee591605ed42)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/destinationsearch
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "page" : 0,
  "page_size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "name" : "string",
      "tag_id" : 0
    } ],
    "total_page" : 0
  },
  "msg" : "string"
}
```


<a name="getdetailusingget"></a>
#### 摄影作品详情
```
GET /app/photos/detail
```


##### 说明
摄影作品详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.getDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoDetailVO»](#0349e9dc332676b173a24892aac0b2a6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "album_id" : 0,
    "allowPlatform" : 0,
    "allowUser" : 0,
    "auditStatus" : 0,
    "auditStatusLabel" : "string",
    "auth" : "string",
    "author" : {
      "headImage" : "string",
      "isTalent" : true,
      "isTanlent" : true,
      "name" : "string",
      "uid" : 0
    },
    "authorOtherAlbums" : [ {
      "currentVoteNum" : 0,
      "imageUrl" : "string",
      "isInVote" : true,
      "sid" : 0,
      "title" : "string",
      "uid" : 0
    } ],
    "canVote" : true,
    "channel" : 0,
    "commentPage" : {
      "info" : [ "object" ],
      "infoName" : "string",
      "list" : [ "object" ],
      "pageSize" : 0,
      "recordCount" : 0,
      "totalPage" : 0
    },
    "commented" : 0,
    "competitionReward" : {
      "cid" : 0,
      "desc" : "string",
      "title" : "string"
    },
    "competition_info" : {
      "competition_id" : 0,
      "competition_name" : "string",
      "groupId" : 0,
      "groupName" : "string",
      "type" : 0
    },
    "copyright" : {
      "copyright_id" : 0,
      "copyright_name" : "string"
    },
    "cover" : "string",
    "desc" : "string",
    "editor_choice" : "string",
    "editor_cover" : "string",
    "enable_download" : true,
    "gmt_create" : "string",
    "gmt_modify" : 0,
    "h5LeftVote" : 0,
    "isMoreComment" : true,
    "isShowVoteButton" : true,
    "is_collect" : true,
    "is_competition" : 0,
    "is_liked" : true,
    "kit" : "string",
    "left_vote" : 0,
    "liked" : 0,
    "model" : "string",
    "otherInfo" : [ { } ],
    "photos" : [ {
      "commented" : 0,
      "detail_display_url" : "string",
      "exif" : {
        "aperture" : "string",
        "camera" : "string",
        "creationdate" : {
          "date" : "string",
          "timezone" : "string",
          "timezone_type" : 0
        },
        "date" : "string",
        "exposure" : "string",
        "exposurebias" : "string",
        "focal" : "string",
        "focalLength" : "string",
        "height" : "string",
        "horizontalResolution" : "string",
        "iso" : "string",
        "make" : "string",
        "metering" : "string",
        "software" : "string",
        "verticalResolution" : "string",
        "width" : "string"
      },
      "img" : "string",
      "iscover" : 0,
      "pid" : 0,
      "waterMarkPhoto" : "string"
    } ],
    "place" : "string",
    "ps" : "string",
    "relation" : "string",
    "remainFloorNum" : 0,
    "remark" : 0,
    "scored" : 0,
    "shareTip" : "string",
    "share_desc" : "string",
    "share_title" : "string",
    "share_url" : "string",
    "showVoteNum" : 0,
    "source" : "string",
    "status" : 0,
    "subject" : "string",
    "tags" : [ {
      "name" : "string",
      "tag_id" : 0
    } ],
    "thumb" : "string",
    "thumb_height" : 0,
    "thumb_size" : 0,
    "thumb_url" : "string",
    "thumb_width" : 0,
    "timeline" : "string",
    "title" : "string",
    "uid" : 0,
    "userType" : "string",
    "viewed" : 0,
    "voteDescription" : "string",
    "votes" : 0
  },
  "msg" : "string"
}
```


<a name="doingcompetitionlistusingget"></a>
#### 正在进行的大赛
```
GET /app/photos/doingCompetitionlist
```


##### 说明
正在进行的大赛<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.doingCompetitionlist()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DoingCompetitionlistVO»](#43ac19b283a4bbdcf4b15483798561b0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/doingCompetitionlist
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "competition_id" : 0,
      "groups" : [ {
        "defaultStatus" : 0,
        "groupId" : 0,
        "groupName" : "string"
      } ],
      "subtitle" : "string",
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="hottagsusingget"></a>
#### 热门标签列表
```
GET /app/photos/hot-tags
```


##### 说明
热门标签列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.hottags()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HotTagVO»](#dd1da550a76e863c721232363b9f9d6b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/hot-tags
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "name" : "string",
      "tag_id" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="likeusingpost"></a>
#### 摄影作品大赛点赞
```
POST /app/photos/like
```


##### 说明
摄影作品大赛点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.like(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LikedVO»](#6043d791fb87ceb9961ab35dfc7797de)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/like
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "is_liked" : true,
    "liked" : 0,
    "msg" : "string"
  },
  "msg" : "string"
}
```


<a name="minealbumsusingget"></a>
#### 个人摄影作品
```
GET /app/photos/mine
```


##### 说明
个人摄影作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.mineAlbums(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`20`|
|**Query**|**uid**  <br>*可选*|用户id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumsMineVO»](#5ee497f1b23078bcdb54e8c38348dc87)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/mine
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "album_id" : 0,
      "auditStatus" : 0,
      "auditStatusLabel" : "string",
      "cover" : 0,
      "gmt_create" : 0,
      "thumb" : "string",
      "title" : "string"
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getphotomasterusingget"></a>
#### 摄影名家
```
GET /app/photos/photomaster
```


##### 说明
摄影名家<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.getPhotoMaster(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoMasterVO»](#cbde5ebe1be99c7349b1f46937dc4ba6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/photomaster
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "albums" : [ {
        "album_id" : 0,
        "cover" : 0,
        "editor_choice" : 0,
        "gmt_create" : 0,
        "thumb" : "string",
        "title" : "string"
      } ],
      "master" : {
        "desc" : "string",
        "headImage" : "string",
        "name" : "string",
        "uid" : 0
      },
      "relation" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="publishworkusingpost"></a>
#### 发布摄影作品
```
POST /app/photos/publishwork
```


##### 说明
发布摄影作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.publishwork(com.youxiake.model.master.community.photography.request.WorkVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|
|**Query**|**allowPlatform**  <br>*可选*|是否允许游侠客平台传播，0未授权，1授权|integer (int32)|
|**Query**|**allowUser**  <br>*可选*|是否允许可用 0未授权，1终极授权随意使用|integer (int32)|
|**Query**|**item**  <br>*可选*|作品属性|string|
|**Query**|**photos**  <br>*可选*|图片串|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«WorksVO»](#1d1fc831dcb6c9d2b908828bb6ed6b35)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/publishwork
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0,
  "allowPlatform" : 0,
  "allowUser" : 0,
  "item" : "string",
  "photos" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "album_id" : 0
  },
  "msg" : "string"
}
```


<a name="getrecommendationusingget"></a>
#### 获取推荐
```
GET /app/photos/recommendation
```


##### 说明
获取推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.getRecommendation()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoRecomentationVO»](#0bfdfa7eaed5e8ed0ec9b52c7c42dba3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/recommendation
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "album_recommends" : [ {
      "album_id" : 0,
      "photos" : [ "string" ],
      "title" : "string"
    } ],
    "competitions" : [ {
      "competition_id" : 0,
      "competition_status" : "string",
      "cover" : "string",
      "left_days" : 0,
      "title" : "string"
    } ],
    "masters" : [ {
      "desc" : "string",
      "headImage" : "string",
      "name" : "string",
      "uid" : 0
    } ],
    "themes" : [ {
      "albums" : [ {
        "album_id" : 0,
        "auditStatus" : 0,
        "auditStatusLabel" : "string",
        "cover" : 0,
        "gmt_create" : 0,
        "thumb" : "string",
        "title" : "string"
      } ],
      "more_url" : "string",
      "themeName" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="getrecommendationmoreusingget"></a>
#### 获取更多推荐
```
GET /app/photos/recommendation/more
```


##### 说明
获取更多推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.getRecommendationMore(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**sortby**  <br>*可选*|排序方式: like , addComment , view, latest|string|`"gmt_modify"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«RecomendMore»](#513916ad466d764306d5e08b5d08617b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/recommendation/more
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "sortby" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "album_id" : 0,
      "copyright" : {
        "copyright_id" : 0,
        "copyright_name" : "string"
      },
      "copyrightInt" : 0,
      "cover" : 0,
      "editor_choice" : 0,
      "thumb" : "string",
      "title" : "string"
    } ],
    "themeName" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="reportusingpost_3"></a>
#### 举报摄影里面的作品或者不良评论
```
POST /app/photos/report
```


##### 说明
举报摄影里面的作品或者不良评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.report(java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**module_type**  <br>*可选*|photography,photography_comment|string|`"photography_comment"`|
|**Query**|**quote_id**  <br>*可选*|作品id|integer (int32)|`0`|
|**Query**|**reason**  <br>*可选*|举报内容|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "module_type" : "string",
  "quote_id" : 0,
  "reason" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="subscribeusingget_1"></a>
#### 关注作品
```
GET /app/photos/subscribe
```


##### 说明
关注作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.subscribe(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页数大小|integer (int32)|`20`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumSubcribesVO»](#2e6b98cc9339954d0c56b9799f165d3d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/subscribe
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "album_id" : 0,
      "author" : {
        "headImage" : "string",
        "isTalent" : true,
        "isTanlent" : true,
        "name" : "string",
        "uid" : 0
      },
      "commented" : 0,
      "description" : "string",
      "gmt_create" : 0,
      "is_competition" : 0,
      "is_liked" : true,
      "liked" : 0,
      "photos" : [ {
        "img" : "string",
        "pid" : 0
      } ],
      "tags" : [ {
        "name" : "string",
        "tag_id" : 0
      } ],
      "title" : "string",
      "参赛信息" : {
        "competition_id" : 0,
        "competition_name" : "string",
        "groupId" : 0,
        "groupName" : "string",
        "type" : 0
      }
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="tagalbumsusingget"></a>
#### 标签对应摄影作品
```
GET /app/photos/tag-albums
```


##### 说明
标签对应摄影作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.tagalbums(java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)||
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`18`|
|**Query**|**sortby**  <br>*可选*|like , addComment , view, latest|string|`"latest"`|
|**Query**|**tag_id**  <br>*可选*|标签id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap»](#7fdddea69a68d87b489caa1e9cca84c2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/tag-albums
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0,
  "sortby" : "string",
  "tag_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ "object" ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="themeusingget"></a>
#### 摄影主题作品
```
GET /app/photos/theme
```


##### 说明
摄影主题作品<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.theme(java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页数大小|integer (int32)|`18`|
|**Query**|**sortby**  <br>*可选*|// like \| addComment \| view \| latest|string||
|**Query**|**theme_id**  <br>*可选*|主题id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoSubjectVO»](#ac9354935a57daaeec9429add2a4c262)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/theme
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0,
  "sortby" : "string",
  "theme_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albums" : [ {
      "album_id" : 0,
      "copyright" : "string",
      "cover" : 0,
      "editor_choice" : "string",
      "thumb" : "string",
      "title" : "string"
    } ],
    "more_url" : "string",
    "themeName" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="themecategorylistusingget"></a>
#### 摄影分类列表
```
GET /app/photos/themecategorylist
```


##### 说明
摄影分类列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.themecategorylist()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ThemeCategoryVO»](#542bce0c04a167ca40349dc01621c27b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/themecategorylist
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "name" : "string",
      "tag_id" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="voteusingpost"></a>
#### 摄影作品大赛投票
```
POST /app/photos/vote
```


##### 说明
摄影作品大赛投票<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.PhotographyController.vote(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**album_id**  <br>*可选*|作品id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VoteVO»](#fa01049b9eb873c46814d71e9fb130ae)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/photos/vote
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "album_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "h5LeftVote" : 0,
    "left_vote" : 0,
    "msg" : "string",
    "voted" : 0
  },
  "msg" : "string"
}
```


<a name="d5d2be7131d93aecd2e619991ac435b0"></a>
### 摄影作品v2版本
Photo Controller V 2


<a name="getviewpointcommentsusingget_1"></a>
#### 评论列表
```
GET /app/v2/photos/comment
```


##### 说明
评论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.getViewPointComments(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**albumId**  <br>*必填*|专辑id|integer (int32)||
|**Query**|**lastId**  <br>*可选*|最后一条id,第一页不传或传0|integer (int32)|`0`|
|**Query**|**type**  <br>*必填*|上一页：1，下一页：2 ,消息页跳转：3|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerInfoListWrap«List«AlbumCommentVO»,List«AlbumCommentVO»»»](#4a95302c7f9da47b16fe6fd64a2d0b72)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/comment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "albumId" : 0,
  "lastId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "info" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserId" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : 0
      } ],
      "hasPrised" : true,
      "isAuthor" : true,
      "isDelete" : true,
      "isTalent" : true,
      "official" : 0,
      "priseNum" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserId" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : 0
        } ],
        "hasPrised" : true,
        "isAuthor" : true,
        "isDelete" : true,
        "isTalent" : true,
        "official" : 0,
        "priseNum" : 0,
        "replyComments" : [ "..." ],
        "replyId" : 0,
        "type" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "replyId" : 0,
      "type" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "infoName" : "string",
    "list" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserId" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : 0
      } ],
      "hasPrised" : true,
      "isAuthor" : true,
      "isDelete" : true,
      "isTalent" : true,
      "official" : 0,
      "priseNum" : 0,
      "replyComments" : [ "..." ],
      "replyId" : 0,
      "type" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="commentpriseusingpost_1"></a>
#### 评论点赞
```
POST /app/v2/photos/comment/prise
```


##### 说明
评论点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.commentPrise(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*必填*|评论id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumCommentPriseVO»](#075c5bf8fca4669e913c5c196aec3063)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/comment/prise
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "prise" : "string",
    "prised" : true
  },
  "msg" : "string"
}
```


<a name="commentpriseusingget"></a>
#### 评论点赞
```
GET /app/v2/photos/comment/prise
```


##### 说明
评论点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.commentPrise(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*必填*|评论id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumCommentPriseVO»](#075c5bf8fca4669e913c5c196aec3063)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/comment/prise
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "prise" : "string",
    "prised" : true
  },
  "msg" : "string"
}
```


<a name="competitiondetailusingget"></a>
#### 赛事详情
```
GET /app/v2/photos/competition/detail
```


##### 说明
赛事详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.competitionDetail(com.youxiake.model.master.community.photography.request.CompetitionDetialRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**competitionId**  <br>*必填*|赛事id|integer (int32)|
|**Query**|**groupId**  <br>*可选*|分组id|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**photoType**  <br>*可选*|作品筛选类型|integer (int32)|
|**Query**|**sortType**  <br>*可选*|作品排序类型|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CompetitionDetailVO»](#3fc5c34983a590a5741d6d66f48c0b81)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/competition/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "competitionId" : 0,
  "groupId" : 0,
  "page" : 0,
  "photoType" : 0,
  "sortType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "albumList" : [ {
      "albumId" : 0,
      "avatar" : "string",
      "award" : true,
      "canVote" : true,
      "cover" : "string",
      "editorChoice" : true,
      "groupId" : 0,
      "groupName" : "string",
      "height" : 0,
      "isCollect" : true,
      "isTalent" : true,
      "photoCount" : 0,
      "priseCount" : "string",
      "prised" : true,
      "shareUrl" : "string",
      "title" : "string",
      "uid" : 0,
      "uitype" : 0,
      "username" : "string",
      "voteCount" : "string",
      "width" : 0
    } ],
    "albumTag" : [ {
      "sortTags" : [ {
        "sortTags" : [ "..." ],
        "title" : "string",
        "type" : 0
      } ],
      "title" : "string",
      "type" : 0
    } ],
    "albums" : "string",
    "appSharePic" : "string",
    "competitionDesc" : "string",
    "competitionId" : 0,
    "competitionIntro" : "string",
    "cover" : "string",
    "desc" : "string",
    "disclaimer" : true,
    "disclaimerContent" : "string",
    "levyOverDate" : 0,
    "levyStartDate" : 0,
    "pxOverDate" : 0,
    "shareUrl" : "string",
    "sortTag" : [ {
      "sortTags" : [ "..." ],
      "title" : "string",
      "type" : 0
    } ],
    "subTitle" : "string",
    "time" : "string",
    "title" : "string",
    "totalPage" : 0,
    "type" : 0,
    "voteOverDate" : 0
  },
  "msg" : "string"
}
```


<a name="listcompetitionusingget"></a>
#### 赛事列表
```
GET /app/v2/photos/competition/list
```


##### 说明
赛事列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.listCompetition(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«PhotoCompetitionVO»»»](#ae18996960c89b2cfe30d4f0363f1ae6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/competition/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "competitionId" : 0,
      "count" : "string",
      "cover" : "string",
      "desc" : "string",
      "time" : "string",
      "title" : "string",
      "type" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="detailrecommendusingget_1"></a>
#### 相关推荐
```
GET /app/v2/photos/detail/recommend
```


##### 说明
相关推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.detailRecommend(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**albumId**  <br>*必填*|专辑id|integer (int32)|
|**Query**|**page**  <br>*必填*|页数|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»](#ad0c913e1185074fad13a042f119771a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/detail/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "albumId" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "uitype" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="changeeditorchoiceusingpost"></a>
#### 设置编辑推荐
```
POST /app/v2/photos/editorChoice/change
```


##### 说明
设置编辑推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.changeEditorChoice(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**albumId**  <br>*必填*|作品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/editorChoice/change
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "albumId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="photohomeusingget"></a>
#### 摄影首页-上半部分
```
GET /app/v2/photos/home
```


##### 说明
摄影首页-上半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.photoHome()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PhotoHomeVO»](#3601db249da1fef0f3bd2bade6b982ce)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/home
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "photoCompetitionVOS" : [ {
      "competitionId" : 0,
      "count" : "string",
      "cover" : "string",
      "desc" : "string",
      "time" : "string",
      "title" : "string",
      "type" : 0
    } ],
    "recommendMasters" : [ {
      "albumVOS" : [ {
        "albumId" : 0,
        "currentVoteNum" : 0,
        "isInVote" : true,
        "photos" : [ "string" ],
        "title" : "string"
      } ],
      "avatar" : "string",
      "certBeans" : [ {
        "certTitle" : "string",
        "certType" : 0
      } ],
      "fanCount" : 0,
      "followCount" : 0,
      "intro" : "string",
      "isFollow" : true,
      "isTalent" : true,
      "uid" : 0,
      "username" : "string"
    } ],
    "stationaryModules" : [ {
      "type" : 0
    } ],
    "tags" : [ {
      "name" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="photohomestreamusingget"></a>
#### 摄影首页-下半部分 
```
GET /app/v2/photos/home/stream
```


##### 说明
摄影首页-下半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.photoHomeStream(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页数|string|
|**Query**|**type**  <br>*可选*|标签类型 大图（关注）-1 ，小图（推荐）-2，投票-3|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»](#ad0c913e1185074fad13a042f119771a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/home/stream
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "uitype" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="recommendmasterusingget"></a>
#### 摄影名师推荐
```
GET /app/v2/photos/recommend/master
```


##### 说明
摄影名师推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.recommendMaster(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页数|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap»](#7fdddea69a68d87b489caa1e9cca84c2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/recommend/master
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ "object" ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="shareusingget"></a>
#### 分享
```
GET /app/v2/photos/share
```


##### 说明
分享<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.PhotoControllerV2.share(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**albumId**  <br>*必填*|专辑id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AlbumShareVO»](#0035572b474fb39036a3560a75977ad2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/photos/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "albumId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expertComment" : "object",
    "photoDetailVO" : {
      "album_id" : 0,
      "allowPlatform" : 0,
      "allowUser" : 0,
      "auditStatus" : 0,
      "auditStatusLabel" : "string",
      "auth" : "string",
      "author" : {
        "headImage" : "string",
        "isTalent" : true,
        "isTanlent" : true,
        "name" : "string",
        "uid" : 0
      },
      "authorOtherAlbums" : [ {
        "currentVoteNum" : 0,
        "imageUrl" : "string",
        "isInVote" : true,
        "sid" : 0,
        "title" : "string",
        "uid" : 0
      } ],
      "canVote" : true,
      "channel" : 0,
      "commentPage" : {
        "info" : [ "object" ],
        "infoName" : "string",
        "list" : [ "object" ],
        "pageSize" : 0,
        "recordCount" : 0,
        "totalPage" : 0
      },
      "commented" : 0,
      "competitionReward" : {
        "cid" : 0,
        "desc" : "string",
        "title" : "string"
      },
      "competition_info" : {
        "competition_id" : 0,
        "competition_name" : "string",
        "groupId" : 0,
        "groupName" : "string",
        "type" : 0
      },
      "copyright" : {
        "copyright_id" : 0,
        "copyright_name" : "string"
      },
      "cover" : "string",
      "desc" : "string",
      "editor_choice" : "string",
      "editor_cover" : "string",
      "enable_download" : true,
      "gmt_create" : "string",
      "gmt_modify" : 0,
      "h5LeftVote" : 0,
      "isMoreComment" : true,
      "isShowVoteButton" : true,
      "is_collect" : true,
      "is_competition" : 0,
      "is_liked" : true,
      "kit" : "string",
      "left_vote" : 0,
      "liked" : 0,
      "model" : "string",
      "otherInfo" : [ { } ],
      "photos" : [ {
        "commented" : 0,
        "detail_display_url" : "string",
        "exif" : {
          "aperture" : "string",
          "camera" : "string",
          "creationdate" : {
            "date" : "string",
            "timezone" : "string",
            "timezone_type" : 0
          },
          "date" : "string",
          "exposure" : "string",
          "exposurebias" : "string",
          "focal" : "string",
          "focalLength" : "string",
          "height" : "string",
          "horizontalResolution" : "string",
          "iso" : "string",
          "make" : "string",
          "metering" : "string",
          "software" : "string",
          "verticalResolution" : "string",
          "width" : "string"
        },
        "img" : "string",
        "iscover" : 0,
        "pid" : 0,
        "waterMarkPhoto" : "string"
      } ],
      "place" : "string",
      "ps" : "string",
      "relation" : "string",
      "remainFloorNum" : 0,
      "remark" : 0,
      "scored" : 0,
      "shareTip" : "string",
      "share_desc" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "showVoteNum" : 0,
      "source" : "string",
      "status" : 0,
      "subject" : "string",
      "tags" : [ {
        "name" : "string",
        "tag_id" : 0
      } ],
      "thumb" : "string",
      "thumb_height" : 0,
      "thumb_size" : 0,
      "thumb_url" : "string",
      "thumb_width" : 0,
      "timeline" : "string",
      "title" : "string",
      "uid" : 0,
      "userType" : "string",
      "viewed" : 0,
      "voteDescription" : "string",
      "votes" : 0
    }
  },
  "msg" : "string"
}
```


<a name="b2e2512d0f3f269629304ed504cb5211"></a>
### 支付管理
Visa Pay Controller


<a name="alinotityusingpost"></a>
#### 支付宝回调-线路
```
POST /app/orderspay/line/notity/alipay
```


##### 说明
支付宝回调-线路<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.LinePayController.aliNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/line/notity/alipay
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="kqnotityusingget"></a>
#### 快钱回调-线路
```
GET /app/orderspay/line/notity/kuaiqian
```


##### 说明
快钱回调-线路<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.LinePayController.kqNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/line/notity/kuaiqian
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="wxnotityusingpost"></a>
#### 微信回调-线路
```
POST /app/orderspay/line/notity/wx
```


##### 说明
微信回调-线路<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.LinePayController.wxNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/xml`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/line/notity/wx
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="createorderpayusingpost"></a>
#### 线路支付
```
POST /app/orderspay/pay
```


##### 说明
线路支付<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.pay.LinePayController.createOrderPay(com.youxiake.model.master.common.vo.request.PayRq) throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**balanceAmount**  <br>*可选*|余额抵扣金额|number|
|**Query**|**channel**  <br>*必填*|1:支付宝 2:快钱 3:微信 4余额|integer (int32)|
|**Query**|**fid**  <br>*可选*|追加费用id|integer (int32)|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|
|**Query**|**payType**  <br>*可选*|支付类型，如果前一个接口有的话传过来|integer (int32)|
|**Query**|**yxbAmount**  <br>*可选*|游侠币抵扣金额|number|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PayResultVo»](#f3d700c68eb3e00a84b7472cbdfdd1a1)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/pay
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "balanceAmount" : 0.0,
  "channel" : 0,
  "fid" : 0,
  "oid" : 0,
  "payType" : 0,
  "yxbAmount" : 0.0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "appid" : "string",
    "errorUrl" : "string",
    "html" : "string",
    "insuranceChange" : 0,
    "noncestr" : "string",
    "orderString" : "string",
    "package" : "string",
    "partnerid" : "string",
    "prepayid" : "string",
    "refresh" : 0,
    "sign" : "string",
    "successUrl" : "string",
    "timestamp" : 0,
    "tipLabel" : "string"
  },
  "msg" : "string"
}
```


<a name="successinfousingpost"></a>
#### 支付成功页面信息
```
POST /app/orderspay/pay/succinfo
```


##### 说明
支付成功页面信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.pay.LinePayController.successInfo(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|
|**Query**|**prepay**  <br>*可选*|是否预付款付款成功|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PaySuccInfoVO»](#e44122db173aadcc806832731746b4ff)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/pay/succinfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "string",
  "prepay" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "bottomTip" : "string",
    "contractTip" : "string",
    "couponTip" : "string",
    "coupons" : [ {
      "amount" : 0.0,
      "category" : 0,
      "categoryColor" : "string",
      "categoryName" : "string",
      "channel" : 0,
      "channel_label" : "string",
      "cid" : 0,
      "class_region_id" : 0,
      "codeid" : 0,
      "exp" : 0,
      "expLabelColor" : "string",
      "exp_label" : "string",
      "map" : 0,
      "map_label" : "string",
      "min_amount" : 0.0,
      "oid" : 0,
      "productList" : [ {
        "cheapType" : 0,
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typetwoOrCat" : "string"
      } ],
      "productListTopTip" : "string",
      "products" : [ {
        "adultprice" : 0.0,
        "class_theme_id" : 0,
        "days_label" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "place_label" : "string",
        "price_label" : "string",
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "shortTitle" : "string",
        "statisticsCode" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "type" : 0
      } ],
      "remark" : "string",
      "sitecode" : 0,
      "status" : 0,
      "tip_label" : "string",
      "title" : "string",
      "type" : 0,
      "type_label" : "string",
      "unusableReason" : "string"
    } ],
    "deadlineTime" : "string",
    "deadlineTip" : "string",
    "drawWindow" : {
      "count" : 0,
      "url" : "string"
    },
    "isNeedComment" : 0,
    "remark" : "string",
    "tip" : "string",
    "topTip" : "string",
    "yxb" : 0.0,
    "yxbTip" : "string",
    "yxxTips" : [ "string" ]
  },
  "msg" : "string"
}
```


<a name="paymodeusingget"></a>
#### 获取支付渠道-线路
```
GET /app/orderspay/paymode
```


##### 说明
获取支付渠道-线路<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.pay.LinePayController.paymode(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**fid**  <br>*可选*|费用id|string|`"0"`|
|**Query**|**oid**  <br>*可选*|订单id|string|`"0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PayInfoVO»](#bf948d6f4eb6f3bc4cf6c6047ce8d7ad)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/orderspay/paymode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "fid" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "amount" : "string",
    "amountBeforeTip" : "string",
    "applyPeople" : "string",
    "balanceAmount" : "string",
    "balanceLabel" : "string",
    "balanceSelected" : 0,
    "changeinfo" : "string",
    "contact_name" : "string",
    "contact_phone" : "string",
    "deductionUrl" : "string",
    "earlybird" : "object",
    "fee_details" : "string",
    "fid" : 0,
    "hotelName" : "string",
    "hotelRoom" : "string",
    "insuranceChange" : 0,
    "oid" : 0,
    "paymethod" : "string",
    "prepayPayInfo" : {
      "prepayPayTypeList" : [ {
        "amount" : "string",
        "amountBeforeTip" : "string",
        "bottomDesc" : "string",
        "explainTip" : "string",
        "explainUrl" : "string",
        "payType" : 0,
        "showPayType" : 0,
        "tip" : "string"
      } ]
    },
    "product_name" : "string",
    "refresh" : 0,
    "showBalance" : 0,
    "showBalanceV2" : 0,
    "showPayType" : 0,
    "showYxb" : 0,
    "starttime" : "string",
    "tip" : "string",
    "tipLabel" : "string",
    "yxbAmount" : 0.0,
    "yxbLabel" : "string",
    "yxbSelected" : 0
  },
  "msg" : "string"
}
```


<a name="alinotityusingpost_2"></a>
#### 支付宝回调-签证
```
POST /app/pay/notity/alipay
```


##### 说明
支付宝回调-签证<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.VisaPayController.aliNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/pay/notity/alipay
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="kqnotityusingget_2"></a>
#### 快钱回调-签证
```
GET /app/pay/notity/kuaiqian
```


##### 说明
快钱回调-签证<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.VisaPayController.kqNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/pay/notity/kuaiqian
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="wxnotityusingpost_2"></a>
#### 微信回调-签证
```
POST /app/pay/notity/wx
```


##### 说明
微信回调-签证<br/>public java.lang.String com.youxiake.yxkapp.controller.pay.VisaPayController.wxNotity() throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/pay/notity/wx
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="kuaiqianpayusingpost"></a>
#### 签证支付
```
POST /app/visa/pay
```


##### 说明
阿里返回：{
<br/>orderString:
<br/>errorUrl:
<br/>successUrl:<br/>}<br/>微信：{
<br/>appid:
<br/>partnerid:
<br/>prepayid:
<br/>package:
<br/>errorUrl:
<br/>successUrl:
<br/>noncestr:
<br/>timestamp:<br/>}<br/>快钱：{
<br/>html:<br/>}<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.pay.VisaPayController.kuaiqianPay(com.youxiake.model.master.common.vo.request.PayRq) throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**balanceAmount**  <br>*可选*|余额抵扣金额|number|
|**Query**|**channel**  <br>*必填*|1:支付宝 2:快钱 3:weixin|integer (int32)|
|**Query**|**fid**  <br>*可选*|追加费用id|integer (int32)|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|
|**Query**|**payType**  <br>*可选*|支付类型，如果前一个接口有的话传过来|integer (int32)|
|**Query**|**yxbAmount**  <br>*可选*|游侠币抵扣金额|number|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VisaCreateDealVO»](#e3578ec8a44223266baab29f1ee501a9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/pay
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "balanceAmount" : 0.0,
  "channel" : 0,
  "fid" : 0,
  "oid" : 0,
  "payType" : 0,
  "yxbAmount" : 0.0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "appId" : "string",
    "appid" : "string",
    "codeUrl" : "string",
    "errorUrl" : "string",
    "html" : "string",
    "isInnerPaySuccess" : 0,
    "net" : "string",
    "nonceStr" : "string",
    "noncestr" : "string",
    "orderString" : "string",
    "package" : "string",
    "partnerid" : "string",
    "paySign" : "string",
    "prepayid" : "string",
    "sign" : "string",
    "signType" : "string",
    "successUrl" : "string",
    "timeStamp" : "string",
    "timestamp" : 0
  },
  "msg" : "string"
}
```


<a name="46b4a9d08796189e9cad1318ab5a4366"></a>
### 攻略
News Controller


<a name="addcommentusingpost"></a>
#### 评论游侠攻略
```
POST /app/news/addcomment
```


##### 说明
评论游侠攻略 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.addcomment(java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)|`0`|
|**Query**|**content**  <br>*可选*|评论内容|integer (int32)|`1`|
|**Query**|**id**  <br>*可选*|攻略id|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/addcomment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "content" : 0,
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="deletecommentusingpost"></a>
#### 删除游侠攻略评论
```
POST /app/news/deletecomment
```


##### 说明
删除游侠攻略评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.deletecomment(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*可选*|评论id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/deletecomment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="detailusingget_3"></a>
#### 攻略详情
```
GET /app/news/detail
```


##### 说明
攻略详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.detail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**news_id**  <br>*必填*|攻略id|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«NewsDetailVO»](#3b06395816b9536353413040e44eaa2d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "news_id" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "author" : "string",
    "collectionNum" : 0,
    "desc" : "string",
    "from" : 0,
    "hasdri" : 0,
    "is_collection" : 0,
    "newdetail" : "string",
    "newscomment" : [ {
      "avatar" : "string",
      "comment_id" : 0,
      "content" : "string",
      "create_time" : "string",
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "isAuthor" : true,
      "isV" : true,
      "news_id" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "comment_id" : 0,
        "content" : "string",
        "create_time" : "string",
        "from" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "isAuthor" : true,
        "isV" : true,
        "news_id" : 0,
        "replyComments" : [ "..." ],
        "to" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      } ],
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "product_count" : 0,
    "share" : {
      "desc" : "string",
      "links" : "string",
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string",
      "thumb" : "string",
      "title" : "string"
    },
    "thumb" : "string",
    "title" : "string",
    "total" : 0,
    "totalPage" : 0,
    "view" : "string"
  },
  "msg" : "string"
}
```


<a name="detailcommentsusingget"></a>
#### 攻略详情评论分页列表
```
GET /app/news/detailcomments
```


##### 说明
攻略详情评论分页列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.detailcomments(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)|`0`|
|**Query**|**news_id**  <br>*可选*|攻略id|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`20`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DetailCommentVO»](#0d904e3f77f5c2da2359283e48e91d31)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/detailcomments
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "news_id" : 0,
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "currentPage" : 0,
    "newscomment" : [ {
      "avatar" : "string",
      "comment_id" : 0,
      "content" : "string",
      "create_time" : "string",
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "isAuthor" : true,
      "isV" : true,
      "news_id" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "comment_id" : 0,
        "content" : "string",
        "create_time" : "string",
        "from" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "isAuthor" : true,
        "isV" : true,
        "news_id" : 0,
        "replyComments" : [ "..." ],
        "to" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      } ],
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="directoryusingget"></a>
#### 攻略的目录
```
GET /app/news/directory
```


##### 说明
攻略的目录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.directory(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**gid**  <br>*可选*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DirectoryVO»](#e61cc728b1a88fb7f7b9a10e578d5ee2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/directory
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "htag" : [ {
        "name" : "string",
        "order" : {
          "num" : 0,
          "typs" : "string"
        }
      } ],
      "name" : "string",
      "order" : {
        "num" : 0,
        "typs" : "string"
      }
    } ],
    "name" : "string"
  },
  "msg" : "string"
}
```


<a name="favoriteusingpost"></a>
#### 收藏攻略
```
POST /app/news/favorite
```


##### 说明
收藏攻略<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.favorite(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**gid**  <br>*可选*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/favorite
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="favoritelistusingget"></a>
#### 攻略收藏列表
```
GET /app/news/favorite_list
```


##### 说明
攻略收藏列表 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.favoritelist(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`20`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FavoritListVO»](#82fb46d05fad99593a9b9278d6423b23)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/favorite_list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "newslist" : [ {
      "addtime" : 0,
      "comment" : 0,
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "view" : 0
    } ],
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="linesusingget_1"></a>
#### 攻略详情的线路和专题
```
GET /app/news/lines
```


##### 说明
攻略详情的线路和专题 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.lines(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**gid**  <br>*可选*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LinesVO»](#9a612ab35633d6cac22d8ce3973be9b7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/lines
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "document" : [ {
      "banner" : "string",
      "desc" : "string",
      "id" : "string",
      "pid" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "product" : [ {
      "days" : 0,
      "duration" : "string",
      "minpric" : "string",
      "nights" : 0,
      "pid" : "string",
      "place_label" : "string",
      "pro_pic" : "string",
      "productType" : "string",
      "statisticsCode" : "string",
      "title" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="listsusingget"></a>
#### 攻略列表
```
GET /app/news/lists
```


##### 说明
攻略列表 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.lists(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**isIndex**  <br>*可选*|是否首页头条|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`20`|
|**Query**|**place_id**  <br>*可选*|目的地id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«NewsVO»](#4317beed6b57ed93659c05462bace440)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/lists
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "isIndex" : 0,
  "page" : 0,
  "pageSize" : 0,
  "place_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "newsTheme" : {
      "coverUrl" : "string",
      "descripe" : "string",
      "headUrl" : "string",
      "id" : 0,
      "themeTitle" : "string",
      "travelTipTitle" : "string",
      "travelTipsNum" : 0,
      "type" : 0,
      "url" : "string",
      "views" : 0,
      "viewsLable" : "string"
    },
    "newslist" : [ {
      "author" : "string",
      "comment" : 0,
      "desc" : "string",
      "from" : 0,
      "label" : [ "string" ],
      "newdetail" : "string",
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "view" : "string"
    } ],
    "pageSize" : 0,
    "thumblist" : [ {
      "comment" : 0,
      "desc" : "string",
      "label" : [ "string" ],
      "labelStr" : "string",
      "newdetail" : "string",
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "view" : "string",
      "viewInt" : 0
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="placesusingget"></a>
#### 攻略目的地
```
GET /app/news/places
```


##### 说明
攻略目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.places()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PlaceVO»](#e8183e692f24e5780eaaf43c548eac64)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/places
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "pageSize" : 0,
    "placelist" : [ {
      "country_id" : 0,
      "name" : "string",
      "place_id" : 0,
      "type" : 0
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="postreportusingpost"></a>
#### 举报帖子
```
POST /app/news/postreport
```


##### 说明
举报帖子<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.postreport(java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**reason**  <br>*可选*|reason|string||
|**Query**|**rid**  <br>*可选*|攻略id|integer (int32)|`0`|
|**Query**|**tid**  <br>*可选*|举报类型|string|`"news"`|
|**Query**|**tid**  <br>*可选*|举报原因|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/postreport
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "reason" : "string",
  "rid" : 0,
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getrecommendinnewscontentusingget"></a>
#### 攻略详情带货列表
```
GET /app/news/recommend-in-content
```


##### 说明
攻略详情带货列表 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.getRecommendInNewsContent(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**gid**  <br>*可选*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«攻略带货卡片»](#173780dd7dbf3dda97bb31d8be4d7084)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/recommend-in-content
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "num" : 0,
    "recommendModules" : [ {
      "list" : [ "object" ],
      "name" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="reportusingpost_2"></a>
#### 攻略帖子
```
POST /app/news/report
```


##### 说明
攻略帖子<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.report(java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*可选*|攻略id|integer (int32)|`0`|
|**Query**|**module_type**  <br>*可选*|举报类型|string|`"news"`|
|**Query**|**reason**  <br>*可选*|举报原因|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0,
  "module_type" : "string",
  "reason" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="detailv2usingget"></a>
#### 攻略详情V2
```
GET /app/news/travel-tip-detail
```


##### 说明
攻略详情V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.detailV2(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**newsId**  <br>*必填*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«NewsDetailVO»](#3b06395816b9536353413040e44eaa2d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/travel-tip-detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "newsId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "author" : "string",
    "collectionNum" : 0,
    "desc" : "string",
    "from" : 0,
    "hasdri" : 0,
    "is_collection" : 0,
    "newdetail" : "string",
    "newscomment" : [ {
      "avatar" : "string",
      "comment_id" : 0,
      "content" : "string",
      "create_time" : "string",
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "isAuthor" : true,
      "isV" : true,
      "news_id" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "comment_id" : 0,
        "content" : "string",
        "create_time" : "string",
        "from" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "isAuthor" : true,
        "isV" : true,
        "news_id" : 0,
        "replyComments" : [ "..." ],
        "to" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      } ],
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "product_count" : 0,
    "share" : {
      "desc" : "string",
      "links" : "string",
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string",
      "thumb" : "string",
      "title" : "string"
    },
    "thumb" : "string",
    "title" : "string",
    "total" : 0,
    "totalPage" : 0,
    "view" : "string"
  },
  "msg" : "string"
}
```


<a name="traveltipshomedateusingget"></a>
#### 攻略首页数据
```
GET /app/news/travel-tips-home
```


##### 说明
攻略首页数据<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.travelTipsHomeDate(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TravelTipHomeVO»](#cbfd7367ef47e486d0859a93b269a3bd)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/travel-tips-home
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adCatalog" : {
      "destAds" : [ {
        "colorValue" : "string",
        "cover" : "string",
        "link" : "string",
        "mddDesc" : "string",
        "mddId" : 0,
        "mddName" : "string",
        "type" : 0
      } ],
      "list" : [ {
        "destAds" : [ {
          "colorValue" : "string",
          "cover" : "string",
          "link" : "string",
          "mddDesc" : "string",
          "mddId" : 0,
          "mddName" : "string",
          "type" : 0
        } ],
        "list" : [ "..." ],
        "plateDesc" : "string",
        "plateName" : "string"
      } ],
      "plateDesc" : "string",
      "plateName" : "string"
    },
    "pageSize" : 0,
    "theme" : {
      "descripe" : "string",
      "newsThemes" : [ {
        "coverUrl" : "string",
        "descripe" : "string",
        "headUrl" : "string",
        "id" : 0,
        "themeTitle" : "string",
        "travelTipTitle" : "string",
        "travelTipsNum" : 0,
        "type" : 0,
        "url" : "string",
        "views" : 0,
        "viewsLable" : "string"
      } ],
      "title" : "string",
      "total" : 0,
      "type" : 0
    },
    "thumblist" : [ {
      "comment" : 0,
      "desc" : "string",
      "label" : [ "string" ],
      "labelStr" : "string",
      "newdetail" : "string",
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "view" : "string",
      "viewInt" : 0
    } ],
    "total" : 0,
    "totalPage" : 0,
    "travelTipsAndDestList" : [ {
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="unfavoriteusingpost"></a>
#### 取消收藏攻略
```
POST /app/news/unfavorite
```


##### 说明
取消收藏攻略<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.unfavorite(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**gid**  <br>*可选*|攻略id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/unfavorite
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="viewusingpost"></a>
#### 用户攻略浏览
```
POST /app/news/view
```


##### 说明
用户攻略浏览<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsController.view(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**create_time**  <br>*可选*|create_time|integer (int32)|`0`|
|**Query**|**leave_time**  <br>*可选*|leave_time|integer (int32)|`0`|
|**Query**|**nid**  <br>*可选*|nid|integer (int32)|`0`|
|**Query**|**uid**  <br>*可选*|uid|integer (int32)|`0`|
|**Query**|**vid**  <br>*可选*|vid|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«int»](#ac2ebde87f19e340b49a5f87f378f635)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news/view
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "create_time" : 0,
  "leave_time" : 0,
  "nid" : 0,
  "uid" : 0,
  "vid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : 0,
  "msg" : "string"
}
```


<a name="594ecf135db4a9a3948e262fa949aedd"></a>
### 攻略主题
News Theme Controller


<a name="pagetraveltipsinthemeusingget"></a>
#### 攻略主题下的攻略列表
```
GET /app/news-theme/list-travel-tips
```


##### 说明
攻略主题下的攻略列表 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsThemeController.pageTravelTipsInTheme(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`10`|
|**Query**|**themeId**  <br>*必填*|主题id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«NewsVO»](#4317beed6b57ed93659c05462bace440)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news-theme/list-travel-tips
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0,
  "themeId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "newsTheme" : {
      "coverUrl" : "string",
      "descripe" : "string",
      "headUrl" : "string",
      "id" : 0,
      "themeTitle" : "string",
      "travelTipTitle" : "string",
      "travelTipsNum" : 0,
      "type" : 0,
      "url" : "string",
      "views" : 0,
      "viewsLable" : "string"
    },
    "newslist" : [ {
      "author" : "string",
      "comment" : 0,
      "desc" : "string",
      "from" : 0,
      "label" : [ "string" ],
      "newdetail" : "string",
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "view" : "string"
    } ],
    "pageSize" : 0,
    "thumblist" : [ {
      "comment" : 0,
      "desc" : "string",
      "label" : [ "string" ],
      "labelStr" : "string",
      "newdetail" : "string",
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "view" : "string",
      "viewInt" : 0
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="pagethemeusingget"></a>
#### 攻略主题列表
```
GET /app/news-theme/lists
```


##### 说明
攻略主题列表 <br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsThemeController.pageTheme(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`10`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PageVO»](#db2967874c4a9d2b21239ff4904796dd)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news-theme/lists
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ca08cc15fe53eb2cae800ebde937fd2d"></a>
### 攻略评论
News Comment Controller


<a name="detailcommentsv2usingget"></a>
#### 攻略详情评论分页列表-盖楼
```
GET /app/news-comment/page
```


##### 说明
攻略详情评论分页列表-盖楼<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.NewsCommentController.detailcommentsV2(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**commentId**  <br>*可选*|评论id|integer (int32)|`0`|
|**Query**|**newsId**  <br>*可选*|攻略id|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**pageSize**  <br>*可选*|页面大小|integer (int32)|`20`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DetailCommentVO»](#0d904e3f77f5c2da2359283e48e91d31)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/news-comment/page
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0,
  "newsId" : 0,
  "page" : 0,
  "pageSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "currentPage" : 0,
    "newscomment" : [ {
      "avatar" : "string",
      "comment_id" : 0,
      "content" : "string",
      "create_time" : "string",
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "isAuthor" : true,
      "isV" : true,
      "news_id" : 0,
      "replyComments" : [ {
        "avatar" : "string",
        "comment_id" : 0,
        "content" : "string",
        "create_time" : "string",
        "from" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "isAuthor" : true,
        "isV" : true,
        "news_id" : 0,
        "replyComments" : [ "..." ],
        "to" : {
          "avatar" : "string",
          "content" : "string",
          "create_time" : "string",
          "level" : "string",
          "uid" : 0,
          "username" : "string",
          "yxkCert" : [ {
            "certTitle" : "string",
            "certType" : "string"
          } ]
        },
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      } ],
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : "string",
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="92326850b70462f31f311f963a76bca5"></a>
### 权益卡产品
Card Product Controller


<a name="getcarduserlistusingget"></a>
#### 权益卡列表-个人中心
```
GET /app/card/user/list
```


##### 说明
权益卡列表-个人中心<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.CardProductController.getCardUserList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CardUserListVO»](#ddc16b312df5b8836e614287ed2ab926)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/card/user/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "alreadyHave" : 0,
      "cardName" : "string",
      "cover" : "string",
      "intro" : "string",
      "url" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="088f8cf56e63e2e7e36062952cddbedb"></a>
### 江泰保险调用
Remote Order Controller


<a name="insurancecallbackusingpost"></a>
#### 保险回调
```
POST /app/insurance/callback
```


##### 说明
保险回调<br/>public com.youxiake.model.master.remote.vo.JiangtaiResponseVO com.youxiake.yxkapp.controller.orders.RemoteOrderController.insuranceCallback(com.youxiake.model.master.insurance.vo.request.CallBackRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**encoding**  <br>*可选*||string|
|**Query**|**iocod**  <br>*可选*||string|
|**Query**|**ioid**  <br>*可选*||string|
|**Query**|**iomg**  <br>*可选*||string|
|**Query**|**rtmsg**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[JiangtaiResponseVO](#jiangtairesponsevo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/callback
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "encoding" : "string",
  "iocod" : "string",
  "ioid" : "string",
  "iomg" : "string",
  "rtmsg" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "message" : "string"
}
```


<a name="insuranceaccountchangeusingpost"></a>
#### 保险账户变动
```
POST /app/insurance/change
```


##### 说明
保险账户变动<br/>public com.youxiake.model.master.remote.vo.JiangtaiResponseVO com.youxiake.yxkapp.controller.orders.RemoteOrderController.insuranceAccountChange(com.youxiake.model.master.insurance.vo.request.InsuranceAccountChangeRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**request**  <br>*必填*|request|[InsuranceAccountChangeRQ](#insuranceaccountchangerq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[JiangtaiResponseVO](#jiangtairesponsevo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/insurance/change
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "data" : "string",
  "sign" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "message" : "string"
}
```


<a name="309bf93e0afbef1ac18e6c4c5c8d8aa5"></a>
### 活动倒计时
Countdown Task Controller


<a name="taskdetailusingget"></a>
#### 任务详情
```
GET /app/countdown/task/detail
```


##### 说明
任务详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.countdown.CountdownTaskController.taskDetail(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**taskCode**  <br>*可选*|任务编码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CountdownTaskDetailVO»](#2fe36982d42bf93f927036c34b77bbac)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/countdown/task/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "taskCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "androidUrl" : "string",
    "h5Url" : "string",
    "iosUrl" : "string",
    "taskCode" : "string",
    "taskIcon" : "string",
    "taskId" : 0,
    "taskName" : "string",
    "timer" : 0
  },
  "msg" : "string"
}
```


<a name="taskfinishedusingpost"></a>
#### 任务完成
```
POST /app/countdown/task/finished
```


##### 说明
任务完成<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.countdown.CountdownTaskController.taskFinished(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**h5String**  <br>*可选*|h5String|string|
|**Query**|**taskCode**  <br>*可选*|任务编码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/countdown/task/finished
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "h5String" : "string",
  "taskCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="8dd57d7609a4362a48411e7d7c19d005"></a>
### 消息通知
Order Message Controller


<a name="countusingget"></a>
#### 获取消息数量
```
GET /app/message/count
```


##### 说明
获取消息数量<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.CountMessageController.count()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MessageCountVo»](#1292baa76b41787f599699b4dd7dc839)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/count
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "all_bottom" : 0,
    "community_count" : 0,
    "community_time" : 0,
    "discoverCommentNum" : 0,
    "discoverFocusTab" : 0,
    "discoverLikeNum" : 0,
    "follower" : 0,
    "follower_time" : "string",
    "gmt_create" : 0,
    "orders_status" : 0,
    "orders_status_time" : 0,
    "orders_tours" : 0,
    "orders_tours_time" : 0,
    "private_count" : 0,
    "private_time" : 0,
    "system_count" : 0,
    "system_time" : 0,
    "zan_comment" : 0,
    "zan_comment_time" : 0
  },
  "msg" : "string"
}
```


<a name="interactionlistusingget"></a>
#### 获取互动消息
```
GET /app/message/interaction/list
```


##### 说明
获取互动消息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.InteractionMessageController.interactionList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«InteractionMessageVo»](#b9cfdf3bb5f4d7e0e59c564087eb5341)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/interaction/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "is_unread" : true,
    "notify" : [ {
      "action" : 0,
      "avatar" : "string",
      "cid" : 0,
      "content" : "string",
      "count" : 0,
      "f_content" : "string",
      "fcontent" : "string",
      "msg_id" : "string",
      "origin_content" : "string",
      "relation" : "string",
      "thumb" : "string",
      "timestamp" : 0,
      "title" : "string",
      "to" : 0,
      "to_title" : "string",
      "to_username" : "string",
      "type" : "string",
      "uid" : 0,
      "username" : "string"
    } ],
    "totalPage" : 0,
    "unread" : true
  },
  "msg" : "string"
}
```


<a name="meetlistusingget"></a>
#### 获取遇见消息
```
GET /app/message/meet/list
```


##### 说明
获取遇见消息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.MeetMessageController.meetList(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**lastid**  <br>*可选*|lastid|string|
|**Query**|**page**  <br>*可选*|当前页|string|
|**Query**|**type**  <br>*可选*|1：点赞，2：@和回复|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MeetMessageVo»](#a7914e23751b432124a198bd9d65c257)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/meet/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lastid" : "string",
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "history" : "string",
    "msgList" : [ {
      "avatar" : "string",
      "cid" : 0,
      "cover" : "string",
      "f_content" : "string",
      "fcontent" : "string",
      "gmt_create" : 0,
      "gmt_modify" : 0,
      "id" : 0,
      "is_send" : 0,
      "messageID" : 0,
      "origin_id" : 0,
      "send_from" : 0,
      "sex" : "string",
      "status" : "string",
      "to_uid" : 0,
      "to_username" : "string",
      "type" : "string",
      "uid" : 0,
      "username" : "string",
      "video" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="orderlistusingget"></a>
#### 获取订单消息
```
GET /app/message/order/list
```


##### 说明
获取订单消息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.OrderMessageController.orderList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**last_id**  <br>*可选*|last_id|string|
|**Query**|**page**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderMessageVo»](#2e076bab857d6779fa9c7401c6376208)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/order/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "last_id" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "messages" : [ {
      "action" : 0,
      "content" : "string",
      "descTitle" : "string",
      "handler" : "string",
      "handler_url" : "string",
      "is_read" : "string",
      "is_show" : 0,
      "msg_id" : 0,
      "oid" : 0,
      "timestamp" : "string",
      "title" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="systemclickusingpost"></a>
#### 点击改变系统消息状态
```
POST /app/message/system/click
```


##### 说明
点击改变系统消息状态<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.SystemMessageController.systemClick(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**msg_id**  <br>*必填*|msg_id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/system/click
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "msg_id" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="systemlistusingget"></a>
#### 获取系统消息
```
GET /app/message/system/list
```


##### 说明
获取系统消息列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.message.SystemMessageController.systemList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SystemMessageVo»](#0d345251a170b8cd378ef833e850cd2f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/message/system/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "notify" : [ {
      "action" : 0,
      "content" : "string",
      "detail" : "string",
      "gmt_create" : 0,
      "handler" : "string",
      "handler_type" : 0,
      "handler_url" : "string",
      "img" : "string",
      "is_read" : 0,
      "is_show" : 0,
      "msg_id" : 0,
      "origin_content" : "string",
      "origin_id" : 0,
      "origin_title" : "string",
      "pic" : "string",
      "price" : 0.0,
      "title" : "string",
      "tuid" : 0,
      "type" : 0,
      "uid" : 0,
      "url" : "string",
      "video" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="e720dafa52bd76eee1ab186d2e13dfe1"></a>
### 游侠运动
Athletics Controller


<a name="athleticsaddusingpost"></a>
#### 添加游侠运动记录
```
POST /app/athletics/add
```


##### 说明
添加游侠运动记录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.AthleticsController.athleticsAdd(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**step**  <br>*必填*|步数|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/athletics/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "step" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="athleticsindexusingget"></a>
#### 游侠运动记录
```
GET /app/athletics/index
```


##### 说明
游侠运动记录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.AthleticsController.athleticsIndex(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«AthleticsIndexItemVo»»»](#5a7d56fb4585544a13abceccfc0b4440)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/athletics/index
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "datetime" : 0,
      "deadTime" : 0,
      "ranks" : [ {
        "headImage" : "string",
        "name" : "string",
        "rank" : 0,
        "relation" : "string",
        "step_count" : 0,
        "uid" : 0
      } ],
      "self_rank" : {
        "headImage" : "string",
        "name" : "string",
        "rank" : 0,
        "relation" : "string",
        "step_count" : 0,
        "uid" : 0
      }
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="athleticsrankusingget"></a>
#### 游侠运动总排行
```
GET /app/athletics/rank
```


##### 说明
游侠运动总排行<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.AthleticsController.athleticsRank(java.lang.String,java.lang.Long,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**datetime**  <br>*可选*|时间|string|`"1"`|
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**type**  <br>*可选*|排行榜类型|string|`"all"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AthleticsRankVo»](#f5c28d5e448240fbdf91e072238d8a2f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/athletics/rank
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "datetime" : "string",
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "ranks" : [ {
      "headImage" : "string",
      "name" : "string",
      "rank" : 0,
      "relation" : "string",
      "step_count" : 0,
      "uid" : 0
    } ],
    "self_rank" : {
      "headImage" : "string",
      "name" : "string",
      "rank" : 0,
      "relation" : "string",
      "step_count" : 0,
      "uid" : 0
    },
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="athleticsselfusingget"></a>
#### 个人运动
```
GET /app/athletics/self
```


##### 说明
个人运动<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.AthleticsController.athleticsSelf(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*可选*|uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AthleticsSelfVo»](#20c628d7090875eba82213d7a027a7d5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/athletics/self
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avg_step" : 0,
    "headImage" : "string",
    "max_step" : 0,
    "name" : "string",
    "today_step" : 0,
    "total_step" : 0
  },
  "msg" : "string"
}
```


<a name="12c5d7b68c7272b64cc01c16c998bcf3"></a>
### 游记
Travelarticle Comments Controller


<a name="addtofavaritesusingpost_1"></a>
#### 收藏
```
POST /app/favorites/favarite
```


##### 说明
收藏<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.UserCommonFavoritesController.addToFavarites(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|游记主键ID|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/favorites/favarite
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="addcommentusingpost_1"></a>
#### 添加评论
```
POST /app/travelarticleComments/add
```


##### 说明
添加评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleCommentsController.addComment(java.lang.String,java.lang.String,java.lang.String) throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**message**  <br>*必填*|内容|string|
|**Query**|**quoteId**  <br>*必填*|被回复的评论的id|string|
|**Query**|**tid**  <br>*必填*|游记id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleComments/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "message" : "string",
  "quoteId" : "string",
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="deletecommentusingpost_1"></a>
#### 删除评论
```
POST /app/travelarticleComments/delete
```


##### 说明
删除评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleCommentsController.deleteComment(java.lang.Long,java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*必填*|评论id|integer (int32)|
|**Query**|**tid**  <br>*必填*|游记id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleComments/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : 0,
  "tid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getcommentslistusingget"></a>
#### 获取游记评论
```
GET /app/travelarticleComments/list
```


##### 说明
获取游记评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleCommentsController.getCommentsList(java.lang.Long,java.lang.Long,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*可选*|评论id|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|
|**Query**|**tid**  <br>*必填*|游记主键ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TravelarticleCommentsRespVo»](#a8b8c6836c9e857c270804e30846603c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleComments/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : "string",
  "curPage" : "string",
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "curPage" : 0,
    "list" : [ {
      "authorName" : "string",
      "authorid" : "string",
      "createdAt" : "string",
      "groupTitle" : "string",
      "message" : "string",
      "pid" : "string",
      "quoteHeadLine" : "string",
      "quoteId" : "string",
      "quoteMessage" : "string",
      "stars" : "string",
      "tid" : "string",
      "type" : "string",
      "userPic" : "string",
      "yxkid" : "string"
    } ],
    "recordCount" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getcatalogusingget"></a>
#### 游记详情-游记目录
```
GET /app/travelarticleContent/catalog
```


##### 说明
游记详情-游记目录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getCatalog(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|游记主键ID|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«string»»](#ab45821157c7c0be0d89f710d60ed785)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/catalog
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ "string" ]
  },
  "msg" : "string"
}
```


<a name="getcontentcountusingget"></a>
#### 发布游记-获取字数统计
```
GET /app/travelarticleContent/getContentCount
```


##### 说明
发布游记-获取字数统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getContentCount(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ContentCountResponseVo»](#d98c140eac5a3aed40ebb0627d22dbc4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/getContentCount
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "imageCount" : 0,
    "mvCount" : 0,
    "wordCount" : 0
  },
  "msg" : "string"
}
```


<a name="getteampersonusingget"></a>
#### 新增游记-出行信息团下面的用户获取
```
GET /app/travelarticleContent/getTeamPerson
```


##### 说明
新增游记-出行信息团下面的用户获取<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getTeamPerson(com.youxiake.model.yxkbbs.vo.request.TeamInfoRequestVO,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bus**  <br>*可选*|车次|integer (int32)|
|**Query**|**copyTeamId**  <br>*可选*|备用团id|integer (int32)|
|**Query**|**page**  <br>*可选*|当前页|string|
|**Query**|**teamId**  <br>*可选*|团id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«UserBasicInfo»»»](#cee83dd07c7f7841a6fa33c6009558ac)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/getTeamPerson
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bus" : 0,
  "copyTeamId" : 0,
  "page" : "string",
  "teamId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "email" : "string",
      "intro" : "string",
      "livecity" : "string",
      "liveprovince" : "string",
      "mobilePhone" : "string",
      "registTime" : "string",
      "sex" : 0,
      "status" : "string",
      "trueName" : "string",
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="gettraveleditdatausingget"></a>
#### 新增游记-获取游记编辑内容
```
GET /app/travelarticleContent/getTravelEditData
```


##### 说明
新增游记-获取游记编辑内容<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getTravelEditData(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«编辑页面内容»](#5be77b317fe9893f2907b13485ed8798)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/getTravelEditData
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "yxkid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "contentList" : [ {
      "auditStatus" : 0,
      "content" : "string",
      "id" : 0,
      "picInfo" : {
        "height" : "string",
        "width" : "string"
      },
      "seq" : 0,
      "thumb" : "string",
      "type" : "string",
      "typeValue" : "string"
    } ],
    "coverImage" : "string",
    "displayorder" : 0,
    "musicName" : "string",
    "musicUrl" : "string",
    "sort" : "string",
    "title" : "string",
    "yxkid" : 0
  },
  "msg" : "string"
}
```


<a name="gettravelinfousingpost"></a>
#### 新增游记-获取出行信息
```
POST /app/travelarticleContent/getTravelInfo
```


##### 说明
新增游记-获取出行信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getTravelInfo(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«出行信息»](#db4d9b889d18c7e11686b90dec15088e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/getTravelInfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "yxkid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "completionDetail" : [ 0 ],
    "completionValue" : "string",
    "contentLableMdds" : [ {
      "mainMdd" : true,
      "mddId" : 0,
      "mddName" : "string"
    } ],
    "countContent" : "string",
    "departureDate" : "string",
    "descContent" : "string",
    "displayorder" : 0,
    "leader" : true,
    "mddInfos" : [ {
      "mainMdd" : true,
      "mddId" : 0,
      "mddName" : "string"
    } ],
    "mddMaxSize" : 0,
    "myLeadedTeam" : [ {
      "bus" : 0,
      "copyTeamId" : 0,
      "endTime" : "string",
      "startTime" : "string",
      "teamDesc" : "string",
      "teamId" : 0
    } ],
    "myTeam" : [ {
      "bus" : 0,
      "copyTeamId" : 0,
      "endTime" : "string",
      "startTime" : "string",
      "teamDesc" : "string",
      "teamId" : 0
    } ],
    "sendMessage" : true,
    "tripDays" : "string",
    "tripPlace" : "string",
    "tripPrice" : "string",
    "tripType" : "string",
    "typeValues" : [ {
      "code" : "string",
      "title" : "string"
    } ],
    "vistorContent" : "string"
  },
  "msg" : "string"
}
```


<a name="getuploadtokenusingget_1"></a>
#### 新增游记-获取七牛token
```
GET /app/travelarticleContent/getUploadToken
```


##### 说明
新增游记-获取七牛token<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getUploadToken()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/getUploadToken
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="inserttravelinfousingpost"></a>
#### 新增游记-出行信息新增
```
POST /app/travelarticleContent/insertTravelInfo
```


##### 说明
新增游记-出行信息新增<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.insertTravelInfo(com.youxiake.model.yxkbbs.vo.request.TravelScheduleSaveVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**departureDate**  <br>*必填*|出发时间|string|
|**Query**|**leaderedUid**  <br>*可选*|领队带团下的用户通知id  例如1,2,3|string|
|**Query**|**mddInfos**  <br>*必填*|目的地,json字符串 （[{"mainMdd": true,"mddId": 16,"mddName": "杭州"}]）|string|
|**Query**|**myTeamUid**  <br>*可选*|同团好友id 例如1,2,3|string|
|**Query**|**shouldSync**  <br>*可选*|申请游记到攻略投稿  1为申请  0为不申请|integer (int32)|
|**Query**|**tripDays**  <br>*必填*|出发天数|string|
|**Query**|**tripPlace**  <br>*可选*|集合地|string|
|**Query**|**tripPrice**  <br>*可选*|人均费用|string|
|**Query**|**tripType**  <br>*必填*|人物|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/insertTravelInfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "departureDate" : "string",
  "leaderedUid" : "string",
  "mddInfos" : "string",
  "myTeamUid" : "string",
  "shouldSync" : 0,
  "tripDays" : "string",
  "tripPlace" : "string",
  "tripPrice" : "string",
  "tripType" : "string",
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="savecontentusingpost"></a>
#### 新增游记-保存游记内容
```
POST /app/travelarticleContent/saveContent
```


##### 说明
新增游记-保存游记内容<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.saveContent(com.youxiake.model.yxkbbs.vo.request.TravelarticleContentsRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*可选*|游记类容|string|
|**Query**|**picInfo**  <br>*可选*|图片信息 :例如 {<br>	"width": 700,<br>	"height": 600,<br>	"location": "加拿大",<br>	"url": "https://img3.youxiake.com/o_1bshl4gmumra1dg112usb6h1kjc18.jpg"<br>}|string|
|**Query**|**seq**  <br>*可选*|seq|integer (int64)|
|**Query**|**type**  <br>*可选*|游记类型 1文字 2段落标题 3图片 4视频|integer (int32)|
|**Query**|**yxkid**  <br>*可选*|yxkid|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/saveContent
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string",
  "picInfo" : "string",
  "seq" : 0,
  "type" : 0,
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="searchmddusingget"></a>
#### 新增游记-搜索目的地
```
GET /app/travelarticleContent/searchMdd
```


##### 说明
新增游记-搜索目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.searchMdd(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddName**  <br>*必填*|目的地|string|
|**Query**|**page**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«MddInfoVO»»»](#669984b59537d0f07fdce8a6da7fa8db)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/searchMdd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddName" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "mainMdd" : true,
      "mddId" : 0,
      "mddName" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="setimagemddusingpost"></a>
#### 新增游记-关联图片目的地
```
POST /app/travelarticleContent/setImageMdd
```


##### 说明
新增游记-关联图片目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.setImageMdd(java.lang.String,java.lang.Long,java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddName**  <br>*必填*|目的地|string|
|**Query**|**seq**  <br>*必填*|seq|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/setImageMdd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddName" : "string",
  "seq" : "string",
  "yxkid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="gettravellineusingget"></a>
#### 游记详情-推荐线路
```
GET /app/travelarticleContent/travelLine
```


##### 说明
游记详情-推荐线路<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleContentsController.getTravelLine(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|游记id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«ProductRecomendResponseVO»»](#bc4c4a638cff159e4f7409d0e9700501)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleContent/travelLine
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "adultprice" : 0.0,
      "class_theme_id" : 0,
      "days_label" : "string",
      "liangdian" : [ "string" ],
      "pid" : 0,
      "place_label" : "string",
      "price_label" : "string",
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "shortTitle" : "string",
      "statisticsCode" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="editcoverusingpost"></a>
#### 新增游记-编辑游记封面图
```
POST /app/travelarticleCovers/editCover
```


##### 说明
新增游记-编辑游记封面图<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleCoversController.editCover(com.youxiake.model.yxkbbs.vo.request.TravelarticleCoverRequestRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**seq**  <br>*可选*|seq|integer (int64)|
|**Query**|**url**  <br>*可选*|封面图地址|string|
|**Query**|**yxkid**  <br>*可选*|yxkid|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleCovers/editCover
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "seq" : 0,
  "url" : "string",
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="savetravelmusicusingpost"></a>
#### 新增游记-设置游记背景音乐
```
POST /app/travelarticleMusics/saveTravelMusic
```


##### 说明
新增游记-设置游记背景音乐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleMusicsController.saveTravelMusic(com.youxiake.model.yxkbbs.vo.request.TravelarticleMusicRequestVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**musicName**  <br>*可选*|音乐名称|string|
|**Query**|**url**  <br>*可选*|音乐链接|string|
|**Query**|**yxkid**  <br>*可选*|yxkid|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleMusics/saveTravelMusic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "musicName" : "string",
  "url" : "string",
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="sortusingpost"></a>
#### 新增游记-内容排序
```
POST /app/travelarticleSorts/sort
```


##### 说明
新增游记-内容排序<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticleSortsController.sort(com.youxiake.model.yxkbbs.vo.request.TravelarticleSortsRequestVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**seqs**  <br>*可选*|排序顺序（1,2,3）|string|
|**Query**|**yxkid**  <br>*可选*|yxkid|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticleSorts/sort
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "seqs" : "string",
  "yxkid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="checkcanwriteusingget"></a>
#### 判断是否能写草稿
```
GET /app/travelarticles/checkCanWrite
```


##### 说明
判断是否能写草稿<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.checkCanWrite()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/checkCanWrite
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="deletetravelusingpost"></a>
#### 删除游记或游记草稿
```
POST /app/travelarticles/deleteTravel
```


##### 说明
删除游记<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.deleteTravel(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**yxkid**  <br>*必填*|yxkid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/deleteTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "yxkid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="gettraveldetailusingget"></a>
#### 游记详情
```
GET /app/travelarticles/detail
```


##### 说明
游记详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.getTravelDetail(java.lang.Long) throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|游记主键ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TravelarticlesDetailVO»](#b37d596337abea9c147bb4bfe0406735)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "auditStatus" : 0,
    "authorName" : "string",
    "authorid" : "string",
    "contents" : [ {
      "auditStatus" : 0,
      "content" : "string",
      "id" : 0,
      "picInfo" : {
        "height" : "string",
        "width" : "string"
      },
      "seq" : 0,
      "thumb" : "string",
      "type" : "string",
      "typeValue" : "string"
    } ],
    "createdAt" : "string",
    "departureDate" : "string",
    "displayorder" : "string",
    "favorite" : true,
    "fid" : "string",
    "groupTitle" : "string",
    "identifyName" : "string",
    "mddName" : "string",
    "musicName" : "string",
    "musicUrl" : "string",
    "pic" : "string",
    "picUrl" : "string",
    "replies" : "string",
    "shareTip" : "string",
    "shareVo" : {
      "shareDesc" : "string",
      "shareImage" : "string",
      "shareTitle" : "string",
      "shareUrl" : "string"
    },
    "shouldComplete" : true,
    "stars" : "string",
    "tid" : "string",
    "title" : "string",
    "tripDays" : "string",
    "tripPlace" : "string",
    "tripPrice" : "string",
    "tripType" : "string",
    "views" : "string",
    "xiaKui" : true,
    "yxkid" : 0
  },
  "msg" : "string"
}
```


<a name="getdigesttravelusingget"></a>
#### 游记精华列表
```
GET /app/travelarticles/digestList
```


##### 说明
游记精华列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.getDigestTravel(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页面|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/digestList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getfavaritetravellistusingget_1"></a>
#### 游记收藏列表
```
GET /app/travelarticles/favariteTravelList
```


##### 说明
游记收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.getFavariteTravelList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/favariteTravelList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="savetitleusingpost"></a>
#### 新增游记-保存标题
```
POST /app/travelarticles/getOwnerTravel
```


##### 说明
新增游记-保存标题<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.saveTitle(java.lang.String,java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**title**  <br>*必填*|游记标题|string|
|**Query**|**yxkid**  <br>*可选*|yxkid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/getOwnerTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "title" : "string",
  "yxkid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getownertravelusingget"></a>
#### 用户游记列表
```
GET /app/travelarticles/getOwnerTravel
```


##### 说明
用户游记列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.getOwnerTravel(java.lang.Long,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|
|**Query**|**userId**  <br>*必填*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/getOwnerTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string",
  "userId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="listdraftboxtravelsusingget"></a>
#### 游记草稿箱
```
GET /app/travelarticles/get_travel_draft
```


##### 说明
游记草稿箱<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.listDraftBoxTravels(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页数|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelInDraftBoxVO»»»](#30d645c5ed3a461b1c03ad63a25cc6da)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/get_travel_draft
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "auditStatus" : 0,
      "fid" : "string",
      "imageAndVideo" : [ {
        "content" : "string",
        "type" : 0
      } ],
      "imageCount" : 0,
      "mddName" : "string",
      "tid" : 0,
      "title" : "string",
      "updateTime" : "string",
      "url" : "string",
      "yxkid" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getalltravelsusingget"></a>
#### 游记全部列表
```
GET /app/travelarticles/list
```


##### 说明
游记全部列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.getAllTravels(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页面|string|
|**Query**|**lastTid**  <br>*可选*|最后的游记tid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string",
  "lastTid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="reporttravelusingpost"></a>
#### 游记举报
```
POST /app/travelarticles/reportTravel
```


##### 说明
游记举报<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.reportTravel(java.lang.Long,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**messageType**  <br>*必填*|举报类型|string|
|**Query**|**tid**  <br>*必填*|游记id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/reportTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "messageType" : "string",
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="searchusingget"></a>
#### 搜索功能
```
GET /app/travelarticles/search
```


##### 说明
搜索功能<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.search(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**condition**  <br>*可选*|搜索条件|string|
|**Query**|**curPage**  <br>*可选*|当前页面|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/search
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "condition" : "string",
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="sharetravelusingpost"></a>
#### 游记分享
```
POST /app/travelarticles/share
```


##### 说明
游记分享<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.TravelarticlesController.shareTravel(java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|游记主键ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/travelarticles/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="04de696b3a122c17afa6798215213f21"></a>
### 游记V2版本
Travelarticles Controller V 2


<a name="getownertravelnewusingget"></a>
#### 用户游记列表-V2
```
GET /app/v2/travelarticles/getOwnerTravel
```


##### 说明
用户游记列表-V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.TravelarticlesControllerV2.getOwnerTravelNew(java.lang.Long,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|
|**Query**|**userId**  <br>*必填*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«草稿,List«TravelarticlesVo»»»](#c54663377528f01625968b2ed62c88e2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/travelarticles/getOwnerTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string",
  "userId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "name" : "string",
      "num" : 0,
      "type" : 0
    },
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="7d7a628ca413eb5413d575274c03d000"></a>
### 用户会员中心
Member Centre Controller


<a name="checkinusingpost"></a>
#### 签到
```
POST /app/user/checkin
```


##### 说明
签到<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.checkin()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CheckinSuccessVO»](#e90244e39c47f6bbcd9df9055a6ab0c7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkin
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "checkinRewardVOList" : [ {
      "rewardTip" : "string",
      "type" : 0
    } ],
    "dailyMaterialVO" : {
      "imgAuthor" : "string",
      "imgContent" : "string",
      "imgId" : 0,
      "imgUrl" : "string",
      "materialId" : 0,
      "receivedTime" : 0,
      "textAuthor" : "string",
      "textContent" : "string",
      "textId" : 0
    },
    "description" : "string",
    "dest" : {
      "id" : 0,
      "img" : "string",
      "name" : "string",
      "overView" : "string",
      "pointWord" : "string",
      "url" : "string"
    },
    "punchCount" : 0,
    "tomorrowDesc" : "string",
    "userAvatar" : "string",
    "userDaysNum" : 0,
    "userDaysTip" : "string",
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="checkincalendarusingget"></a>
#### 我的签到日历
```
GET /app/user/checkin/calendar
```


##### 说明
我的签到日历<br/>com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.checkinCalendar(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**calendarDate**  <br>*必填*|指定日期，如 2021-07-01 00:00:00|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«List«CheckinCalendarVO»»](#4409d2e1be5155bdd3a8f88b4fdcada2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkin/calendar
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "calendarDate" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "checkinStatus" : 0,
    "date" : "string",
    "dateTimestamp" : 0,
    "iconTip" : "string",
    "iconType" : 0,
    "integral" : 0
  } ],
  "msg" : "string"
}
```


<a name="checkindatausingget"></a>
#### 签到页
```
GET /app/user/checkinData
```


##### 说明
签到页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.checkinData()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CheckinVo»](#e506b589b2766397c4dee5307141774f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkinData
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "birthday" : "string",
    "canCheckin" : 0,
    "canPush" : 0,
    "checkinDays" : 0,
    "checkinRemindTip" : "string",
    "checkinRule" : "string",
    "constellation" : {
      "allDesc" : "string",
      "allRank" : 0,
      "careerDesc" : "string",
      "careerRank" : 0,
      "loveDesc" : "string",
      "loveRank" : 0,
      "mdd" : {
        "mddDesc" : "string",
        "mddId" : 0,
        "mddName" : "string",
        "mddPic" : "string",
        "type" : 0
      },
      "name" : "string",
      "nameCode" : "string",
      "wealthDesc" : "string",
      "wealthRank" : 0
    },
    "constellationCode" : "string",
    "constellationName" : "string",
    "dailyMaterialList" : [ {
      "imgAuthor" : "string",
      "imgContent" : "string",
      "imgId" : 0,
      "imgUrl" : "string",
      "materialId" : 0,
      "receivedTime" : 0,
      "textAuthor" : "string",
      "textContent" : "string",
      "textId" : 0
    } ],
    "dayIntegrals" : [ {
      "date" : "string",
      "day" : 0,
      "exp" : 0,
      "gold" : 0,
      "iconTip" : "string",
      "iconType" : 0,
      "integral" : 0
    } ],
    "duobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "endTime" : 0,
      "join" : true,
      "joinNum" : 0,
      "needCredit" : 0,
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "shouZhuFree" : true,
      "winStakes" : 0
    } ],
    "exchangeCoupon" : [ {
      "discountTip" : "string",
      "exchangeCouponId" : 0,
      "exchangeStatus" : 0,
      "imageUrl" : "string",
      "needCredit" : 0,
      "originalCredit" : 0,
      "price" : 0.0,
      "remainExchangeTime" : 0,
      "title" : "string"
    } ],
    "exchangeGoods" : [ {
      "discountTip" : "string",
      "exchangeCouponId" : 0,
      "exchangeStatus" : 0,
      "imageUrl" : "string",
      "needCredit" : 0,
      "originalCredit" : 0,
      "price" : 0.0,
      "remainExchangeTime" : 0,
      "title" : "string"
    } ],
    "incrIntegral" : 0,
    "mobileAds" : [ {
      "pic" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string",
      "titleColor" : "string"
    } ],
    "rewards" : {
      "excelTotal" : 0,
      "goldTotal" : 0,
      "integralTotal" : 0,
      "name" : "string",
      "rewards" : [ {
        "content" : [ {
          "message" : "string",
          "num" : 0,
          "rewardName" : "string",
          "type" : 0
        } ],
        "finishNum" : 0,
        "icon" : "string",
        "id" : 0,
        "isComplete" : true,
        "num" : 0,
        "rewardName" : "string",
        "url" : "string"
      } ]
    },
    "totalIntegral" : 0
  },
  "msg" : "string"
}
```


<a name="chooseconstellationusingpost"></a>
#### 星座日期选择
```
POST /app/user/constellation/choose
```


##### 说明
星座日期选择<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.chooseConstellation(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**day**  <br>*必填*|日|integer (int32)|
|**Query**|**month**  <br>*必填*|月|integer (int32)|
|**Query**|**year**  <br>*必填*|年|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«星座»](#a8c92d21fb8446e95a04a1505ebb61d1)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/constellation/choose
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "day" : 0,
  "month" : 0,
  "year" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "allDesc" : "string",
    "allRank" : 0,
    "careerDesc" : "string",
    "careerRank" : 0,
    "loveDesc" : "string",
    "loveRank" : 0,
    "mdd" : {
      "mddDesc" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "type" : 0
    },
    "name" : "string",
    "nameCode" : "string",
    "wealthDesc" : "string",
    "wealthRank" : 0
  },
  "msg" : "string"
}
```


<a name="constellationdetailusingget"></a>
#### 星座今日运势详情
```
GET /app/user/constellation/detail
```


##### 说明
星座今日运势详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.constellationDetail(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**nameCode**  <br>*必填*|星座code|string||
|**Query**|**page**  <br>*可选*|分页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ConstellationDetailVO»](#391c2078025b47781c87175983609c67)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/constellation/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "nameCode" : "string",
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "constellation" : {
      "allDesc" : "string",
      "allRank" : 0,
      "careerDesc" : "string",
      "careerRank" : 0,
      "loveDesc" : "string",
      "loveRank" : 0,
      "mdd" : {
        "mddDesc" : "string",
        "mddId" : 0,
        "mddName" : "string",
        "mddPic" : "string",
        "type" : 0
      },
      "name" : "string",
      "nameCode" : "string",
      "wealthDesc" : "string",
      "wealthRank" : 0
    },
    "discover" : [ {
      "activityType" : 0,
      "address" : "string",
      "avatar" : "string",
      "content" : "string",
      "cover" : "string",
      "discuss" : "string",
      "featured" : 0,
      "firstImg" : {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      },
      "isTalent" : true,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quoteId" : 0,
      "recordingDuration" : 0,
      "targetUrl" : "string",
      "uid" : 0,
      "uitype" : 0,
      "username" : "string",
      "video" : "string"
    } ],
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="creditsduobaousingget"></a>
#### 积分夺宝页
```
GET /app/user/credits/duobao
```


##### 说明
积分夺宝页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.creditsDuobao(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CreditsDuobaoVO»](#e9ff13b518da5568b2ff3fbb26974a27)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "historyDuobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "stake" : 0,
      "type" : 0,
      "winStakes" : 0
    } ],
    "notStartedDuobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoStartTime" : 0,
      "duobaoTitle" : "string",
      "num" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "subscribe" : true,
      "winStakes" : 0
    } ],
    "raiseDuobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "endTime" : 0,
      "join" : true,
      "joinNum" : 0,
      "needCredit" : 0,
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "shouZhuFree" : true,
      "winStakes" : 0
    } ],
    "recentDuobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "snakes" : 0,
      "type" : 0,
      "winStakes" : 0
    } ],
    "ruleDesc" : "string",
    "totalIntegral" : 0,
    "totalPage" : 0,
    "totalStakes" : 0,
    "userDuobaoLogs" : [ {
      "avatar" : "string",
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "joinTime" : 0,
      "stakes" : 0,
      "uid" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="duobaocheckbatnumusingpost"></a>
#### 校验夺宝下注次数
```
POST /app/user/credits/duobao/checkBatNum
```


##### 说明
校验夺宝下注次数<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.duobaoCheckBatNum()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/checkBatNum
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="duobaodetailusingget"></a>
#### 积分夺宝商品详情
```
GET /app/user/credits/duobao/detail
```


##### 说明
积分夺宝商品详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.duobaoDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**duobaoId**  <br>*必填*|夺宝活动id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DuobaoDetailVO»](#a1c38e3cd320a3ea3cbf918fc3753178)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "duobaoId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "duobao" : {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoStartTime" : 0,
      "duobaoTitle" : "string",
      "endTime" : 0,
      "expDay" : "string",
      "firstJoinTime" : "string",
      "flashPic" : [ "string" ],
      "joined" : true,
      "lotteryNumber" : "string",
      "maxStakes" : 0,
      "minPeopleNum" : 0,
      "needCredits" : 0,
      "newJoinUserAvatars" : [ "string" ],
      "nowPeopleNum" : 0,
      "num" : 0,
      "openTime" : 0,
      "owner" : {
        "avatar" : "string",
        "betTime" : 0,
        "luckyNumber" : [ 0 ],
        "username" : "string"
      },
      "peopleCount" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "productId" : 0,
      "recentJoinUser" : [ {
        "avatar" : "string",
        "betTime" : 0,
        "luckyNumber" : [ 0 ],
        "username" : "string"
      } ],
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "shouZhuFree" : true,
      "subscribe" : true,
      "tip" : {
        "differCredits" : 0,
        "luckyNumbers" : [ 0 ],
        "msg" : "string",
        "type" : 0
      },
      "totalCredits" : 0,
      "type" : 0,
      "win" : true,
      "winLuckyNumbers" : [ 0 ],
      "winStakes" : 0,
      "winUser" : [ {
        "avatar" : "string",
        "betTime" : 0,
        "luckyNumber" : [ 0 ],
        "username" : "string"
      } ]
    },
    "raiseDuobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "endTime" : 0,
      "join" : true,
      "joinNum" : 0,
      "needCredit" : 0,
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "shouZhuFree" : true,
      "winStakes" : 0
    } ],
    "recommendProducts" : [ {
      "cover" : "string",
      "priceLabel" : "string",
      "productId" : 0,
      "productName" : "string",
      "startPlace" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="duobaohistoryusingpost"></a>
#### 历史夺宝
```
POST /app/user/credits/duobao/history
```


##### 说明
历史夺宝<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.duobaoHistory(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«HistoryDuobaoVO»»»](#06bc57e02a295d8d274e55593f8b1b67)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/history
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "stake" : 0,
      "type" : 0,
      "winStakes" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="myselfjoinusingget"></a>
#### 我参与的夺宝
```
GET /app/user/credits/duobao/myselfJoin
```


##### 说明
我参与的夺宝<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.myselfJoin(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«MyselfDuobaoVO»»»](#12a596767963e5b3a9a5a4b902285953)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/myselfJoin
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "snakes" : 0,
      "type" : 0,
      "usedCredits" : 0,
      "win" : true,
      "winStakes" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="duobaoquitcheckusingpost"></a>
#### 夺宝首页退出校验
```
POST /app/user/credits/duobao/quitCheck
```


##### 说明
夺宝首页退出校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.duobaoQuitCheck()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/quitCheck
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="duobaoremindusingpost"></a>
#### 夺宝提醒
```
POST /app/user/credits/duobao/remind
```


##### 说明
夺宝提醒<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.duobaoRemind(java.lang.Integer,java.lang.Boolean)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**duobaoId**  <br>*必填*|夺宝活动id|integer (int32)|
|**Query**|**remind**  <br>*必填*|是否提醒|boolean|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/duobao/remind
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "duobaoId" : 0,
  "remind" : true
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="creditsmallusingget"></a>
#### 积分商城
```
GET /app/user/credits/mall
```


##### 说明
积分商城<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.creditsMall()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CreditsMallVO»](#e6c3566bdb0be0fb6eebab11bf8a4c02)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/mall
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "duobao" : [ {
      "cover" : "string",
      "duobaoId" : 0,
      "duobaoTitle" : "string",
      "endTime" : 0,
      "join" : true,
      "joinNum" : 0,
      "needCredit" : 0,
      "num" : 0,
      "openTime" : 0,
      "placeIssued" : "string",
      "price" : 0.0,
      "rewardUsers" : [ {
        "avatar" : "string",
        "openTime" : 0,
        "username" : "string"
      } ],
      "shouZhuFree" : true,
      "winStakes" : 0
    } ],
    "exchangeCoupon" : [ {
      "discountTip" : "string",
      "exchangeCouponId" : 0,
      "exchangeStatus" : 0,
      "imageUrl" : "string",
      "needCredit" : 0,
      "originalCredit" : 0,
      "price" : 0.0,
      "remainExchangeTime" : 0,
      "title" : "string"
    } ],
    "exchangeGoods" : [ {
      "discountTip" : "string",
      "exchangeCouponId" : 0,
      "exchangeStatus" : 0,
      "imageUrl" : "string",
      "needCredit" : 0,
      "originalCredit" : 0,
      "price" : 0.0,
      "remainExchangeTime" : 0,
      "title" : "string"
    } ],
    "incrIntegral" : 0,
    "mobileAds" : [ {
      "pic" : "string",
      "subTitle" : "string",
      "targetType" : "string",
      "targetUrl" : "string",
      "title" : "string",
      "titleColor" : "string"
    } ],
    "totalIntegral" : 0
  },
  "msg" : "string"
}
```


<a name="mallquitcheckusingpost"></a>
#### 积分商城退出校验
```
POST /app/user/credits/mall/quitCheck
```


##### 说明
积分商城退出校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.mallQuitCheck()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/credits/mall/quitCheck
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="dailymaterialdetailusingget"></a>
#### 我的每日一图详情
```
GET /app/user/daily/material/detail
```


##### 说明
我的每日一图详情<br/>com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.dailyMaterialDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**materialId**  <br>*必填*|每日一图id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserDailyMaterialDetailVO»](#fcc2d75fa03165f4f8933e4c239c030b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/daily/material/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "materialId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "imgAuthor" : "string",
    "imgContent" : "string",
    "imgId" : 0,
    "imgUrl" : "string",
    "materialId" : 0,
    "receivedTime" : 0,
    "textAuthor" : "string",
    "textContent" : "string",
    "textId" : 0,
    "userAvatar" : "string",
    "userDaysNum" : 0,
    "userDaysTip" : "string",
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="dailymateriallistusingget"></a>
#### 我的每日一图列表
```
GET /app/user/daily/material/list
```


##### 说明
我的每日一图列表<br/>com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.dailyMaterialList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*必填*|页码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DailyMaterialVO»»»](#615244cbfa192106dc54102fda7e41eb)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/daily/material/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "imgAuthor" : "string",
      "imgContent" : "string",
      "imgId" : 0,
      "imgUrl" : "string",
      "materialId" : 0,
      "receivedTime" : 0,
      "textAuthor" : "string",
      "textContent" : "string",
      "textId" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="luckynumberusingpost"></a>
#### 夺宝下注
```
POST /app/user/duobao/luckyNumber
```


##### 说明
夺宝下注<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.luckyNumber(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**duobaoId**  <br>*必填*|夺宝活动id|integer (int32)|
|**Query**|**stakes**  <br>*必填*|注数|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LucyNumberResultVO»](#e5ee1d83142f10e0c1d715e0b8b24535)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/duobao/luckyNumber
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "duobaoId" : 0,
  "stakes" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "differCredits" : 0,
    "luckyNumbers" : [ 0 ],
    "msg" : "string",
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="exchangelistusingget"></a>
#### 我的兑换列表
```
GET /app/user/exchange/list
```


##### 说明
我的兑换列表<br/>com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**exchangeType**  <br>*必填*|兑换物类型：1 代金券 2 实物|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«List«UserExchangeListVO»»](#6ffd8389eff659e536213f3e67208034)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchange/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "exchangeType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "exchangeId" : 0,
    "exchangeImage" : "string",
    "exchangeIntegral" : 0,
    "exchangeName" : "string",
    "exchangeTime" : "string",
    "price" : 0.0
  } ],
  "msg" : "string"
}
```


<a name="exchangecouponcheckusingpost"></a>
#### 兑换代金券校验
```
POST /app/user/exchangeCoupon/check
```


##### 说明
兑换代金券校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeCouponCheck()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchangeCoupon/check
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="exchangecoupondetailusingget"></a>
#### 兑换券详情
```
GET /app/user/exchangeCoupon/detail
```


##### 说明
兑换券详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeCouponDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**exchangeCouponId**  <br>*必填*|兑券活动id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ExchangeCouponDetailVO»](#7fb298d629fea5c3b8077505bc0b891b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchangeCoupon/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "exchangeCouponId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "conditionTip" : "string",
    "couponDesc" : "string",
    "couponTitle" : "string",
    "exchangeCouponId" : 0,
    "exchangeThreshold" : "string",
    "image" : "string",
    "joinThreshold" : "string",
    "myCredit" : 0,
    "needCredit" : 0,
    "originalCredit" : 0,
    "price" : 0.0,
    "remainExchangeTime" : 0,
    "title" : "string",
    "useCondition" : "string",
    "useValidity" : "string",
    "userVipLevel" : 0,
    "vipLevelDiscountList" : [ {
      "discount" : 0,
      "discountTip" : "string",
      "level" : 0,
      "levelName" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="exchangecouponusingget"></a>
#### 立即兑换
```
GET /app/user/exchangeCoupon/exchange
```


##### 说明
立即兑换<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeCoupon(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**exchangeCouponId**  <br>*必填*|兑券活动id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ExchangeCouponResultVO»](#1224c53a00df66d3b4b6d10cbbb65294)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchangeCoupon/exchange
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "exchangeCouponId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "consumeCredits" : 0,
    "detailId" : 0,
    "differCredits" : 0,
    "msg" : "string",
    "targetId" : 0,
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="exchangecouponlistusingget"></a>
#### 兑换券列表
```
GET /app/user/exchangeCoupon/list
```


##### 说明
兑换券列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeCouponList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**exchangeType**  <br>*必填*|兑换物类型：1 代金券 2 实物|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«ExchangeCouponVO»»](#05ce6b1d1360031975a1a6238976523a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchangeCoupon/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "exchangeType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "discountTip" : "string",
      "exchangeCouponId" : 0,
      "exchangeStatus" : 0,
      "imageUrl" : "string",
      "needCredit" : 0,
      "originalCredit" : 0,
      "price" : 0.0,
      "remainExchangeTime" : 0,
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="exchangecouponquitcheckusingpost"></a>
#### 兑券首页退出校验
```
POST /app/user/exchangeCoupon/quitCheck
```


##### 说明
兑券首页退出校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.exchangeCouponQuitCheck()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/exchangeCoupon/quitCheck
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="managepushusingpost"></a>
#### 开启或关闭推送
```
POST /app/user/managePush
```


##### 说明
开启或关闭推送<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.managePush()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/managePush
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="membercentreusingget"></a>
#### 会员中心
```
GET /app/user/memberCentre
```


##### 说明
会员中心<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.memberCentre()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MemberCentreRespVo»](#12f482d156516bd37cae32a1f043f35e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/memberCentre
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "community" : {
      "allLevels" : [ {
        "color" : "string",
        "exp" : 0,
        "getTime" : "string",
        "geted" : 0,
        "icon" : "string",
        "iconLg" : "string",
        "level" : 0,
        "levelName" : "string",
        "progressbar" : "string"
      } ],
      "curLevel" : {
        "color" : "string",
        "exp" : 0,
        "getTime" : "string",
        "geted" : 0,
        "icon" : "string",
        "iconLg" : "string",
        "level" : 0,
        "levelName" : "string",
        "progressbar" : "string"
      },
      "incrExp" : 0
    },
    "comsumption" : {
      "allLevels" : [ {
        "color" : "string",
        "comsumption" : 0,
        "geted" : 0,
        "icon" : "string",
        "iconLg" : "string",
        "interests" : [ {
          "desc" : "string",
          "geted" : 0,
          "icon" : "string",
          "serviceObject" : "string",
          "title" : "string"
        } ],
        "level" : 0,
        "levelName" : "string",
        "orderCount" : 0,
        "progressbar" : "string",
        "vipExpiration" : "string"
      } ],
      "curLevel" : {
        "color" : "string",
        "comsumption" : 0,
        "geted" : 0,
        "icon" : "string",
        "iconLg" : "string",
        "interests" : [ {
          "desc" : "string",
          "geted" : 0,
          "icon" : "string",
          "serviceObject" : "string",
          "title" : "string"
        } ],
        "level" : 0,
        "levelName" : "string",
        "orderCount" : 0,
        "progressbar" : "string",
        "vipExpiration" : "string"
      }
    },
    "extInfo" : {
      "avatar" : "string",
      "comsumption" : 0.0,
      "exp" : 0,
      "expBeyondPercent" : "string",
      "orderCount" : 0,
      "purchasesBeyondPercent" : "string",
      "username" : "string"
    },
    "medal" : [ {
      "geted" : 0,
      "img" : "string",
      "name" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="ownergoldusingget"></a>
#### 金币
```
GET /app/user/ownerGold
```


##### 说明
金币<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.ownerGold(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|integer (int32)|`1`|
|**Query**|**type**  <br>*可选*|类型 0 全部   1获得  2消耗  3冻结|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«GoldVo»](#fd7b183d07552d4fb670736264df387c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/ownerGold
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "details" : [ {
      "details" : [ {
        "time" : "string",
        "timeStamp" : 0,
        "title" : "string",
        "value" : 0.0
      } ],
      "timeGroup" : "string",
      "timeGroupStamp" : 0
    } ],
    "overdueTip" : "string",
    "overdueYxk" : "string",
    "total" : 0.0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ownerintegralusingget"></a>
#### 积分
```
GET /app/user/ownerIntegral
```


##### 说明
积分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.ownerIntegral(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|integer (int32)|`1`|
|**Query**|**type**  <br>*可选*|类型 0 全部   1获得  2消耗  3冻结|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«IntegralVo»](#0a8331047610d3a4eef21bf4543e3c8f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/ownerIntegral
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "details" : [ {
      "details" : [ {
        "time" : "string",
        "timeStamp" : 0,
        "title" : "string",
        "value" : 0.0
      } ],
      "timeGroup" : "string",
      "timeGroupStamp" : 0
    } ],
    "toExpireCredit" : 0,
    "total" : 0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="listrewardusingget"></a>
#### 任务列表
```
GET /app/user/reward/list
```


##### 说明
任务列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.MemberCentreController.listReward()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«RewardTaskListVO»](#8d54b66fb442cfa992b5b02c7264585b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reward/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "getedIntegral" : 0,
    "integralTotal" : 0,
    "rewards" : [ {
      "excelTotal" : 0,
      "goldTotal" : 0,
      "integralTotal" : 0,
      "name" : "string",
      "rewards" : [ {
        "content" : [ {
          "message" : "string",
          "num" : 0,
          "rewardName" : "string",
          "type" : 0
        } ],
        "finishNum" : 0,
        "icon" : "string",
        "id" : 0,
        "isComplete" : true,
        "num" : 0,
        "rewardName" : "string",
        "url" : "string"
      } ]
    } ]
  },
  "msg" : "string"
}
```


<a name="8f007f7317877174931d63fc1e56fd00"></a>
### 用户勋章
User Medal Controller


<a name="getadvancemedaldetailusingget"></a>
#### 晋级勋章详情
```
GET /app/medal/advanceMedalDetail
```


##### 说明
晋级勋章详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.getAdvanceMedalDetail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*必填*|勋章id|string|
|**Query**|**viewUid**  <br>*必填*|浏览的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AdvanceMedalDetail»](#5f7d77b0abc396b3ee8ca0c32bd2dcde)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/advanceMedalDetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : "string",
  "viewUid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "medals" : [ {
      "conditionDesc" : "string",
      "getTime" : "string",
      "getWay" : "string",
      "geted" : 0,
      "getedDesc" : "string",
      "getedNum" : 0,
      "level" : 0,
      "medalCategory" : 0,
      "medalDesc" : "string",
      "medalId" : 0,
      "personCount" : 0,
      "pic" : "string",
      "redirectTarget" : "string",
      "redirectTargetType" : "string",
      "title" : "string",
      "type" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="columnmedalusingget"></a>
#### 栏目下勋章
```
GET /app/medal/columnMedal
```


##### 说明
栏目下勋章<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.columnMedal(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**columnId**  <br>*必填*|栏目id|string|
|**Query**|**viewUid**  <br>*必填*|浏览的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«ColumnMedalVO»»](#10c8c5c6da2279c3bb7419997ce188f3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/columnMedal
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "columnId" : "string",
  "viewUid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "medals" : [ {
        "getTime" : "string",
        "getWay" : "string",
        "geted" : 0,
        "level" : 0,
        "medalDesc" : "string",
        "medalId" : 0,
        "num" : 0,
        "personCount" : 0,
        "pic" : "string",
        "progressbor" : "string",
        "title" : "string",
        "type" : 0
      } ],
      "num" : 0,
      "themeName" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="getconpoundmedaldetailusingget"></a>
#### 合成勋章详情
```
GET /app/medal/conpoundMedalDetail
```


##### 说明
合成勋章详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.getConpoundMedalDetail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*必填*|勋章id|string|
|**Query**|**viewUid**  <br>*必填*|浏览的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ConpoundMedalDetailVO»](#3590c6f02c7b22e034921d9a7f5dba25)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/conpoundMedalDetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : "string",
  "viewUid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "conpoundMedals" : [ {
      "conditionDesc" : "string",
      "getTime" : "string",
      "getWay" : "string",
      "geted" : 0,
      "getedDesc" : "string",
      "level" : 0,
      "medalCategory" : 0,
      "medalDesc" : "string",
      "medalId" : 0,
      "needCount" : 0,
      "personCount" : 0,
      "pic" : "string",
      "redirectTarget" : "string",
      "redirectTargetType" : "string",
      "title" : "string",
      "type" : 0,
      "username" : "string"
    } ],
    "count" : 0,
    "singleMedals" : [ {
      "conditionDesc" : "string",
      "getTime" : "string",
      "getWay" : "string",
      "geted" : 0,
      "getedDesc" : "string",
      "getedNum" : 0,
      "level" : 0,
      "medalCategory" : 0,
      "medalDesc" : "string",
      "medalId" : 0,
      "personCount" : 0,
      "pic" : "string",
      "redirectTarget" : "string",
      "redirectTargetType" : "string",
      "title" : "string",
      "type" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="medalhomeusingget"></a>
#### 勋章首页
```
GET /app/medal/medalHome
```


##### 说明
勋章首页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.medalHome(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**viewUid**  <br>*必填*|浏览的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MedalHomeVO»](#3ee49fed99313572248f55f37ff8bafe)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/medalHome
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "viewUid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "certificationImages" : [ "string" ],
    "certificationNum" : 0,
    "columnInfos" : [ {
      "columnId" : 0,
      "title" : "string"
    } ],
    "level" : 0,
    "medalCount" : 0,
    "talent" : true,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="productlineusingget"></a>
#### 勋章线路列表
```
GET /app/medal/productLine
```


##### 说明
勋章线路列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.productLine(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*必填*|勋章id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MedalProductLineVO»](#3a00a6e87978b07613fc4b39ccddf36a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/productLine
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "getWay" : "string",
    "level" : 0,
    "medalId" : 0,
    "needCount" : 0,
    "pic" : "string",
    "productLines" : [ {
      "products" : [ {
        "dataDetail" : "object",
        "identityCode" : "string",
        "indexFlowBangdanVo" : {
          "handler" : "string",
          "id" : 0,
          "image" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string",
          "url" : "string"
        },
        "indexFlowChannelVo" : {
          "handler" : "string",
          "image" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string",
          "typeImage" : "string",
          "typeImageV2" : "string",
          "url" : "string"
        },
        "indexFlowDiscoverVo" : {
          "address" : "string",
          "avatar" : "string",
          "did" : 0,
          "discus" : "string",
          "image" : "string",
          "numLabel" : "string",
          "prised" : 0,
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "talent" : 0,
          "title" : "string",
          "username" : "string"
        },
        "indexFlowFilmVo" : {
          "ad" : true,
          "address" : "string",
          "fid" : 0,
          "image" : "string",
          "mediaUrl" : "string",
          "numLabel" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "timeLabel" : "string",
          "title" : "string"
        },
        "indexFlowMddVo" : {
          "image" : "string",
          "mddId" : "string",
          "numLabel" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string"
        },
        "indexFlowNewsVo" : {
          "ad" : true,
          "image" : "string",
          "newsId" : 0,
          "numLabel" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string"
        },
        "indexFlowProductVo" : {
          "ageLabel" : "string",
          "days" : "string",
          "image" : "string",
          "liangdian" : [ "string" ],
          "listColor" : "string",
          "listColorV2" : "string",
          "listImgUrl" : "string",
          "listImgUrlV2" : "string",
          "marketingIco" : "string",
          "marketingList" : [ "string" ],
          "marketingTag" : "string",
          "numLabel" : "string",
          "outDoorLabel" : "string",
          "pid" : 0,
          "placeLabel" : "string",
          "priceLabel" : "string",
          "productCat" : "string",
          "productType" : "string",
          "saleOne" : {
            "detailRemark" : "string",
            "otId" : 0,
            "shortRemark" : "string",
            "type" : 0
          },
          "saleOtherList" : [ {
            "detailRemark" : "string",
            "otId" : 0,
            "shortRemark" : "string",
            "type" : 0
          } ],
          "salePriceLabel" : "string",
          "statisticsCode" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string",
          "type" : 0,
          "typetwoOrCat" : "string"
        },
        "indexFlowTravelarticleVo" : {
          "avatar" : "string",
          "image" : "string",
          "numLabel" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "talent" : 0,
          "tid" : 0,
          "title" : "string",
          "username" : "string"
        },
        "indexFlowVoucherVo" : {
          "handler" : "string",
          "image" : "string",
          "liangdian" : [ "string" ],
          "pid" : 0,
          "priceLabel" : "string",
          "salePriceLabel" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string",
          "url" : "string"
        },
        "indexFlowZhuantiVo" : {
          "blurColor" : "string",
          "handler" : "string",
          "id" : 0,
          "image" : "string",
          "subTitle" : "string",
          "tagList" : [ "string" ],
          "title" : "string",
          "url" : "string"
        },
        "type" : 0
      } ],
      "title" : "string"
    } ],
    "title" : "string",
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="shareusingget_1"></a>
#### 分享勋章墙
```
GET /app/medal/share
```


##### 说明
分享勋章墙<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.share()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MedalHomeShareVO»](#2c690b23e81688b76b6924963c256f30)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/share
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "certificationImages" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ],
    "certificationNum" : 0,
    "codeImg" : "string",
    "intro" : "string",
    "level" : 0,
    "medalCount" : 0,
    "talent" : true,
    "themeMedals" : [ {
      "medals" : [ {
        "getTime" : "string",
        "getWay" : "string",
        "geted" : 0,
        "level" : 0,
        "medalDesc" : "string",
        "medalId" : 0,
        "num" : 0,
        "personCount" : 0,
        "pic" : "string",
        "progressbor" : "string",
        "title" : "string",
        "type" : 0
      } ],
      "num" : 0,
      "themeName" : "string"
    } ],
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="sharemedalusingget_1"></a>
#### 勋章分享
```
GET /app/medal/shareMedal
```


##### 说明
勋章分享<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.shareMedal(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*必填*|勋章id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MedalShareVO»](#6dc56a9fcb9420f98eb464f3497f8baa)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/shareMedal
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "codeImg" : "string",
    "getTime" : "string",
    "getedDesc" : "string",
    "level" : 0,
    "logo" : "string",
    "medalDesc" : "string",
    "medalId" : 0,
    "medalLevel" : 0,
    "pic" : "string",
    "talent" : true,
    "title" : "string",
    "type" : 0,
    "uid" : 0,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="getsingmedaldetailusingget"></a>
#### 独立勋章详情
```
GET /app/medal/singMedalDetail
```


##### 说明
独立勋章详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserMedalController.getSingMedalDetail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*必填*|勋章id|string|
|**Query**|**viewUid**  <br>*必填*|浏览的用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«SingleMedalDetailVO»](#76096f63dffe607a66f426fe5124aff0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/medal/singMedalDetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : "string",
  "viewUid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "conditionDesc" : "string",
    "getTime" : "string",
    "getWay" : "string",
    "geted" : 0,
    "getedDesc" : "string",
    "getedNum" : 0,
    "level" : 0,
    "medalCategory" : 0,
    "medalDesc" : "string",
    "medalId" : 0,
    "personCount" : 0,
    "pic" : "string",
    "redirectTarget" : "string",
    "redirectTargetType" : "string",
    "title" : "string",
    "type" : 0,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="da6c80ee54f9891394cce67e7d9d36b3"></a>
### 用户奖品管理
User Prize Controller


<a name="haitao"></a>
#### 用户中心-积分兑换历史
```
GET /app/member/prize/history
```


##### 说明
用户中心-积分兑换历史<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserPrizeController.getUserPrizeHistory(com.youxiake.model.master.user.vo.request.UserPrizeHistoryGetRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页码|integer (int32)|
|**Query**|**type**  <br>*可选*|兑换类型：1-积分兑换 2-其他兑换|integer (int32)|
|**Query**|**uid**  <br>*可选*|用户id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OfficePagerVO«List«UserPrizeHistoryVO»»»](#8da8ba2e6a6bed80899e05d0e01ed323)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/member/prize/history
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "type" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "activityName" : "string",
      "amount" : 0.0,
      "costCredit" : 0,
      "couponCategory" : 0,
      "createdAt" : "string",
      "exchangeType" : 0,
      "imageUrl" : "string",
      "name" : "string"
    } ],
    "pager" : {
      "pageSize" : 0,
      "totalPage" : 0,
      "totalRow" : 0
    }
  },
  "msg" : "string"
}
```


<a name="08e52bcc75598bc4ab019de6702d1a81"></a>
### 用户收货地址
User Address Controller


<a name="addressdeleteusingpost"></a>
#### 删除收货地址
```
POST /app/user/address/delete
```


##### 说明
删除收货地址<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserAddressController.addressDelete(com.youxiake.model.master.user.vo.request.AddressDeleteRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**rq**  <br>*必填*|rq|[AddressDeleteRQ](#addressdeleterq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/address/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="addressdetailusingget"></a>
#### 收货地址详情
```
GET /app/user/address/detail
```


##### 说明
收货地址详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserAddressController.addressDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|收货地址ID|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AddressDetailVO»](#201876c8b1077a568b78de7137a68f5b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/address/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "area" : {
      "city" : {
        "name" : "string",
        "value" : 0
      },
      "province" : {
        "name" : "string",
        "value" : 0
      },
      "xian" : {
        "name" : "string",
        "value" : 0
      }
    },
    "id" : 0,
    "phone" : "string",
    "receiver" : "string",
    "status" : 0
  },
  "msg" : "string"
}
```


<a name="addresslistusingget"></a>
#### 收货地址列表
```
GET /app/user/address/list
```


##### 说明
收货地址列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserAddressController.addressList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«List«AddressListVO»»](#1cc0f657ef365b61ecf65e4d57c34109)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/address/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "address" : "string",
    "default" : 0,
    "id" : 0,
    "phone" : "string",
    "receiver" : "string"
  } ],
  "msg" : "string"
}
```


<a name="addresssaveusingpost"></a>
#### 新增或者编辑收货地址
```
POST /app/user/address/save
```


##### 说明
新增或者编辑收货地址<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserAddressController.addressSave(com.youxiake.model.master.user.vo.request.AddressSaveRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**rq**  <br>*必填*|rq|[AddressSaveRQ](#addresssaverq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AddressDetailVO»](#201876c8b1077a568b78de7137a68f5b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/address/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "address" : "string",
  "cityId" : 0,
  "id" : 0,
  "isDefault" : 0,
  "phone" : "string",
  "provinceId" : 0,
  "receiver" : "string",
  "xianId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "area" : {
      "city" : {
        "name" : "string",
        "value" : 0
      },
      "province" : {
        "name" : "string",
        "value" : 0
      },
      "xian" : {
        "name" : "string",
        "value" : 0
      }
    },
    "id" : 0,
    "phone" : "string",
    "receiver" : "string",
    "status" : 0
  },
  "msg" : "string"
}
```


<a name="addresssetdefaultusingpost"></a>
#### 设置默认收货地址
```
POST /app/user/address/setDefault
```


##### 说明
设置默认收货地址<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserAddressController.addressSetDefault(com.youxiake.model.master.user.vo.request.AddressSetDefaultRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Body**|**rq**  <br>*必填*|rq|[AddressSetDefaultRQ](#addresssetdefaultrq)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«AddressDetailVO»](#201876c8b1077a568b78de7137a68f5b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/address/setDefault
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "area" : {
      "city" : {
        "name" : "string",
        "value" : 0
      },
      "province" : {
        "name" : "string",
        "value" : 0
      },
      "xian" : {
        "name" : "string",
        "value" : 0
      }
    },
    "id" : 0,
    "phone" : "string",
    "receiver" : "string",
    "status" : 0
  },
  "msg" : "string"
}
```


<a name="7d023d072627d0ad0df10e5da8fdfeaa"></a>
### 用户管理
Login Controller


<a name="userfansusingget"></a>
#### 粉丝列表
```
GET /app/n/user/fans
```


##### 说明
粉丝列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userFans(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**uid**  <br>*必填*|uid|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserFansVo»](#6220c583a57a8722198b601374be2954)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/fans
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "is_unread" : 0,
    "pageSize" : 0,
    "totalPage" : 0,
    "userList" : [ {
      "avatar" : "string",
      "intro" : "string",
      "relation" : "string",
      "sex" : 0,
      "tags" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="userfollowusingget"></a>
#### 关注列表
```
GET /app/n/user/follow
```


##### 说明
关注列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userFollow(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**uid**  <br>*必填*|uid|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserFansVo»](#6220c583a57a8722198b601374be2954)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/follow
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "is_unread" : 0,
    "pageSize" : 0,
    "totalPage" : 0,
    "userList" : [ {
      "avatar" : "string",
      "intro" : "string",
      "relation" : "string",
      "sex" : 0,
      "tags" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="usermyselfusingget_2"></a>
#### 个人中心-无登陆
```
GET /app/n/user/myself
```


##### 说明
个人中心-无登陆<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userMyself()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MyselfNoLoginVo»](#eea3a9df38ae68a3096f24735cad4ddf)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/myself
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adverts" : [ {
      "exp" : 0,
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "recommendList" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ]
  },
  "msg" : "string"
}
```


<a name="usersetcidusingpost"></a>
#### 记录用户的cid
```
POST /app/n/user/setcid
```


##### 说明
记录用户的cid<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userSetcid(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**cid**  <br>*必填*|cid|string|
|**Query**|**device_id**  <br>*必填*|device_id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/setcid
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "cid" : "string",
  "device_id" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usersimplicityinfousingget"></a>
#### 查询指定用户的信息-废弃
```
GET /app/n/user/simplicity/info
```


##### 说明
查询指定用户的信息-废弃<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userSimplicityInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*必填*|uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserSimplicityInfoVo»](#59f426a739af10f181b19d04dd658155)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/simplicity/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "nick" : "string",
    "uid" : 0
  },
  "msg" : "string"
}
```


<a name="usersummeryusingget"></a>
#### 用户简介
```
GET /app/n/user/summery
```


##### 说明
用户简介<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userSummery(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*必填*|uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserSummeryVo»](#d8c56bc3bbfa9679bce1a1eb8a73031a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/summery
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "appBgPic" : "string",
    "avatar" : "string",
    "bgPic" : "string",
    "communityLevel" : "string",
    "countFollower" : "string",
    "countFollowing" : "string",
    "countPhoto" : 0,
    "countPost" : 0,
    "countQuote" : "string",
    "draftBox" : [ {
      "name" : "string",
      "num" : 0,
      "type" : 0
    } ],
    "email" : "string",
    "grouptitle" : "string",
    "homepage" : "string",
    "intro" : "string",
    "isTalent" : true,
    "is_show_share" : 0,
    "medalNum" : 0,
    "mobile" : "string",
    "myMedalUrl" : "string",
    "newhomepage" : "string",
    "newintro" : "string",
    "nick" : "string",
    "relation" : "string",
    "sex" : 0,
    "small_avatar" : "string",
    "tags" : [ {
      "tagcolor" : "string",
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "uid" : 0,
    "userTravelInfoVO" : {
      "cityNum" : "string",
      "countryNameStr" : "string",
      "countryNum" : "string"
    },
    "username" : "string",
    "yxkCert" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="usersummeryverifyusingget"></a>
#### 用户简介-带校验隐私设置
```
GET /app/n/user/summery/verify
```


##### 说明
用户简介-带校验隐私设置<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserNoAuthController.userSummeryVerify(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*必填*|uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserSummeryVo»](#d8c56bc3bbfa9679bce1a1eb8a73031a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/user/summery/verify
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "appBgPic" : "string",
    "avatar" : "string",
    "bgPic" : "string",
    "communityLevel" : "string",
    "countFollower" : "string",
    "countFollowing" : "string",
    "countPhoto" : 0,
    "countPost" : 0,
    "countQuote" : "string",
    "draftBox" : [ {
      "name" : "string",
      "num" : 0,
      "type" : 0
    } ],
    "email" : "string",
    "grouptitle" : "string",
    "homepage" : "string",
    "intro" : "string",
    "isTalent" : true,
    "is_show_share" : 0,
    "medalNum" : 0,
    "mobile" : "string",
    "myMedalUrl" : "string",
    "newhomepage" : "string",
    "newintro" : "string",
    "nick" : "string",
    "relation" : "string",
    "sex" : 0,
    "small_avatar" : "string",
    "tags" : [ {
      "tagcolor" : "string",
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "uid" : 0,
    "userTravelInfoVO" : {
      "cityNum" : "string",
      "countryNameStr" : "string",
      "countryNum" : "string"
    },
    "username" : "string",
    "yxkCert" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="jxbai"></a>
#### 获取添加出行人小程序二维码
```
GET /app/passenger/add/mini/code
```


##### 说明
获取添加出行人小程序二维码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.getAddMemberMiniCodeUrl()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BargainShareVo»](#676c1adf5015a50317a09e88d769ac87)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/passenger/add/mini/code
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "imgUrl" : "string",
    "miniAppId" : "string",
    "miniUrl" : "string",
    "title" : "string"
  },
  "msg" : "string"
}
```


<a name="passengerdeleteusingpost"></a>
#### 删除常用户
```
POST /app/passenger/delete
```


##### 说明
删除常用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.passengerDelete(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mid**  <br>*必填*|mid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/passenger/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="passengerlistusingget"></a>
#### 常用户列表
```
GET /app/passenger/list
```


##### 说明
常用户列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.passengerList(com.youxiake.model.master.user.vo.request.PassengerListRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|批次id|integer (int32)|
|**Query**|**page**  <br>*可选*|页码|integer (int32)|
|**Query**|**pid**  <br>*可选*|产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PassengerListVO»](#63ffd914d0877e3ffd6680669e9e34c1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/passenger/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "page" : 0,
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "idcardRecognize" : 0,
    "identitys" : [ {
      "desc" : "string",
      "typeId" : 0,
      "typeName" : "string"
    } ],
    "passengerList" : [ {
      "area_name" : "string",
      "bindCardList" : [ "string" ],
      "birth" : 0,
      "birthStr" : "string",
      "cardName" : "string",
      "cardToast" : "string",
      "cardexp" : 0,
      "cardno" : "string",
      "cardnoHideAfter" : "string",
      "cardtype" : 0,
      "defaultUsed" : 0,
      "firstAidCardId" : 0,
      "mid" : 0,
      "name" : "string",
      "nameToast" : "string",
      "passport_area" : 0,
      "passport_cid" : 0,
      "phone" : "string",
      "phoneToast" : "string",
      "sex" : 0,
      "showCardno" : "string",
      "toast" : "string",
      "type" : 0,
      "warnToast" : "string"
    } ],
    "passportRecognize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="passengersaveusingpost"></a>
#### 新增或修改常用户
```
POST /app/passenger/save
```


##### 说明
新增或修改常用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.passengerSave(com.youxiake.model.master.user.vo.PassengerSaveVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**birth**  <br>*可选*|生日时间戳|integer (int64)|
|**Query**|**cardexp**  <br>*可选*|护照有效日期|integer (int64)|
|**Query**|**cardno**  <br>*可选*|证件号|string|
|**Query**|**cardtype**  <br>*可选*|证件类型1、二代身份证2、护照3、港澳通行证4、台胞证5、军官证6、回乡证7、其他（儿童）8、港澳居民居住证|integer (int32)|
|**Query**|**firstAidCardRQ**  <br>*可选*|医疗急救卡|string|
|**Query**|**mid**  <br>*可选*|mid|integer (int32)|
|**Query**|**name**  <br>*可选*|常用联系人姓名|string|
|**Query**|**passport_issued**  <br>*可选*|护照签发地cityid|integer (int32)|
|**Query**|**phone**  <br>*可选*|手机号|string|
|**Query**|**sex**  <br>*可选*|性别|integer (int32)|
|**Query**|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PassengerListItemVO»](#ce66b091e2316ac6b57348400217d711)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/passenger/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "birth" : 0,
  "cardexp" : 0,
  "cardno" : "string",
  "cardtype" : 0,
  "firstAidCardRQ" : "{\n  \"allergyHistory\": \"\",\n  \"blood\": \"\",\n  \"firstAidCardId\": 0,\n  \"height\": 0,\n  \"linkname\": \"\",\n  \"medicalHistory\": \"\",\n  \"phone\": \"\",\n  \"relation\": 0,\n  \"weight\": 0\n}",
  "mid" : 0,
  "name" : "string",
  "passport_issued" : 0,
  "phone" : "string",
  "sex" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "area_name" : "string",
    "bindCardList" : [ "string" ],
    "birth" : 0,
    "birthStr" : "string",
    "cardName" : "string",
    "cardToast" : "string",
    "cardexp" : 0,
    "cardno" : "string",
    "cardnoHideAfter" : "string",
    "cardtype" : 0,
    "defaultUsed" : 0,
    "firstAidCardId" : 0,
    "mid" : 0,
    "name" : "string",
    "nameToast" : "string",
    "passport_area" : 0,
    "passport_cid" : 0,
    "phone" : "string",
    "phoneToast" : "string",
    "sex" : 0,
    "showCardno" : "string",
    "toast" : "string",
    "type" : 0,
    "warnToast" : "string"
  },
  "msg" : "string"
}
```


<a name="privacyadpushusingpost"></a>
#### 隐私设置-个性化推荐开关
```
POST /app/privacy/ad-push
```


##### 说明
隐私设置-个性化推荐开关<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacyAdPush(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**open**  <br>*必填*|1：打开 0：关闭|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/ad-push
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "open" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="privacyallowviewusingpost"></a>
#### 隐私设置-允许他人通过报名名单查看个人信息开关
```
POST /app/privacy/allowView
```


##### 说明
隐私设置-允许他人通过报名名单查看个人信息开关<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacyAllowView(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**open**  <br>*必填*|1：打开 0：关闭|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/allowView
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "open" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="privacylistusingget"></a>
#### 隐私设置开关列表
```
GET /app/privacy/list
```


##### 说明
隐私设置开关列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacyList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PrivacyListVo»](#190020b33f4d72234298ccc74c7c375b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adPushStatus" : 0,
    "allowView" : 0,
    "evaluateRecommend" : 0,
    "evaluateRecommendLabel" : "string",
    "recommend" : 0
  },
  "msg" : "string"
}
```


<a name="privacyusingpost"></a>
#### 隐私设置-开关
```
POST /app/privacy/onoff
```


##### 说明
隐私设置-开关<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacy(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**open**  <br>*必填*|1：打开 0：关闭|string|
|**Query**|**type**  <br>*必填*|1：允许他人通过报名名单查看个人信息开关 2：允许评价内容被推荐后同步至我的遇见|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/onoff
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "open" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="privacyrecommendusingpost"></a>
#### 隐私设置-推荐消息开关
```
POST /app/privacy/recommend
```


##### 说明
隐私设置-推荐消息开关<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacyRecommend(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**open**  <br>*必填*|1：打开 0：关闭|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "open" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="privacyshowbookingusingpost"></a>
#### 隐私设置-显示活动报名开关
```
POST /app/privacy/showbooking
```


##### 说明
隐私设置-显示活动报名开关<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.privacyShowbooking(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**booking_privacy**  <br>*必填*|booking_privacy|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/privacy/showbooking
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "booking_privacy" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="accountdetalsusingget"></a>
#### 用户账户余额明细
```
GET /app/user/account/details
```


##### 说明
用户账户余额明细<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.accountDetals(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*必填*|页数|string|
|**Query**|**type**  <br>*必填*|0全部1充值2使用|string|
|**Query**|**uid**  <br>*必填*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserAccountDetailVO»](#7fe99923c29d3405c5f7b31095d79f3c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/account/details
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "type" : "string",
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "account" : 0.0,
    "accountStr" : "string",
    "curMinMonth" : "string",
    "page" : 0,
    "totalPage" : 0,
    "userDetailBeans" : [ {
      "details" : [ {
        "amount" : 0.0,
        "amountAfter" : 0.0,
        "amountAfterStr" : "string",
        "amountBefore" : 0.0,
        "amountBeforeStr" : "string",
        "amountStr" : "string",
        "channel" : 0,
        "createdAt" : "string",
        "expensesType" : 0,
        "id" : 0,
        "incomeType" : 0,
        "originalId" : 0,
        "remark" : "string",
        "type" : 0,
        "uid" : 0
      } ],
      "timeGroup" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="useraccountsafepostusingpost"></a>
#### 修改密码-适配安卓
```
POST /app/user/accountsafe
```


##### 说明
修改密码-适配安卓<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userAccountsafePost(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oldpassword**  <br>*必填*|oldpassword|string|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**repassword**  <br>*必填*|repassword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/accountsafe
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oldpassword" : "string",
  "password" : "string",
  "repassword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="useraccountsafeusingget"></a>
#### 账号安全
```
GET /app/user/accountsafe
```


##### 说明
账号安全<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userAccountsafe()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserAccountsafeVo»](#9ef7b8d35f525f7c4719a33c2a89afde)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/accountsafe
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "email" : "string",
    "getcoupon" : "object",
    "logoutNote" : "string",
    "mobile" : "string",
    "qq" : 0,
    "wechart" : 0,
    "weibo" : 0
  },
  "msg" : "string"
}
```


<a name="queryuseravatarconfusingget"></a>
#### 用户头像配置页
```
GET /app/user/avatar/conf
```


##### 说明
用户头像配置页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.queryUserAvatarConf()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserAvatarConfVO»](#8e26f39a73a8d7c4bbfcf97ab0cbf234)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/avatar/conf
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "defaultAvatars" : [ {
      "defaultName" : "string",
      "defaultPicUrl" : "string",
      "useStatus" : true
    } ],
    "userPic" : "string"
  },
  "msg" : "string"
}
```


<a name="useravatarupdateusingpost"></a>
#### 个人头像更新
```
POST /app/user/avatar/update
```


##### 说明
个人头像更新<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userAvatarUpdate(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**image**  <br>*必填*|image|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/avatar/update
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "image" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bindusingpost"></a>
#### 绑定/修改手机号
```
POST /app/user/bind
```


##### 说明
绑定/修改手机号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.bind(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|
|**Query**|**smscode**  <br>*必填*|smscode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/bind
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string",
  "mobile" : "string",
  "smscode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bindmailusingpost"></a>
#### 绑定/修改邮箱
```
POST /app/user/bind/email
```


##### 说明
绑定/修改邮箱<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.bindMail(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|
|**Query**|**emailcode**  <br>*必填*|emailcode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/bind/email
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string",
  "emailcode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bindsendmailusingpost"></a>
#### 绑定/修改邮箱-发送邮箱验证码
```
POST /app/user/bind/email/validcode
```


##### 说明
绑定/修改邮箱-发送邮箱验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.bindSendMail(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/bind/email/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bindsnsusingpost"></a>
#### 绑定sns账号
```
POST /app/user/bind/sns
```


##### 说明
绑定sns账号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.bindSns(java.lang.String,java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**avatar**  <br>*可选*|微信头像url|string|
|**Query**|**oauth_token**  <br>*必填*|oauth_token|string|
|**Query**|**openid**  <br>*必填*|openid|string|
|**Query**|**type**  <br>*必填*|type|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/bind/sns
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "avatar" : "string",
  "oauth_token" : "string",
  "openid" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="bindsendsmsusingpost"></a>
#### 绑定/修改手机号-发送短信验证码
```
POST /app/user/bind/validcode
```


##### 说明
绑定/修改手机号-发送短信验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.bindSendSms(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|
|**Query**|**mobile**  <br>*可选*|mobile|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/bind/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string",
  "mobile" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usercheckservicefollowusingget"></a>
#### 判断用户是否已经关注服务号
```
GET /app/user/check/service_follow
```


##### 说明
判断用户是否已经关注服务号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userCheckServiceFollow()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserServiceFollowVO»](#1f97da85cdb6d0176025365fcf396469)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/check/service_follow
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "isFollow" : 0,
    "url" : "string"
  },
  "msg" : "string"
}
```


<a name="usercheckmobileusingget"></a>
#### 判断用户是否有手机号
```
GET /app/user/checkmobile
```


##### 说明
判断用户是否有手机号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userCheckmobile()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkmobile
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usercheckperfectusingget"></a>
#### 判断用户是否送过完善资料优惠卷
```
GET /app/user/checkperfect
```


##### 说明
判断用户是否送过完善资料优惠卷<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userCheckperfect(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*必填*|pid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkperfect
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usercheckwxusingget"></a>
#### 判断用户是否绑定了微信
```
GET /app/user/checkwx
```


##### 说明
判断用户是否绑定了微信<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userCheckwx()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/checkwx
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="contactsusingpost"></a>
#### 通讯录
```
POST /app/user/contacts
```


##### 说明
通讯录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.contacts(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**contact**  <br>*可选*|contact|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ContactVO»»»](#1e02fffb95a96159ac74e894bf87bd15)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/contacts
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "contact" : "string",
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "blockname" : "string",
      "city" : "string",
      "contactsname" : "string",
      "intro" : "string",
      "mobile" : "string",
      "province" : "string",
      "realname" : "string",
      "relation" : "string",
      "sex" : 0,
      "tags" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="userfeedbackusingpost"></a>
#### 意见建议保存
```
POST /app/user/feedback
```


##### 说明
意见建议保存<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userFeedback(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**contact**  <br>*必填*|contact|string|
|**Query**|**idea**  <br>*必填*|idea|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/feedback
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "contact" : "string",
  "idea" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userfollowedusingpost"></a>
#### 关注用户
```
POST /app/user/followed
```


##### 说明
关注用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userFollowed(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**follow_uid**  <br>*必填*|follow_uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/followed
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "follow_uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userfolloweduidsusingpost"></a>
#### 一键关注同团用户
```
POST /app/user/followedUids
```


##### 说明
一键关注同团用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userFollowedUids(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|oid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/followedUids
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="forgetusingpost"></a>
#### 忘记密码-短信验证
```
POST /app/user/forget
```


##### 说明
忘记密码-短信验证<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.forget(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|
|**Query**|**smscode**  <br>*必填*|smscode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/forget
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string",
  "smscode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="forgetbymailusingpost"></a>
#### 忘记密码-邮箱验证
```
POST /app/user/forget/email
```


##### 说明
忘记密码-邮箱验证<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.forgetByMail(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|
|**Query**|**emailcode**  <br>*必填*|emailcode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/forget/email
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string",
  "emailcode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="forgetsendmailusingpost"></a>
#### 忘记密码-发送邮箱验证码
```
POST /app/user/forget/email/validcode
```


##### 说明
忘记密码-发送邮箱验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.forgetSendMail(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/forget/email/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userforgetresetpwdusingpost"></a>
#### 重置密码
```
POST /app/user/forget/resetpwd
```


##### 说明
重置密码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userForgetResetpwd(java.lang.String,java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**key**  <br>*必填*|key|string|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**repassword**  <br>*必填*|repassword|string|
|**Query**|**value**  <br>*必填*|value|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/forget/resetpwd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "key" : "string",
  "password" : "string",
  "repassword" : "string",
  "value" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="forgetsendsmsusingpost"></a>
#### 忘记密码-发送短信验证码
```
POST /app/user/forget/validcode
```


##### 说明
忘记密码-发送短信验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.forgetSendSms(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/forget/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userinfousingget"></a>
#### 个人资料
```
GET /app/user/info
```


##### 说明
个人资料<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userInfo()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«UserInfoVo»](#cb9b5355da682e4a29c93704942c4e8b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/info
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "appBgPic" : "string",
    "avatar" : "string",
    "birth" : "string",
    "birthday" : 0,
    "canUpdateBirth" : 0,
    "city" : "string",
    "communityLevel" : "string",
    "countFollower" : 0,
    "countFollowing" : 0,
    "countPhoto" : 0,
    "countPost" : 0,
    "countQuote" : 0,
    "education" : "string",
    "educationArr" : [ "string" ],
    "email" : "string",
    "getcoupon" : "object",
    "group_video_permission" : 0,
    "grouptitle" : "string",
    "intro" : "string",
    "isHasCoupon" : 0,
    "is_has_mobile" : 0,
    "mark" : "string",
    "medalCount" : 0,
    "medalTargetUrl" : "string",
    "mobile" : "string",
    "msg" : "string",
    "nick" : "string",
    "notice" : "string",
    "occupation" : "string",
    "occupationArr" : [ "string" ],
    "percent" : 0,
    "private_video_permission" : 0,
    "province" : "string",
    "realname" : "string",
    "revenue" : "string",
    "revenueArr" : [ "string" ],
    "sex" : 0,
    "shop_address" : "object",
    "shop_menu" : "object",
    "show_back" : 0,
    "show_information" : 0,
    "show_page" : 0,
    "tags" : [ {
      "tagcolor" : "string",
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "uid" : 0,
    "updateBirthMsg" : "string",
    "user_type" : 0,
    "xz" : "string",
    "yxkCert" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="userlbssaveusingpost"></a>
#### 保存用户位置信息
```
POST /app/user/lbs/save
```


##### 说明
保存用户位置信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userLbsSave(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**lat**  <br>*必填*|lat|string|
|**Query**|**lng**  <br>*必填*|lng|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/lbs/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lat" : "string",
  "lng" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="loginusingpost"></a>
#### 登录
```
POST /app/user/login
```


##### 说明
登录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.login(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**username**  <br>*必填*|username|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "password" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="onepassusingpost"></a>
#### 极验登录
```
POST /app/user/login/oneLogin
```


##### 说明
极验登录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.onePass(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**authcode**  <br>*可选*|authcode|string|
|**Query**|**processId**  <br>*必填*|processId|string|
|**Query**|**token**  <br>*必填*|token|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OneLoginVO»](#04b047444596d3a1f302e273f42975d3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login/oneLogin
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "authcode" : "string",
  "processId" : "string",
  "token" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "newUser" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="onepasslogusingpost"></a>
#### 极验登录日志记录
```
POST /app/user/login/oneLogin/log
```


##### 说明
极验登录日志记录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.onePassLog(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oneLog**  <br>*可选*|oneLog|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login/oneLogin/log
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oneLog" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="loginbyphoneusingpost"></a>
#### 登录-手机验证码
```
POST /app/user/login/phone
```


##### 说明
登录-手机验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.loginByPhone(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**phone**  <br>*必填*|phone|string|
|**Query**|**smscode**  <br>*必填*|smscode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login/phone
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "phone" : "string",
  "smscode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="loginbythirdusingpost_2"></a>
#### 登录-第三方登陆
```
POST /app/user/login/third
```


##### 说明
登录-第三方登陆<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.loginByThird(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oauth_token**  <br>*必填*|oauth_token|string|
|**Query**|**openid**  <br>*必填*|openid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login/third
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oauth_token" : "string",
  "openid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="loginsendsmsusingpost"></a>
#### 登录-发送短信验证码
```
POST /app/user/login/validcode
```


##### 说明
登录-发送短信验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.LoginController.loginSendSms(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/login/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="logoutusingpost"></a>
#### 注销账号
```
POST /app/user/logout
```


##### 说明
注销账号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.logout()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/logout
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="sharemedalusingget"></a>
#### 分享用户勋章
```
GET /app/user/medal/share
```


##### 说明
分享用户勋章<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.shareMedal(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**medalId**  <br>*可选*|medalId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MedalShareVo»](#6dc56a9fcb9420f98eb464f3497f8baa)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/medal/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "medalId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "codeImg" : "string",
    "getTime" : "string",
    "getWay" : "string",
    "geted" : 0,
    "getedNum" : 0,
    "medalDesc" : "string",
    "medalId" : 0,
    "needNum" : 0,
    "personCount" : 0,
    "pic" : "string",
    "talent" : 0,
    "title" : "string",
    "type" : 0,
    "uid" : 0,
    "username" : "string"
  },
  "msg" : "string"
}
```


<a name="usermyselfusingget_1"></a>
#### 个人中心
```
GET /app/user/myself
```


##### 说明
个人中心<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userMyself(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*可选*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MyselfVo»](#d4870e8feacfcc0d986db7303fe49415)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/myself
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adverts" : [ {
      "exp" : 0,
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "appBgPic" : "string",
    "avatar" : "string",
    "birth" : "string",
    "birthday" : 0,
    "canUpdateBirth" : 0,
    "city" : "string",
    "communityLevel" : "string",
    "consumptionLevel" : 0,
    "consumptionLevelImage" : "string",
    "consumptionLevelLabel" : "string",
    "countFollower" : 0,
    "countFollowing" : 0,
    "countPhoto" : 0,
    "countPost" : 0,
    "countQuote" : 0,
    "couponTitle" : "string",
    "credits" : "string",
    "education" : "string",
    "educationArr" : [ "string" ],
    "email" : "string",
    "getcoupon" : "object",
    "golb" : "string",
    "goldTitle" : "string",
    "goldUrl" : "string",
    "group_video_permission" : 0,
    "grouptitle" : "string",
    "intro" : "string",
    "isBindPhone" : 0,
    "isBindWx" : 0,
    "isHasCoupon" : 0,
    "is_has_mobile" : 0,
    "mark" : "string",
    "medalCount" : 0,
    "medalTargetUrl" : "string",
    "mobile" : "string",
    "money" : "string",
    "moneyTitle" : "string",
    "moneyUrl" : "string",
    "msg" : "string",
    "newRecommendList" : [ {
      "dataDetail" : "object",
      "identityCode" : "string",
      "indexFlowBangdanVo" : {
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowChannelVo" : {
        "handler" : "string",
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typeImage" : "string",
        "typeImageV2" : "string",
        "url" : "string"
      },
      "indexFlowDiscoverVo" : {
        "address" : "string",
        "avatar" : "string",
        "did" : 0,
        "discus" : "string",
        "image" : "string",
        "numLabel" : "string",
        "prised" : 0,
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowFilmVo" : {
        "ad" : true,
        "address" : "string",
        "fid" : 0,
        "image" : "string",
        "mediaUrl" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "timeLabel" : "string",
        "title" : "string"
      },
      "indexFlowMddVo" : {
        "image" : "string",
        "mddId" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowNewsVo" : {
        "ad" : true,
        "image" : "string",
        "newsId" : 0,
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowProductVo" : {
        "ageLabel" : "string",
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "outDoorLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productCat" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "type" : 0,
        "typetwoOrCat" : "string"
      },
      "indexFlowTravelarticleVo" : {
        "avatar" : "string",
        "image" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "tid" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowVoucherVo" : {
        "handler" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "priceLabel" : "string",
        "salePriceLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowZhuantiVo" : {
        "blurColor" : "string",
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "type" : 0
    } ],
    "nick" : "string",
    "notice" : "string",
    "occupation" : "string",
    "occupationArr" : [ "string" ],
    "orderCount" : {
      "all" : 0,
      "coupon" : 0,
      "pj" : 0,
      "refund" : 0,
      "success" : 0,
      "tibu" : 0,
      "unpay" : 0
    },
    "percent" : 0,
    "private_video_permission" : 0,
    "province" : "string",
    "realname" : "string",
    "receiveDate" : "string",
    "receiveOrderNum" : 0,
    "recommendList" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "revenue" : "string",
    "revenueArr" : [ "string" ],
    "sex" : 0,
    "shop_address" : "object",
    "shop_menu" : "object",
    "show_back" : 0,
    "show_information" : 0,
    "show_page" : 0,
    "signInTag" : {
      "button" : "string",
      "description" : "string",
      "handler" : "string",
      "hasSignIn" : true,
      "num" : 0,
      "url" : "string"
    },
    "tags" : [ {
      "tagcolor" : "string",
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "uid" : 0,
    "updateBirthMsg" : "string",
    "user_type" : 0,
    "vipUrl" : "string",
    "xz" : "string",
    "yxkCert" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="usermyselfusingpost"></a>
#### 共享订单确认接收
```
POST /app/user/order/confirm
```


##### 说明
共享订单确认接收<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userMyself(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**receiveDate**  <br>*可选*|接收订单时间|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/order/confirm
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "receiveDate" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="regbyyoucardusingpost"></a>
#### 注册-通过外部
```
POST /app/user/out/reg
```


##### 说明
注册-通过外部<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regByYoucard(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**ip**  <br>*必填*|ip|string|
|**Query**|**phone**  <br>*必填*|phone|string|
|**Query**|**sign**  <br>*必填*|sign|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«RegVO»](#ea2d7b7359137608f57920c4876916b7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/out/reg
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "ip" : "string",
  "phone" : "string",
  "sign" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "reged" : 0,
    "uid" : 0
  },
  "msg" : "string"
}
```


<a name="getuserpopupinfousingget"></a>
#### 获取个人中心 弹出提示信息
```
GET /app/user/popup_info
```


##### 说明
获取个人中心 弹出提示信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.getUserPopupInfo()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«弹窗提示信息»](#866ca28db429090114c6c3248a345859)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/popup_info
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="revertuserpopupinfousingget"></a>
#### 获取个人中心 恢复弹出提示信息，仅开发使用
```
GET /app/user/popup_info/revert
```


##### 说明
获取个人中心 恢复弹出提示信息，仅开发使用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.revertUserPopupInfo(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*必填*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/popup_info/revert
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getuserpopupinfolistusingget"></a>
#### 获取个人中心 勋章弹窗列表
```
GET /app/user/popup_info_list
```


##### 说明
获取个人中心 勋章弹窗列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.getUserPopupInfoList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«弹窗提示信息»»](#6cbea751f81cb148765cfaa325a3b196)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/popup_info_list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="userpwdupdateusingpost"></a>
#### 修改密码
```
POST /app/user/pwd/udpate
```


##### 说明
修改密码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userPwdUpdate(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oldpassword**  <br>*必填*|oldpassword|string|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**repassword**  <br>*必填*|repassword|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/pwd/udpate
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oldpassword" : "string",
  "password" : "string",
  "repassword" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="qiyuinfousingget"></a>
#### 在线客服-用户信息
```
GET /app/user/qiyu/info
```


##### 说明
在线客服-用户信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.qiyuInfo(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**serviceOtherId**  <br>*必填*|线路id/签证id|string|
|**Query**|**serviceType**  <br>*必填*|1线路详情2签证详情|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ProductQiyuVo»](#ce3d901f3d085c4b9883651b5cebe0b6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/qiyu/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "serviceOtherId" : "string",
  "serviceType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "data" : "string",
    "groupid" : 0
  },
  "msg" : "string"
}
```


<a name="recommendusingget"></a>
#### 推荐游侠
```
GET /app/user/recommend
```


##### 说明
推荐游侠<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.recommend()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«FriendBaseVo»»»](#4af018e6441c5f5308771613a4754b9e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/recommend
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "city" : "string",
      "intro" : "string",
      "province" : "string",
      "realname" : "string",
      "relation" : "string",
      "sex" : 0,
      "tag" : "string",
      "tagList" : [ {
        "color" : "string",
        "icon" : "string",
        "name" : "string"
      } ],
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="recommendmasterusingget"></a>
#### 推荐达人
```
GET /app/user/recommendmaster
```


##### 说明
推荐达人<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.recommendmaster(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«RecommendMasterVO»»»](#91a8a669a6cbfde993565aea094f3a88)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/recommendmaster
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "block_id" : 0,
      "block_sort" : 0,
      "blockname" : "string",
      "id" : 0,
      "leader_sort" : 0,
      "nick" : "string",
      "relation" : "string",
      "uid" : 0,
      "uname" : "string",
      "upic" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="regbyphoneusingpost"></a>
#### 注册-手机注册
```
POST /app/user/reg
```


##### 说明
注册-手机注册<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regByPhone(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**smscode**  <br>*必填*|smscode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string",
  "password" : "string",
  "smscode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="regbymailusingpost"></a>
#### 注册-邮箱注册
```
POST /app/user/reg/email
```


##### 说明
注册-邮箱注册<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regByMail(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|
|**Query**|**emailcode**  <br>*必填*|emailcode|string|
|**Query**|**password**  <br>*必填*|password|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/email
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string",
  "emailcode" : "string",
  "password" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="regsendmailusingpost"></a>
#### 注册-发送邮箱验证码
```
POST /app/user/reg/email/validcode
```


##### 说明
注册-发送邮箱验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regSendMail(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**email**  <br>*必填*|email|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/email/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "email" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="thirdbindregusingpost"></a>
#### 第三方注册
```
POST /app/user/reg/third
```


##### 说明
第三方注册<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.thirdBindReg(com.youxiake.model.master.user.vo.ThirdRegRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**appleUserID**  <br>*可选*||string|
|**Query**|**avatar_url**  <br>*可选*||string|
|**Query**|**livecity**  <br>*可选*||string|
|**Query**|**liveprovince**  <br>*可选*||string|
|**Query**|**mobile**  <br>*可选*||string|
|**Query**|**oauth_token**  <br>*可选*||string|
|**Query**|**old_openID**  <br>*可选*||string|
|**Query**|**openid**  <br>*可选*||string|
|**Query**|**password**  <br>*可选*||string|
|**Query**|**sex**  <br>*可选*||integer (int32)|
|**Query**|**smscode**  <br>*可选*||string|
|**Query**|**type**  <br>*可选*||string|
|**Query**|**unionID**  <br>*可选*||string|
|**Query**|**username**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/third
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "appleUserID" : "string",
  "avatar_url" : "string",
  "livecity" : "string",
  "liveprovince" : "string",
  "mobile" : "string",
  "oauth_token" : "string",
  "old_openID" : "string",
  "openid" : "string",
  "password" : "string",
  "sex" : 0,
  "smscode" : "string",
  "type" : "string",
  "unionID" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="regthirdsendsmsusingpost"></a>
#### 第三方注册-发送短信验证码
```
POST /app/user/reg/thirdvalcode
```


##### 说明
第三方注册-发送短信验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regThirdSendSms(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/thirdvalcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userupdateusingpost"></a>
#### 注册完善资料
```
POST /app/user/reg/update/info
```


##### 说明
注册完善资料<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.userUpdate(com.youxiake.model.master.user.vo.UserInfoUpdateVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**appBgPic**  <br>*可选*|背景图|string|
|**Query**|**bio**  <br>*可选*|自我介绍|string|
|**Query**|**birthday**  <br>*可选*|出行日期|string|
|**Query**|**education**  <br>*可选*|学历|string|
|**Query**|**occupation**  <br>*可选*|职业|string|
|**Query**|**realname**  <br>*可选*|真实姓名|string|
|**Query**|**reside**  <br>*可选*|常住地|string|
|**Query**|**revenue**  <br>*可选*|年收入|string|
|**Query**|**sex**  <br>*可选*|性别|integer (int32)|
|**Query**|**username**  <br>*可选*|用户名|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/update/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "appBgPic" : "string",
  "bio" : "string",
  "birthday" : "string",
  "education" : "string",
  "occupation" : "string",
  "realname" : "string",
  "reside" : "string",
  "revenue" : "string",
  "sex" : 0,
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="regsendsmsusingpost"></a>
#### 注册-发送短信验证码
```
POST /app/user/reg/validcode
```


##### 说明
注册-发送短信验证码<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.RegController.regSendSms(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mobile**  <br>*必填*|mobile|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/reg/validcode
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mobile" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userreportusingpost"></a>
#### 举报用户
```
POST /app/user/report
```


##### 说明
举报用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userReport(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**reason**  <br>*必填*|reason|string|
|**Query**|**report_uid**  <br>*必填*|report_uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "reason" : "string",
  "report_uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="storefeedbackusingpost"></a>
#### 应用评价
```
POST /app/user/store/feedback
```


##### 说明
应用评价<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.storeFeedback(com.youxiake.model.master.user.vo.request.StoreFeedbackRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentType**  <br>*可选*|评价类型：0、冷漠无视，1、吐槽，2：评分|integer (int32)|
|**Query**|**contact**  <br>*可选*|联系方式|string|
|**Query**|**idea**  <br>*可选*|意见反馈|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/store/feedback
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentType" : 0,
  "contact" : "string",
  "idea" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usertagupdateusingpost"></a>
#### 设置用户标签
```
POST /app/user/tag/udpate
```


##### 说明
设置用户标签<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userTagUpdate(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tagids**  <br>*必填*|tagids|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/tag/udpate
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tagids" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="usertagsusingget"></a>
#### 获取用户标签
```
GET /app/user/tags
```


##### 说明
获取用户标签<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userTags()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«UserTagVo»»»](#e7cf16bc6df3666fbb12fedc344b815f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/tags
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "count" : 0,
      "img_url" : "string",
      "selected" : 0,
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="unbindsnsusingpost"></a>
#### 解除sns账号
```
POST /app/user/unbind/sns
```


##### 说明
解除sns账号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.unbindSns(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**type**  <br>*必填*|type|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/unbind/sns
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userunfollowusingpost"></a>
#### 取消关注用户
```
POST /app/user/unfollow
```


##### 说明
取消关注用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userUnfollow(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**follow_uid**  <br>*必填*|follow_uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/unfollow
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "follow_uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="userupdateusingpost_1"></a>
#### 个人资料更新
```
POST /app/user/update
```


##### 说明
个人资料更新<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserController.userUpdate(com.youxiake.model.master.user.vo.UserInfoUpdateVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**appBgPic**  <br>*可选*|背景图|string|
|**Query**|**bio**  <br>*可选*|自我介绍|string|
|**Query**|**birthday**  <br>*可选*|出行日期|string|
|**Query**|**education**  <br>*可选*|学历|string|
|**Query**|**occupation**  <br>*可选*|职业|string|
|**Query**|**realname**  <br>*可选*|真实姓名|string|
|**Query**|**reside**  <br>*可选*|常住地|string|
|**Query**|**revenue**  <br>*可选*|年收入|string|
|**Query**|**sex**  <br>*可选*|性别|integer (int32)|
|**Query**|**username**  <br>*可选*|用户名|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/update
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "appBgPic" : "string",
  "bio" : "string",
  "birthday" : "string",
  "education" : "string",
  "occupation" : "string",
  "realname" : "string",
  "reside" : "string",
  "revenue" : "string",
  "sex" : 0,
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="899dcda8e644225888dbf229687d5815"></a>
### 用户管理v2
User Controller V 2


<a name="contactsnewusingpost"></a>
#### 通讯录
```
POST /app/v2/user/contacts
```


##### 说明
通讯录<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.UserControllerV2.contactsNew(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**contact**  <br>*必填*|通讯录JSON([{name:xx,phone:xx}])|string||
|**Query**|**page**  <br>*可选*|当前页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«UserTongXunTotalMsgVO,List«UserDiscoverFriendVO»»»](#33bc55aa1abd1f0bacc133b8d6c3198c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/user/contacts
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "contact" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "friendsNumber" : 0,
      "note" : "string"
    },
    "list" : [ {
      "addTime" : "string",
      "isJoin" : true,
      "isTalent" : true,
      "mobile" : "string",
      "pic" : "string",
      "relation" : "string",
      "uid" : 0,
      "userTongxunName" : "string",
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="appleverifyusingpost"></a>
#### 苹果登录校验
```
POST /app/v2/user/login/appleVerify
```


##### 说明
苹果登录校验<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.LoginControllerV2.appleVerify(java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**aud**  <br>*必填*|aud|string|
|**Query**|**jwt**  <br>*必填*|jwt|string|
|**Query**|**sub**  <br>*必填*|sub|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/user/login/appleVerify
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "aud" : "string",
  "jwt" : "string",
  "sub" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="loginbythirdusingpost"></a>
#### 登录-第三方登陆-v2
```
POST /app/v2/user/login/third
```


##### 说明
登录-第三方登陆-v2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.LoginControllerV2.loginByThird(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**aud**  <br>*可选*|aud|string|
|**Query**|**avatar**  <br>*可选*|avatar|string|
|**Query**|**jwt**  <br>*可选*|jwt|string|
|**Query**|**oauth_token**  <br>*必填*|oauth_token|string|
|**Query**|**old_openID**  <br>*可选*|old_openID|string|
|**Query**|**openid**  <br>*必填*|openid|string|
|**Query**|**sub**  <br>*可选*|sub|string|
|**Query**|**unionID**  <br>*可选*|unionID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/user/login/third
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "aud" : "string",
  "avatar" : "string",
  "jwt" : "string",
  "oauth_token" : "string",
  "old_openID" : "string",
  "openid" : "string",
  "sub" : "string",
  "unionID" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="usermyselfusingget"></a>
#### 个人中心
```
GET /app/v2/user/myself
```


##### 说明
个人中心<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.UserControllerV2.userMyself(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*可选*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MyselfVo»](#d4870e8feacfcc0d986db7303fe49415)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/user/myself
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "adverts" : [ {
      "exp" : 0,
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "appBgPic" : "string",
    "avatar" : "string",
    "birth" : "string",
    "birthday" : 0,
    "canUpdateBirth" : 0,
    "city" : "string",
    "communityLevel" : "string",
    "consumptionLevel" : 0,
    "consumptionLevelImage" : "string",
    "consumptionLevelLabel" : "string",
    "countFollower" : 0,
    "countFollowing" : 0,
    "countPhoto" : 0,
    "countPost" : 0,
    "countQuote" : 0,
    "couponTitle" : "string",
    "credits" : "string",
    "education" : "string",
    "educationArr" : [ "string" ],
    "email" : "string",
    "getcoupon" : "object",
    "golb" : "string",
    "goldTitle" : "string",
    "goldUrl" : "string",
    "group_video_permission" : 0,
    "grouptitle" : "string",
    "intro" : "string",
    "isBindPhone" : 0,
    "isBindWx" : 0,
    "isHasCoupon" : 0,
    "is_has_mobile" : 0,
    "mark" : "string",
    "medalCount" : 0,
    "medalTargetUrl" : "string",
    "mobile" : "string",
    "money" : "string",
    "moneyTitle" : "string",
    "moneyUrl" : "string",
    "msg" : "string",
    "newRecommendList" : [ {
      "dataDetail" : "object",
      "identityCode" : "string",
      "indexFlowBangdanVo" : {
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowChannelVo" : {
        "handler" : "string",
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typeImage" : "string",
        "typeImageV2" : "string",
        "url" : "string"
      },
      "indexFlowDiscoverVo" : {
        "address" : "string",
        "avatar" : "string",
        "did" : 0,
        "discus" : "string",
        "image" : "string",
        "numLabel" : "string",
        "prised" : 0,
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowFilmVo" : {
        "ad" : true,
        "address" : "string",
        "fid" : 0,
        "image" : "string",
        "mediaUrl" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "timeLabel" : "string",
        "title" : "string"
      },
      "indexFlowMddVo" : {
        "image" : "string",
        "mddId" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowNewsVo" : {
        "ad" : true,
        "image" : "string",
        "newsId" : 0,
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowProductVo" : {
        "ageLabel" : "string",
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "outDoorLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productCat" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "type" : 0,
        "typetwoOrCat" : "string"
      },
      "indexFlowTravelarticleVo" : {
        "avatar" : "string",
        "image" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "tid" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowVoucherVo" : {
        "handler" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "priceLabel" : "string",
        "salePriceLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowZhuantiVo" : {
        "blurColor" : "string",
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "type" : 0
    } ],
    "nick" : "string",
    "notice" : "string",
    "occupation" : "string",
    "occupationArr" : [ "string" ],
    "orderCount" : {
      "all" : 0,
      "coupon" : 0,
      "pj" : 0,
      "refund" : 0,
      "success" : 0,
      "tibu" : 0,
      "unpay" : 0
    },
    "percent" : 0,
    "private_video_permission" : 0,
    "province" : "string",
    "realname" : "string",
    "receiveDate" : "string",
    "receiveOrderNum" : 0,
    "recommendList" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "revenue" : "string",
    "revenueArr" : [ "string" ],
    "sex" : 0,
    "shop_address" : "object",
    "shop_menu" : "object",
    "show_back" : 0,
    "show_information" : 0,
    "show_page" : 0,
    "signInTag" : {
      "button" : "string",
      "description" : "string",
      "handler" : "string",
      "hasSignIn" : true,
      "num" : 0,
      "url" : "string"
    },
    "tags" : [ {
      "tagcolor" : "string",
      "tagid" : 0,
      "tagname" : "string"
    } ],
    "uid" : 0,
    "updateBirthMsg" : "string",
    "user_type" : 0,
    "vipUrl" : "string",
    "xz" : "string",
    "yxkCert" : [ {
      "certTitle" : "string",
      "certType" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="thirdbindregv2usingpost"></a>
#### 第三方注册-v2版本
```
POST /app/v2/user/reg/third
```


##### 说明
第三方注册-v2版本<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.RegControllerV2.thirdBindRegV2(com.youxiake.model.master.user.vo.ThirdRegRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**appleUserID**  <br>*可选*||string|
|**Query**|**avatar_url**  <br>*可选*||string|
|**Query**|**livecity**  <br>*可选*||string|
|**Query**|**liveprovince**  <br>*可选*||string|
|**Query**|**mobile**  <br>*可选*||string|
|**Query**|**oauth_token**  <br>*可选*||string|
|**Query**|**old_openID**  <br>*可选*||string|
|**Query**|**openid**  <br>*可选*||string|
|**Query**|**password**  <br>*可选*||string|
|**Query**|**sex**  <br>*可选*||integer (int32)|
|**Query**|**smscode**  <br>*可选*||string|
|**Query**|**type**  <br>*可选*||string|
|**Query**|**unionID**  <br>*可选*||string|
|**Query**|**username**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/user/reg/third
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "appleUserID" : "string",
  "avatar_url" : "string",
  "livecity" : "string",
  "liveprovince" : "string",
  "mobile" : "string",
  "oauth_token" : "string",
  "old_openID" : "string",
  "openid" : "string",
  "password" : "string",
  "sex" : 0,
  "smscode" : "string",
  "type" : "string",
  "unionID" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="9c196afc13d3e101b33da053dbf65be2"></a>
### 用户管理v3
Login Controller V 3


<a name="loginbythirdusingpost_1"></a>
#### 登录-第三方登陆-v3
```
POST /app/v3/user/login/third
```


##### 说明
登录-第三方登陆-v3<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v3.LoginControllerV3.loginByThird(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**aud**  <br>*可选*|aud|string|
|**Query**|**avatar**  <br>*可选*|avatar|string|
|**Query**|**jwt**  <br>*可选*|jwt|string|
|**Query**|**oauth_token**  <br>*必填*|oauth_token|string|
|**Query**|**old_openID**  <br>*可选*|old_openID|string|
|**Query**|**openid**  <br>*必填*|openid|string|
|**Query**|**sub**  <br>*可选*|sub|string|
|**Query**|**type**  <br>*可选*|微信:app_weixin，微博:weibo，qq:app_qq|string|
|**Query**|**unionID**  <br>*可选*|unionID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«LoginVO»](#1146ae92ebe6b4cb7f56e8c380b5ac9e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/user/login/third
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "aud" : "string",
  "avatar" : "string",
  "jwt" : "string",
  "oauth_token" : "string",
  "old_openID" : "string",
  "openid" : "string",
  "sub" : "string",
  "type" : "string",
  "unionID" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "expires_time" : 0,
    "old_token" : "string",
    "token" : "string",
    "user" : {
      "avatar" : "string",
      "meetManage" : true,
      "uid" : "string",
      "username" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="0eac3ab0ecea07f66c46315764c30881"></a>
### 目的地地图
Dest Map System Controller


<a name="searchnearmddusingget"></a>
#### 定位搜索周边的目的地
```
GET /app/dest/map/searchNearMdd
```


##### 说明
定位搜索周边的目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestMapSystemController.searchNearMdd(com.youxiake.model.master.dest.vo.response.DestMapNearSearchVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**distance**  <br>*可选*|距离(单位米)|integer (int32)|
|**Query**|**lat**  <br>*可选*|纬度|number (double)|
|**Query**|**lng**  <br>*可选*|经度|number (double)|
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MddNearSearchRespVo»](#04218f761cc2fd3d44aefc76a8f0052c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/map/searchNearMdd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "distance" : 0,
  "lat" : 0.0,
  "lng" : 0.0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "desc" : "string",
      "distanceLocation" : "string",
      "lat" : "string",
      "level" : "string",
      "lng" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0,
      "visitedNum" : "string",
      "wantedNum" : "string"
    } ],
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ed6f7e0759696039a45cd177594e70c6"></a>
### 目的地系统
Dest System Controller


<a name="allmddnameusingget"></a>
#### 目的地扩展词库
```
GET /app/dest/allMddName
```


##### 说明
目的地扩展词库<br/>public java.lang.String com.youxiake.yxkapp.controller.dest.DestSystemController.allMddName(javax.servlet.http.HttpServletResponse)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/allMddName
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="clickwantorvisitusingpost"></a>
#### 点亮想去或者去过
```
POST /app/dest/clickWantOrVisit
```


##### 说明
点亮想去或者去过<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.clickWantOrVisit(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**type**  <br>*可选*|1表示想去 2表示去过|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestWantRespVo»](#6f3b4d8128204d102b31f7f8c2b2a34c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/clickWantOrVisit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "goed" : {
      "avatar" : "string",
      "countInfo" : 0,
      "flag" : true,
      "label" : "string"
    },
    "title" : "string",
    "type" : 0,
    "wantTo" : {
      "avatar" : "string",
      "countInfo" : 0,
      "flag" : true,
      "label" : "string"
    }
  },
  "msg" : "string"
}
```


<a name="curthemerecommendusingget"></a>
#### 当季推荐或主题推荐
```
GET /app/dest/curThemeRecommend
```


##### 说明
当季推荐或主题推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.curThemeRecommend(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**type**  <br>*可选*|1 为当季推荐 2 为主题推荐|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestThemeBaseRespVO»](#366843752598fc74e330d1009a71d641)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/curThemeRecommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "themes" : [ "object" ],
    "title" : "string"
  },
  "msg" : "string"
}
```


<a name="destclassifyusingget"></a>
#### 目的地分类页
```
GET /app/dest/destClassify
```


##### 说明
目的地分类页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.destClassify()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«DestThemeBaseRespVO»»](#0ab4c38b9517bc39e70dcefceb00d1aa)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/destClassify
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "themes" : [ "object" ],
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="detailusingget_2"></a>
#### 目的地详情
```
GET /app/dest/detail
```


##### 说明
目的地详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.detail(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**maxId**  <br>*可选*|返回的maxId|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestDetailRespVo»](#95b40ddf135eb33db233c900598c6367)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "maxId" : "string",
  "mddId" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "details" : [ {
      "type" : 0
    } ],
    "maxId" : 0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="detailupusingget"></a>
#### 目的地详情-上半部分
```
GET /app/dest/detailUp
```


##### 说明
目的地详情-上半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.detailUp(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«JSONObject»](#79a5558a7910c415eeb04197ffd52fe3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/detailUp
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="getmdddiscoverusingget"></a>
#### 旅图
```
GET /app/dest/discover
```


##### 说明
旅图<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.getMddDiscover(com.youxiake.model.master.dest.vo.request.DestDiscoverRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**contentType**  <br>*可选*|图片photo,视频video 多选时逗号,分隔|string|
|**Query**|**level**  <br>*可选*|级别 0普通,1精选,2优质|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|目标页|string|
|**Query**|**theme**  <br>*可选*|主题|string|
|**Query**|**type**  <br>*可选*|1推荐，2最新|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«JSONObject»](#79a5558a7910c415eeb04197ffd52fe3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/discover
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "contentType" : "string",
  "level" : "string",
  "mddId" : "string",
  "page" : "string",
  "theme" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="listfavoritemddusingget"></a>
#### 目的地收藏列表
```
GET /app/dest/favoriteMddList
```


##### 说明
目的地收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.listFavoriteMdd(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DestFavoriteRespVO»»»](#35b01b9c9fc53f418f713de0d4930da6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/favoriteMddList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "desc" : "string",
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "productList" : [ {
        "minPrice" : "string",
        "productId" : 0,
        "productName" : "string"
      } ],
      "type" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getmddusingget"></a>
#### 根据名称获取目的地
```
GET /app/dest/getMdd
```


##### 说明
根据名称获取目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.getMdd(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddName**  <br>*可选*|目的地名称|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestBaseRespVO»](#a379177c1e45665344132a3e8f7d1dc9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/getMdd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "mddId" : 0,
    "mddName" : "string",
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="destdiscovergroupusingget"></a>
#### 目的地遇见聚合页
```
GET /app/dest/mdd-discover-group
```


##### 说明
目的地遇见聚合页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.destDiscoverGroup(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|页数|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«目的地遇见聚合»](#f87b0a10eedffd3a1152d77528d4fb09)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/mdd-discover-group
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "destName" : "string",
    "discoverPage" : [ {
      "uiType" : 0
    } ],
    "hottestDiscover" : {
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "content" : "string",
      "cover" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "firstImg" : {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      },
      "isV" : true,
      "noticeUsers" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "prise" : "string",
      "prised" : true,
      "quoteId" : 0,
      "uiType" : 0,
      "uid" : 0,
      "username" : "string",
      "video" : "string"
    },
    "mddId" : 0,
    "recordCount" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="mddbokingusingget"></a>
#### 目的地详情预订
```
GET /app/dest/mddBoking
```


##### 说明
目的地详情预订<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.mddBoking(com.youxiake.model.master.dest.vo.request.DestBokingFilterRequestRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**classTypeId**  <br>*可选*|类型|integer (int32)|
|**Query**|**classTypeId2**  <br>*可选*|二级类型|integer (int32)|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|页码|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«IndexFlowItemVo»»»](#a10316c5ec49162a98473687984bfece)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/mddBoking
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "classTypeId" : 0,
  "classTypeId2" : 0,
  "mddId" : "string",
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "dataDetail" : "object",
      "identityCode" : "string",
      "indexFlowBangdanVo" : {
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowChannelVo" : {
        "handler" : "string",
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "typeImage" : "string",
        "typeImageV2" : "string",
        "url" : "string"
      },
      "indexFlowDiscoverVo" : {
        "address" : "string",
        "avatar" : "string",
        "did" : 0,
        "discus" : "string",
        "image" : "string",
        "numLabel" : "string",
        "prised" : 0,
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowFilmVo" : {
        "ad" : true,
        "address" : "string",
        "fid" : 0,
        "image" : "string",
        "mediaUrl" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "timeLabel" : "string",
        "title" : "string"
      },
      "indexFlowMddVo" : {
        "image" : "string",
        "mddId" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowNewsVo" : {
        "ad" : true,
        "image" : "string",
        "newsId" : 0,
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string"
      },
      "indexFlowProductVo" : {
        "ageLabel" : "string",
        "days" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "numLabel" : "string",
        "outDoorLabel" : "string",
        "pid" : 0,
        "placeLabel" : "string",
        "priceLabel" : "string",
        "productCat" : "string",
        "productType" : "string",
        "saleOne" : {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        },
        "saleOtherList" : [ {
          "detailRemark" : "string",
          "otId" : 0,
          "shortRemark" : "string",
          "type" : 0
        } ],
        "salePriceLabel" : "string",
        "statisticsCode" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "type" : 0,
        "typetwoOrCat" : "string"
      },
      "indexFlowTravelarticleVo" : {
        "avatar" : "string",
        "image" : "string",
        "numLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "talent" : 0,
        "tid" : 0,
        "title" : "string",
        "username" : "string"
      },
      "indexFlowVoucherVo" : {
        "handler" : "string",
        "image" : "string",
        "liangdian" : [ "string" ],
        "pid" : 0,
        "priceLabel" : "string",
        "salePriceLabel" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "indexFlowZhuantiVo" : {
        "blurColor" : "string",
        "handler" : "string",
        "id" : 0,
        "image" : "string",
        "subTitle" : "string",
        "tagList" : [ "string" ],
        "title" : "string",
        "url" : "string"
      },
      "type" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="mddfilmsusingget"></a>
#### 目的地相关视频
```
GET /app/dest/mddFilms
```


##### 说明
目的地相关视频<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.mddFilms(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**maxId**  <br>*可选*|返回的maxId|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestFilmRespVo»](#529de1bafe496d40af70bdfcb8d0c0da)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/mddFilms
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "maxId" : "string",
  "mddId" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "duration" : "string",
      "id" : 0,
      "lineNumInNewsContent" : 0,
      "mddNumInNewsContent" : 0,
      "qiniuSrc" : "string",
      "replies" : "string",
      "thumb" : "string",
      "title" : "string",
      "views" : "string"
    } ],
    "maxId" : 0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="mddspnewsusingget"></a>
#### 目的地相关攻略
```
GET /app/dest/mddSpnews
```


##### 说明
目的地相关攻略<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.mddSpnews(com.youxiake.model.master.dest.vo.request.DestSpnewsFilterRequestRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**maxId**  <br>*可选*|返回的maxId|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**orderType**  <br>*可选*|0 默认排序 1 最新游记|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|string|
|**Query**|**type**  <br>*可选*|类型id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestSpnewsRespVo»](#da90bb0b81ba968ca7c1234493ca6af3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/mddSpnews
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "maxId" : "string",
  "mddId" : "string",
  "orderType" : 0,
  "page" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "desc" : "string",
      "id" : 0,
      "lables" : [ "string" ],
      "lineNumInNewsContent" : 0,
      "mddNumInNewsContent" : 0,
      "replies" : "string",
      "thumb" : "string",
      "title" : "string",
      "views" : "string"
    } ],
    "maxId" : 0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="mddtravelusingpost"></a>
#### 目的地相关游记
```
POST /app/dest/mddTravel
```


##### 说明
目的地相关游记<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.mddTravel(com.youxiake.model.master.dest.vo.request.DestTravelFilterRequestRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**departureDate**  <br>*可选*|最小出发日期 传入value数组 json串|string|
|**Query**|**maxId**  <br>*可选*|对应返回的maxId|integer (int32)|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**orderType**  <br>*可选*|0 默认排序 1 最新游记  2 评论时间|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**price**  <br>*可选*|人均花费 传入value数组 json串|string|
|**Query**|**searchType**  <br>*可选*|1 全部游记  2 只看精华|integer (int32)|
|**Query**|**travelType**  <br>*可选*|游记类型  0普通 1精华 2优质 3侠魁  json字符串如  0,1,2|string|
|**Query**|**tripDays**  <br>*可选*|出行天数 传入value数组 json串 例如（["0-3","4-7"]）|string|
|**Query**|**tripType**  <br>*可选*|出游人物 1一个人 2 情侣/夫妻 3亲子 4家庭出游 5 和朋友 6 跟团  json字符串如  0,1,2|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestTravelRespVo»](#e736cafd6a2153e26c243aa585a29c5f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/mddTravel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "departureDate" : "string",
  "maxId" : 0,
  "mddId" : "string",
  "orderType" : 0,
  "page" : 0,
  "price" : "string",
  "searchType" : 0,
  "travelType" : "string",
  "tripDays" : "string",
  "tripType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "filterCondition" : {
      "departureDate" : [ {
        "title" : "string",
        "value" : "string"
      } ],
      "price" : [ {
        "title" : "string",
        "value" : "string"
      } ],
      "travelFilter" : [ {
        "title" : "string",
        "value" : "string"
      } ],
      "travelSort" : [ {
        "title" : "string",
        "value" : "string"
      } ],
      "tripDays" : [ {
        "title" : "string",
        "value" : "string"
      } ]
    },
    "list" : [ {
      "authorId" : 0,
      "authorName" : "string",
      "createTime" : "string",
      "digest" : 0,
      "id" : 0,
      "lineNumInNewsContent" : 0,
      "mdd" : "string",
      "mddNumInNewsContent" : 0,
      "pic" : "string",
      "remark" : "string",
      "replies" : "string",
      "thumb" : "string",
      "title" : "string",
      "views" : "string",
      "xiakui" : 0
    } ],
    "maxId" : 0,
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="morehotusingget"></a>
#### 目的地详情-更多热门国家，城市，目的地，景点
```
GET /app/dest/moreHot
```


##### 说明
目的地详情-更多热门国家，城市，目的地，景点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.moreHot(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|分页|string|
|**Query**|**type**  <br>*可选*|更多类型 1：国家 2：城市 3：热门目的地 4：景点|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MddMoreHotRespVo»](#3dccc854d4a3cea726ec1555eb184bbc)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/moreHot
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string",
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "desc" : "string",
      "higherMdd" : "string",
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0
    } ],
    "totalCount" : 0,
    "totalPage" : 0,
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="neardestusingget"></a>
#### 获取附近目的地
```
GET /app/dest/nearDest
```


##### 说明
获取附近目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.nearDest(java.lang.String,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**lat**  <br>*可选*|纬度|string|
|**Query**|**lng**  <br>*可选*|经度|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestSearchRespVo»](#9d2436a24b1b555cb0525ec7ba5c3e44)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/nearDest
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lat" : "string",
  "lng" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "hotSearch" : [ {
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0
    } ],
    "mddInfo" : [ {
      "lat" : "string",
      "level" : "string",
      "lng" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0
    } ],
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="nearsceneusingget"></a>
#### 附近景点
```
GET /app/dest/nearScene
```


##### 说明
附近景点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.nearScene(com.youxiake.model.master.dest.vo.request.DestNearSceneFilterRequestRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**distanceLocation**  <br>*可选*|距离|integer (int32)|
|**Query**|**mddId**  <br>*可选*|目的id|string|
|**Query**|**page**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**sortType**  <br>*可选*|排序 0推荐 1人气 2距离最近|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MddNearSceneRespVo»](#c27878141557da53f12681b097819653)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/nearScene
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "distanceLocation" : 0,
  "mddId" : "string",
  "page" : 0,
  "pageSize" : 0,
  "sortType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "filterCondition" : {
      "distanceLocation" : [ {
        "title" : "string",
        "value" : "string"
      } ],
      "sortType" : [ {
        "title" : "string",
        "value" : "string"
      } ]
    },
    "list" : [ {
      "desc" : "string",
      "distanceLocation" : "string",
      "higherMdd" : "string",
      "lat" : "string",
      "level" : "string",
      "lng" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0,
      "visitedNum" : "string",
      "wantedNum" : "string"
    } ],
    "totalCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="scenephotosusingget"></a>
#### 景点图库
```
GET /app/dest/scenePhotos
```


##### 说明
景点图库<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.scenePhotos(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestSecenPhotosRespVo»](#ea305cfe181231c45d1dab1ab819fa00)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/scenePhotos
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "height" : "string",
      "id" : 0,
      "pic" : "string",
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "width" : "string"
    } ],
    "picSize" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchdestusingget"></a>
#### 搜索目的地
```
GET /app/dest/searchMdd
```


##### 说明
搜索目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.dest.DestSystemController.searchDest(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keyword**  <br>*可选*|搜索词|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestSearchRespVo»](#9d2436a24b1b555cb0525ec7ba5c3e44)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/dest/searchMdd
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keyword" : "string",
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "hotSearch" : [ {
      "level" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0
    } ],
    "mddInfo" : [ {
      "lat" : "string",
      "level" : "string",
      "lng" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "pointWord" : "string",
      "type" : 0
    } ],
    "pageSize" : 0,
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="8f28df81a7581c4f55b1683abac4006f"></a>
### 目的地系统V2
Dest System Controller V 2


<a name="photosusingget"></a>
#### 景点图库V2
```
GET /app/v2/dest/photos
```


##### 说明
景点图库V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DestSystemControllerV2.photos(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**page**  <br>*可选*|分页|string|
|**Query**|**type**  <br>*可选*|1为游记 2为摄影作品|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DestSecenPhotosRespVo»](#ea305cfe181231c45d1dab1ab819fa00)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/dest/photos
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "mddId" : "string",
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "height" : "string",
      "id" : 0,
      "pic" : "string",
      "thumb" : "string",
      "title" : "string",
      "type" : 0,
      "width" : "string"
    } ],
    "picSize" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="36496fd61a33c3546214d9b667be6d7b"></a>
### 社区首页
Home Page Controller


<a name="getdatausingget_1"></a>
#### 首页
```
GET /app/homepage/data
```


##### 说明
首页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.HomePageController.getData(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BbsPageVO»](#84fd746c996da1374cdab823a17638ba)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/homepage/data
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "banner" : [ {
      "color" : "string",
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "common" : [ {
      "type" : 0
    } ],
    "totalPage" : 0,
    "weekTop" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="getweektoplistusingget"></a>
#### 侠魁列表
```
GET /app/homepage/topList
```


##### 说明
侠魁列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.yxkbbs.HomePageController.getWeekTopList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»](#2a6aabed42a408850bd0118753927af7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/homepage/topList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="ebe9cfcdaf1e1c6a9ef1a0967acbb85c"></a>
### 社区首页V2
Home Page Controller V 2


<a name="getdatausingget"></a>
#### 社区首页
```
GET /app/v2/homepage/data
```


##### 说明
社区首页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.HomePageControllerV2.getData(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**curPage**  <br>*可选*|当前页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BbsPageVO»](#84fd746c996da1374cdab823a17638ba)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/homepage/data
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "curPage" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "banner" : [ {
      "color" : "string",
      "handler" : "string",
      "thumb" : "string",
      "title" : "string",
      "url" : "string"
    } ],
    "common" : [ {
      "type" : 0
    } ],
    "totalPage" : 0,
    "weekTop" : [ {
      "authorName" : "string",
      "authorid" : 0,
      "createdAt" : "string",
      "digest" : 0,
      "displayorder" : "string",
      "fid" : "string",
      "mddName" : "string",
      "msg" : "string",
      "pic" : "string",
      "replies" : "string",
      "summary" : "string",
      "talent" : 0,
      "tid" : 0,
      "title" : "string",
      "type" : 0,
      "url" : "string",
      "views" : "string",
      "yxkid" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="63b4e59f887b2dd25587f59d872582f2"></a>
### 签证信息服务
Visa Info Controller


<a name="channelpageusingget"></a>
#### 签证频道首页
```
GET /app/visa/channel
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.channelPage()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[频道推荐](#4af34500f9ee1f3bb65b707df9ffc521)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/channel
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "countryId" : "string",
  "coverImg" : "string",
  "handler" : "string",
  "name" : "string",
  "order" : 0,
  "orderCount" : 0,
  "pid" : 0,
  "position" : 0,
  "price" : 0.0,
  "productType" : "string",
  "url" : "string",
  "visaId" : 0
}
```


<a name="choosedestusingget"></a>
#### 签证频道-选择国家
```
GET /app/visa/chooseDest
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.chooseDest(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**belongType**  <br>*必填*|国家类型 热门/亚洲/欧美澳非/免签落地签/海岛 其中一种|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaCountry](#visacountry)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/chooseDest
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "belongType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "belongType" : "string",
  "countryId" : 0,
  "countryName" : "string",
  "destName" : "string",
  "parentType" : 0
}
```


<a name="choosetabusingget"></a>
#### 签证频道-选择国家-推荐tab页
```
GET /app/visa/choosetab
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.choosetab()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/choosetab
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="commentdetailusingget"></a>
#### 签证订单评价-评价详情
```
GET /app/visa/comment/detail
```


##### 说明
评价详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.commentDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单编号|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[CommentDetailVO](#commentdetailvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/comment/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "commentId" : 0,
  "content" : "string",
  "createTime" : 0,
  "createTimeAt" : "string",
  "rank" : 0
}
```


<a name="savecommentusingpost_1"></a>
#### 签证订单评价-保存评价
```
POST /app/visa/comment/save
```


##### 说明
保存评价<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.saveComment(com.youxiake.model.master.visa.vo.request.RqOrderCommentVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*必填*|评价内容|string|
|**Query**|**orderId**  <br>*必填*|订单编号|ref|
|**Query**|**rank**  <br>*必填*|评分|ref|
|**Query**|**visaId**  <br>*必填*|签证编号|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[RpHtmlVO](#rphtmlvo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/comment/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string",
  "orderId" : "ref",
  "rank" : "ref",
  "visaId" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "url" : "string"
}
```


<a name="countryvisausingget"></a>
#### 签证频道-选择国家-签证筛选
```
GET /app/visa/countryvisa
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**countryId**  <br>*必填*|国家编号|ref||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaCountryPackVO](#visacountrypackvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/vnd.yxk.v2+json`


##### HTTP请求示例

###### 请求 path
```
/app/visa/countryvisa
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "countryId" : "ref",
  "page" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "countryName" : "string",
  "qzFlag" : "string",
  "qzShowTabs" : [ "string" ],
  "qzTips" : "string",
  "qzType" : "string",
  "qzWay" : "string"
}
```


<a name="visadetailsusingget"></a>
#### 获取签证详情
```
GET /app/visa/detail
```


##### 说明
isSale：上架详情; down: 下架时签证推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.visaDetails(java.lang.Integer,javax.servlet.http.HttpServletRequest,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**id**  <br>*必填*|签证编号|ref||
|**Query**|**page**  <br>*可选*|当前页 签证为下架时传入 默认1|ref|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaInfoVO](#visainfovo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "ref",
  "page" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "acceptScope" : "string",
  "approvalRate" : "string",
  "canstaydays" : "string",
  "commentCount" : 0,
  "costInclude" : "string",
  "costNotInclude" : "string",
  "coverImgs" : [ "object" ],
  "detailH5Url" : "string",
  "discount" : {
    "icon" : "string",
    "title" : "string",
    "url" : "string"
  },
  "id" : 0,
  "isFavorite" : true,
  "materialAddr" : "string",
  "maxPrice" : 0.0,
  "minPrice" : 0.0,
  "mostprocesslength" : 0,
  "name" : "string",
  "otherpic" : "string",
  "packs" : [ {
    "createdAt" : "string",
    "deletedAt" : "string",
    "id" : 0,
    "info" : "string",
    "isDefault" : 0,
    "name" : "string",
    "order" : 0,
    "price" : 0.0,
    "updatedAt" : "string",
    "visaId" : 0
  } ],
  "processlength" : "string",
  "qa" : "string",
  "qiyu" : {
    "data" : "string",
    "groupId" : "string",
    "url" : "string"
  },
  "requirement" : [ {
    "attachments" : "string",
    "certType" : true,
    "content" : "string",
    "createdAt" : "string",
    "deletedAt" : "string",
    "file" : "string",
    "id" : 0,
    "name" : "string",
    "num" : 0,
    "required" : true,
    "type" : 0,
    "updatedAt" : "string",
    "visaId" : 0
  } ],
  "reservationNotes" : "string",
  "shareCover" : "string",
  "shareMsg" : "string",
  "shareUrl" : "string",
  "status" : 0,
  "url" : "string",
  "validperiod" : "string",
  "visaOrdercomment" : {
    "addtime" : 0,
    "avatar" : "string",
    "content" : "string",
    "rank" : 0,
    "username" : "string"
  },
  "visaType" : "string",
  "visacollar" : "string"
}
```


<a name="recommendusingget_1"></a>
#### 签证下架-推荐签证
```
GET /app/visa/down/recommend
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.recommend(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|
|**Query**|**visaId**  <br>*必填*|签证编号|ref||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaBaseVO](#visabasevo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/down/recommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "ref",
  "visaId" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "countLabel" : "string",
  "coverImg" : "string",
  "handler" : "string",
  "status" : 0,
  "visaId" : 0,
  "visaName" : "string",
  "visaPrice" : 0.0
}
```


<a name="favoritelistusingget_1"></a>
#### 签证收藏列表
```
GET /app/visa/favorite/list
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.favoriteList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaBaseVO](#visabasevo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/favorite/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "countLabel" : "string",
  "coverImg" : "string",
  "handler" : "string",
  "status" : 0,
  "visaId" : 0,
  "visaName" : "string",
  "visaPrice" : 0.0
}
```


<a name="favoriteusingpost_2"></a>
#### 签证收藏/取消收藏
```
POST /app/visa/favorite/save
```


##### 说明
true 成功 false 失败<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.favorite(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**visaId**  <br>*必填*|签证编号|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaFavoriteVO](#visafavoritevo)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/favorite/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "visaId" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "isSuccess" : true,
  "msg" : "string"
}
```


<a name="favoritestatususingget"></a>
#### 签证详情-是否收藏
```
GET /app/visa/favorite/status
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.favoriteStatus(java.lang.Integer,javax.servlet.http.HttpServletRequest)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**visaId**  <br>*必填*|签证编号|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[RpVisaFavoriteStatusVO](#rpvisafavoritestatusvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/favorite/status
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "visaId" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "isFavorite" : true
}
```


<a name="iscountryusingget"></a>
#### 综合搜索判断输入项是否是国家
```
GET /app/visa/iscountry
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.iscountry(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**search**  <br>*必填*|search|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaSearchVO](#visasearchvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/iscountry
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "search" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "isCountry" : true,
  "search" : "string"
}
```


<a name="searchusingget_1"></a>
#### 综合搜索返回该国家下的签证
```
GET /app/visa/search
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.search(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|
|**Query**|**search**  <br>*必填*|search|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaBaseVO](#visabasevo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/search
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "ref",
  "search" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "countLabel" : "string",
  "coverImg" : "string",
  "handler" : "string",
  "status" : 0,
  "visaId" : 0,
  "visaName" : "string",
  "visaPrice" : 0.0
}
```


<a name="visacommentusingget"></a>
#### 评价列表
```
GET /app/visa/visacomment
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaInfoController.visacomment(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|ref|`"1"`|
|**Query**|**visaId**  <br>*必填*|签证编号|ref||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaCommentVO](#visacommentvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/visacomment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "ref",
  "visaId" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "addtime" : 0,
  "avatar" : "string",
  "content" : "string",
  "rank" : 0,
  "username" : "string"
}
```


<a name="7a084c0c5c01ef407484a4b9e9b75491"></a>
### 签证订单管理
Visa Order Controller


<a name="bookdateusingget"></a>
#### 签证预订-选择日期
```
GET /app/visa/order/book/date
```


##### 说明
签证预订-选择日期<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.bookDate(com.youxiake.model.master.visa.vo.request.VisaBookRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*可选*|签证套餐id|integer (int32)|
|**Query**|**endTime**  <br>*可选*|结束时间|string|
|**Query**|**startTime**  <br>*可选*|出发时间|string|
|**Query**|**vid**  <br>*可选*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[VisaBookDetailVO](#visabookdetailvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/book/date
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "endTime" : "string",
  "startTime" : "string",
  "vid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "address_url" : "string",
  "bid" : 0,
  "city" : "string",
  "endTime" : "string",
  "expressTip" : "string",
  "matterAddr" : "string",
  "notes" : "string",
  "passport_exp" : 0,
  "passport_tip" : "string",
  "pkgName" : "string",
  "price" : 0.0,
  "startTime" : "string",
  "userinfo" : {
    "email" : "string",
    "name" : "string",
    "note" : "string",
    "phone" : "string"
  },
  "vid" : 0,
  "visaName" : "string"
}
```


<a name="bookmealusingget"></a>
#### 签证预订-选择套餐
```
GET /app/visa/order/book/meal
```


##### 说明
签证预订-选择套餐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.bookMeal(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**bid**  <br>*必填*|签证套餐id|integer (int32)|
|**Query**|**vid**  <br>*必填*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VisaBookVO»](#74adfc07af4747f914c87060e761c0fa)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/book/meal
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "bid" : 0,
  "vid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "bid" : 0,
    "endTime" : "string",
    "startTime" : "string",
    "vid" : 0
  },
  "msg" : "string"
}
```


<a name="cancelorderusingpost"></a>
#### 取消订单
```
POST /app/visa/order/cancel
```


##### 说明
取消订单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.cancelOrder(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap»](#b6403a414d6f3961772d44a78eb32165)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/cancel
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="deleteorderusingpost"></a>
#### 删除订单
```
POST /app/visa/order/delete
```


##### 说明
删除订单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.deleteOrder(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap»](#b6403a414d6f3961772d44a78eb32165)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="orderdetailusingget_1"></a>
#### 订单详情
```
GET /app/visa/order/detail
```


##### 说明
订单详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.orderDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VisaOrderDetailVO»](#e17c25719167ddb8d5e627d0c2e74583)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "addr" : "string",
    "bid" : 0,
    "cancelbtn" : 0,
    "commentbtn" : 0,
    "ctreatTime" : "string",
    "deleteMsg" : "string",
    "deletebtn" : 0,
    "email" : "string",
    "express" : 0,
    "invoiceEnabledbtn" : 0,
    "invoiceMsg" : "string",
    "invoicebtn" : 0,
    "matterAddr" : "string",
    "oid" : 0,
    "orderNo" : "string",
    "orderNum" : 0,
    "paybtn" : 0,
    "phone" : "string",
    "pic" : "string",
    "pkgName" : "string",
    "price" : 0.0,
    "qiyuData" : "string",
    "qiyuUrl" : "string",
    "qiyuroupId" : "string",
    "remark" : "string",
    "shareUrl" : "string",
    "status" : 0,
    "statusDesc" : "string",
    "sureMsg" : "string",
    "surebtn" : 0,
    "unitPrice" : 0.0,
    "userList" : [ {
      "applyBtn" : 0,
      "id" : 0,
      "name" : "string",
      "passport" : "string",
      "progress" : 0,
      "progressDetail" : "string",
      "progressUrl" : "string",
      "refundUrl" : "string",
      "traceBtn" : 0,
      "viewBtn" : 0
    } ],
    "userName" : "string",
    "vid" : 0,
    "viewCommentbtn" : 0,
    "viewInvoicebtn" : 0,
    "visaDesc" : "string",
    "visaName" : "string"
  },
  "msg" : "string"
}
```


<a name="orderlistusingget_1"></a>
#### 订单列表
```
GET /app/visa/order/list
```


##### 说明
订单列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.orderList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*必填*|分页|integer (int32)|
|**Query**|**status**  <br>*必填*|0全部 1待付款 2待出签 3待收货 4待评价|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[VisaOrderListItemVO](#visaorderlistitemvo)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "status" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "bid" : 0,
  "cancelbtn" : 0,
  "commentbtn" : 0,
  "deleteMsg" : "string",
  "deletebtn" : 0,
  "invoiceEnabledbtn" : 0,
  "invoiceMsg" : "string",
  "invoicebtn" : 0,
  "oid" : 0,
  "orderNo" : "string",
  "orderNum" : 0,
  "paybtn" : 0,
  "pic" : "string",
  "pkgName" : "string",
  "price" : 0.0,
  "qiyuData" : "string",
  "qiyuUrl" : "string",
  "qiyuroupId" : "string",
  "shareUrl" : "string",
  "status" : 0,
  "statusDesc" : "string",
  "sureMsg" : "string",
  "surebtn" : 0,
  "unitPrice" : 0.0,
  "vid" : 0,
  "viewCommentbtn" : 0,
  "viewInvoicebtn" : 0,
  "visaName" : "string"
}
```


<a name="orderpayusingget"></a>
#### 支付详情
```
GET /app/visa/order/pay/detail
```


##### 说明
支付详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.orderPay(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VisaOrderPayDetailVO»](#9e3d0855be9a9260f0a227e032409a66)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/pay/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "bid" : 0,
    "oid" : 0,
    "pkgName" : "string",
    "price" : 0.0,
    "sec" : 0,
    "vid" : 0,
    "visaName" : "string"
  },
  "msg" : "string"
}
```


<a name="pricedetailusingget"></a>
#### 费用明细
```
GET /app/visa/order/pricedetail
```


##### 说明
返回data 数据  "data": {
"html": }<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.priceDetail(com.youxiake.model.master.visa.vo.request.VisaPriceRq) throws java.lang.Exception


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**address**  <br>*可选*|快递为1时收货地址的id  填写订单时候使用|integer (int32)|
|**Query**|**bid**  <br>*可选*|签证套餐id 填写订单时候使用|integer (int32)|
|**Query**|**codeid**  <br>*可选*|codeid   填写订单时候使用|integer (int32)|
|**Query**|**num**  <br>*可选*|签证人数数量   填写订单时候使用|integer (int32)|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap»](#b6403a414d6f3961772d44a78eb32165)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/pricedetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "address" : 0,
  "bid" : 0,
  "codeid" : 0,
  "num" : 0,
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="commitreceiveusingpost"></a>
#### 确认收货
```
POST /app/visa/order/receive
```


##### 说明
确认收货<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.commitReceive(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap»](#b6403a414d6f3961772d44a78eb32165)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/receive
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="ordersaveusingpost_2"></a>
#### 保存订单
```
POST /app/visa/order/save
```


##### 说明
保存订单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.visa.v1.VisaOrderController.orderSave(com.youxiake.model.master.visa.vo.request.VisaOrderSaveRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**address**  <br>*可选*|快递为1时收货地址的id|integer (int32)|
|**Query**|**bid**  <br>*可选*|签证套餐id|integer (int32)|
|**Query**|**codeid**  <br>*可选*|代金券|integer (int32)|
|**Query**|**email**  <br>*可选*|联系人邮箱|string|
|**Query**|**endTime**  <br>*可选*|结束时间|string|
|**Query**|**express**  <br>*可选*|领取方式 ：快递:1   自取:2|integer (int32)|
|**Query**|**num**  <br>*可选*|签证人数数量|integer (int32)|
|**Query**|**phone**  <br>*可选*|联系人电话|string|
|**Query**|**remark**  <br>*可选*|备注|string|
|**Query**|**startTime**  <br>*可选*|出发时间|string|
|**Query**|**traveler**  <br>*可选*|办签人|< string > array(multi)|
|**Query**|**userName**  <br>*可选*|联系人名称|string|
|**Query**|**vid**  <br>*可选*|签证产品id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«VisaOrderSaveVO»](#ce79a2397b6fff8ecbfdccf8ca5a68f6)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/visa/order/save
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "address" : 0,
  "bid" : 0,
  "codeid" : 0,
  "email" : "string",
  "endTime" : "string",
  "express" : 0,
  "num" : 0,
  "phone" : "string",
  "remark" : "string",
  "startTime" : "string",
  "traveler" : "string",
  "userName" : "string",
  "vid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "bid" : 0,
    "oid" : 0,
    "pkgName" : "string",
    "price" : 0.0,
    "sec" : 0,
    "vid" : 0,
    "visaName" : "string"
  },
  "msg" : "string"
}
```


<a name="0415fe48bdebdc275b035dae7ab3cc8c"></a>
### 统计管理
Statistics No Auth Controller


<a name="statisticscommonusingpost"></a>
#### 各个埋点统计
```
POST /app/n/statistics/common
```


##### 说明
各个埋点统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsCommon(com.youxiake.model.master.common.vo.request.StatisticsRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**functionType**  <br>*可选*|功能类型必填：1在线客服埋点|integer (int32)|
|**Query**|**parametersJson**  <br>*可选*|参数json字符串。functionType1-》serviceType（数字）：1线路详情2签证详情3线路订单详情4签证订单详情；serviceOtherId（数字）：线路id/签证id/线路订单id/签证订单id（订单详情里传订单id）|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/common
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "functionType" : 0,
  "parametersJson" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsdatausingget"></a>
#### 获取Growing埋点所需数据
```
GET /app/n/statistics/data
```


##### 说明
获取Growing埋点所需数据<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsData(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|id|string|
|**Query**|**type**  <br>*可选*|1：生成订单bid，2：支付成功oid，3：取消订单oid，4：线路详情pid，5：登陆用户变量uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/data
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsinstallusingpost"></a>
#### 安装统计
```
POST /app/n/statistics/install
```


##### 说明
安装统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsInstall(com.youxiake.model.master.user.vo.SstatisticsInstallVo)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Query**|**device**  <br>*可选*|设备类型|string|
|**Query**|**device_id**  <br>*可选*|手机身份证号|string|
|**Query**|**os**  <br>*可选*|操作系统|string|
|**Query**|**os_version**  <br>*可选*|手机系统版本|string|
|**Query**|**pre_version**  <br>*可选*|app前版本|string|
|**Query**|**type**  <br>*可选*|安装或更新|integer (int32)|
|**Query**|**version**  <br>*可选*|当前版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/install
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "device" : "string",
  "device_id" : "string",
  "os" : "string",
  "os_version" : "string",
  "pre_version" : "string",
  "type" : 0,
  "version" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsnewsviewusingpost"></a>
#### 用户攻略浏览统计
```
POST /app/n/statistics/news/view
```


##### 说明
用户攻略浏览统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsNewsView(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Long,java.lang.Long)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**create_time**  <br>*可选*|create_time|string|
|**Query**|**leave_time**  <br>*可选*|leave_time|string|
|**Query**|**nid**  <br>*可选*|nid|string|
|**Query**|**uid**  <br>*可选*|uid|string|
|**Query**|**vid**  <br>*可选*|vid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/news/view
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "create_time" : "string",
  "leave_time" : "string",
  "nid" : "string",
  "uid" : "string",
  "vid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsproductusingpost_1"></a>
#### 用户下单埋点
```
POST /app/n/statistics/product
```


##### 说明
用户下单埋点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsProduct(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**code**  <br>*可选*|统计来源code&origin_id&pid|string|
|**Query**|**path**  <br>*可选*|1收藏列表点击|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/product
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "code" : "string",
  "path" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsproductupdateusingpost_1"></a>
#### 用户下单埋点,下单成功，更新对应的OID
```
POST /app/n/statistics/productUpdate
```


##### 说明
用户下单埋点,下单成功，更新对应的OID<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsProductUpdate(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*必填*|id|string|
|**Query**|**oid**  <br>*必填*|oid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/productUpdate
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsregisterusingpost"></a>
#### 用户注册埋点
```
POST /app/n/statistics/register
```


##### 说明
用户注册埋点<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsRegister(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**code**  <br>*必填*|loginmd:code&origin_id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/register
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "code" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsviewusingpost"></a>
#### 用户搜索统计
```
POST /app/n/statistics/search
```


##### 说明
用户搜索统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsView(java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**keywords**  <br>*必填*|搜索值|string|
|**Query**|**pageFrom**  <br>*可选*|页面来源  1 (APP首页) 2( 遇见首页) 3 (社区首页)|string|
|**Query**|**platform**  <br>*必填*|platform|string|
|**Query**|**uid**  <br>*可选*|uid|string|
|**Query**|**username**  <br>*可选*|username|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/search
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "keywords" : "string",
  "pageFrom" : "string",
  "platform" : "string",
  "uid" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsviewusingpost_1"></a>
#### 用户线路浏览统计
```
POST /app/n/statistics/view
```


##### 说明
用户线路浏览统计<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.StatisticsNoAuthController.statisticsView(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Long,java.lang.Long,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**create_time**  <br>*必填*|create_time|string|
|**Query**|**end_time**  <br>*必填*|end_time|string|
|**Query**|**id**  <br>*可选*|id|integer (int32)|
|**Query**|**mark**  <br>*可选*|mark|string|
|**Query**|**pid**  <br>*必填*|pid|string|
|**Query**|**platform**  <br>*必填*|platform|string|
|**Query**|**product_name**  <br>*必填*|product_name|string|
|**Query**|**uid**  <br>*可选*|uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/statistics/view
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "create_time" : "string",
  "end_time" : "string",
  "id" : 0,
  "mark" : "string",
  "pid" : "string",
  "platform" : "string",
  "product_name" : "string",
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="38d1d853c5e21f5a7be4de32f4049a4e"></a>
### 统计管理V2
Statistics Controller V 2


<a name="statisticsproductusingpost"></a>
#### 用户下单埋点V2
```
POST /app/v2/statistics/product
```


##### 说明
用户下单埋点V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.StatisticsControllerV2.statisticsProduct(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**code**  <br>*可选*|统计来源：code&origin_id@code&origin_id&pid|string|
|**Query**|**path**  <br>*可选*|1收藏列表点击|string|
|**Query**|**pid**  <br>*可选*|code为空时必须传pid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,object»»](#a4dc8b3d9ef0de21b689160822d74fa7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/statistics/product
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "code" : "string",
  "path" : "string",
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="statisticsproductupdateusingpost"></a>
#### 用户下单埋点,下单成功，更新对应的OID。V2
```
POST /app/v2/statistics/productUpdate
```


##### 说明
用户下单埋点,下单成功，更新对应的OID。V2<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.v2.StatisticsControllerV2.statisticsProductUpdate(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*必填*|统计id：id,id|string|
|**Query**|**oid**  <br>*必填*|oid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«object»](#bb4d20a43e68c5300443488c67d9b56d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/statistics/productUpdate
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "oid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="e59efacd43df020fa0f013233b21461e"></a>
### 聊天群
Im Group Controller


<a name="batchjoinusingpost"></a>
#### 批量加入群组
```
POST /app/im/group/batchjoin
```


##### 说明
批量加入群组<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.batchJoin(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群组id|integer (int32)|
|**Query**|**uid**  <br>*可选*|用户id,json串|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/batchjoin
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="groupdetailusingget"></a>
#### 群基本信息-打开群聊天界面调用
```
GET /app/im/group/detail
```


##### 说明
聊天群基本信息-打开群聊天界面调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.groupDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*必填*|groupid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImGroupDetailVO»](#23beb4e6bf0c038bfea7ffc2cd42df35)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "gid" : 0,
    "groupimg" : "string",
    "groupname" : "string",
    "groupnotice" : "string",
    "in_group" : 0,
    "in_share" : 0,
    "isOpenShare" : 0,
    "last_update" : {
      "avatar" : "string",
      "gnick" : "string",
      "uid" : 0
    },
    "nums" : 0,
    "shareTip" : "string",
    "sid" : 0,
    "status" : 0,
    "uids" : "string",
    "update_time" : 0
  },
  "msg" : "string"
}
```


<a name="editgroupnickusingpost"></a>
#### 修改群昵称
```
POST /app/im/group/editgnick
```


##### 说明
修改群昵称<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.editGroupNick(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**gnick**  <br>*可选*|群昵称|string|
|**Query**|**groupid**  <br>*可选*|群id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/editgnick
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "gnick" : "string",
  "groupid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="editnoticeusingpost"></a>
#### 修改群公告
```
POST /app/im/group/editnotice
```


##### 说明
修改群公告<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.editNotice(java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群id|integer (int32)|
|**Query**|**notice**  <br>*可选*|群公告|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/editnotice
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "notice" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="existgroupusingget"></a>
#### 判断是否存在群
```
GET /app/im/group/exist
```


##### 说明
判断是否存在群<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.existGroup(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*必填*|groupid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImGroupProviderVO»](#9c485ec3a6cab700370b4367a11f90c4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/exist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "gid" : "string",
    "groupimg" : "string",
    "groupname" : "string",
    "in_group" : 0
  },
  "msg" : "string"
}
```


<a name="joingroupusingpost"></a>
#### 邀请加入群聊
```
POST /app/im/group/join
```


##### 说明
邀请加入群聊<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.joinGroup(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*必填*|群id|string|
|**Query**|**source**  <br>*可选*|加群渠道来源: qrcode:二维码, admin:后台添加|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/join
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : "string",
  "source" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="grouplistusingget"></a>
#### 会话列表-消息界面调用
```
GET /app/im/group/list
```


##### 说明
会话列表-消息界面调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.groupList()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«GroupsListVO»](#44bfb162c6a53ec2bbf560e759023b9f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/list
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "groupsList" : [ {
      "gid" : "string",
      "groupname" : "string",
      "status" : 0
    } ],
    "lastShareID" : 0,
    "shareList" : [ {
      "gid" : "string",
      "groupname" : "string",
      "status" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="groupmemberinfousingget"></a>
#### 获取当前用户在指定群的信息
```
GET /app/im/group/member/info
```


##### 说明
获取当前用户在指定群的信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.groupMemberInfo(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群id|integer (int32)|
|**Query**|**uid**  <br>*可选*|用户id，如果加了该参数，返回的用户信息是该用户的，不是登录用户的|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«GroupMemberInfoVo»](#d7342cc7cd3f6c11aaa313340b9c07ea)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/member/info
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "edit_notice" : 0,
    "gnick" : "string",
    "groupid" : 0,
    "is_admin" : 0,
    "uid" : 0
  },
  "msg" : "string"
}
```


<a name="getgroupmembersusingget"></a>
#### 群成员列表
```
GET /app/im/group/members
```


##### 说明
群成员列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.getGroupMembers(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**groupid**  <br>*可选*|群组id|integer (int32)||
|**Query**|**page**  <br>*可选*|分页|integer (int32)|`1`|
|**Query**|**relation**  <br>*可选*|1或者0,是否返回当前登录用户与群成员的关系|integer (int32)||
|**Query**|**search**  <br>*可选*|搜素的群成员名称|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«GroupMembersWrapVo»](#9b3fa6195e881a08b2813f9728d27220)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/members
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "page" : 0,
  "relation" : 0,
  "search" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "memberList" : [ {
      "avatar" : "string",
      "bio" : "string",
      "gnick" : "string",
      "is_gag" : "string",
      "relation" : "string",
      "role" : "string",
      "sex" : 0,
      "uid" : 0
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="groupproviderusingget"></a>
#### 获取聊天群基本信息-融云提供者模式调用
```
GET /app/im/group/provider
```


##### 说明
获取聊天群基本信息-融云提供者模式调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.groupProvider(java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*必填*|groupid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImGroupProviderVO»_1](#daae46f4611664c1670577493734a266)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/provider
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "gid" : "string",
    "groupimg" : "string",
    "groupname" : "string"
  },
  "msg" : "string"
}
```


<a name="quitusingpost"></a>
#### 退出群聊
```
POST /app/im/group/quit
```


##### 说明
退出群聊<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.quit(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/quit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="gettokenusingget"></a>
#### 获取融云token
```
GET /app/im/group/token
```


##### 说明
获取融云token<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.getToken()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/token
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="tquitusingpost"></a>
#### 管理员T出群聊
```
POST /app/im/group/tquit
```


##### 说明
管理员T出群聊<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.tQuit(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群id|integer (int32)|
|**Query**|**uid**  <br>*可选*|被t用户id  json串|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/tquit
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="addblackusingpost"></a>
#### 将用户拉入黑名单
```
POST /app/im/group/user/black
```


##### 说明
将用户拉入黑名单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.addBlack(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*可选*|被拉黑的用户id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/user/black
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="addgagusingpost"></a>
#### 用户禁言
```
POST /app/im/group/user/gag
```


##### 说明
用户禁言<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.addGag(java.lang.Integer,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群组id|integer (int32)|
|**Query**|**minute**  <br>*可选*|禁言时间 单位分钟|integer (int32)|
|**Query**|**uid**  <br>*可选*|禁言用户id数组,json串|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/user/gag
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "minute" : 0,
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="rollbackusingpost"></a>
#### 解除用户禁言
```
POST /app/im/group/user/gag/rollback
```


##### 说明
解除用户禁言<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.rollback(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*可选*|群组id|integer (int32)|
|**Query**|**uid**  <br>*可选*|解除言用户id数组,json串|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/user/gag/rollback
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0,
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="isblackusingpost"></a>
#### 判断用户是否是自己的黑名单用户
```
POST /app/im/group/user/isblack
```


##### 说明
判断用户是否是自己的黑名单用户<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.isblack(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*可选*|用户id数组，Json串|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/user/isblack
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="removeblackusingpost"></a>
#### 用户移除黑名单
```
POST /app/im/group/user/removeblack
```


##### 说明
用户移除黑名单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.removeBlack(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*可选*|被移除黑名单的用户id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/group/user/removeblack
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="reportusingpost_1"></a>
#### 投诉举报
```
POST /app/im/report
```


##### 说明
投诉举报<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.report(java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**itemid**  <br>*可选*|群组id或者用户id|integer (int32)|
|**Query**|**reason**  <br>*可选*|投诉原因，具体有：色情、暴力、侮辱、侵权、广告、其他|string|
|**Query**|**type**  <br>*可选*|只能取值im_group、im_user；当itemid为群组的时候，type值为:im_group。当itemid为用户id的时候,type值为:im_user|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "itemid" : 0,
  "reason" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="isrongcloudusingget"></a>
#### 判断是否为融云sdk
```
GET /app/im/rongcloud
```


##### 说明
判断是否为融云sdk<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.isRongCloud()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/rongcloud
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="memberdetailusingget"></a>
#### 群成员信息-群设置界面调用
```
GET /app/im/setting/member/detail
```


##### 说明
群成员信息-群设置界面调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.memberDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupid**  <br>*必填*|groupid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImGroupMemberInfoDetailVO»](#c599ca8a1c1e8b13b361244cddcbba9a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/setting/member/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "edit_notice" : 0,
    "gnick" : "string",
    "groupid" : 0,
    "is_admin" : 0,
    "uid" : 0
  },
  "msg" : "string"
}
```


<a name="getremovesharegroupusingget"></a>
#### 获取用户分享时候需要剔除的群列表
```
GET /app/im/share/remove
```


##### 说明
获取用户分享时候需要剔除的群列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.getRemoveShareGroup()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BaseListVO»](#3920d0dec6109dfd06986e3ec90b995c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/share/remove
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : "object"
  },
  "msg" : "string"
}
```


<a name="starttalkusingpost"></a>
#### 发起私聊
```
POST /app/im/talk
```


##### 说明
发起私聊<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.startTalk(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**fuid**  <br>*必填*|fuid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«TaklVo»](#9bf61f8ebb34d02509ea4e8b6030b382)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/talk
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "fuid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "tip" : "string"
  },
  "msg" : "string"
}
```


<a name="userproviderusingget"></a>
#### 获取用户基本信息-融云提供者模式调用
```
GET /app/im/user/provider
```


##### 说明
获取用户基本信息-融云提供者模式调用<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImGroupController.userProvider(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**uid**  <br>*必填*|uid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImUserProviderVO»](#1420198f86bd9ec1e8ec59066b9705b2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/im/user/provider
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "nick" : "string",
    "uid" : "string"
  },
  "msg" : "string"
}
```


<a name="getsharerelusingget"></a>
#### 获取分享会相关线路，攻略
```
GET /app/imshare/about
```


##### 说明
获取分享会相关线路，攻略<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.getShareRel(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*可选*|imShareId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ShareRelVO»](#68a03ebb7a2b8bd63657fdafd467062b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/about
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "lines" : [ {
      "adultprice" : 0.0,
      "class_theme_id" : 0,
      "days_label" : "string",
      "liangdian" : [ "string" ],
      "pid" : 0,
      "place_label" : "string",
      "price_label" : "string",
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "shortTitle" : "string",
      "statisticsCode" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "type" : 0
    } ],
    "strategys" : [ {
      "comment" : "string",
      "label" : [ "string" ],
      "news_id" : 0,
      "thumb" : "string",
      "title" : "string",
      "view" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="addshareusingpost"></a>
#### 加入分享会
```
POST /app/imshare/add
```


##### 说明
加入分享会<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.addShare(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**groupId**  <br>*必填*|群id|ref|
|**Query**|**imShareId**  <br>*必填*|分享会id|ref|
|**Query**|**source**  <br>*必填*|来源 1.二维码, 2.后台添加, 3.消息通知进入, 4.群聊进入|ref|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "groupId" : "ref",
  "imShareId" : "ref",
  "source" : "ref"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="detailliveusingget"></a>
#### 分享会详情-直播
```
GET /app/imshare/detail
```


##### 说明
分享会详情-直播<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.detailLive(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*可选*|imShareId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImShareDetailVO»](#79329ebea9676c1baaac6e1247b9c6fb)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "groupId" : 0,
    "guestUidList" : [ "string" ],
    "hostUidList" : [ "string" ],
    "host_group" : "string",
    "imShareId" : 0,
    "imgList" : [ "string" ],
    "statisId" : 0,
    "status" : 0,
    "title" : "string",
    "userCount" : 0,
    "user_group" : "string"
  },
  "msg" : "string"
}
```


<a name="gethistorymsgusingget"></a>
#### 分享会历史消息
```
GET /app/imshare/history
```


##### 说明
分享会历史消息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.gethistoryMsg(com.youxiake.model.master.im.imshare.vo.request.RongHistoryRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**count**  <br>*可选*|返回消息数量|integer (int32)|
|**Query**|**direction**  <br>*可选*|请求方式 1:下一页 2：上一页|integer (int32)|
|**Query**|**imshare_id**  <br>*可选*|分享会ID|string|
|**Query**|**msg_type**  <br>*可选*|请求类型 1:直播 2:讨论|integer (int32)|
|**Query**|**recordTime**  <br>*可选*|最后消息时间戳|integer (int64)|
|**Query**|**require_lastid**  <br>*可选*|上次请求最后消息id|string|
|**Query**|**view_lastid**  <br>*可选*|上次查看消息最后消息id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«RongHistoryVO»](#0b8a58ea0e56b53d8418b350fb922eed)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/history
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "count" : 0,
  "direction" : 0,
  "imshare_id" : "string",
  "msg_type" : 0,
  "recordTime" : 0,
  "require_lastid" : "string",
  "view_lastid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "channelType" : "string",
      "content" : "string",
      "fromUserId" : "string",
      "groupUserIds" : [ "string" ],
      "msgTimestamp" : "string",
      "msgUID" : "string",
      "objectName" : "string",
      "sensitiveType" : 0,
      "source" : "string",
      "toUserId" : "string"
    } ],
    "pageNumber" : 0,
    "pageSize" : 0,
    "unread_count" : 0
  },
  "msg" : "string"
}
```


<a name="deletehistorymsgusingpost"></a>
#### 删除分享会直播消息
```
POST /app/imshare/history/delete
```


##### 说明
删除分享会直播消息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.deleteHistoryMsg(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*必填*|分享会id 例如 share_host_89|string|
|**Query**|**msgUID**  <br>*必填*|消息uid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/history/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : "string",
  "msgUID" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="mergeusingpost"></a>
#### 分享会语音合成
```
POST /app/imshare/merge
```


##### 说明
分享会语音合成<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.merge(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*必填*|分享会id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/merge
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="shareoverusingpost"></a>
#### 分享会结束
```
POST /app/imshare/over
```


##### 说明
分享会结束<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.shareOver(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*可选*|imShareId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/over
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="productlistusingget"></a>
#### 分享会产品列表
```
GET /app/imshare/product/list
```


##### 说明
分享会产品列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.productList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ProductBasicModel»»»](#0c1e323d6393141844102aadd4eec5b5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/product/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "adultprice" : 0.0,
      "class_theme_id" : 0,
      "days_label" : "string",
      "liangdian" : [ "string" ],
      "pid" : 0,
      "place_label" : "string",
      "price_label" : "string",
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "shortTitle" : "string",
      "statisticsCode" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "type" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="detailreviewusingget"></a>
#### 分享会详情-回看
```
GET /app/imshare/review/detail
```


##### 说明
分享会详情-回看<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.detailReview(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**imShareId**  <br>*可选*|imShareId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ImShareDetailVO»](#79329ebea9676c1baaac6e1247b9c6fb)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/review/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "imShareId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "groupId" : 0,
    "guestUidList" : [ "string" ],
    "hostUidList" : [ "string" ],
    "host_group" : "string",
    "imShareId" : 0,
    "imgList" : [ "string" ],
    "statisId" : 0,
    "status" : 0,
    "title" : "string",
    "userCount" : 0,
    "user_group" : "string"
  },
  "msg" : "string"
}
```


<a name="reviewlistusingget"></a>
#### 直播回放列表
```
GET /app/imshare/review/list
```


##### 说明
直播回放列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.reviewList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«ImShareReviewListVO»»»](#74b358cb117939376575ce8310035cc4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/review/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "groupId" : 0,
      "imshare_id" : 0,
      "published_time" : "string",
      "thumb" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="statisusingget"></a>
#### 退出分享会
```
GET /app/imshare/statis
```


##### 说明
退出分享会<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.imgroup.ImShareController.statis(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**statisId**  <br>*可选*|statisId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/imshare/statis
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "statisId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="390df9f5b1dee23f572e21da202788e4"></a>
### 视频
Film Controller


<a name="addfilmcommentusingpost"></a>
#### 视频评论添加
```
POST /app/community/add-film-comment
```


##### 说明
视频评论添加<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.addFilmComment(java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|页面大小|integer (int32)|`0`|
|**Query**|**content**  <br>*可选*|评论内容|integer (int32)||
|**Query**|**film_id**  <br>*可选*|视频id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FilmCommentBean»](#c64371de0b859e52f53532fa7865aaad)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/add-film-comment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "content" : 0,
  "film_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "comment_id" : 0,
    "film_id" : 0,
    "from" : {
      "avatar" : "string",
      "content" : "string",
      "create_time" : 0,
      "level" : "string",
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    },
    "to" : {
      "avatar" : "string",
      "content" : "string",
      "create_time" : 0,
      "level" : "string",
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    }
  },
  "msg" : "string"
}
```


<a name="addfilmviewcountusingpost"></a>
#### 视频播放次数添加
```
POST /app/community/add-film-view-count
```


##### 说明
视频播放次数添加<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.addFilmViewCount(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**film_id**  <br>*可选*|视频id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/add-film-view-count
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "film_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="delfilmcommentusingpost"></a>
#### 视频评论删除
```
POST /app/community/del-film-comment
```


##### 说明
视频评论删除<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.delFilmComment(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/del-film-comment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="filmcommentusingget"></a>
#### 视频评论和详情信息
```
GET /app/community/filmcomment
```


##### 说明
视频评论和详情信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmcomment(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**cid**  <br>*可选*|评论id|integer (int32)||
|**Query**|**film_id**  <br>*可选*|视频id|integer (int32)||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**page_size**  <br>*可选*|页面大小|integer (int32)|`20`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FilmCommentDetailVO»](#29f8223a3d2d073f3e2fc0c801aacee3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmcomment
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "cid" : 0,
  "film_id" : 0,
  "page" : 0,
  "page_size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "comment_count" : 0,
    "commentlist" : [ {
      "comment_id" : 0,
      "film_id" : 0,
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : 0,
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : 0,
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      }
    } ],
    "count_page" : 0,
    "current_page" : 0,
    "page_size" : 0
  },
  "msg" : "string"
}
```


<a name="filmdetailusingget"></a>
#### 视频详情信息
```
GET /app/community/filmdetail
```


##### 说明
视频详情信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmdetail(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**film_id**  <br>*可选*|film_id|integer (int32)|`1`|
|**Query**|**project_id**  <br>*可选*|专题id|integer (int32)|`1`|
|**Query**|**wap_flag**  <br>*可选*|wap_flag m站调用接口标识 1：m站请求 只输出iframe内容  0：APP 输出带html标签内容|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Film»](#b98b94d6b5af50ebed1b3474a95db878)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmdetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "film_id" : 0,
  "project_id" : 0,
  "wap_flag" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "film" : {
      "comment_count" : 0,
      "copyright" : 0,
      "desc" : "string",
      "desc_html" : "string",
      "detail" : "string",
      "duration" : "string",
      "film_id" : 0,
      "full_tag" : "string",
      "is_like" : 0,
      "like_count" : 0,
      "location" : "string",
      "published_time" : "string",
      "qiniuSrcUrl" : "string",
      "qiniu_src" : [ {
        "src" : "string",
        "title" : "string"
      } ],
      "qiniu_src_defualt" : 0,
      "scan_count" : "string",
      "share_url" : "string",
      "sourceType" : 0,
      "thumb" : "string",
      "title" : "string",
      "vid" : "string",
      "video_html" : "string",
      "view_app" : 0,
      "view_count" : 0,
      "view_m" : 0,
      "view_pc" : 0,
      "view_src" : "string",
      "xid" : "string"
    },
    "newest_comment" : [ {
      "comment_id" : 0,
      "film_id" : 0,
      "from" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : 0,
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      },
      "to" : {
        "avatar" : "string",
        "content" : "string",
        "create_time" : 0,
        "level" : "string",
        "uid" : 0,
        "username" : "string",
        "yxkCert" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ]
      }
    } ],
    "product" : [ {
      "dayAndNights" : "string",
      "days" : "string",
      "minpric" : "string",
      "nights" : "string",
      "pid" : 0,
      "place_label" : "string",
      "pro_pic" : "string",
      "statisticsCode" : "string",
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="filmlikeusingpost"></a>
#### 视频点赞
```
POST /app/community/filmlike
```


##### 说明
视频点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmlike(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**film_id**  <br>*可选*|视频id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmlike
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "film_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="filmlistusingget"></a>
#### 精彩视频列表页
```
GET /app/community/filmlist
```


##### 说明
精彩视频列表页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmlist(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**page_size**  <br>*可选*|页面大小|integer (int32)|`20`|
|**Query**|**tag_id**  <br>*可选*|标签id|integer (int32)|`194`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FilmlistVO»](#fb8360cbfada09083a7bebae99482ce1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmlist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "page_size" : 0,
  "tag_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "current_page" : 0,
    "list" : [ {
      "comment_count" : 0,
      "copyright" : 0,
      "desc" : "string",
      "desc_html" : "string",
      "detail" : "string",
      "duration" : "string",
      "film_id" : 0,
      "full_tag" : "string",
      "is_like" : 0,
      "like_count" : 0,
      "location" : "string",
      "published_time" : "string",
      "qiniuSrcUrl" : "string",
      "qiniu_src" : [ {
        "src" : "string",
        "title" : "string"
      } ],
      "qiniu_src_defualt" : 0,
      "scan_count" : "string",
      "share_url" : "string",
      "sourceType" : 0,
      "thumb" : "string",
      "title" : "string",
      "vid" : "string",
      "video_html" : "string",
      "view_app" : 0,
      "view_count" : 0,
      "view_m" : 0,
      "view_pc" : 0,
      "view_src" : "string",
      "xid" : "string"
    } ],
    "project_list" : [ {
      "desc" : "string",
      "project_id" : 0,
      "thumb" : "string",
      "title" : "string"
    } ],
    "tag" : {
      "tag_list" : [ {
        "tag_id" : 0,
        "tag_name" : "string"
      } ]
    },
    "total_page" : 0
  },
  "msg" : "string"
}
```


<a name="filmprojectdetailusingget"></a>
#### 专题详情页
```
GET /app/community/filmprojectdetail
```


##### 说明
专题详情页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmprojectdetail(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|页数|integer (int32)|`1`|
|**Query**|**page_size**  <br>*可选*|页面大小|integer (int32)|`5`|
|**Query**|**project_id**  <br>*可选*|专题id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«FilmProjectVO»](#ddc72b7667888191afc831df255f0839)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmprojectdetail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "page_size" : 0,
  "project_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "current_page" : 0,
    "list" : [ {
      "comment_count" : 0,
      "copyright" : 0,
      "desc" : "string",
      "desc_html" : "string",
      "detail" : "string",
      "duration" : "string",
      "film_id" : 0,
      "full_tag" : "string",
      "is_like" : 0,
      "like_count" : 0,
      "location" : "string",
      "published_time" : "string",
      "qiniuSrcUrl" : "string",
      "qiniu_src" : [ {
        "src" : "string",
        "title" : "string"
      } ],
      "qiniu_src_defualt" : 0,
      "scan_count" : "string",
      "share_url" : "string",
      "sourceType" : 0,
      "thumb" : "string",
      "title" : "string",
      "vid" : "string",
      "video_html" : "string",
      "view_app" : 0,
      "view_count" : 0,
      "view_m" : 0,
      "view_pc" : 0,
      "view_src" : "string",
      "xid" : "string"
    } ],
    "total_page" : 0
  },
  "msg" : "string"
}
```


<a name="filmunlikeusingpost"></a>
#### 视频取消点赞
```
POST /app/community/filmunlike
```


##### 说明
视频取消点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.community.FilmController.filmunlike(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**film_id**  <br>*可选*|视频id|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/community/filmunlike
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "film_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="20e6c62f3bb54cef941cd055a5a253b1"></a>
### 订单列表管理
Orders List Controller


<a name="orderbasecountusingget"></a>
#### 用户订单状态数量
```
GET /app/base/order/count
```


##### 说明
用户订单状态数量<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersListController.orderBaseCount()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderBaseCountVO»](#372cfbe1a96ffc690aa83a23fe03bcc6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/base/order/count
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "orderCountList" : [ {
      "iconUrl" : "string",
      "orderCount" : 0,
      "parameterJson" : "string",
      "title" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="orderbaselistusingget"></a>
#### 订单列表
```
GET /app/base/order/list
```


##### 说明
订单列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersListController.orderBaseList(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**firstType**  <br>*可选*|一级类型|string||
|**Query**|**page**  <br>*可选*|分页|string|`"1"`|
|**Query**|**secondType**  <br>*可选*|二级类型|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«MicroPagerWrap«List«OrderBaseListItemVO»»»](#7b225571eb8e871754353d47b1a31984)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/base/order/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "firstType" : "string",
  "page" : "string",
  "secondType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "currentPage" : 0,
    "list" : [ {
      "buttonInfo" : {
        "callCarBen" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "comfirmReceiptBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "detailBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "evaluateBen" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "invoiceBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "payBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "rebookBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "viewDeliveryBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        },
        "voucherBookBtn" : {
          "btnStyle" : 0,
          "name" : "string",
          "status" : 0,
          "tip" : "string",
          "url" : "string"
        }
      },
      "extraInfo" : {
        "cardExtra" : {
          "cardUserId" : 0,
          "freezedWarn" : "string",
          "refundLeftLabel" : "string",
          "refundPlanList" : [ {
            "dateLabel" : "string",
            "planLabel" : "string"
          } ],
          "refundRightLabel" : "string",
          "refundRightUrl" : "string",
          "usedTime" : "string",
          "usedTimeLabel" : "string",
          "usedUrl" : "string"
        },
        "lineExtra" : {
          "bargainEndTime" : 0,
          "bargainPayOverTime" : 0,
          "isBargainOrder" : 0,
          "similarBtnTip" : "string",
          "similarTip" : "string",
          "similarUrl" : "string"
        },
        "voucherExtra" : {
          "appointNum" : "string",
          "usedTime" : "string"
        },
        "voucherLineExtra" : {
          "isHaveRefund" : 0,
          "refundUrl" : "string"
        }
      },
      "iconUrl" : "string",
      "oid" : 0,
      "orderAmount" : "string",
      "orderNo" : "string",
      "productInfo" : {
        "appendInfo" : [ "string" ],
        "imageList" : [ "string" ],
        "productId" : "string",
        "productName" : "string",
        "unitInfo" : "string"
      },
      "statusColour" : "string",
      "statusName" : "string",
      "type" : 0,
      "typeName" : "string",
      "url" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="orderbasetabusingget"></a>
#### 订单筛选标签列表
```
GET /app/base/order/tab
```


##### 说明
订单筛选标签列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.orders.OrdersListController.orderBaseTab(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**firstType**  <br>*可选*|一级类型|string|
|**Query**|**secondType**  <br>*可选*|二级类型|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«OrderBaseTabVO»](#29f88c21ab6522f962492b74d0087382)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/base/order/tab
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "firstType" : "string",
  "secondType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "firstType" : [ {
      "childType" : [ {
        "childType" : [ "..." ],
        "selected" : 0,
        "typeId" : 0,
        "typeName" : "string"
      } ],
      "selected" : 0,
      "typeId" : 0,
      "typeName" : "string"
    } ],
    "shareOrderParameterJson" : "string",
    "shareOrderTip" : "string"
  },
  "msg" : "string"
}
```


<a name="1dfcef3bd91c8df9bedd068589b490c5"></a>
### 达人认证
User Certification Controller


<a name="certificationapplyusingpost"></a>
#### 达人认证申请
```
POST /app/user/certification/apply
```


##### 说明
达人认证申请<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserCertificationController.certificationApply(com.youxiake.model.master.user.vo.request.CertificationApplyRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**alipayAccount**  <br>*必填*|支付宝账号|string|
|**Query**|**photos**  <br>*可选*|图片材料|string|
|**Query**|**reason**  <br>*可选*|申请理由|string|
|**Query**|**referrer**  <br>*可选*|推荐人|string|
|**Query**|**type**  <br>*必填*|1为游飞侠认证  2为遇见达人认证  3为摄影达人认证|integer (int32)|
|**Query**|**username**  <br>*必填*|用户真实姓名|string|
|**Query**|**weChatNumber**  <br>*必填*|微信号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/certification/apply
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "alipayAccount" : "string",
  "photos" : "string",
  "reason" : "string",
  "referrer" : "string",
  "type" : 0,
  "username" : "string",
  "weChatNumber" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="existscertificationapplyusingget"></a>
#### 是否申请过该认证
```
GET /app/user/certification/apply/exists
```


##### 说明
是否申请过该认证<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserCertificationController.existsCertificationApply(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**type**  <br>*必填*|1为游飞侠认证  2为遇见达人认证  3为摄影达人认证|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CertificationApplyResultTypeVO»](#915155a840b4a8befaf23255819ee383)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/certification/apply/exists
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "type" : 0
  },
  "msg" : "string"
}
```


<a name="introductionusingget"></a>
#### 达人认证介绍页
```
GET /app/user/certification/apply/introduction
```


##### 说明
达人认证介绍页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.user.UserCertificationController.introduction(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**type**  <br>*必填*|1为游飞侠认证  2为遇见达人认证|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«CertificationIntroductionVO»](#53bd6c814fdbfe3d329271b542d58610)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/user/certification/apply/introduction
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "attachCondition" : true,
    "condition" : "string",
    "hasAvatar" : true
  },
  "msg" : "string"
}
```


<a name="11ca1f2adff75ba11eabac03ba4f9c1d"></a>
### 遇见
Discover Controller


<a name="discoverstreamusingget_1"></a>
#### 遇见发现页瀑布流
```
GET /app/discover/1list/stream
```


##### 说明
遇见发现页瀑布流<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverStream(java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**city**  <br>*可选*|城市名称|string||
|**Query**|**dataVersion**  <br>*可选*|数据版本号|integer (int32)||
|**Query**|**lastId**  <br>*可选*|最后的id|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**type**  <br>*可选*|1:热门，2最新,3精选，4短视频|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»](#ad0c913e1185074fad13a042f119771a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/1list/stream
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "city" : "string",
  "dataVersion" : 0,
  "lastId" : 0,
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "uitype" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="adddiscoverusingpost"></a>
#### 遇见-新增遇见
```
POST /app/discover/add
```


##### 说明
遇见-新增遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.addDiscover(com.youxiake.model.master.discover.vo.request.DiscoverAddReqVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**address**  <br>*可选*|地址|string|
|**Query**|**addressLat**  <br>*可选*|搜索地址的纬度|string|
|**Query**|**addressLng**  <br>*可选*|搜索地址的经度|string|
|**Query**|**content**  <br>*可选*|内容|string|
|**Query**|**dataSize**  <br>*可选*|上传时间(毫秒)|string|
|**Query**|**discuTitles**  <br>*可选*|话题列表  话题名称 字符串用,分割|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|
|**Query**|**internetSpeed**  <br>*可选*|数据总大小 (xxM)|string|
|**Query**|**internetType**  <br>*可选*|当前网络类型(1为Wifi, 2为4G, 3为3G 4为2G 5为e)|integer (int32)|
|**Query**|**lat**  <br>*可选*|纬度|string|
|**Query**|**lng**  <br>*可选*|经度|string|
|**Query**|**mddId**  <br>*可选*|目的地id|integer (int32)|
|**Query**|**panoramaPercent**  <br>*可选*|全景图百分比|string|
|**Query**|**panoramaStatus**  <br>*可选*|1为全景图|integer (int32)|
|**Query**|**photos**  <br>*可选*|遇见图片 格式: [{ width: 33, height: 33, file: 'xx.jpg', ext:'jpg', labels: [ {x:33, y:33, content: "裙子", position:left or right}]}]|string|
|**Query**|**qiniuUploadTime**  <br>*可选*|上传时间(毫秒)|integer (int32)|
|**Query**|**recording**  <br>*可选*|录音|string|
|**Query**|**recordingDuration**  <br>*可选*|录音时长 豪秒|integer (int32)|
|**Query**|**saveType**  <br>*可选*|保存类型:0:发布遇见，1：保存或修改草稿，2：修改遇见|integer (int32)|
|**Query**|**shootingDate**  <br>*可选*|拍摄时间|string|
|**Query**|**showAddress**  <br>*可选*|是否显示地址 , 'enable' 或者 'disable'|string|
|**Query**|**type**  <br>*可选*|photo 或者 video|string|
|**Query**|**uids**  <br>*可选*|@谁的uid数组 12577,8,33|string|
|**Query**|**video**  <br>*可选*|视频地址|string|
|**Query**|**videoCover**  <br>*可选*|视频第一帧图片地址 格式: [{ width: 33, height: 33, file: 'xx.jpg', ext:'jpg'}]|string|
|**Query**|**watermarkStatus**  <br>*可选*|1为添加水印|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "address" : "string",
  "addressLat" : "string",
  "addressLng" : "string",
  "content" : "string",
  "dataSize" : "string",
  "discuTitles" : "string",
  "id" : 0,
  "internetSpeed" : "string",
  "internetType" : 0,
  "lat" : "string",
  "lng" : "string",
  "mddId" : 0,
  "panoramaPercent" : "string",
  "panoramaStatus" : 0,
  "photos" : "string",
  "qiniuUploadTime" : 0,
  "recording" : "string",
  "recordingDuration" : 0,
  "saveType" : 0,
  "shootingDate" : "string",
  "showAddress" : "string",
  "type" : "string",
  "uids" : "string",
  "video" : "string",
  "videoCover" : "string",
  "watermarkStatus" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="changefeatureusingpost"></a>
#### 设置遇见精选状态
```
POST /app/discover/changeFeature
```


##### 说明
设置遇见精选状态<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.changeFeature(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/changeFeature
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="changequalityusingpost_1"></a>
#### 设置或取消遇见为优质遇见
```
POST /app/discover/changeQuality
```


##### 说明
设置或取消遇见为优质遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.changeQuality(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/changeQuality
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="changerecommendusingpost"></a>
#### 设置遇见推荐状态
```
POST /app/discover/changeRecommend
```


##### 说明
设置遇见推荐状态<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.changeRecommend(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/changeRecommend
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="closeactivityquoteusingget"></a>
#### 关闭推广或活动
```
GET /app/discover/closeActivityQuote
```


##### 说明
关闭推广或活动<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.closeActivityQuote(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/closeActivityQuote
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="savecommentusingpost"></a>
#### 遇见-评论-添加评论
```
POST /app/discover/comment/add
```


##### 说明
遇见-评论-添加评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.saveComment(com.youxiake.model.master.discover.vo.request.RqDiscoverCommentVO)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)|
|**Query**|**comment_uid**  <br>*可选*|评论者id|integer (int32)|
|**Query**|**content**  <br>*必填*|评论内容|string|
|**Query**|**quote_id**  <br>*必填*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HashMap«string,object»»](#fe6f1977bb4d94e22130450552b8a7cd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/comment/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "comment_uid" : 0,
  "content" : "string",
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : "object"
  },
  "msg" : "string"
}
```


<a name="delcommentusingpost"></a>
#### 遇见-评论-删除评论
```
POST /app/discover/comment/delete
```


##### 说明
遇见-评论-删除评论<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.delComment(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**comment_id**  <br>*必填*|评论id|integer (int32)|
|**Query**|**quote_id**  <br>*必填*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverCommentDelVO»](#a57bab2e9022143272e5a3fc708b5c2c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/comment/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "commentsCount" : 0
  },
  "msg" : "string"
}
```


<a name="discovercommentsusingget_1"></a>
#### 遇见-评论列表
```
GET /app/discover/comments/list
```


##### 说明
遇见-评论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverComments(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**comment_id**  <br>*可选*|评论id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**quote_id**  <br>*可选*|遇见id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverCommentVO»»»_1](#6a7365d0a0b9d83fe235d4e497ec7ca6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/comments/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "comment_id" : 0,
  "page" : 0,
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "isTalent" : true,
      "official" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getdataversionusingget"></a>
#### 获取遇见热门数据版本号
```
GET /app/discover/dataVersion
```


##### 说明
获取遇见热门数据版本号<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getDataVersion()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/dataVersion
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="deleteusingpost"></a>
#### 遇见-删除
```
POST /app/discover/delete
```


##### 说明
遇见-删除<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.delete(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**quote_id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="discoverdetailusingget_1"></a>
#### 遇见-详情
```
GET /app/discover/detail
```


##### 说明
遇见-详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverDetail(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**cid**  <br>*可选*|评论id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**quote_id**  <br>*可选*|遇见id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«遇见详情»](#6e36a8bbe49f6ab42b048f437898def5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "cid" : 0,
  "page" : 0,
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "auditStatus" : 0,
    "comments" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "isTalent" : true,
      "official" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "discoverBillboard" : {
      "handler" : "string",
      "name" : "string",
      "rank" : 0,
      "url" : "string"
    },
    "isOwn" : true,
    "mdds" : [ {
      "discoverCount" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "type" : 0,
      "wants" : 0
    } ],
    "miniShareVO" : {
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string"
    },
    "page" : 0,
    "praises" : [ {
      "avatar" : "string",
      "pid" : 0,
      "uid" : 0
    } ],
    "product" : [ "object" ],
    "quote" : {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "activity_type" : 0,
      "address" : "string",
      "address_lat" : "string",
      "address_lng" : "string",
      "avatar" : "string",
      "cid" : "string",
      "comment" : 0,
      "content" : "string",
      "cover" : "string",
      "createTime" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "gmt_modify" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "hot_time" : 0,
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isCollect" : true,
      "isTalent" : true,
      "is_activity" : 0,
      "is_check" : 0,
      "is_click_hot" : 0,
      "is_hot" : 0,
      "is_meet_top" : 0,
      "is_report" : 0,
      "is_top" : 0,
      "lat" : "string",
      "lng" : "string",
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "product_id" : "string",
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "shootingDate" : "string",
      "show_address" : "string",
      "source" : 0,
      "status" : "string",
      "type" : "string",
      "uid" : 0,
      "username" : "string",
      "video" : "string"
    },
    "recordCount" : 0,
    "remainFloorNum" : 0,
    "shareTip" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="recommenddiscoverusingget"></a>
#### 遇见详情-推荐遇见
```
GET /app/discover/detail/recommendDiscover
```


##### 说明
遇见详情-推荐遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.recommendDiscover(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|遇见id|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«object»»»](#c96fa89e872a7e4ca784cf0cfb006eb9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/detail/recommendDiscover
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ "object" ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="sharepicusingget"></a>
#### 遇见分享图片
```
GET /app/discover/discover/pic/share
```


##### 说明
遇见分享图片<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.sharePic(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**discoverId**  <br>*可选*|discoverId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverPicShareVO»](#4371d25fc95d42c2c7616f6cbe2f5999)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/discover/pic/share
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discoverId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "content" : "string",
    "height" : 0,
    "mddName" : "string",
    "pic" : "string",
    "recordingDuration" : 0,
    "rqCode" : "string",
    "rqCodeImg" : "string",
    "rqCodeMsg" : "string",
    "talent" : 0,
    "type" : 0,
    "username" : "string",
    "width" : 0
  },
  "msg" : "string"
}
```


<a name="joinerusingget"></a>
#### 话题参与人
```
GET /app/discover/discu/joiner
```


##### 说明
话题参与人<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.joiner(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**discuId**  <br>*可选*|话题id|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«TopicJoinerVO»»»](#4f7016b6e636e4a49637949ddbdea6fc)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/discu/joiner
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discuId" : 0,
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "cover" : "string",
      "discoverList" : [ {
        "content" : "string",
        "id" : 0,
        "type" : 0,
        "url" : "string"
      } ],
      "discovers" : [ {
        "address" : "string",
        "avatar" : "string",
        "comment" : 0,
        "content" : "string",
        "cover" : "string",
        "id" : 0,
        "prise" : 0,
        "talent" : 0,
        "type" : "string",
        "uid" : 0,
        "video" : "string"
      } ],
      "intro" : "string",
      "relation" : "string",
      "talent" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverrelationusingget_1"></a>
#### 遇见豆腐块列表
```
GET /app/discover/discu/relation
```


##### 说明
遇见-豆腐块列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverRelation()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«DiscoverRelationVO»»](#0e1ae4e8fd10a10dbb111ffa42d5f78f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/discu/relation
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "discu_id" : 0,
      "handler" : "string",
      "img" : "string",
      "target_url" : "string",
      "title" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="displaytopicusingget"></a>
#### 新增遇见-话题展示
```
GET /app/discover/displayTopic
```


##### 说明
新增遇见-话题展示<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.displayTopic()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«TopicVO»»](#7a533194db27fef8f4109442e44546a9)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/displayTopic
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="addtofavaritesusingpost"></a>
#### 收藏
```
POST /app/discover/favarite
```


##### 说明
收藏<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.addToFavarites(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**tid**  <br>*必填*|遇见主键ID|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverFavariteVO»](#ed5fd6803e07bcd7150003bf752ef2df)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/favarite
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "tid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "favtimes" : 0,
    "isFavarite" : true
  },
  "msg" : "string"
}
```


<a name="getfavaritetravellistusingget"></a>
#### 遇见收藏列表
```
GET /app/discover/favariteTravelList
```


##### 说明
遇见收藏列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getFavariteTravelList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverFavoritesVO»»»](#fc110923fee70c13e299ca1a67ec3e0e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/favariteTravelList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "address" : "string",
      "avatar" : "string",
      "comment" : "string",
      "content" : "string",
      "icon" : true,
      "id" : 0,
      "imageHeight" : 0,
      "imageWidth" : 0,
      "prise" : "string",
      "prised" : true,
      "type" : 0,
      "uid" : 0,
      "url" : "string",
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="followtopicusingpost"></a>
#### 话题关注
```
POST /app/discover/followTopic
```


##### 说明
话题关注<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.followTopic(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**discuId**  <br>*可选*|话题id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«Map«string,int»»](#c5178aa99976e09b035635435e8ab8c3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/followTopic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "string" : 0
  },
  "msg" : "string"
}
```


<a name="nearbyfriendusingget"></a>
#### 遇见-附近游侠
```
GET /app/discover/friend/nearby
```


##### 说明
遇见-附近游侠<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.nearbyFriend(java.lang.Integer,java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**lat**  <br>*必填*|纬度|string||
|**Query**|**lng**  <br>*必填*|经度|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«NearbyFriendVO»»»](#30cd723696b4053ef6bbda1bf229d040)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/friend/nearby
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lat" : "string",
  "lng" : "string",
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "dest" : "string",
      "intro" : "string",
      "relation" : "string",
      "sex" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getdiscoverdraftusingget"></a>
#### 遇见草稿箱
```
GET /app/discover/get_discover_draft
```


##### 说明
遇见草稿箱<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getDiscoverDraft(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页数|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverDraftVO»»»](#1c8ec6bb81f3bff3276722e89c78b368)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/get_discover_draft
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "id" : 0,
      "imageAndVideo" : [ {
        "content" : "string",
        "type" : 0
      } ],
      "imageCount" : 0,
      "mddName" : "string",
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "title" : "string",
      "type" : 0,
      "updateTime" : "string",
      "watermarkStatus" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getdiscoverformodifyusingget"></a>
#### 修改遇见-获取遇见内容
```
GET /app/discover/get_discover_for_modify
```


##### 说明
修改遇见-获取遇见内容<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getDiscoverForModify(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**discoverId**  <br>*可选*|遇见id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverModifyVO»](#7f3c788dee0c7b23230270c974bd15f7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/get_discover_for_modify
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discoverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "content" : "string",
    "discus" : [ {
      "did" : 0,
      "title" : "string"
    } ],
    "id" : 0,
    "images" : [ {
      "assetUrl" : "string",
      "ext" : "string",
      "file" : "string",
      "height" : 0,
      "labels" : [ {
        "content" : "string",
        "position" : "string",
        "x" : 0.0,
        "y" : 0.0
      } ],
      "width" : 0
    } ],
    "imgUrlPerfix" : "string",
    "notice_users" : [ {
      "did" : 0,
      "title" : "string"
    } ],
    "panoramaPercent" : "string",
    "panoramaStatus" : 0,
    "recording" : "string",
    "recordingDuration" : 0,
    "shootingDate" : "string",
    "type" : "string",
    "video" : "string",
    "videoUrlPerfix" : "string"
  },
  "msg" : "string"
}
```


<a name="levytopicusingget"></a>
#### 遇见征集页
```
GET /app/discover/levyTopic
```


##### 说明
遇见征集页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.levyTopic(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|分页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverLevyVO»»»](#8248dd64068b5d9392c7ec82020b8827)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/levyTopic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "discovers" : [ {
        "avatar" : "string",
        "cover" : "string",
        "id" : 0,
        "talent" : 0,
        "type" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "id" : 0,
      "joinNum" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverdiscuusingget_1"></a>
#### 遇见讨论列表
```
GET /app/discover/list/discuss
```


##### 说明
遇见-讨论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverDiscu(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**city**  <br>*必填*|城市名称|string||
|**Query**|**discu_id**  <br>*可选*|话题id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscuDataVo»_1](#3e99f19760a774ace9066971b24bb321)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/discuss
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "city" : "string",
  "discu_id" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "discudetail" : {
      "activity" : "string",
      "activity_url" : "string",
      "bigimg" : "string",
      "detail" : "string",
      "handler" : "string",
      "links" : 0,
      "shareUrl" : "string",
      "target_url" : "string",
      "title" : "string",
      "type" : 0
    },
    "quotesList" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discoverNum" : 0,
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "img" : "string",
      "isV" : true,
      "is_top" : 0,
      "miniShareVO" : {
        "mini_app_cover" : "string",
        "mini_app_id" : "string",
        "mini_app_url" : "string"
      },
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "title" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "userAvatars" : [ "string" ],
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "recordCount" : 0,
    "title" : "string",
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverhotusingget_1"></a>
#### 遇见热门列表
```
GET /app/discover/list/hot
```


##### 说明
遇见-遇见热门列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverHot(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**dataVersion**  <br>*可选*|数据版本号|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**pagingMode**  <br>*可选*|分页方式 1为 向上分页 2为下拉分页 默认为1|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|data|[DiscoverHotVO_1](#discoverhotvo_1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/hot
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "dataVersion" : 0,
  "page" : 0,
  "pagingMode" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "activity" : {
    "activity_type" : "string",
    "target_type" : "string",
    "target_url" : "string"
  },
  "address" : "string",
  "avatar" : "string",
  "comment" : 0,
  "comments" : [ {
    "avatar" : "string",
    "cid" : 0,
    "commentedUserName" : "string",
    "content" : "string",
    "createTime" : "string",
    "gmt_create" : 0,
    "grouplist" : [ {
      "certTitle" : "string",
      "certType" : "string"
    } ],
    "isTalent" : true,
    "official" : 0,
    "uid" : 0,
    "username" : "string"
  } ],
  "content" : "string",
  "cover" : "string",
  "discus" : [ {
    "did" : 0,
    "title" : "string"
  } ],
  "featured" : 0,
  "firstImg" : {
    "height" : 0,
    "labels_info" : [ {
      "content" : "string",
      "position" : "string",
      "x" : "string",
      "y" : "string"
    } ],
    "shareUrl" : "string",
    "url" : "string",
    "url_l" : "string",
    "url_m" : "string",
    "url_xl" : "string",
    "width" : 0
  },
  "gmt_create" : 0,
  "grouplist" : [ {
    "certTitle" : "string",
    "certType" : "string"
  } ],
  "images" : [ {
    "height" : 0,
    "labels_info" : [ {
      "content" : "string",
      "position" : "string",
      "x" : "string",
      "y" : "string"
    } ],
    "shareUrl" : "string",
    "url" : "string",
    "url_l" : "string",
    "url_m" : "string",
    "url_xl" : "string",
    "width" : 0
  } ],
  "isV" : true,
  "is_hot" : 0,
  "is_top" : 0,
  "notice_users" : [ {
    "did" : 0,
    "title" : "string"
  } ],
  "official" : 0,
  "panoramaPercent" : "string",
  "panoramaStatus" : 0,
  "prise" : 0,
  "prised" : true,
  "quote_id" : 0,
  "recommendStatus" : 0,
  "recording" : "string",
  "recordingDuration" : 0,
  "relation" : "string",
  "share_title" : "string",
  "share_url" : "string",
  "show_address" : "string",
  "type" : "string",
  "uiType" : 0,
  "uid" : 0,
  "username" : "string",
  "version" : 0,
  "video" : "string",
  "watermarkStatus" : 0
}
```


<a name="discoverlatestusingget"></a>
#### 遇见最新列表
```
GET /app/discover/list/latest
```


##### 说明
遇见-遇见最新列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverLatest(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**city**  <br>*可选*|城市名称|string||
|**Query**|**lastId**  <br>*可选*|最后的id|integer (int32)|`0`|
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverLatestVO»»»](#4f550bb6ed47c1c5d42772fecbc4670f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/latest
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "city" : "string",
  "lastId" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isV" : true,
      "lat" : "string",
      "lng" : "string",
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverquoteusingget_1"></a>
#### 我的遇见列表
```
GET /app/discover/list/quote
```


##### 说明
遇见-我的遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverQuote(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**uid**  <br>*可选*|用户编号|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«DiscoverQuoteItemVO,List«DiscoverQuoteVO»»»](#b969a7acd54295a60dd88a09db766a90)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/quote
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "content" : "string",
      "title" : "string"
    },
    "list" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "address_lat" : "string",
      "address_lng" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isV" : true,
      "is_report" : 0,
      "is_show_years" : 0,
      "lat" : "string",
      "lng" : "string",
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "places" : {
        "city" : "string",
        "contry" : "string",
        "distriction" : "string",
        "province" : "string"
      },
      "prise" : 0,
      "prised" : true,
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverdestcountusingget"></a>
#### 我的遇见列表-目的地
```
GET /app/discover/list/quote/dest
```


##### 说明
我的遇见列表-目的地<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverDestCount(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**page**  <br>*可选*|页数|string|
|**Query**|**userId**  <br>*可选*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverDestCountVO»»»](#bc66c3cb048d5e03c4a616e1e792a731)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/quote/dest
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "userId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "dest" : 0,
      "destType" : 0,
      "name" : "string",
      "num" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="subscribeusingget"></a>
#### 遇见-关注列表
```
GET /app/discover/list/subscribe
```


##### 说明
遇见-关注列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.subscribe(java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**city**  <br>*可选*|城市|string||
|**Query**|**lastId**  <br>*可选*|每页最后一个遇见的id，用于去重|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverFollowedTopVo»](#db8d5b8385268f730ca9777bb149720d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/subscribe
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "city" : "string",
  "lastId" : "string",
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "followedTopicCount" : 0,
    "interestingUserAvatars" : [ "string" ],
    "lastId" : 0,
    "pageSize" : 0,
    "quotesList" : [ "object" ],
    "topicVos" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "updateCount" : "string",
      "views" : "string"
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discovervideousingget"></a>
#### 视频列表
```
GET /app/discover/list/video
```


##### 说明
遇见-视频列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverVideo(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**lastId**  <br>*可选*|最后的id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverLatestVO»»»](#4f550bb6ed47c1c5d42772fecbc4670f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/list/video
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lastId" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isV" : true,
      "lat" : "string",
      "lng" : "string",
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="mdddiscoverdatacleanusingget"></a>
#### 清洗目的地关联遇见
```
GET /app/discover/mdd-discover-clean
```


##### 说明
清洗目的地关联遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.mddDiscoverDataClean()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/mdd-discover-clean
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getmoreyouxiasamebatchesusingget"></a>
#### 发现好友-更多同团游侠
```
GET /app/discover/moreYouxiaSameBatches
```


##### 说明
发现好友-更多同团游侠<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getMoreYouxiaSameBatches(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**oid**  <br>*必填*|订单id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«SingleDisMoreSameBatchesVO,List«DiscoverYouxiaSimpleVO»»»](#9d5c5b737fabeed536b725ab989dfaba)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/moreYouxiaSameBatches
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "oid" : 0,
  "page" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "oid" : 0,
      "pid" : 0,
      "placeLabel" : "string",
      "priceLabel" : "string",
      "productName" : "string",
      "startTimeLabel" : "string",
      "thumb" : "string"
    },
    "list" : [ {
      "cover" : "string",
      "intro" : "string",
      "isTalent" : true,
      "relation" : "string",
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="photoslocationusingpost"></a>
#### 新增遇见-拍摄位置获取
```
POST /app/discover/photosLocation
```


##### 说明
新增遇见-拍摄位置获取<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.photosLocation(java.lang.String,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**lat**  <br>*可选*|纬度|string|
|**Query**|**lng**  <br>*可选*|经度|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«DestBaseRespVO»»](#aaa7c2930ab328c83baef7071bf5d837)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/photosLocation
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "lat" : "string",
  "lng" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "mddId" : 0,
      "mddName" : "string",
      "type" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="discoverpraiselistusingget"></a>
#### 遇见-点赞列表
```
GET /app/discover/praiselist
```


##### 说明
遇见-点赞列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverPraiseList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**quote_id**  <br>*必填*|遇见id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverPraiseListVO»»»](#1b6c4af847ea085d1d0390ceab96060d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/praiselist
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "quote_id" : 0,
      "relation" : "string",
      "sex" : 0,
      "tag" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="priseusingpost_1"></a>
#### 遇见-点赞
```
POST /app/discover/prise
```


##### 说明
遇见-点赞<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.prise(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**quote_id**  <br>*可选*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/prise
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "quote_id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="publishsuccessusingget"></a>
#### 遇见-发布成功页
```
GET /app/discover/publish/success
```


##### 说明
遇见-发布成功页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.publishSuccess()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverPublishResultVO»](#7615e411ce0d267f8edbd00fa55a9278)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/publish/success
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "discoverCountInfo" : {
      "beCollectCount" : 0,
      "beCommentCount" : 0,
      "beLikeCount" : 0,
      "discoverCount" : 0,
      "discoverGuideUrl" : "string",
      "precedePercent" : "string"
    },
    "discussList" : [ {
      "discoverCount" : "string",
      "discuId" : 0,
      "img" : "string",
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="reportdiscoverusingpost"></a>
#### 遇见-举报
```
POST /app/discover/report
```


##### 说明
遇见-举报<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.reportDiscover(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**quote_id**  <br>*必填*|遇见id|integer (int32)|
|**Query**|**reason**  <br>*必填*|原因|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/report
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "quote_id" : 0,
  "reason" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="samelineusingget"></a>
#### 遇见-同团好友
```
GET /app/discover/sameLine
```


##### 说明
遇见-同团好友<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.sameLine(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«SameLineFriendVo»»»](#dfd393a2634dfe90fc95fce6f056df5e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/sameLine
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "city" : "string",
      "intro" : "string",
      "lineList" : [ {
        "pid" : 0,
        "title" : "string"
      } ],
      "linesCount" : 0,
      "pid" : 0,
      "province" : "string",
      "realname" : "string",
      "relation" : "string",
      "sex" : 0,
      "tags" : [ {
        "tagcolor" : "string",
        "tagid" : 0,
        "tagname" : "string"
      } ],
      "uid" : 0,
      "username" : "string",
      "yxkCert" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchtopicusingpost"></a>
#### 遇见-搜索话题
```
POST /app/discover/searchtopic
```


##### 说明
遇见-搜索话题<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.searchTopic(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**title**  <br>*可选*|搜索内容|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverTopicVO»»»](#756c206223164c4813e770e5cc618e4f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/searchtopic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "detail" : "string",
      "did" : 0,
      "followed" : 0,
      "handler" : "string",
      "idx" : 0,
      "img" : "string",
      "quoteNums" : 0,
      "suggest" : 0,
      "target_url" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="searchtopicusingget"></a>
#### 遇见-搜索话题
```
GET /app/discover/searchtopic
```


##### 说明
遇见-搜索话题<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.searchTopic(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**title**  <br>*可选*|搜索内容|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverTopicVO»»»](#756c206223164c4813e770e5cc618e4f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/searchtopic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "detail" : "string",
      "did" : 0,
      "followed" : 0,
      "handler" : "string",
      "idx" : 0,
      "img" : "string",
      "quoteNums" : 0,
      "suggest" : 0,
      "target_url" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getstarslistusingget"></a>
#### 遇见红人榜
```
GET /app/discover/startsList
```


##### 说明
遇见红人榜<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getStarsList(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|string|`"1"`|
|**Query**|**type**  <br>*可选*|红人榜类型:1.人气榜,2.精选榜,3.毅力榜|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«DiscoverStarsNoteVO,List«DiscoverStarsVO»»»](#e3c0fdd6dae5629ddcc0d8e26190fc05)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/startsList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "note" : "string"
    },
    "list" : [ {
      "content" : "string",
      "cover" : "string",
      "encourageNum" : 0,
      "encourages" : [ {
        "content" : "string",
        "encourageId" : 0,
        "fromUid" : 0,
        "fromUserAvatar" : "string",
        "toUid" : 0
      } ],
      "isTalent" : true,
      "rank" : 0,
      "relation" : "string",
      "relationBoolean" : true,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discovertopicusingget"></a>
#### 遇见-话题列表
```
GET /app/discover/topic
```


##### 说明
遇见-话题列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverTopic(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverTopicVO»»»](#756c206223164c4813e770e5cc618e4f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/topic
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "detail" : "string",
      "did" : 0,
      "followed" : 0,
      "handler" : "string",
      "idx" : 0,
      "img" : "string",
      "quoteNums" : 0,
      "suggest" : 0,
      "target_url" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="topiccategoryusingget"></a>
#### 话题广场-话题分类
```
GET /app/discover/topicCategory
```


##### 说明
话题广场-话题分类<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.topicCategory()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«话题分类»»](#a8a4a11b97b9318e7849bc4addce6fce)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/topicCategory
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "id" : 0,
      "title" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="topicgroupusingget"></a>
#### 话题广场
```
GET /app/discover/topicGroup
```


##### 说明
话题广场<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.topicGroup(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**id**  <br>*可选*|话题分类id|string|
|**Query**|**page**  <br>*可选*|分页|string|
|**Query**|**type**  <br>*可选*|1为话题广场页  2为话题选择页|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«话题广场»](#74c3a54c8e9c4875b37d3df0f6d59cf6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/topicGroup
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : "string",
  "page" : "string",
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "levyTopic" : {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    },
    "pageSize" : 0,
    "topic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverdetailusingget"></a>
#### 遇见视频详情
```
GET /app/discover/video/detail
```


##### 说明
遇见-详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.discoverDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**quoteId**  <br>*必填*|遇见id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverVideoDetailResVO»](#3859c0f796e187a8677a20fc58929535)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/video/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "quoteId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "address" : "string",
    "avatar" : "string",
    "comment" : "string",
    "content" : "string",
    "cover" : "string",
    "createTime" : "string",
    "discus" : [ {
      "did" : 0,
      "title" : "string"
    } ],
    "featured" : 0,
    "followed" : true,
    "isCollect" : true,
    "isTalent" : true,
    "mdd" : {
      "discoverCount" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "mddPic" : "string",
      "type" : 0,
      "wants" : 0
    },
    "mddLabel" : "string",
    "miniShareVO" : {
      "mini_app_cover" : "string",
      "mini_app_id" : "string",
      "mini_app_url" : "string"
    },
    "noticeUsers" : [ {
      "did" : 0,
      "title" : "string"
    } ],
    "prise" : "string",
    "prised" : true,
    "productTag" : "string",
    "products" : [ {
      "ageLabel" : "string",
      "brandTag" : [ "string" ],
      "checking" : 0,
      "class_theme_id" : 0,
      "days" : "string",
      "firstBatchStatus" : "string",
      "free" : 0,
      "handler" : "string",
      "isFree" : 0,
      "liangdian" : [ "string" ],
      "liangdianLabel" : "string",
      "linquan" : "string",
      "listColor" : "string",
      "listColorV2" : "string",
      "listImgUrl" : "string",
      "listImgUrlV2" : "string",
      "marketingIco" : "string",
      "marketingList" : [ "string" ],
      "marketingTag" : "string",
      "marketingTagName" : "string",
      "maxPrice" : "string",
      "outDoorLabel" : "string",
      "peopleCount" : 0,
      "peopleCountLabel" : "string",
      "peopleCountLabelFull" : "string",
      "pid" : 0,
      "place_label" : "string",
      "price" : 0.0,
      "price_label" : "string",
      "pro_pic" : "string",
      "productPreferentialList" : [ {
        "couponAmount" : 0.0,
        "detailRemark" : "string",
        "shortRemark" : "string",
        "type" : 0
      } ],
      "product_cat" : "string",
      "product_name" : "string",
      "product_type" : "string",
      "product_type2" : "string",
      "psid" : 0,
      "salePriceLabel" : "string",
      "showStatus" : 0,
      "simpleName" : "string",
      "starttime" : "string",
      "sub_name" : "string",
      "thumb" : "string",
      "thumbList" : [ "string" ],
      "type" : 0,
      "type_or_cat" : "string",
      "typetwoOrCat" : "string",
      "url" : "string",
      "weight" : 0.0
    } ],
    "quoteId" : 0,
    "recommendStatus" : 0,
    "shareTitle" : "string",
    "shareUrl" : "string",
    "uid" : 0,
    "username" : "string",
    "video" : "string"
  },
  "msg" : "string"
}
```


<a name="videodetaillistusingget"></a>
#### 遇见视频详情列表
```
GET /app/discover/video/detail/list
```


##### 说明
遇见视频详情列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.videoDetailList(com.youxiake.model.master.discover.vo.request.DiscoverVedioDetailRQ)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**boardId**  <br>*可选*|周榜id|integer (int32)|
|**Query**|**columnId**  <br>*可选*|专栏id|integer (int32)|
|**Query**|**dataVersion**  <br>*可选*|热门池版本号|integer (int32)|
|**Query**|**dest**  <br>*可选*|国家或城市id|integer (int32)|
|**Query**|**destType**  <br>*可选*|1国家，2城市|integer (int32)|
|**Query**|**discoverId**  <br>*必填*|视频遇见id|integer (int32)|
|**Query**|**discuId**  <br>*可选*|话题id|integer (int32)|
|**Query**|**level**  <br>*可选*|级别|string|
|**Query**|**mddId**  <br>*可选*|目的地id|string|
|**Query**|**moduleType**  <br>*必填*|模块类型 1:关注 2:遇见发现 3:专栏详情 4:话题详情 5:遇见详情 6:目的地-旅途 7:个人主页-遇见 8:遇见周榜 9:遇见收藏列表|integer (int32)|
|**Query**|**page**  <br>*可选*|分页|integer (int32)|
|**Query**|**recommendDiscoverId**  <br>*可选*|遇见详情下推荐遇见 需详情遇见id|integer (int32)|
|**Query**|**theme**  <br>*可选*|主题|string|
|**Query**|**type**  <br>*可选*|类型 1:热门，2最新,3精选|integer (int32)|
|**Query**|**uid**  <br>*可选*|用户id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverVideoDetailResVO»»»](#1a8414d7fee3f075c99d4d9ef9a15ff7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/video/detail/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "boardId" : 0,
  "columnId" : 0,
  "dataVersion" : 0,
  "dest" : 0,
  "destType" : 0,
  "discoverId" : 0,
  "discuId" : 0,
  "level" : "string",
  "mddId" : "string",
  "moduleType" : 0,
  "page" : 0,
  "recommendDiscoverId" : 0,
  "theme" : "string",
  "type" : 0,
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "address" : "string",
      "avatar" : "string",
      "comment" : "string",
      "content" : "string",
      "cover" : "string",
      "createTime" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "followed" : true,
      "isCollect" : true,
      "isTalent" : true,
      "mdd" : {
        "discoverCount" : "string",
        "mddId" : 0,
        "mddName" : "string",
        "mddPic" : "string",
        "type" : 0,
        "wants" : 0
      },
      "mddLabel" : "string",
      "miniShareVO" : {
        "mini_app_cover" : "string",
        "mini_app_id" : "string",
        "mini_app_url" : "string"
      },
      "noticeUsers" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "prise" : "string",
      "prised" : true,
      "productTag" : "string",
      "products" : [ {
        "ageLabel" : "string",
        "brandTag" : [ "string" ],
        "checking" : 0,
        "class_theme_id" : 0,
        "days" : "string",
        "firstBatchStatus" : "string",
        "free" : 0,
        "handler" : "string",
        "isFree" : 0,
        "liangdian" : [ "string" ],
        "liangdianLabel" : "string",
        "linquan" : "string",
        "listColor" : "string",
        "listColorV2" : "string",
        "listImgUrl" : "string",
        "listImgUrlV2" : "string",
        "marketingIco" : "string",
        "marketingList" : [ "string" ],
        "marketingTag" : "string",
        "marketingTagName" : "string",
        "maxPrice" : "string",
        "outDoorLabel" : "string",
        "peopleCount" : 0,
        "peopleCountLabel" : "string",
        "peopleCountLabelFull" : "string",
        "pid" : 0,
        "place_label" : "string",
        "price" : 0.0,
        "price_label" : "string",
        "pro_pic" : "string",
        "productPreferentialList" : [ {
          "couponAmount" : 0.0,
          "detailRemark" : "string",
          "shortRemark" : "string",
          "type" : 0
        } ],
        "product_cat" : "string",
        "product_name" : "string",
        "product_type" : "string",
        "product_type2" : "string",
        "psid" : 0,
        "salePriceLabel" : "string",
        "showStatus" : 0,
        "simpleName" : "string",
        "starttime" : "string",
        "sub_name" : "string",
        "thumb" : "string",
        "thumbList" : [ "string" ],
        "type" : 0,
        "type_or_cat" : "string",
        "typetwoOrCat" : "string",
        "url" : "string",
        "weight" : 0.0
      } ],
      "quoteId" : 0,
      "recommendStatus" : 0,
      "shareTitle" : "string",
      "shareUrl" : "string",
      "uid" : 0,
      "username" : "string",
      "video" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getyouxiasamebatchesusingget"></a>
#### 发现好友-同团游侠
```
GET /app/discover/youxiaSameBatches
```


##### 说明
发现好友-同团游侠<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getYouxiaSameBatches(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverSameBatchesYouxiaVO»»»](#baef15e38c6e7a7ebc1ee2dca1784562)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/youxiaSameBatches
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "needMore" : true,
      "oid" : 0,
      "pid" : 0,
      "placeLabel" : "string",
      "priceLabel" : "string",
      "productName" : "string",
      "startTimeLabel" : "string",
      "thumb" : "string",
      "youxiaList" : [ {
        "cover" : "string",
        "intro" : "string",
        "isTalent" : true,
        "relation" : "string",
        "uid" : 0,
        "username" : "string"
      } ]
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="getyouxiatuijianlistusingget"></a>
#### 发现好友-游侠推荐
```
GET /app/discover/youxiaTuijian
```


##### 说明
发现好友-游侠推荐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverController.getYouxiaTuijianList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverYouxiaTuijianVO»»»](#4e1cdd5d08626a99d64030a9b162c320)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/youxiaTuijian
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "cover" : "string",
      "discoverList" : [ {
        "content" : "string",
        "id" : 0,
        "type" : 0,
        "url" : "string"
      } ],
      "intro" : "string",
      "isTalent" : true,
      "relation" : "string",
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="935df12e134c7134bbfbf96f53db170a"></a>
### 遇见V2版本
Discover Controller V 2


<a name="discovercommentsusingget"></a>
#### 遇见-评论列表
```
GET /app/v2/discover/comments/list
```


##### 说明
遇见-评论列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DiscoverControllerV2.discoverComments(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**discoverId**  <br>*必填*|遇见id|integer (int32)||
|**Query**|**lastId**  <br>*可选*|最后一条id,第一页不传或传0|integer (int32)|`0`|
|**Query**|**type**  <br>*必填*|上一页：1，下一页：2,消息页跳转：3|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverCommentVO»»»_1](#6a7365d0a0b9d83fe235d4e497ec7ca6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/discover/comments/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discoverId" : 0,
  "lastId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "avatar" : "string",
      "cid" : 0,
      "commentedUserName" : "string",
      "content" : "string",
      "createTime" : "string",
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "isTalent" : true,
      "official" : 0,
      "uid" : 0,
      "username" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverrelationusingget"></a>
#### 遇见豆腐块列表
```
GET /app/v2/discover/discu/relation
```


##### 说明
遇见-豆腐块列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DiscoverControllerV2.discoverRelation()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«话题»](#6842d638cdfb9206496ea34ca86724a5)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/discover/discu/relation
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "banners" : [ {
      "handler" : "string",
      "img" : "string",
      "url" : "string"
    } ],
    "hotTopic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ],
    "normalTopic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ],
    "topic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="discoverdiscuusingget"></a>
#### 遇见-话题详情
```
GET /app/v2/discover/list/discuss
```


##### 说明
遇见-话题详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DiscoverControllerV2.discoverDiscu(java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**discu_id**  <br>*可选*|话题id|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**time**  <br>*可选*|榜单时间|string||
|**Query**|**type**  <br>*可选*|类型 1 热门 2最新 3精选 4榜单|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscuDataVo»](#c717033d19b0509e03c227c3222c45f3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/discover/list/discuss
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "discu_id" : 0,
  "page" : 0,
  "time" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "categorys" : [ {
      "boardTime" : [ {
        "title" : "string",
        "value" : [ "string" ]
      } ],
      "categoryId" : 0,
      "title" : "string"
    } ],
    "discoverStream" : [ {
      "uitype" : 0
    } ],
    "discudetail" : {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    },
    "quotesList" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discoverNum" : 0,
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "img" : "string",
      "isV" : true,
      "is_top" : 0,
      "miniShareVO" : {
        "mini_app_cover" : "string",
        "mini_app_id" : "string",
        "mini_app_url" : "string"
      },
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "title" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "userAvatars" : [ "string" ],
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "recommendDests" : [ {
      "colorValue" : "string",
      "cover" : "string",
      "link" : "string",
      "mddDesc" : "string",
      "mddId" : 0,
      "mddName" : "string",
      "type" : 0
    } ],
    "recordCount" : 0,
    "title" : "string",
    "topic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverhotusingget"></a>
#### 遇见热门列表
```
GET /app/v2/discover/list/hot
```


##### 说明
遇见-遇见热门列表<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DiscoverControllerV2.discoverHot(java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**dataVersion**  <br>*可选*|数据版本号|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**pagingMode**  <br>*可选*|分页方式 1为 向上分页 2为下拉分页 默认为1|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverHotResponseVo»](#5d166f76bd7e06a3dfe1373dde9ae291)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/discover/list/hot
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "dataVersion" : 0,
  "page" : 0,
  "pagingMode" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "dataVersion" : 0,
    "images" : [ {
      "handler" : "string",
      "pic" : "string",
      "targetUrl" : "string",
      "title" : "string"
    } ],
    "pageSize" : 0,
    "quotesList" : [ "object" ],
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="discoverquoteusingget"></a>
#### 我的遇见列表
```
GET /app/v2/discover/list/quote
```


##### 说明
遇见-我的遇见<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v2.DiscoverControllerV2.discoverQuote(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**dest**  <br>*可选*|国家或城市id|integer (int32)||
|**Query**|**destType**  <br>*可选*|1国家，2城市|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**timePoint**  <br>*可选*|时间点,用于判断分页第一条是否需要在时间线上加入时间点|string||
|**Query**|**uid**  <br>*可选*|用户编号|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerMapWrap«草稿,List«DiscoverQuoteUserCenterVO»»»](#ff9ef2492d89370edfdc66eadd8a76a4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v2/discover/list/quote
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "dest" : 0,
  "destType" : 0,
  "page" : 0,
  "timePoint" : "string",
  "uid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "element" : {
      "name" : "string",
      "num" : 0,
      "type" : 0
    },
    "list" : [ {
      "address" : "string",
      "auditStatus" : 0,
      "commentNumStr" : "string",
      "content" : "string",
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "featured" : 0,
      "firstLevelTime" : "string",
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isCollect" : true,
      "isShowTimePoint" : true,
      "is_report" : 0,
      "miniShareVO" : {
        "mini_app_cover" : "string",
        "mini_app_id" : "string",
        "mini_app_url" : "string"
      },
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "priseNumStr" : "string",
      "prised" : true,
      "prises" : [ {
        "avatar" : "string",
        "pid" : 0,
        "uid" : 0
      } ],
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "secondLevelTime" : "string",
      "shareTip" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "type" : "string",
      "uid" : 0,
      "video" : "string"
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="e38c126491c1025bdc2c5a399fb7b26a"></a>
### 遇见V3版本
Discover Controller V 3


<a name="discovercolumnusingget"></a>
#### 遇见首页-专栏
```
GET /app/v3/discover/column
```


##### 说明
遇见首页-专栏<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.discoverColumn(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverColumnListVO»](#09704f64358f20ea9704f09394d198f8)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/column
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "columns" : [ {
      "columnId" : 0,
      "discovers" : [ {
        "content" : "string",
        "cover" : "string",
        "quoteId" : 0,
        "type" : 0
      } ],
      "title" : "string"
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="columndetaildownusingget"></a>
#### 专栏详情下半部分
```
GET /app/v3/discover/column/detail/down
```


##### 说明
专栏详情下半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.columnDetailDown(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**columnId**  <br>*必填*|专栏id|integer (int32)||
|**Query**|**discuId**  <br>*可选*|话题id|integer (int32)||
|**Query**|**page**  <br>*可选*|分页|integer (int32)|`1`|
|**Query**|**type**  <br>*可选*|1 热门  2最新|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«DiscoverHotVO»»»](#97909c02edc67ee69d6cb538bb8a77a3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/column/detail/down
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "columnId" : 0,
  "discuId" : 0,
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "activity" : {
        "activity_type" : "string",
        "target_type" : "string",
        "target_url" : "string"
      },
      "address" : "string",
      "avatar" : "string",
      "comment" : 0,
      "comments" : [ {
        "avatar" : "string",
        "cid" : 0,
        "commentedUserName" : "string",
        "content" : "string",
        "createTime" : "string",
        "gmt_create" : 0,
        "grouplist" : [ {
          "certTitle" : "string",
          "certType" : "string"
        } ],
        "isTalent" : true,
        "official" : 0,
        "uid" : 0,
        "username" : "string"
      } ],
      "content" : "string",
      "cover" : "string",
      "discoverMdd" : {
        "discoverCount" : "string",
        "mddId" : 0,
        "mddName" : "string",
        "mddPic" : "string",
        "type" : 0,
        "wants" : 0
      },
      "discus" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "favtimes" : 0,
      "featured" : 0,
      "gmt_create" : 0,
      "grouplist" : [ {
        "certTitle" : "string",
        "certType" : "string"
      } ],
      "images" : [ {
        "height" : 0,
        "labels_info" : [ {
          "content" : "string",
          "position" : "string",
          "x" : "string",
          "y" : "string"
        } ],
        "shareUrl" : "string",
        "url" : "string",
        "url_l" : "string",
        "url_m" : "string",
        "url_xl" : "string",
        "width" : 0
      } ],
      "isCollect" : true,
      "isV" : true,
      "is_top" : 0,
      "miniShareVO" : {
        "mini_app_cover" : "string",
        "mini_app_id" : "string",
        "mini_app_url" : "string"
      },
      "notice_users" : [ {
        "did" : 0,
        "title" : "string"
      } ],
      "official" : 0,
      "panoramaPercent" : "string",
      "panoramaStatus" : 0,
      "prise" : 0,
      "prised" : true,
      "prises" : [ {
        "avatar" : "string",
        "pid" : 0,
        "uid" : 0
      } ],
      "product" : [ "object" ],
      "quote_id" : 0,
      "recommendStatus" : 0,
      "recording" : "string",
      "recordingDuration" : 0,
      "relation" : "string",
      "share_title" : "string",
      "share_url" : "string",
      "show_address" : "string",
      "type" : "string",
      "uiType" : 0,
      "uid" : 0,
      "username" : "string",
      "video" : "string",
      "watermarkStatus" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="columndetailupusingget"></a>
#### 专栏详情上半部分
```
GET /app/v3/discover/column/detail/up
```


##### 说明
专栏详情上半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.columnDetailUp(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**columnId**  <br>*必填*|专栏id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverColumnDetailUpVO»](#32fd3903778bd69500fc4f298ed6ccef)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/column/detail/up
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "columnId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "backGroundColor" : "string",
    "canWrite" : true,
    "desc" : "string",
    "discus" : [ {
      "discuId" : 0,
      "title" : "string"
    } ],
    "image" : "string",
    "title" : "string",
    "users" : [ {
      "avatar" : "string",
      "intro" : "string",
      "talent" : true,
      "uid" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="meetfindpageupusingget"></a>
#### 遇见发现页上半部分
```
GET /app/v3/discover/find/up
```


##### 说明
遇见发现页上半部分<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.meetFindPageUp()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«遇见发现页上半部分数据»](#4305f159eb67c5f5649f95fcdee9162f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/find/up
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rankList" : [ {
      "label" : "string",
      "newest" : true,
      "targetUrl" : "string",
      "type" : 0,
      "uitype" : 0,
      "users" : [ {
        "avatar" : "string",
        "intro" : "string",
        "talent" : true,
        "uid" : 0,
        "username" : "string"
      } ]
    } ],
    "topic" : [ {
      "bigimg" : "string",
      "bigimgType" : 0,
      "desc" : "string",
      "detail" : "string",
      "detailHandler" : "string",
      "detailTargetUrl" : "string",
      "did" : 0,
      "discoverCount" : "string",
      "discu_id" : 0,
      "followNum" : "string",
      "followed" : 0,
      "handler" : "string",
      "hot" : 0,
      "img" : "string",
      "joinNum" : "string",
      "reward" : 0,
      "rewardBanners" : [ "string" ],
      "target_url" : "string",
      "title" : "string",
      "type" : 0,
      "views" : "string"
    } ],
    "weekList" : [ {
      "label" : "string",
      "newest" : true,
      "targetUrl" : "string",
      "type" : 0,
      "uitype" : 0,
      "users" : [ {
        "avatar" : "string",
        "intro" : "string",
        "talent" : true,
        "uid" : 0,
        "username" : "string"
      } ]
    } ]
  },
  "msg" : "string"
}
```


<a name="discoverstreamusingget"></a>
#### 遇见发现页瀑布流
```
GET /app/v3/discover/list/stream
```


##### 说明
遇见发现页瀑布流<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.discoverStream(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**city**  <br>*可选*|城市名称|string||
|**Query**|**dataVersion**  <br>*可选*|数据版本号|integer (int32)||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|
|**Query**|**type**  <br>*可选*|1:热门，2最新,3精选|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»](#ad0c913e1185074fad13a042f119771a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/list/stream
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "city" : "string",
  "dataVersion" : 0,
  "page" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "uitype" : 0
    } ],
    "pageSize" : 0,
    "recordCount" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="weeklistusingget"></a>
#### 遇见周榜页
```
GET /app/v3/discover/week/list
```


##### 说明
遇见周榜页<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.v3.DiscoverControllerV3.weekList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|当前页|integer (int32)|`1`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverWeekListVO»](#cfe2cf1eae89803d9d17173315cdc90b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/v3/discover/week/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "historyWeekList" : [ {
      "cover" : "string",
      "targetUrl" : "string",
      "timeLabel" : "string",
      "title" : "string"
    } ],
    "label" : "string",
    "targetUrl" : "string",
    "topWeekList" : [ {
      "content" : "string",
      "discoverId" : 0,
      "discoverType" : 0,
      "images" : [ "string" ],
      "label" : "string",
      "newest" : true,
      "targetUrl" : "string",
      "type" : 0,
      "uitype" : 0,
      "users" : [ {
        "avatar" : "string",
        "intro" : "string",
        "talent" : true,
        "uid" : 0,
        "username" : "string"
      } ]
    } ],
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="c7062d8305673e1a20fe316a7be4579f"></a>
### 遇见用户
Discover User Controller


<a name="addencourageusingpost"></a>
#### 新增鼓励
```
POST /app/discover/rank/add-encourage
```


##### 说明
新增鼓励<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.addEncourage(java.lang.Integer,java.lang.String)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**content**  <br>*必填*|content|string|
|**Query**|**toUid**  <br>*必填*|toUid|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«DiscoverEncourageVO»»](#4770def41a02138d4eea4b271081feee)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/add-encourage
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "content" : "string",
  "toUid" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "content" : "string",
      "encourageId" : 0,
      "fromUid" : 0,
      "fromUserAvatar" : "string",
      "toUid" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="getencourageemojiusingget"></a>
#### 获取表情信息
```
GET /app/discover/rank/encourage-emoji
```


##### 说明
获取表情信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.getEncourageEmoji()


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«EncourageConfigVO»»](#d0ef3a81bf167f494482ac162b80cd14)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/encourage-emoji
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "content" : "string",
      "emoji" : "string",
      "sort" : 0
    } ]
  },
  "msg" : "string"
}
```


<a name="getencouragesummaryusingget"></a>
#### 获取鼓励汇总信息
```
GET /app/discover/rank/encourage-summary
```


##### 说明
获取鼓励汇总信息<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.getEncourageSummary(java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**page**  <br>*可选*|page|integer (int32)|`1`|
|**Query**|**uid**  <br>*可选*|目标用户uid|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«EncourageSummaryVO»](#169ed5637cff408042ece837feb29cfc)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/encourage-summary
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "page" : 0,
  "uid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "encourageDetail" : [ {
      "encourages" : [ {
        "content" : "string",
        "encourageId" : 0,
        "fromUid" : 0,
        "fromUserAvatar" : "string",
        "toUid" : 0
      } ],
      "time" : "string"
    } ],
    "total" : 0,
    "totalPage" : 0
  },
  "msg" : "string"
}
```


<a name="followuserranklistusingpost"></a>
#### 一键关注前十
```
POST /app/discover/rank/follow-top10
```


##### 说明
一键关注前十<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.followUserRankList(com.youxiake.model.master.discover.vo.request.DiscoverRankRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**rankType**  <br>*可选*|榜单类型 1红人榜 ，2精选榜 3 毅力榜|integer (int32)|
|**Query**|**time**  <br>*可选*|榜单日期|string|
|**Query**|**timeType**  <br>*可选*|榜单周期 1周榜 ，2月榜|integer (int32)|
|**Query**|**year**  <br>*可选*|榜单年份|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse](#yxkapiresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/follow-top10
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "rankType" : 0,
  "time" : "string",
  "timeType" : 0,
  "year" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "msg" : "string"
}
```


<a name="getranklistusingget"></a>
#### 获取所有榜单
```
GET /app/discover/rank/list
```


##### 说明
获取所有榜单<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.getRankList(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string||
|**Header**|**Authorization**  <br>*可选*|Bearer|string||
|**Header**|**os**  <br>*可选*|ios\|android|string||
|**Header**|**sitecode**  <br>*可选*|sitecode|string||
|**Header**|**version**  <br>*可选*|设备版本|string||
|**Query**|**type**  <br>*可选*|榜单类型 1周榜，2月榜|string|`"1"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«ListWrapperVO«DiscoverRankListVO»»](#25d867cc3f6cf42d5e85ed4399139cd0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "type" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "list" : [ {
      "time" : [ "string" ],
      "year" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="getuserranklistusingpost"></a>
#### 获取榜单用户排名
```
POST /app/discover/rank/user-list
```


##### 说明
获取榜单用户排名<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverUserController.getUserRankList(com.youxiake.model.master.discover.vo.request.DiscoverRankRq)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**rankType**  <br>*可选*|榜单类型 1红人榜 ，2精选榜 3 毅力榜|integer (int32)|
|**Query**|**time**  <br>*可选*|榜单日期|string|
|**Query**|**timeType**  <br>*可选*|榜单周期 1周榜 ，2月榜|integer (int32)|
|**Query**|**year**  <br>*可选*|榜单年份|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«榜单»](#43485fe4142feb5196f01e81e68f94f3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/rank/user-list
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "rankType" : 0,
  "time" : "string",
  "timeType" : 0,
  "year" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "myRank" : {
      "content" : "string",
      "cover" : "string",
      "encourageNum" : 0,
      "encourages" : [ {
        "content" : "string",
        "encourageId" : 0,
        "fromUid" : 0,
        "fromUserAvatar" : "string",
        "toUid" : 0
      } ],
      "isTalent" : true,
      "rank" : 0,
      "relation" : "string",
      "relationBoolean" : true,
      "uid" : 0,
      "username" : "string"
    },
    "note" : "string",
    "rankList" : [ {
      "content" : "string",
      "cover" : "string",
      "encourageNum" : 0,
      "encourages" : [ {
        "content" : "string",
        "encourageId" : 0,
        "fromUid" : 0,
        "fromUserAvatar" : "string",
        "toUid" : 0
      } ],
      "isTalent" : true,
      "rank" : 0,
      "relation" : "string",
      "relationBoolean" : true,
      "uid" : 0,
      "username" : "string"
    } ]
  },
  "msg" : "string"
}
```


<a name="60d81583ee18fdd5e21365b76217023b"></a>
### 遇见评论
Discover Comment Controller


<a name="commentpriseusingpost"></a>
#### 遇见评论点赞
```
POST /app/discover/comment/prise
```


##### 说明
<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.discover.DiscoverCommentController.commentPrise(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**commentId**  <br>*可选*|遇见评论id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«DiscoverCommentPriseResultVO»](#375e519fcd801ed37a6f23035cef4a2d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/discover/comment/prise
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "commentId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "prise" : "string",
    "prised" : true
  },
  "msg" : "string"
}
```


<a name="2b59ff0e7e8b623379403075f3d593b0"></a>
### 酒套产品
I Product Hotel Controller


<a name="batchcalendarusingget"></a>
#### 酒套选择套餐/日期
```
GET /app/n/product/hotel/batch/calendar
```


##### 说明
酒套选择套餐/日期<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.IProductHotelController.batchCalendar(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**pid**  <br>*必填*|产品id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«BatchCalendarVo»](#9893df699525fda07ffb7d7e87269062)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/hotel/batch/calendar
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "batchPakList" : [ {
      "batchList" : [ {
        "bid" : 0,
        "dateLabel" : "string",
        "dateNightLabel" : "string",
        "endDate" : "string",
        "pkgid" : 0,
        "price" : 0.0,
        "priceLabel" : "string",
        "selected" : 0,
        "startDate" : "string"
      } ],
      "monthList" : [ {
        "caleLabel" : "string",
        "caleMonth" : "string",
        "price" : 0.0,
        "priceLabel" : "string"
      } ],
      "pkgId" : 0,
      "pkgName" : "string"
    } ],
    "batchsDesc" : "string",
    "batchsList" : [ {
      "bid" : 0,
      "dateLabel" : "string",
      "dateNightLabel" : "string",
      "endDate" : "string",
      "pkgid" : 0,
      "price" : 0.0,
      "priceLabel" : "string",
      "selected" : 0,
      "startDate" : "string"
    } ],
    "batchsPreview" : [ {
      "caleLabel" : "string",
      "caleMonth" : "string",
      "price" : 0.0,
      "priceLabel" : "string"
    } ],
    "calenderEnd" : "string",
    "calenderStart" : "string"
  },
  "msg" : "string"
}
```


<a name="hoteldetailusingget"></a>
#### 获取酒店详情
```
GET /app/n/product/hotel/detail
```


##### 说明
获取酒店详情<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.IProductHotelController.hotelDetail(java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**hid**  <br>*必填*|酒店id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[YXkApiResponse«HotelDetailVo»](#193b902feee13f2d26d1a5c3435e1b2f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/app/n/product/hotel/detail
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "hid" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "hotelDetailFirst" : {
      "hotelInfoItemList" : [ {
        "describe" : "string",
        "title" : "string",
        "type" : 0
      } ],
      "hotelName" : "string",
      "lat" : "string",
      "lng" : "string",
      "photoAlbumList" : [ {
        "firstImage" : "string",
        "images" : [ "string" ],
        "title" : "string"
      } ],
      "placeType" : 0,
      "remark" : "string"
    },
    "hotelDetailSecond" : {
      "hotelFacilityList" : [ {
        "describeList" : [ "string" ],
        "title" : "string"
      } ],
      "hotelPolicyList" : [ {
        "describe" : "string",
        "title" : "string"
      } ]
    }
  },
  "msg" : "string"
}
```


<a name="detailbatchselectusingget"></a>
#### 酒套产品详情-选择套餐
```
GET /app/n/product/hotel/detail/batch
```


##### 说明
酒套产品详情-选择套餐<br/>public com.youxiake.context.data.web.YXkApiResponse com.youxiake.yxkapp.controller.product.IProductHotelController.detailBatchSelect(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.String,java.lang.Integer,java.lang.Integer)


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**Accept**  <br>*可选*|application/vnd.yxk.v1+json|string|
|**Header**|**Authorization**  <br>*可选*|Bearer|string|
|**Header**|**os**  <br>*可选*|ios\|android|string|
|**Header**|**sitecode**  <br>*可选*|sitecode|string|
|**Header**|**version**  <br>*可选*|设备版本|string|
|**Query**|**adultNum**  <br>*必填*|选择的成人数量|string|
|**Query**|**batchStartDate**  <br>*可选*|详情里选中套餐的时候需要传当前选中批次的开始时间（yyyy-MM-dd）|string|
|**Query**|**bid**  <br>*可选*|选中批次的时候才传bid，其他时候不要传|string|
|**Query**|**childNum**  <br>*必填*|选择的儿童数量|string|
|**Query**|**pkgId**  <br>*必填*|批次套餐id|string|


##### 响应

|---|---|---|