
<a name="definitions"></a>
## 定义

<a name="appevaluationlistv2vo"></a>
### APPEvaluationListV2VO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|list  <br>**样例** : `[ "[evaluationlistdetailvo](#evaluationlistdetailvo)" ]`|< [EvaluationListDetailVo](#evaluationlistdetailvo) > array|
|**num**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pagesize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|星级  <br>**样例** : `[ "[appproductcommenttagsvo](#appproductcommenttagsvo)" ]`|< [AppProductCommentTagsVO](#appproductcommenttagsvo) > array|
|**totalpage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="activity"></a>
### Activity

|名称|说明|类型|
|---|---|---|
|**priseDesc**  <br>*可选*|奖品简介  <br>**样例** : `"string"`|string|
|**rule**  <br>*可选*|活动规则  <br>**样例** : `"string"`|string|


<a name="activityvo"></a>
### ActivityVO

|名称|说明|类型|
|---|---|---|
|**activity_type**  <br>*可选*|活动类型  <br>**样例** : `"string"`|string|
|**target_type**  <br>*可选*|活动跳转类型 html5(H5页面)、 meet(遇见)、product_detail(线路详情)、bbs_detail(帖子详情)  <br>**样例** : `"string"`|string|
|**target_url**  <br>*可选*|活动跳转地址  <br>**样例** : `"string"`|string|


<a name="advo"></a>
### AdVo

|名称|说明|类型|
|---|---|---|
|**exp**  <br>*可选*|到期时间，0表示永久有效  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|目标类型  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|广告图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|目标参数  <br>**样例** : `"string"`|string|


<a name="addressdeleterq"></a>
### AddressDeleteRQ

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|收货地址ID  <br>**样例** : `0`|integer (int32)|


<a name="addressdetailvo"></a>
### AddressDetailVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**area**  <br>*可选*|地区  <br>**样例** : `"[areavo](#areavo)"`|[AreaVO](#areavo)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|联系电话  <br>**样例** : `"string"`|string|
|**receiver**  <br>*可选*|收货人  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|状态  <br>**样例** : `0`|integer (int32)|


<a name="addresslistvo"></a>
### AddressListVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**default**  <br>*可选*|是否默认  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|地址ID  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|联系电话  <br>**样例** : `"string"`|string|
|**receiver**  <br>*可选*|收货人  <br>**样例** : `"string"`|string|


<a name="addresssaverq"></a>
### AddressSaveRQ

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**cityId**  <br>*可选*|城市zipcode  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|地址ID  <br>**样例** : `0`|integer (int32)|
|**isDefault**  <br>*可选*|是否默认 1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|联系电话  <br>**样例** : `"string"`|string|
|**provinceId**  <br>*可选*|省份zipcode  <br>**样例** : `0`|integer (int32)|
|**receiver**  <br>*可选*|收货人  <br>**样例** : `"string"`|string|
|**xianId**  <br>*可选*|区县zipcode  <br>**样例** : `0`|integer (int32)|


<a name="addresssetdefaultrq"></a>
### AddressSetDefaultRQ

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|收货地址ID  <br>**样例** : `0`|integer (int32)|


<a name="advancemedaldetail"></a>
### AdvanceMedalDetail

|名称|说明|类型|
|---|---|---|
|**medals**  <br>*可选*|勋章  <br>**样例** : `[ "[singlemedaldetailvo](#singlemedaldetailvo)" ]`|< [SingleMedalDetailVO](#singlemedaldetailvo) > array|


<a name="albumcollectvo"></a>
### AlbumCollectVO

|名称|说明|类型|
|---|---|---|
|**albumId**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**copyright**  <br>*可选*|版权  <br>**样例** : `"[copyright](#copyright)"`|[Copyright](#copyright)|
|**copyrightInt**  <br>*可选*|版权id  <br>**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否推荐  <br>**样例** : `0`|integer (int32)|
|**imageNum**  <br>*可选*|作品数量  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|作品标题  <br>**样例** : `"string"`|string|


<a name="albumcollectsvo"></a>
### AlbumCollectsVO

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[albumcollectvo](#albumcollectvo)" ]`|< [AlbumCollectVO](#albumcollectvo) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="albumcommentprisevo"></a>
### AlbumCommentPriseVO

|名称|说明|类型|
|---|---|---|
|**prise**  <br>*可选*|点赞数量  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|true 为已点赞  <br>**样例** : `true`|boolean|


<a name="albumcommentvo"></a>
### AlbumCommentVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**commentedUserId**  <br>*可选*|被评论用户Id  <br>**样例** : `0`|integer (int32)|
|**commentedUserName**  <br>*可选*|被评论用户名  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组信息  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|
|**hasPrised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**isAuthor**  <br>*可选*|是否是作者  <br>**样例** : `true`|boolean|
|**isDelete**  <br>*可选*|是否删除  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|是否为达人  <br>**样例** : `true`|boolean|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**priseNum**  <br>*可选*|点赞数  <br>**样例** : `0`|integer (int32)|
|**replyComments**  <br>*可选*|回复  <br>**样例** : `[ "[albumcommentvo](#albumcommentvo)" ]`|< [AlbumCommentVO](#albumcommentvo) > array|
|**replyId**  <br>*可选*|被回复的评论id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1 为评论 2为回复  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="albumhot"></a>
### AlbumHot

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**copyright**  <br>*可选*|版权信息  <br>**样例** : `"[copyright](#copyright)"`|[Copyright](#copyright)|
|**copyrightInt**  <br>*可选*|版权id  <br>**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否推荐  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="albumphotovo"></a>
### AlbumPhotoVO

|名称|说明|类型|
|---|---|---|
|**currentVoteNum**  <br>*可选*|投票中票数  <br>**样例** : `0`|integer (int32)|
|**imageUrl**  <br>*可选*|**样例** : `"string"`|string|
|**isInVote**  <br>*可选*|是否投票中  <br>**样例** : `true`|boolean|
|**sid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="albumrecommendsbeanvo"></a>
### AlbumRecommendsBeanVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|摄影作品id  <br>**样例** : `0`|integer (int32)|
|**photos**  <br>*可选*|摄影作品下的图片  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|摄影作品标题  <br>**样例** : `"string"`|string|


<a name="albumsharevo"></a>
### AlbumShareVO

|名称|说明|类型|
|---|---|---|
|**expertComment**  <br>*可选*|专家评论  <br>**样例** : `"object"`|object|
|**photoDetailVO**  <br>*可选*|摄影详情  <br>**样例** : `"[photodetailvo_1](#photodetailvo_1)"`|[PhotoDetailVO_1](#photodetailvo_1)|


<a name="albumsubcribevo"></a>
### AlbumSubcribeVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|摄影作品id  <br>**样例** : `0`|integer (int32)|
|**author**  <br>*可选*|作者信息  <br>**样例** : `"[author](#author)"`|[Author](#author)|
|**commented**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**description**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|摄影作品创建时间  <br>**样例** : `0`|integer (int64)|
|**is_competition**  <br>*可选*|是否参赛  <br>**样例** : `0`|integer (int32)|
|**is_liked**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**liked**  <br>*可选*|点赞数  <br>**样例** : `0`|integer (int32)|
|**photos**  <br>*可选*|图片列表  <br>**样例** : `[ "[photosvo](#photosvo)" ]`|< [PhotosVO](#photosvo) > array|
|**tags**  <br>*可选*|标签列表  <br>**样例** : `[ "[tags](#tags)" ]`|< [Tags](#tags) > array|
|**title**  <br>*可选*|摄影作品标题  <br>**样例** : `"string"`|string|
|**参赛信息**  <br>*可选*|**样例** : `"[competitioninfovo](#competitioninfovo)"`|[CompetitionInfoVO](#competitioninfovo)|


<a name="albumsubcribesvo"></a>
### AlbumSubcribesVO

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[albumsubcribevo](#albumsubcribevo)" ]`|< [AlbumSubcribeVO](#albumsubcribevo) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="albumvo"></a>
### AlbumVO

|名称|说明|类型|
|---|---|---|
|**albumId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**award**  <br>*可选*|true为获奖作品  <br>**样例** : `true`|boolean|
|**canVote**  <br>*可选*|true参赛投票中  <br>**样例** : `true`|boolean|
|**cover**  <br>*可选*|作品封面图  <br>**样例** : `"string"`|string|
|**editorChoice**  <br>*可选*|true为编辑推荐  <br>**样例** : `true`|boolean|
|**groupId**  <br>*可选*|分组id  <br>**样例** : `0`|integer (int32)|
|**groupName**  <br>*可选*|分组名称  <br>**样例** : `"string"`|string|
|**height**  <br>*可选*|作品封面图长度  <br>**样例** : `0`|integer (int32)|
|**isCollect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|true为达人  <br>**样例** : `true`|boolean|
|**photoCount**  <br>*可选*|作品内图片数  <br>**样例** : `0`|integer (int32)|
|**priseCount**  <br>*可选*|作品点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|true为已点赞  <br>**样例** : `true`|boolean|
|**shareUrl**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|作品标题  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|作者uid  <br>**样例** : `0`|integer (int32)|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**voteCount**  <br>*可选*|投票票数  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|作品封面图宽度  <br>**样例** : `0`|integer (int32)|


<a name="albumlists"></a>
### Albumlists

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否可下载  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**thumb_height**  <br>*可选*|封面高度  <br>**样例** : `0`|integer (int32)|
|**thumb_width**  <br>*可选*|封面宽度  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="albumsbeanvo"></a>
### AlbumsBeanVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|摄影作品id  <br>**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否推荐  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|摄影作品创建时间  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|摄影作品封面  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|摄影作品标题  <br>**样例** : `"string"`|string|


<a name="albumsminevo"></a>
### AlbumsMineVO

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[albumsvo](#albumsvo)" ]`|< [AlbumsVO](#albumsvo) > array|
|**total**  <br>*可选*|总条数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="albumsvo"></a>
### AlbumsVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|摄影作品id  <br>**样例** : `0`|integer (int32)|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**auditStatusLabel**  <br>*可选*|审核状态  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|封面(thumb)对应的原始图片id  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|摄影作品创建时间  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|摄影作品封面  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|摄影作品标题  <br>**样例** : `"string"`|string|


<a name="appdataitemvo"></a>
### AppDataItemVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**exp**  <br>*可选*|**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**link**  <br>*可选*|**样例** : `"string"`|string|
|**media_thumb**  <br>*可选*|**样例** : `"string"`|string|
|**media_url**  <br>*可选*|**样例** : `"string"`|string|
|**place_label**  <br>*可选*|**样例** : `"string"`|string|
|**price_alias**  <br>*可选*|**样例** : `"string"`|string|
|**price_label**  <br>*可选*|**样例** : `0.0`|number|
|**showSearch**  <br>*可选*|跳webview是否显示右上角搜索按钮  <br>**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="appdestinationitem"></a>
### AppDestinationItem

|名称|说明|类型|
|---|---|---|
|**mddId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="appdestinationitem_1"></a>
### AppDestinationItem_1

|名称|说明|类型|
|---|---|---|
|**mddId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="appdestinationvo"></a>
### AppDestinationVO

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `[ "[appdestinationitem_1](#appdestinationitem_1)" ]`|< [AppDestinationItem_1](#appdestinationitem_1) > array|
|**hotCity**  <br>*可选*|**样例** : `[ "[appdestinationitem_1](#appdestinationitem_1)" ]`|< [AppDestinationItem_1](#appdestinationitem_1) > array|


<a name="appdestinationvov2"></a>
### AppDestinationVOV2

|名称|说明|类型|
|---|---|---|
|**appGroupCitys**  <br>*可选*|站点列表  <br>**样例** : `[ "[appgroupitem](#appgroupitem)" ]`|< [AppGroupItem](#appgroupitem) > array|
|**cityAreaGroup**  <br>*可选*|站点列表划分区域  <br>**样例** : `[ "[cityareagroup](#cityareagroup)" ]`|< [CityAreaGroup](#cityareagroup) > array|


<a name="appgroupitem"></a>
### AppGroupItem

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `[ "[appdestinationitem](#appdestinationitem)" ]`|< [AppDestinationItem](#appdestinationitem) > array|
|**cityTitle**  <br>*可选*|**样例** : `"string"`|string|


<a name="appindexvo"></a>
### AppIndexVO

|名称|说明|类型|
|---|---|---|
|**cityTip**  <br>*可选*|**样例** : `"string"`|string|
|**coupon**  <br>*可选*|**样例** : `"[appdataitemvo](#appdataitemvo)"`|[AppDataItemVO](#appdataitemvo)|
|**destin**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**first_ad**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**flash**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**hotsearchs**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**index_tip**  <br>*可选*|**样例** : `"[appdataitemvo](#appdataitemvo)"`|[AppDataItemVO](#appdataitemvo)|
|**ipCity**  <br>*可选*|**样例** : `"[indexipentity](#indexipentity)"`|[IndexIPEntity](#indexipentity)|
|**media**  <br>*可选*|**样例** : `"[mediaentity](#mediaentity)"`|[MediaEntity](#mediaentity)|
|**navs**  <br>*可选*|**样例** : `[ "[basedataitemvo](#basedataitemvo)" ]`|< [BaseDataItemVO](#basedataitemvo) > array|
|**navs2**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**navs2_part**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**news**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**photo**  <br>*可选*|**样例** : `"[photoentity](#photoentity)"`|[PhotoEntity](#photoentity)|
|**photo_mdd**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**post**  <br>*可选*|**样例** : `"[postentity](#postentity)"`|[PostEntity](#postentity)|
|**qinzi_2**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**qiyu**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**race**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**sale**  <br>*可选*|**样例** : `[ "[saleentity](#saleentity)" ]`|< [SaleEntity](#saleentity) > array|
|**search_data**  <br>*可选*|**样例** : `{<br>  "string" : "string"<br>}`|< string, string > map|
|**search_placeholder**  <br>*可选*|**样例** : `"string"`|string|
|**siteCity**  <br>*可选*|**样例** : `"[appdestinationitem_1](#appdestinationitem_1)"`|[AppDestinationItem_1](#appdestinationitem_1)|
|**tags**  <br>*可选*|**样例** : `[ "[reginentity](#reginentity)" ]`|< [ReginEntity](#reginentity) > array|
|**theme**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**third_ad**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**waipai_2**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|
|**weekend_2**  <br>*可选*|**样例** : `"[productitemmodel](#productitemmodel)"`|[ProductItemModel](#productitemmodel)|


<a name="appindexvov2"></a>
### AppIndexVOV2

|名称|说明|类型|
|---|---|---|
|**activityBanner**  <br>*可选*|运营活动广告位  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**aroundLump**  <br>*可选*|周边玩乐  <br>**样例** : `"[indexaroundlumpvo](#indexaroundlumpvo)"`|[IndexAroundLumpVo](#indexaroundlumpvo)|
|**background**  <br>*可选*|头部背景图  <br>**样例** : `"string"`|string|
|**banner**  <br>*可选*|二级导航下banner图  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**cityTip**  <br>*可选*|定位提示  <br>**样例** : `"string"`|string|
|**coupon**  <br>*可选*|注册送代金券  <br>**样例** : `"[appdataitemvo](#appdataitemvo)"`|[AppDataItemVO](#appdataitemvo)|
|**defaultSearch**  <br>*可选*|默认搜索  <br>**样例** : `"[indexhandleritemvo](#indexhandleritemvo)"`|[IndexHandlerItemVo](#indexhandleritemvo)|
|**destination**  <br>*可选*|当季目的地  <br>**样例** : `"[indexdestination](#indexdestination)"`|[IndexDestination](#indexdestination)|
|**firstNav**  <br>*可选*|一级导航  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**flashImageList**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**flowTabList**  <br>*可选*|底部瀑布流tab  <br>**样例** : `[ "[indexflowtab](#indexflowtab)" ]`|< [IndexFlowTab](#indexflowtab) > array|
|**hotSearchList**  <br>*可选*|热搜  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**hotsearchs**  <br>*可选*|搜索里面的热门搜索  <br>**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**index_tip**  <br>*可选*|动态弹出广告  <br>**样例** : `"[appdataitemvo](#appdataitemvo)"`|[AppDataItemVO](#appdataitemvo)|
|**ipCity**  <br>*可选*|定位信息  <br>**样例** : `"[indexipentity](#indexipentity)"`|[IndexIPEntity](#indexipentity)|
|**kingProduct**  <br>*可选*|王牌线路  <br>**样例** : `"[indexrecommend](#indexrecommend)"`|[IndexRecommend](#indexrecommend)|
|**minority**  <br>*可选*|小众种草  <br>**样例** : `"[indexminority](#indexminority)"`|[IndexMinority](#indexminority)|
|**newProduct**  <br>*可选*|新品推荐  <br>**样例** : `"[indexrecommend](#indexrecommend)"`|[IndexRecommend](#indexrecommend)|
|**pullRefresh**  <br>*可选*|下拉刷新广告位  <br>**样例** : `"[indexhandleritemvo](#indexhandleritemvo)"`|[IndexHandlerItemVo](#indexhandleritemvo)|
|**qiyu**  <br>*可选*|七鱼数据  <br>**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**saleProductList**  <br>*可选*|限时特惠的产品  <br>**样例** : `[ "[indexsaleproductitemvo](#indexsaleproductitemvo)" ]`|< [IndexSaleProductItemVo](#indexsaleproductitemvo) > array|
|**secondNav**  <br>*可选*|二级导航  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**siteCity**  <br>*可选*|分站信息  <br>**样例** : `"[appdestinationitem_1](#appdestinationitem_1)"`|[AppDestinationItem_1](#appdestinationitem_1)|
|**topColour**  <br>*可选*|头部颜色  <br>**样例** : `"string"`|string|
|**userCenterNav**  <br>*可选*|用户中心导航  <br>**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**vipFreeStatus**  <br>*可选*|是否展示会员免费  <br>**样例** : `"0:不展示 1:展示"`|integer (int32)|


<a name="applocationvov2"></a>
### AppLocationVOV2

|名称|说明|类型|
|---|---|---|
|**cityTip**  <br>*可选*|定位提示  <br>**样例** : `"string"`|string|
|**ipCity**  <br>*可选*|定位信息  <br>**样例** : `"[indexipentity](#indexipentity)"`|[IndexIPEntity](#indexipentity)|


<a name="appproductcommenttagsvo"></a>
### AppProductCommentTagsVO

|名称|说明|类型|
|---|---|---|
|**label**  <br>*可选*|标签标识  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**tname**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型： 1固定标签 2动态标签  <br>**样例** : `0`|integer (int32)|


<a name="areavo"></a>
### AreaVO

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|市  <br>**样例** : `"[regionvo](#regionvo)"`|[RegionVO](#regionvo)|
|**province**  <br>*可选*|省  <br>**样例** : `"[regionvo](#regionvo)"`|[RegionVO](#regionvo)|
|**xian**  <br>*可选*|区  <br>**样例** : `"[regionvo](#regionvo)"`|[RegionVO](#regionvo)|


<a name="aroundcalendarindexvo"></a>
### AroundCalendarIndexVO

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|例如：杭州  <br>**样例** : `"string"`|string|
|**dateList**  <br>*可选*|节日list集合  <br>**样例** : `[ "[aroundcalendaritemvo](#aroundcalendaritemvo)" ]`|< [AroundCalendarItemVO](#aroundcalendaritemvo) > array|
|**dateMap**  <br>*可选*|节日map集合，key为日期格式，例如：2018-07-25  <br>**样例** : `{<br>  "string" : "[aroundcalendaritemvo](#aroundcalendaritemvo)"<br>}`|< string, [AroundCalendarItemVO](#aroundcalendaritemvo) > map|
|**selectedDaTe**  <br>*可选*|选中的日期，日期格式：2018-07-25  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "[aroundtagitemvo](#aroundtagitemvo)" ]`|< [AroundTagItemVO](#aroundtagitemvo) > array|
|**todayDate**  <br>*可选*|服务器今天日期，日期格式：2018-07-25  <br>**样例** : `"string"`|string|


<a name="aroundcalendaritemvo"></a>
### AroundCalendarItemVO

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|日期，例如：2019-11-21  <br>**样例** : `"string"`|string|
|**dateTip**  <br>*可选*|日期标注，例如：班/休/劳动节  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|日期类型，1节日当天2法定节假日3调休上班日4其他  <br>**样例** : `0`|integer (int32)|


<a name="aroundcalendarproductvo"></a>
### AroundCalendarProductVO

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|产品  <br>**样例** : `"[2874ad68e544390bbec7ac7f4d0027c2](#2874ad68e544390bbec7ac7f4d0027c2)"`|[MicroPagerWrap«List«瀑布流-线路或者酒套»»](#2874ad68e544390bbec7ac7f4d0027c2)|
|**selectedDaTe**  <br>*可选*|选中的日期，日期格式：2018-07-25  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "[aroundtagitemvo](#aroundtagitemvo)" ]`|< [AroundTagItemVO](#aroundtagitemvo) > array|
|**todayDate**  <br>*可选*|服务器今天日期，日期格式：2018-07-25  <br>**样例** : `"string"`|string|


<a name="aroundflowtagvo"></a>
### AroundFlowTagVO

|名称|说明|类型|
|---|---|---|
|**firstTypeList**  <br>*可选*|第一级标签  <br>**样例** : `[ "[aroundtagitemvo](#aroundtagitemvo)" ]`|< [AroundTagItemVO](#aroundtagitemvo) > array|
|**secondTypeList**  <br>*可选*|第二级标签  <br>**样例** : `[ "[aroundtagitemvo](#aroundtagitemvo)" ]`|< [AroundTagItemVO](#aroundtagitemvo) > array|


<a name="aroundflowvo"></a>
### AroundFlowVO

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|瀑布流数据  <br>**样例** : `"[1d4327fb5fa0771eed51f1097d8b9537](#1d4327fb5fa0771eed51f1097d8b9537)"`|[MicroPagerWrap«List«IndexFlowItemVo»»](#1d4327fb5fa0771eed51f1097d8b9537)|
|**flowTag**  <br>*可选*|瀑布流选择标签（周边游频道使用）  <br>**样例** : `"[aroundflowtagvo](#aroundflowtagvo)"`|[AroundFlowTagVO](#aroundflowtagvo)|
|**inboundFlowTags**  <br>*可选*|瀑布流标签（国内游/出境游频道使用）,page为1的时候返回  <br>**样例** : `"[3c01af109ffe3f801ebf6edda8a4f489](#3c01af109ffe3f801ebf6edda8a4f489)"`|[国内游/出境游瀑布流标签](#3c01af109ffe3f801ebf6edda8a4f489)|
|**qinziTag**  <br>*可选*|亲子游瀑布流标签(亲子游频道使用，没返回就用共用的,里面为空的属性也默认用共用的)  <br>**样例** : `"[childflowtags](#childflowtags)"`|[ChildFlowTags](#childflowtags)|


<a name="aroundhistoryextvo"></a>
### AroundHistoryExtVo

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|当天日期  <br>**样例** : `"string"`|string|
|**tagls**  <br>*可选*|标签  <br>**样例** : `[ "object" ]`|< object > array|


<a name="aroundindexvo"></a>
### AroundIndexVO

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `"string"`|string|
|**date**  <br>*可选*|当天日期  <br>**样例** : `"string"`|string|
|**falsh**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**list**  <br>*可选*|**样例** : `[ "[basehandlervo](#basehandlervo)" ]`|< [BaseHandlerVO](#basehandlervo) > array|


<a name="aroundplatevo"></a>
### AroundPlateVO

|名称|说明|类型|
|---|---|---|
|**plateFirst**  <br>*可选*|第一个板块  <br>**样例** : `"[314e431ed9d44b52e7c7fc814c35401c](#314e431ed9d44b52e7c7fc814c35401c)"`|[广告位](#314e431ed9d44b52e7c7fc814c35401c)|
|**plateList**  <br>*可选*|后续板块  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|


<a name="aroundpopularplayvo"></a>
### AroundPopularPlayVO

|名称|说明|类型|
|---|---|---|
|**isNotNav**  <br>*可选*|是否不显示导航栏，app使用  <br>**样例** : `0`|integer (int32)|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**productList**  <br>*可选*|产品  <br>**样例** : `[ "[c821dd8e1e8fe318546a114f9cda8557](#c821dd8e1e8fe318546a114f9cda8557)" ]`|< [瀑布流-线路或者酒套_1](#c821dd8e1e8fe318546a114f9cda8557) > array|
|**title**  <br>*可选*|标题，例如：人气玩法  <br>**样例** : `"string"`|string|


<a name="aroundtagitemvo"></a>
### AroundTagItemVO

|名称|说明|类型|
|---|---|---|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|


<a name="athleticsindexitemvo"></a>
### AthleticsIndexItemVo

|名称|说明|类型|
|---|---|---|
|**datetime**  <br>*可选*|天时间  <br>**样例** : `0`|integer (int64)|
|**deadTime**  <br>*可选*|显示时间  <br>**样例** : `0`|integer (int64)|
|**ranks**  <br>*可选*|排名  <br>**样例** : `[ "[athleticsrankitemvo](#athleticsrankitemvo)" ]`|< [AthleticsRankItemVo](#athleticsrankitemvo) > array|
|**self_rank**  <br>*可选*|自己排名  <br>**样例** : `"[athleticsrankitemvo](#athleticsrankitemvo)"`|[AthleticsRankItemVo](#athleticsrankitemvo)|


<a name="athleticsrankitemvo"></a>
### AthleticsRankItemVo

|名称|说明|类型|
|---|---|---|
|**headImage**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**rank**  <br>*可选*|排名  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|双方关注关系  <br>**样例** : `"string"`|string|
|**step_count**  <br>*可选*|步数  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|


<a name="athleticsrankvo"></a>
### AthleticsRankVo

|名称|说明|类型|
|---|---|---|
|**ranks**  <br>*可选*|排名  <br>**样例** : `[ "[athleticsrankitemvo](#athleticsrankitemvo)" ]`|< [AthleticsRankItemVo](#athleticsrankitemvo) > array|
|**self_rank**  <br>*可选*|自己排名  <br>**样例** : `"[athleticsrankitemvo](#athleticsrankitemvo)"`|[AthleticsRankItemVo](#athleticsrankitemvo)|
|**total**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="athleticsselfvo"></a>
### AthleticsSelfVo

|名称|说明|类型|
|---|---|---|
|**avg_step**  <br>*可选*|平均步数  <br>**样例** : `0`|integer (int32)|
|**headImage**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**max_step**  <br>*可选*|最大步数  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**today_step**  <br>*可选*|今日步数  <br>**样例** : `0`|integer (int32)|
|**total_step**  <br>*可选*|总步数  <br>**样例** : `0`|integer (int32)|


<a name="attitudeadbannervo"></a>
### AttitudeAdBannerVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|协议  <br>**样例** : `"string"`|string|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|态度话题id  <br>**样例** : `"string"`|string|


<a name="attitudeoptioninfovo"></a>
### AttitudeOptionInfoVO

|名称|说明|类型|
|---|---|---|
|**choose**  <br>*可选*|true 为已选  <br>**样例** : `true`|boolean|
|**lastVoteUserAvatar**  <br>*可选*|最新投票人头像  <br>**样例** : `"string"`|string|
|**optionColor**  <br>*可选*|1 为红发  2为蓝方  <br>**样例** : `0`|integer (int32)|
|**optionId**  <br>*可选*|选项id  <br>**样例** : `0`|integer (int32)|
|**optionPercent**  <br>*可选*|观点投票所占百分比  <br>**样例** : `"string"`|string|
|**optionUserCount**  <br>*可选*|当前观点投票人数  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="attitudeoptionvo"></a>
### AttitudeOptionVO

|名称|说明|类型|
|---|---|---|
|**optionColor**  <br>*可选*|1 为红发  2为蓝方  <br>**样例** : `0`|integer (int32)|
|**optionId**  <br>*可选*|选项id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="attitudeprisevo"></a>
### AttitudePriseVO

|名称|说明|类型|
|---|---|---|
|**prise**  <br>*可选*|点赞数量  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|true 为已点赞  <br>**样例** : `true`|boolean|


<a name="attitudeusercollectvo"></a>
### AttitudeUserCollectVO

|名称|说明|类型|
|---|---|---|
|**comment**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|观点内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|发表时间  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|观点id  <br>**样例** : `0`|integer (int32)|
|**optionColor**  <br>*可选*|1为红发 2为蓝方  <br>**样例** : `0`|integer (int32)|
|**optionContent**  <br>*可选*|选中的观点内容  <br>**样例** : `"string"`|string|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|true 为已点赞  <br>**样例** : `true`|boolean|
|**talent**  <br>*可选*|1 为达人  <br>**样例** : `0`|integer (int32)|
|**topicId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**topicTitle**  <br>*可选*|话题标题  <br>**样例** : `"string"`|string|
|**topicType**  <br>*可选*|态度话题类型 1pk 2投票  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1 常规 2 经典 3 精彩  <br>**样例** : `0`|integer (int32)|
|**userAvatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|


<a name="attitudeviewpointsinglevo"></a>
### AttitudeViewPointSingleVO

|名称|说明|类型|
|---|---|---|
|**topic**  <br>*可选*|所属态度话题  <br>**样例** : `"[6e55a64bd5b351f9a7afa09c5866577a](#6e55a64bd5b351f9a7afa09c5866577a)"`|[态度话题详情](#6e55a64bd5b351f9a7afa09c5866577a)|
|**type**  <br>*可选*|遇见关注页ui类型  <br>**样例** : `"string"`|string|
|**viewPoint**  <br>*可选*|观点  <br>**样例** : `"[19e755d657a6ee5273ad80af3a938b2c](#19e755d657a6ee5273ad80af3a938b2c)"`|[态度话题观点](#19e755d657a6ee5273ad80af3a938b2c)|


<a name="author"></a>
### Author

|名称|说明|类型|
|---|---|---|
|**headImage**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**isTanlent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**name**  <br>*可选*|作者名称  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|作者id  <br>**样例** : `0`|integer (int32)|


<a name="awardalbums"></a>
### AwardAlbums

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[albumlists](#albumlists)" ]`|< [Albumlists](#albumlists) > array|
|**award_name**  <br>*可选*|奖项名称  <br>**样例** : `"string"`|string|


<a name="bargainremainvo"></a>
### BargainRemainVO

|名称|说明|类型|
|---|---|---|
|**bargainTime**  <br>*可选*|距离砍价开始时间(秒)  <br>**样例** : `0`|integer (int32)|
|**bargainTotal**  <br>*可选*|最高可砍  <br>**样例** : `"string"`|string|
|**msgTitle**  <br>*可选*|砍价提醒弹框文案  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|提醒状态 0 未设置 1 已设置  <br>**样例** : `0`|integer (int32)|
|**statusTitle**  <br>*可选*|提醒状态文案  <br>**样例** : `"string"`|string|


<a name="bargainsharevo"></a>
### BargainShareVo

|名称|说明|类型|
|---|---|---|
|**imgUrl**  <br>*可选*|分享图片  <br>**样例** : `"string"`|string|
|**miniAppId**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**miniUrl**  <br>*可选*|小程序url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|


<a name="basebbsindexvo"></a>
### BaseBbsIndexVO

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|实体类型  <br>**样例** : `0`|integer (int32)|


<a name="basedataitemvo"></a>
### BaseDataItemVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**showSearch**  <br>*可选*|跳webview是否显示右上角搜索按钮  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="basediscovervo"></a>
### BaseDiscoverVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见首图  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `0`|integer (int32)|
|**talent**  <br>*可选*|是否有V标识 1是  0不是  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|遇见类型  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**video**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|


<a name="basehandlervo"></a>
### BaseHandlerVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|1:游记 2:攻略 3：视频 4:摄影作品 5:频道页 6:签证  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="3bb47610c281a7f2281f17c774d8fdcf"></a>
### BaseHandlerVO«Line»

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[line](#line)" ]`|< [Line](#line) > array|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|1:游记 2:攻略 3：视频 4:摄影作品 5:频道页 6:签证  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="12b7e123f8a7596e63273392d43bf5b3"></a>
### BaseHandlerVO«Map«string,object»»

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|1:游记 2:攻略 3：视频 4:摄影作品 5:频道页 6:签证  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="baselistvo"></a>
### BaseListVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `"object"`|object|


<a name="be213280871aede5915764e60485a5b6"></a>
### BaseListVO«List«ProductBasicModel»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[productbasicmodel](#productbasicmodel)" ]`|< [ProductBasicModel](#productbasicmodel) > array|


<a name="basemedalvo"></a>
### BaseMedalVO

|名称|说明|类型|
|---|---|---|
|**getTime**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**getWay**  <br>*可选*|获得方法  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|勋章样式 1 点亮 0 未点亮  <br>**样例** : `0`|integer (int32)|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**medalDesc**  <br>*可选*|勋章描述  <br>**样例** : `"string"`|string|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|晋级勋章展示枚数  <br>**样例** : `0`|integer (int32)|
|**personCount**  <br>*可选*|获得该勋章的人数  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**progressbor**  <br>*可选*|进度条 等级勋章独有  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|勋章类型 1为独立勋章  2为合成勋章 3晋级勋章  <br>**样例** : `0`|integer (int32)|


<a name="batchbean"></a>
### BatchBean

|名称|说明|类型|
|---|---|---|
|**overDate**  <br>*可选*|批次结束日期，例如：6月03日  <br>**样例** : `"string"`|string|
|**overWeekDay**  <br>*可选*|批次结束日期，例如：周五  <br>**样例** : `"string"`|string|
|**startDate**  <br>*可选*|批次开始日期，例如：5月28日  <br>**样例** : `"string"`|string|
|**startWeekDay**  <br>*可选*|批次开始日期，例如：周日  <br>**样例** : `"string"`|string|


<a name="batchcalendarvo"></a>
### BatchCalendarVo

|名称|说明|类型|
|---|---|---|
|**batchPakList**  <br>*可选*|批次套餐列表  <br>**样例** : `[ "[batchpakvo](#batchpakvo)" ]`|< [BatchPakVo](#batchpakvo) > array|
|**batchsDesc**  <br>*可选*|儿童描述说明  <br>**样例** : `"string"`|string|
|**batchsList**  <br>*可选*|所有批次  <br>**样例** : `[ "[productbatchvo](#productbatchvo)" ]`|< [ProductBatchVo](#productbatchvo) > array|
|**batchsPreview**  <br>*可选*|未选中时月份最低价  <br>**样例** : `[ "[batchmonthvo](#batchmonthvo)" ]`|< [BatchMonthVo](#batchmonthvo) > array|
|**calenderEnd**  <br>*可选*|日历结束日期yyyy-MM-dd  <br>**样例** : `"string"`|string|
|**calenderStart**  <br>*可选*|日历开始日期yyyy-MM-dd  <br>**样例** : `"string"`|string|


<a name="batchfeebean"></a>
### BatchFeeBean

|名称|说明|类型|
|---|---|---|
|**fees**  <br>*可选*|套餐中费用列表  <br>**样例** : `[ "[feebean](#feebean)" ]`|< [FeeBean](#feebean) > array|
|**is_require**  <br>*可选*|是否必选一项  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|费用套餐名称  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|文案  <br>**样例** : `"string"`|string|


<a name="batchlistbean"></a>
### BatchListBean

|名称|说明|类型|
|---|---|---|
|**pkg_name**  <br>*可选*|**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="batchmonthvo"></a>
### BatchMonthVo

|名称|说明|类型|
|---|---|---|
|**caleLabel**  <br>*可选*|例如：05月  <br>**样例** : `"string"`|string|
|**caleMonth**  <br>*可选*|例如：2019-05  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|纯数字  <br>**样例** : `0.0`|number|
|**priceLabel**  <br>*可选*|例如：￥6480起  <br>**样例** : `"string"`|string|


<a name="batchpakvo"></a>
### BatchPakVo

|名称|说明|类型|
|---|---|---|
|**batchList**  <br>*可选*|批次  <br>**样例** : `[ "[productbatchvo](#productbatchvo)" ]`|< [ProductBatchVo](#productbatchvo) > array|
|**monthList**  <br>*可选*|月份最低价  <br>**样例** : `[ "[batchmonthvo](#batchmonthvo)" ]`|< [BatchMonthVo](#batchmonthvo) > array|
|**pkgId**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**pkgName**  <br>*可选*|批次套餐名称  <br>**样例** : `"string"`|string|


<a name="batchpkgbean"></a>
### BatchPkgBean

|名称|说明|类型|
|---|---|---|
|**pkg_name**  <br>*可选*|**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="batchslistbean"></a>
### BatchsListBean

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|价格，可能出现：￥10、-1、核算中  <br>**样例** : `"string"`|string|
|**batch**  <br>*可选*|序号，无用  <br>**样例** : `0`|integer (int32)|
|**bid**  <br>*可选*|批次id  <br>**样例** : `0`|integer (int32)|
|**childprice**  <br>*可选*|价格，可能出现：￥10、-1、核算中  <br>**样例** : `"string"`|string|
|**daily_pkg**  <br>*可选*|批次相关的行程套餐  <br>**样例** : `[ "[batchlistbean](#batchlistbean)" ]`|< [BatchListBean](#batchlistbean) > array|
|**diff_num**  <br>*可选*|未设置，废弃  <br>**样例** : `"string"`|string|
|**different**  <br>*可选*|未设置，废弃  <br>**样例** : `0`|integer (int32)|
|**is_over**  <br>*可选*|未设置，废弃  <br>**样例** : `0`|integer (int32)|
|**limit_max**  <br>*可选*|未设置，废弃  <br>**样例** : `0`|integer (int32)|
|**overtime**  <br>*可选*|批次结束  <br>**样例** : `0`|integer (int64)|
|**parent_bid**  <br>*可选*|未设置，废弃  <br>**样例** : `0`|integer (int32)|
|**people_count**  <br>*可选*|未设置，废弃  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**pkg_name**  <br>*可选*|未设置，废弃  <br>**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**prepayTip**  <br>*可选*|例如：预付  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|最小价格  <br>**样例** : `0.0`|number|
|**price_label**  <br>*可选*|最小价格展示，可能出现：￥10、-1、核算中  <br>**样例** : `"string"`|string|
|**price_status**  <br>*可选*|价格状态1、已核算2、核算中3、请电询  <br>**样例** : `"string"`|string|
|**saleAdultprice**  <br>*可选*|优惠后成人价  <br>**样例** : `"string"`|string|
|**saleChildprice**  <br>*可选*|优惠后儿童价  <br>**样例** : `"string"`|string|
|**saleTip**  <br>*可选*|左上角文案：惠  <br>**样例** : `"string"`|string|
|**serial_code**  <br>*可选*|批次号，无用  <br>**样例** : `"string"`|string|
|**starttime**  <br>*可选*|批次开始时间  <br>**样例** : `0`|integer (int64)|
|**status**  <br>*可选*|当前批次状态1、可报名２、名额暂满３、已报满  <br>**样例** : `"string"`|string|
|**status_label**  <br>*可选*|status_title + status_remark  <br>**样例** : `"string"`|string|
|**status_remark**  <br>*可选*|例如：名额紧张  <br>**样例** : `"string"`|string|
|**status_title**  <br>*可选*|例如：可报名  <br>**样例** : `"string"`|string|


<a name="bbspagevo"></a>
### BbsPageVO

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|广告图片  <br>**样例** : `[ "[slideimagesvo](#slideimagesvo)" ]`|< [SlideImagesVO](#slideimagesvo) > array|
|**common**  <br>*可选*|摄影作品、攻略，游记集合  <br>**样例** : `[ "[basebbsindexvo](#basebbsindexvo)" ]`|< [BaseBbsIndexVO](#basebbsindexvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**weekTop**  <br>*可选*|周魁  <br>**样例** : `[ "[travelarticlesvo](#travelarticlesvo)" ]`|< [TravelarticlesVo](#travelarticlesvo) > array|


<a name="bdlocationbean"></a>
### BdLocationBean

|名称|说明|类型|
|---|---|---|
|**lat**  <br>*可选*|经度  <br>**样例** : `0.0`|number (double)|
|**lng**  <br>*可选*|纬度  <br>**样例** : `0.0`|number (double)|


<a name="billboardvo"></a>
### BillBoardVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|方图  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|h5地址  <br>**样例** : `"string"`|string|
|**timeLabel**  <br>*可选*|时间范围  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="cnchanneltopproduct"></a>
### CNChannelTopProduct

|名称|说明|类型|
|---|---|---|
|**more**  <br>*可选*|是否展示更多:true 展示  <br>**样例** : `true`|boolean|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**topProduct**  <br>*可选*|人气尖货  <br>**样例** : `[ "[c821dd8e1e8fe318546a114f9cda8557](#c821dd8e1e8fe318546a114f9cda8557)" ]`|< [瀑布流-线路或者酒套_1](#c821dd8e1e8fe318546a114f9cda8557) > array|


<a name="cancelreasonvo"></a>
### CancelReasonVo

|名称|说明|类型|
|---|---|---|
|**reasonId**  <br>*可选*|取消原因id  <br>**样例** : `0`|integer (int32)|
|**reasonValue**  <br>*可选*|取消原因  <br>**样例** : `"string"`|string|


<a name="cardbean"></a>
### CardBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|权益卡金额  <br>**样例** : `0.0`|number|
|**cardName**  <br>*可选*|权益卡名称  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|权益卡规则说明跳转链接  <br>**样例** : `"string"`|string|


<a name="carduseritemvo"></a>
### CardUserItemVO

|名称|说明|类型|
|---|---|---|
|**alreadyHave**  <br>*可选*|是否已经有权益卡，1已有（展示已购卡样式），0未有（展示立即购卡样式）  <br>**样例** : `0`|integer (int32)|
|**cardName**  <br>*可选*|权益卡名称  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|权益卡图片  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|权益卡简介  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转链接  <br>**样例** : `"string"`|string|


<a name="carduserlistvo"></a>
### CardUserListVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|权益卡列表  <br>**样例** : `[ "[carduseritemvo](#carduseritemvo)" ]`|< [CardUserItemVO](#carduseritemvo) > array|


<a name="categoryvo"></a>
### CategoryVO

|名称|说明|类型|
|---|---|---|
|**more_url**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**themeName**  <br>*可选*|主题名称  <br>**样例** : `"string"`|string|
|**theme_id**  <br>*可选*|主题id  <br>**样例** : `0`|integer (int32)|


<a name="categorysvo"></a>
### CategorysVO

|名称|说明|类型|
|---|---|---|
|**themes**  <br>*可选*|分类列表  <br>**样例** : `[ "[categoryvo](#categoryvo)" ]`|< [CategoryVO](#categoryvo) > array|


<a name="certificationapplyresulttypevo"></a>
### CertificationApplyResultTypeVO

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|1为未申请 2为获得了此类认证 3为提交申请过该认证  <br>**样例** : `0`|integer (int32)|


<a name="certificationintroductionvo"></a>
### CertificationIntroductionVO

|名称|说明|类型|
|---|---|---|
|**attachCondition**  <br>*可选*|是否满足申请条件  <br>**样例** : `true`|boolean|
|**condition**  <br>*可选*|申请条件  <br>**样例** : `"string"`|string|
|**hasAvatar**  <br>*可选*|是否拥有头像  <br>**样例** : `true`|boolean|


<a name="certificationmodel"></a>
### CertificationModel

|名称|说明|类型|
|---|---|---|
|**certTitle**  <br>*可选*|头衔  <br>**样例** : `"string"`|string|
|**certType**  <br>*可选*|头衔type  <br>**样例** : `"string"`|string|


<a name="certificationvo"></a>
### CertificationVO

|名称|说明|类型|
|---|---|---|
|**certTitle**  <br>*可选*|头衔  <br>**样例** : `"string"`|string|
|**certType**  <br>*可选*|头衔对应id  <br>**样例** : `"string"`|string|


<a name="channeladsvo"></a>
### ChannelAdsVo

|名称|说明|类型|
|---|---|---|
|**items**  <br>*可选*|图片超链接  <br>**样例** : `[ "[productimagesvo](#productimagesvo)" ]`|< [ProductImagesVo](#productimagesvo) > array|
|**title**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|


<a name="channelfilterdetailvo"></a>
### ChannelFilterDetailVo

|名称|说明|类型|
|---|---|---|
|**alias**  <br>*可选*|排序类型  <br>**样例** : `"string"`|string|
|**items**  <br>*可选*|动态数据  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**name**  <br>*可选*|排序提示语  <br>**样例** : `"string"`|string|


<a name="channelidandnamevo"></a>
### ChannelIdAndNameVO

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="channelrecommenddetailvo"></a>
### ChannelRecommendDetailVo

|名称|说明|类型|
|---|---|---|
|**product**  <br>*可选*|产品线路  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**title**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|


<a name="channelrecommendlistvo"></a>
### ChannelRecommendListVo

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `[ "[channelrecommenddetailvo](#channelrecommenddetailvo)" ]`|< [ChannelRecommendDetailVo](#channelrecommenddetailvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="channelsharevo"></a>
### ChannelShareVO

|名称|说明|类型|
|---|---|---|
|**closeShare**  <br>*可选*|关闭分享，1关闭  <br>**样例** : `0`|integer (int32)|
|**miniAppCover**  <br>*可选*|小程序分享封面  <br>**样例** : `"string"`|string|
|**miniAppId**  <br>*可选*|小程序id（用来判断是否小程序分享）  <br>**样例** : `"string"`|string|
|**miniAppUrl**  <br>*可选*|小程序分享url  <br>**样例** : `"string"`|string|
|**shareCover**  <br>*可选*|分享图（非小程序分享）  <br>**样例** : `"string"`|string|
|**shareRemark**  <br>*可选*|分享描述  <br>**样例** : `"string"`|string|
|**shareTitle**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|分享url（非小程序分享）  <br>**样例** : `"string"`|string|


<a name="channelvo"></a>
### ChannelVo

|名称|说明|类型|
|---|---|---|
|**ads**  <br>*可选*|当季热门目的地  <br>**样例** : `"[channeladsvo](#channeladsvo)"`|[ChannelAdsVo](#channeladsvo)|
|**channel_tag**  <br>*可选*|户外游标签  <br>**样例** : `[ "[producttagsvo](#producttagsvo)" ]`|< [ProductTagsVo](#producttagsvo) > array|
|**filters**  <br>*可选*|筛选条件  <br>**样例** : `{<br>  "string" : "[channelfilterdetailvo](#channelfilterdetailvo)"<br>}`|< string, [ChannelFilterDetailVo](#channelfilterdetailvo) > map|
|**flashes**  <br>*可选*|幻灯片  <br>**样例** : `[ "[productimagesvo](#productimagesvo)" ]`|< [ProductImagesVo](#productimagesvo) > array|
|**tags**  <br>*可选*|tab标签  <br>**样例** : `[ "[producttagsvo](#producttagsvo)" ]`|< [ProductTagsVo](#producttagsvo) > array|


<a name="checkincalendarvo"></a>
### CheckinCalendarVO

|名称|说明|类型|
|---|---|---|
|**checkinStatus**  <br>*可选*|签到状态 0未签到，1签到  <br>**样例** : `0`|integer (int32)|
|**date**  <br>*可选*|日期  <br>**样例** : `"string"`|string|
|**dateTimestamp**  <br>*可选*|日期时间戳  <br>**样例** : `0`|integer (int32)|
|**iconTip**  <br>*可选*|图标文案  <br>**样例** : `"string"`|string|
|**iconType**  <br>*可选*|图标类型 1积分 2礼包 3卡券  <br>**样例** : `0`|integer (int32)|
|**integral**  <br>*可选*|奖励积分  <br>**样例** : `0`|integer (int32)|


<a name="checkinrewardvo"></a>
### CheckinRewardVO

|名称|说明|类型|
|---|---|---|
|**rewardTip**  <br>*可选*|奖励文案  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|奖励类型 0积分，3优惠券  <br>**样例** : `0`|integer (int32)|


<a name="checkinsuccessvo"></a>
### CheckinSuccessVO

|名称|说明|类型|
|---|---|---|
|**checkinRewardVOList**  <br>*可选*|签到奖励  <br>**样例** : `[ "[checkinrewardvo](#checkinrewardvo)" ]`|< [CheckinRewardVO](#checkinrewardvo) > array|
|**dailyMaterialVO**  <br>*可选*|每日图文  <br>**样例** : `"[dailymaterialvo](#dailymaterialvo)"`|[DailyMaterialVO](#dailymaterialvo)|
|**description**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**dest**  <br>*可选*|目的地  <br>**样例** : `"[destcheckinvo](#destcheckinvo)"`|[DestCheckinVO](#destcheckinvo)|
|**punchCount**  <br>*可选*|连续签到天数  <br>**样例** : `0`|integer (int32)|
|**tomorrowDesc**  <br>*可选*|明日签到描述  <br>**样例** : `"string"`|string|
|**userAvatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**userDaysNum**  <br>*可选*|用户注册天数  <br>**样例** : `0`|integer (int32)|
|**userDaysTip**  <br>*可选*|用户注册天数文案  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="checkinvo"></a>
### CheckinVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**birthday**  <br>*可选*|用户生日  <br>**样例** : `"string"`|string|
|**canCheckin**  <br>*可选*|1 代表可以签到  0代表不能签到  <br>**样例** : `0`|integer (int32)|
|**canPush**  <br>*可选*|1 代表可以开启推送开关  0代表不能开启  <br>**样例** : `0`|integer (int32)|
|**checkinDays**  <br>*可选*|签到天数  <br>**样例** : `0`|integer (int32)|
|**checkinRemindTip**  <br>*可选*|签到提示文案  <br>**样例** : `"string"`|string|
|**checkinRule**  <br>*可选*|签到规则文案  <br>**样例** : `"string"`|string|
|**constellation**  <br>*可选*|星座运势  <br>**样例** : `"[4491b0642d391d480f9ee8e6c27c0b7b](#4491b0642d391d480f9ee8e6c27c0b7b)"`|[星座](#4491b0642d391d480f9ee8e6c27c0b7b)|
|**constellationCode**  <br>*可选*|星座code  <br>**样例** : `"string"`|string|
|**constellationName**  <br>*可选*|星座名称  <br>**样例** : `"string"`|string|
|**dailyMaterialList**  <br>*可选*|每日一图  <br>**样例** : `[ "[dailymaterialvo](#dailymaterialvo)" ]`|< [DailyMaterialVO](#dailymaterialvo) > array|
|**dayIntegrals**  <br>*可选*|每天签到对应获取的积分  <br>**样例** : `[ "[dayintegral](#dayintegral)" ]`|< [DayIntegral](#dayintegral) > array|
|**duobao**  <br>*可选*|夺宝活动  <br>**样例** : `[ "[raiseduobaovo](#raiseduobaovo)" ]`|< [RaiseDuobaoVO](#raiseduobaovo) > array|
|**exchangeCoupon**  <br>*可选*|换券活动  <br>**样例** : `[ "[exchangecouponvo](#exchangecouponvo)" ]`|< [ExchangeCouponVO](#exchangecouponvo) > array|
|**exchangeGoods**  <br>*可选*|兑换实物活动  <br>**样例** : `[ "[exchangecouponvo](#exchangecouponvo)" ]`|< [ExchangeCouponVO](#exchangecouponvo) > array|
|**incrIntegral**  <br>*可选*|今日新增积分  <br>**样例** : `0`|integer (int32)|
|**mobileAds**  <br>*可选*|广告位  <br>**样例** : `[ "[8035f39760f39ca3fb4255fb4dfe9233](#8035f39760f39ca3fb4255fb4dfe9233)" ]`|< [广告位_3](#8035f39760f39ca3fb4255fb4dfe9233) > array|
|**rewards**  <br>*可选*|积分任务  <br>**样例** : `"[rewardsetvo](#rewardsetvo)"`|[RewardSetVO](#rewardsetvo)|
|**totalIntegral**  <br>*可选*|总积分数  <br>**样例** : `0`|integer (int32)|


<a name="childflowtags"></a>
### ChildFlowTags

|名称|说明|类型|
|---|---|---|
|**ageTag**  <br>*可选*|适合年龄  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**dayTags**  <br>*可选*|行程天数  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**region**  <br>*可选*|区域  <br>**样例** : `[ "[92688d46a8f27f22d3e47069606bf451](#92688d46a8f27f22d3e47069606bf451)" ]`|< [摄影游瀑布流搜索标签](#92688d46a8f27f22d3e47069606bf451) > array|
|**startDateTags**  <br>*可选*|出行日期  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**themes**  <br>*可选*|亲子主题  <br>**样例** : `[ "[45ac8b33c76f5154a09a4744f39525f5](#45ac8b33c76f5154a09a4744f39525f5)" ]`|< [国内游瀑布流目的地标签](#45ac8b33c76f5154a09a4744f39525f5) > array|


<a name="city"></a>
### City

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|标签id  <br>**样例** : `0`|integer (int64)|


<a name="cityareagroup"></a>
### CityAreaGroup

|名称|说明|类型|
|---|---|---|
|**appGroupCitys**  <br>*可选*|站点列表  <br>**样例** : `[ "[appgroupitem](#appgroupitem)" ]`|< [AppGroupItem](#appgroupitem) > array|
|**title**  <br>*可选*|标题例如：国内  <br>**样例** : `"string"`|string|


<a name="collectvo"></a>
### CollectVO

|名称|说明|类型|
|---|---|---|
|**is_collect**  <br>*可选*|是否收藏  <br>**样例** : `0`|integer (int32)|
|**msg**  <br>*可选*|消息  <br>**样例** : `"string"`|string|


<a name="column"></a>
### Column

|名称|说明|类型|
|---|---|---|
|**columnId**  <br>*可选*|栏目id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|栏目标题  <br>**样例** : `"string"`|string|


<a name="columncontent"></a>
### ColumnContent

|名称|说明|类型|
|---|---|---|
|**columnId**  <br>*可选*|专栏id  <br>**样例** : `0`|integer (int32)|
|**discovers**  <br>*可选*|遇见  <br>**样例** : `[ "[columndiscover](#columndiscover)" ]`|< [ColumnDiscover](#columndiscover) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="columndiscover"></a>
### ColumnDiscover

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**quoteId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1为视频  <br>**样例** : `0`|integer (int32)|


<a name="columnmedalvo"></a>
### ColumnMedalVO

|名称|说明|类型|
|---|---|---|
|**medals**  <br>*可选*|主题下勋章  <br>**样例** : `[ "[basemedalvo](#basemedalvo)" ]`|< [BaseMedalVO](#basemedalvo) > array|
|**num**  <br>*可选*|主题下获得的勋章枚数  <br>**样例** : `0`|integer (int32)|
|**themeName**  <br>*可选*|主题名称  <br>**样例** : `"string"`|string|


<a name="commentdetailvo"></a>
### CommentDetailVO

|名称|说明|类型|
|---|---|---|
|**commentId**  <br>*可选*|签证评价编号  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间-时间戳  <br>**样例** : `0`|integer (int64)|
|**createTimeAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**rank**  <br>*可选*|评级  <br>**样例** : `0`|integer (int32)|


<a name="comments"></a>
### Comments

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**comment_id**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**comment_image**  <br>*可选*|评论图片  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**from**  <br>*可选*|评论人  <br>**样例** : `"[from](#from)"`|[From](#from)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int64)|
|**image_sizeInfo**  <br>*可选*|图片信息  <br>**样例** : `"[imagesizeinfo](#imagesizeinfo)"`|[ImageSizeInfo](#imagesizeinfo)|
|**thumbs**  <br>*可选*|作品数  <br>**样例** : `0`|integer (int32)|
|**to**  <br>*可选*|被评论人  <br>**样例** : `"[from](#from)"`|[From](#from)|


<a name="commentslist"></a>
### Commentslist

|名称|说明|类型|
|---|---|---|
|**comments**  <br>*可选*|评论列表  <br>**样例** : `[ "[comments](#comments)" ]`|< [Comments](#comments) > array|
|**current_page**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|记录总数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="communitylevelrespvo"></a>
### CommunityLevelRespVo

|名称|说明|类型|
|---|---|---|
|**allLevels**  <br>*可选*|所有等级  <br>**样例** : `[ "[levelrespvo](#levelrespvo)" ]`|< [LevelRespVo](#levelrespvo) > array|
|**curLevel**  <br>*可选*|当前等级  <br>**样例** : `"[levelrespvo](#levelrespvo)"`|[LevelRespVo](#levelrespvo)|
|**incrExp**  <br>*可选*|今日新增经验值  <br>**样例** : `0`|integer (int32)|


<a name="communitylevelrespvo_1"></a>
### CommunityLevelRespVo_1

|名称|说明|类型|
|---|---|---|
|**allLevels**  <br>*可选*|所有等级  <br>**样例** : `[ "[levelrespvo_1](#levelrespvo_1)" ]`|< [LevelRespVo_1](#levelrespvo_1) > array|
|**curLevel**  <br>*可选*|当前等级  <br>**样例** : `"[levelrespvo_1](#levelrespvo_1)"`|[LevelRespVo_1](#levelrespvo_1)|


<a name="competition"></a>
### Competition

|名称|说明|类型|
|---|---|---|
|**album_count**  <br>*可选*|参赛id  <br>**样例** : `0`|integer (int32)|
|**competition_id**  <br>*可选*|参赛id  <br>**样例** : `0`|integer (int32)|
|**competition_status**  <br>*可选*|参赛id  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|封面id  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|详情  <br>**样例** : `"string"`|string|
|**is_px**  <br>*可选*|是否参加评选  <br>**样例** : `0`|integer (int32)|
|**left_days**  <br>*可选*|剩余天数  <br>**样例** : `0`|integer (int32)|
|**subtitle**  <br>*可选*|子标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="competitionaward"></a>
### CompetitionAward

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[albumhot](#albumhot)" ]`|< [AlbumHot](#albumhot) > array|
|**award_albums**  <br>*可选*|获奖作品列表  <br>**样例** : `[ "[awardalbums](#awardalbums)" ]`|< [AwardAlbums](#awardalbums) > array|
|**competition**  <br>*可选*|比赛信息  <br>**样例** : `"[competition](#competition)"`|[Competition](#competition)|
|**share_url**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="competitiondetailvo"></a>
### CompetitionDetailVO

|名称|说明|类型|
|---|---|---|
|**albumList**  <br>*可选*|作品  <br>**样例** : `[ "[albumvo](#albumvo)" ]`|< [AlbumVO](#albumvo) > array|
|**albumTag**  <br>*可选*|作品类型筛选标签  <br>**样例** : `[ "[f9b05da97d8da8dff2197439527682cd](#f9b05da97d8da8dff2197439527682cd)" ]`|< [选择标签](#f9b05da97d8da8dff2197439527682cd) > array|
|**albums**  <br>*可选*|赛事图片数  <br>**样例** : `"string"`|string|
|**appSharePic**  <br>*可选*|微信分享方图  <br>**样例** : `"string"`|string|
|**competitionDesc**  <br>*可选*|赛事介绍  <br>**样例** : `"string"`|string|
|**competitionId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**competitionIntro**  <br>*可选*|赛事简介  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|详情页封面图  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|奖品简介说明  <br>**样例** : `"string"`|string|
|**disclaimer**  <br>*可选*|免责声明 true为开启  <br>**样例** : `true`|boolean|
|**disclaimerContent**  <br>*可选*|免责声明内容  <br>**样例** : `"string"`|string|
|**levyOverDate**  <br>*可选*|征稿结束时间  <br>**样例** : `0`|integer (int32)|
|**levyStartDate**  <br>*可选*|征稿起始时间  <br>**样例** : `0`|integer (int32)|
|**pxOverDate**  <br>*可选*|评选结束时间  <br>**样例** : `0`|integer (int32)|
|**shareUrl**  <br>*可选*|分享链接  <br>**样例** : `"string"`|string|
|**sortTag**  <br>*可选*|排序标签  <br>**样例** : `[ "[f9b05da97d8da8dff2197439527682cd](#f9b05da97d8da8dff2197439527682cd)" ]`|< [选择标签](#f9b05da97d8da8dff2197439527682cd) > array|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**time**  <br>*可选*|赛事状态对应时间显示  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|赛事标题  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|赛事状态 1 征稿中 2投票中 3评选中 4未开始 5已结束  <br>**样例** : `0`|integer (int32)|
|**voteOverDate**  <br>*可选*|投票结束时间  <br>**样例** : `0`|integer (int32)|


<a name="competitiongroupvo"></a>
### CompetitionGroupVO

|名称|说明|类型|
|---|---|---|
|**defaultStatus**  <br>*可选*|选择方式  1 默认 0 自选  <br>**样例** : `0`|integer (int32)|
|**groupId**  <br>*可选*|分组id  <br>**样例** : `0`|integer (int32)|
|**groupName**  <br>*可选*|分组名称  <br>**样例** : `"string"`|string|


<a name="competitioninfovo"></a>
### CompetitionInfoVO

|名称|说明|类型|
|---|---|---|
|**competition_id**  <br>*可选*|比赛id  <br>**样例** : `0`|integer (int32)|
|**competition_name**  <br>*可选*|比赛名称  <br>**样例** : `"string"`|string|
|**groupId**  <br>*可选*|赛事组id  <br>**样例** : `0`|integer (int32)|
|**groupName**  <br>*可选*|赛事组名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|赛事状态 1 征稿中 2投票中 3评选中 4未开始 5已结束  <br>**样例** : `0`|integer (int32)|


<a name="competitionrewardvo"></a>
### CompetitionRewardVO

|名称|说明|类型|
|---|---|---|
|**cid**  <br>*可选*|赛事id  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|奖项  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|赛事名  <br>**样例** : `"string"`|string|


<a name="competitionsbean"></a>
### CompetitionsBean

|名称|说明|类型|
|---|---|---|
|**competition_id**  <br>*可选*|参数id  <br>**样例** : `0`|integer (int32)|
|**competition_status**  <br>*可选*|比赛状态  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**left_days**  <br>*可选*|剩余天数  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="competitonbeanvo"></a>
### CompetitonBeanVO

|名称|说明|类型|
|---|---|---|
|**competition_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**groups**  <br>*可选*|组别信息  <br>**样例** : `[ "[competitiongroupvo](#competitiongroupvo)" ]`|< [CompetitionGroupVO](#competitiongroupvo) > array|
|**subtitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="configvo"></a>
### ConfigVo

|名称|说明|类型|
|---|---|---|
|**aboutus_url**  <br>*可选*|关于url  <br>**样例** : `"string"`|string|
|**app_version**  <br>*可选*|app版本信息  <br>**样例** : `"object"`|object|
|**colorRegisterTip**  <br>*可选*|变色文案  <br>**样例** : `"string"`|string|
|**community_destination_max**  <br>*可选*|社区目的地最大数  <br>**样例** : `0`|integer (int32)|
|**community_photo_max**  <br>*可选*|社区照片最大数  <br>**样例** : `0`|integer (int32)|
|**community_publish_tip**  <br>*可选*|社区发布提醒  <br>**样例** : `"string"`|string|
|**coupon_help_url**  <br>*可选*|代金券帮助url  <br>**样例** : `"string"`|string|
|**coupon_img_url**  <br>*可选*|代金券图片url  <br>**样例** : `"string"`|string|
|**deductionUrl**  <br>*可选*|抵扣说明url  <br>**样例** : `"string"`|string|
|**discoverDefaultSearchList**  <br>*可选*|遇见搜索框配置  <br>**样例** : `[ "[discoverdefaultsearchvo](#discoverdefaultsearchvo)" ]`|< [DiscoverDefaultSearchVO](#discoverdefaultsearchvo) > array|
|**discoverGuideUrl**  <br>*可选*|遇见发布引导帮助页url  <br>**样例** : `"string"`|string|
|**discover_photo_max_size**  <br>*可选*|遇见图片最大兆数  <br>**样例** : `0`|integer (int32)|
|**first_aid_card_menu**  <br>*可选*|医疗急救卡菜单  <br>**样例** : `"object"`|object|
|**floatings**  <br>*可选*|浮动广告配置  <br>**样例** : `[ "[floatingadvo](#floatingadvo)" ]`|< [FloatingAdVo](#floatingadvo) > array|
|**guideAgain**  <br>*可选*|后端控制是否每次重新打开app时进行一键注册页面引导（只有判断用户预取号成功，能进行一键注册时才引导），1打开  <br>**样例** : `0`|integer (int32)|
|**image_max_tags**  <br>*可选*|图标最大标签数  <br>**样例** : `0`|integer (int32)|
|**indexRegisterTip**  <br>*可选*|底部注册提示语：新用户注册领388元大礼包  <br>**样例** : `"string"`|string|
|**index_ad**  <br>*可选*|启动图广告  <br>**样例** : `"object"`|object|
|**is_login**  <br>*可选*|是否已登陆  <br>**样例** : `0`|integer (int32)|
|**licence_url**  <br>*可选*|软件许可使用协议url  <br>**样例** : `"string"`|string|
|**maxRecordingDuration**  <br>*可选*|遇见录音限制时长 单位秒  <br>**样例** : `0`|integer (int32)|
|**memberTip**  <br>*可选*|出行人温馨提示  <br>**样例** : `"string"`|string|
|**messageImageUrl**  <br>*可选*|消息推送提示图片  <br>**样例** : `"string"`|string|
|**mini_app_id**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**openStatementVersion**  <br>*可选*|申明版本  <br>**样例** : `"string"`|string|
|**order_agree_url**  <br>*可选*|合同url  <br>**样例** : `"string"`|string|
|**personalInformationListUrl**  <br>*可选*|用户信息清单页面路径  <br>**样例** : `"string"`|string|
|**privacyUrl**  <br>*可选*|隐私协议url  <br>**样例** : `"string"`|string|
|**qrcode_domain**  <br>*可选*|域名信息  <br>**样例** : `[ "string" ]`|< string > array|
|**reg_agree_url**  <br>*可选*|注册条款url  <br>**样例** : `"string"`|string|
|**registerImageUrl**  <br>*可选*|注册提示图片  <br>**样例** : `"string"`|string|
|**registerTip**  <br>*可选*|注册提示语  <br>**样例** : `"string"`|string|
|**sdkListUrl**  <br>*可选*|sdk列表页面路径  <br>**样例** : `"string"`|string|
|**service_time**  <br>*可选*|服务时间  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|app介绍url  <br>**样例** : `"string"`|string|
|**shop_address**  <br>*可选*|收货地址菜单  <br>**样例** : `"object"`|object|
|**shop_cart**  <br>*可选*|集市购物车菜单  <br>**样例** : `"object"`|object|
|**shop_menu**  <br>*可选*|集市菜单  <br>**样例** : `"object"`|object|
|**showRegBanner**  <br>*可选*|是否显示注册横幅 1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**showRegPopup**  <br>*可选*|是否显示注册弹窗 1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**showreg**  <br>*可选*|是否打开注册：1打开，0关闭  <br>**样例** : `0`|integer (int32)|
|**startup**  <br>*可选*|启动图  <br>**样例** : `"object"`|object|
|**uploadPhotoMaxHeight**  <br>*可选*|上传图片的最大高度  <br>**样例** : `0`|integer (int32)|
|**uploadPhotoMaxSize**  <br>*可选*|上传图片的最大尺寸  <br>**样例** : `0`|integer (int32)|
|**uploadPhotoMaxWidth**  <br>*可选*|上传图片的最大宽带  <br>**样例** : `0`|integer (int32)|
|**video_max_size**  <br>*可选*|视频最大容量  <br>**样例** : `0`|integer (int32)|
|**video_max_time**  <br>*可选*|视频最大时长  <br>**样例** : `0`|integer (int32)|
|**wechatMPUrl**  <br>*可选*|微信服务号地址  <br>**样例** : `"string"`|string|
|**winningRecord**  <br>*可选*|中奖记录  <br>**样例** : `"object"`|object|


<a name="conpoundmedaldetail"></a>
### ConpoundMedalDetail

|名称|说明|类型|
|---|---|---|
|**conditionDesc**  <br>*可选*|获得条件限制说明  <br>**样例** : `"string"`|string|
|**getTime**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**getWay**  <br>*可选*|获得方法  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|勋章样式 1 点亮 0 未点亮  <br>**样例** : `0`|integer (int32)|
|**getedDesc**  <br>*可选*|获得后说明  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**medalCategory**  <br>*可选*|勋章品类: 1为活动 2为社区  <br>**样例** : `0`|integer (int32)|
|**medalDesc**  <br>*可选*|勋章描述  <br>**样例** : `"string"`|string|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**needCount**  <br>*可选*|合成需要数量  <br>**样例** : `0`|integer (int32)|
|**personCount**  <br>*可选*|获得该勋章的人数  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**redirectTarget**  <br>*可选*|跳转目标，只有是勋章品类为社区时才有  <br>**样例** : `"string"`|string|
|**redirectTargetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|勋章类型 1为独立勋章  2为合成勋章 3晋级勋章  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="conpoundmedaldetailvo"></a>
### ConpoundMedalDetailVO

|名称|说明|类型|
|---|---|---|
|**conpoundMedals**  <br>*可选*|合成勋章  <br>**样例** : `[ "[conpoundmedaldetail](#conpoundmedaldetail)" ]`|< [ConpoundMedalDetail](#conpoundmedaldetail) > array|
|**count**  <br>*可选*|已获得独立勋章的个数  <br>**样例** : `0`|integer (int32)|
|**singleMedals**  <br>*可选*|独立勋章  <br>**样例** : `[ "[singlemedaldetailvo](#singlemedaldetailvo)" ]`|< [SingleMedalDetailVO](#singlemedaldetailvo) > array|


<a name="constellationdetailvo"></a>
### ConstellationDetailVO

|名称|说明|类型|
|---|---|---|
|**constellation**  <br>*可选*|星座  <br>**样例** : `"[4491b0642d391d480f9ee8e6c27c0b7b](#4491b0642d391d480f9ee8e6c27c0b7b)"`|[星座](#4491b0642d391d480f9ee8e6c27c0b7b)|
|**discover**  <br>*可选*|遇见  <br>**样例** : `[ "[constellationstreamdiscovervo](#constellationstreamdiscovervo)" ]`|< [ConstellationStreamDiscoverVO](#constellationstreamdiscovervo) > array|
|**totalCount**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="constellationmddvo"></a>
### ConstellationMddVO

|名称|说明|类型|
|---|---|---|
|**mddDesc**  <br>*可选*|目的地描述  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="constellationstreamdiscovervo"></a>
### ConstellationStreamDiscoverVO

|名称|说明|类型|
|---|---|---|
|**activityType**  <br>*可选*|0:普通，1：营销活动，2：推广  <br>**样例** : `0`|integer (int32)|
|**address**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discuss**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**firstImg**  <br>*可选*|遇见首图  <br>**样例** : `"[imagevo](#imagevo)"`|[ImageVO](#imagevo)|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|点数赞  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quoteId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**targetUrl**  <br>*可选*|协议跳转地址  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|


<a name="consumptioninterest"></a>
### ConsumptionInterest

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|权益说明  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|0 未获得   1获得  <br>**样例** : `0`|integer (int32)|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**serviceObject**  <br>*可选*|服务对象  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|权益名称  <br>**样例** : `"string"`|string|


<a name="contactsearchvo"></a>
### ContactSearchVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|出生城市  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**isin**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|出生省份  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真实姓名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagsitemvo](#tagsitemvo)" ]`|< [TagsItemVO](#tagsitemvo) > array|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|


<a name="contactvo"></a>
### ContactVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**blockname**  <br>*可选*|板块名称  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|出生城市  <br>**样例** : `"string"`|string|
|**contactsname**  <br>*可选*|联系人姓名  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**mobile**  <br>*可选*|手机  <br>**样例** : `"string"`|string|
|**province**  <br>*可选*|出生省份  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真实姓名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagsitemvo](#tagsitemvo)" ]`|< [TagsItemVO](#tagsitemvo) > array|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|


<a name="contentcountresponsevo"></a>
### ContentCountResponseVo

|名称|说明|类型|
|---|---|---|
|**imageCount**  <br>*可选*|图片数  <br>**样例** : `0`|integer (int32)|
|**mvCount**  <br>*可选*|视频数  <br>**样例** : `0`|integer (int32)|
|**wordCount**  <br>*可选*|文字数量  <br>**样例** : `0`|integer (int32)|


<a name="contentfiltervo"></a>
### ContentFilterVO

|名称|说明|类型|
|---|---|---|
|**filterInfos**  <br>*可选*|**样例** : `[ "[filterinfo](#filterinfo)" ]`|< [FilterInfo](#filterinfo) > array|
|**tip**  <br>*可选*|提示  <br>**样例** : `"string"`|string|


<a name="contractbean"></a>
### ContractBean

|名称|说明|类型|
|---|---|---|
|**openType**  <br>*可选*|打开方式: 0-app内部；1-外部  <br>**样例** : `0`|integer (int32)|
|**pdfName**  <br>*可选*|pdf名称  <br>**样例** : `"string"`|string|
|**readStatus**  <br>*可选*|状态：1-已读；0-未读  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型：1-合同；2-行程单;3-退订政策  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|链接  <br>**样例** : `"string"`|string|
|**urlTitle**  <br>*可选*|链接文案  <br>**样例** : `"string"`|string|
|**urlType**  <br>*可选*|url类型：1-h5;2-pdf;  <br>**样例** : `0`|integer (int32)|


<a name="copyright"></a>
### Copyright

|名称|说明|类型|
|---|---|---|
|**copyright_id**  <br>*可选*|版权id  <br>**样例** : `0`|integer (int32)|
|**copyright_name**  <br>*可选*|版权名称  <br>**样例** : `"string"`|string|


<a name="copyrightvo"></a>
### CopyrightVO

|名称|说明|类型|
|---|---|---|
|**copyright_content**  <br>*可选*|版权内容  <br>**样例** : `"string"`|string|
|**copyright_desc**  <br>*可选*|版权描述  <br>**样例** : `"string"`|string|
|**copyright_id**  <br>*可选*|版权id  <br>**样例** : `0`|integer (int32)|
|**copyright_name**  <br>*可选*|版权名称  <br>**样例** : `"string"`|string|


<a name="copyrightsvo"></a>
### CopyrightsVO

|名称|说明|类型|
|---|---|---|
|**copyright_list**  <br>*可选*|版权列表  <br>**样例** : `[ "[copyrightvo](#copyrightvo)" ]`|< [CopyrightVO](#copyrightvo) > array|


<a name="countdowntaskdetailvo"></a>
### CountdownTaskDetailVO

|名称|说明|类型|
|---|---|---|
|**androidUrl**  <br>*可选*|安卓url  <br>**样例** : `"string"`|string|
|**h5Url**  <br>*可选*|h5 url  <br>**样例** : `"string"`|string|
|**iosUrl**  <br>*可选*|ios url  <br>**样例** : `"string"`|string|
|**taskCode**  <br>*可选*|任务编码  <br>**样例** : `"string"`|string|
|**taskIcon**  <br>*可选*|定时器图标  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**taskName**  <br>*可选*|任务名称  <br>**样例** : `"string"`|string|
|**timer**  <br>*可选*|倒计时时长，单位秒  <br>**样例** : `0`|integer (int32)|


<a name="couponbean"></a>
### CouponBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**codeid**  <br>*可选*|优惠券id  <br>**样例** : `0`|integer (int32)|


<a name="couponbean_1"></a>
### CouponBean_1

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**codeid**  <br>*可选*|优惠券id  <br>**样例** : `0`|integer (int32)|


<a name="couponproductinfovo"></a>
### CouponProductInfoVO

|名称|说明|类型|
|---|---|---|
|**category**  <br>*可选*|使用品类1：线路；2：签证；3：门票；4：体育赛事  <br>**样例** : `0`|integer (int32)|
|**classTypeList**  <br>*可选*|活动类型筛选  <br>**样例** : `[ "[optionvo](#optionvo)" ]`|< [OptionVO](#optionvo) > array|
|**dayList**  <br>*可选*|行程天数  <br>**样例** : `[ "[optionvo](#optionvo)" ]`|< [OptionVO](#optionvo) > array|
|**exp**  <br>*可选*|过期时间  <br>**样例** : `0`|integer (int64)|
|**isShowScreen**  <br>*可选*|是否显示筛选 1：显示 0：不显示  <br>**样例** : `0`|integer (int32)|
|**minAmount**  <br>*可选*|满减金额  <br>**样例** : `0.0`|number|
|**orderList**  <br>*可选*|排序  <br>**样例** : `[ "[optionvo](#optionvo)" ]`|< [OptionVO](#optionvo) > array|
|**systemTime**  <br>*可选*|系统时间  <br>**样例** : `0`|integer (int64)|


<a name="couponproductlistrq"></a>
### CouponProductListRQ

|名称|说明|类型|
|---|---|---|
|**codeid**  <br>*可选*|用户代金券id，youxk_orders_coupons_codes的id，和couponId二传一  <br>**样例** : `0`|integer (int32)|
|**couponId**  <br>*可选*|代金券id， youxk_orders_coupons的id，和codeid二传一  <br>**样例** : `0`|integer (int32)|
|**day**  <br>*可选*|行程天数 多个用逗号分割 如 1,2,3  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|价格排序 1：升序  2:降序  3：销量优先  <br>**样例** : `0`|integer (int32)|
|**page**  <br>*可选*|分页  <br>**样例** : `0`|integer (int32)|
|**sitecode**  <br>*可选*|定位分站  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 如: 全部 跟团游 当地玩乐 自由行 大型活动 体育赛事 分享会   9999 为自定义签证类型  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="couponproductsalevo"></a>
### CouponProductSaleVO

|名称|说明|类型|
|---|---|---|
|**detailRemark**  <br>*可选*|详细优惠信息，例如：最高砍200  <br>**样例** : `"string"`|string|
|**shortRemark**  <br>*可选*|简略优惠信息，例如：砍价  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|优惠类型1、早鸟优惠 2、满减优惠 3、领卷优惠 4、下单送券 5、限时特惠 6、砍价优惠  <br>**样例** : `0`|integer (int32)|


<a name="couponproductvo"></a>
### CouponProductVO

|名称|说明|类型|
|---|---|---|
|**cheapType**  <br>*可选*|1：限时特惠 2：砍价优惠  <br>**样例** : `0`|integer (int32)|
|**days**  <br>*可选*|活动天数  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**marketingTag**  <br>*可选*|营销活动标签（图片链接）  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万已报名/1.1万已售  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格不带￥和起，可能出现免费或核算中  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**saleOne**  <br>*可选*|限时特惠/砍价优惠  <br>**样例** : `"[couponproductsalevo](#couponproductsalevo)"`|[CouponProductSaleVO](#couponproductsalevo)|
|**saleOtherList**  <br>*可选*|其他优惠列表  <br>**样例** : `[ "[couponproductsalevo](#couponproductsalevo)" ]`|< [CouponProductSaleVO](#couponproductsalevo) > array|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**typetwoOrCat**  <br>*可选*|二级活动类型/活动性质，分享会没值  <br>**样例** : `"string"`|string|


<a name="couponsharevo"></a>
### CouponShareVO

|名称|说明|类型|
|---|---|---|
|**fissionList**  <br>*可选*|裂变券集合(为空时说明不参与)  <br>**样例** : `[ "[couponsfissionvo](#couponsfissionvo)" ]`|< [CouponsFissionVO](#couponsfissionvo) > array|
|**imgUrl**  <br>*可选*|分享图片  <br>**样例** : `"string"`|string|
|**miniAppId**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**miniUrl**  <br>*可选*|小程序url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|


<a name="couponsfissionvo"></a>
### CouponsFissionVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**endTime**  <br>*可选*|有效期值  <br>**样例** : `"string"`|string|
|**fissionStatus**  <br>*可选*|代金券状态:分享中3 未分享2 分享完成1 抢完0  <br>**样例** : `0`|integer (int32)|
|**helpCount**  <br>*可选*|已经助力人数  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|分享id:用作标识  <br>**样例** : `0`|integer (int32)|
|**minAmount**  <br>*可选*|满减条件  <br>**样例** : `0.0`|number|
|**newRegister**  <br>*可选*|是否新人助力:0不是 1是  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|title  <br>**样例** : `"string"`|string|
|**userNumber**  <br>*可选*|需要助力总数  <br>**样例** : `0`|integer (int32)|


<a name="couponslineslistvo"></a>
### CouponsLinesListVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**category**  <br>*可选*|使用品类1：线路；2：签证；3：门票；4：体育赛事  <br>**样例** : `0`|integer (int32)|
|**categoryColor**  <br>*可选*|使用品类颜色  <br>**样例** : `"string"`|string|
|**categoryName**  <br>*可选*|使用品类文字  <br>**样例** : `"string"`|string|
|**channel**  <br>*可选*|使用渠道：1、任何，2：app,3：网页  <br>**样例** : `0`|integer (int32)|
|**channel_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|cid  <br>**样例** : `0`|integer (int32)|
|**class_region_id**  <br>*可选*|指定区域  <br>**样例** : `0`|integer (int32)|
|**codeid**  <br>*可选*|codeid  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|到期时间  <br>**样例** : `0`|integer (int64)|
|**expLabelColor**  <br>*可选*|到期时间颜色  <br>**样例** : `"string"`|string|
|**exp_label**  <br>*可选*|到期时间格式化  <br>**样例** : `"string"`|string|
|**map**  <br>*可选*|使用条件：1、满减，2、指定产品  <br>**样例** : `0`|integer (int32)|
|**map_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**min_amount**  <br>*可选*|起始使用金额  <br>**样例** : `0.0`|number|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**productList**  <br>*可选*|产品列表  <br>**样例** : `[ "[couponproductvo](#couponproductvo)" ]`|< [CouponProductVO](#couponproductvo) > array|
|**productListTopTip**  <br>*可选*|产品列表头部标题，例如：该代金券仅限用于以下产品  <br>**样例** : `"string"`|string|
|**products**  <br>*可选*|指定产品  <br>**样例** : `[ "[productbasicmodel](#productbasicmodel)" ]`|< [ProductBasicModel](#productbasicmodel) > array|
|**remark**  <br>*可选*|卡券说明  <br>**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|指定站点  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|1:正常；0：已使用；-1：过期；-2作废  <br>**样例** : `0`|integer (int32)|
|**tip_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|卡券标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1:代金券；2：赔偿金  <br>**样例** : `0`|integer (int32)|
|**type_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**unusableReason**  <br>*可选*|不可用原因  <br>**样例** : `"string"`|string|


<a name="couponslistvo"></a>
### CouponsListVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**category**  <br>*可选*|使用品类1：线路；2：签证；3：门票；4：体育赛事  <br>**样例** : `0`|integer (int32)|
|**categoryColor**  <br>*可选*|使用品类颜色  <br>**样例** : `"string"`|string|
|**categoryName**  <br>*可选*|使用品类文字  <br>**样例** : `"string"`|string|
|**channel**  <br>*可选*|使用渠道：1、任何，2：app,3：网页  <br>**样例** : `0`|integer (int32)|
|**channel_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|cid  <br>**样例** : `0`|integer (int32)|
|**class_region_id**  <br>*可选*|指定区域  <br>**样例** : `0`|integer (int32)|
|**codeid**  <br>*可选*|codeid  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|到期时间  <br>**样例** : `0`|integer (int64)|
|**exp_label**  <br>*可选*|到期时间格式化  <br>**样例** : `"string"`|string|
|**map**  <br>*可选*|使用条件：1、满减，2、指定产品  <br>**样例** : `0`|integer (int32)|
|**map_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**min_amount**  <br>*可选*|起始使用金额  <br>**样例** : `0.0`|number|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**products**  <br>*可选*|指定产品  <br>**样例** : `[ "[visaaboutproductvo](#visaaboutproductvo)" ]`|< [VisaAboutProductVO](#visaaboutproductvo) > array|
|**remark**  <br>*可选*|卡券说明  <br>**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|指定站点  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|1:正常；0：已使用；-1：过期；-2作废  <br>**样例** : `0`|integer (int32)|
|**tip_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|卡券标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1:代金券；2：赔偿金  <br>**样例** : `0`|integer (int32)|
|**type_label**  <br>*可选*|使用备注  <br>**样例** : `"string"`|string|
|**unusableReason**  <br>*可选*|不可用原因  <br>**样例** : `"string"`|string|


<a name="creationdatebean"></a>
### CreationdateBean

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|照片设备信息date  <br>**样例** : `"string"`|string|
|**timezone**  <br>*可选*|照片设备信息timezone  <br>**样例** : `"string"`|string|
|**timezone_type**  <br>*可选*|照片设备信息timezone_type  <br>**样例** : `0`|integer (int32)|


<a name="creditsduobaovo"></a>
### CreditsDuobaoVO

|名称|说明|类型|
|---|---|---|
|**historyDuobao**  <br>*可选*|历史夺宝  <br>**样例** : `[ "[historyduobaovo](#historyduobaovo)" ]`|< [HistoryDuobaoVO](#historyduobaovo) > array|
|**notStartedDuobao**  <br>*可选*|夺宝预告  <br>**样例** : `[ "[notstartedduobaovo](#notstartedduobaovo)" ]`|< [NotStartedDuobaoVO](#notstartedduobaovo) > array|
|**raiseDuobao**  <br>*可选*|进行中夺宝  <br>**样例** : `[ "[raiseduobaovo](#raiseduobaovo)" ]`|< [RaiseDuobaoVO](#raiseduobaovo) > array|
|**recentDuobao**  <br>*可选*|近期夺宝  <br>**样例** : `[ "[recentduobaovo](#recentduobaovo)" ]`|< [RecentDuobaoVO](#recentduobaovo) > array|
|**ruleDesc**  <br>*可选*|夺宝规则说明  <br>**样例** : `"string"`|string|
|**totalIntegral**  <br>*可选*|总积分  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**totalStakes**  <br>*可选*|参与人次  <br>**样例** : `0`|integer (int32)|
|**userDuobaoLogs**  <br>*可选*|最新参与夺宝记录  <br>**样例** : `[ "[userduobaologvo](#userduobaologvo)" ]`|< [UserDuobaoLogVO](#userduobaologvo) > array|


<a name="creditsmallvo"></a>
### CreditsMallVO

|名称|说明|类型|
|---|---|---|
|**duobao**  <br>*可选*|夺宝活动  <br>**样例** : `[ "[raiseduobaovo](#raiseduobaovo)" ]`|< [RaiseDuobaoVO](#raiseduobaovo) > array|
|**exchangeCoupon**  <br>*可选*|换券活动  <br>**样例** : `[ "[exchangecouponvo](#exchangecouponvo)" ]`|< [ExchangeCouponVO](#exchangecouponvo) > array|
|**exchangeGoods**  <br>*可选*|兑换实物  <br>**样例** : `[ "[exchangecouponvo](#exchangecouponvo)" ]`|< [ExchangeCouponVO](#exchangecouponvo) > array|
|**incrIntegral**  <br>*可选*|今日新增积分  <br>**样例** : `0`|integer (int32)|
|**mobileAds**  <br>*可选*|广告位  <br>**样例** : `[ "[8035f39760f39ca3fb4255fb4dfe9233](#8035f39760f39ca3fb4255fb4dfe9233)" ]`|< [广告位_3](#8035f39760f39ca3fb4255fb4dfe9233) > array|
|**totalIntegral**  <br>*可选*|总积分数  <br>**样例** : `0`|integer (int32)|


<a name="dailymaterialvo"></a>
### DailyMaterialVO

|名称|说明|类型|
|---|---|---|
|**imgAuthor**  <br>*可选*|图片作者  <br>**样例** : `"string"`|string|
|**imgContent**  <br>*可选*|图片标题  <br>**样例** : `"string"`|string|
|**imgId**  <br>*可选*|图片Id  <br>**样例** : `0`|integer (int32)|
|**imgUrl**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**materialId**  <br>*可选*|图文id  <br>**样例** : `0`|integer (int32)|
|**receivedTime**  <br>*可选*|领取时间  <br>**样例** : `0`|integer (int64)|
|**textAuthor**  <br>*可选*|内容作者  <br>**样例** : `"string"`|string|
|**textContent**  <br>*可选*|内容文案  <br>**样例** : `"string"`|string|
|**textId**  <br>*可选*|文案id  <br>**样例** : `0`|integer (int32)|


<a name="dailypkgbean"></a>
### DailyPkgBean

|名称|说明|类型|
|---|---|---|
|**pkg_name**  <br>*可选*|行程套餐名称  <br>**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|行程套餐id  <br>**样例** : `0`|integer (int32)|


<a name="dailypkglistbean"></a>
### DailyPkgListBean

|名称|说明|类型|
|---|---|---|
|**batch_list**  <br>*可选*|**样例** : `[ "[batchlistbean](#batchlistbean)" ]`|< [BatchListBean](#batchlistbean) > array|
|**dailyPkgVoucherLabel**  <br>*可选*|行程套餐线路券标签  <br>**样例** : `"[dailypkgvoucherlabel](#dailypkgvoucherlabel)"`|[DailyPkgVoucherLabel](#dailypkgvoucherlabel)|
|**pkg_name**  <br>*可选*|**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="dailypkgvo"></a>
### DailyPkgVO

|名称|说明|类型|
|---|---|---|
|**basicRefundId**  <br>*可选*|基础退订政策id  <br>**样例** : `0`|integer (int32)|
|**dailyPkgId**  <br>*可选*|行程套餐id  <br>**样例** : `0`|integer (int32)|
|**fullRefundId**  <br>*可选*|无损退订政策id  <br>**样例** : `0`|integer (int32)|


<a name="dailypkgvoucherlabel"></a>
### DailyPkgVoucherLabel

|名称|说明|类型|
|---|---|---|
|**labelName**  <br>*可选*|标签文案  <br>**样例** : `"string"`|string|


<a name="dataitemvo"></a>
### DataItemVo

|名称|说明|类型|
|---|---|---|
|**days**  <br>*可选*|活动天数  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|线路产品id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**price_label**  <br>*可选*|价格  <br>**样例** : `"string"`|string|
|**product_cat**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**sell_label**  <br>*可选*|销量  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|集市商品url  <br>**样例** : `"string"`|string|


<a name="dayintegral"></a>
### DayIntegral

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|日期 例,2021-08-01  <br>**样例** : `"string"`|string|
|**day**  <br>*可选*|天  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|对应奖励的经验  <br>**样例** : `0`|integer (int32)|
|**gold**  <br>*可选*|对应奖励的金币  <br>**样例** : `0`|integer (int32)|
|**iconTip**  <br>*可选*|图标文案  <br>**样例** : `"string"`|string|
|**iconType**  <br>*可选*|图标类型 1积分 2礼包 3卡券  <br>**样例** : `0`|integer (int32)|
|**integral**  <br>*可选*|对应奖励的积分  <br>**样例** : `0`|integer (int32)|


<a name="defaultavatarvo"></a>
### DefaultAvatarVO

|名称|说明|类型|
|---|---|---|
|**defaultName**  <br>*可选*|头像名称  <br>**样例** : `"string"`|string|
|**defaultPicUrl**  <br>*可选*|头像路径  <br>**样例** : `"string"`|string|
|**useStatus**  <br>*可选*|是否使用当前头像  <br>**样例** : `true`|boolean|


<a name="destaddressvo"></a>
### DestAddressVO

|名称|说明|类型|
|---|---|---|
|**bdDestLatitude**  <br>*可选*|百度目的地纬度  <br>**样例** : `0.0`|number|
|**bdDestLongitude**  <br>*可选*|百度目的地经度  <br>**样例** : `0.0`|number|
|**destAddress**  <br>*可选*|目的地地址  <br>**样例** : `"string"`|string|
|**destLatitude**  <br>*可选*|高德目的地纬度  <br>**样例** : `0.0`|number|
|**destLongitude**  <br>*可选*|高德目的地经度  <br>**样例** : `0.0`|number|
|**distance**  <br>*可选*|距离  <br>**样例** : `"string"`|string|
|**rightBtnName**  <br>*可选*|右边按钮名称  <br>**样例** : `"string"`|string|


<a name="destbaserespvo"></a>
### DestBaseRespVO

|名称|说明|类型|
|---|---|---|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="destbbsvo"></a>
### DestBbsVo

|名称|说明|类型|
|---|---|---|
|**duration**  <br>*可选*|时长  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**lineNumInNewsContent**  <br>*可选*|文中提及路线数  <br>**样例** : `0`|integer (int32)|
|**mddNumInNewsContent**  <br>*可选*|文中提及目的地数  <br>**样例** : `0`|integer (int32)|
|**qiniuSrc**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**replies**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|


<a name="destbbsvo_1"></a>
### DestBbsVo_1

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**lables**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**lineNumInNewsContent**  <br>*可选*|文中提及路线数  <br>**样例** : `0`|integer (int32)|
|**mddNumInNewsContent**  <br>*可选*|文中提及目的地数  <br>**样例** : `0`|integer (int32)|
|**replies**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|


<a name="destcheckinvo"></a>
### DestCheckinVO

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|目的地名  <br>**样例** : `"string"`|string|
|**overView**  <br>*可选*|目的地概述  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|目的地亮点  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转url  <br>**样例** : `"string"`|string|


<a name="destdetail"></a>
### DestDetail

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|0:公共头顶一部分  1:摘要  2: 意向栏 3:附近景点 4:热门城市 5: 热门景点 11: 热门国家 12：热门目的地 6:相关视频 7:景点图库 8:推荐玩法 9:游玩攻略 10:游记,13:正在遇见14新版本推荐目的地模块,15专题模块  <br>**样例** : `0`|integer (int32)|


<a name="destdetailrespvo"></a>
### DestDetailRespVo

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|details  <br>**样例** : `[ "[destdetail](#destdetail)" ]`|< [DestDetail](#destdetail) > array|
|**maxId**  <br>*可选*|最大id  <br>**样例** : `0`|integer (int32)|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="destfavoriterespvo"></a>
### DestFavoriteRespVO

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|目的地描述  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|目的地归属  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**productList**  <br>*可选*|目的地线路产品  <br>**样例** : `[ "[destproductvo](#destproductvo)" ]`|< [DestProductVO](#destproductvo) > array|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="destfilmrespvo"></a>
### DestFilmRespVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[destbbsvo](#destbbsvo)" ]`|< [DestBbsVo](#destbbsvo) > array|
|**maxId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="destindexvo"></a>
### DestIndexVO

|名称|说明|类型|
|---|---|---|
|**bgPic**  <br>*可选*|**样例** : `"string"`|string|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[basehandlervo](#basehandlervo)" ]`|< [BaseHandlerVO](#basehandlervo) > array|
|**mddId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**media_url**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**weather**  <br>*可选*|**样例** : `"string"`|string|
|**weatherPic**  <br>*可选*|**样例** : `"string"`|string|


<a name="destproductvo"></a>
### DestProductVO

|名称|说明|类型|
|---|---|---|
|**minPrice**  <br>*可选*|起始价  <br>**样例** : `"string"`|string|
|**productId**  <br>*可选*|线路id  <br>**样例** : `0`|integer (int32)|
|**productName**  <br>*可选*|线路名称  <br>**样例** : `"string"`|string|


<a name="destsearchrespvo"></a>
### DestSearchRespVo

|名称|说明|类型|
|---|---|---|
|**hotSearch**  <br>*可选*|热门搜索  <br>**样例** : `[ "[mddrespvo](#mddrespvo)" ]`|< [MddRespVo](#mddrespvo) > array|
|**mddInfo**  <br>*可选*|目的地信息  <br>**样例** : `[ "[searchmddrespvo](#searchmddrespvo)" ]`|< [SearchMddRespVo](#searchmddrespvo) > array|
|**pageSize**  <br>*可选*|分页数量  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="destsecenphotosrespvo"></a>
### DestSecenPhotosRespVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[photosecenmodel](#photosecenmodel)" ]`|< [PhotoSecenModel](#photosecenmodel) > array|
|**picSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="destspnewsrespvo"></a>
### DestSpnewsRespVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[destbbsvo_1](#destbbsvo_1)" ]`|< [DestBbsVo_1](#destbbsvo_1) > array|
|**maxId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="destthemebaserespvo"></a>
### DestThemeBaseRespVO

|名称|说明|类型|
|---|---|---|
|**themes**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**title**  <br>*可选*|主题  <br>**样例** : `"string"`|string|


<a name="desttravel"></a>
### DestTravel

|名称|说明|类型|
|---|---|---|
|**authorId**  <br>*可选*|作者id  <br>**样例** : `0`|integer (int32)|
|**authorName**  <br>*可选*|作者名  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**digest**  <br>*可选*|1 为精华，2为优质  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**lineNumInNewsContent**  <br>*可选*|文中提及路线数  <br>**样例** : `0`|integer (int32)|
|**mdd**  <br>*可选*|在**目的地  <br>**样例** : `"string"`|string|
|**mddNumInNewsContent**  <br>*可选*|文中提及目的地数  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|**样例** : `"string"`|string|
|**replies**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|
|**xiakui**  <br>*可选*|1 为侠魁  <br>**样例** : `0`|integer (int32)|


<a name="desttravelrespvo"></a>
### DestTravelRespVo

|名称|说明|类型|
|---|---|---|
|**filterCondition**  <br>*可选*|**样例** : `"[filterconditionbean](#filterconditionbean)"`|[FilterConditionBean](#filterconditionbean)|
|**list**  <br>*可选*|**样例** : `[ "[desttravel](#desttravel)" ]`|< [DestTravel](#desttravel) > array|
|**maxId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="destwantorgoedrespvo"></a>
### DestWantOrGoedRespVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**countInfo**  <br>*可选*|人数  <br>**样例** : `0`|integer (int32)|
|**flag**  <br>*可选*|true 为点亮  <br>**样例** : `true`|boolean|
|**label**  <br>*可选*|想去或者去过  <br>**样例** : `"string"`|string|


<a name="destwantrespvo"></a>
### DestWantRespVo

|名称|说明|类型|
|---|---|---|
|**goed**  <br>*可选*|去过  <br>**样例** : `"[destwantorgoedrespvo](#destwantorgoedrespvo)"`|[DestWantOrGoedRespVo](#destwantorgoedrespvo)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|0:公共头顶一部分  1:摘要  2: 意向栏 3:附近景点 4:热门城市 5: 热门景点 11: 热门国家 12：热门目的地 6:相关视频 7:景点图库 8:推荐玩法 9:游玩攻略 10:游记,13:正在遇见14新版本推荐目的地模块,15专题模块  <br>**样例** : `0`|integer (int32)|
|**wantTo**  <br>*可选*|想去  <br>**样例** : `"[destwantorgoedrespvo](#destwantorgoedrespvo)"`|[DestWantOrGoedRespVo](#destwantorgoedrespvo)|


<a name="destinationvo"></a>
### DestinationVO

|名称|说明|类型|
|---|---|---|
|**civil_list**  <br>*可选*|国内城市列表  <br>**样例** : `[ "[city](#city)" ]`|< [City](#city) > array|
|**foreign_list**  <br>*可选*|国外城市列表  <br>**样例** : `[ "[city](#city)" ]`|< [City](#city) > array|


<a name="detailcommentvo"></a>
### DetailCommentVO

|名称|说明|类型|
|---|---|---|
|**currentPage**  <br>*可选*|当前页数  <br>**样例** : `0`|integer (int32)|
|**newscomment**  <br>*可选*|攻略评论列表  <br>**样例** : `[ "[newscommentbean](#newscommentbean)" ]`|< [NewsCommentBean](#newscommentbean) > array|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="detailduobaovo"></a>
### DetailDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoStartTime**  <br>*可选*|夺宝开始时间  <br>**样例** : `0`|integer (int64)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**endTime**  <br>*可选*|下注截止时间  <br>**样例** : `0`|integer (int64)|
|**expDay**  <br>*可选*|代金券有效期天数文本  <br>**样例** : `"string"`|string|
|**firstJoinTime**  <br>*可选*|首位用户参与时间  <br>**样例** : `"string"`|string|
|**flashPic**  <br>*可选*|幻灯片  <br>**样例** : `[ "string" ]`|< string > array|
|**joined**  <br>*可选*|true 为当前用户参与了该夺宝  <br>**样例** : `true`|boolean|
|**lotteryNumber**  <br>*可选*|彩票号码  <br>**样例** : `"string"`|string|
|**maxStakes**  <br>*可选*|本场最高可下的注数  <br>**样例** : `0`|integer (int32)|
|**minPeopleNum**  <br>*可选*|开奖人次条件  <br>**样例** : `0`|integer (int32)|
|**needCredits**  <br>*可选*|需要消耗的积分  <br>**样例** : `0`|integer (int32)|
|**newJoinUserAvatars**  <br>*可选*|最新参与用户的头像  <br>**样例** : `[ "string" ]`|< string > array|
|**nowPeopleNum**  <br>*可选*|当前参与人次  <br>**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**openTime**  <br>*可选*|开奖时间  <br>**样例** : `0`|integer (int64)|
|**owner**  <br>*可选*|用户本身  <br>**样例** : `"[userluckynumber](#userluckynumber)"`|[UserLuckyNumber](#userluckynumber)|
|**peopleCount**  <br>*可选*|参与人次  <br>**样例** : `0`|integer (int32)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**productId**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**recentJoinUser**  <br>*可选*|用户信息  <br>**样例** : `[ "[userluckynumber](#userluckynumber)" ]`|< [UserLuckyNumber](#userluckynumber) > array|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**shouZhuFree**  <br>*可选*|是否首注免费  <br>**样例** : `true`|boolean|
|**subscribe**  <br>*可选*|是否预约 true，已预约  <br>**样例** : `true`|boolean|
|**tip**  <br>*可选*|下注条件未达到提示语  <br>**样例** : `"[lucynumberresultvo](#lucynumberresultvo)"`|[LucyNumberResultVO](#lucynumberresultvo)|
|**totalCredits**  <br>*可选*|用户总积分数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1筹集中  2 待开奖 3已开奖  4 筹集失败  <br>**样例** : `0`|integer (int32)|
|**win**  <br>*可选*|true 为当前用户中奖  <br>**样例** : `true`|boolean|
|**winLuckyNumbers**  <br>*可选*|本期中奖幸运码  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|
|**winUser**  <br>*可选*|本期中奖用户  <br>**样例** : `[ "[userluckynumber](#userluckynumber)" ]`|< [UserLuckyNumber](#userluckynumber) > array|


<a name="detailphotosvo"></a>
### DetailPhotosVO

|名称|说明|类型|
|---|---|---|
|**commented**  <br>*可选*|作品评论数量  <br>**样例** : `0`|integer (int32)|
|**detail_display_url**  <br>*可选*|图片详情链接  <br>**样例** : `"string"`|string|
|**exif**  <br>*可选*|照片设备信息  <br>**样例** : `"[exif](#exif)"`|[Exif](#exif)|
|**img**  <br>*可选*|图片地址  <br>**样例** : `"string"`|string|
|**iscover**  <br>*可选*|是否封面  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|图片id  <br>**样例** : `0`|integer (int32)|
|**waterMarkPhoto**  <br>*可选*|水印图  <br>**样例** : `"string"`|string|


<a name="details"></a>
### Details

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|余额详情  <br>**样例** : `[ "[useraccountdetailbean](#useraccountdetailbean)" ]`|< [UserAccountDetailBean](#useraccountdetailbean) > array|
|**timeGroup**  <br>*可选*|时间  <br>**样例** : `"string"`|string|


<a name="directorybean"></a>
### DirectoryBean

|名称|说明|类型|
|---|---|---|
|**htag**  <br>*可选*|子标签  <br>**样例** : `[ "[htagbean](#htagbean)" ]`|< [HtagBean](#htagbean) > array|
|**name**  <br>*可选*|目录名称  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|顺序号  <br>**样例** : `"[orderbean](#orderbean)"`|[OrderBean](#orderbean)|


<a name="directoryvo"></a>
### DirectoryVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|攻略目录列表  <br>**样例** : `[ "[directorybean](#directorybean)" ]`|< [DirectoryBean](#directorybean) > array|
|**name**  <br>*可选*|名称  <br>**样例** : `"string"`|string|


<a name="discountbean"></a>
### DiscountBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|满减金额  <br>**样例** : `0.0`|number|
|**desc**  <br>*可选*|满减信息例如：满10人减  <br>**样例** : `"string"`|string|
|**discountId**  <br>*可选*|满减id  <br>**样例** : `0`|integer (int32)|
|**discountSn**  <br>*可选*|满减是否是快照（修改订单使用）  <br>**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|满减需要几人（修改订单使用）  <br>**样例** : `0`|integer (int32)|


<a name="discoverbillboardvo"></a>
### DiscoverBillboardVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|协议  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|榜单名  <br>**样例** : `"string"`|string|
|**rank**  <br>*可选*|排名  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转url  <br>**样例** : `"string"`|string|


<a name="discovercolumndetailupvo"></a>
### DiscoverColumnDetailUpVO

|名称|说明|类型|
|---|---|---|
|**backGroundColor**  <br>*可选*|背景色  <br>**样例** : `"string"`|string|
|**canWrite**  <br>*可选*|true为可以参与话题  <br>**样例** : `true`|boolean|
|**desc**  <br>*可选*|专栏简介  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[simplediscuvo](#simplediscuvo)" ]`|< [SimpleDiscuVO](#simplediscuvo) > array|
|**image**  <br>*可选*|专栏图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|专栏标题  <br>**样例** : `"string"`|string|
|**users**  <br>*可选*|栏目大咖  <br>**样例** : `[ "[simpleuservo](#simpleuservo)" ]`|< [SimpleUserVO](#simpleuservo) > array|


<a name="discovercolumnlistvo"></a>
### DiscoverColumnListVO

|名称|说明|类型|
|---|---|---|
|**columns**  <br>*可选*|专栏  <br>**样例** : `[ "[columncontent](#columncontent)" ]`|< [ColumnContent](#columncontent) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discovercommentdelvo"></a>
### DiscoverCommentDelVO

|名称|说明|类型|
|---|---|---|
|**commentsCount**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|


<a name="discovercommentpriseresultvo"></a>
### DiscoverCommentPriseResultVO

|名称|说明|类型|
|---|---|---|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|


<a name="discovercommentvo"></a>
### DiscoverCommentVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**commentedUserName**  <br>*可选*|被评论用户名  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组信息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**isTalent**  <br>*可选*|是否为达人  <br>**样例** : `true`|boolean|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discovercommentvo_1"></a>
### DiscoverCommentVO_1

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**commentedUserId**  <br>*可选*|被评论用户Id  <br>**样例** : `0`|integer (int32)|
|**commentedUserName**  <br>*可选*|被评论用户名  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组信息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**hasPrised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**isAuthor**  <br>*可选*|是否是作者  <br>**样例** : `true`|boolean|
|**isDelete**  <br>*可选*|是否删除  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|是否为达人  <br>**样例** : `true`|boolean|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**priseNum**  <br>*可选*|点赞数  <br>**样例** : `0`|integer (int32)|
|**replyComments**  <br>*可选*|回复  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**replyId**  <br>*可选*|被回复的评论id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1 为评论 2为回复  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discoverdefaultsearchvo"></a>
### DiscoverDefaultSearchVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|类型  <br>**样例** : `"string"`|string|
|**keyword**  <br>*可选*|展示词  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|内容  <br>**样例** : `"string"`|string|


<a name="discoverdestcountvo"></a>
### DiscoverDestCountVO

|名称|说明|类型|
|---|---|---|
|**dest**  <br>*可选*|**样例** : `0`|integer (int32)|
|**destType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**num**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discoverdetailmddvo"></a>
### DiscoverDetailMddVO

|名称|说明|类型|
|---|---|---|
|**discoverCount**  <br>*可选*|目的地下的遇见数量  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地封面图  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|
|**wants**  <br>*可选*|多少人种草  <br>**样例** : `0`|integer (int32)|


<a name="discoverdetailquotevo"></a>
### DiscoverDetailQuoteVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**activity_type**  <br>*可选*|活动类型  <br>**样例** : `0`|integer (int32)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**address_lat**  <br>*可选*|自定义位置纬度  <br>**样例** : `"string"`|string|
|**address_lng**  <br>*可选*|自定义位置经度  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cid**  <br>*可选*|城市id  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**gmt_modify**  <br>*可选*|修改时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|身份标识  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**hot_time**  <br>*可选*|上热门时间  <br>**样例** : `0`|integer (int32)|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isCollect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**is_activity**  <br>*可选*|是否为活动  <br>**样例** : `0`|integer (int32)|
|**is_check**  <br>*可选*|是否检测  <br>**样例** : `0`|integer (int32)|
|**is_click_hot**  <br>*可选*|是否检测上热门  <br>**样例** : `0`|integer (int32)|
|**is_hot**  <br>*可选*|是否热门  <br>**样例** : `0`|integer (int32)|
|**is_meet_top**  <br>*可选*|是否为置顶遇见  <br>**样例** : `0`|integer (int32)|
|**is_report**  <br>*可选*|1举报并处理  0为举报或者举报未处理  <br>**样例** : `0`|integer (int32)|
|**is_top**  <br>*可选*|是否置顶  <br>**样例** : `0`|integer (int32)|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图初始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|图片类型  1为全景图 0为普通图片  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**product_id**  <br>*可选*|产品id  <br>**样例** : `"string"`|string|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|推荐池状态 （0 普通    1推荐中 2曝光中 3 取消推荐中）  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**shootingDate**  <br>*可选*|拍摄时间  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**source**  <br>*可选*|数据来源 0app  1产品评价同步  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|遇见状态  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|


<a name="discoverdiscuvo"></a>
### DiscoverDiscuVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discoverNum**  <br>*可选*|话题下遇见数  <br>**样例** : `0`|integer (int32)|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组消息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**img**  <br>*可选*|话题封面图  <br>**样例** : `"string"`|string|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**is_top**  <br>*可选*|is_top  <br>**样例** : `0`|integer (int32)|
|**miniShareVO**  <br>*可选*|分享小程序  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品 , talent: 遇见达人  <br>**样例** : `"string"`|string|
|**uiType**  <br>*可选*|UI类型: 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**userAvatars**  <br>*可选*|用户头像列  <br>**样例** : `[ "string" ]`|< string > array|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印 0为没有添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverdraftvo"></a>
### DiscoverDraftVO

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**imageAndVideo**  <br>*可选*|图片  <br>**样例** : `[ "[2d711b09bd0db0ad240cc83b30dd8014](#2d711b09bd0db0ad240cc83b30dd8014)" ]`|< [内容](#2d711b09bd0db0ad240cc83b30dd8014) > array|
|**imageCount**  <br>*可选*|图片总数  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**panoramaPercent**  <br>*可选*|全景图位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|遇见类型：1(视频),2(图片)  <br>**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|最后保存时间  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverencouragevo"></a>
### DiscoverEncourageVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**encourageId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fromUid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fromUserAvatar**  <br>*可选*|**样例** : `"string"`|string|
|**toUid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discoverfavaritevo"></a>
### DiscoverFavariteVO

|名称|说明|类型|
|---|---|---|
|**favtimes**  <br>*可选*|收藏数  <br>**样例** : `0`|integer (int32)|
|**isFavarite**  <br>*可选*|收藏状态:true为已收藏  <br>**样例** : `true`|boolean|


<a name="discoverfavoritesvo"></a>
### DiscoverFavoritesVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**icon**  <br>*可选*|精华标记(true为精华)  <br>**样例** : `true`|boolean|
|**id**  <br>*可选*|游记id  <br>**样例** : `0`|integer (int32)|
|**imageHeight**  <br>*可选*|高度  <br>**样例** : `0`|integer (int32)|
|**imageWidth**  <br>*可选*|宽度  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞:true为点赞  <br>**样例** : `true`|boolean|
|**type**  <br>*可选*|1 视频 0 图片  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发布者uid  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|遇见首图url  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discoverfollowedtopvo"></a>
### DiscoverFollowedTopVo

|名称|说明|类型|
|---|---|---|
|**followedTopicCount**  <br>*可选*|关注的话题数量  <br>**样例** : `0`|integer (int32)|
|**interestingUserAvatars**  <br>*可选*|发现有趣旅行家头像  <br>**样例** : `[ "string" ]`|< string > array|
|**lastId**  <br>*可选*|lastId  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|分页数量  <br>**样例** : `0`|integer (int32)|
|**quotesList**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**topicVos**  <br>*可选*|话题  <br>**样例** : `[ "[followedtopicvo](#followedtopicvo)" ]`|< [FollowedTopicVO](#followedtopicvo) > array|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="discoverhotresponsevo"></a>
### DiscoverHotResponseVo

|名称|说明|类型|
|---|---|---|
|**dataVersion**  <br>*可选*|数据版本号  <br>**样例** : `0`|integer (int32)|
|**images**  <br>*可选*|遇见广告  <br>**样例** : `[ "[flashvo](#flashvo)" ]`|< [FlashVO](#flashvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**quotesList**  <br>*可选*|遇见内容  <br>**样例** : `[ "object" ]`|< object > array|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discoverhotvo"></a>
### DiscoverHotVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discoverMdd**  <br>*可选*|目的地  <br>**样例** : `"[discoverdetailmddvo](#discoverdetailmddvo)"`|[DiscoverDetailMddVO](#discoverdetailmddvo)|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**favtimes**  <br>*可选*|收藏数  <br>**样例** : `0`|integer (int32)|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组消息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isCollect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**is_top**  <br>*可选*|is_top  <br>**样例** : `0`|integer (int32)|
|**miniShareVO**  <br>*可选*|分享小程序  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**prises**  <br>*可选*|关注人列表  <br>**样例** : `[ "[discoverpraisevo](#discoverpraisevo)" ]`|< [DiscoverPraiseVO](#discoverpraisevo) > array|
|**product**  <br>*可选*|目的地+线路商品 type : mdd  & type : product  <br>**样例** : `[ "object" ]`|< object > array|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品 , talent: 遇见达人  <br>**样例** : `"string"`|string|
|**uiType**  <br>*可选*|UI类型: 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印 0为没有添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverhotvo_1"></a>
### DiscoverHotVO_1

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**firstImg**  <br>*可选*|遇见首图  <br>**样例** : `"[imagevo](#imagevo)"`|[ImageVO](#imagevo)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组消息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**is_hot**  <br>*可选*|1为热门  <br>**样例** : `0`|integer (int32)|
|**is_top**  <br>*可选*|1为置顶  <br>**样例** : `0`|integer (int32)|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品 , talent: 遇见达人  <br>**样例** : `"string"`|string|
|**uiType**  <br>*可选*|UI类型: 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**version**  <br>*可选*|数据版本号  <br>**样例** : `0`|integer (int32)|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印 0为没有添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverlatestvo"></a>
### DiscoverLatestVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组消息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品 , talent: 遇见达人  <br>**样例** : `"string"`|string|
|**uiType**  <br>*可选*|UI类型: 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印 0为没有添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverlevyvo"></a>
### DiscoverLevyVO

|名称|说明|类型|
|---|---|---|
|**discovers**  <br>*可选*|遇见  <br>**样例** : `[ "[levydiscover](#levydiscover)" ]`|< [LevyDiscover](#levydiscover) > array|
|**id**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**joinNum**  <br>*可选*|参与人数  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题名称  <br>**样例** : `"string"`|string|


<a name="discovermodifyvo"></a>
### DiscoverModifyVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[photodetailvo](#photodetailvo)" ]`|< [PhotoDetailVO](#photodetailvo) > array|
|**imgUrlPerfix**  <br>*可选*|图片url前缀  <br>**样例** : `"string"`|string|
|**notice_users**  <br>*可选*|@用户  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**panoramaPercent**  <br>*可选*|全景图位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**shootingDate**  <br>*可选*|拍摄时间  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|photo:照片(默认), video：小视频  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**videoUrlPerfix**  <br>*可选*|视频url前缀  <br>**样例** : `"string"`|string|


<a name="discoverpicsharevo"></a>
### DiscoverPicShareVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**height**  <br>*可选*|高  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**rqCode**  <br>*可选*|二维码 (Base64 encode 后的字符串 需要用base64 decode之后得到byte[])  <br>**样例** : `"string"`|string|
|**rqCodeImg**  <br>*可选*|二维码 图片  <br>**样例** : `"string"`|string|
|**rqCodeMsg**  <br>*可选*|二维码小提示  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|是否为达人 1为达人  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|0普通图片  1全景图 2视频  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|宽  <br>**样例** : `0`|integer (int32)|


<a name="discoverpraiselistvo"></a>
### DiscoverPraiseListVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关注关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标签信息  <br>**样例** : `[ "[tagsitemvo](#tagsitemvo)" ]`|< [TagsItemVO](#tagsitemvo) > array|
|**uid**  <br>*可选*|用户编号  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discoverpraisevo"></a>
### DiscoverPraiseVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|


<a name="discoverpublishresultvo"></a>
### DiscoverPublishResultVO

|名称|说明|类型|
|---|---|---|
|**discoverCountInfo**  <br>*可选*|遇见统计信息  <br>**样例** : `"[userdiscovercountvo](#userdiscovercountvo)"`|[UserDiscoverCountVO](#userdiscovercountvo)|
|**discussList**  <br>*可选*|话题列表  <br>**样例** : `[ "[discusssamplevo](#discusssamplevo)" ]`|< [DiscussSampleVO](#discusssamplevo) > array|


<a name="discoverquoteitemvo"></a>
### DiscoverQuoteItemVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|走过x个国家x个城市  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|从加入游侠客至今  <br>**样例** : `"string"`|string|


<a name="discoverquoteusercentervo"></a>
### DiscoverQuoteUserCenterVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**commentNumStr**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**firstLevelTime**  <br>*可选*|一级时间线  <br>**样例** : `"string"`|string|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isCollect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**isShowTimePoint**  <br>*可选*|是否显示时间点  <br>**样例** : `true`|boolean|
|**is_report**  <br>*可选*|是否被举报 1被举报 0未举报  <br>**样例** : `0`|integer (int32)|
|**miniShareVO**  <br>*可选*|分享小程序  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**notice_users**  <br>*可选*|@用户  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**panoramaPercent**  <br>*可选*|全景图初始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|图片类型  1为全景图 0为普通图片  <br>**样例** : `0`|integer (int32)|
|**priseNumStr**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**prises**  <br>*可选*|点赞用户  <br>**样例** : `[ "[discoverpraisevo](#discoverpraisevo)" ]`|< [DiscoverPraiseVO](#discoverpraisevo) > array|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**secondLevelTime**  <br>*可选*|二级时间线  <br>**样例** : `"string"`|string|
|**shareTip**  <br>*可选*|分享提示信息  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|


<a name="discoverquotevo"></a>
### DiscoverQuoteVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动设置  <br>**样例** : `"[activityvo](#activityvo)"`|[ActivityVO](#activityvo)|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**address_lat**  <br>*可选*|手动定位的目的地纬度  <br>**样例** : `"string"`|string|
|**address_lng**  <br>*可选*|手动定位的目的地经度  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int32)|
|**grouplist**  <br>*可选*|群组消息  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**is_report**  <br>*可选*|是否被举报 1被举报 0未举报  <br>**样例** : `0`|integer (int32)|
|**is_show_years**  <br>*可选*|是否显示下一年 1是  <br>**样例** : `0`|integer (int32)|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**notice_users**  <br>*可选*|notice_users  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**official**  <br>*可选*|是否为官方  1 为官方  <br>**样例** : `0`|integer (int32)|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**places**  <br>*可选*|地址信息  <br>**样例** : `"[placevo](#placevo)"`|[PlaceVO](#placevo)|
|**prise**  <br>*可选*|赞和评论数  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quote_id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|0:普通 1:推荐中 2:曝光中 3:取消推荐中  <br>**样例** : `0`|integer (int32)|
|**recording**  <br>*可选*|录音  <br>**样例** : `"string"`|string|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享的标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**show_address**  <br>*可选*|是否显示位置  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|activity：活动, photo:照片(默认), video：小视频, product:报名的旅游产品 , talent: 遇见达人  <br>**样例** : `"string"`|string|
|**uiType**  <br>*可选*|UI类型: 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|
|**watermarkStatus**  <br>*可选*|1为添加水印 0为没有添加水印  <br>**样例** : `0`|integer (int32)|


<a name="discoverrankcontentvo"></a>
### DiscoverRankContentVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**discoverId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**discoverType**  <br>*可选*|遇见类型  0 图片  1视频  <br>**样例** : `0`|integer (int32)|
|**images**  <br>*可选*|遇见图片  <br>**样例** : `[ "string" ]`|< string > array|
|**label**  <br>*可选*|标签说明  <br>**样例** : `"string"`|string|
|**newest**  <br>*可选*|true为展示new标识  <br>**样例** : `true`|boolean|
|**targetUrl**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1人气榜 2精选榜 3 毅力榜  <br>**样例** : `0`|integer (int32)|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|
|**users**  <br>*可选*|用户  <br>**样例** : `[ "[simpleuservo](#simpleuservo)" ]`|< [SimpleUserVO](#simpleuservo) > array|


<a name="discoverranklistvo"></a>
### DiscoverRankListVO

|名称|说明|类型|
|---|---|---|
|**time**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**year**  <br>*可选*|**样例** : `"string"`|string|


<a name="discoverrankvo"></a>
### DiscoverRankVO

|名称|说明|类型|
|---|---|---|
|**label**  <br>*可选*|标签说明  <br>**样例** : `"string"`|string|
|**newest**  <br>*可选*|true为展示new标识  <br>**样例** : `true`|boolean|
|**targetUrl**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1人气榜 2精选榜 3 毅力榜  <br>**样例** : `0`|integer (int32)|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|
|**users**  <br>*可选*|用户  <br>**样例** : `[ "[simpleuservo](#simpleuservo)" ]`|< [SimpleUserVO](#simpleuservo) > array|


<a name="discoverrelationvo"></a>
### DiscoverRelationVO

|名称|说明|类型|
|---|---|---|
|**discu_id**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|链接跳转类型  <br>**样例** : `"string"`|string|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**target_url**  <br>*可选*|链接地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|


<a name="discoversamebatchesyouxiavo"></a>
### DiscoverSameBatchesYouxiaVO

|名称|说明|类型|
|---|---|---|
|**needMore**  <br>*可选*|是否需要展示更多:ture为需要  <br>**样例** : `true`|boolean|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|产品价格无符号  <br>**样例** : `"string"`|string|
|**productName**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**startTimeLabel**  <br>*可选*|批次出发时间  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品封面  <br>**样例** : `"string"`|string|
|**youxiaList**  <br>*可选*|该线路该批次下，参加的其他用户  <br>**样例** : `[ "[discoveryouxiasimplevo](#discoveryouxiasimplevo)" ]`|< [DiscoverYouxiaSimpleVO](#discoveryouxiasimplevo) > array|


<a name="discoversimplevo"></a>
### DiscoverSimpleVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|遇见详情  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|遇见类型 1视频  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|遇见首图url  <br>**样例** : `"string"`|string|


<a name="discoverstarsnotevo"></a>
### DiscoverStarsNoteVO

|名称|说明|类型|
|---|---|---|
|**note**  <br>*可选*|遇见红人榜文案  <br>**样例** : `"string"`|string|


<a name="discoverstarsvo"></a>
### DiscoverStarsVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|该用户数据  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**encourageNum**  <br>*可选*|鼓励条数  <br>**样例** : `0`|integer (int32)|
|**encourages**  <br>*可选*|鼓励列表  <br>**样例** : `[ "[discoverencouragevo](#discoverencouragevo)" ]`|< [DiscoverEncourageVO](#discoverencouragevo) > array|
|**isTalent**  <br>*可选*|V标识:true为V表示  <br>**样例** : `true`|boolean|
|**rank**  <br>*可选*|用户排名  <br>**样例** : `0`|integer (int32)|
|**relation**  <br>*可选*|关注状态  <br>**样例** : `"string"`|string|
|**relationBoolean**  <br>*可选*|关注状态布尔值  <br>**样例** : `true`|boolean|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discovertopicvo"></a>
### DiscoverTopicVO
遇见话题


|名称|说明|类型|
|---|---|---|
|**detail**  <br>*可选*|标题详情  <br>**样例** : `"string"`|string|
|**did**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**followed**  <br>*可选*|0未关注  1已关注  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**idx**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**quoteNums**  <br>*可选*|遇见数量  <br>**样例** : `0`|integer (int32)|
|**suggest**  <br>*可选*|推荐等级  <br>**样例** : `0`|integer (int32)|
|**target_url**  <br>*可选*|跳转链接  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|


<a name="discovervideodetailresvo"></a>
### DiscoverVideoDetailResVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|2 为优质 1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**followed**  <br>*可选*|是否关注  <br>**样例** : `true`|boolean|
|**isCollect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**mdd**  <br>*可选*|目的地  <br>**样例** : `"[discoverdetailmddvo](#discoverdetailmddvo)"`|[DiscoverDetailMddVO](#discoverdetailmddvo)|
|**mddLabel**  <br>*可选*|目的地上上级  <br>**样例** : `"string"`|string|
|**miniShareVO**  <br>*可选*|分享小程序  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**noticeUsers**  <br>*可选*|@用户列表  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**productTag**  <br>*可选*|文中线路/同款线路推荐  <br>**样例** : `"string"`|string|
|**products**  <br>*可选*|线路推荐  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**quoteId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recommendStatus**  <br>*可选*|推荐池状态 （0 普通    1推荐中 2曝光中 3 取消推荐中）  <br>**样例** : `0`|integer (int32)|
|**shareTitle**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|分享的地址  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|


<a name="discoverweeklistvo"></a>
### DiscoverWeekListVO

|名称|说明|类型|
|---|---|---|
|**historyWeekList**  <br>*可选*|历史周榜  <br>**样例** : `[ "[billboardvo](#billboardvo)" ]`|< [BillBoardVO](#billboardvo) > array|
|**label**  <br>*可选*|周榜时间  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|最新一期周跳转地址  <br>**样例** : `"string"`|string|
|**topWeekList**  <br>*可选*|最新一期周榜前三  <br>**样例** : `[ "[discoverrankcontentvo](#discoverrankcontentvo)" ]`|< [DiscoverRankContentVO](#discoverrankcontentvo) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="discoveryouxiasimplevo"></a>
### DiscoverYouxiaSimpleVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|用户签名  <br>**样例** : `"string"`|string|
|**isTalent**  <br>*可选*|达人认证V标识:true为V表示  <br>**样例** : `true`|boolean|
|**relation**  <br>*可选*|关注状态  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discoveryouxiatuijianvo"></a>
### DiscoverYouxiaTuijianVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**discoverList**  <br>*可选*|遇见信息  <br>**样例** : `[ "[discoversimplevo](#discoversimplevo)" ]`|< [DiscoverSimpleVO](#discoversimplevo) > array|
|**intro**  <br>*可选*|用户签名  <br>**样例** : `"string"`|string|
|**isTalent**  <br>*可选*|达人认证V标识:true为V表示  <br>**样例** : `true`|boolean|
|**relation**  <br>*可选*|关注状态  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="discudatavo"></a>
### DiscuDataVo

|名称|说明|类型|
|---|---|---|
|**categorys**  <br>*可选*|话题分类标签  <br>**样例** : `[ "[c9c9224079f080b01e9319067bc8c230](#c9c9224079f080b01e9319067bc8c230)" ]`|< [遇见分类](#c9c9224079f080b01e9319067bc8c230) > array|
|**discoverStream**  <br>*可选*|瀑布流  <br>**样例** : `[ "[867fbdaaca71777af457191849e51819](#867fbdaaca71777af457191849e51819)" ]`|< [遇见瀑布流数据](#867fbdaaca71777af457191849e51819) > array|
|**discudetail**  <br>*可选*|**样例** : `"[topicvo](#topicvo)"`|[TopicVO](#topicvo)|
|**quotesList**  <br>*可选*|**样例** : `[ "[discoverdiscuvo](#discoverdiscuvo)" ]`|< [DiscoverDiscuVO](#discoverdiscuvo) > array|
|**recommendDests**  <br>*可选*|推荐目的地  <br>**样例** : `[ "[4af669a3d5bb99ef7152def05001455e](#4af669a3d5bb99ef7152def05001455e)" ]`|< [推荐目的地](#4af669a3d5bb99ef7152def05001455e) > array|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**topic**  <br>*可选*|相关话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discudatavo_1"></a>
### DiscuDataVo_1

|名称|说明|类型|
|---|---|---|
|**discudetail**  <br>*可选*|**样例** : `"[discussdetailvo](#discussdetailvo)"`|[DiscussDetailVO](#discussdetailvo)|
|**quotesList**  <br>*可选*|**样例** : `[ "[discoverdiscuvo](#discoverdiscuvo)" ]`|< [DiscoverDiscuVO](#discoverdiscuvo) > array|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discussdetailvo"></a>
### DiscussDetailVO

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动类型  <br>**样例** : `"string"`|string|
|**activity_url**  <br>*可选*|活动地址链接  <br>**样例** : `"string"`|string|
|**bigimg**  <br>*可选*|图片地址  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|标题详情  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|跳转类型:discover,html5,product_detail,album_detail,bbs_detail  <br>**样例** : `"string"`|string|
|**links**  <br>*可选*|话题引用次数  <br>**样例** : `0`|integer (int32)|
|**shareUrl**  <br>*可选*|话题分享链接  <br>**样例** : `"string"`|string|
|**target_url**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|0话题 1标签  <br>**样例** : `0`|integer (int32)|


<a name="discusslistvo"></a>
### DiscussListVo

|名称|说明|类型|
|---|---|---|
|**comments**  <br>*可选*|**样例** : `[ "[productdiscusscommentvo](#productdiscusscommentvo)" ]`|< [ProductDiscussCommentVo](#productdiscusscommentvo) > array|
|**current_page**  <br>*可选*|**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|**样例** : `0`|integer (int64)|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="discusssamplevo"></a>
### DiscussSampleVO

|名称|说明|类型|
|---|---|---|
|**discoverCount**  <br>*可选*|遇见数  <br>**样例** : `"string"`|string|
|**discuId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|


<a name="discusssavevo"></a>
### DiscussSaveVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|回复时间  <br>**样例** : `0`|integer (int64)|
|**avatar**  <br>*可选*|回复人头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**disId**  <br>*可选*|disId  <br>**样例** : `0`|integer (int32)|
|**sub**  <br>*可选*|回复信息  <br>**样例** : `[ "[productdiscusssubvo](#productdiscusssubvo)" ]`|< [ProductDiscussSubVo](#productdiscusssubvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|回复人用户名  <br>**样例** : `"string"`|string|


<a name="discussvo"></a>
### DiscussVO

|名称|说明|类型|
|---|---|---|
|**did**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|


<a name="documentbean"></a>
### DocumentBean

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|banner图  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|专题id  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|线路id  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="doingcompetitionlistvo"></a>
### DoingCompetitionlistVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|比赛列表  <br>**样例** : `[ "[competitonbeanvo](#competitonbeanvo)" ]`|< [CompetitonBeanVO](#competitonbeanvo) > array|


<a name="duobaodetailvo"></a>
### DuobaoDetailVO

|名称|说明|类型|
|---|---|---|
|**duobao**  <br>*可选*|夺宝相关信息  <br>**样例** : `"[detailduobaovo](#detailduobaovo)"`|[DetailDuobaoVO](#detailduobaovo)|
|**raiseDuobao**  <br>*可选*|更多夺宝  <br>**样例** : `[ "[raiseduobaovo](#raiseduobaovo)" ]`|< [RaiseDuobaoVO](#raiseduobaovo) > array|
|**recommendProducts**  <br>*可选*|相关推荐  <br>**样例** : `[ "[productsrecommend](#productsrecommend)" ]`|< [ProductsRecommend](#productsrecommend) > array|


<a name="earlybirdbean"></a>
### EarlybirdBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|早鸟金额  <br>**样例** : `0.0`|number|
|**earlybirdId**  <br>*可选*|早鸟id  <br>**样例** : `0`|integer (int32)|
|**earlybirdSn**  <br>*可选*|早鸟是否是快照（修改订单使用）  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|例如：以支付时间距离出行时间享受对应早鸟优惠，过期不支付则优惠取消  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|例如：早鸟特惠  <br>**样例** : `"string"`|string|


<a name="encourageconfigvo"></a>
### EncourageConfigVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**emoji**  <br>*可选*|**样例** : `"string"`|string|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="encouragelistvo"></a>
### EncourageListVO

|名称|说明|类型|
|---|---|---|
|**encourages**  <br>*可选*|鼓励详情  <br>**样例** : `[ "[discoverencouragevo](#discoverencouragevo)" ]`|< [DiscoverEncourageVO](#discoverencouragevo) > array|
|**time**  <br>*可选*|时间  <br>**样例** : `"string"`|string|


<a name="encouragesummaryvo"></a>
### EncourageSummaryVO

|名称|说明|类型|
|---|---|---|
|**encourageDetail**  <br>*可选*|鼓励列表  <br>**样例** : `[ "[encouragelistvo](#encouragelistvo)" ]`|< [EncourageListVO](#encouragelistvo) > array|
|**total**  <br>*可选*|累计获得鼓励次数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="evaluationimagevo"></a>
### EvaluationImageVO

|名称|说明|类型|
|---|---|---|
|**fid**  <br>*可选*|图片id  <br>**样例** : `0`|integer (int32)|
|**height**  <br>*可选*|高度  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|宽度  <br>**样例** : `0`|integer (int32)|


<a name="evaluationlistdetailvo"></a>
### EvaluationListDetailVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评价时间  <br>**样例** : `0`|integer (int64)|
|**avatar**  <br>*可选*|评价人头像  <br>**样例** : `"string"`|string|
|**averageStar**  <br>*可选*|平均星级  <br>**样例** : `0.0`|number|
|**channel**  <br>*可选*|来源1:app;2:pc；  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|评价内容  <br>**样例** : `"string"`|string|
|**imgs**  <br>*可选*|图片  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**isTalent**  <br>*可选*|是否加V  <br>**样例** : `true`|boolean|
|**pkgname**  <br>*可选*|套餐名称  <br>**样例** : `"string"`|string|
|**quality**  <br>*可选*|是否优质评价  <br>**样例** : `0`|integer (int32)|
|**reply**  <br>*可选*|回复  <br>**样例** : `"string"`|string|
|**stars**  <br>*可选*|星级  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**startTime**  <br>*可选*|出行时间  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|评价人用户名  <br>**样例** : `"string"`|string|


<a name="evaluationlistvo"></a>
### EvaluationListVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|list  <br>**样例** : `[ "[evaluationlistdetailvo](#evaluationlistdetailvo)" ]`|< [EvaluationListDetailVo](#evaluationlistdetailvo) > array|
|**num**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pagesize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|星级  <br>**样例** : `[ "[productcommenttagsvo](#productcommenttagsvo)" ]`|< [ProductCommentTagsVo](#productcommenttagsvo) > array|
|**totalpage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="evaluationstardetaileditvo"></a>
### EvaluationStarDetailEditVO

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `true`|boolean|
|**tag_id**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="evaluationstardetailvo"></a>
### EvaluationStarDetailVO

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="evaluationstareditvo"></a>
### EvaluationStarEditVO

|名称|说明|类型|
|---|---|---|
|**star**  <br>*可选*|**样例** : `[ "[evaluationstardetaileditvo](#evaluationstardetaileditvo)" ]`|< [EvaluationStarDetailEditVO](#evaluationstardetaileditvo) > array|


<a name="evaluationstarvo"></a>
### EvaluationStarVO

|名称|说明|类型|
|---|---|---|
|**star**  <br>*可选*|**样例** : `[ "[evaluationstardetailvo](#evaluationstardetailvo)" ]`|< [EvaluationStarDetailVO](#evaluationstardetailvo) > array|


<a name="exchangecoupondetailvo"></a>
### ExchangeCouponDetailVO

|名称|说明|类型|
|---|---|---|
|**conditionTip**  <br>*可选*|兑换条件限制提示  <br>**样例** : `"string"`|string|
|**couponDesc**  <br>*可选*|使用说明  <br>**样例** : `"string"`|string|
|**couponTitle**  <br>*可选*|卡券标题  <br>**样例** : `"string"`|string|
|**exchangeCouponId**  <br>*可选*|换券活动id  <br>**样例** : `0`|integer (int32)|
|**exchangeThreshold**  <br>*可选*|兑换门槛  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|券/实物图片  <br>**样例** : `"string"`|string|
|**joinThreshold**  <br>*可选*|参与门槛  <br>**样例** : `"string"`|string|
|**myCredit**  <br>*可选*|我的积分  <br>**样例** : `0`|integer (int32)|
|**needCredit**  <br>*可选*|需要消耗的积分  <br>**样例** : `0`|integer (int32)|
|**originalCredit**  <br>*可选*|原积分  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|券面额  <br>**样例** : `0.0`|number|
|**remainExchangeTime**  <br>*可选*|剩余可兑换次数  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|换券活动标题  <br>**样例** : `"string"`|string|
|**useCondition**  <br>*可选*|使用条件  <br>**样例** : `"string"`|string|
|**useValidity**  <br>*可选*|使用有效期  <br>**样例** : `"string"`|string|
|**userVipLevel**  <br>*可选*|用户会员等级  <br>**样例** : `0`|integer (int32)|
|**vipLevelDiscountList**  <br>*可选*|会员折扣  <br>**样例** : `[ "[vipleveldiscount](#vipleveldiscount)" ]`|< [VipLevelDiscount](#vipleveldiscount) > array|


<a name="exchangecouponresultvo"></a>
### ExchangeCouponResultVO

|名称|说明|类型|
|---|---|---|
|**consumeCredits**  <br>*可选*|本次兑换消耗积分数  <br>**样例** : `0`|integer (int32)|
|**detailId**  <br>*可选*|兑换记录id  <br>**样例** : `0`|integer (int32)|
|**differCredits**  <br>*可选*|还差多少积分  <br>**样例** : `0`|integer (int32)|
|**msg**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**targetId**  <br>*可选*|跳转id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1 为总积分门槛未达到 2用户总兑换次数达到上限 3用户积分不满足该兑换任务所需积分 4兑换成功 5商品已兑换完毕，库存为0  <br>**样例** : `0`|integer (int32)|


<a name="exchangecouponvo"></a>
### ExchangeCouponVO

|名称|说明|类型|
|---|---|---|
|**discountTip**  <br>*可选*|折扣标签  <br>**样例** : `"string"`|string|
|**exchangeCouponId**  <br>*可选*|换券活动id  <br>**样例** : `0`|integer (int32)|
|**exchangeStatus**  <br>*可选*|能否兑换 0积分不足，1立即兑换，2已兑完  <br>**样例** : `0`|integer (int32)|
|**imageUrl**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**needCredit**  <br>*可选*|需要消耗的积分  <br>**样例** : `0`|integer (int32)|
|**originalCredit**  <br>*可选*|原积分  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|券面额/实物价值  <br>**样例** : `0.0`|number|
|**remainExchangeTime**  <br>*可选*|剩余可兑换次数  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="exif"></a>
### Exif

|名称|说明|类型|
|---|---|---|
|**aperture**  <br>*可选*|照片设备信息aperture  <br>**样例** : `"string"`|string|
|**camera**  <br>*可选*|照片设备信息camera  <br>**样例** : `"string"`|string|
|**creationdate**  <br>*可选*|照片设备信息creationdate  <br>**样例** : `"[creationdatebean](#creationdatebean)"`|[CreationdateBean](#creationdatebean)|
|**date**  <br>*可选*|照片设备信息date  <br>**样例** : `"string"`|string|
|**exposure**  <br>*可选*|照片设备信息exposure  <br>**样例** : `"string"`|string|
|**exposurebias**  <br>*可选*|照片设备信息exposurebias  <br>**样例** : `"string"`|string|
|**focal**  <br>*可选*|照片设备信息focal  <br>**样例** : `"string"`|string|
|**focalLength**  <br>*可选*|照片设备信息focalLength  <br>**样例** : `"string"`|string|
|**height**  <br>*可选*|照片设备信息height  <br>**样例** : `"string"`|string|
|**horizontalResolution**  <br>*可选*|照片设备信息horizontalResolution  <br>**样例** : `"string"`|string|
|**iso**  <br>*可选*|照片设备信息iso  <br>**样例** : `"string"`|string|
|**make**  <br>*可选*|照片设备信息make  <br>**样例** : `"string"`|string|
|**metering**  <br>*可选*|照片设备信息metering  <br>**样例** : `"string"`|string|
|**software**  <br>*可选*|照片设备信息software  <br>**样例** : `"string"`|string|
|**verticalResolution**  <br>*可选*|照片设备信息verticalResolution  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|照片设备信息width  <br>**样例** : `"string"`|string|


<a name="extinfo"></a>
### ExtInfo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comsumption**  <br>*可选*|消费值  <br>**样例** : `0.0`|number|
|**exp**  <br>*可选*|经验值  <br>**样例** : `0`|integer (int32)|
|**expBeyondPercent**  <br>*可选*|社区等级超越数  <br>**样例** : `"string"`|string|
|**orderCount**  <br>*可选*|用户订单数  <br>**样例** : `0`|integer (int32)|
|**purchasesBeyondPercent**  <br>*可选*|消费等级超越数  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="extraservice"></a>
### ExtraService

|名称|说明|类型|
|---|---|---|
|**yiyu8**  <br>*可选*|叫车服务  <br>**样例** : `"[yiyu8bean](#yiyu8bean)"`|[Yiyu8Bean](#yiyu8bean)|


<a name="favoritlistvo"></a>
### FavoritListVO

|名称|说明|类型|
|---|---|---|
|**newslist**  <br>*可选*|收藏列表  <br>**样例** : `[ "[newsfavoritebean](#newsfavoritebean)" ]`|< [NewsFavoriteBean](#newsfavoritebean) > array|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|记录总数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="feebean"></a>
### FeeBean

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|已经选择的数量  <br>**样例** : `0`|integer (int32)|
|**fee_name**  <br>*可选*|费用类型  <br>**样例** : `"string"`|string|
|**fee_price**  <br>*可选*|费用单价  <br>**样例** : `0.0`|number|
|**fee_type**  <br>*可选*|费用类型  <br>**样例** : `0`|integer (int32)|
|**fid**  <br>*可选*|其他费用id  <br>**样例** : `0`|integer (int32)|
|**required**  <br>*可选*|是否必选  <br>**样例** : `0`|integer (int32)|
|**requiredNum**  <br>*可选*|数量限制，0：不限数量;1：与出行人一致  <br>**样例** : `0`|integer (int32)|


<a name="feeitem"></a>
### FeeItem

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|**样例** : `0.0`|number|
|**count**  <br>*可选*|**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `0.0`|number|
|**returned**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|**样例** : `"string"`|string|


<a name="feevo"></a>
### FeeVO

|名称|说明|类型|
|---|---|---|
|**html**  <br>*可选*|**样例** : `"string"`|string|


<a name="filesitemvo"></a>
### FilesItemVo

|名称|说明|类型|
|---|---|---|
|**fid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**filePath**  <br>*可选*|**样例** : `"string"`|string|


<a name="film"></a>
### Film

|名称|说明|类型|
|---|---|---|
|**film**  <br>*可选*|视频  <br>**样例** : `"[filmvo](#filmvo)"`|[FilmVO](#filmvo)|
|**newest_comment**  <br>*可选*|最新评论列表  <br>**样例** : `[ "[filmcommentbean](#filmcommentbean)" ]`|< [FilmCommentBean](#filmcommentbean) > array|
|**product**  <br>*可选*|线路列表  <br>**样例** : `[ "[productvo](#productvo)" ]`|< [ProductVO](#productvo) > array|


<a name="filmcommentbean"></a>
### FilmCommentBean

|名称|说明|类型|
|---|---|---|
|**comment_id**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**film_id**  <br>*可选*|视频id  <br>**样例** : `0`|integer (int32)|
|**from**  <br>*可选*|评论人  <br>**样例** : `"[usercommentvo](#usercommentvo)"`|[UserCommentVO](#usercommentvo)|
|**to**  <br>*可选*|被评论人  <br>**样例** : `"[usercommentvo](#usercommentvo)"`|[UserCommentVO](#usercommentvo)|


<a name="filmcommentdetailvo"></a>
### FilmCommentDetailVO

|名称|说明|类型|
|---|---|---|
|**comment_count**  <br>*可选*|总评论数  <br>**样例** : `0`|integer (int32)|
|**commentlist**  <br>*可选*|评论列表  <br>**样例** : `[ "[filmcommentbean](#filmcommentbean)" ]`|< [FilmCommentBean](#filmcommentbean) > array|
|**count_page**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**current_page**  <br>*可选*|当前页数  <br>**样例** : `0`|integer (int32)|
|**page_size**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="filmprojectvo"></a>
### FilmProjectVO

|名称|说明|类型|
|---|---|---|
|**current_page**  <br>*可选*|当前页数  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|视频列表  <br>**样例** : `[ "[filmvo](#filmvo)" ]`|< [FilmVO](#filmvo) > array|
|**total_page**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="filmtagvo"></a>
### FilmTagVO

|名称|说明|类型|
|---|---|---|
|**tag_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tag_name**  <br>*可选*|**样例** : `"string"`|string|


<a name="filmvo"></a>
### FilmVO

|名称|说明|类型|
|---|---|---|
|**comment_count**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int64)|
|**copyright**  <br>*可选*|版权  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**desc_html**  <br>*可选*|html描述  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|详情  <br>**样例** : `"string"`|string|
|**duration**  <br>*可选*|时长  <br>**样例** : `"string"`|string|
|**film_id**  <br>*可选*|视频id  <br>**样例** : `0`|integer (int32)|
|**full_tag**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**is_like**  <br>*可选*|是否喜欢  <br>**样例** : `0`|integer (int32)|
|**like_count**  <br>*可选*|喜欢数  <br>**样例** : `0`|integer (int64)|
|**location**  <br>*可选*|位置  <br>**样例** : `"string"`|string|
|**published_time**  <br>*可选*|发布时间  <br>**样例** : `"string"`|string|
|**qiniuSrcUrl**  <br>*可选*|七牛地址  <br>**样例** : `"string"`|string|
|**qiniu_src**  <br>*可选*|七牛列表  <br>**样例** : `[ "[qiniu](#qiniu)" ]`|< [Qiniu](#qiniu) > array|
|**qiniu_src_defualt**  <br>*可选*|七牛默认播放地址  <br>**样例** : `0`|integer (int32)|
|**scan_count**  <br>*可选*|播放量  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|
|**sourceType**  <br>*可选*|来源  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**vid**  <br>*可选*|视频vid  <br>**样例** : `"string"`|string|
|**video_html**  <br>*可选*|视频html  <br>**样例** : `"string"`|string|
|**view_app**  <br>*可选*|app浏览数  <br>**样例** : `0`|integer (int64)|
|**view_count**  <br>*可选*|浏览总数  <br>**样例** : `0`|integer (int64)|
|**view_m**  <br>*可选*|m站浏览数  <br>**样例** : `0`|integer (int64)|
|**view_pc**  <br>*可选*|pc浏览数  <br>**样例** : `0`|integer (int64)|
|**view_src**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**xid**  <br>*可选*|线路id  <br>**样例** : `"string"`|string|


<a name="filmlistvo"></a>
### FilmlistVO

|名称|说明|类型|
|---|---|---|
|**current_page**  <br>*可选*|当前页数  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|视频列表  <br>**样例** : `[ "[filmvo](#filmvo)" ]`|< [FilmVO](#filmvo) > array|
|**project_list**  <br>*可选*|视频专题列表  <br>**样例** : `[ "[projectbean](#projectbean)" ]`|< [ProjectBean](#projectbean) > array|
|**tag**  <br>*可选*|标签  <br>**样例** : `"[tagvo](#tagvo)"`|[TagVO](#tagvo)|
|**total_page**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="filtercondition"></a>
### FilterCondition

|名称|说明|类型|
|---|---|---|
|**distanceLocation**  <br>*可选*|**样例** : `[ "[keyvalue_1](#keyvalue_1)" ]`|< [KeyValue_1](#keyvalue_1) > array|
|**sortType**  <br>*可选*|**样例** : `[ "[keyvalue_1](#keyvalue_1)" ]`|< [KeyValue_1](#keyvalue_1) > array|


<a name="filterconditionbean"></a>
### FilterConditionBean

|名称|说明|类型|
|---|---|---|
|**departureDate**  <br>*可选*|**样例** : `[ "[keyvalue](#keyvalue)" ]`|< [KeyValue](#keyvalue) > array|
|**price**  <br>*可选*|**样例** : `[ "[keyvalue](#keyvalue)" ]`|< [KeyValue](#keyvalue) > array|
|**travelFilter**  <br>*可选*|**样例** : `[ "[keyvalue](#keyvalue)" ]`|< [KeyValue](#keyvalue) > array|
|**travelSort**  <br>*可选*|**样例** : `[ "[keyvalue](#keyvalue)" ]`|< [KeyValue](#keyvalue) > array|
|**tripDays**  <br>*可选*|**样例** : `[ "[keyvalue](#keyvalue)" ]`|< [KeyValue](#keyvalue) > array|


<a name="filterinfo"></a>
### FilterInfo

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|1 为替换词  2为敏感词  <br>**样例** : `0`|integer (int32)|
|**words**  <br>*可选*|词  <br>**样例** : `[ "string" ]`|< string > array|


<a name="flashvo"></a>
### FlashVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|跳转链接地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="floatingadvo"></a>
### FloatingAdVo

|名称|说明|类型|
|---|---|---|
|**exp**  <br>*可选*|到期时间，0表示永久有效  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|目标类型  <br>**样例** : `"string"`|string|
|**jsonUrl**  <br>*可选*|json地址  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|广告图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型：1首页2遇见3社区4APP攻略详情5APP游记详情6APP目的地详情7APP遇见详情  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|目标参数  <br>**样例** : `"string"`|string|


<a name="followedtopicvo"></a>
### FollowedTopicVO

|名称|说明|类型|
|---|---|---|
|**bigimg**  <br>*可选*|话题头图  <br>**样例** : `"string"`|string|
|**bigimgType**  <br>*可选*|话题头图类型1 通用背景型（简介覆盖在图片之上）2 广告突出型（简介在图片区域下方）  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|说明  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|说明--安卓分享用  <br>**样例** : `"string"`|string|
|**detailHandler**  <br>*可选*|简介跳转协议  <br>**样例** : `"string"`|string|
|**detailTargetUrl**  <br>*可选*|简介跳转url  <br>**样例** : `"string"`|string|
|**did**  <br>*可选*|**样例** : `0`|integer (int32)|
|**discoverCount**  <br>*可选*|遇见数  <br>**样例** : `"string"`|string|
|**discu_id**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**followNum**  <br>*可选*|关注人数  <br>**样例** : `"string"`|string|
|**followed**  <br>*可选*|0未关注  1已关注  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|链接跳转类型  <br>**样例** : `"string"`|string|
|**hot**  <br>*可选*|1为显示hot标签 0为普通  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**joinNum**  <br>*可选*|参与人数  <br>**样例** : `"string"`|string|
|**reward**  <br>*可选*|1为有奖 0为普通  <br>**样例** : `0`|integer (int32)|
|**rewardBanners**  <br>*可选*|奖品banner  <br>**样例** : `[ "string" ]`|< string > array|
|**target_url**  <br>*可选*|链接地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 0普通 1 推荐 2征集  <br>**样例** : `0`|integer (int32)|
|**updateCount**  <br>*可选*|多少条更新  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|


<a name="friendbasevo"></a>
### FriendBaseVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|出生城市  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**province**  <br>*可选*|出生省份  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真是姓名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|用户关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|**样例** : `"string"`|string|
|**tagList**  <br>*可选*|**样例** : `[ "[tag_1](#tag_1)" ]`|< [Tag_1](#tag_1) > array|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="from"></a>
### From

|名称|说明|类型|
|---|---|---|
|**headImage**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="fromtobean"></a>
### FromToBean

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|评论人头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**create_time**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|等级  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|评论人id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|评论人名称  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|身份列表  <br>**样例** : `[ "[certificationmodel](#certificationmodel)" ]`|< [CertificationModel](#certificationmodel) > array|


<a name="gdlocationbean"></a>
### GdLocationBean

|名称|说明|类型|
|---|---|---|
|**lat**  <br>*可选*|经度  <br>**样例** : `0.0`|number (double)|
|**lng**  <br>*可选*|纬度  <br>**样例** : `0.0`|number (double)|


<a name="golddetailvo"></a>
### GoldDetailVo

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|**样例** : `[ "[newdetailvo](#newdetailvo)" ]`|< [NewDetailVo](#newdetailvo) > array|
|**timeGroup**  <br>*可选*|**样例** : `"string"`|string|
|**timeGroupStamp**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="goldvo"></a>
### GoldVo

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|**样例** : `[ "[golddetailvo](#golddetailvo)" ]`|< [GoldDetailVo](#golddetailvo) > array|
|**overdueTip**  <br>*可选*|游侠币过期提示语，例如：您有1888游侠币将于2020年12月31日过期，花掉别浪费哦~  <br>**样例** : `"string"`|string|
|**overdueYxk**  <br>*可选*|游侠币过期，用于页面突出显示，例如：1888  <br>**样例** : `"string"`|string|
|**total**  <br>*可选*|总积分  <br>**样例** : `0.0`|number|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="group"></a>
### Group

|名称|说明|类型|
|---|---|---|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|


<a name="groupmemberinfovo"></a>
### GroupMemberInfoVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**edit_notice**  <br>*可选*|是否有权编辑群公告,1为可以，0为不可以  <br>**样例** : `0`|integer (int32)|
|**gnick**  <br>*可选*|群成员昵称  <br>**样例** : `"string"`|string|
|**groupid**  <br>*可选*|群id  <br>**样例** : `0`|integer (int32)|
|**is_admin**  <br>*可选*|是否为管理员  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|


<a name="groupmembersvo"></a>
### GroupMembersVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**bio**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**gnick**  <br>*可选*|用户群昵称  <br>**样例** : `"string"`|string|
|**is_gag**  <br>*可选*|是否禁言  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|用户关系  <br>**样例** : `"string"`|string|
|**role**  <br>*可选*|群角色  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|


<a name="groupmemberswrapvo"></a>
### GroupMembersWrapVo

|名称|说明|类型|
|---|---|---|
|**memberList**  <br>*可选*|群成员  <br>**样例** : `[ "[groupmembersvo](#groupmembersvo)" ]`|< [GroupMembersVo](#groupmembersvo) > array|
|**total**  <br>*可选*|总数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="groupslistitemvo"></a>
### GroupsListItemVO

|名称|说明|类型|
|---|---|---|
|**gid**  <br>*可选*|**样例** : `"string"`|string|
|**groupname**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|1：群有分享会 0：没有  <br>**样例** : `0`|integer (int32)|


<a name="groupslistvo"></a>
### GroupsListVO

|名称|说明|类型|
|---|---|---|
|**groupsList**  <br>*可选*|群列表  <br>**样例** : `[ "[groupslistitemvo](#groupslistitemvo)" ]`|< [GroupsListItemVO](#groupslistitemvo) > array|
|**lastShareID**  <br>*可选*|最近的参加的分享会  <br>**样例** : `0`|integer (int32)|
|**shareList**  <br>*可选*|分享会列表  <br>**样例** : `[ "[groupslistitemvo](#groupslistitemvo)" ]`|< [GroupsListItemVO](#groupslistitemvo) > array|


<a name="hwproductsvo"></a>
### HWProductsVo

|名称|说明|类型|
|---|---|---|
|**filters**  <br>*可选*|筛选条件  <br>**样例** : `{<br>  "string" : "[channelfilterdetailvo](#channelfilterdetailvo)"<br>}`|< string, [ChannelFilterDetailVo](#channelfilterdetailvo) > map|
|**products**  <br>*可选*|**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="hashmap"></a>
### HashMap
*类型* : < string, object > map


<a name="f291bcceeeed1243ec77ad00668a1691"></a>
### HashMap«string,object»
*类型* : < string, object > map


<a name="historyduobaovo"></a>
### HistoryDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**openTime**  <br>*可选*|开奖时间  <br>**样例** : `0`|integer (int64)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**stake**  <br>*可选*|已投注数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1筹集中  2 待开奖 3已开奖  4 筹集失败  <br>**样例** : `0`|integer (int32)|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|


<a name="holidaybean"></a>
### HolidayBean

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|节日名称  <br>**样例** : `"string"`|string|


<a name="hottagvo"></a>
### HotTagVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|标签列表  <br>**样例** : `[ "[tags](#tags)" ]`|< [Tags](#tags) > array|


<a name="hoteldetailfirstvo"></a>
### HotelDetailFirstVo

|名称|说明|类型|
|---|---|---|
|**hotelInfoItemList**  <br>*可选*|酒店基础信息  <br>**样例** : `[ "[hotelinfoitem](#hotelinfoitem)" ]`|< [HotelInfoItem](#hotelinfoitem) > array|
|**hotelName**  <br>*可选*|酒店名称  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**photoAlbumList**  <br>*可选*|相册  <br>**样例** : `[ "[photoalbum](#photoalbum)" ]`|< [PhotoAlbum](#photoalbum) > array|
|**placeType**  <br>*可选*|1国内2国外  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|酒店介绍（富文本）  <br>**样例** : `"string"`|string|


<a name="hoteldetailsecondvo"></a>
### HotelDetailSecondVo

|名称|说明|类型|
|---|---|---|
|**hotelFacilityList**  <br>*可选*|酒店设施信息  <br>**样例** : `[ "[hoteltagvo](#hoteltagvo)" ]`|< [HotelTagVo](#hoteltagvo) > array|
|**hotelPolicyList**  <br>*可选*|酒店政策信息  <br>**样例** : `[ "[hotelpolicyvo](#hotelpolicyvo)" ]`|< [HotelPolicyVo](#hotelpolicyvo) > array|


<a name="hoteldetailvo"></a>
### HotelDetailVo

|名称|说明|类型|
|---|---|---|
|**hotelDetailFirst**  <br>*可选*|图文详情  <br>**样例** : `"[hoteldetailfirstvo](#hoteldetailfirstvo)"`|[HotelDetailFirstVo](#hoteldetailfirstvo)|
|**hotelDetailSecond**  <br>*可选*|设施政策  <br>**样例** : `"[hoteldetailsecondvo](#hoteldetailsecondvo)"`|[HotelDetailSecondVo](#hoteldetailsecondvo)|


<a name="hotelevaluationaddtagvo"></a>
### HotelEvaluationAddTagVo

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|评价提示  <br>**样例** : `"string"`|string|
|**stars**  <br>*可选*|评价星级  <br>**样例** : `[ "[b772dec241f8f78572c369d8e25e00d9](#b772dec241f8f78572c369d8e25e00d9)" ]`|< [Map«string,List«Map«string,object»»»](#b772dec241f8f78572c369d8e25e00d9) > array|
|**tips**  <br>*可选*|评价默认内容  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|标签类型：4产品5酒店  <br>**样例** : `0`|integer (int32)|


<a name="hotelevaluationaddvo"></a>
### HotelEvaluationAddVo

|名称|说明|类型|
|---|---|---|
|**amount_tips**  <br>*可选*|代金券提示语  <br>**样例** : `"string"`|string|
|**color**  <br>*可选*|文字底色  <br>**样例** : `"string"`|string|
|**html**  <br>*可选*|评价帮助页面内容  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**ruleTips**  <br>*可选*|规则提示语  <br>**样例** : `"string"`|string|
|**ruleUrl**  <br>*可选*|规则详情url  <br>**样例** : `"string"`|string|
|**shareTips**  <br>*可选*|分享提示语  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|产品星级  <br>**样例** : `[ "[hotelevaluationaddtagvo](#hotelevaluationaddtagvo)" ]`|< [HotelEvaluationAddTagVo](#hotelevaluationaddtagvo) > array|
|**thanks_tips**  <br>*可选*|奖励提示语  <br>**样例** : `"string"`|string|
|**tips1**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**tips2**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|


<a name="hotelevaluationtags"></a>
### HotelEvaluationTags

|名称|说明|类型|
|---|---|---|
|**n**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|**样例** : `"string"`|string|


<a name="hotelevaluationlistvo"></a>
### HotelEvaluationlistVo

|名称|说明|类型|
|---|---|---|
|**classType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**commentlist**  <br>*可选*|**样例** : `[ "[hotelfavoritedetailvo](#hotelfavoritedetailvo)" ]`|< [HotelFavoriteDetailVo](#hotelfavoritedetailvo) > array|
|**isMore**  <br>*可选*|**样例** : `true`|boolean|
|**page**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|**样例** : `[ "[hotelevaluationtags](#hotelevaluationtags)" ]`|< [HotelEvaluationTags](#hotelevaluationtags) > array|
|**total**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="hotelfavoritedetailstarvo"></a>
### HotelFavoriteDetailStarVo

|名称|说明|类型|
|---|---|---|
|**classId**  <br>*可选*|评价类型  <br>**样例** : `0`|integer (int32)|
|**class_type**  <br>*可选*|评价类型名称  <br>**样例** : `"string"`|string|
|**color**  <br>*可选*|颜色  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评价内容  <br>**样例** : `"string"`|string|
|**star**  <br>*可选*|评价好坏  <br>**样例** : `"string"`|string|
|**starLevel**  <br>*可选*|评价星级  <br>**样例** : `0`|integer (int32)|


<a name="hotelfavoritedetailvo"></a>
### HotelFavoriteDetailVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评价时间  <br>**样例** : `0`|integer (int64)|
|**channel**  <br>*可选*|来源1:app;2:pc；  <br>**样例** : `0`|integer (int32)|
|**dateStr**  <br>*可选*|评价日期字符串  <br>**样例** : `"string"`|string|
|**highQuality**  <br>*可选*|是否优质评价  <br>**样例** : `0`|integer (int32)|
|**hotelName**  <br>*可选*|酒店名称  <br>**样例** : `"string"`|string|
|**imgs**  <br>*可选*|评价图片  <br>**样例** : `[ "[imagevo_1](#imagevo_1)" ]`|< [ImageVO_1](#imagevo_1) > array|
|**productName**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**qid**  <br>*可选*|评价id  <br>**样例** : `0`|integer (int32)|
|**reply**  <br>*可选*|回复内容  <br>**样例** : `"string"`|string|
|**replytime**  <br>*可选*|回复时间  <br>**样例** : `"string"`|string|
|**roomName**  <br>*可选*|房型名称  <br>**样例** : `"string"`|string|
|**stars**  <br>*可选*|评价星级  <br>**样例** : `[ "[hotelfavoritedetailstarvo](#hotelfavoritedetailstarvo)" ]`|< [HotelFavoriteDetailStarVo](#hotelfavoritedetailstarvo) > array|
|**timeStr**  <br>*可选*|评价时间字符串  <br>**样例** : `"string"`|string|
|**user**  <br>*可选*|评论用户  <br>**样例** : `"[pjuser](#pjuser)"`|[PjUSer](#pjuser)|


<a name="hotelinfoitem"></a>
### HotelInfoItem

|名称|说明|类型|
|---|---|---|
|**describe**  <br>*可选*|标题例如：2016  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题例如：开业年份：  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1开业年份2地址3电话4传真  <br>**样例** : `0`|integer (int32)|


<a name="hotelpolicyvo"></a>
### HotelPolicyVo

|名称|说明|类型|
|---|---|---|
|**describe**  <br>*可选*|描述，例如：当天9点后入住  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题，例如：入住时间  <br>**样例** : `"string"`|string|


<a name="hotelroompkgvo"></a>
### HotelRoomPkgVo

|名称|说明|类型|
|---|---|---|
|**difPrice**  <br>*可选*|房型套餐与之前选择的相差价格，例如：-￥30  <br>**样例** : `"string"`|string|
|**isAvailable**  <br>*可选*|用于更换房型时显示是否满房，0满房  <br>**样例** : `0`|integer (int32)|
|**maxPersonNum**  <br>*可选*|房型套餐单间支持最大成人数  <br>**样例** : `0`|integer (int32)|
|**pkgRemark**  <br>*可选*|房型套餐描述  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|房型套餐单价纯数字  <br>**样例** : `0.0`|number|
|**roomPkgDes**  <br>*可选*|房型套餐简要描述  <br>**样例** : `[ "string" ]`|< string > array|
|**roomPkgId**  <br>*可选*|房型套餐id  <br>**样例** : `0`|integer (int32)|
|**roomPkgName**  <br>*可选*|房型套餐名称  <br>**样例** : `"string"`|string|
|**roomTagDownList**  <br>*可选*|房型标签下部分  <br>**样例** : `[ "[hoteltagvo](#hoteltagvo)" ]`|< [HotelTagVo](#hoteltagvo) > array|
|**roomTagUpList**  <br>*可选*|房型标签上部分，按左右左右放  <br>**样例** : `[ "[hoteltagvo](#hoteltagvo)" ]`|< [HotelTagVo](#hoteltagvo) > array|
|**selected**  <br>*可选*|是否已选择：1已选0未选  <br>**样例** : `0`|integer (int32)|
|**selectedNum**  <br>*可选*|房型套餐选择数量  <br>**样例** : `0`|integer (int32)|
|**unitName**  <br>*可选*|单位名称，例如：间  <br>**样例** : `"string"`|string|


<a name="hotelroomvo"></a>
### HotelRoomVo

|名称|说明|类型|
|---|---|---|
|**roomDes**  <br>*可选*|房型简要描述  <br>**样例** : `[ "string" ]`|< string > array|
|**roomId**  <br>*可选*|房型id  <br>**样例** : `0`|integer (int32)|
|**roomImages**  <br>*可选*|房型图片列表  <br>**样例** : `[ "string" ]`|< string > array|
|**roomName**  <br>*可选*|房型名称  <br>**样例** : `"string"`|string|
|**roomPkgList**  <br>*可选*|房型套餐  <br>**样例** : `[ "[hotelroompkgvo](#hotelroompkgvo)" ]`|< [HotelRoomPkgVo](#hotelroompkgvo) > array|


<a name="hoteltagvo"></a>
### HotelTagVo

|名称|说明|类型|
|---|---|---|
|**describeList**  <br>*可选*|描述  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="hotelthemesmodel"></a>
### HotelThemesModel

|名称|说明|类型|
|---|---|---|
|**subThemes**  <br>*可选*|**样例** : `"[subthemesmodel](#subthemesmodel)"`|[SubThemesModel](#subthemesmodel)|
|**tagId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tagName**  <br>*可选*|**样例** : `"string"`|string|


<a name="hoteltbasicmodel"></a>
### HoteltBasicModel

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|成人价格  <br>**样例** : `0.0`|number|
|**class_theme_id**  <br>*可选*|主题  <br>**样例** : `0`|integer (int32)|
|**days_label**  <br>*可选*|活动几天几夜  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**name**  <br>*可选*|一级分类名称  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|出发地或者集合地  <br>**样例** : `"string"`|string|
|**price_label**  <br>*可选*|价格标签  <br>**样例** : `"string"`|string|
|**product_cat**  <br>*可选*|如：深度游  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|类型 如 跟团游  <br>**样例** : `"string"`|string|
|**shortTitle**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**sub**  <br>*可选*|二级分类  <br>**样例** : `"[sub](#sub)"`|[Sub](#sub)|
|**sub_name**  <br>*可选*|副表题  <br>**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|一级分类id  <br>**样例** : `0`|integer (int32)|
|**target_type**  <br>*可选*|类型  <br>**样例** : `"string"`|string|
|**target_url**  <br>*可选*|目标url  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**type_label**  <br>*可选*|酒套类型标签  <br>**样例** : `"string"`|string|


<a name="htagbean"></a>
### HtagBean

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|标签对象  <br>**样例** : `"[orderbean](#orderbean)"`|[OrderBean](#orderbean)|


<a name="htmlvo"></a>
### HtmlVO

|名称|说明|类型|
|---|---|---|
|**html**  <br>*可选*|**样例** : `"string"`|string|


<a name="imgroupdetailvo"></a>
### ImGroupDetailVO

|名称|说明|类型|
|---|---|---|
|**gid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**groupimg**  <br>*可选*|**样例** : `"string"`|string|
|**groupname**  <br>*可选*|**样例** : `"string"`|string|
|**groupnotice**  <br>*可选*|**样例** : `"string"`|string|
|**in_group**  <br>*可选*|是否在群 1是 0不是  <br>**样例** : `0`|integer (int32)|
|**in_share**  <br>*可选*|是否在分享会  <br>**样例** : `0`|integer (int32)|
|**isOpenShare**  <br>*可选*|是否在分享会  <br>**样例** : `0`|integer (int32)|
|**last_update**  <br>*可选*|**样例** : `"[lastupdatenoticeuserinfovo](#lastupdatenoticeuserinfovo)"`|[LastUpdateNoticeUserInfoVO](#lastupdatenoticeuserinfovo)|
|**nums**  <br>*可选*|**样例** : `0`|integer (int32)|
|**shareTip**  <br>*可选*|分享会开始提示  <br>**样例** : `"string"`|string|
|**sid**  <br>*可选*|分享会id  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|分享会状态 1:开始 0:未开始  <br>**样例** : `0`|integer (int32)|
|**uids**  <br>*可选*|**样例** : `"string"`|string|
|**update_time**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="imgroupmemberinfodetailvo"></a>
### ImGroupMemberInfoDetailVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**edit_notice**  <br>*可选*|**样例** : `0`|integer (int32)|
|**gnick**  <br>*可选*|**样例** : `"string"`|string|
|**groupid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**is_admin**  <br>*可选*|**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="imgroupprovidervo"></a>
### ImGroupProviderVO

|名称|说明|类型|
|---|---|---|
|**gid**  <br>*可选*|**样例** : `"string"`|string|
|**groupimg**  <br>*可选*|**样例** : `"string"`|string|
|**groupname**  <br>*可选*|**样例** : `"string"`|string|
|**in_group**  <br>*可选*|是否在群 1是 0不是  <br>**样例** : `0`|integer (int32)|


<a name="imgroupprovidervo_1"></a>
### ImGroupProviderVO_1

|名称|说明|类型|
|---|---|---|
|**gid**  <br>*可选*|**样例** : `"string"`|string|
|**groupimg**  <br>*可选*|**样例** : `"string"`|string|
|**groupname**  <br>*可选*|**样例** : `"string"`|string|


<a name="imsharedetailvo"></a>
### ImShareDetailVO

|名称|说明|类型|
|---|---|---|
|**groupId**  <br>*可选*|入口群id  <br>**样例** : `0`|integer (int32)|
|**guestUidList**  <br>*可选*|嘉宾id  <br>**样例** : `[ "string" ]`|< string > array|
|**hostUidList**  <br>*可选*|主持人id  <br>**样例** : `[ "string" ]`|< string > array|
|**host_group**  <br>*可选*|嘉宾主持人群id  <br>**样例** : `"string"`|string|
|**imShareId**  <br>*可选*|分享会id  <br>**样例** : `0`|integer (int32)|
|**imgList**  <br>*可选*|图片  <br>**样例** : `[ "string" ]`|< string > array|
|**statisId**  <br>*可选*|统计id  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|状态 1.进行中   2.回放中  <br>**最小值** : `-128`  <br>**最大值** : `127`  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|分享会名称  <br>**样例** : `"string"`|string|
|**userCount**  <br>*可选*|讨论区消息总数  <br>**样例** : `0`|integer (int32)|
|**user_group**  <br>*可选*|用户群id  <br>**样例** : `"string"`|string|


<a name="imsharereviewlistvo"></a>
### ImShareReviewListVO

|名称|说明|类型|
|---|---|---|
|**groupId**  <br>*可选*|对应群聊ID  <br>**样例** : `0`|integer (int32)|
|**imshare_id**  <br>*可选*|分享会直播间的ID  <br>**样例** : `0`|integer (int32)|
|**published_time**  <br>*可选*|分享会日期  <br>**样例** : `"string"`|string (date-time)|
|**thumb**  <br>*可选*|分享会直播间封面  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|分享会直播间标题  <br>**样例** : `"string"`|string|


<a name="imuserprovidervo"></a>
### ImUserProviderVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**nick**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `"string"`|string|


<a name="imagesizeinfo"></a>
### ImageSizeInfo

|名称|说明|类型|
|---|---|---|
|**height**  <br>*可选*|**样例** : `"string"`|string|
|**width**  <br>*可选*|**样例** : `"string"`|string|


<a name="imagevo"></a>
### ImageVO

|名称|说明|类型|
|---|---|---|
|**height**  <br>*可选*|高度  <br>**样例** : `0`|integer (int32)|
|**labels_info**  <br>*可选*|labels_info  <br>**样例** : `[ "[labelinfovo](#labelinfovo)" ]`|< [LabelInfoVO](#labelinfovo) > array|
|**shareUrl**  <br>*可选*|分享地址  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**url_l**  <br>*可选*|url_l  <br>**样例** : `"string"`|string|
|**url_m**  <br>*可选*|url_m  <br>**样例** : `"string"`|string|
|**url_xl**  <br>*可选*|url_xl  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|宽度  <br>**样例** : `0`|integer (int32)|


<a name="imagevo_1"></a>
### ImageVO_1

|名称|说明|类型|
|---|---|---|
|**height**  <br>*可选*|高度  <br>**样例** : `0`|integer (int32)|
|**labels_info**  <br>*可选*|labels_info  <br>**样例** : `[ "[labelinfovo_1](#labelinfovo_1)" ]`|< [LabelInfoVO_1](#labelinfovo_1) > array|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**url_l**  <br>*可选*|url_l  <br>**样例** : `"string"`|string|
|**url_m**  <br>*可选*|url_m  <br>**样例** : `"string"`|string|
|**url_xl**  <br>*可选*|url_xl  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|宽度  <br>**样例** : `0`|integer (int32)|


<a name="indexaroundlumplocal"></a>
### IndexAroundLumpLocal

|名称|说明|类型|
|---|---|---|
|**downList**  <br>*可选*|下部分  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**upList**  <br>*可选*|上部分  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|


<a name="indexaroundlumptab"></a>
### IndexAroundLumpTab

|名称|说明|类型|
|---|---|---|
|**selected**  <br>*可选*|是否选择  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1周末去哪儿2当地玩乐  <br>**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|typeName  <br>**样例** : `"string"`|string|


<a name="indexaroundlumpvo"></a>
### IndexAroundLumpVo

|名称|说明|类型|
|---|---|---|
|**local**  <br>*可选*|type为2时加载的数据  <br>**样例** : `"[indexaroundlumplocal](#indexaroundlumplocal)"`|[IndexAroundLumpLocal](#indexaroundlumplocal)|
|**tabList**  <br>*可选*|tab切换  <br>**样例** : `[ "[indexaroundlumptab](#indexaroundlumptab)" ]`|< [IndexAroundLumpTab](#indexaroundlumptab) > array|
|**weekList**  <br>*可选*|type为1时加载的数据  <br>**样例** : `[ "[indexaroundlumpweek](#indexaroundlumpweek)" ]`|< [IndexAroundLumpWeek](#indexaroundlumpweek) > array|


<a name="indexaroundlumpweek"></a>
### IndexAroundLumpWeek

|名称|说明|类型|
|---|---|---|
|**moreJump**  <br>*可选*|更多跳转  <br>**样例** : `"[indexhandleritemvo](#indexhandleritemvo)"`|[IndexHandlerItemVo](#indexhandleritemvo)|
|**productList**  <br>*可选*|线路列表  <br>**样例** : `[ "[indexproductitemvo](#indexproductitemvo)" ]`|< [IndexProductItemVo](#indexproductitemvo) > array|
|**title**  <br>*可选*|本周活动/下周活动  <br>**样例** : `"string"`|string|


<a name="indexdestination"></a>
### IndexDestination

|名称|说明|类型|
|---|---|---|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tabList**  <br>*可选*|tab切换  <br>**样例** : `[ "[indexdestinationtab](#indexdestinationtab)" ]`|< [IndexDestinationTab](#indexdestinationtab) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="indexdestinationtab"></a>
### IndexDestinationTab

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|目的地推荐  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**selected**  <br>*可选*|是否选择  <br>**样例** : `0`|integer (int32)|
|**tabName**  <br>*可选*|tabName  <br>**样例** : `"string"`|string|


<a name="indexflowitemvo"></a>
### IndexFlowItemVo

|名称|说明|类型|
|---|---|---|
|**dataDetail**  <br>*可选*|数据内容  <br>**样例** : `"object"`|object|
|**identityCode**  <br>*可选*|唯一标识  <br>**样例** : `"string"`|string|
|**indexFlowBangdanVo**  <br>*可选*|api文档字段显示用，4  <br>**样例** : `"[26211fe73d4c0d64b89f84a9ab2becc4](#26211fe73d4c0d64b89f84a9ab2becc4)"`|[瀑布流-榜单](#26211fe73d4c0d64b89f84a9ab2becc4)|
|**indexFlowChannelVo**  <br>*可选*|api文档字段显示用，10  <br>**样例** : `"[8ee2164a46f04fa4907ffd0b66ed7393](#8ee2164a46f04fa4907ffd0b66ed7393)"`|[瀑布流-频道引导](#8ee2164a46f04fa4907ffd0b66ed7393)|
|**indexFlowDiscoverVo**  <br>*可选*|api文档字段显示用，8  <br>**样例** : `"[93d4285e55a84bf81fdbbdcec0c32b38](#93d4285e55a84bf81fdbbdcec0c32b38)"`|[瀑布流-遇见](#93d4285e55a84bf81fdbbdcec0c32b38)|
|**indexFlowFilmVo**  <br>*可选*|api文档字段显示用，9  <br>**样例** : `"[f8a769f0258a2040cb48e81b6a97de3c](#f8a769f0258a2040cb48e81b6a97de3c)"`|[瀑布流-视频](#f8a769f0258a2040cb48e81b6a97de3c)|
|**indexFlowMddVo**  <br>*可选*|api文档字段显示用，7  <br>**样例** : `"[c34f42db49443c24259b5f590ab029a4](#c34f42db49443c24259b5f590ab029a4)"`|[瀑布流-目的地](#c34f42db49443c24259b5f590ab029a4)|
|**indexFlowNewsVo**  <br>*可选*|api文档字段显示用，6  <br>**样例** : `"[24334c3f36be041b6e63aab0a09f2b4d](#24334c3f36be041b6e63aab0a09f2b4d)"`|[瀑布流-攻略](#24334c3f36be041b6e63aab0a09f2b4d)|
|**indexFlowProductVo**  <br>*可选*|api文档字段显示用，1、2  <br>**样例** : `"[c821dd8e1e8fe318546a114f9cda8557](#c821dd8e1e8fe318546a114f9cda8557)"`|[瀑布流-线路或者酒套_1](#c821dd8e1e8fe318546a114f9cda8557)|
|**indexFlowTravelarticleVo**  <br>*可选*|api文档字段显示用，5  <br>**样例** : `"[4bc747f446fe11cbd9ed2378a732f644](#4bc747f446fe11cbd9ed2378a732f644)"`|[瀑布流-侠魁游记](#4bc747f446fe11cbd9ed2378a732f644)|
|**indexFlowVoucherVo**  <br>*可选*|api文档字段显示用，11  <br>**样例** : `"[89d1f32b205b128dbb4fc4539183c9be](#89d1f32b205b128dbb4fc4539183c9be)"`|[瀑布流-房券引导](#89d1f32b205b128dbb4fc4539183c9be)|
|**indexFlowZhuantiVo**  <br>*可选*|api文档字段显示用，3  <br>**样例** : `"[6112942568e4385162840aabea263386](#6112942568e4385162840aabea263386)"`|[瀑布流-专题](#6112942568e4385162840aabea263386)|
|**type**  <br>*可选*|1活动2酒套3专题4榜单5游记6攻略7目的地8遇见9视频10频道引导11房券  <br>**样例** : `0`|integer (int32)|


<a name="indexflowtab"></a>
### IndexFlowTab

|名称|说明|类型|
|---|---|---|
|**channelList**  <br>*可选*|底部频道页入口  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选择  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|类型名称  <br>**样例** : `"string"`|string|


<a name="indexhandleritemvo"></a>
### IndexHandlerItemVo

|名称|说明|类型|
|---|---|---|
|**badgeImage**  <br>*可选*|图标地址  <br>**样例** : `"string"`|string|
|**exp**  <br>*可选*|过期日期时间戳，0表示永久  <br>**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**imageUrl**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**mediaImage**  <br>*可选*|视频封面地址  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**navType**  <br>*可选*|导航样式类型：2突出3new4hot  <br>**样例** : `0`|integer (int32)|
|**newSubTitle**  <br>*可选*|副标题---新UI  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|类型：1：线路；2：酒套  <br>**样例** : `0`|integer (int32)|
|**statisticsCode**  <br>*可选*|线路统计相关；搜索来源统计前缀，需要拼接上‘&pid’  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**subType**  <br>*可选*|搜索栏2级  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|搜索栏1级  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="indexipentity"></a>
### IndexIPEntity

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `"string"`|string|
|**country**  <br>*可选*|**样例** : `"string"`|string|
|**province**  <br>*可选*|**样例** : `"string"`|string|


<a name="indexminority"></a>
### IndexMinority

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|推荐位  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="indexproductitemvo"></a>
### IndexProductItemVo

|名称|说明|类型|
|---|---|---|
|**applyColour**  <br>*可选*|报名状态颜色  <br>**样例** : `"string"`|string|
|**applyName**  <br>*可选*|报名状态名称  <br>**样例** : `"string"`|string|
|**days**  <br>*可选*|活动天数  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格，不带￥和起字，可能：免费，预报名  <br>**样例** : `"string"`|string|
|**productName**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**simpleName**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|


<a name="indexrecommend"></a>
### IndexRecommend

|名称|说明|类型|
|---|---|---|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**recommend**  <br>*可选*|推荐  <br>**样例** : `"[indexhandleritemvo](#indexhandleritemvo)"`|[IndexHandlerItemVo](#indexhandleritemvo)|
|**recommendList**  <br>*可选*|推荐列表  <br>**样例** : `[ "[indexhandleritemvo](#indexhandleritemvo)" ]`|< [IndexHandlerItemVo](#indexhandleritemvo) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="indexsaleproductitemvo"></a>
### IndexSaleProductItemVo

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**overTime**  <br>*可选*|距离结束时间秒数  <br>**样例** : `0`|integer (int64)|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|例如：杭州出发  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格，不带￥和起字，可能出现免费  <br>**样例** : `"string"`|string|
|**priceOtherLabel**  <br>*可选*|价格，不带￥和起字，划线价格  <br>**样例** : `"string"`|string|
|**productName**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**saleAmount**  <br>*可选*|例如：立减￥100  <br>**样例** : `"string"`|string|
|**startTime**  <br>*可选*|距离开始时间秒数  <br>**样例** : `0`|integer (int64)|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|0距离开始1距离结束  <br>**样例** : `0`|integer (int32)|
|**stockLabel**  <br>*可选*|例如：仅剩9个  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|例如：限时特惠  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转链接地址  <br>**样例** : `"string"`|string|


<a name="insuranceaccountchangerq"></a>
### InsuranceAccountChangeRQ

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**sign**  <br>*可选*|**样例** : `"string"`|string|


<a name="insurancebean"></a>
### InsuranceBean

|名称|说明|类型|
|---|---|---|
|**cancelList**  <br>*可选*|取消险列表  <br>**样例** : `"[insurancelistbean](#insurancelistbean)"`|[InsuranceListBean](#insurancelistbean)|
|**desc**  <br>*可选*|保险描述  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|投保提示  <br>**样例** : `"string"`|string|
|**tip_url**  <br>*可选*|投保提示url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|保险标题  <br>**样例** : `"string"`|string|
|**title_tip**  <br>*可选*|保险副标题  <br>**样例** : `"string"`|string|
|**travelList**  <br>*可选*|旅游险列表  <br>**样例** : `"[insurancelistbean](#insurancelistbean)"`|[InsuranceListBean](#insurancelistbean)|
|**url**  <br>*可选*|保险说明  <br>**样例** : `"string"`|string|


<a name="insurancebean_1"></a>
### InsuranceBean_1

|名称|说明|类型|
|---|---|---|
|**buyInfo**  <br>*可选*|保险购买信息  <br>**样例** : `"[insurancebuybean](#insurancebuybean)"`|[InsuranceBuyBean](#insurancebuybean)|
|**detail**  <br>*可选*|保险信息，包含已购买  <br>**样例** : `"[insuranceinfobean](#insuranceinfobean)"`|[InsuranceInfoBean](#insuranceinfobean)|


<a name="insurancebuybean"></a>
### InsuranceBuyBean

|名称|说明|类型|
|---|---|---|
|**buy**  <br>*可选*|是否要购买保险  <br>**样例** : `0`|integer (int32)|
|**buy_tip**  <br>*可选*|购买旅游险，旅行更安心  <br>**样例** : `"string"`|string|
|**hideBtn**  <br>*可选*|是否隐藏购买按钮  <br>**样例** : `0`|integer (int32)|


<a name="insurancedatabean"></a>
### InsuranceDataBean

|名称|说明|类型|
|---|---|---|
|**insurance_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `0.0`|number|
|**select**  <br>*可选*|是否选中 1是 0不是  <br>**样例** : `0`|integer (int32)|
|**show**  <br>*可选*|是否默认显示 1是 0不是  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="insuranceinfobean"></a>
### InsuranceInfoBean

|名称|说明|类型|
|---|---|---|
|**advice**  <br>*可选*|出险咨询 1显示 0隐藏  <br>**样例** : `0`|integer (int32)|
|**advice_title**  <br>*可选*|出险咨询标题  <br>**样例** : `"string"`|string|
|**list**  <br>*可选*|保险列表  <br>**样例** : `[ "[insurancememberinfobean](#insurancememberinfobean)" ]`|< [InsuranceMemberInfoBean](#insurancememberinfobean) > array|
|**title**  <br>*可选*|例如：保险信息  <br>**样例** : `"string"`|string|
|**title_tip**  <br>*可选*|例如：(支付成功即投保)  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|投保提示url  <br>**样例** : `"string"`|string|


<a name="insurancelistbean"></a>
### InsuranceListBean

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[insurancedatabean](#insurancedatabean)" ]`|< [InsuranceDataBean](#insurancedatabean) > array|
|**multi**  <br>*可选*|是否多选 1多选  <br>**样例** : `0`|integer (int32)|
|**shownum**  <br>*可选*|默认显示数量  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="insurancememberinfobean"></a>
### InsuranceMemberInfoBean

|名称|说明|类型|
|---|---|---|
|**insurance_id**  <br>*可选*|保险id  <br>**样例** : `0`|integer (int32)|
|**members**  <br>*可选*|购买的出行人  <br>**样例** : `[ "[membersinfobean](#membersinfobean)" ]`|< [MembersInfoBean](#membersinfobean) > array|
|**name**  <br>*可选*|保险名称  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|购买数量  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|保险价格  <br>**样例** : `0.0`|number|


<a name="integraldetailvo"></a>
### IntegralDetailVo

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|**样例** : `[ "[newdetailvo](#newdetailvo)" ]`|< [NewDetailVo](#newdetailvo) > array|
|**timeGroup**  <br>*可选*|**样例** : `"string"`|string|
|**timeGroupStamp**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="integralvo"></a>
### IntegralVo

|名称|说明|类型|
|---|---|---|
|**details**  <br>*可选*|**样例** : `[ "[integraldetailvo](#integraldetailvo)" ]`|< [IntegralDetailVo](#integraldetailvo) > array|
|**toExpireCredit**  <br>*可选*|即将过期积分  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|总积分  <br>**样例** : `0`|integer (int32)|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="interactionmessagedetailvo"></a>
### InteractionMessageDetailVo

|名称|说明|类型|
|---|---|---|
|**action**  <br>*可选*|**样例** : `0`|integer (int32)|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**cid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**count**  <br>*可选*|**样例** : `0`|integer (int32)|
|**f_content**  <br>*可选*|**样例** : `"string"`|string|
|**fcontent**  <br>*可选*|**样例** : `"string"`|string|
|**msg_id**  <br>*可选*|**样例** : `"string"`|string|
|**origin_content**  <br>*可选*|**样例** : `"string"`|string|
|**relation**  <br>*可选*|**样例** : `"string"`|string|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**timestamp**  <br>*可选*|**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**to**  <br>*可选*|**样例** : `0`|integer (int32)|
|**to_title**  <br>*可选*|**样例** : `"string"`|string|
|**to_username**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|**样例** : `"string"`|string|


<a name="interactionmessagevo"></a>
### InteractionMessageVo

|名称|说明|类型|
|---|---|---|
|**is_unread**  <br>*可选*|**样例** : `true`|boolean|
|**notify**  <br>*可选*|**样例** : `[ "[interactionmessagedetailvo](#interactionmessagedetailvo)" ]`|< [InteractionMessageDetailVo](#interactionmessagedetailvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**unread**  <br>*可选*|**样例** : `true`|boolean|


<a name="invoicecommonvo"></a>
### InvoiceCommonVo

|名称|说明|类型|
|---|---|---|
|**label**  <br>*可选*|值  <br>**样例** : `"string"`|string|
|**value**  <br>*可选*|键  <br>**样例** : `0`|integer (int32)|


<a name="invoiceinfoaddvo"></a>
### InvoiceInfoAddVo

|名称|说明|类型|
|---|---|---|
|**invoice_type**  <br>*可选*|发票类型  <br>**样例** : `[ "[invoicecommonvo](#invoicecommonvo)" ]`|< [InvoiceCommonVo](#invoicecommonvo) > array|
|**issue_type**  <br>*可选*|开具类型  <br>**样例** : `[ "[invoicecommonvo](#invoicecommonvo)" ]`|< [InvoiceCommonVo](#invoicecommonvo) > array|
|**tips**  <br>*可选*|提示  <br>**样例** : `"string"`|string|


<a name="invoiceinfolistitemvo"></a>
### InvoiceInfoListItemVo

|名称|说明|类型|
|---|---|---|
|**baccount**  <br>*可选*|开户账号  <br>**样例** : `"string"`|string|
|**bname**  <br>*可选*|开户银行名称  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**invoice_label**  <br>*可选*|发票类型  <br>**样例** : `"string"`|string|
|**invoice_type**  <br>*可选*|发票类型 1：普通；2：专用  <br>**样例** : `0`|integer (int32)|
|**issue_label**  <br>*可选*|开具类型  <br>**样例** : `"string"`|string|
|**issue_type**  <br>*可选*|开具类型 1：个人；2企业  <br>**样例** : `0`|integer (int32)|
|**ititle**  <br>*可选*|发票抬头  <br>**样例** : `"string"`|string|
|**raddress**  <br>*可选*|注册场地地址  <br>**样例** : `"string"`|string|
|**rphone**  <br>*可选*|注册固定电话  <br>**样例** : `"string"`|string|
|**tax_num**  <br>*可选*|税务登记证号  <br>**样例** : `"string"`|string|


<a name="jsonobject"></a>
### JSONObject
*类型* : < string, object > map


<a name="jiangtairesponsevo"></a>
### JiangtaiResponseVO

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `"string"`|string|
|**message**  <br>*可选*|**样例** : `"string"`|string|


<a name="jihedianbean"></a>
### JihedianBean

|名称|说明|类型|
|---|---|---|
|**bd_location**  <br>*可选*|百度经纬度  <br>**样例** : `"[bdlocationbean](#bdlocationbean)"`|[BdLocationBean](#bdlocationbean)|
|**city**  <br>*可选*|集合点城市  <br>**样例** : `"string"`|string|
|**gd_location**  <br>*可选*|高德经纬度  <br>**样例** : `"[gdlocationbean](#gdlocationbean)"`|[GdLocationBean](#gdlocationbean)|
|**label**  <br>*可选*|例如：集合点：集合点时间+集合点名称  <br>**样例** : `"string"`|string|
|**lid**  <br>*可选*|集合点id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|集合点名称  <br>**样例** : `"string"`|string|
|**timearea**  <br>*可选*|集合点时间  <br>**样例** : `"string"`|string|


<a name="jiutaoindexvo"></a>
### JiuTaoIndexVO

|名称|说明|类型|
|---|---|---|
|**ads**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|
|**classifies**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|
|**hotcitys**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|
|**newRecoms**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|
|**starClocks**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|
|**themes**  <br>*可选*|**样例** : `[ "[hotelthemesmodel](#hotelthemesmodel)" ]`|< [HotelThemesModel](#hotelthemesmodel) > array|


<a name="keyvalue"></a>
### KeyValue

|名称|说明|类型|
|---|---|---|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `"string"`|string|


<a name="keyvalue_1"></a>
### KeyValue_1

|名称|说明|类型|
|---|---|---|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**value**  <br>*可选*|**样例** : `"string"`|string|


<a name="labelinfovo"></a>
### LabelInfoVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|content  <br>**样例** : `"string"`|string|
|**position**  <br>*可选*|position  <br>**样例** : `"string"`|string|
|**x**  <br>*可选*|x  <br>**样例** : `"string"`|string|
|**y**  <br>*可选*|y  <br>**样例** : `"string"`|string|


<a name="labelinfovo_1"></a>
### LabelInfoVO_1

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|content  <br>**样例** : `"string"`|string|
|**position**  <br>*可选*|position  <br>**样例** : `"string"`|string|
|**x**  <br>*可选*|x  <br>**样例** : `"string"`|string|
|**y**  <br>*可选*|y  <br>**样例** : `"string"`|string|


<a name="labelvo"></a>
### LabelVO

|名称|说明|类型|
|---|---|---|
|**label**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**value**  <br>*可选*|值  <br>**样例** : `"string"`|string|


<a name="lastupdatenoticeuserinfovo"></a>
### LastUpdateNoticeUserInfoVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**gnick**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="levelrespvo"></a>
### LevelRespVo

|名称|说明|类型|
|---|---|---|
|**color**  <br>*可选*|颜色  <br>**样例** : `"string"`|string|
|**exp**  <br>*可选*|经验值  <br>**样例** : `0`|integer (int32)|
|**getTime**  <br>*可选*|该等级达到时间  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|是否达到 1达到  0 未达到  <br>**样例** : `0`|integer (int32)|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**iconLg**  <br>*可选*|大图标  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**levelName**  <br>*可选*|等级名称  <br>**样例** : `"string"`|string|
|**progressbar**  <br>*可选*|进度条百分比  <br>**样例** : `"string"`|string|


<a name="levelrespvo_1"></a>
### LevelRespVo_1

|名称|说明|类型|
|---|---|---|
|**color**  <br>*可选*|颜色  <br>**样例** : `"string"`|string|
|**comsumption**  <br>*可选*|消费值  <br>**样例** : `0`|integer (int32)|
|**geted**  <br>*可选*|是否达到 1达到  0 未达到  <br>**样例** : `0`|integer (int32)|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**iconLg**  <br>*可选*|大图标  <br>**样例** : `"string"`|string|
|**interests**  <br>*可选*|权益  <br>**样例** : `[ "[consumptioninterest](#consumptioninterest)" ]`|< [ConsumptionInterest](#consumptioninterest) > array|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**levelName**  <br>*可选*|等级名称  <br>**样例** : `"string"`|string|
|**orderCount**  <br>*可选*|最低订单数  <br>**样例** : `0`|integer (int32)|
|**progressbar**  <br>*可选*|进度条百分比  <br>**样例** : `"string"`|string|
|**vipExpiration**  <br>*可选*|消费等级过期时间  <br>**样例** : `"string"`|string|


<a name="levydiscover"></a>
### LevyDiscover

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见首图  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**talent**  <br>*可选*|1为拥有达人标识  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1 为视频 0为图片  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="likedvo"></a>
### LikedVO

|名称|说明|类型|
|---|---|---|
|**is_liked**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**liked**  <br>*可选*|点赞数  <br>**样例** : `0`|integer (int32)|
|**msg**  <br>*可选*|返回消息  <br>**样例** : `"string"`|string|


<a name="line"></a>
### Line

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**count**  <br>*可选*|**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**item**  <br>*可选*|**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="lineinfo"></a>
### LineInfo

|名称|说明|类型|
|---|---|---|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|线路标题  <br>**样例** : `"string"`|string|


<a name="linesvo"></a>
### LinesVO

|名称|说明|类型|
|---|---|---|
|**document**  <br>*可选*|专题列表  <br>**样例** : `[ "[documentbean](#documentbean)" ]`|< [DocumentBean](#documentbean) > array|
|**product**  <br>*可选*|线路列表  <br>**样例** : `[ "[productvobean](#productvobean)" ]`|< [ProductVOBean](#productvobean) > array|


<a name="linkopenvo"></a>
### LinkOpenVo

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|app跳转协议  <br>**样例** : `"string"`|string|
|**otherParameters**  <br>*可选*|额外参数，解析后放到请求接口参数里面，key和值对应  <br>**样例** : `{<br>  "string" : "string"<br>}`|< string, string > map|
|**url**  <br>*可选*|app跳转协议参数：id或者url  <br>**样例** : `"string"`|string|


<a name="c1784e926c4dc6bf69cd19d03b6edd69"></a>
### ListWrapperVO«AttitudeOptionInfoVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[attitudeoptioninfovo](#attitudeoptioninfovo)" ]`|< [AttitudeOptionInfoVO](#attitudeoptioninfovo) > array|


<a name="8102d3a89a4937d148907ff41ba989e1"></a>
### ListWrapperVO«ColumnMedalVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[columnmedalvo](#columnmedalvo)" ]`|< [ColumnMedalVO](#columnmedalvo) > array|


<a name="26242f50f44d27a951e8e8b25c1c3403"></a>
### ListWrapperVO«DestBaseRespVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[destbaserespvo](#destbaserespvo)" ]`|< [DestBaseRespVO](#destbaserespvo) > array|


<a name="ae3247fa63925560430b4170785d3621"></a>
### ListWrapperVO«DestThemeBaseRespVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[destthemebaserespvo](#destthemebaserespvo)" ]`|< [DestThemeBaseRespVO](#destthemebaserespvo) > array|


<a name="4b767e087e2f8b7dc2551333ec25b9f7"></a>
### ListWrapperVO«DiscoverEncourageVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverencouragevo](#discoverencouragevo)" ]`|< [DiscoverEncourageVO](#discoverencouragevo) > array|


<a name="f419814316a0a49481f929bc62f6e922"></a>
### ListWrapperVO«DiscoverRankListVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverranklistvo](#discoverranklistvo)" ]`|< [DiscoverRankListVO](#discoverranklistvo) > array|


<a name="a87cbdb17c7f1ddfed6ccfc3e019a683"></a>
### ListWrapperVO«DiscoverRelationVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverrelationvo](#discoverrelationvo)" ]`|< [DiscoverRelationVO](#discoverrelationvo) > array|


<a name="f5387830381c3a091630e84100bd7eea"></a>
### ListWrapperVO«EncourageConfigVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[encourageconfigvo](#encourageconfigvo)" ]`|< [EncourageConfigVO](#encourageconfigvo) > array|


<a name="33ca0f8027225ed783299a3196cd29fe"></a>
### ListWrapperVO«ExchangeCouponVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[exchangecouponvo](#exchangecouponvo)" ]`|< [ExchangeCouponVO](#exchangecouponvo) > array|


<a name="6824e42f0190565d2bd091310d710bb2"></a>
### ListWrapperVO«ProductRecomendResponseVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[productrecomendresponsevo](#productrecomendresponsevo)" ]`|< [ProductRecomendResponseVO](#productrecomendresponsevo) > array|


<a name="d2180bc1aa7b80eaacfa5b493cf0e4f6"></a>
### ListWrapperVO«TopicVO»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|


<a name="dbf4c8bed9d00872f14902a4aca5e221"></a>
### ListWrapperVO«string»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|


<a name="07720a02134041bc59194abf8cab4e13"></a>
### ListWrapperVO«弹窗提示信息»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[cc0bdf0c8751a972d7ae8256b962f12e](#cc0bdf0c8751a972d7ae8256b962f12e)" ]`|< [弹窗提示信息](#cc0bdf0c8751a972d7ae8256b962f12e) > array|


<a name="d525741561f5bc65ab488c2fcb59d567"></a>
### ListWrapperVO«话题分类»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[ef893f696a22e4a5259fe47e337161fc](#ef893f696a22e4a5259fe47e337161fc)" ]`|< [话题分类](#ef893f696a22e4a5259fe47e337161fc) > array|


<a name="loginvo"></a>
### LoginVO

|名称|说明|类型|
|---|---|---|
|**expires_time**  <br>*可选*|**样例** : `0`|integer (int32)|
|**old_token**  <br>*可选*|**样例** : `"string"`|string|
|**token**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**user**  <br>*可选*|**样例** : `"[userentity](#userentity)"`|[UserEntity](#userentity)|


<a name="lucynumberresultvo"></a>
### LucyNumberResultVO

|名称|说明|类型|
|---|---|---|
|**differCredits**  <br>*可选*|还差多少积分  <br>**样例** : `0`|integer (int32)|
|**luckyNumbers**  <br>*可选*|幸运号  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**msg**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1用户积分不满足该兑换任务所需积分 2夺宝任务超过限制 3下注成功  <br>**样例** : `0`|integer (int32)|


<a name="mallcreatedealvo"></a>
### MallCreateDealVO

|名称|说明|类型|
|---|---|---|
|**appId**  <br>*可选*|**样例** : `"string"`|string|
|**appid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**codeUrl**  <br>*可选*|微信支付-pc使用，使用时按照URL格式转成二维码即可  <br>**样例** : `"string"`|string|
|**errorUrl**  <br>*可选*|**样例** : `"string"`|string|
|**html**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**isInnerPaySuccess**  <br>*可选*|是否内部交易支付成功，例如：0元和余额支付，成功后直接跳转支付成功页面  <br>**样例** : `0`|integer (int32)|
|**miniAppId**  <br>*可选*|**样例** : `"string"`|string|
|**miniAppPath**  <br>*可选*|**样例** : `"string"`|string|
|**net**  <br>*可选*|支付所属账户  <br>**样例** : `"string"`|string|
|**nonceStr**  <br>*可选*|**样例** : `"string"`|string|
|**noncestr**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**orderString**  <br>*可选*|支付宝-使用  <br>**样例** : `"string"`|string|
|**package**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**partnerid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**paySign**  <br>*可选*|**样例** : `"string"`|string|
|**prepayid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**sign**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**signType**  <br>*可选*|**样例** : `"string"`|string|
|**successUrl**  <br>*可选*|**样例** : `"string"`|string|
|**timeStamp**  <br>*可选*|**样例** : `"string"`|string|
|**timestamp**  <br>*可选*|微信-使用  <br>**样例** : `0`|integer (int32)|


<a name="mallorderpayinfovo"></a>
### MallOrderPayInfoVo

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|订单需支付金额  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|集市订单id  <br>**样例** : `0`|integer (int32)|
|**remain**  <br>*可选*|支付倒计时，单位秒  <br>**样例** : `0`|integer (int64)|


<a name="b772dec241f8f78572c369d8e25e00d9"></a>
### Map«string,List«Map«string,object»»»
*类型* : < string, [List](#list) > map


<a name="8e72f86ebfc606bed6489f7f6cc58583"></a>
### Map«string,List«VisaCountryBase»»
*类型* : < string, [List](#list) > map


<a name="d764f4858e39dc9eee78f8c7d66455a6"></a>
### Map«string,int»
*类型* : < string, [Integer](#integer) > map


<a name="b9842b7e7bafdd3f108cf03c5f61e1b2"></a>
### Map«string,object»
*类型* : < string, object > map


<a name="8aeaa75b286171f0a1a4815c32168f0d"></a>
### Map«string,object»_1
*类型* : < string, object > map


<a name="2215a286003d7522fe9917b215b12afc"></a>
### Map«string,object»_10
*类型* : < string, object > map


<a name="6135813404b9b53fbf93bd82ef72f542"></a>
### Map«string,object»_11
*类型* : < string, object > map


<a name="749a2403de4fc2d19d76caf7a388ac29"></a>
### Map«string,object»_12
*类型* : < string, object > map


<a name="a0c902f1d5c3f9c7cfa5c38cadb3a9c3"></a>
### Map«string,object»_13
*类型* : < string, object > map


<a name="5c2668729c3784ea182dba1339ae37a5"></a>
### Map«string,object»_14
*类型* : < string, object > map


<a name="85180e1c02d625799e373fe5b35b530b"></a>
### Map«string,object»_15
*类型* : < string, object > map


<a name="8bcb5e059fb652ba498842b1aecf614a"></a>
### Map«string,object»_16
*类型* : < string, object > map


<a name="a12152c23e726e6462b8b045846afbd9"></a>
### Map«string,object»_17
*类型* : < string, object > map


<a name="59580833d3d65e9333648ab327bc93cb"></a>
### Map«string,object»_2
*类型* : < string, object > map


<a name="7b2ec332a915a638f35ee3879d25ca1c"></a>
### Map«string,object»_3
*类型* : < string, object > map


<a name="2a8dc63275fd9fc9b4660125faa7d452"></a>
### Map«string,object»_4
*类型* : < string, object > map


<a name="e3ee6b6c529e7280a1c70fb2a11dbd6f"></a>
### Map«string,object»_5
*类型* : < string, object > map


<a name="2f2e21e7feb5663a65de6d361a947124"></a>
### Map«string,object»_6
*类型* : < string, object > map


<a name="9d7c6d23f0b5159126b52003c83f8fa0"></a>
### Map«string,object»_7
*类型* : < string, object > map


<a name="9597b7216e4f19434ccdc67101837b2f"></a>
### Map«string,object»_8
*类型* : < string, object > map


<a name="2a3899a108d31ebaa6b593769db4d10e"></a>
### Map«string,object»_9
*类型* : < string, object > map


<a name="masteralbumvo"></a>
### MasterAlbumVO

|名称|说明|类型|
|---|---|---|
|**albumId**  <br>*可选*|专辑id  <br>**样例** : `0`|integer (int32)|
|**currentVoteNum**  <br>*可选*|投票中票数  <br>**样例** : `0`|integer (int32)|
|**isInVote**  <br>*可选*|是否投票中  <br>**样例** : `true`|boolean|
|**photos**  <br>*可选*|专辑图片  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="mastersbean"></a>
### MastersBean

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|摄影名家表述  <br>**样例** : `"string"`|string|
|**headImage**  <br>*可选*|摄影名家图像  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|摄影名家名称  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|摄影名家uid  <br>**样例** : `0`|integer (int32)|


<a name="mddinfovo"></a>
### MddInfoVO

|名称|说明|类型|
|---|---|---|
|**mainMdd**  <br>*可选*|主要目的地  <br>**样例** : `true`|boolean|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|


<a name="mddmorehotrespvo"></a>
### MddMoreHotRespVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[mddrespvo_1](#mddrespvo_1)" ]`|< [MddRespVo_1](#mddrespvo_1) > array|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|1：国家 2：城市 3：目的地 4：景点  <br>**样例** : `0`|integer (int32)|


<a name="mddnearscenerespvo"></a>
### MddNearSceneRespVo

|名称|说明|类型|
|---|---|---|
|**filterCondition**  <br>*可选*|过滤条件  <br>**样例** : `"[filtercondition](#filtercondition)"`|[FilterCondition](#filtercondition)|
|**list**  <br>*可选*|**样例** : `[ "[nearscenevo_1](#nearscenevo_1)" ]`|< [NearSceneVo_1](#nearscenevo_1) > array|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="mddnearsearchrespvo"></a>
### MddNearSearchRespVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[nearscenevo](#nearscenevo)" ]`|< [NearSceneVo](#nearscenevo) > array|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="mddrespvo"></a>
### MddRespVo

|名称|说明|类型|
|---|---|---|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="mddrespvo_1"></a>
### MddRespVo_1

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|目的地说明  <br>**样例** : `"string"`|string|
|**higherMdd**  <br>*可选*|上级区域  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="mddwrapvo"></a>
### MddWrapVO

|名称|说明|类型|
|---|---|---|
|**mddList**  <br>*可选*|当季目的地  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**moreHandler**  <br>*可选*|更多的跳转协议  <br>**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|更多的跳转协议的参数  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="medalhomesharevo"></a>
### MedalHomeShareVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**certificationImages**  <br>*可选*|认证徽章  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|
|**certificationNum**  <br>*可选*|用户认证数  <br>**样例** : `0`|integer (int32)|
|**codeImg**  <br>*可选*|二维码图片  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|用户介绍  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|用户社区等级  <br>**样例** : `0`|integer (int32)|
|**medalCount**  <br>*可选*|获得的勋章数  <br>**样例** : `0`|integer (int32)|
|**talent**  <br>*可选*|true为达人  <br>**样例** : `true`|boolean|
|**themeMedals**  <br>*可选*|主题勋章  <br>**样例** : `[ "[columnmedalvo](#columnmedalvo)" ]`|< [ColumnMedalVO](#columnmedalvo) > array|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|


<a name="medalhomevo"></a>
### MedalHomeVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**certificationImages**  <br>*可选*|认证徽章  <br>**样例** : `[ "string" ]`|< string > array|
|**certificationNum**  <br>*可选*|用户认证数  <br>**样例** : `0`|integer (int32)|
|**columnInfos**  <br>*可选*|栏目信息  <br>**样例** : `[ "[column](#column)" ]`|< [Column](#column) > array|
|**level**  <br>*可选*|用户社区等级  <br>**样例** : `0`|integer (int32)|
|**medalCount**  <br>*可选*|获得的勋章数  <br>**样例** : `0`|integer (int32)|
|**talent**  <br>*可选*|true为达人  <br>**样例** : `true`|boolean|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|


<a name="medalproductlinevo"></a>
### MedalProductLineVO

|名称|说明|类型|
|---|---|---|
|**getWay**  <br>*可选*|获得方法  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|勋章等级  <br>**样例** : `0`|integer (int32)|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**needCount**  <br>*可选*|当条件为子勋章完成数 合成需要数量  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**productLines**  <br>*可选*|线路列表  <br>**样例** : `[ "[productline](#productline)" ]`|< [ProductLine](#productline) > array|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|勋章类型 1为独立勋章  2为合成勋章 3为晋级勋章  <br>**样例** : `0`|integer (int32)|


<a name="medalrespvo"></a>
### MedalRespVo

|名称|说明|类型|
|---|---|---|
|**geted**  <br>*可选*|0未获取  1为获取了  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|


<a name="medalsharevo"></a>
### MedalShareVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**codeImg**  <br>*可选*|二维码图片  <br>**样例** : `"string"`|string|
|**getTime**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**getedDesc**  <br>*可选*|获得后说明  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|用户社区等级  <br>**样例** : `0`|integer (int32)|
|**logo**  <br>*可选*|游侠客logo  <br>**样例** : `"string"`|string|
|**medalDesc**  <br>*可选*|勋章描述  <br>**样例** : `"string"`|string|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**medalLevel**  <br>*可选*|勋章等级  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|true为达人  <br>**样例** : `true`|boolean|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|勋章类型 1为独立勋章  2为合成勋章 3晋级勋章  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="medalsharevo"></a>
### MedalShareVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**codeImg**  <br>*可选*|二维码图片  <br>**样例** : `"string"`|string|
|**getTime**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**getWay**  <br>*可选*|获得方法  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|勋章样式 1 点亮 0 未点亮  <br>**样例** : `0`|integer (int32)|
|**getedNum**  <br>*可选*|勋章点亮次数  <br>**样例** : `0`|integer (int32)|
|**medalDesc**  <br>*可选*|勋章描述  <br>**样例** : `"string"`|string|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**needNum**  <br>*可选*|当前勋章所需独立勋章数  <br>**样例** : `0`|integer (int32)|
|**personCount**  <br>*可选*|获得该勋章的人数  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|1 为达人  0不是达人  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|1为独立勋章  2为合成型勋章  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="mediaentity"></a>
### MediaEntity

|名称|说明|类型|
|---|---|---|
|**film_id**  <br>*可选*|**样例** : `"string"`|string|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|


<a name="medicalcardvo"></a>
### MedicalCardVO

|名称|说明|类型|
|---|---|---|
|**isShow**  <br>*可选*|是否显示 1：显示 0：不显示  <br>**样例** : `0`|integer (int32)|
|**tips**  <br>*可选*|提示：建议添加医疗信息，遇到危险可向他人出示  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题：医疗急救卡  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|填写路径  <br>**样例** : `"string"`|string|


<a name="meetmessagedetailvo"></a>
### MeetMessageDetailVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**cid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|**样例** : `"string"`|string|
|**f_content**  <br>*可选*|**样例** : `"string"`|string|
|**fcontent**  <br>*可选*|**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|**样例** : `0`|integer (int64)|
|**gmt_modify**  <br>*可选*|**样例** : `0`|integer (int64)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**is_send**  <br>*可选*|**样例** : `0`|integer (int32)|
|**messageID**  <br>*可选*|**样例** : `0`|integer (int32)|
|**origin_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**send_from**  <br>*可选*|**样例** : `0`|integer (int32)|
|**sex**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**to_uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**to_username**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|**样例** : `"string"`|string|
|**video**  <br>*可选*|**样例** : `"string"`|string|


<a name="meetmessagevo"></a>
### MeetMessageVo

|名称|说明|类型|
|---|---|---|
|**history**  <br>*可选*|**样例** : `"string"`|string|
|**msgList**  <br>*可选*|**样例** : `[ "[meetmessagedetailvo](#meetmessagedetailvo)" ]`|< [MeetMessageDetailVo](#meetmessagedetailvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="membercentrerespvo"></a>
### MemberCentreRespVo

|名称|说明|类型|
|---|---|---|
|**community**  <br>*可选*|社区等级  <br>**样例** : `"[communitylevelrespvo](#communitylevelrespvo)"`|[CommunityLevelRespVo](#communitylevelrespvo)|
|**comsumption**  <br>*可选*|消费等级  <br>**样例** : `"[communitylevelrespvo_1](#communitylevelrespvo_1)"`|[CommunityLevelRespVo_1](#communitylevelrespvo_1)|
|**extInfo**  <br>*可选*|扩展信息  <br>**样例** : `"[extinfo](#extinfo)"`|[ExtInfo](#extinfo)|
|**medal**  <br>*可选*|勋章  <br>**样例** : `[ "[medalrespvo](#medalrespvo)" ]`|< [MedalRespVo](#medalrespvo) > array|


<a name="memberfirstaidcarditemvo"></a>
### MemberFirstAidCardItemVO

|名称|说明|类型|
|---|---|---|
|**allergyHistory**  <br>*可选*|过敏史  <br>**样例** : `"string"`|string|
|**blood**  <br>*可选*|血型类型：A+=>A+型 A-=>A-型 B+=>B+型 B-=>B-型 AB+=>AB+型 AB-=>AB-型 O+=>O+型 O-=>O-型  <br>**样例** : `"string"`|string|
|**firstAidCardId**  <br>*可选*|医疗急救卡id  <br>**样例** : `0`|integer (int64)|
|**height**  <br>*可选*|身高，单位cm  <br>**样例** : `0`|integer (int32)|
|**linkname**  <br>*可选*|紧急联系人  <br>**样例** : `"string"`|string|
|**medicalHistory**  <br>*可选*|病史  <br>**样例** : `"string"`|string|
|**memberId**  <br>*可选*|出行人id  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系类型：100->其他 101->父亲 102->母亲，103->配偶 104->哥哥 105->弟弟 106->姐姐 107->妹妹 108->儿子 109->女儿 110->伴侣 111->普通朋友  <br>**样例** : `0`|integer (int32)|
|**weight**  <br>*可选*|体重，单位kg  <br>**样例** : `0`|integer (int32)|


<a name="memberfirstaidcardsaverq"></a>
### MemberFirstAidCardSaveRQ

|名称|说明|类型|
|---|---|---|
|**allergyHistory**  <br>*可选*|过敏史  <br>**样例** : `"string"`|string|
|**blood**  <br>*可选*|血型类型：A+=>A+型 A-=>A-型 B+=>B+型 B-=>B-型 AB+=>AB+型 AB-=>AB-型 O+=>O+型 O-=>O-型  <br>**样例** : `"string"`|string|
|**firstAidCardId**  <br>*可选*|医疗急救卡id，id>0时修改  <br>**样例** : `0`|integer (int64)|
|**height**  <br>*可选*|身高，单位cm  <br>**样例** : `"string"`|string|
|**linkname**  <br>*可选*|紧急联系人  <br>**样例** : `"string"`|string|
|**medicalHistory**  <br>*可选*|病史  <br>**样例** : `"string"`|string|
|**memberId**  <br>*可选*|出行人id  <br>**样例** : `0`|integer (int32)|
|**notEmpty**  <br>*可选*|**样例** : `true`|boolean|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系类型：100->其他 101->父亲 102->母亲，103->配偶 104->哥哥 105->弟弟 106->姐姐 107->妹妹 108->儿子 109->女儿 110->伴侣 111->普通朋友  <br>**样例** : `0`|integer (int32)|
|**weight**  <br>*可选*|体重，单位kg  <br>**样例** : `"string"`|string|


<a name="memberfirstaidcardsaverq_1"></a>
### MemberFirstAidCardSaveRQ_1

|名称|说明|类型|
|---|---|---|
|**allergyHistory**  <br>*可选*|过敏史  <br>**样例** : `"string"`|string|
|**blood**  <br>*可选*|血型类型：A+=>A+型 A-=>A-型 B+=>B+型 B-=>B-型 AB+=>AB+型 AB-=>AB-型 O+=>O+型 O-=>O-型  <br>**样例** : `"string"`|string|
|**firstAidCardId**  <br>*可选*|医疗急救卡id，id>0时修改  <br>**样例** : `0`|integer (int64)|
|**height**  <br>*可选*|身高，单位cm  <br>**样例** : `"string"`|string|
|**linkname**  <br>*可选*|紧急联系人  <br>**样例** : `"string"`|string|
|**medicalHistory**  <br>*可选*|病史  <br>**样例** : `"string"`|string|
|**memberId**  <br>*可选*|出行人id  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系类型：100->其他 101->父亲 102->母亲，103->配偶 104->哥哥 105->弟弟 106->姐姐 107->妹妹 108->儿子 109->女儿 110->伴侣 111->普通朋友  <br>**样例** : `0`|integer (int32)|
|**weight**  <br>*可选*|体重，单位kg  <br>**样例** : `"string"`|string|


<a name="memberfirstaidcardvo"></a>
### MemberFirstAidCardVO

|名称|说明|类型|
|---|---|---|
|**bloodList**  <br>*可选*|血型类型：A+=>A+型 A-=>A-型 B+=>B+型 B-=>B-型 AB+=>AB+型 AB-=>AB-型 O+=>O+型 O-=>O-型  <br>**样例** : `[ "[labelvo](#labelvo)" ]`|< [LabelVO](#labelvo) > array|
|**memberFirstAidCard**  <br>*可选*|医疗急救卡信息  <br>**样例** : `"[memberfirstaidcarditemvo](#memberfirstaidcarditemvo)"`|[MemberFirstAidCardItemVO](#memberfirstaidcarditemvo)|
|**orderMember**  <br>*可选*|出行人信息  <br>**样例** : `"[ordermemberitemvo](#ordermemberitemvo)"`|[OrderMemberItemVO](#ordermemberitemvo)|
|**relationList**  <br>*可选*|关系类型：100->其他 101->父亲 102->母亲，103->配偶 104->哥哥 105->弟弟 106->姐姐 107->妹妹 108->儿子 109->女儿 110->伴侣 111->普通朋友  <br>**样例** : `[ "[labelvo](#labelvo)" ]`|< [LabelVO](#labelvo) > array|


<a name="membervo"></a>
### MemberVO

|名称|说明|类型|
|---|---|---|
|**birth**  <br>*可选*|出生年月日  <br>**样例** : `"string"`|string|
|**cardexp**  <br>*可选*|护照有效期  <br>**样例** : `"string"`|string|
|**cardno**  <br>*可选*|护照号码  <br>**样例** : `"string"`|string|
|**mid**  <br>*可选*|编号 新增时为空  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**passportCid**  <br>*可选*|护照签发地  <br>**样例** : `0`|integer (int32)|
|**sex**  <br>*可选*|性别 1、男，2、女  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童  <br>**样例** : `0`|integer (int32)|


<a name="membersbean"></a>
### MembersBean

|名称|说明|类型|
|---|---|---|
|**birth**  <br>*可选*|无用  <br>**样例** : `"string"`|string|
|**cardName**  <br>*可选*|出行人证件类型名称  <br>**样例** : `"string"`|string|
|**cardexp**  <br>*可选*|无用  <br>**样例** : `0`|integer (int32)|
|**cardno**  <br>*可选*|出行人证件号  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|无用  <br>**样例** : `"string"`|string|
|**contact**  <br>*可选*|是否为联系人  <br>**样例** : `0`|integer (int32)|
|**mid**  <br>*可选*|订单出行人id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|出行人名称  <br>**样例** : `"string"`|string|
|**passport_cid**  <br>*可选*|无用  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|无用  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|出行人性别  <br>**样例** : `"string"`|string|
|**statusColor**  <br>*可选*|出行状态文案颜色  <br>**样例** : `"string"`|string|
|**statusName**  <br>*可选*|出行状态文案  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|出行人成人或儿童  <br>**样例** : `"string"`|string|


<a name="membersextpo"></a>
### MembersExtPO

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|**样例** : `0`|integer (int32)|
|**area_name**  <br>*可选*|签发地名称  <br>**样例** : `"string"`|string|
|**bindCardStatus**  <br>*可选*|**样例** : `0`|integer (int32)|
|**birth**  <br>*可选*|**样例** : `0`|integer (int64)|
|**birthday**  <br>*可选*|**样例** : `0`|integer (int32)|
|**birthmonth**  <br>*可选*|**样例** : `0`|integer (int32)|
|**birthyear**  <br>*可选*|**样例** : `0`|integer (int32)|
|**cardName**  <br>*可选*|证件类型名称  <br>**样例** : `"string"`|string|
|**cardexp**  <br>*可选*|证件过期时间  <br>**样例** : `0`|integer (int64)|
|**cardno**  <br>*可选*|证件号码  <br>**样例** : `"string"`|string|
|**cardtype**  <br>*可选*|证件类型1、二代身份证2、护照3、港澳通行证4、台胞证5、军官证6、回乡证7、其他（儿童）  <br>**样例** : `0`|integer (int32)|
|**firstAddtime**  <br>*可选*|**样例** : `0`|integer (int32)|
|**firstCreated**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isDel**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isSave**  <br>*可选*|**样例** : `0`|integer (int32)|
|**mid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|常用联系人姓名  <br>**样例** : `"string"`|string|
|**passportCid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**passport_cid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|**样例** : `"string"`|string|
|**sex**  <br>*可选*|常用联系人性别：1、男，2、女  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童  <br>**样例** : `"string"`|string|


<a name="membersinfobean"></a>
### MembersInfoBean

|名称|说明|类型|
|---|---|---|
|**insurance_file**  <br>*可选*|保险文件  <br>**样例** : `"string"`|string|
|**insurance_no**  <br>*可选*|保单号  <br>**样例** : `"string"`|string|
|**omid**  <br>*可选*|订单出行人id  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|保单状态  <br>**样例** : `0`|integer (int32)|
|**status_label**  <br>*可选*|保单状态文字  <br>**样例** : `"string"`|string|
|**truename**  <br>*可选*|出行人名称  <br>**样例** : `"string"`|string|


<a name="memberslistbeanvo"></a>
### MembersListBeanVO

|名称|说明|类型|
|---|---|---|
|**bindCard**  <br>*可选*|是否有权益卡，1是0否  <br>**样例** : `0`|integer (int32)|
|**birth**  <br>*可选*|生日时间戳  <br>**样例** : `"string"`|string|
|**birthStr**  <br>*可选*|生日字符串  <br>**样例** : `"string"`|string|
|**cardName**  <br>*可选*|出行人证件类型名称  <br>**样例** : `"string"`|string|
|**cardUserId**  <br>*可选*|关联的权益卡id，为0表示未使用权益卡  <br>**样例** : `0`|integer (int32)|
|**cardexp**  <br>*可选*|无用  <br>**样例** : `0`|integer (int32)|
|**cardno**  <br>*可选*|出行人证件号  <br>**样例** : `"string"`|string|
|**cardnoHideAfter**  <br>*可选*|证件号脱敏显示  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|无用  <br>**样例** : `"string"`|string|
|**contact**  <br>*可选*|是否为联系人  <br>**样例** : `0`|integer (int32)|
|**mid**  <br>*可选*|订单出行人id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|出行人名称  <br>**样例** : `"string"`|string|
|**passport_cid**  <br>*可选*|无用  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|无用  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|出行人性别  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|出行人成人或儿童  <br>**样例** : `"string"`|string|


<a name="messagecountvo"></a>
### MessageCountVo

|名称|说明|类型|
|---|---|---|
|**all_bottom**  <br>*可选*|总数量  <br>**样例** : `0`|integer (int32)|
|**community_count**  <br>*可选*|互动消息数量  <br>**样例** : `0`|integer (int32)|
|**community_time**  <br>*可选*|最新互动消息时间  <br>**样例** : `0`|integer (int64)|
|**discoverCommentNum**  <br>*可选*|遇见@和回复消息数量  <br>**样例** : `0`|integer (int32)|
|**discoverFocusTab**  <br>*可选*|选中tab 1：点赞，2：@和回复  <br>**样例** : `0`|integer (int32)|
|**discoverLikeNum**  <br>*可选*|遇见点赞消息数量  <br>**样例** : `0`|integer (int32)|
|**follower**  <br>*可选*|未设置  <br>**样例** : `0`|integer (int32)|
|**follower_time**  <br>*可选*|未设置  <br>**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|统计时间  <br>**样例** : `0`|integer (int64)|
|**orders_status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**orders_status_time**  <br>*可选*|**样例** : `0`|integer (int64)|
|**orders_tours**  <br>*可选*|**样例** : `0`|integer (int32)|
|**orders_tours_time**  <br>*可选*|**样例** : `0`|integer (int64)|
|**private_count**  <br>*可选*|**样例** : `0`|integer (int32)|
|**private_time**  <br>*可选*|**样例** : `0`|integer (int64)|
|**system_count**  <br>*可选*|系统消息数量  <br>**样例** : `0`|integer (int32)|
|**system_time**  <br>*可选*|最新系统消息时间  <br>**样例** : `0`|integer (int64)|
|**zan_comment**  <br>*可选*|遇见消息数量  <br>**样例** : `0`|integer (int32)|
|**zan_comment_time**  <br>*可选*|最新遇见消息时间  <br>**样例** : `0`|integer (int64)|


<a name="microbargainreminvo"></a>
### MicroBargainReminVO

|名称|说明|类型|
|---|---|---|
|**mobile**  <br>*可选*|提醒手机号  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|提醒状态文案  <br>**样例** : `"string"`|string|


<a name="1d4327fb5fa0771eed51f1097d8b9537"></a>
### MicroPagerWrap«List«IndexFlowItemVo»»

|名称|说明|类型|
|---|---|---|
|**currentPage**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|数据集合  <br>**样例** : `[ "[indexflowitemvo](#indexflowitemvo)" ]`|< [IndexFlowItemVo](#indexflowitemvo) > array|
|**pageSize**  <br>*可选*|每页几条  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|总条数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="1db124577e78efec0763933556489419"></a>
### MicroPagerWrap«List«OrderBaseListItemVO»»

|名称|说明|类型|
|---|---|---|
|**currentPage**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|数据集合  <br>**样例** : `[ "[orderbaselistitemvo](#orderbaselistitemvo)" ]`|< [OrderBaseListItemVO](#orderbaselistitemvo) > array|
|**pageSize**  <br>*可选*|每页几条  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|总条数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="cfb6e613d990493a9aa05596f5a9baf3"></a>
### MicroPagerWrap«List«OrderVoucherItemVO»»

|名称|说明|类型|
|---|---|---|
|**currentPage**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|数据集合  <br>**样例** : `[ "[ordervoucheritemvo](#ordervoucheritemvo)" ]`|< [OrderVoucherItemVO](#ordervoucheritemvo) > array|
|**pageSize**  <br>*可选*|每页几条  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|总条数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="2874ad68e544390bbec7ac7f4d0027c2"></a>
### MicroPagerWrap«List«瀑布流-线路或者酒套»»

|名称|说明|类型|
|---|---|---|
|**currentPage**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|数据集合  <br>**样例** : `[ "[308a7797247ef3f38e961a3de8798d34](#308a7797247ef3f38e961a3de8798d34)" ]`|< [瀑布流-线路或者酒套](#308a7797247ef3f38e961a3de8798d34) > array|
|**pageSize**  <br>*可选*|每页几条  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|总条数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="minisharevo"></a>
### MiniShareVO

|名称|说明|类型|
|---|---|---|
|**mini_app_cover**  <br>*可选*|分享封面  <br>**样例** : `"string"`|string|
|**mini_app_id**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**mini_app_url**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|


<a name="modelandview"></a>
### ModelAndView

|名称|说明|类型|
|---|---|---|
|**empty**  <br>*可选*|**样例** : `true`|boolean|
|**model**  <br>*可选*|**样例** : `"object"`|object|
|**modelMap**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**reference**  <br>*可选*|**样例** : `true`|boolean|
|**status**  <br>*可选*|**样例** : `"string"`|enum (CONTINUE, SWITCHING_PROTOCOLS, PROCESSING, CHECKPOINT, OK, CREATED, ACCEPTED, NON_AUTHORITATIVE_INFORMATION, NO_CONTENT, RESET_CONTENT, PARTIAL_CONTENT, MULTI_STATUS, ALREADY_REPORTED, IM_USED, MULTIPLE_CHOICES, MOVED_PERMANENTLY, FOUND, MOVED_TEMPORARILY, SEE_OTHER, NOT_MODIFIED, USE_PROXY, TEMPORARY_REDIRECT, PERMANENT_REDIRECT, BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE, PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT, CONFLICT, GONE, LENGTH_REQUIRED, PRECONDITION_FAILED, PAYLOAD_TOO_LARGE, REQUEST_ENTITY_TOO_LARGE, URI_TOO_LONG, REQUEST_URI_TOO_LONG, UNSUPPORTED_MEDIA_TYPE, REQUESTED_RANGE_NOT_SATISFIABLE, EXPECTATION_FAILED, I_AM_A_TEAPOT, INSUFFICIENT_SPACE_ON_RESOURCE, METHOD_FAILURE, DESTINATION_LOCKED, UNPROCESSABLE_ENTITY, LOCKED, FAILED_DEPENDENCY, TOO_EARLY, UPGRADE_REQUIRED, PRECONDITION_REQUIRED, TOO_MANY_REQUESTS, REQUEST_HEADER_FIELDS_TOO_LARGE, UNAVAILABLE_FOR_LEGAL_REASONS, INTERNAL_SERVER_ERROR, NOT_IMPLEMENTED, BAD_GATEWAY, SERVICE_UNAVAILABLE, GATEWAY_TIMEOUT, HTTP_VERSION_NOT_SUPPORTED, VARIANT_ALSO_NEGOTIATES, INSUFFICIENT_STORAGE, LOOP_DETECTED, BANDWIDTH_LIMIT_EXCEEDED, NOT_EXTENDED, NETWORK_AUTHENTICATION_REQUIRED)|
|**view**  <br>*可选*|**样例** : `"[view](#view)"`|[View](#view)|
|**viewName**  <br>*可选*|**样例** : `"string"`|string|


<a name="monthsbean"></a>
### MonthsBean

|名称|说明|类型|
|---|---|---|
|**caleLabel**  <br>*可选*|**样例** : `"string"`|string|
|**caleMonth**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `0.0`|number|
|**price_label**  <br>*可选*|**样例** : `"string"`|string|


<a name="myselfduobaovo"></a>
### MyselfDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**openTime**  <br>*可选*|开奖时间  <br>**样例** : `0`|integer (int64)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**snakes**  <br>*可选*|已投注数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1筹集中  2 待开奖 3已开奖  4 筹集失败  <br>**样例** : `0`|integer (int32)|
|**usedCredits**  <br>*可选*|消耗的积分  <br>**样例** : `0`|integer (int32)|
|**win**  <br>*可选*|true为中奖  <br>**样例** : `true`|boolean|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|


<a name="myselfnologinvo"></a>
### MyselfNoLoginVo

|名称|说明|类型|
|---|---|---|
|**adverts**  <br>*可选*|广告位  <br>**样例** : `[ "[advo](#advo)" ]`|< [AdVo](#advo) > array|
|**recommendList**  <br>*可选*|线路推荐  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|


<a name="myselfvo"></a>
### MyselfVo

|名称|说明|类型|
|---|---|---|
|**adverts**  <br>*可选*|广告位  <br>**样例** : `[ "[advo](#advo)" ]`|< [AdVo](#advo) > array|
|**appBgPic**  <br>*可选*|背景图  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**birth**  <br>*可选*|生日格式化  <br>**样例** : `"string"`|string|
|**birthday**  <br>*可选*|生日时间戳  <br>**样例** : `0`|integer (int64)|
|**canUpdateBirth**  <br>*可选*|是否能修改生日 0 不能修改 1 能修改  <br>**样例** : `0`|integer (int32)|
|**city**  <br>*可选*|市  <br>**样例** : `"string"`|string|
|**communityLevel**  <br>*可选*|社区等级，例如：20 恒山  <br>**样例** : `"string"`|string|
|**consumptionLevel**  <br>*可选*|老版本，消费等级：1普通会员2白银会员3黄金会员4铂金会员5钻石会员6皇冠会员  <br>**样例** : `0`|integer (int32)|
|**consumptionLevelImage**  <br>*可选*|消费等级图片  <br>**样例** : `"string"`|string|
|**consumptionLevelLabel**  <br>*可选*|消费等级文字  <br>**样例** : `"string"`|string|
|**countFollower**  <br>*可选*|粉丝数  <br>**样例** : `0`|integer (int32)|
|**countFollowing**  <br>*可选*|关注数  <br>**样例** : `0`|integer (int32)|
|**countPhoto**  <br>*可选*|摄影数  <br>**样例** : `0`|integer (int32)|
|**countPost**  <br>*可选*|游记数  <br>**样例** : `0`|integer (int32)|
|**countQuote**  <br>*可选*|遇见数+遇见举报数  <br>**样例** : `0`|integer (int32)|
|**couponTitle**  <br>*可选*|标题：代金券  <br>**样例** : `"string"`|string|
|**credits**  <br>*可选*|积分  <br>**样例** : `"string"`|string|
|**education**  <br>*可选*|学历  <br>**样例** : `"string"`|string|
|**educationArr**  <br>*可选*|学历选项  <br>**样例** : `[ "string" ]`|< string > array|
|**email**  <br>*可选*|email  <br>**样例** : `"string"`|string|
|**getcoupon**  <br>*可选*|完善信息代金券发放进度  <br>**样例** : `"object"`|object|
|**golb**  <br>*可选*|金币  <br>**样例** : `"string"`|string|
|**goldTitle**  <br>*可选*|标题：金币  <br>**样例** : `"string"`|string|
|**goldUrl**  <br>*可选*|游侠币url  <br>**样例** : `"string"`|string|
|**group_video_permission**  <br>*可选*|**样例** : `0`|integer (int32)|
|**grouptitle**  <br>*可选*|头衔（等级）  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**isBindPhone**  <br>*可选*|是否绑定手机号  <br>**样例** : `0`|integer (int32)|
|**isBindWx**  <br>*可选*|是否绑定微信  <br>**样例** : `0`|integer (int32)|
|**isHasCoupon**  <br>*可选*|是否已经获取过完善资料的代金券  <br>**样例** : `0`|integer (int32)|
|**is_has_mobile**  <br>*可选*|是否有手机  <br>**样例** : `0`|integer (int32)|
|**mark**  <br>*可选*|xx后  <br>**样例** : `"string"`|string|
|**medalCount**  <br>*可选*|勋章数  <br>**样例** : `0`|integer (int32)|
|**medalTargetUrl**  <br>*可选*|勋章跳转地址  <br>**样例** : `"string"`|string|
|**mobile**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**money**  <br>*可选*|余额  <br>**样例** : `"string"`|string|
|**moneyTitle**  <br>*可选*|标题：余额  <br>**样例** : `"string"`|string|
|**moneyUrl**  <br>*可选*|余额h5  <br>**样例** : `"string"`|string|
|**msg**  <br>*可选*|不能修改的提示  <br>**样例** : `"string"`|string|
|**newRecommendList**  <br>*可选*|新线路推荐  <br>**样例** : `[ "[indexflowitemvo](#indexflowitemvo)" ]`|< [IndexFlowItemVo](#indexflowitemvo) > array|
|**nick**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**notice**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**occupation**  <br>*可选*|职业  <br>**样例** : `"string"`|string|
|**occupationArr**  <br>*可选*|职业选项  <br>**样例** : `[ "string" ]`|< string > array|
|**orderCount**  <br>*可选*|用户各种状态产品订单数  <br>**样例** : `"[orderscountvo](#orderscountvo)"`|[OrdersCountVo](#orderscountvo)|
|**percent**  <br>*可选*|资料完成度  <br>**样例** : `0`|integer (int32)|
|**private_video_permission**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|省  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真实姓名  <br>**样例** : `"string"`|string|
|**receiveDate**  <br>*可选*|接收订单时间，用于确认接收接口入参  <br>**样例** : `"string"`|string|
|**receiveOrderNum**  <br>*可选*|未接收共享订单数量，0不展示  <br>**样例** : `0`|integer (int32)|
|**recommendList**  <br>*可选*|线路推荐  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**revenue**  <br>*可选*|年收入  <br>**样例** : `"string"`|string|
|**revenueArr**  <br>*可选*|年收入选项  <br>**样例** : `[ "string" ]`|< string > array|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**shop_address**  <br>*可选*|收货地址菜单  <br>**样例** : `"object"`|object|
|**shop_menu**  <br>*可选*|集市菜单  <br>**样例** : `"object"`|object|
|**show_back**  <br>*可选*|**样例** : `0`|integer (int32)|
|**show_information**  <br>*可选*|**样例** : `0`|integer (int32)|
|**show_page**  <br>*可选*|**样例** : `0`|integer (int32)|
|**signInTag**  <br>*可选*|签到信息  <br>**样例** : `"[signintagvo](#signintagvo)"`|[SignInTagVO](#signintagvo)|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagitemvo](#tagitemvo)" ]`|< [TagItemVO](#tagitemvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**updateBirthMsg**  <br>*可选*|修改提示警告  <br>**样例** : `"string"`|string|
|**user_type**  <br>*可选*|用户类型：1员工0普通  <br>**样例** : `0`|integer (int32)|
|**vipUrl**  <br>*可选*|会员中心url  <br>**样例** : `"string"`|string|
|**xz**  <br>*可选*|星座  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|认证身份  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|


<a name="nearscenevo"></a>
### NearSceneVo

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|目的地说明  <br>**样例** : `"string"`|string|
|**distanceLocation**  <br>*可选*|距离位置  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|
|**visitedNum**  <br>*可选*|去过人数  <br>**样例** : `"string"`|string|
|**wantedNum**  <br>*可选*|意向人数  <br>**样例** : `"string"`|string|


<a name="nearscenevo_1"></a>
### NearSceneVo_1

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|目的地说明  <br>**样例** : `"string"`|string|
|**distanceLocation**  <br>*可选*|距离位置  <br>**样例** : `"string"`|string|
|**higherMdd**  <br>*可选*|上级区域  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|
|**visitedNum**  <br>*可选*|去过人数  <br>**样例** : `"string"`|string|
|**wantedNum**  <br>*可选*|意向人数  <br>**样例** : `"string"`|string|


<a name="nearbyfriendvo"></a>
### NearbyFriendVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**dest**  <br>*可选*|距离  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关注关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="newdetailvo"></a>
### NewDetailVo

|名称|说明|类型|
|---|---|---|
|**time**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**timeStamp**  <br>*可选*|获得时间，时间戳格式  <br>**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|说明  <br>**样例** : `"string"`|string|
|**value**  <br>*可选*|值  <br>**样例** : `0.0`|number|


<a name="newsbean"></a>
### NewsBean

|名称|说明|类型|
|---|---|---|
|**author**  <br>*可选*|作者  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**from**  <br>*可选*|来源 0 攻略，1游记  <br>**样例** : `0`|integer (int32)|
|**label**  <br>*可选*|标签类别  <br>**样例** : `[ "string" ]`|< string > array|
|**newdetail**  <br>*可选*|h5详情  <br>**样例** : `"string"`|string|
|**news_id**  <br>*可选*|攻略id  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|实体类型  <br>**样例** : `0`|integer (int32)|
|**view**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|


<a name="newscommentbean"></a>
### NewsCommentBean

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|评论人头像  <br>**样例** : `"string"`|string|
|**comment_id**  <br>*可选*|评论id  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**create_time**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**from**  <br>*可选*|评论人  <br>**样例** : `"[fromtobean](#fromtobean)"`|[FromToBean](#fromtobean)|
|**isAuthor**  <br>*可选*|是否是作者  <br>**样例** : `true`|boolean|
|**isV**  <br>*可选*|是否加V  <br>**样例** : `true`|boolean|
|**news_id**  <br>*可选*|攻略id  <br>**样例** : `0`|integer (int32)|
|**replyComments**  <br>*可选*|楼层下所有评论  <br>**样例** : `[ "[newscommentbean](#newscommentbean)" ]`|< [NewsCommentBean](#newscommentbean) > array|
|**to**  <br>*可选*|被评论人  <br>**样例** : `"[fromtobean](#fromtobean)"`|[FromToBean](#fromtobean)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|评论人用户名  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|身份列表  <br>**样例** : `[ "[certificationmodel](#certificationmodel)" ]`|< [CertificationModel](#certificationmodel) > array|


<a name="newsdetailvo"></a>
### NewsDetailVO

|名称|说明|类型|
|---|---|---|
|**author**  <br>*可选*|作者名称  <br>**样例** : `"string"`|string|
|**collectionNum**  <br>*可选*|收藏量  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**from**  <br>*可选*|1来自游记  <br>**样例** : `0`|integer (int32)|
|**hasdri**  <br>*可选*|是否有目录  <br>**样例** : `0`|integer (int32)|
|**is_collection**  <br>*可选*|是否收藏  <br>**样例** : `0`|integer (int32)|
|**newdetail**  <br>*可选*|h5地址  <br>**样例** : `"string"`|string|
|**newscomment**  <br>*可选*|评论列表  <br>**样例** : `[ "[newscommentbean](#newscommentbean)" ]`|< [NewsCommentBean](#newscommentbean) > array|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**product_count**  <br>*可选*|包含产品数  <br>**样例** : `0`|integer (int32)|
|**share**  <br>*可选*|分享详情  <br>**样例** : `"[sharebean](#sharebean)"`|[ShareBean](#sharebean)|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**total**  <br>*可选*|总评论数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**view**  <br>*可选*|浏览数  <br>**样例** : `"string"`|string|


<a name="newsfavoritebean"></a>
### NewsFavoriteBean

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|添加时间  <br>**样例** : `0`|integer (int64)|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**news_id**  <br>*可选*|攻略id  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**view**  <br>*可选*|浏览数  <br>**样例** : `0`|integer (int32)|


<a name="newsthemevo"></a>
### NewsThemeVO

|名称|说明|类型|
|---|---|---|
|**coverUrl**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**descripe**  <br>*可选*|简介  <br>**样例** : `"string"`|string|
|**headUrl**  <br>*可选*|头图  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|主题编号  <br>**样例** : `0`|integer (int32)|
|**themeTitle**  <br>*可选*|主题名称  <br>**样例** : `"string"`|string|
|**travelTipTitle**  <br>*可选*|排序第一的攻略的标题  <br>**样例** : `"string"`|string|
|**travelTipsNum**  <br>*可选*|攻略数量  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|实体类型  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|h5跳转  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|攻主题浏览量  <br>**样例** : `0`|integer (int32)|
|**viewsLable**  <br>*可选*|攻主题浏览量lable  <br>**样例** : `"string"`|string|


<a name="newsvo"></a>
### NewsVO

|名称|说明|类型|
|---|---|---|
|**newsTheme**  <br>*可选*|攻略主题  <br>**样例** : `"[newsthemevo](#newsthemevo)"`|[NewsThemeVO](#newsthemevo)|
|**newslist**  <br>*可选*|攻略列表  <br>**样例** : `[ "[newsbean](#newsbean)" ]`|< [NewsBean](#newsbean) > array|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**thumblist**  <br>*可选*|封面图列表  <br>**样例** : `[ "[thumbbean](#thumbbean)" ]`|< [ThumbBean](#thumbbean) > array|
|**total**  <br>*可选*|记录总数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="notstartedduobaovo"></a>
### NotStartedDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoStartTime**  <br>*可选*|夺宝开始时间  <br>**样例** : `0`|integer (int64)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**subscribe**  <br>*可选*|是否预约 true，已预约  <br>**样例** : `true`|boolean|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|


<a name="noticeuservo"></a>
### NoticeUserVO

|名称|说明|类型|
|---|---|---|
|**did**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="1d171ed9badb0073fcd2050e6b974aaa"></a>
### OfficePagerVO«List«UserPrizeHistoryVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[userprizehistoryvo](#userprizehistoryvo)" ]`|< [UserPrizeHistoryVO](#userprizehistoryvo) > array|
|**pager**  <br>*可选*|**样例** : `"[pagervo](#pagervo)"`|[PagerVO](#pagervo)|


<a name="oneloginvo"></a>
### OneLoginVO

|名称|说明|类型|
|---|---|---|
|**expires_time**  <br>*可选*|**样例** : `0`|integer (int32)|
|**newUser**  <br>*可选*|1新用户0老用户  <br>**样例** : `0`|integer (int32)|
|**old_token**  <br>*可选*|**样例** : `"string"`|string|
|**token**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**user**  <br>*可选*|**样例** : `"[userentity](#userentity)"`|[UserEntity](#userentity)|


<a name="optionbean"></a>
### OptionBean

|名称|说明|类型|
|---|---|---|
|**cancel**  <br>*可选*|取消按钮是否显示1显示0不显示  <br>**样例** : `0`|integer (int32)|
|**cancelConfirmContent**  <br>*可选*|取消提交前二次确认内容（富文本），为空不用二次确认  <br>**样例** : `"string"`|string|
|**cancelTip**  <br>*可选*|点击取消按钮提示（阻止取消）  <br>**样例** : `"string"`|string|
|**delete_status**  <br>*可选*|删除按钮状态，1显示 0不显示  <br>**样例** : `0`|integer (int32)|
|**edit**  <br>*可选*|修改按钮是否显示1显示0不显示。  <br>**样例** : `0`|integer (int32)|
|**editConfirmTip**  <br>*可选*|修改按钮二次确认文案，例如：由于旅游资源的特殊性，重新预订可能会导致价格及优惠信息发生变化  <br>**样例** : `"string"`|string|
|**editLabel**  <br>*可选*|修改按钮文案，例如：重新预订  <br>**样例** : `"string"`|string|
|**invoice**  <br>*可选*|是否可以索取发票，-1不显示 0 1显示按钮 2查看发票  <br>**样例** : `0`|integer (int32)|
|**invoice_tip**  <br>*可选*|点索取发票按钮提示（阻止申请发票）  <br>**样例** : `"string"`|string|
|**isPayRemind**  <br>*可选*|是否需要支付弹窗提醒（疫情时增加二次确认）  <br>**样例** : `0`|integer (int32)|
|**pay**  <br>*可选*|支付按钮是否显示1显示0不显示  <br>**样例** : `0`|integer (int32)|
|**payBtnLabel**  <br>*可选*|支付按钮文案  <br>**样例** : `"string"`|string|
|**payGray**  <br>*可选*|支付按钮是否灰色  <br>**样例** : `0`|integer (int32)|
|**payRemindBtn**  <br>*可选*|支付弹窗提醒，确定按钮文案（疫情时增加二次确认）  <br>**样例** : `"string"`|string|
|**payRemindContent**  <br>*可选*|支付弹窗提醒内容富文本（疫情时增加二次确认）  <br>**样例** : `"string"`|string|
|**payTip**  <br>*可选*|点击支付按钮提示（阻止支付）  <br>**样例** : `"string"`|string|
|**pjTip**  <br>*可选*|例如：改为好评  <br>**样例** : `"string"`|string|
|**pj_status**  <br>*可选*|评价按钮状态，0不可评价 1可评价 2查看评价  <br>**样例** : `0`|integer (int32)|
|**pj_url**  <br>*可选*|评价成功跳m站地址  <br>**样例** : `"string"`|string|
|**rebookStatus**  <br>*可选*|重新预订  <br>**样例** : `0`|integer (int32)|
|**refund_label**  <br>*可选*|退款显示按钮时对应的按钮文字  <br>**样例** : `"string"`|string|
|**refund_status**  <br>*可选*|退款按钮状态，0不显示1显示按钮  <br>**样例** : `0`|integer (int32)|
|**refund_tip**  <br>*可选*|点退款按钮提示（阻止退款）  <br>**样例** : `"string"`|string|
|**refund_url**  <br>*可选*|退款显示按钮时对应的h5链接  <br>**样例** : `"string"`|string|
|**showPjUrl**  <br>*可选*|酒套评价查看地址  <br>**样例** : `"string"`|string|


<a name="optionvo"></a>
### OptionVO

|名称|说明|类型|
|---|---|---|
|**label**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**value**  <br>*可选*|值  <br>**样例** : `"string"`|string|


<a name="orderaddfundfeeitemvo"></a>
### OrderAddFundFeeItemVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|例如：￥200  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|例如：游侠客民宿2晚房费  <br>**样例** : `"string"`|string|
|**fid**  <br>*可选*|费用id  <br>**样例** : `0`|integer (int32)|


<a name="orderaddfundvo"></a>
### OrderAddFundVO

|名称|说明|类型|
|---|---|---|
|**feeDetailList**  <br>*可选*|费用明细  <br>**样例** : `[ "[orderaddfundfeeitemvo](#orderaddfundfeeitemvo)" ]`|< [OrderAddFundFeeItemVO](#orderaddfundfeeitemvo) > array|
|**title**  <br>*可选*|追加款项  <br>**样例** : `"string"`|string|


<a name="orderbargainshowvo"></a>
### OrderBargainShowVo

|名称|说明|类型|
|---|---|---|
|**bargainAfterPrice**  <br>*可选*|有值才显示，砍价后订单金额  <br>**样例** : `"string"`|string|
|**bargainBeforePrice**  <br>*可选*|砍价前订单金额  <br>**样例** : `"string"`|string|
|**bargainPriceTip**  <br>*可选*|有值才显示，例如：已砍40,可优惠30  <br>**样例** : `"string"`|string|
|**bargainRuleContent**  <br>*可选*|砍价规则内容  <br>**样例** : `"string"`|string|
|**bargainRuleTitle**  <br>*可选*|砍价规则标题，例如：活动说明  <br>**样例** : `"string"`|string|
|**bargainStatus**  <br>*可选*|砍价状态1未通过还不能发起砍价2还未发起过砍价可发起砍价3砍价倒计时4砍价结束支付倒计时5报名成功，23都是可以发起砍价的  <br>**样例** : `0`|integer (int32)|
|**btnTip**  <br>*可选*|按钮文案，例如：邀请好友砍价  <br>**样例** : `"string"`|string|
|**cancelTip**  <br>*可选*|取消订单提示文字，例如：取消订单后您的砍价优惠也将一并作废确定进行取消吗？  <br>**样例** : `"string"`|string|
|**firstBargainPriceLabel**  <br>*可选*|下单首次，例如：￥ 1720  <br>**样例** : `"string"`|string|
|**firstBargainTip**  <br>*可选*|下单首次，例如：可砍至  <br>**样例** : `"string"`|string|
|**firstOldPriceLabel**  <br>*可选*|下单首次，例如：原价：￥1750  <br>**样例** : `"string"`|string|
|**firstTip**  <br>*可选*|下单首次，例如：恭喜你获得砍价福利，订单审核通过后可发起砍价！  <br>**样例** : `"string"`|string|
|**maxBargainPirce**  <br>*可选*|例如：50  <br>**样例** : `"string"`|string|
|**maxBargainPirceLabel**  <br>*可选*|例如：最高可砍价 50 元  <br>**样例** : `"string"`|string|
|**orderPassLabel**  <br>*可选*|例如：订单审核通过后即可发起砍价  <br>**样例** : `"string"`|string|
|**overLabel**  <br>*可选*|例如：距砍价结束还剩  <br>**样例** : `"string"`|string|
|**overPayLabel**  <br>*可选*|例如：砍价已完成请尽快支付，还剩  <br>**样例** : `"string"`|string|
|**overPaytime**  <br>*可选*|距离砍价支付结束多少秒  <br>**样例** : `0`|integer (int64)|
|**overtime**  <br>*可选*|距离砍价结束多少秒  <br>**样例** : `0`|integer (int64)|
|**payPastTip**  <br>*可选*|砍价支付倒计时结束点击支付时提示，例如：抱歉，您的砍价优惠已过期  <br>**样例** : `"string"`|string|
|**payTip**  <br>*可选*|砍价倒计时中点击支付时提示，例如：现在进行支付，您的砍价活动将会结束  <br>**样例** : `"string"`|string|


<a name="orderbargaintipvo"></a>
### OrderBargainTipVO

|名称|说明|类型|
|---|---|---|
|**howBargainUrl**  <br>*可选*|砍价规则图片链接  <br>**样例** : `"string"`|string|
|**leftTip**  <br>*可选*|文案：提交订单后发起砍价  <br>**样例** : `"string"`|string|
|**rightTip**  <br>*可选*|文案：最高再减¥20  <br>**样例** : `"string"`|string|


<a name="orderbargainvo"></a>
### OrderBargainVo

|名称|说明|类型|
|---|---|---|
|**canBargainMaxPrice**  <br>*可选*|最高可砍价格  <br>**样例** : `"string"`|string|
|**canBargainTip**  <br>*可选*|例如：该订单审核通过后可再小程序端发起砍价  <br>**样例** : `"string"`|string|
|**canBargainUrl**  <br>*可选*|订单可以砍价url图片  <br>**样例** : `"string"`|string|
|**cancelTip**  <br>*可选*|取消订单提示文字，例如：取消订单后您的砍价优惠也将一并作废确定进行取消吗？  <br>**样例** : `"string"`|string|
|**howBargainTip**  <br>*可选*|提示文字，例如：如何参与砍价  <br>**样例** : `"string"`|string|
|**howBargainUrl**  <br>*可选*|如何砍价url图片  <br>**样例** : `"string"`|string|
|**limitTip**  <br>*可选*|提示文字，例如：仅限在小程序端进行砍价和使用  <br>**样例** : `"string"`|string|
|**maxPriceTip**  <br>*可选*|提示文字，例如：最高可砍价50元  <br>**样例** : `"string"`|string|
|**payTip**  <br>*可选*|例如：您的订单正在参与砍价活动，请去小程序端进行支付  <br>**样例** : `"string"`|string|
|**payUrl**  <br>*可选*|去付款url图片  <br>**样例** : `"string"`|string|


<a name="orderbasebtn"></a>
### OrderBaseBtn

|名称|说明|类型|
|---|---|---|
|**btnStyle**  <br>*可选*|按钮样式 1-黄色样式；2-黑色样式  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|按钮文案  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|按钮状态，-1显示按钮（点击按钮弹出tip不进行任何操作），0不显示按钮，1显示，2显示（某些按钮特例，如：查看叫车，查看评价，查看退款，查看发票）  <br>**样例** : `0`|integer (int32)|
|**tip**  <br>*可选*|点击按钮提示，不进行任何操作  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|m站跳转链接（有些按钮跳转m站），用于app/小程序无原生页面时使用  <br>**样例** : `"string"`|string|


<a name="orderbasecardextravo"></a>
### OrderBaseCardExtraVO

|名称|说明|类型|
|---|---|---|
|**cardUserId**  <br>*可选*|用户权益卡id  <br>**样例** : `0`|integer (int32)|
|**freezedWarn**  <br>*可选*|冻结信息文案，例如：2020-12-12 00：00：00解冻  <br>**样例** : `"string"`|string|
|**refundLeftLabel**  <br>*可选*|退款左侧文案，例如：用户退卡  <br>**样例** : `"string"`|string|
|**refundPlanList**  <br>*可选*|退款进度，自下而上显示  <br>**样例** : `[ "[orderbasecardrefundplanvo](#orderbasecardrefundplanvo)" ]`|< [OrderBaseCardRefundPlanVO](#orderbasecardrefundplanvo) > array|
|**refundRightLabel**  <br>*可选*|退款右侧按钮文案，例如：退卡进度  <br>**样例** : `"string"`|string|
|**refundRightUrl**  <br>*可选*|退款右侧退卡进度链接  <br>**样例** : `"string"`|string|
|**usedTime**  <br>*可选*|使用次数，用户替换usedTimeLabel中数字样式，例如：2  <br>**样例** : `"string"`|string|
|**usedTimeLabel**  <br>*可选*|使用权益（为空时不显示），例如：使用权益2次  <br>**样例** : `"string"`|string|
|**usedUrl**  <br>*可选*|使用权益列表跳转链接，用于app/小程序无原生页面时使用  <br>**样例** : `"string"`|string|


<a name="orderbasecardrefundplanvo"></a>
### OrderBaseCardRefundPlanVO

|名称|说明|类型|
|---|---|---|
|**dateLabel**  <br>*可选*|时间点文案，例如：2020-04-25 16:23  <br>**样例** : `"string"`|string|
|**planLabel**  <br>*可选*|具体操作文案，例如：客服操作退卡  <br>**样例** : `"string"`|string|


<a name="orderbasecountitemvo"></a>
### OrderBaseCountItemVO

|名称|说明|类型|
|---|---|---|
|**iconUrl**  <br>*可选*|图标url  <br>**样例** : `"string"`|string|
|**orderCount**  <br>*可选*|订单数量  <br>**样例** : `0`|integer (int32)|
|**parameterJson**  <br>*可选*|跳转参数json，例如{'firstType':1,'secondType':1}  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|文案  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|


<a name="orderbasecountvo"></a>
### OrderBaseCountVO

|名称|说明|类型|
|---|---|---|
|**orderCountList**  <br>*可选*|各订单状态  <br>**样例** : `[ "[orderbasecountitemvo](#orderbasecountitemvo)" ]`|< [OrderBaseCountItemVO](#orderbasecountitemvo) > array|


<a name="orderbaselineextravo"></a>
### OrderBaseLineExtraVO

|名称|说明|类型|
|---|---|---|
|**bargainEndTime**  <br>*可选*|距离砍价结束时间多少秒  <br>**样例** : `0`|integer (int64)|
|**bargainPayOverTime**  <br>*可选*|距离砍价支付结束时间多少秒  <br>**样例** : `0`|integer (int64)|
|**isBargainOrder**  <br>*可选*|是否砍价订单  <br>**样例** : `0`|integer (int32)|
|**similarBtnTip**  <br>*可选*|相似线路按钮文案，没有值不显示按钮，例如：点击查看  <br>**样例** : `"string"`|string|
|**similarTip**  <br>*可选*|相似线路提示，没有值整行显示，例如：还有其他相似产品可报名无需替补  <br>**样例** : `"string"`|string|
|**similarUrl**  <br>*可选*|相似线路链接  <br>**样例** : `"string"`|string|


<a name="orderbaselistbuttonvo"></a>
### OrderBaseListButtonVO

|名称|说明|类型|
|---|---|---|
|**callCarBen**  <br>*可选*|叫车按钮，线路独有  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**comfirmReceiptBtn**  <br>*可选*|确认收货按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**detailBtn**  <br>*可选*|优惠券查看按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**evaluateBen**  <br>*可选*|评价按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**invoiceBtn**  <br>*可选*|发票按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**payBtn**  <br>*可选*|支付按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**rebookBtn**  <br>*可选*|重新预订按钮，线路独有  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**viewDeliveryBtn**  <br>*可选*|查看物流按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|
|**voucherBookBtn**  <br>*可选*|房券立即预约按钮  <br>**样例** : `"[orderbasebtn](#orderbasebtn)"`|[OrderBaseBtn](#orderbasebtn)|


<a name="orderbaselistextrainfovo"></a>
### OrderBaseListExtraInfoVO

|名称|说明|类型|
|---|---|---|
|**cardExtra**  <br>*可选*|权益卡订单附加信息  <br>**样例** : `"[orderbasecardextravo](#orderbasecardextravo)"`|[OrderBaseCardExtraVO](#orderbasecardextravo)|
|**lineExtra**  <br>*可选*|线路订单附加信息  <br>**样例** : `"[orderbaselineextravo](#orderbaselineextravo)"`|[OrderBaseLineExtraVO](#orderbaselineextravo)|
|**voucherExtra**  <br>*可选*|房券订单附加信息  <br>**样例** : `"[orderbasevoucherextravo](#orderbasevoucherextravo)"`|[OrderBaseVoucherExtraVO](#orderbasevoucherextravo)|
|**voucherLineExtra**  <br>*可选*|线路券订单附加信息  <br>**样例** : `"[orderbasevoucherlineextravo](#orderbasevoucherlineextravo)"`|[OrderBaseVoucherLineExtraVO](#orderbasevoucherlineextravo)|


<a name="orderbaselistitemvo"></a>
### OrderBaseListItemVO

|名称|说明|类型|
|---|---|---|
|**buttonInfo**  <br>*可选*|订单按钮信息  <br>**样例** : `"[orderbaselistbuttonvo](#orderbaselistbuttonvo)"`|[OrderBaseListButtonVO](#orderbaselistbuttonvo)|
|**extraInfo**  <br>*可选*|订单附加信息  <br>**样例** : `"[orderbaselistextrainfovo](#orderbaselistextrainfovo)"`|[OrderBaseListExtraInfoVO](#orderbaselistextrainfovo)|
|**iconUrl**  <br>*可选*|图标链接  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**orderAmount**  <br>*可选*|订单金额，例如：¥217.00  <br>**样例** : `"string"`|string|
|**orderNo**  <br>*可选*|订单编号  <br>**样例** : `"string"`|string|
|**productInfo**  <br>*可选*|订单产品信息  <br>**样例** : `"[orderbaselistproductinfovo](#orderbaselistproductinfovo)"`|[OrderBaseListProductInfoVO](#orderbaselistproductinfovo)|
|**statusColour**  <br>*可选*|状态文案颜色6位码  <br>**样例** : `"string"`|string|
|**statusName**  <br>*可选*|状态文案  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|订单类型，1、线路 2、集市 3、签证 4、酒套 5、权益卡 6、房券 7、线路券  <br>**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|订单类型名称，例如：旅游/集市等  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|m站订单详情跳转链接，用于app/小程序无原生页面时使用  <br>**样例** : `"string"`|string|


<a name="orderbaselistproductinfovo"></a>
### OrderBaseListProductInfoVO

|名称|说明|类型|
|---|---|---|
|**appendInfo**  <br>*可选*|追加信息，例如：['2018-9-12(周三)-2018-9','1成人，2儿童']  <br>**样例** : `[ "string" ]`|< string > array|
|**imageList**  <br>*可选*|产品图片，集市会有多张  <br>**样例** : `[ "string" ]`|< string > array|
|**productId**  <br>*可选*|产品id（线路，酒套，签证等）  <br>**样例** : `"string"`|string|
|**productName**  <br>*可选*|产品名称，例如：【火星酒套】人类未来太空旅行，跨越太空站  <br>**样例** : `"string"`|string|
|**unitInfo**  <br>*可选*|数量信息  <br>**样例** : `"string"`|string|


<a name="orderbasetabitemvo"></a>
### OrderBaseTabItemVO

|名称|说明|类型|
|---|---|---|
|**childType**  <br>*可选*|子类型  <br>**样例** : `[ "[orderbasetabitemvo](#orderbasetabitemvo)" ]`|< [OrderBaseTabItemVO](#orderbasetabitemvo) > array|
|**selected**  <br>*可选*|是否选中0否1是  <br>**样例** : `0`|integer (int32)|
|**typeId**  <br>*可选*|类型id  <br>**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|类型名称  <br>**样例** : `"string"`|string|


<a name="orderbasetabvo"></a>
### OrderBaseTabVO

|名称|说明|类型|
|---|---|---|
|**firstType**  <br>*可选*|一级类型，全部订单/旅行订单/集市订单等等  <br>**样例** : `[ "[orderbasetabitemvo](#orderbasetabitemvo)" ]`|< [OrderBaseTabItemVO](#orderbasetabitemvo) > array|
|**shareOrderParameterJson**  <br>*可选*|共享订单跳转参数json，例如{'firstType':1,'secondType',1}  <br>**样例** : `"string"`|string|
|**shareOrderTip**  <br>*可选*|共享订单文案（为空时不显示整行），例如：查看朋友共享给我的订单  <br>**样例** : `"string"`|string|


<a name="orderbasevoucherextravo"></a>
### OrderBaseVoucherExtraVO

|名称|说明|类型|
|---|---|---|
|**appointNum**  <br>*可选*|预约数量  <br>**样例** : `"string"`|string|
|**usedTime**  <br>*可选*|预约数量  <br>**样例** : `"string"`|string|


<a name="orderbasevoucherlineextravo"></a>
### OrderBaseVoucherLineExtraVO

|名称|说明|类型|
|---|---|---|
|**isHaveRefund**  <br>*可选*|是否有退款 1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**refundUrl**  <br>*可选*|退款列表地址  <br>**样例** : `"string"`|string|


<a name="orderbean"></a>
### OrderBean

|名称|说明|类型|
|---|---|---|
|**num**  <br>*可选*|顺序  <br>**样例** : `0`|integer (int32)|
|**typs**  <br>*可选*|h1,h2  <br>**样例** : `"string"`|string|


<a name="orderbeneficialtravelvo"></a>
### OrderBeneficialTravelVO

|名称|说明|类型|
|---|---|---|
|**cardRight**  <br>*可选*|户外卡（不为null说明有可用）  <br>**样例** : `"[orderrightvo](#orderrightvo)"`|[OrderRightVO](#orderrightvo)|
|**voucherRight**  <br>*可选*|预售券（不为null说明有可用）  <br>**样例** : `"[orderrightvo](#orderrightvo)"`|[OrderRightVO](#orderrightvo)|


<a name="orderbestsigncontractvo"></a>
### OrderBestSignContractVO

|名称|说明|类型|
|---|---|---|
|**btnType**  <br>*可选*|按钮点击响应类型  1：访问url 2：请求接口  <br>**样例** : `0`|integer (int32)|
|**contractReceiver**  <br>*可选*|合同接收人姓名  <br>**样例** : `"string"`|string|
|**contractReceiverPhone**  <br>*可选*|合同接收人手机号  <br>**样例** : `"string"`|string|
|**contractType**  <br>*可选*|合同类型 1：旅游合同 2：未成年补充协议 3：老年人补充协议 4：未成年人单独出行补充协议  <br>**样例** : `0`|integer (int32)|
|**orderBestSignId**  <br>*可选*|上上签合同表id  <br>**样例** : `0`|integer (int32)|
|**popTips**  <br>*可选*|弹窗提示内容  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|状态：1：未签署 2：已签署 -1：逾期未签署 -3：已拒签  <br>**样例** : `0`|integer (int32)|
|**tips**  <br>*可选*|底部tips 请%s%s查看签署短信，并签署  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|按钮地址  <br>**样例** : `"string"`|string|
|**urlType**  <br>*可选*|1：h5地址 2：PDF  <br>**样例** : `0`|integer (int32)|


<a name="orderbookprepayvo"></a>
### OrderBookPrepayVO

|名称|说明|类型|
|---|---|---|
|**leftTip**  <br>*可选*|例如：可支付预付款  <br>**样例** : `"string"`|string|
|**rightTip**  <br>*可选*|例如：团位紧张情况时，全款支付优先占位  <br>**样例** : `"string"`|string|


<a name="ordercardvo"></a>
### OrderCardVO

|名称|说明|类型|
|---|---|---|
|**orderMemberCardList**  <br>*可选*|权益卡出行人列表，长度可能为0  <br>**样例** : `[ "[ordermembercardvo](#ordermembercardvo)" ]`|< [OrderMemberCardVO](#ordermembercardvo) > array|
|**tip**  <br>*可选*|权益卡使用提示文案，例如：该线路使用权益卡只能报名绑卡的这一位用户并抵扣费用，其他用户请分开下单  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|权益卡服务协议跳转链接  <br>**样例** : `"string"`|string|


<a name="ordercomfirmtermsvo"></a>
### OrderComfirmTermsVO

|名称|说明|类型|
|---|---|---|
|**comfirmType**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|文件类型  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题,例如：退订政策  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|地址  <br>**样例** : `"string"`|string|


<a name="ordercompanydetailvo"></a>
### OrderCompanyDetailVO

|名称|说明|类型|
|---|---|---|
|**leftTip**  <br>*可选*|例如：供应商  <br>**样例** : `"string"`|string|
|**rightTip**  <br>*可选*|例如：浙江游侠客国际旅行社有限公司广州分公司  <br>**样例** : `"string"`|string|
|**rightUrl**  <br>*可选*|type为1时，点击跳转链接，为空不处理  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型1供应商，2联系方式，3其他信息不用特殊处理只展示  <br>**样例** : `0`|integer (int32)|


<a name="ordercompanyvo"></a>
### OrderCompanyVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|供应商信息列表  <br>**样例** : `[ "[ordercompanydetailvo](#ordercompanydetailvo)" ]`|< [OrderCompanyDetailVO](#ordercompanydetailvo) > array|
|**title**  <br>*可选*|标题，例如：供应商信息  <br>**样例** : `"string"`|string|


<a name="orderconfirmvo"></a>
### OrderConfirmVO

|名称|说明|类型|
|---|---|---|
|**adult**  <br>*可选*|成人数量  <br>**样例** : `0`|integer (int32)|
|**adultprice**  <br>*可选*|线路-成人价  <br>**样例** : `"string"`|string|
|**agentDesc**  <br>*可选*|代理公司活动说明：本线路由浙江游侠客国际旅行社有限公司及具有合法资质的供应商提供相关服务。  <br>**样例** : `"string"`|string|
|**bargainTip**  <br>*可选*|优惠信息下面的砍价信息  <br>**样例** : `"[orderbargaintipvo](#orderbargaintipvo)"`|[OrderBargainTipVO](#orderbargaintipvo)|
|**batchInfo**  <br>*可选*|批次信息  <br>**样例** : `"[batchbean](#batchbean)"`|[BatchBean](#batchbean)|
|**batch_fees**  <br>*可选*|其他费用信息  <br>**样例** : `[ "[batchfeebean](#batchfeebean)" ]`|< [BatchFeeBean](#batchfeebean) > array|
|**beneficialTravel**  <br>*可选*|权益出行  <br>**样例** : `"[orderbeneficialtravelvo](#orderbeneficialtravelvo)"`|[OrderBeneficialTravelVO](#orderbeneficialtravelvo)|
|**bid**  <br>*可选*|批次bid  <br>**样例** : `0`|integer (int32)|
|**bookingReminder**  <br>*可选*|预订提醒  <br>**样例** : `"string"`|string|
|**cardTypeIds**  <br>*可选*|证件类型数组  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**cardTypeTip**  <br>*可选*|证件类型不允许提示，例如：该线路仅支持二代身份证、军官证报名  <br>**样例** : `"string"`|string|
|**cardUsable**  <br>*可选*|线路-是否可用权益卡，1可用0不可用（兼容app老版本此字段保留）  <br>**样例** : `0`|integer (int32)|
|**child**  <br>*可选*|成人儿童数量  <br>**样例** : `0`|integer (int32)|
|**childprice**  <br>*可选*|线路-儿童价  <br>**样例** : `"string"`|string|
|**class_region_id**  <br>*可选*|产品区域id  <br>**样例** : `0`|integer (int32)|
|**confirmTerms**  <br>*可选*|确认条款  <br>**样例** : `[ "[ordercomfirmtermsvo](#ordercomfirmtermsvo)" ]`|< [OrderComfirmTermsVO](#ordercomfirmtermsvo) > array|
|**contact_email**  <br>*可选*|预订人邮箱  <br>**样例** : `"string"`|string|
|**contact_name**  <br>*可选*|预订人姓名  <br>**样例** : `"string"`|string|
|**contact_phone**  <br>*可选*|预订人手机  <br>**样例** : `"string"`|string|
|**contractTip**  <br>*可选*|合同提示文案  <br>**样例** : `"string"`|string|
|**daily_pkg**  <br>*可选*|线路-行程套餐信息  <br>**样例** : `"[batchpkgbean](#batchpkgbean)"`|[BatchPkgBean](#batchpkgbean)|
|**days**  <br>*可选*|线路-天数  <br>**样例** : `0`|integer (int32)|
|**discount**  <br>*可选*|线路-优惠政策说明  <br>**样例** : `"[orderdiscountbean](#orderdiscountbean)"`|[OrderDiscountBean](#orderdiscountbean)|
|**discountList**  <br>*可选*|优惠信息  <br>**样例** : `[ "[productdiscountvo](#productdiscountvo)" ]`|< [ProductDiscountVo](#productdiscountvo) > array|
|**fileMax**  <br>*可选*|线路-上传单个文件最大容量单位M  <br>**样例** : `0`|integer (int32)|
|**fileNumMax**  <br>*可选*|线路-上传文件最大个数  <br>**样例** : `0`|integer (int32)|
|**healthTip**  <br>*可选*|顶部健康码提示  <br>**样例** : `"string"`|string|
|**hetongTip**  <br>*可选*|线路-预订须知弹出提示（有内容只弹出提示不跳转h5页面）  <br>**样例** : `"string"`|string|
|**hetong_msg**  <br>*可选*|线路-预订须知提示语  <br>**样例** : `"string"`|string|
|**hk_exp**  <br>*可选*|港澳通行证限制：行程结束后的3个月时间以上  <br>**样例** : `0`|integer (int64)|
|**hk_pass**  <br>*可选*|港澳通行证限制：是否港澳通行证  <br>**样例** : `0`|integer (int32)|
|**hk_tip**  <br>*可选*|港澳线路通行证有效期在行程结束日期3个月以上才可出行  <br>**样例** : `"string"`|string|
|**hotelInfo**  <br>*可选*|酒套-酒店信息  <br>**样例** : `"[orderhotelinfovo](#orderhotelinfovo)"`|[OrderHotelInfoVo](#orderhotelinfovo)|
|**insurance**  <br>*可选*|保险信息  <br>**样例** : `"[insurancebean](#insurancebean)"`|[InsuranceBean](#insurancebean)|
|**isNeedConfirm**  <br>*可选*|是否需要《预订须知》，1需要0不需要  <br>**样例** : `0`|integer (int32)|
|**isNeedContract**  <br>*可选*|是否需要合同 1：需要 0：不需要  <br>**样例** : `0`|integer (int32)|
|**is_free**  <br>*可选*|线路-is_free  <br>**样例** : `0`|integer (int32)|
|**is_mail**  <br>*可选*|是否显示邮箱填写  <br>**样例** : `0`|integer (int32)|
|**jihe_msg**  <br>*可选*|线路-集合信息  <br>**样例** : `"string"`|string|
|**jihe_tip**  <br>*可选*|线路-(多人不同集合点请分开下订单)  <br>**样例** : `"string"`|string|
|**jihe_title**  <br>*可选*|线路-选择集合点  <br>**样例** : `"string"`|string|
|**jihedian**  <br>*可选*|线路-集合点  <br>**样例** : `[ "[orderjihebean](#orderjihebean)" ]`|< [OrderJiheBean](#orderjihebean) > array|
|**limited**  <br>*可选*|预订限制说明  <br>**样例** : `[ "string" ]`|< string > array|
|**needOrderattach**  <br>*可选*|线路-是否需要上传附件  <br>**样例** : `0`|integer (int32)|
|**needPsgNum**  <br>*可选*|酒套-需要出行人的情况下出行人数量1全部出行人2仅预订人  <br>**样例** : `0`|integer (int32)|
|**need_psg**  <br>*可选*|是否需要出行人信息  <br>**样例** : `0`|integer (int32)|
|**nights**  <br>*可选*|线路-晚数  <br>**样例** : `0`|integer (int32)|
|**no_passport**  <br>*可选*|**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|订单oid  <br>**样例** : `0`|integer (int32)|
|**orderRefund**  <br>*可选*|退款相关  <br>**样例** : `"[orderrefundvo](#orderrefundvo)"`|[OrderRefundVO](#orderrefundvo)|
|**orderRemark**  <br>*可选*|特殊备注信息  <br>**样例** : `"string"`|string|
|**orderRemarkTip**  <br>*可选*|线路-特殊备注提示语  <br>**样例** : `"string"`|string|
|**orderTip**  <br>*可选*|下单提示文案  <br>**样例** : `"string"`|string|
|**orderattachRemark**  <br>*可选*|线路-附件说明  <br>**样例** : `"string"`|string|
|**passport_exp**  <br>*可选*|护照限制：行程结束后的6个月时间以上  <br>**样例** : `0`|integer (int64)|
|**passport_tip**  <br>*可选*|出境线路护照有效期在行程结束日期6个月以上才可出行  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品pid  <br>**样例** : `0`|integer (int32)|
|**pkg**  <br>*可选*|批次套餐信息  <br>**样例** : `"[batchpkgbean](#batchpkgbean)"`|[BatchPkgBean](#batchpkgbean)|
|**prepay**  <br>*可选*|预付款相关  <br>**样例** : `"[orderbookprepayvo](#orderbookprepayvo)"`|[OrderBookPrepayVO](#orderbookprepayvo)|
|**price_label**  <br>*可选*|线路-price_label  <br>**样例** : `"string"`|string|
|**prodcut_free**  <br>*可选*|是否免费活动  <br>**样例** : `0`|integer (int32)|
|**product_cate_type**  <br>*可选*|线路-产品性质、产品类型  <br>**样例** : `[ "string" ]`|< string > array|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_sub_name**  <br>*可选*|产品副名称  <br>**样例** : `"string"`|string|
|**refundTip**  <br>*可选*|退款文案  <br>**样例** : `"string"`|string|
|**requireOrderRemark**  <br>*可选*|线路-特殊备注信息是否必填  <br>**样例** : `0`|integer (int32)|
|**requireOrderattach**  <br>*可选*|线路-附件是否必传  <br>**样例** : `0`|integer (int32)|
|**starttime**  <br>*可选*|线路-批次时间已格式化  <br>**样例** : `"string"`|string|
|**ticketsInfo**  <br>*可选*|酒套-门票信息  <br>**样例** : `"[orderticketsinfovo](#orderticketsinfovo)"`|[OrderTicketsInfoVo](#orderticketsinfovo)|
|**tips_children**  <br>*可选*|线路-儿童费用说明  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**yxbTip**  <br>*可选*|游侠币抵扣Model  <br>**样例** : `"[yxbtipvo](#yxbtipvo)"`|[YxbTipVo](#yxbtipvo)|


<a name="ordercontractresendrq"></a>
### OrderContractResendRQ

|名称|说明|类型|
|---|---|---|
|**enableIDCert**  <br>*可选*|是否需要实名认证 1:需要 0：不需要  <br>**样例** : `0`|integer (int32)|
|**mobile**  <br>*可选*|合同接收手机号  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|合同接收人姓名  <br>**样例** : `"string"`|string|
|**orderBestSignId**  <br>*可选*|上上签合同表id  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="ordercontractsignremindrq"></a>
### OrderContractSignRemindRQ

|名称|说明|类型|
|---|---|---|
|**orderBestSignId**  <br>*必填*|上上签合同表id  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="ordercontractsignremindvo"></a>
### OrderContractSignRemindVO

|名称|说明|类型|
|---|---|---|
|**popMessage**  <br>*可选*|前端弹窗提醒 %s需要本人签署，短息已发送到%s%s，请通知他完成签署  <br>**样例** : `"string"`|string|


<a name="ordercouponvo"></a>
### OrderCouponVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|金额  <br>**样例** : `0.0`|number|
|**codeid**  <br>*可选*|codeid  <br>**样例** : `0`|integer (int32)|


<a name="orderdeductionvo"></a>
### OrderDeductionVo

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|余额-抵扣的金额  <br>**样例** : `0.0`|number|
|**balanceClose**  <br>*可选*|余额抵扣是否关闭：1关闭  <br>**样例** : `0`|integer (int32)|
|**balanceTitle**  <br>*可选*|标题例如：余额  <br>**样例** : `"string"`|string|
|**moneyLabel**  <br>*可选*|余额-抵扣信息  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|余额-是否选中  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题例如：账户抵扣  <br>**样例** : `"string"`|string|
|**yxbAmount**  <br>*可选*|游侠币-抵扣的金额  <br>**样例** : `0.0`|number|
|**yxbClose**  <br>*可选*|游侠币抵扣是否关闭：1关闭  <br>**样例** : `0`|integer (int32)|
|**yxbMoneyLabel**  <br>*可选*|游侠币-抵扣信息  <br>**样例** : `"string"`|string|
|**yxbSelected**  <br>*可选*|游侠币-是否选中  <br>**样例** : `0`|integer (int32)|
|**yxbTitle**  <br>*可选*|标题例如：游侠币  <br>**样例** : `"string"`|string|


<a name="orderdetailvo"></a>
### OrderDetailVO

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|报名时间  <br>**样例** : `"string"`|string|
|**adult**  <br>*可选*|成人数  <br>**样例** : `0`|integer (int32)|
|**adverts**  <br>*可选*|广告位  <br>**样例** : `[ "[advo](#advo)" ]`|< [AdVo](#advo) > array|
|**amount**  <br>*可选*|总需支付金额  <br>**样例** : `"string"`|string|
|**applyTime**  <br>*可选*|报名时间，例如：2018-9-12 16:39:07  <br>**样例** : `"string"`|string|
|**auditTip**  <br>*可选*|审核弹窗提示，为空不提示，例如：订单通过审核才可确认出行哦。请您关注订单状态，安排出行计划  <br>**样例** : `"string"`|string|
|**bargainShow**  <br>*可选*|订单砍价相关  <br>**样例** : `"[orderbargainshowvo](#orderbargainshowvo)"`|[OrderBargainShowVo](#orderbargainshowvo)|
|**batch_name**  <br>*可选*|无  <br>**样例** : `"string"`|string|
|**batch_time**  <br>*可选*|批次时间  <br>**样例** : `"string"`|string|
|**bestSignContractList**  <br>*可选*|电子合同列表  <br>**样例** : `[ "[orderbestsigncontractvo](#orderbestsigncontractvo)" ]`|< [OrderBestSignContractVO](#orderbestsigncontractvo) > array|
|**canPay**  <br>*可选*|是否自动调用支付弹窗接口  <br>**样例** : `0`|integer (int32)|
|**canPayTip**  <br>*可选*|canPay为0时无法自动支付弹窗原因信息  <br>**样例** : `"string"`|string|
|**cancelLabel**  <br>*可选*|订单取消优惠券提示文案  <br>**样例** : `"string"`|string|
|**cancelReason**  <br>*可选*|取消原因选项  <br>**样例** : `[ "[cancelreasonvo](#cancelreasonvo)" ]`|< [CancelReasonVo](#cancelreasonvo) > array|
|**child**  <br>*可选*|儿童数  <br>**样例** : `0`|integer (int32)|
|**contact_email**  <br>*可选*|预订人邮箱  <br>**样例** : `"string"`|string|
|**contact_name**  <br>*可选*|预订人名字  <br>**样例** : `"string"`|string|
|**contact_phone**  <br>*可选*|预订人手机号  <br>**样例** : `"string"`|string|
|**contractList**  <br>*可选*|合同和行程单  <br>**样例** : `[ "[contractbean](#contractbean)" ]`|< [ContractBean](#contractbean) > array|
|**contractTip**  <br>*可选*|合同和行程单下载提示  <br>**样例** : `"string"`|string|
|**coupon**  <br>*可选*|优惠券使用信息  <br>**样例** : `"[couponbean_1](#couponbean_1)"`|[CouponBean_1](#couponbean_1)|
|**daily_pkg**  <br>*可选*|行程套餐信息  <br>**样例** : `"[dailypkgbean](#dailypkgbean)"`|[DailyPkgBean](#dailypkgbean)|
|**deleted**  <br>*可选*|是否取消  <br>**样例** : `0`|integer (int32)|
|**editTip**  <br>*可选*|点击修改按钮提示，阻止修改  <br>**样例** : `"string"`|string|
|**expireTime**  <br>*可选*|支付剩余时间  <br>**样例** : `"string"`|string|
|**extra_service**  <br>*可选*|叫车服务  <br>**样例** : `"[extraservice](#extraservice)"`|[ExtraService](#extraservice)|
|**feeTip**  <br>*可选*|费用明细提示，如：优惠即将过期，请尽快支付哦~  <br>**样例** : `"string"`|string|
|**fee_details**  <br>*可选*|费用明细html  <br>**样例** : `"string"`|string|
|**files**  <br>*可选*|附件地址  <br>**样例** : `[ "[filesitemvo](#filesitemvo)" ]`|< [FilesItemVo](#filesitemvo) > array|
|**firstAidCardBtnShow**  <br>*可选*|医疗急救卡弹窗按钮是否显示，1：是，0：否  <br>**样例** : `0`|integer (int32)|
|**healthTip**  <br>*可选*|顶部健康码提示  <br>**样例** : `"string"`|string|
|**hotelInfo**  <br>*可选*|酒套-酒店信息  <br>**样例** : `"[orderhotelinfovo](#orderhotelinfovo)"`|[OrderHotelInfoVo](#orderhotelinfovo)|
|**html_status**  <br>*可选*|状态说明html  <br>**样例** : `"string"`|string|
|**insurance**  <br>*可选*|保险信息  <br>**样例** : `"[insurancebean_1](#insurancebean_1)"`|[InsuranceBean_1](#insurancebean_1)|
|**insuranceChange**  <br>*可选*|保险是否变化  <br>**样例** : `0`|integer (int32)|
|**isNeedSignContract**  <br>*可选*|是否需要签署合同 1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**jihedian**  <br>*可选*|集合点信息  <br>**样例** : `"[jihedianbean](#jihedianbean)"`|[JihedianBean](#jihedianbean)|
|**medicalCard**  <br>*可选*|医疗急救卡  <br>**样例** : `"[medicalcardvo](#medicalcardvo)"`|[MedicalCardVO](#medicalcardvo)|
|**members**  <br>*可选*|出行人信息  <br>**样例** : `[ "[membersbean](#membersbean)" ]`|< [MembersBean](#membersbean) > array|
|**miniPayed_amount**  <br>*可选*|小程序已支付金额  <br>**样例** : `0.0`|number|
|**office_url**  <br>*可选*|后台的链接地址  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**option**  <br>*可选*|按钮控制  <br>**样例** : `"[optionbean](#optionbean)"`|[OptionBean](#optionbean)|
|**orderAddFund**  <br>*可选*|追加款项  <br>**样例** : `"[orderaddfundvo](#orderaddfundvo)"`|[OrderAddFundVO](#orderaddfundvo)|
|**orderBargain**  <br>*可选*|订单砍价引导小程序相关  <br>**样例** : `"[orderbargainvo](#orderbargainvo)"`|[OrderBargainVo](#orderbargainvo)|
|**orderCompany**  <br>*可选*|供应商信息  <br>**样例** : `"[ordercompanyvo](#ordercompanyvo)"`|[OrderCompanyVO](#ordercompanyvo)|
|**orderFeePo**  <br>*可选*|费用明细数据  <br>**样例** : `"[orderfeepo](#orderfeepo)"`|[OrderFeePo](#orderfeepo)|
|**orderShare**  <br>*可选*|订单分享相关  <br>**样例** : `"[ordersharevo](#ordersharevo)"`|[OrderShareVO](#ordersharevo)|
|**orderno**  <br>*可选*|订单编号  <br>**样例** : `"string"`|string|
|**payInfo**  <br>*可选*|已支付信息，有就展示，例如：已支付￥1000，待支付￥720  <br>**样例** : `"string"`|string|
|**payed_amount**  <br>*可选*|已支付金额  <br>**样例** : `0.0`|number|
|**pkg**  <br>*可选*|批次套餐信息  <br>**样例** : `"[pkgbean](#pkgbean)"`|[PkgBean](#pkgbean)|
|**prepay**  <br>*可选*|预付款相关  <br>**样例** : `"[orderprepayvo](#orderprepayvo)"`|[OrderPrepayVO](#orderprepayvo)|
|**product**  <br>*可选*|产品信息  <br>**样例** : `"[productbean](#productbean)"`|[ProductBean](#productbean)|
|**recommendTags**  <br>*可选*|推荐标签列表  <br>**样例** : `[ "[ordersrecommendtagsvo](#ordersrecommendtagsvo)" ]`|< [OrdersRecommendTagsVo](#ordersrecommendtagsvo) > array|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**signHelp**  <br>*可选*|签署帮助内容html  <br>**样例** : `"string"`|string|
|**signHelpUrl**  <br>*可选*|签署帮助内容页面地址  <br>**样例** : `"string"`|string|
|**similarBtnTip**  <br>*可选*|相似线路按钮文案，没有值不显示按钮，例如：相似线路  <br>**样例** : `"string"`|string|
|**similarTip**  <br>*可选*|相似线路提示，没有值不显示，例如：还有其他相似产品可报名无需替补  <br>**样例** : `"string"`|string|
|**similarUrl**  <br>*可选*|相似线路链接  <br>**样例** : `"string"`|string|
|**sportSignVo**  <br>*可选*|大型活动签到  <br>**样例** : `"[sportsignvo](#sportsignvo)"`|[SportSignVo](#sportsignvo)|
|**status**  <br>*可选*|订单状态  <br>**样例** : `0`|integer (int32)|
|**statusStepList**  <br>*可选*|顶部流程  <br>**样例** : `[ "[statusstep](#statusstep)" ]`|< [StatusStep](#statusstep) > array|
|**status_steps**  <br>*可选*|状态流程  <br>**样例** : `[ "string" ]`|< string > array|
|**ticketsInfo**  <br>*可选*|酒套-门票信息  <br>**样例** : `"[orderticketsinfovo](#orderticketsinfovo)"`|[OrderTicketsInfoVo](#orderticketsinfovo)|
|**tipLabel**  <br>*可选*|弹出提示语  <br>**样例** : `"string"`|string|
|**unpayed_amount**  <br>*可选*|未支付金额  <br>**样例** : `"string"`|string|
|**upgrade_label**  <br>*可选*|腾讯、google、百度地图导航请更新版本  <br>**样例** : `"string"`|string|
|**upgrade_map**  <br>*可选*|无  <br>**样例** : `0`|integer (int32)|


<a name="orderdiscountbean"></a>
### OrderDiscountBean

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|例如：查看优惠政策  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|链接url  <br>**样例** : `"string"`|string|


<a name="ordereditvo"></a>
### OrderEditVO

|名称|说明|类型|
|---|---|---|
|**adult**  <br>*可选*|成人数量  <br>**样例** : `0`|integer (int32)|
|**adultprice**  <br>*可选*|线路-成人价  <br>**样例** : `"string"`|string|
|**agentDesc**  <br>*可选*|代理公司活动说明：本线路由浙江游侠客国际旅行社有限公司及具有合法资质的供应商提供相关服务。  <br>**样例** : `"string"`|string|
|**bargainTip**  <br>*可选*|优惠信息下面的砍价信息  <br>**样例** : `"[orderbargaintipvo](#orderbargaintipvo)"`|[OrderBargainTipVO](#orderbargaintipvo)|
|**batchInfo**  <br>*可选*|批次信息  <br>**样例** : `"[batchbean](#batchbean)"`|[BatchBean](#batchbean)|
|**batch_fees**  <br>*可选*|其他费用信息  <br>**样例** : `[ "[batchfeebean](#batchfeebean)" ]`|< [BatchFeeBean](#batchfeebean) > array|
|**beneficialTravel**  <br>*可选*|权益出行  <br>**样例** : `"[orderbeneficialtravelvo](#orderbeneficialtravelvo)"`|[OrderBeneficialTravelVO](#orderbeneficialtravelvo)|
|**bid**  <br>*可选*|批次bid  <br>**样例** : `0`|integer (int32)|
|**bookingReminder**  <br>*可选*|预订提醒  <br>**样例** : `"string"`|string|
|**cardTypeIds**  <br>*可选*|证件类型数组  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**cardTypeTip**  <br>*可选*|证件类型不允许提示，例如：该线路仅支持二代身份证、军官证报名  <br>**样例** : `"string"`|string|
|**child**  <br>*可选*|成人儿童数量  <br>**样例** : `0`|integer (int32)|
|**child_num**  <br>*可选*|儿童数量  <br>**样例** : `0`|integer (int32)|
|**childprice**  <br>*可选*|线路-儿童价  <br>**样例** : `"string"`|string|
|**chosen_jhd**  <br>*可选*|选择的集合点id  <br>**样例** : `0`|integer (int32)|
|**class_region_id**  <br>*可选*|产品区域id  <br>**样例** : `0`|integer (int32)|
|**confirmTerms**  <br>*可选*|确认条款  <br>**样例** : `[ "[ordercomfirmtermsvo](#ordercomfirmtermsvo)" ]`|< [OrderComfirmTermsVO](#ordercomfirmtermsvo) > array|
|**contact_email**  <br>*可选*|预订人邮箱  <br>**样例** : `"string"`|string|
|**contact_name**  <br>*可选*|预订人姓名  <br>**样例** : `"string"`|string|
|**contact_phone**  <br>*可选*|预订人手机  <br>**样例** : `"string"`|string|
|**contractTip**  <br>*可选*|合同提示文案  <br>**样例** : `"string"`|string|
|**daily_pkg**  <br>*可选*|线路-行程套餐信息  <br>**样例** : `"[batchpkgbean](#batchpkgbean)"`|[BatchPkgBean](#batchpkgbean)|
|**days**  <br>*可选*|线路-天数  <br>**样例** : `0`|integer (int32)|
|**discount**  <br>*可选*|线路-优惠政策说明  <br>**样例** : `"[orderdiscountbean](#orderdiscountbean)"`|[OrderDiscountBean](#orderdiscountbean)|
|**discountList**  <br>*可选*|优惠信息  <br>**样例** : `[ "[productdiscountvo](#productdiscountvo)" ]`|< [ProductDiscountVo](#productdiscountvo) > array|
|**fileMax**  <br>*可选*|线路-上传单个文件最大容量单位M  <br>**样例** : `0`|integer (int32)|
|**fileNumMax**  <br>*可选*|线路-上传文件最大个数  <br>**样例** : `0`|integer (int32)|
|**files**  <br>*可选*|附件地址  <br>**样例** : `[ "[filesitemvo](#filesitemvo)" ]`|< [FilesItemVo](#filesitemvo) > array|
|**healthTip**  <br>*可选*|顶部健康码提示  <br>**样例** : `"string"`|string|
|**hetongTip**  <br>*可选*|线路-预订须知弹出提示（有内容只弹出提示不跳转h5页面）  <br>**样例** : `"string"`|string|
|**hetong_msg**  <br>*可选*|线路-预订须知提示语  <br>**样例** : `"string"`|string|
|**hk_exp**  <br>*可选*|港澳通行证限制：行程结束后的3个月时间以上  <br>**样例** : `0`|integer (int64)|
|**hk_pass**  <br>*可选*|港澳通行证限制：是否港澳通行证  <br>**样例** : `0`|integer (int32)|
|**hk_tip**  <br>*可选*|港澳线路通行证有效期在行程结束日期3个月以上才可出行  <br>**样例** : `"string"`|string|
|**insurance**  <br>*可选*|保险信息  <br>**样例** : `"[insurancebean](#insurancebean)"`|[InsuranceBean](#insurancebean)|
|**isNeedConfirm**  <br>*可选*|是否需要《预订须知》，1需要0不需要  <br>**样例** : `0`|integer (int32)|
|**isNeedContract**  <br>*可选*|是否需要合同 1：需要 0：不需要  <br>**样例** : `0`|integer (int32)|
|**is_free**  <br>*可选*|线路-is_free  <br>**样例** : `0`|integer (int32)|
|**is_mail**  <br>*可选*|是否显示邮箱填写  <br>**样例** : `0`|integer (int32)|
|**jihe_msg**  <br>*可选*|线路-集合信息  <br>**样例** : `"string"`|string|
|**jihe_tip**  <br>*可选*|线路-(多人不同集合点请分开下订单)  <br>**样例** : `"string"`|string|
|**jihe_title**  <br>*可选*|线路-选择集合点  <br>**样例** : `"string"`|string|
|**jihedian**  <br>*可选*|线路-集合点  <br>**样例** : `[ "[orderjihebean](#orderjihebean)" ]`|< [OrderJiheBean](#orderjihebean) > array|
|**limited**  <br>*可选*|预订限制说明  <br>**样例** : `[ "string" ]`|< string > array|
|**limitedLs**  <br>*可选*|例如：重要提醒……  <br>**样例** : `[ "string" ]`|< string > array|
|**membersList**  <br>*可选*|出行人列表  <br>**样例** : `[ "[memberslistbeanvo](#memberslistbeanvo)" ]`|< [MembersListBeanVO](#memberslistbeanvo) > array|
|**needOrderattach**  <br>*可选*|线路-是否需要上传附件  <br>**样例** : `0`|integer (int32)|
|**need_psg**  <br>*可选*|是否需要出行人信息  <br>**样例** : `0`|integer (int32)|
|**nights**  <br>*可选*|线路-晚数  <br>**样例** : `0`|integer (int32)|
|**no_passport**  <br>*可选*|**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|成人数量  <br>**样例** : `0`|integer (int32)|
|**office_fee**  <br>*可选*|后台手动操作费用  <br>**样例** : `0.0`|number (float)|
|**oid**  <br>*可选*|订单oid  <br>**样例** : `0`|integer (int32)|
|**orderRefund**  <br>*可选*|退款相关  <br>**样例** : `"[orderrefundvo](#orderrefundvo)"`|[OrderRefundVO](#orderrefundvo)|
|**orderRemark**  <br>*可选*|特殊备注信息  <br>**样例** : `"string"`|string|
|**orderRemarkTip**  <br>*可选*|线路-特殊备注提示语  <br>**样例** : `"string"`|string|
|**orderTip**  <br>*可选*|下单提示文案  <br>**样例** : `"string"`|string|
|**orderattachRemark**  <br>*可选*|线路-附件说明  <br>**样例** : `"string"`|string|
|**passport_exp**  <br>*可选*|护照限制：行程结束后的6个月时间以上  <br>**样例** : `0`|integer (int64)|
|**passport_tip**  <br>*可选*|出境线路护照有效期在行程结束日期6个月以上才可出行  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品pid  <br>**样例** : `0`|integer (int32)|
|**pkg**  <br>*可选*|批次套餐信息  <br>**样例** : `"[batchpkgbean](#batchpkgbean)"`|[BatchPkgBean](#batchpkgbean)|
|**prepay**  <br>*可选*|预付款相关  <br>**样例** : `"[orderbookprepayvo](#orderbookprepayvo)"`|[OrderBookPrepayVO](#orderbookprepayvo)|
|**prodcut_free**  <br>*可选*|是否免费活动  <br>**样例** : `0`|integer (int32)|
|**product_cate_type**  <br>*可选*|线路-产品性质、产品类型  <br>**样例** : `[ "string" ]`|< string > array|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_sub_name**  <br>*可选*|产品副名称  <br>**样例** : `"string"`|string|
|**refundTip**  <br>*可选*|退款文案  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|填写的备注  <br>**样例** : `"string"`|string|
|**requireOrderRemark**  <br>*可选*|线路-特殊备注信息是否必填  <br>**样例** : `0`|integer (int32)|
|**requireOrderattach**  <br>*可选*|线路-附件是否必传  <br>**样例** : `0`|integer (int32)|
|**sale_info**  <br>*可选*|优惠信息  <br>**样例** : `"[saleinfobean](#saleinfobean)"`|[SaleInfoBean](#saleinfobean)|
|**starttime**  <br>*可选*|线路-批次时间已格式化  <br>**样例** : `"string"`|string|
|**starttime_mini**  <br>*可选*|批次开始时间格式yyyy-MM-dd  <br>**样例** : `"string"`|string|
|**sub_name**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tips_children**  <br>*可选*|线路-儿童费用说明  <br>**样例** : `"string"`|string|
|**total_fee**  <br>*可选*|订单费用  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**yxbTip**  <br>*可选*|游侠币抵扣Model  <br>**样例** : `"[yxbtipvo](#yxbtipvo)"`|[YxbTipVo](#yxbtipvo)|


<a name="orderevaluationaddtagvo"></a>
### OrderEvaluationAddTagVO

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|评价提示  <br>**样例** : `"string"`|string|
|**leader**  <br>*可选*|领队  <br>**样例** : `"[productleadervo](#productleadervo)"`|[ProductLeaderVo](#productleadervo)|
|**stars**  <br>*可选*|评价星级  <br>**样例** : `[ "[evaluationstarvo](#evaluationstarvo)" ]`|< [EvaluationStarVO](#evaluationstarvo) > array|
|**type**  <br>*可选*|标签类型：1领队2地接导游3行程4产品5酒店6司机  <br>**样例** : `0`|integer (int32)|


<a name="orderevaluationaddvo"></a>
### OrderEvaluationAddVO

|名称|说明|类型|
|---|---|---|
|**allowDiscoverText**  <br>*可选*|允许优质评价自动同步至遇见  <br>**样例** : `"string"`|string|
|**amount_tips**  <br>*可选*|优惠券提示语  <br>**样例** : `"string"`|string|
|**giveCouponAmount**  <br>*可选*|赠送优惠券金额，0表示不送  <br>**样例** : `0`|integer (int32)|
|**giveCredits**  <br>*可选*|赠送积分数量，0表示不送  <br>**样例** : `0`|integer (int32)|
|**html**  <br>*可选*|评价帮助页面内容  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**product**  <br>*可选*|线路信息  <br>**样例** : `"[productvo_1](#productvo_1)"`|[ProductVO_1](#productvo_1)|
|**ruleUrl**  <br>*可选*|规则地址  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|星级  <br>**样例** : `[ "[orderevaluationaddtagvo](#orderevaluationaddtagvo)" ]`|< [OrderEvaluationAddTagVO](#orderevaluationaddtagvo) > array|
|**thanks_tips**  <br>*可选*|奖励提示语  <br>**样例** : `"string"`|string|
|**tips1**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**tips2**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**wordsCredits**  <br>*可选*|额外积分数量，0表示不送  <br>**样例** : `0`|integer (int32)|
|**wordsNumber**  <br>*可选*|额外积分字数，0表示不送  <br>**样例** : `0`|integer (int32)|


<a name="orderevaluationeditvo"></a>
### OrderEvaluationEditVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|评价内容  <br>**样例** : `"string"`|string|
|**imageList**  <br>*可选*|评价图片  <br>**样例** : `[ "[evaluationimagevo](#evaluationimagevo)" ]`|< [EvaluationImageVO](#evaluationimagevo) > array|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**product**  <br>*可选*|线路信息  <br>**样例** : `"[productvo_2](#productvo_2)"`|[ProductVO_2](#productvo_2)|
|**tags**  <br>*可选*|星级  <br>**样例** : `[ "[productevaluationedittagvo](#productevaluationedittagvo)" ]`|< [ProductEvaluationEditTagVo](#productevaluationedittagvo) > array|
|**topTip**  <br>*可选*|头部提示语，例如：注意：4星及以上评价项无法修改，感谢您的理解与信任  <br>**样例** : `"string"`|string|


<a name="orderevaluationsavevo"></a>
### OrderEvaluationSaveVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|优惠卷金额  <br>**样例** : `0.0`|number|
|**credits**  <br>*可选*|积分  <br>**样例** : `0`|integer (int32)|
|**qid**  <br>*可选*|评价ID  <br>**样例** : `0`|integer (int32)|
|**showCoupon**  <br>*可选*|是否展示优惠券 1:展示 0：不展示  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|评价成功页URL  <br>**样例** : `"string"`|string|


<a name="orderfeepo"></a>
### OrderFeePo

|名称|说明|类型|
|---|---|---|
|**add_amount**  <br>*可选*|追加费用  <br>**样例** : `0.0`|number (double)|
|**add_fee**  <br>*可选*|追加费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**adult_fee**  <br>*可选*|成人费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**bargain_fee**  <br>*可选*|砍价优惠  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**card_amount**  <br>*可选*|权益卡金额  <br>**样例** : `0.0`|number (double)|
|**card_fee**  <br>*可选*|权益卡优惠  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**child_fee**  <br>*可选*|儿童费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**coupon_fee**  <br>*可选*|优惠券优惠  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**deduction_fee**  <br>*可选*|账户余额抵扣  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**discount_amount**  <br>*可选*|优惠金额  <br>**样例** : `0.0`|number (double)|
|**discount_fee**  <br>*可选*|满减优惠  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**earlybird_fee**  <br>*可选*|早鸟优惠  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**insurance_amount**  <br>*可选*|保险金额  <br>**样例** : `0.0`|number (double)|
|**insurance_fee**  <br>*可选*|保险费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**isCalcuing**  <br>*可选*|是否预报名  <br>**样例** : `0`|integer (int32)|
|**other_amount**  <br>*可选*|附加费用  <br>**样例** : `0.0`|number (double)|
|**other_fee**  <br>*可选*|其他费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**pro_amount**  <br>*可选*|基础费用  <br>**样例** : `0.0`|number (double)|
|**refund_amount**  <br>*可选*|退款金额  <br>**样例** : `0.0`|number (double)|
|**refund_desc**  <br>*可选*|退款描述  <br>**样例** : `[ "[refunddesc](#refunddesc)" ]`|< [RefundDesc](#refunddesc) > array|
|**refund_fee**  <br>*可选*|退款费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**room_fee**  <br>*可选*|酒店费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**sale_amount**  <br>*可选*|特惠金额  <br>**样例** : `0.0`|number (double)|
|**ticket_fee**  <br>*可选*|门票费用  <br>**样例** : `[ "[feeitem](#feeitem)" ]`|< [FeeItem](#feeitem) > array|
|**total_fee**  <br>*可选*|总金额  <br>**样例** : `0.0`|number (double)|
|**type**  <br>*可选*|1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**voucherAmount**  <br>*可选*|券抵扣金额  <br>**样例** : `0.0`|number (double)|
|**voucherFee**  <br>*可选*|券抵扣金额明细  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**voucherIncreaseAmount**  <br>*可选*|券加价金额  <br>**样例** : `0.0`|number (double)|
|**voucherIncreaseFee**  <br>*可选*|券加价金额明细  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|
|**yxb_fee**  <br>*可选*|游侠币抵扣  <br>**样例** : `"[feeitem](#feeitem)"`|[FeeItem](#feeitem)|


<a name="orderhotelinfovo"></a>
### OrderHotelInfoVo

|名称|说明|类型|
|---|---|---|
|**allPrice**  <br>*可选*|酒店总价  <br>**样例** : `0.0`|number|
|**endDateLabel**  <br>*可选*|离店时间，例如：05-19  <br>**样例** : `"string"`|string|
|**endDateWeekLabel**  <br>*可选*|离店时间，例如：周三  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|预订酒店名称  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|预订酒店房间数  <br>**样例** : `0`|integer (int32)|
|**numLabel**  <br>*可选*|预订间数，例如：1间  <br>**样例** : `"string"`|string|
|**personNumLabel**  <br>*可选*|预订人数，例如：2成人1儿童  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|房间单价  <br>**样例** : `0.0`|number|
|**roomPkgId**  <br>*可选*|房型套餐id  <br>**样例** : `0`|integer (int32)|
|**roomPkgName**  <br>*可选*|预订酒店套餐名称  <br>**样例** : `"string"`|string|
|**startDateLabel**  <br>*可选*|入住时间，例如：05-18  <br>**样例** : `"string"`|string|
|**startDateWeekLabel**  <br>*可选*|入住时间，例如：周二  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题：酒店信息  <br>**样例** : `"string"`|string|


<a name="orderinvoicedetailvo"></a>
### OrderInvoiceDetailVO

|名称|说明|类型|
|---|---|---|
|**iaddress**  <br>*可选*|领取定制提示  <br>**样例** : `"string"`|string|
|**iemail**  <br>*可选*|iexptype2为2时使用，例如：接收邮箱：695297384@qq.com  <br>**样例** : `"string"`|string|
|**iexpno**  <br>*可选*|快递单号提示  <br>**样例** : `"string"`|string|
|**iexpress**  <br>*可选*|快递公司提示  <br>**样例** : `"string"`|string|
|**iexptype**  <br>*可选*|快递方式1、挂号信2、快递3、自取  <br>**样例** : `0`|integer (int32)|
|**iexptype2**  <br>*可选*|快递方式1、纸制发票2、电子发票  <br>**样例** : `0`|integer (int32)|
|**istatus**  <br>*可选*|发票状态：1未开具2已开具3已收取  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|联系电话提示  <br>**样例** : `"string"`|string|
|**time**  <br>*可选*|工作时间提示  <br>**样例** : `"string"`|string|
|**tips**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|


<a name="orderinvoiceinfovo"></a>
### OrderInvoiceInfoVO

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|地址  <br>**样例** : `"string"`|string|
|**amount**  <br>*可选*|支付的活动费用  <br>**样例** : `0.0`|number|
|**batch_time**  <br>*可选*|批次时间转化  <br>**样例** : `"string"`|string|
|**bottomTip**  <br>*可选*|底部温馨提示  <br>**样例** : `"string"`|string|
|**exp_type**  <br>*可选*|快递类型  <br>**样例** : `[ "object" ]`|< object > array|
|**invoiceTypeList**  <br>*可选*|需要电子发票的发票类型，这里指普通发票、专用发票的类型  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**invoice_type**  <br>*可选*|发票类型  <br>**样例** : `[ "object" ]`|< object > array|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**shop_url**  <br>*可选*|选择地址url  <br>**样例** : `"string"`|string|
|**vat**  <br>*可选*|是否专有发票  <br>**样例** : `0`|integer (int32)|
|**vat_tip**  <br>*可选*|线路发票提示  <br>**样例** : `"string"`|string|


<a name="orderjihebean"></a>
### OrderJiheBean

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|例如：杭州市  <br>**样例** : `"string"`|string|
|**label**  <br>*可选*|集合点上车时间+集合点名称  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|经度  <br>**样例** : `0.0`|number (double)|
|**lid**  <br>*可选*|集合点id  <br>**样例** : `0`|integer (int32)|
|**lng**  <br>*可选*|纬度  <br>**样例** : `0.0`|number (double)|
|**location**  <br>*可选*|例如：黄龙海鲜大排档集合（黄龙体育中心外环，近西溪路玉古路交叉口）  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|集合点名称，例如：黄龙体育中心  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|例如：请提前15分钟到达，对自己的旅行负责！  <br>**样例** : `"string"`|string|
|**timearea**  <br>*可选*|集合点上车时间，例如：7:00-7:30  <br>**样例** : `"string"`|string|


<a name="ordermembercardvo"></a>
### OrderMemberCardVO

|名称|说明|类型|
|---|---|---|
|**birth**  <br>*可选*|生日时间戳  <br>**样例** : `0`|integer (int64)|
|**birthStr**  <br>*可选*|生日字符串  <br>**样例** : `"string"`|string|
|**cardName**  <br>*可选*|证件类型名称  <br>**样例** : `"string"`|string|
|**cardUserId**  <br>*可选*|关联权益卡的id  <br>**样例** : `0`|integer (int32)|
|**cardUserName**  <br>*可选*|用户权益卡名称，例如：户外卡（月卡）  <br>**样例** : `"string"`|string|
|**cardno**  <br>*可选*|证件号  <br>**样例** : `"string"`|string|
|**cardnoHideAfter**  <br>*可选*|证件号脱敏显示  <br>**样例** : `"string"`|string|
|**mid**  <br>*可选*|mid  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|联系人姓名  <br>**样例** : `"string"`|string|
|**ruleUrl**  <br>*可选*|使用规则url  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否默认选中，1是0否  <br>**样例** : `0`|integer (int32)|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**sexLabel**  <br>*可选*|性别  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型：1成人2儿童  <br>**样例** : `0`|integer (int32)|
|**typeLabel**  <br>*可选*|常用联系人类型：成人/儿童  <br>**样例** : `"string"`|string|
|**unusableReason**  <br>*可选*|不可用原因（按钮置灰），有值说明不可用，例如：不可用原因：有线路待出行  <br>**样例** : `"string"`|string|
|**validityTime**  <br>*可选*|有效期，例如：2021-12-31  <br>**样例** : `"string"`|string|


<a name="ordermemberitemvo"></a>
### OrderMemberItemVO

|名称|说明|类型|
|---|---|---|
|**cardName**  <br>*可选*|出行人证件类型名称  <br>**样例** : `"string"`|string|
|**cardno**  <br>*可选*|出行人证件号  <br>**样例** : `"string"`|string|
|**firstAidCardId**  <br>*可选*|医疗急救卡id，id > 0 则代表医疗急救信息已完善  <br>**样例** : `0`|integer (int64)|
|**memberCardStatus**  <br>*可选*|权益卡会员状态：1，是，0 否  <br>**样例** : `0`|integer (int32)|
|**mid**  <br>*可选*|订单出行人id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|出行人名称  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|出行人性别  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|出行人成人或儿童  <br>**样例** : `"string"`|string|


<a name="ordermembervo"></a>
### OrderMemberVO

|名称|说明|类型|
|---|---|---|
|**orderMemberList**  <br>*可选*|订单出行人列表  <br>**样例** : `[ "[ordermemberitemvo](#ordermemberitemvo)" ]`|< [OrderMemberItemVO](#ordermemberitemvo) > array|


<a name="ordermessagedetailvo"></a>
### OrderMessageDetailVo

|名称|说明|类型|
|---|---|---|
|**action**  <br>*可选*|**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**descTitle**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**handler_url**  <br>*可选*|**样例** : `"string"`|string|
|**is_read**  <br>*可选*|**样例** : `"string"`|string|
|**is_show**  <br>*可选*|**样例** : `0`|integer (int32)|
|**msg_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**timestamp**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="ordermessagevo"></a>
### OrderMessageVo

|名称|说明|类型|
|---|---|---|
|**messages**  <br>*可选*|**样例** : `[ "[ordermessagedetailvo](#ordermessagedetailvo)" ]`|< [OrderMessageDetailVo](#ordermessagedetailvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="orderprepaydescvo"></a>
### OrderPrepayDescVO

|名称|说明|类型|
|---|---|---|
|**leftDesc**  <br>*可选*|例如：阶段1：支付预付款  <br>**样例** : `"string"`|string|
|**pass**  <br>*可选*|控制到哪个阶段，1通过  <br>**样例** : `0`|integer (int32)|
|**rightDesc**  <br>*可选*|例如：¥50 *2  <br>**样例** : `"string"`|string|


<a name="orderprepayvo"></a>
### OrderPrepayVO

|名称|说明|类型|
|---|---|---|
|**bottomDesc**  <br>*可选*|例如：请在11-03 23:59前支付尾款，所含优惠信息在尾款时使用  <br>**样例** : `"string"`|string|
|**descList**  <br>*可选*|阶段描述  <br>**样例** : `[ "[orderprepaydescvo](#orderprepaydescvo)" ]`|< [OrderPrepayDescVO](#orderprepaydescvo) > array|
|**explainUrl**  <br>*可选*|预付款说明链接  <br>**样例** : `"string"`|string|


<a name="orderrefundvo"></a>
### OrderRefundVO

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|例如：支持在线退款，查看退款政策  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|例如：退款政策  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|退款政策链接url  <br>**样例** : `"string"`|string|


<a name="orderrightvo"></a>
### OrderRightVO

|名称|说明|类型|
|---|---|---|
|**subTitle**  <br>*可选*|副标题，例如：2张可用/每周一次免费出行  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题，例如：预售券/户外卡  <br>**样例** : `"string"`|string|


<a name="ordersharedetailplanvo"></a>
### OrderShareDetailPlanVO

|名称|说明|类型|
|---|---|---|
|**subTitle**  <br>*可选*|您已接受了这个共享订单  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|张三（18655555555）给您共享了此订单  <br>**样例** : `"string"`|string|


<a name="ordershareinfoitemvo"></a>
### OrderShareInfoItemVO

|名称|说明|类型|
|---|---|---|
|**cardFlag**  <br>*可选*|是否权益卡，1：是 0：不是  <br>**样例** : `0`|integer (int32)|
|**isEdit**  <br>*可选*|是否可以编辑和删除，0不可以纯展示1可以  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**statusLabel**  <br>*可选*|分享状态（纯展示情况下）  <br>**样例** : `"string"`|string|


<a name="ordershareinfovo"></a>
### OrderShareInfoVO

|名称|说明|类型|
|---|---|---|
|**incompleteItemVOList**  <br>*可选*|不可勾选的订单联系人  <br>**样例** : `[ "[ordershareinfoitemvo](#ordershareinfoitemvo)" ]`|< [OrderShareInfoItemVO](#ordershareinfoitemvo) > array|
|**num**  <br>*可选*|出行人数量（可共享数量）  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**phoneList**  <br>*可选*|不可分享号码  <br>**样例** : `[ "string" ]`|< string > array|
|**shareInfoItemList**  <br>*可选*|订单联系人号码  <br>**样例** : `[ "[ordershareinfoitemvo](#ordershareinfoitemvo)" ]`|< [OrderShareInfoItemVO](#ordershareinfoitemvo) > array|
|**topTip**  <br>*可选*|顶部文案，例如：您可以在这里查看和共享您要分享的同行人列表，接收后的朋友可以通过APP查看订单信息  <br>**样例** : `"string"`|string|


<a name="ordersharevo"></a>
### OrderShareVO

|名称|说明|类型|
|---|---|---|
|**orderShareTipStr**  <br>*可选*|共享按钮tip文案，例如：可将订单共享给您的同行人一起查看订单和产品详情  <br>**样例** : `"string"`|string|
|**shareDetailPlanList**  <br>*可选*|共享详情展示进度  <br>**样例** : `[ "[ordersharedetailplanvo](#ordersharedetailplanvo)" ]`|< [OrderShareDetailPlanVO](#ordersharedetailplanvo) > array|
|**shareDetailTip**  <br>*可选*|共享详情底部文案，例如：您可以查看共享订单的基本信息，但无法退改订单，如需退改联系下单人操作。  <br>**样例** : `"string"`|string|
|**shareLabel**  <br>*可选*|共享按钮文案  <br>**样例** : `"string"`|string|
|**shareStatus**  <br>*可选*|共享订单状态，1显示共享订单按钮2显示共享详情  <br>**样例** : `0`|integer (int32)|


<a name="ordersharedvo"></a>
### OrderSharedVO

|名称|说明|类型|
|---|---|---|
|**carouselContents**  <br>*可选*|轮播内容  <br>**样例** : `[ "string" ]`|< string > array|
|**shareHelpUrl**  <br>*可选*|共享帮助H5地址  <br>**样例** : `"string"`|string|
|**shareItemList**  <br>*可选*|已分享列表  <br>**样例** : `[ "[shareitemvo](#shareitemvo)" ]`|< [ShareItemVO](#shareitemvo) > array|
|**sharePic**  <br>*可选*|分享图片  <br>**样例** : `"string"`|string|
|**shareText**  <br>*可选*|分享文字  <br>**样例** : `"string"`|string|
|**shareVO**  <br>*可选*|**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**shareableNum**  <br>*可选*|总的可分享数量  <br>**样例** : `0`|integer (int32)|
|**sharedNum**  <br>*可选*|已分享数量  <br>**样例** : `0`|integer (int32)|
|**topTip**  <br>*可选*|顶部tip 您可以将该订单共享给同行人，这样对方也能在小程序中查看该订单出行信息啦~  <br>**样例** : `"string"`|string|


<a name="orderticketitemvo"></a>
### OrderTicketItemVo

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|使用日期yyyy-MM-dd  <br>**样例** : `"string"`|string|
|**dateLabel**  <br>*可选*|日期，例如：04-30  <br>**样例** : `"string"`|string|
|**dateWeekLabel**  <br>*可选*|日期，例如：周二  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|门票名称  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|门票数量  <br>**样例** : `0`|integer (int32)|
|**numLabel**  <br>*可选*|预订张数，例如：1张  <br>**样例** : `"string"`|string|
|**pkgTicketId**  <br>*可选*|套餐门票id  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|门票单价纯数字  <br>**样例** : `0.0`|number|


<a name="orderticketsinfovo"></a>
### OrderTicketsInfoVo

|名称|说明|类型|
|---|---|---|
|**allPrice**  <br>*可选*|门票总价  <br>**样例** : `0.0`|number|
|**ticketList**  <br>*可选*|门票信息  <br>**样例** : `[ "[orderticketitemvo](#orderticketitemvo)" ]`|< [OrderTicketItemVo](#orderticketitemvo) > array|
|**title**  <br>*可选*|标题：门票信息  <br>**样例** : `"string"`|string|


<a name="ordervoucheritemvo"></a>
### OrderVoucherItemVO

|名称|说明|类型|
|---|---|---|
|**unusableReason**  <br>*可选*|不可用原因（按钮置灰），有值说明不可用，例如：不可用原因：已过期  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|使用规则url链接  <br>**样例** : `"string"`|string|
|**validityTime**  <br>*可选*|例如：2021-12-31  <br>**样例** : `"string"`|string|
|**voucherCode**  <br>*可选*|券码  <br>**样例** : `"string"`|string|
|**voucherId**  <br>*可选*|预售券id  <br>**样例** : `0`|integer (int32)|
|**voucherName**  <br>*可选*|券名称  <br>**样例** : `"string"`|string|


<a name="ordervouchervo"></a>
### OrderVoucherVO

|名称|说明|类型|
|---|---|---|
|**dataList**  <br>*可选*|预售券列表（注意分页）  <br>**样例** : `"[cfb6e613d990493a9aa05596f5a9baf3](#cfb6e613d990493a9aa05596f5a9baf3)"`|[MicroPagerWrap«List«OrderVoucherItemVO»»](#cfb6e613d990493a9aa05596f5a9baf3)|
|**tip**  <br>*可选*|预售券使用提示文案  <br>**样例** : `"string"`|string|
|**unusableCount**  <br>*可选*|不可用数量，第一页时返回  <br>**样例** : `0`|integer (int32)|
|**usableCount**  <br>*可选*|可用数量，第一页时返回  <br>**样例** : `0`|integer (int32)|


<a name="orderscountvo"></a>
### OrdersCountVo

|名称|说明|类型|
|---|---|---|
|**all**  <br>*可选*|全部订单数量  <br>**样例** : `0`|integer (int32)|
|**coupon**  <br>*可选*|可用优惠券数量  <br>**样例** : `0`|integer (int32)|
|**pj**  <br>*可选*|待评价订单数量  <br>**样例** : `0`|integer (int32)|
|**refund**  <br>*可选*|未设置  <br>**样例** : `0`|integer (int32)|
|**success**  <br>*可选*|报名成功订单数量  <br>**样例** : `0`|integer (int32)|
|**tibu**  <br>*可选*|替补订单数量  <br>**样例** : `0`|integer (int32)|
|**unpay**  <br>*可选*|审核已通过订单数量（未支付）  <br>**样例** : `0`|integer (int32)|


<a name="orderslistitemvo"></a>
### OrdersListItemVo

|名称|说明|类型|
|---|---|---|
|**addFund**  <br>*可选*|是否有未支付的追加费用  <br>**样例** : `0`|integer (int32)|
|**addtime**  <br>*可选*|**样例** : `0`|integer (int32)|
|**adult**  <br>*可选*|成人数  <br>**样例** : `0`|integer (int32)|
|**amount**  <br>*可选*|价格不带￥和起，可能出现预报名  <br>**样例** : `"string"`|string|
|**bargain**  <br>*可选*|是否砍价订单1是0否  <br>**样例** : `0`|integer (int32)|
|**bargainEndLabel**  <br>*可选*|文案：砍价中，距砍价结束  <br>**样例** : `"string"`|string|
|**bargainEndTime**  <br>*可选*|距离砍价结束时间多少秒  <br>**样例** : `0`|integer (int64)|
|**bargainPayOverLabel**  <br>*可选*|文案：砍价结束，剩余支付时间  <br>**样例** : `"string"`|string|
|**bargainPayOverTime**  <br>*可选*|距离砍价支付结束时间多少秒  <br>**样例** : `0`|integer (int64)|
|**batch_name**  <br>*可选*|批次名称  <br>**样例** : `"string"`|string|
|**bid**  <br>*可选*|bid  <br>**样例** : `0`|integer (int32)|
|**child**  <br>*可选*|儿童数  <br>**样例** : `0`|integer (int32)|
|**date**  <br>*可选*|批次时间转换  <br>**样例** : `"string"`|string|
|**deleted**  <br>*可选*|删除状态  <br>**样例** : `0`|integer (int32)|
|**extra_service**  <br>*可选*|叫车服务  <br>**样例** : `"object"`|object|
|**hotelName**  <br>*可选*|酒店名称  <br>**样例** : `"string"`|string|
|**isFree**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isShare**  <br>*可选*|是否是分享订单  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**orderno**  <br>*可选*|订单号  <br>**样例** : `"string"`|string|
|**payBtnLabel**  <br>*可选*|可支付情况下支付按钮文字  <br>**样例** : `"string"`|string|
|**payInfo**  <br>*可选*|已支付信息，例如：已支付￥1000，待支付￥720  <br>**样例** : `"string"`|string|
|**pay_status**  <br>*可选*|订单的可支付状态  <br>**样例** : `0`|integer (int32)|
|**pay_status_label**  <br>*可选*|订单的可支付状态  <br>**样例** : `"string"`|string|
|**payed**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**pj_status**  <br>*可选*|评价状态  <br>**样例** : `0`|integer (int32)|
|**pj_url**  <br>*可选*|评价url  <br>**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**prepay**  <br>*可选*|是否预付款订单，1是  <br>**样例** : `0`|integer (int32)|
|**product_cate**  <br>*可选*|产品主题  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**product_pic**  <br>*可选*|产品封面  <br>**样例** : `"string"`|string|
|**product_sub_name**  <br>*可选*|产品副标题  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**rebookStatus**  <br>*可选*|重新预订按钮  <br>**样例** : `0`|integer (int32)|
|**refund_label**  <br>*可选*|退款提示  <br>**样例** : `"string"`|string|
|**refund_status**  <br>*可选*|是否显示退款  <br>**样例** : `0`|integer (int32)|
|**refund_url**  <br>*可选*|退款url  <br>**样例** : `"string"`|string|
|**roomNum**  <br>*可选*|房型套餐间数  <br>**样例** : `0`|integer (int32)|
|**roomPkgName**  <br>*可选*|房型套餐名称  <br>**样例** : `"string"`|string|
|**shareMsg**  <br>*可选*|分享文案，例如：该订单由您的好友共享给您  <br>**样例** : `"string"`|string|
|**similarBtnTip**  <br>*可选*|相似线路按钮文案，没有值不显示按钮，例如：点击查看  <br>**样例** : `"string"`|string|
|**similarTip**  <br>*可选*|相似线路提示，没有值不显示，例如：还有其他相似产品可报名无需替补  <br>**样例** : `"string"`|string|
|**similarUrl**  <br>*可选*|相似线路链接  <br>**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|所属分站  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|订单状态  <br>**样例** : `0`|integer (int32)|
|**statusColour**  <br>*可选*|状态颜色，例如：#FF7100  <br>**样例** : `"string"`|string|
|**status_label**  <br>*可选*|订单状态  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|产品类型名称  <br>**样例** : `"string"`|string|


<a name="ordersrecommendtagsvo"></a>
### OrdersRecommendTagsVo

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|
|**tagId**  <br>*可选*|1线路产品2集市产品  <br>**样例** : `0`|integer (int32)|


<a name="outdoorflowtagvo"></a>
### OutdoorFlowTagVO

|名称|说明|类型|
|---|---|---|
|**dayTags**  <br>*可选*|行程天数  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**levels**  <br>*可选*|徒步星级  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**mddTags**  <br>*可选*|目的地  <br>**样例** : `[ "[f03bf1cafcb4e043b12412955a1a4f2b](#f03bf1cafcb4e043b12412955a1a4f2b)" ]`|< [摄影游瀑布流搜索标签_1](#f03bf1cafcb4e043b12412955a1a4f2b) > array|
|**startDateTags**  <br>*可选*|出行日期  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**themeTags**  <br>*可选*|户外游性质  <br>**样例** : `[ "[b44642352895b8a32c709c003f7d3cd4](#b44642352895b8a32c709c003f7d3cd4)" ]`|< [户外游瀑布性质标签](#b44642352895b8a32c709c003f7d3cd4) > array|


<a name="packagelistbean"></a>
### PackageListBean

|名称|说明|类型|
|---|---|---|
|**daily_pkg**  <br>*可选*|**样例** : `[ "[batchlistbean](#batchlistbean)" ]`|< [BatchListBean](#batchlistbean) > array|
|**data**  <br>*可选*|**样例** : `[ "[batchslistbean](#batchslistbean)" ]`|< [BatchsListBean](#batchslistbean) > array|
|**months**  <br>*可选*|**样例** : `[ "[monthsbean](#monthsbean)" ]`|< [MonthsBean](#monthsbean) > array|
|**pkg_name**  <br>*可选*|**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="pagevo"></a>
### PageVO

|名称|说明|类型|
|---|---|---|
|**pageSize**  <br>*可选*|分页数量  <br>**样例** : `0`|integer (int32)|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="36b06f27b3d4004461f192e3f5fd961b"></a>
### PagerInfoListWrap«CouponProductInfoVO,List«CouponProductVO»»

|名称|说明|类型|
|---|---|---|
|**info**  <br>*可选*|**样例** : `"[couponproductinfovo](#couponproductinfovo)"`|[CouponProductInfoVO](#couponproductinfovo)|
|**infoName**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[couponproductvo](#couponproductvo)" ]`|< [CouponProductVO](#couponproductvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="fcfb73d37a4702f24345037cc315b022"></a>
### PagerInfoListWrap«JSONObject,List«Map«string,object»»»

|名称|说明|类型|
|---|---|---|
|**info**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**infoName**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0e45e5b064ffcc587dbc381968bd0e20"></a>
### PagerInfoListWrap«List«AlbumCommentVO»,List«AlbumCommentVO»»

|名称|说明|类型|
|---|---|---|
|**info**  <br>*可选*|**样例** : `[ "[albumcommentvo](#albumcommentvo)" ]`|< [AlbumCommentVO](#albumcommentvo) > array|
|**infoName**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[albumcommentvo](#albumcommentvo)" ]`|< [AlbumCommentVO](#albumcommentvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="4f2713a50d7192d8d5953399f471d88b"></a>
### PagerInfoListWrap«List«object»,List«object»»

|名称|说明|类型|
|---|---|---|
|**info**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**infoName**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="2abcceb5d1e27724447423d65bc27188"></a>
### PagerInfoListWrap«VisaCountryPackVO,List«VisaBaseVO»»

|名称|说明|类型|
|---|---|---|
|**info**  <br>*可选*|**样例** : `"[visacountrypackvo](#visacountrypackvo)"`|[VisaCountryPackVO](#visacountrypackvo)|
|**infoName**  <br>*可选*|**样例** : `"string"`|string|
|**list**  <br>*可选*|**样例** : `[ "[visabasevo](#visabasevo)" ]`|< [VisaBaseVO](#visabasevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="a800d509b7f43b015fe2b9b29090ff4d"></a>
### PagerMapWrap«AroundHistoryExtVo,List«ProductAroundVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[aroundhistoryextvo](#aroundhistoryextvo)"`|[AroundHistoryExtVo](#aroundhistoryextvo)|
|**list**  <br>*可选*|**样例** : `[ "[productaroundvo](#productaroundvo)" ]`|< [ProductAroundVO](#productaroundvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="e9ee47f0344f4ce2ee3cf82ea4854626"></a>
### PagerMapWrap«DiscoverQuoteItemVO,List«DiscoverQuoteVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[discoverquoteitemvo](#discoverquoteitemvo)"`|[DiscoverQuoteItemVO](#discoverquoteitemvo)|
|**list**  <br>*可选*|**样例** : `[ "[discoverquotevo](#discoverquotevo)" ]`|< [DiscoverQuoteVO](#discoverquotevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="9e1c5ad63ca2268cdb58088b5864271b"></a>
### PagerMapWrap«DiscoverStarsNoteVO,List«DiscoverStarsVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[discoverstarsnotevo](#discoverstarsnotevo)"`|[DiscoverStarsNoteVO](#discoverstarsnotevo)|
|**list**  <br>*可选*|**样例** : `[ "[discoverstarsvo](#discoverstarsvo)" ]`|< [DiscoverStarsVO](#discoverstarsvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="df8172ec1398c575095e0e03ab790bf9"></a>
### PagerMapWrap«SingleDisMoreSameBatchesVO,List«DiscoverYouxiaSimpleVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[singledismoresamebatchesvo](#singledismoresamebatchesvo)"`|[SingleDisMoreSameBatchesVO](#singledismoresamebatchesvo)|
|**list**  <br>*可选*|**样例** : `[ "[discoveryouxiasimplevo](#discoveryouxiasimplevo)" ]`|< [DiscoverYouxiaSimpleVO](#discoveryouxiasimplevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="8961214af50064296114de299156b61c"></a>
### PagerMapWrap«UserTongXunTotalMsgVO,List«UserDiscoverFriendVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[usertongxuntotalmsgvo](#usertongxuntotalmsgvo)"`|[UserTongXunTotalMsgVO](#usertongxuntotalmsgvo)|
|**list**  <br>*可选*|**样例** : `[ "[userdiscoverfriendvo](#userdiscoverfriendvo)" ]`|< [UserDiscoverFriendVO](#userdiscoverfriendvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="8e1c6527a9278bb5994cb70cfd8b23f9"></a>
### PagerMapWrap«草稿,List«DiscoverQuoteUserCenterVO»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[22b4334f915541755261249f38d0df9b](#22b4334f915541755261249f38d0df9b)"`|[草稿](#22b4334f915541755261249f38d0df9b)|
|**list**  <br>*可选*|**样例** : `[ "[discoverquoteusercentervo](#discoverquoteusercentervo)" ]`|< [DiscoverQuoteUserCenterVO](#discoverquoteusercentervo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="f0ca3967da73a0748cb833ef84fbaf4b"></a>
### PagerMapWrap«草稿,List«TravelarticlesVo»»

|名称|说明|类型|
|---|---|---|
|**element**  <br>*可选*|**样例** : `"[22b4334f915541755261249f38d0df9b](#22b4334f915541755261249f38d0df9b)"`|[草稿](#22b4334f915541755261249f38d0df9b)|
|**list**  <br>*可选*|**样例** : `[ "[travelarticlesvo](#travelarticlesvo)" ]`|< [TravelarticlesVo](#travelarticlesvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="pagervo"></a>
### PagerVO

|名称|说明|类型|
|---|---|---|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalRow**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="pagerwrap"></a>
### PagerWrap

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="bc707fa8c03a5f92ad79f4aa818fb5ca"></a>
### PagerWrap«List«AthleticsIndexItemVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[athleticsindexitemvo](#athleticsindexitemvo)" ]`|< [AthleticsIndexItemVo](#athleticsindexitemvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="55094d02d8cc4733e4a21ac779aecb1e"></a>
### PagerWrap«List«AttitudeUserCollectVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[attitudeusercollectvo](#attitudeusercollectvo)" ]`|< [AttitudeUserCollectVO](#attitudeusercollectvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0bcdcd92584eae022c6d2e74440bad89"></a>
### PagerWrap«List«AttitudeViewPointSingleVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[attitudeviewpointsinglevo](#attitudeviewpointsinglevo)" ]`|< [AttitudeViewPointSingleVO](#attitudeviewpointsinglevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="d9c4cf17aa79c8264a1d09a5375de865"></a>
### PagerWrap«List«ContactSearchVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[contactsearchvo](#contactsearchvo)" ]`|< [ContactSearchVO](#contactsearchvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="44cfe2b91e373ce98b3b858ba3b9753f"></a>
### PagerWrap«List«ContactVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[contactvo](#contactvo)" ]`|< [ContactVO](#contactvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="39223028404f1f263fb3f786577b8681"></a>
### PagerWrap«List«CouponsLinesListVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[couponslineslistvo](#couponslineslistvo)" ]`|< [CouponsLinesListVO](#couponslineslistvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cd1b99a529ff302d5a90aeaaf34dab3a"></a>
### PagerWrap«List«CouponsListVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[couponslistvo](#couponslistvo)" ]`|< [CouponsListVO](#couponslistvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="3539945c4f3b73aea34f69639847c014"></a>
### PagerWrap«List«DailyMaterialVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[dailymaterialvo](#dailymaterialvo)" ]`|< [DailyMaterialVO](#dailymaterialvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="8182b77277e4c4af2847a52869a47943"></a>
### PagerWrap«List«DestFavoriteRespVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[destfavoriterespvo](#destfavoriterespvo)" ]`|< [DestFavoriteRespVO](#destfavoriterespvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="43978e5e0e8159167a3e9b70d7efde6a"></a>
### PagerWrap«List«DiscoverCommentVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discovercommentvo_1](#discovercommentvo_1)" ]`|< [DiscoverCommentVO_1](#discovercommentvo_1) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="bd1c9d3b6342a291f3140e719102b785"></a>
### PagerWrap«List«DiscoverCommentVO»»_1

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="bec207636cc29d81205f837884a36e80"></a>
### PagerWrap«List«DiscoverDestCountVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverdestcountvo](#discoverdestcountvo)" ]`|< [DiscoverDestCountVO](#discoverdestcountvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="4d6f61ddce11a210cee463a78eb636fd"></a>
### PagerWrap«List«DiscoverDraftVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverdraftvo](#discoverdraftvo)" ]`|< [DiscoverDraftVO](#discoverdraftvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="54b2da266169fc8606dd1a813afd64b5"></a>
### PagerWrap«List«DiscoverFavoritesVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverfavoritesvo](#discoverfavoritesvo)" ]`|< [DiscoverFavoritesVO](#discoverfavoritesvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="d5d662f3564daafca3d5b8cfb3f17ead"></a>
### PagerWrap«List«DiscoverHotVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverhotvo](#discoverhotvo)" ]`|< [DiscoverHotVO](#discoverhotvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cb1d9bdc9e475182aaf6bec87d0ac32e"></a>
### PagerWrap«List«DiscoverLatestVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverlatestvo](#discoverlatestvo)" ]`|< [DiscoverLatestVO](#discoverlatestvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="b688c80c0f40a71f4b54b061c5c5b868"></a>
### PagerWrap«List«DiscoverLevyVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverlevyvo](#discoverlevyvo)" ]`|< [DiscoverLevyVO](#discoverlevyvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="5b930730a848940d22876788171f63b0"></a>
### PagerWrap«List«DiscoverPraiseListVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoverpraiselistvo](#discoverpraiselistvo)" ]`|< [DiscoverPraiseListVO](#discoverpraiselistvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="13fa7fc22a40cbdd8a805d193d9c6adb"></a>
### PagerWrap«List«DiscoverSameBatchesYouxiaVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoversamebatchesyouxiavo](#discoversamebatchesyouxiavo)" ]`|< [DiscoverSameBatchesYouxiaVO](#discoversamebatchesyouxiavo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="6c303ea31269f7654c694f9b9d8a6529"></a>
### PagerWrap«List«DiscoverTopicVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discovertopicvo](#discovertopicvo)" ]`|< [DiscoverTopicVO](#discovertopicvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="64a05293ee16b160fc527e7c4eeb50d9"></a>
### PagerWrap«List«DiscoverVideoDetailResVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discovervideodetailresvo](#discovervideodetailresvo)" ]`|< [DiscoverVideoDetailResVO](#discovervideodetailresvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0d13c733e031a159bd96319c9349dd39"></a>
### PagerWrap«List«DiscoverYouxiaTuijianVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[discoveryouxiatuijianvo](#discoveryouxiatuijianvo)" ]`|< [DiscoverYouxiaTuijianVO](#discoveryouxiatuijianvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cadb607d5f50e170180fd42985df5af5"></a>
### PagerWrap«List«FriendBaseVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[friendbasevo](#friendbasevo)" ]`|< [FriendBaseVo](#friendbasevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="c0599795b75769aa80762c4c7db1f696"></a>
### PagerWrap«List«HistoryDuobaoVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[historyduobaovo](#historyduobaovo)" ]`|< [HistoryDuobaoVO](#historyduobaovo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0d45a37ac87d4c658c8ec57f6f21b252"></a>
### PagerWrap«List«ImShareReviewListVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[imsharereviewlistvo](#imsharereviewlistvo)" ]`|< [ImShareReviewListVO](#imsharereviewlistvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="3fe8efeebbdc441b9def3bf1931ae1a4"></a>
### PagerWrap«List«IndexFlowItemVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[indexflowitemvo](#indexflowitemvo)" ]`|< [IndexFlowItemVo](#indexflowitemvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cf87e7295f48a19443da2ecc5cb8e4f2"></a>
### PagerWrap«List«InvoiceInfoListItemVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[invoiceinfolistitemvo](#invoiceinfolistitemvo)" ]`|< [InvoiceInfoListItemVo](#invoiceinfolistitemvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0af4c52a631ed2a4f53c7367e5659ff8"></a>
### PagerWrap«List«Map«string,object»»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="ca22f7a7cdd8b9a0b0e9e1b69578142a"></a>
### PagerWrap«List«MddInfoVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[mddinfovo](#mddinfovo)" ]`|< [MddInfoVO](#mddinfovo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="c68dbeff9e68af06c02f4c3ada6044f1"></a>
### PagerWrap«List«MembersExtPO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[membersextpo](#membersextpo)" ]`|< [MembersExtPO](#membersextpo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="9835fb0c5f4591cc91d074430c03b86d"></a>
### PagerWrap«List«MyselfDuobaoVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[myselfduobaovo](#myselfduobaovo)" ]`|< [MyselfDuobaoVO](#myselfduobaovo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="85bdae39c6cf088f38817bde38dcf7f1"></a>
### PagerWrap«List«NearbyFriendVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[nearbyfriendvo](#nearbyfriendvo)" ]`|< [NearbyFriendVO](#nearbyfriendvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="49e72275f55946461852a9ceb82723dd"></a>
### PagerWrap«List«OrdersListItemVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[orderslistitemvo](#orderslistitemvo)" ]`|< [OrdersListItemVo](#orderslistitemvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="6f343d312f19f323d400892b9e685279"></a>
### PagerWrap«List«PhotoCompetitionVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[photocompetitionvo](#photocompetitionvo)" ]`|< [PhotoCompetitionVO](#photocompetitionvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="c32f13daedba24e680fd327d24a3cf8e"></a>
### PagerWrap«List«ProductBasicModel»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[productbasicmodel](#productbasicmodel)" ]`|< [ProductBasicModel](#productbasicmodel) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="fd1d80fbb800d5af1ba351fdf7cab97b"></a>
### PagerWrap«List«ProductJihediDataVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="d566b09a6ec526c8726fa338d79a14f3"></a>
### PagerWrap«List«RecommendMasterVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[recommendmastervo_1](#recommendmastervo_1)" ]`|< [RecommendMasterVO_1](#recommendmastervo_1) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cf81157697fa7785818a310edb0455b4"></a>
### PagerWrap«List«SameLineFriendVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[samelinefriendvo](#samelinefriendvo)" ]`|< [SameLineFriendVo](#samelinefriendvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="889ce99cb60eaac8384af4853cac7883"></a>
### PagerWrap«List«TopicJoinerVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[topicjoinervo](#topicjoinervo)" ]`|< [TopicJoinerVO](#topicjoinervo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="f863f6a1e52abfdc544b7ed565bdf137"></a>
### PagerWrap«List«TravelInDraftBoxVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[travelindraftboxvo](#travelindraftboxvo)" ]`|< [TravelInDraftBoxVO](#travelindraftboxvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="5a708f34be5cad07dba228440893b101"></a>
### PagerWrap«List«TravelarticlesVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[travelarticlesvo](#travelarticlesvo)" ]`|< [TravelarticlesVo](#travelarticlesvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0ead40c3a5d663d00365a02a9376839c"></a>
### PagerWrap«List«UserBasicInfo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[userbasicinfo](#userbasicinfo)" ]`|< [UserBasicInfo](#userbasicinfo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="5155ba49df1dcab33e24c823f781b4bc"></a>
### PagerWrap«List«UserTagVo»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[usertagvo](#usertagvo)" ]`|< [UserTagVo](#usertagvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="cdd8a857e5382f20e8c570f475601ca2"></a>
### PagerWrap«List«VisaBaseVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[visabasevo](#visabasevo)" ]`|< [VisaBaseVO](#visabasevo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="fa0595c1c24dcc559a935772a3dd5b90"></a>
### PagerWrap«List«VisaOrderListItemVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[visaorderlistitemvo](#visaorderlistitemvo)" ]`|< [VisaOrderListItemVO](#visaorderlistitemvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="019d6bd8a6cced211b80cb5ae458efa5"></a>
### PagerWrap«List«VoucherFavoriteListVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[voucherfavoritelistvo](#voucherfavoritelistvo)" ]`|< [VoucherFavoriteListVO](#voucherfavoritelistvo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="54815fdd45161ecc83748d5d9d9103b3"></a>
### PagerWrap«List«WeekTopCalenderVO»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[weektopcalendervo](#weektopcalendervo)" ]`|< [WeekTopCalenderVO](#weektopcalendervo) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="21fc12d14f6d160333e62f82eebbd1b3"></a>
### PagerWrap«List«object»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "object" ]`|< object > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="2df75ffb97d4715a168ad3186391873b"></a>
### PagerWrap«List«遇见瀑布流数据»»

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[867fbdaaca71777af457191849e51819](#867fbdaaca71777af457191849e51819)" ]`|< [遇见瀑布流数据](#867fbdaaca71777af457191849e51819) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="8a08457c90b4698d4bfe4504aa48516b"></a>
### PagerWrap«List«遇见瀑布流数据»»_1

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[50146ca4ab2b0b329bfabd3143cf2422](#50146ca4ab2b0b329bfabd3143cf2422)" ]`|< [遇见瀑布流数据_1](#50146ca4ab2b0b329bfabd3143cf2422) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="passengeridentityvo"></a>
### PassengerIdentityVO

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|**样例** : `"string"`|string|
|**typeId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**typeName**  <br>*可选*|**样例** : `"string"`|string|


<a name="passengerlistitemvo"></a>
### PassengerListItemVO

|名称|说明|类型|
|---|---|---|
|**area_name**  <br>*可选*|护照签发地  <br>**样例** : `"string"`|string|
|**bindCardList**  <br>*可选*|绑定的权益卡列表，数组不为0说明有绑定权益卡，例如：['游侠风户外卡（月卡）','游侠风亲子卡（月卡）']  <br>**样例** : `[ "string" ]`|< string > array|
|**birth**  <br>*可选*|生日时间戳  <br>**样例** : `0`|integer (int64)|
|**birthStr**  <br>*可选*|生日时间戳  <br>**样例** : `"string"`|string|
|**cardName**  <br>*可选*|证件类型名称  <br>**样例** : `"string"`|string|
|**cardToast**  <br>*可选*|证件号码提示  <br>**样例** : `"string"`|string|
|**cardexp**  <br>*可选*|证件是否过期  <br>**样例** : `0`|integer (int64)|
|**cardno**  <br>*可选*|证件号  <br>**样例** : `"string"`|string|
|**cardnoHideAfter**  <br>*可选*|证件号脱敏显示  <br>**样例** : `"string"`|string|
|**cardtype**  <br>*可选*|证件类型1、二代身份证2、护照3、港澳通行证4、台胞证5、军官证6、回乡证7、其他（儿童）  <br>**样例** : `0`|integer (int32)|
|**defaultUsed**  <br>*可选*|是否为常用联系人，1是0否  <br>**样例** : `0`|integer (int32)|
|**firstAidCardId**  <br>*可选*|医疗急救卡id，id > 0 则代表医疗急救信息已完善  <br>**样例** : `0`|integer (int64)|
|**mid**  <br>*可选*|mid  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|联系人姓名  <br>**样例** : `"string"`|string|
|**nameToast**  <br>*可选*|姓名提示  <br>**样例** : `"string"`|string|
|**passport_area**  <br>*可选*|护照签发国家:1、中国；2、其他国家  <br>**样例** : `0`|integer (int32)|
|**passport_cid**  <br>*可选*|护照签发地cityid  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**phoneToast**  <br>*可选*|手机号码提示  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**showCardno**  <br>*可选*|展示证件号  <br>**样例** : `"string"`|string|
|**toast**  <br>*可选*|列表项提示，不可选择该出行人  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童  <br>**样例** : `0`|integer (int32)|
|**warnToast**  <br>*可选*|列表项警告提示，可以选择该出行人  <br>**样例** : `"string"`|string|


<a name="passengerlistvo"></a>
### PassengerListVO

|名称|说明|类型|
|---|---|---|
|**idcardRecognize**  <br>*可选*|拍身份证添加信息是否开启，1开启，0关闭  <br>**样例** : `0`|integer (int32)|
|**identitys**  <br>*可选*|证件类型列表  <br>**样例** : `[ "[passengeridentityvo](#passengeridentityvo)" ]`|< [PassengerIdentityVO](#passengeridentityvo) > array|
|**passengerList**  <br>*可选*|**样例** : `[ "[passengerlistitemvo](#passengerlistitemvo)" ]`|< [PassengerListItemVO](#passengerlistitemvo) > array|
|**passportRecognize**  <br>*可选*|拍护照添加信息是否开启，1开始，0关闭  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="payinfovo"></a>
### PayInfoVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|支付金额  <br>**样例** : `"string"`|string|
|**amountBeforeTip**  <br>*可选*|支付金额前文字，例如：尾款￥，或者例如：￥  <br>**样例** : `"string"`|string|
|**applyPeople**  <br>*可选*|报名人数  <br>**样例** : `"string"`|string|
|**balanceAmount**  <br>*可选*|账户总余额  <br>**样例** : `"string"`|string|
|**balanceLabel**  <br>*可选*|余额抵扣文案，例如：可用余额100元  <br>**样例** : `"string"`|string|
|**balanceSelected**  <br>*可选*|余额支付是否默认选中1选中（自动退款版本后废弃）  <br>**样例** : `0`|integer (int32)|
|**changeinfo**  <br>*可选*|变动提示  <br>**样例** : `"string"`|string|
|**contact_name**  <br>*可选*|联系人  <br>**样例** : `"string"`|string|
|**contact_phone**  <br>*可选*|联系人电话  <br>**样例** : `"string"`|string|
|**deductionUrl**  <br>*可选*|抵扣说明url  <br>**样例** : `"string"`|string|
|**earlybird**  <br>*可选*|早鸟信息-废弃  <br>**样例** : `"object"`|object|
|**fee_details**  <br>*可选*|费用明细-废弃  <br>**样例** : `"string"`|string|
|**fid**  <br>*可选*|fid  <br>**样例** : `0`|integer (int32)|
|**hotelName**  <br>*可选*|酒套-酒店名称，例如：杭州如家快捷连锁酒店  <br>**样例** : `"string"`|string|
|**hotelRoom**  <br>*可选*|酒套-房型，例如：标准间(含双早) * 1间  <br>**样例** : `"string"`|string|
|**insuranceChange**  <br>*可选*|保险是否变化  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|oid  <br>**样例** : `0`|integer (int32)|
|**paymethod**  <br>*可选*|支付方式  <br>**样例** : `"string"`|string|
|**prepayPayInfo**  <br>*可选*|预付支付信息  <br>**样例** : `"[prepaypayinfovo](#prepaypayinfovo)"`|[PrepayPayInfoVO](#prepaypayinfovo)|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**refresh**  <br>*可选*|配合tipLabel，是否需要刷新订单详情，1需要，0不需要  <br>**样例** : `0`|integer (int32)|
|**showBalance**  <br>*可选*|是否显示余额支付1显示（自动退款版本后永远为0，让app老版本不显示）  <br>**样例** : `0`|integer (int32)|
|**showBalanceV2**  <br>*可选*|是否显示余额抵扣1显示（自动退款版本后用这个控制余额抵扣是否启用）  <br>**样例** : `0`|integer (int32)|
|**showPayType**  <br>*可选*|是否显示支付方式  <br>**样例** : `0`|integer (int32)|
|**showYxb**  <br>*可选*|是否显示游侠币抵扣1显示  <br>**样例** : `0`|integer (int32)|
|**starttime**  <br>*可选*|出行日期  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|注意提示  <br>**样例** : `"string"`|string|
|**tipLabel**  <br>*可选*|弹出提示语  <br>**样例** : `"string"`|string|
|**yxbAmount**  <br>*可选*|游侠币抵扣金额  <br>**样例** : `0.0`|number|
|**yxbLabel**  <br>*可选*|游侠币抵扣文案，例如：共计200，可用100抵10元  <br>**样例** : `"string"`|string|
|**yxbSelected**  <br>*可选*|游侠币抵扣是否默认选中1选中  <br>**样例** : `0`|integer (int32)|


<a name="payresultvo"></a>
### PayResultVo

|名称|说明|类型|
|---|---|---|
|**appid**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**errorUrl**  <br>*可选*|**样例** : `"string"`|string|
|**html**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**insuranceChange**  <br>*可选*|保险是否变化  <br>**样例** : `0`|integer (int32)|
|**noncestr**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**orderString**  <br>*可选*|支付宝-使用  <br>**样例** : `"string"`|string|
|**package**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**partnerid**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**prepayid**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**refresh**  <br>*可选*|配合tipLabel，是否需要刷新订单详情，1需要，0不需要  <br>**样例** : `0`|integer (int32)|
|**sign**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**successUrl**  <br>*可选*|**样例** : `"string"`|string|
|**timestamp**  <br>*可选*|快钱-使用  <br>**样例** : `0`|integer (int32)|
|**tipLabel**  <br>*可选*|弹出提示语  <br>**样例** : `"string"`|string|


<a name="paysuccdrawwindowvo"></a>
### PaySuccDrawWindowVO

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|次数  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|立即抽奖的跳转链接  <br>**样例** : `"string"`|string|


<a name="paysuccinfovo"></a>
### PaySuccInfoVO

|名称|说明|类型|
|---|---|---|
|**bottomTip**  <br>*可选*|游侠币下部分文案  <br>**样例** : `"string"`|string|
|**contractTip**  <br>*可选*|合同提示  <br>**样例** : `"string"`|string|
|**couponTip**  <br>*可选*|例如：出行结束后评价可获得优惠券哦  <br>**样例** : `"string"`|string|
|**coupons**  <br>*可选*|下单成功送的优惠券  <br>**样例** : `[ "[couponslineslistvo](#couponslineslistvo)" ]`|< [CouponsLinesListVO](#couponslineslistvo) > array|
|**deadlineTime**  <br>*可选*|预付款时间  <br>**样例** : `"string"`|string|
|**deadlineTip**  <br>*可选*|例如：请在11-03 23:59前支付尾款，所含优惠信息在尾款时使用  <br>**样例** : `"string"`|string|
|**drawWindow**  <br>*可选*|抽奖机会弹窗，为空说明不需要  <br>**样例** : `"[paysuccdrawwindowvo](#paysuccdrawwindowvo)"`|[PaySuccDrawWindowVO](#paysuccdrawwindowvo)|
|**isNeedComment**  <br>*可选*|是否显示评论框; 1：显示，0：不显示  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|游小侠提示  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|游小侠提示  <br>**样例** : `"string"`|string|
|**topTip**  <br>*可选*|游侠币上部分文案  <br>**样例** : `"string"`|string|
|**yxb**  <br>*可选*|游侠币数量，如果为0，前端不弹出  <br>**样例** : `0.0`|number|
|**yxbTip**  <br>*可选*|例如：游侠币  <br>**样例** : `"string"`|string|
|**yxxTips**  <br>*可选*|游小侠提示  <br>**样例** : `[ "string" ]`|< string > array|


<a name="photoadvo"></a>
### PhotoAdVO

|名称|说明|类型|
|---|---|---|
|**photoData**  <br>*可选*|数据  <br>**样例** : `[ "[b4425fd96b3bc32e4ffdc242d00d017a](#b4425fd96b3bc32e4ffdc242d00d017a)" ]`|< [摄影风采广告位](#b4425fd96b3bc32e4ffdc242d00d017a) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="photoalbum"></a>
### PhotoAlbum

|名称|说明|类型|
|---|---|---|
|**firstImage**  <br>*可选*|第一张图片  <br>**样例** : `"string"`|string|
|**images**  <br>*可选*|图片列表  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|相册标题  <br>**样例** : `"string"`|string|


<a name="photoallvo"></a>
### PhotoAllVO

|名称|说明|类型|
|---|---|---|
|**themes**  <br>*可选*|作品主题  <br>**样例** : `[ "[photosubjectvo](#photosubjectvo)" ]`|< [PhotoSubjectVO](#photosubjectvo) > array|


<a name="photocompetitionvo"></a>
### PhotoCompetitionVO

|名称|说明|类型|
|---|---|---|
|**competitionId**  <br>*可选*|大赛id  <br>**样例** : `0`|integer (int32)|
|**count**  <br>*可选*|赛事下总图片数  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|大赛封面图  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|奖品简介说明  <br>**样例** : `"string"`|string|
|**time**  <br>*可选*|赛事状态对应时间显示  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|赛事标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|赛事状态 1 征稿中 2投票中 3评选中 4未开始 5已结束  <br>**样例** : `0`|integer (int32)|


<a name="photodetailvo"></a>
### PhotoDetailVO

|名称|说明|类型|
|---|---|---|
|**assetUrl**  <br>*可选*|**样例** : `"string"`|string|
|**ext**  <br>*可选*|**样例** : `"string"`|string|
|**file**  <br>*可选*|**样例** : `"string"`|string|
|**height**  <br>*可选*|**样例** : `0`|integer (int32)|
|**labels**  <br>*可选*|**样例** : `[ "[photolabel](#photolabel)" ]`|< [PhotoLabel](#photolabel) > array|
|**width**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="photodetailvo_1"></a>
### PhotoDetailVO_1

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**allowPlatform**  <br>*可选*|是否允许游侠客平台传播，0未授权，1授权  <br>**样例** : `0`|integer (int32)|
|**allowUser**  <br>*可选*|是否允许使用 0未授权，1终极授权随意使用  <br>**样例** : `0`|integer (int32)|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**auditStatusLabel**  <br>*可选*|审核状态  <br>**样例** : `"string"`|string|
|**auth**  <br>*可选*|作者昵称  <br>**样例** : `"string"`|string|
|**author**  <br>*可选*|作者  <br>**样例** : `"[author](#author)"`|[Author](#author)|
|**authorOtherAlbums**  <br>*可选*|同作者作品  <br>**样例** : `[ "[albumphotovo](#albumphotovo)" ]`|< [AlbumPhotoVO](#albumphotovo) > array|
|**canVote**  <br>*可选*|摄影作品是否能投票  <br>**样例** : `true`|boolean|
|**channel**  <br>*可选*|来源0pc 1app  <br>**样例** : `0`|integer (int32)|
|**commentPage**  <br>*可选*|评论  <br>**样例** : `"[4f2713a50d7192d8d5953399f471d88b](#4f2713a50d7192d8d5953399f471d88b)"`|[PagerInfoListWrap«List«object»,List«object»»](#4f2713a50d7192d8d5953399f471d88b)|
|**commented**  <br>*可选*|评论量  <br>**样例** : `0`|integer (int32)|
|**competitionReward**  <br>*可选*|获奖  <br>**样例** : `"[competitionrewardvo](#competitionrewardvo)"`|[CompetitionRewardVO](#competitionrewardvo)|
|**competition_info**  <br>*可选*|比赛信息  <br>**样例** : `"[competitioninfovo](#competitioninfovo)"`|[CompetitionInfoVO](#competitioninfovo)|
|**copyright**  <br>*可选*|8非原创。1共享-署名、2非商业、3禁止演绎、4相同方式共享、5非商业-禁止演绎、6非商业-相同方式共享、7非署名  <br>**样例** : `"[copyright](#copyright)"`|[Copyright](#copyright)|
|**cover**  <br>*可选*|封面(thumb)对应的原始图片url  <br>**样例** : `"string"`|string|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**editor_choice**  <br>*可选*|编辑推荐  <br>**样例** : `"string"`|string|
|**editor_cover**  <br>*可选*|编辑推荐封面  <br>**样例** : `"string"`|string|
|**enable_download**  <br>*可选*|是否允许下载图片  <br>**样例** : `true`|boolean|
|**gmt_create**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**gmt_modify**  <br>*可选*|修改时间  <br>**样例** : `0`|integer (int32)|
|**h5LeftVote**  <br>*可选*|h5剩余票数  <br>**样例** : `0`|integer (int32)|
|**isMoreComment**  <br>*可选*|是否有更多评论  <br>**样例** : `true`|boolean|
|**isShowVoteButton**  <br>*可选*|是否显示文案  <br>**样例** : `true`|boolean|
|**is_collect**  <br>*可选*|是否收藏  <br>**样例** : `true`|boolean|
|**is_competition**  <br>*可选*|是否是参赛作品 1:是; 0：否  <br>**样例** : `0`|integer (int32)|
|**is_liked**  <br>*可选*|是否喜欢  <br>**样例** : `true`|boolean|
|**kit**  <br>*可选*|设备  <br>**样例** : `"string"`|string|
|**left_vote**  <br>*可选*|剩余投票数  <br>**样例** : `0`|integer (int32)|
|**liked**  <br>*可选*|喜欢数  <br>**样例** : `0`|integer (int32)|
|**model**  <br>*可选*|模特  <br>**样例** : `"string"`|string|
|**otherInfo**  <br>*可选*|获奖赛事:winCompetition ,话题：topic，目的地：mdd  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**photos**  <br>*可选*|图片详情  <br>**样例** : `[ "[detailphotosvo](#detailphotosvo)" ]`|< [DetailPhotosVO](#detailphotosvo) > array|
|**place**  <br>*可选*|拍摄地点  <br>**样例** : `"string"`|string|
|**ps**  <br>*可选*|拍摄者  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关系 none,both,following,follwer  <br>**样例** : `"string"`|string|
|**remainFloorNum**  <br>*可选*|剩余楼层数  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|是否禁止评论1禁止 0可评论  <br>**样例** : `0`|integer (int32)|
|**scored**  <br>*可选*|积分  <br>**样例** : `0`|integer (int32)|
|**shareTip**  <br>*可选*|分享提示信息  <br>**样例** : `"string"`|string|
|**share_desc**  <br>*可选*|分享描述  <br>**样例** : `"string"`|string|
|**share_title**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|
|**share_url**  <br>*可选*|分享地址链接  <br>**样例** : `"string"`|string|
|**showVoteNum**  <br>*可选*|展示投票数  <br>**样例** : `0`|integer (int32)|
|**source**  <br>*可选*|版权  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|0可用 1不可用  <br>**样例** : `0`|integer (int32)|
|**subject**  <br>*可选*|主题 1、户外旅游2、风光摄影3、人像摄影4、人文纪实5、生态摄影6、静态摄影7、商业摄影 8、体育运动9、LOMO 10、其他  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|作品标签  <br>**样例** : `[ "[tags](#tags)" ]`|< [Tags](#tags) > array|
|**thumb**  <br>*可选*|封面地址  <br>**样例** : `"string"`|string|
|**thumb_height**  <br>*可选*|封面高度  <br>**样例** : `0`|integer (int32)|
|**thumb_size**  <br>*可选*|缩略图尺寸(px)  <br>**样例** : `0`|integer (int32)|
|**thumb_url**  <br>*可选*|封面完整链接  <br>**样例** : `"string"`|string|
|**thumb_width**  <br>*可选*|封面宽高  <br>**样例** : `0`|integer (int32)|
|**timeline**  <br>*可选*|拍摄日期  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|用户ID  <br>**样例** : `0`|integer (int32)|
|**userType**  <br>*可选*|用户类别 STAFF员工,LEADER领队,MEMBER会员,TOURIST游客  <br>**样例** : `"string"`|enum (STAFF, LEADER, MEMBER, TOURIST)|
|**viewed**  <br>*可选*|浏览量  <br>**样例** : `0`|integer (int32)|
|**voteDescription**  <br>*可选*|投票描述  <br>**样例** : `"string"`|string|
|**votes**  <br>*可选*|投票数  <br>**样例** : `0`|integer (int32)|


<a name="photoentity"></a>
### PhotoEntity

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `"string"`|string|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="photohomevo"></a>
### PhotoHomeVO

|名称|说明|类型|
|---|---|---|
|**photoCompetitionVOS**  <br>*可选*|赛事列表  <br>**样例** : `[ "[photocompetitionvo](#photocompetitionvo)" ]`|< [PhotoCompetitionVO](#photocompetitionvo) > array|
|**recommendMasters**  <br>*可选*|名家推荐  <br>**样例** : `[ "[recommendmastervo](#recommendmastervo)" ]`|< [RecommendMasterVO](#recommendmastervo) > array|
|**stationaryModules**  <br>*可选*|固定模块  <br>**样例** : `[ "[stationarymodule](#stationarymodule)" ]`|< [StationaryModule](#stationarymodule) > array|
|**tags**  <br>*可选*|瀑布流标签  <br>**样例** : `[ "[tagvo_1](#tagvo_1)" ]`|< [TagVO_1](#tagvo_1) > array|


<a name="photolabel"></a>
### PhotoLabel

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**position**  <br>*可选*|**样例** : `"string"`|string|
|**x**  <br>*可选*|**样例** : `0.0`|number (double)|
|**y**  <br>*可选*|**样例** : `0.0`|number (double)|


<a name="photomastervo"></a>
### PhotoMasterVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|作品列表  <br>**样例** : `[ "[photomastervo](#photomastervo)" ]`|< [PhotoMasterVo](#photomastervo) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="photomastervo"></a>
### PhotoMasterVo

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品集合  <br>**样例** : `[ "[albumsbeanvo](#albumsbeanvo)" ]`|< [AlbumsBeanVO](#albumsbeanvo) > array|
|**master**  <br>*可选*|作者  <br>**样例** : `"[mastersbean](#mastersbean)"`|[MastersBean](#mastersbean)|
|**relation**  <br>*可选*|关系  <br>**样例** : `"string"`|string|


<a name="photorecomentationvo"></a>
### PhotoRecomentationVO

|名称|说明|类型|
|---|---|---|
|**album_recommends**  <br>*可选*|摄影作品推荐列表  <br>**样例** : `[ "[albumrecommendsbeanvo](#albumrecommendsbeanvo)" ]`|< [AlbumRecommendsBeanVO](#albumrecommendsbeanvo) > array|
|**competitions**  <br>*可选*|正在进行的比赛列表  <br>**样例** : `[ "[competitionsbean](#competitionsbean)" ]`|< [CompetitionsBean](#competitionsbean) > array|
|**masters**  <br>*可选*|摄影名家列表  <br>**样例** : `[ "[mastersbean](#mastersbean)" ]`|< [MastersBean](#mastersbean) > array|
|**themes**  <br>*可选*|摄影作品主题列表  <br>**样例** : `[ "[themesbean](#themesbean)" ]`|< [ThemesBean](#themesbean) > array|


<a name="photosecenmodel"></a>
### PhotoSecenModel

|名称|说明|类型|
|---|---|---|
|**authorName**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|
|**authorid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**height**  <br>*可选*|高  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1代表游记 2 代表摄影作品  <br>**样例** : `0`|integer (int32)|
|**width**  <br>*可选*|宽  <br>**样例** : `"string"`|string|


<a name="photosubjectvo"></a>
### PhotoSubjectVO

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品列表  <br>**样例** : `[ "[themevo_1](#themevo_1)" ]`|< [ThemeVO_1](#themevo_1) > array|
|**more_url**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**themeName**  <br>*可选*|主题名称  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="photosvo"></a>
### PhotosVO

|名称|说明|类型|
|---|---|---|
|**img**  <br>*可选*|图片地址  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|图片id  <br>**样例** : `0`|integer (int32)|


<a name="picinfovo"></a>
### PicInfoVO

|名称|说明|类型|
|---|---|---|
|**height**  <br>*可选*|图片高度  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|图片宽度  <br>**样例** : `"string"`|string|


<a name="picvo"></a>
### PicVO

|名称|说明|类型|
|---|---|---|
|**height**  <br>*可选*|图片高度  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|图片id  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**width**  <br>*可选*|图片宽度  <br>**样例** : `0`|integer (int32)|


<a name="pjuser"></a>
### PjUSer

|名称|说明|类型|
|---|---|---|
|**avator**  <br>*可选*|用户图像  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|


<a name="pkgbean"></a>
### PkgBean

|名称|说明|类型|
|---|---|---|
|**pkg_name**  <br>*可选*|批次套餐名称  <br>**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|


<a name="placebean"></a>
### PlaceBean

|名称|说明|类型|
|---|---|---|
|**country_id**  <br>*可选*|国家id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**place_id**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|


<a name="placevo"></a>
### PlaceVO

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|市  <br>**样例** : `"string"`|string|
|**contry**  <br>*可选*|contry  <br>**样例** : `"string"`|string|
|**distriction**  <br>*可选*|区  <br>**样例** : `"string"`|string|
|**province**  <br>*可选*|省  <br>**样例** : `"string"`|string|


<a name="placevo_1"></a>
### PlaceVO_1

|名称|说明|类型|
|---|---|---|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**placelist**  <br>*可选*|目的地列表  <br>**样例** : `[ "[placebean](#placebean)" ]`|< [PlaceBean](#placebean) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="postentity"></a>
### PostEntity

|名称|说明|类型|
|---|---|---|
|**author_avatar**  <br>*可选*|**样例** : `"string"`|string|
|**author_name**  <br>*可选*|**样例** : `"string"`|string|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**header**  <br>*可选*|**样例** : `"string"`|string|
|**location**  <br>*可选*|**样例** : `"string"`|string|
|**moreHandler**  <br>*可选*|**样例** : `"string"`|string|
|**moreUrl**  <br>*可选*|**样例** : `"string"`|string|
|**post_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="prepaypayinfovo"></a>
### PrepayPayInfoVO

|名称|说明|类型|
|---|---|---|
|**prepayPayTypeList**  <br>*可选*|多支付类型  <br>**样例** : `[ "[prepaypaytypevo](#prepaypaytypevo)" ]`|< [PrepayPayTypeVO](#prepaypaytypevo) > array|


<a name="prepaypaytypevo"></a>
### PrepayPayTypeVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|金额  <br>**样例** : `"string"`|string|
|**amountBeforeTip**  <br>*可选*|例如：￥  <br>**样例** : `"string"`|string|
|**bottomDesc**  <br>*可选*|例如：团位紧张情况时，全款支付优先占位；或者例如：请在11-03 23:59前支付尾款，所含优惠信息在尾款时使用  <br>**样例** : `"string"`|string|
|**explainTip**  <br>*可选*|例如：抵扣说明；或者例如：预付款说明  <br>**样例** : `"string"`|string|
|**explainUrl**  <br>*可选*|说明链接  <br>**样例** : `"string"`|string|
|**payType**  <br>*可选*|支付类型1直接预订(支持游侠币)2预付  <br>**样例** : `0`|integer (int32)|
|**showPayType**  <br>*可选*|是否显示支付方式  <br>**样例** : `0`|integer (int32)|
|**tip**  <br>*可选*|例如：直接预订  <br>**样例** : `"string"`|string|


<a name="privacylistvo"></a>
### PrivacyListVo

|名称|说明|类型|
|---|---|---|
|**adPushStatus**  <br>*可选*|个性化推荐 1：打开 0：关闭  <br>**样例** : `0`|integer (int32)|
|**allowView**  <br>*可选*|允许他人通过报名名单查看个人信息：1为打开，0为关闭  <br>**样例** : `0`|integer (int32)|
|**evaluateRecommend**  <br>*可选*|允许评价内容被推荐后同步至我的遇见：1为打开，0为关闭  <br>**样例** : `0`|integer (int32)|
|**evaluateRecommendLabel**  <br>*可选*|例如：允许评价内容被推荐后同步至我的遇见  <br>**样例** : `"string"`|string|
|**recommend**  <br>*可选*|是否推送推荐消息：1为打开，0为关闭  <br>**样例** : `0`|integer (int32)|


<a name="productapplyinfovo"></a>
### ProductApplyInfoVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像，没有不显示  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|例如：游**侠1秒前 报名了活动/122位游侠正在关注，速度报名  <br>**样例** : `"string"`|string|


<a name="productaroundvo"></a>
### ProductAroundVO

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|成人价格  <br>**样例** : `0.0`|number|
|**class_theme_id**  <br>*可选*|主题  <br>**样例** : `0`|integer (int32)|
|**days_label**  <br>*可选*|活动几天几夜  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**pkg**  <br>*可选*|1有更多套餐  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|出发地或者集合地  <br>**样例** : `"string"`|string|
|**price_label**  <br>*可选*|价格标签  <br>**样例** : `"string"`|string|
|**product_cat**  <br>*可选*|如：深度游  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|类型 如 跟团游  <br>**样例** : `"string"`|string|
|**shortTitle**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|1报名 2名额暂满 3确定成行  <br>**样例** : `0`|integer (int32)|
|**statusLable**  <br>*可选*|状态名称  <br>**样例** : `"string"`|string|
|**sub_name**  <br>*可选*|副表题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="productbargainshowvo"></a>
### ProductBargainShowVo

|名称|说明|类型|
|---|---|---|
|**howBargainUrl**  <br>*可选*|砍价规则图片链接  <br>**样例** : `"string"`|string|
|**maxBargainAmount**  <br>*可选*|最高可砍价金额不带符号，例如：195  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|有值的话显示，例如：仅剩23份  <br>**样例** : `"string"`|string|
|**overtime**  <br>*可选*|距离砍价结束多少秒  <br>**样例** : `0`|integer (int64)|


<a name="productbargainvo"></a>
### ProductBargainVo

|名称|说明|类型|
|---|---|---|
|**etime**  <br>*可选*|**样例** : `"string"`|string|
|**money**  <br>*可选*|**样例** : `"string"`|string|
|**msg**  <br>*可选*|**样例** : `"string"`|string|
|**now**  <br>*可选*|**样例** : `0`|integer (int64)|
|**numLimit**  <br>*可选*|**样例** : `0`|integer (int32)|
|**numRemain**  <br>*可选*|**样例** : `0`|integer (int32)|
|**numRemainLabel**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**stime**  <br>*可选*|**样例** : `"string"`|string|
|**timeRemain**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="productbasicmodel"></a>
### ProductBasicModel

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|成人价格  <br>**样例** : `0.0`|number|
|**class_theme_id**  <br>*可选*|主题  <br>**样例** : `0`|integer (int32)|
|**days_label**  <br>*可选*|活动几天几夜  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|出发地或者集合地  <br>**样例** : `"string"`|string|
|**price_label**  <br>*可选*|价格标签  <br>**样例** : `"string"`|string|
|**product_cat**  <br>*可选*|如：深度游  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|类型 如 跟团游  <br>**样例** : `"string"`|string|
|**shortTitle**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**sub_name**  <br>*可选*|副表题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="productbatchbean"></a>
### ProductBatchBean

|名称|说明|类型|
|---|---|---|
|**adultPrice**  <br>*可选*|成人价格，用于判断，当大于等于0时priceLabel需要处理￥，否则直接展示  <br>**样例** : `0.0`|number|
|**adultPriceLabel**  <br>*可选*|成人价格，不带￥，为空说明无价格，例如：23.65  <br>**样例** : `"string"`|string|
|**adultSaleTagList**  <br>*可选*|成人优惠标签  <br>**样例** : `[ "string" ]`|< string > array|
|**batchId**  <br>*可选*|批次id  <br>**样例** : `0`|integer (int32)|
|**batchPkgId**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**childPrice**  <br>*可选*|儿童价格，用于判断，当大于等于0时priceLabel需要处理￥，否则直接展示  <br>**样例** : `0.0`|number|
|**childPriceLabel**  <br>*可选*|儿童价格，不带￥，为空说明无价格，例如：23.65  <br>**样例** : `"string"`|string|
|**childSaleTagList**  <br>*可选*|儿童优惠标签  <br>**样例** : `[ "string" ]`|< string > array|
|**dailyPkgId**  <br>*可选*|行程套餐id  <br>**样例** : `0`|integer (int32)|
|**dateFmt**  <br>*可选*|例如：2021-06-30  <br>**样例** : `"string"`|string|
|**keyList**  <br>*可选*|前端数据处理用，key为`dailyPkgId,batchPkgId,dateFmt`  <br>**样例** : `[ "string" ]`|< string > array|
|**prepayTip**  <br>*可选*|为空不显示，例如：支持预付款  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格，用于判断，当大于等于0时priceLabel需要处理￥，否则直接展示  <br>**样例** : `0.0`|number|
|**priceLabel**  <br>*可选*|价格，不带￥，例如：23.65  <br>**样例** : `"string"`|string|
|**saleAdultprice**  <br>*可选*|优惠后成人价，不带￥，为空说明无优惠，例如：23.65  <br>**样例** : `"string"`|string|
|**saleChildprice**  <br>*可选*|优惠后儿童价，不带￥，为空说明无优惠，例如：23.65  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|当前批次状态1、可报名２、名额暂满３、确定成行  <br>**样例** : `0`|integer (int32)|
|**statusLabel**  <br>*可选*|当前批次状态1、可报名２、名额暂满３、确定成行  <br>**样例** : `"string"`|string|
|**statusTip**  <br>*可选*|例如：可报名 大胆报名  <br>**样例** : `"string"`|string|
|**topLeftTip**  <br>*可选*|左上角文案，例如：早  <br>**样例** : `"string"`|string|
|**topLeftType**  <br>*可选*|左上角类型，1早，2预  <br>**样例** : `0`|integer (int32)|


<a name="productbatchmonthbean"></a>
### ProductBatchMonthBean

|名称|说明|类型|
|---|---|---|
|**dateFmt**  <br>*可选*|例如：2021-06  <br>**样例** : `"string"`|string|
|**monthLabel**  <br>*可选*|展示文案，例如：6月  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|最小价格，用于判断，当大于等于0时priceLabel需要处理￥和起，否则直接展示  <br>**样例** : `0.0`|number|
|**priceLabel**  <br>*可选*|最小价格，不带￥和起，例如：23.65  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**topLeftTip**  <br>*可选*|左上角文案，例如：早  <br>**样例** : `"string"`|string|


<a name="productbatchpkgbean"></a>
### ProductBatchPkgBean

|名称|说明|类型|
|---|---|---|
|**batchPkgId**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**batchPkgName**  <br>*可选*|批次套餐名称  <br>**样例** : `"string"`|string|
|**dailyPkgId**  <br>*可选*|行程套餐id  <br>**样例** : `0`|integer (int32)|
|**dateList**  <br>*可选*|该批次套餐下含有的日期，例如：['2021-06-29','2021-06-30']  <br>**样例** : `[ "string" ]`|< string > array|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|


<a name="productbatchvo"></a>
### ProductBatchVo

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|批次id  <br>**样例** : `0`|integer (int32)|
|**dateLabel**  <br>*可选*|批次日期展示  <br>**样例** : `"string"`|string|
|**dateNightLabel**  <br>*可选*|开始结束日期展示，例如：07-03周二至07-05周五（2晚）  <br>**样例** : `"string"`|string|
|**endDate**  <br>*可选*|结束时间yyyy-MM-dd  <br>**样例** : `"string"`|string|
|**pkgid**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**priceLabel**  <br>*可选*|价格展示  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**startDate**  <br>*可选*|开始时间yyyy-MM-dd  <br>**样例** : `"string"`|string|


<a name="productbatchesvo"></a>
### ProductBatchesVo

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|bid  <br>**样例** : `0`|integer (int32)|
|**cornerTip**  <br>*可选*|右上角文案，例如：可报名  <br>**样例** : `"string"`|string|
|**cornerTipColour**  <br>*可选*|右上角文案颜色，例如：#000000  <br>**样例** : `"string"`|string|
|**dateline**  <br>*可选*|格式化时间  <br>**样例** : `"string"`|string|
|**diff_num**  <br>*可选*|未设置  <br>**样例** : `"string"`|string|
|**pkgId**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**pkg_name**  <br>*可选*|批次名称  <br>**样例** : `"string"`|string|
|**prepayTip**  <br>*可选*|例如：预付  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `"string"`|string|
|**saleTip**  <br>*可选*|没有不显示，价格左侧文案：特惠  <br>**样例** : `"string"`|string|
|**starttime**  <br>*可选*|开始时间  <br>**样例** : `0`|integer (int64)|


<a name="productbean"></a>
### ProductBean

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|批次id  <br>**样例** : `0`|integer (int32)|
|**cate**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|产品封面  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**productCateType**  <br>*可选*|产品品类主题  <br>**样例** : `[ "string" ]`|< string > array|
|**qiyu**  <br>*可选*|七鱼信息  <br>**样例** : `"[qiyubean](#qiyubean)"`|[QiyuBean](#qiyubean)|
|**service_id**  <br>*可选*|在线客服  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**sub_name**  <br>*可选*|产品副标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**url_string**  <br>*可选*|**样例** : `"string"`|string|


<a name="productcalendarbatchv2vo"></a>
### ProductCalendarBatchV2VO

|名称|说明|类型|
|---|---|---|
|**batchList**  <br>*可选*|批次列表  <br>**样例** : `[ "[productbatchbean](#productbatchbean)" ]`|< [ProductBatchBean](#productbatchbean) > array|
|**batchMonthListMap**  <br>*可选*|月份列表map，key为`dailyPkgId,batchPkgId`，例如：行程套餐和批次套餐都未选中时key为`0,0`，只选中行程套餐时key为`dailyPkgId,0`，有选中批次套餐时key为`dailyPkgId,batchPkgId`  <br>**样例** : `{<br>  "string" : [ "[productbatchmonthbean](#productbatchmonthbean)" ]<br>}`|< string, < [ProductBatchMonthBean](#productbatchmonthbean) > array > map|
|**batchPkgList**  <br>*可选*|批次套餐列表  <br>**样例** : `[ "[productbatchpkgbean](#productbatchpkgbean)" ]`|< [ProductBatchPkgBean](#productbatchpkgbean) > array|
|**curBatchMonthList**  <br>*可选*|当前月份列表，刚进来默认展示的月份列表  <br>**样例** : `[ "[productbatchmonthbean](#productbatchmonthbean)" ]`|< [ProductBatchMonthBean](#productbatchmonthbean) > array|
|**dailyPkgList**  <br>*可选*|行程套餐列表  <br>**样例** : `[ "[productdailypkgbean](#productdailypkgbean)" ]`|< [ProductDailyPkgBean](#productdailypkgbean) > array|
|**discountTip**  <br>*可选*|底部满减文案  <br>**样例** : `"string"`|string|
|**holidayMap**  <br>*可选*|节假日map  <br>**样例** : `{<br>  "string" : "[holidaybean](#holidaybean)"<br>}`|< string, [HolidayBean](#holidaybean) > map|


<a name="productcalendarbatchvo"></a>
### ProductCalendarBatchVO

|名称|说明|类型|
|---|---|---|
|**batchsCrossDays**  <br>*可选*|**样例** : `0`|integer (int32)|
|**batchsDesc**  <br>*可选*|**样例** : `"string"`|string|
|**batchsList**  <br>*可选*|**样例** : `[ "[batchslistbean](#batchslistbean)" ]`|< [BatchsListBean](#batchslistbean) > array|
|**batchsPreview**  <br>*可选*|**样例** : `[ "[monthsbean](#monthsbean)" ]`|< [MonthsBean](#monthsbean) > array|
|**calenderEnd**  <br>*可选*|**样例** : `0`|integer (int64)|
|**calenderStart**  <br>*可选*|**样例** : `0`|integer (int64)|
|**daily_pkg_list**  <br>*可选*|**样例** : `[ "[dailypkglistbean](#dailypkglistbean)" ]`|< [DailyPkgListBean](#dailypkglistbean) > array|
|**package_list**  <br>*可选*|**样例** : `[ "[packagelistbean](#packagelistbean)" ]`|< [PackageListBean](#packagelistbean) > array|


<a name="productcardvo"></a>
### ProductCardVO

|名称|说明|类型|
|---|---|---|
|**alreadyHave**  <br>*可选*|是否已经有权益卡，1已有（展示已购卡样式），0未有（展示立即购卡样式）  <br>**样例** : `0`|integer (int32)|
|**bottomBtnLabel**  <br>*可选*|底部按钮文案，例如：买卡免费游/免费报名  <br>**样例** : `"string"`|string|
|**tipLabel**  <br>*可选*|文案，例如：开通权益卡免费出游/您的权益卡可用于本产品，请在填写订单时选  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|立即开卡的跳转链接地址  <br>**样例** : `"string"`|string|


<a name="productcommentcontentvo"></a>
### ProductCommentContentVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评价时间  <br>**样例** : `0`|integer (int64)|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评价内容  <br>**样例** : `"string"`|string|
|**img**  <br>*可选*|首图  <br>**样例** : `"string"`|string|
|**quality**  <br>*可选*|是否优质评价：1是0否  <br>**样例** : `0`|integer (int32)|
|**score**  <br>*可选*|评论分数  <br>**样例** : `"string"`|string|
|**scoreColor**  <br>*可选*|分数颜色  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="productcommenttagsvo"></a>
### ProductCommentTagsVo

|名称|说明|类型|
|---|---|---|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**tname**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|


<a name="productcommentvo"></a>
### ProductCommentVo

|名称|说明|类型|
|---|---|---|
|**avg_score**  <br>*可选*|酒套平均分 0表示暂无评价  <br>**样例** : `"string"`|string|
|**avg_score_color**  <br>*可选*|酒套平均分数颜色  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评价内容  <br>**样例** : `"[productcommentcontentvo](#productcommentcontentvo)"`|[ProductCommentContentVo](#productcommentcontentvo)|
|**contentlist**  <br>*可选*|小程序最近5条评价内容  <br>**样例** : `[ "[productcommentcontentvo](#productcommentcontentvo)" ]`|< [ProductCommentContentVo](#productcommentcontentvo) > array|
|**lineContentList**  <br>*可选*|线路评价列表  <br>**样例** : `[ "[productcommentcontentvo](#productcommentcontentvo)" ]`|< [ProductCommentContentVo](#productcommentcontentvo) > array|
|**pj_num**  <br>*可选*|评价数量  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|评价标签信息  <br>**样例** : `[ "[productcommenttagsvo](#productcommenttagsvo)" ]`|< [ProductCommentTagsVo](#productcommenttagsvo) > array|


<a name="productcoupondetailmidvo"></a>
### ProductCouponDetailMidVo

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|代金券  <br>**样例** : `[ "[productcoupondetailvo](#productcoupondetailvo)" ]`|< [ProductCouponDetailVo](#productcoupondetailvo) > array|
|**title**  <br>*可选*|领券提示  <br>**样例** : `"string"`|string|


<a name="productcoupondetailvo"></a>
### ProductCouponDetailVo

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|金额  <br>**样例** : `0.0`|number|
|**cid**  <br>*可选*|cid  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|有效期提示语  <br>**样例** : `"string"`|string|
|**label**  <br>*可选*|领取提示语  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|0未领取1已领取2领取完  <br>**样例** : `0`|integer (int32)|
|**use_condition**  <br>*可选*|用券提示语  <br>**样例** : `"string"`|string|


<a name="productcouponvo"></a>
### ProductCouponVo

|名称|说明|类型|
|---|---|---|
|**couponsInfoList**  <br>*可选*|代金券信息简述  <br>**样例** : `[ "string" ]`|< string > array|
|**maxGetAmount**  <br>*可选*|手动领卷中最大优惠金额  <br>**样例** : `0.0`|number|
|**order_coupons**  <br>*可选*|下单送代金券  <br>**样例** : `"[productcoupondetailmidvo](#productcoupondetailmidvo)"`|[ProductCouponDetailMidVo](#productcoupondetailmidvo)|
|**product_coupons**  <br>*可选*|领卷下单代金券  <br>**样例** : `"[productcoupondetailmidvo](#productcoupondetailmidvo)"`|[ProductCouponDetailMidVo](#productcoupondetailmidvo)|
|**tip**  <br>*可选*|代金券提示语  <br>**样例** : `"string"`|string|


<a name="productdailypkgbean"></a>
### ProductDailyPkgBean

|名称|说明|类型|
|---|---|---|
|**dailyPkgId**  <br>*可选*|行程套餐id  <br>**样例** : `0`|integer (int32)|
|**dailyPkgName**  <br>*可选*|行程套餐名称  <br>**样例** : `"string"`|string|
|**dateList**  <br>*可选*|该行程套餐下含有的日期，例如：['2021-06-29','2021-06-30']  <br>**样例** : `[ "string" ]`|< string > array|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**voucherLabel**  <br>*可选*|为空不展示，例如：预售券可用  <br>**样例** : `"string"`|string|


<a name="productdatevo"></a>
### ProductDateVO

|名称|说明|类型|
|---|---|---|
|**avatarList**  <br>*可选*|头像列表  <br>**样例** : `[ "string" ]`|< string > array|
|**bid**  <br>*可选*|批次id  <br>**样例** : `0`|integer (int32)|
|**cornerTip**  <br>*可选*|状态，例如：可报名  <br>**样例** : `"string"`|string|
|**cornerTipColor**  <br>*可选*|背景颜色，例如：#000000  <br>**样例** : `"string"`|string|
|**day**  <br>*可选*|格式化时间:日  <br>**样例** : `"string"`|string|
|**festival**  <br>*可选*|节假日  <br>**样例** : `"string"`|string|
|**fontColor**  <br>*可选*|字体颜色，例如：#000000  <br>**样例** : `"string"`|string|
|**memberCount**  <br>*可选*|报名人数  <br>**样例** : `0`|integer (int32)|
|**memberUrl**  <br>*可选*|名单页面url  <br>**样例** : `"string"`|string|
|**month**  <br>*可选*|格式化时间:月  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `"string"`|string|
|**rest**  <br>*可选*|休息日  <br>**样例** : `0`|integer (int32)|
|**starttime**  <br>*可选*|开始时间  <br>**样例** : `0`|integer (int64)|
|**week**  <br>*可选*|周  <br>**样例** : `"string"`|string|
|**year**  <br>*可选*|格式化时间:年  <br>**样例** : `"string"`|string|


<a name="productdetailbatchselectvo"></a>
### ProductDetailBatchSelectVo

|名称|说明|类型|
|---|---|---|
|**hotel**  <br>*可选*|酒套-酒店信息  <br>**样例** : `"[productdetailhotelvo](#productdetailhotelvo)"`|[ProductDetailHotelVo](#productdetailhotelvo)|
|**pkgList**  <br>*可选*|酒套-批次套餐  <br>**样例** : `[ "[productdetailpkgvo](#productdetailpkgvo)" ]`|< [ProductDetailPkgVo](#productdetailpkgvo) > array|
|**tickets**  <br>*可选*|酒套-套餐门票信息  <br>**样例** : `"[productdetailticketsvo](#productdetailticketsvo)"`|[ProductDetailTicketsVo](#productdetailticketsvo)|


<a name="productdetailhotelvo"></a>
### ProductDetailHotelVo

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|酒店地址  <br>**样例** : `"string"`|string|
|**hid**  <br>*可选*|酒店id  <br>**样例** : `0`|integer (int32)|
|**hotelImages**  <br>*可选*|酒店图片  <br>**样例** : `[ "string" ]`|< string > array|
|**hotelLevelLabel**  <br>*可选*|酒店等级  <br>**样例** : `"string"`|string|
|**hotelName**  <br>*可选*|酒店名称  <br>**样例** : `"string"`|string|
|**hotelTags**  <br>*可选*|酒店标签  <br>**样例** : `[ "string" ]`|< string > array|
|**hotelTitle**  <br>*可选*|酒店标题  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**placeType**  <br>*可选*|1国内2国外  <br>**样例** : `0`|integer (int32)|
|**room**  <br>*可选*|房型  <br>**样例** : `"[hotelroomvo](#hotelroomvo)"`|[HotelRoomVo](#hotelroomvo)|
|**topTitle**  <br>*可选*|模块标题  <br>**样例** : `"string"`|string|


<a name="productdetailpkgvo"></a>
### ProductDetailPkgVo

|名称|说明|类型|
|---|---|---|
|**batchList**  <br>*可选*|批次  <br>**样例** : `[ "[productbatchvo](#productbatchvo)" ]`|< [ProductBatchVo](#productbatchvo) > array|
|**name**  <br>*可选*|批次套餐名称  <br>**样例** : `"string"`|string|
|**pkgId**  <br>*可选*|批次套餐id  <br>**样例** : `0`|integer (int32)|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|


<a name="productdetailroomselectvo"></a>
### ProductDetailRoomSelectVo

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|酒店地址  <br>**样例** : `"string"`|string|
|**endDateLabel**  <br>*可选*|离店时间，例如：05-19  <br>**样例** : `"string"`|string|
|**endDateWeekLabel**  <br>*可选*|离店时间，例如：周三  <br>**样例** : `"string"`|string|
|**firstImage**  <br>*可选*|酒店图片第一张  <br>**样例** : `"string"`|string|
|**hid**  <br>*可选*|酒店id  <br>**样例** : `0`|integer (int32)|
|**hotelImages**  <br>*可选*|酒店图片  <br>**样例** : `[ "string" ]`|< string > array|
|**hotelLevelLabel**  <br>*可选*|酒店等级  <br>**样例** : `"string"`|string|
|**hotelPolicyList**  <br>*可选*|酒店政策信息  <br>**样例** : `[ "[hotelpolicyvo](#hotelpolicyvo)" ]`|< [HotelPolicyVo](#hotelpolicyvo) > array|
|**hotelPolicyTitle**  <br>*可选*|标题：酒店政策  <br>**样例** : `"string"`|string|
|**hotelTags**  <br>*可选*|酒店标签  <br>**样例** : `[ "string" ]`|< string > array|
|**hotelTitle**  <br>*可选*|酒店标题  <br>**样例** : `"string"`|string|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**night**  <br>*可选*|晚数  <br>**样例** : `0`|integer (int32)|
|**placeType**  <br>*可选*|1国内2国外  <br>**样例** : `0`|integer (int32)|
|**roomList**  <br>*可选*|房型信息  <br>**样例** : `[ "[hotelroomvo](#hotelroomvo)" ]`|< [HotelRoomVo](#hotelroomvo) > array|
|**startDateLabel**  <br>*可选*|入住时间，例如：05-18  <br>**样例** : `"string"`|string|
|**startDateWeekLabel**  <br>*可选*|入住时间，例如：周二  <br>**样例** : `"string"`|string|


<a name="productdetailticketitemvo"></a>
### ProductDetailTicketItemVo

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|使用日期yyyy-MM-dd  <br>**样例** : `"string"`|string|
|**dateLabel**  <br>*可选*|日期，例如：04-30使用  <br>**样例** : `"string"`|string|
|**need**  <br>*可选*|是否必选：1必选0非必选  <br>**样例** : `0`|integer (int32)|
|**pkgTicketId**  <br>*可选*|套餐门票id  <br>**样例** : `0`|integer (int32)|
|**pkgTicketName**  <br>*可选*|套餐门票名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|门票单价纯数字  <br>**样例** : `0.0`|number|
|**selectedNum**  <br>*可选*|门票选择数量  <br>**样例** : `0`|integer (int32)|


<a name="productdetailticketsvo"></a>
### ProductDetailTicketsVo

|名称|说明|类型|
|---|---|---|
|**ticketList**  <br>*可选*|门票信息  <br>**样例** : `[ "[productdetailticketitemvo](#productdetailticketitemvo)" ]`|< [ProductDetailTicketItemVo](#productdetailticketitemvo) > array|
|**ticketTitle**  <br>*可选*|门票标题  <br>**样例** : `"string"`|string|
|**topTitle**  <br>*可选*|模块标题  <br>**样例** : `"string"`|string|


<a name="productdetailvo"></a>
### ProductDetailVo

|名称|说明|类型|
|---|---|---|
|**adultNum**  <br>*可选*|酒套-选择的成人数量  <br>**样例** : `0`|integer (int32)|
|**applyInfoList**  <br>*可选*|线路-报名信息提醒  <br>**样例** : `[ "[productapplyinfovo](#productapplyinfovo)" ]`|< [ProductApplyInfoVO](#productapplyinfovo) > array|
|**bargainRemain**  <br>*可选*|砍价提醒(新)  <br>**样例** : `"[bargainremainvo](#bargainremainvo)"`|[BargainRemainVO](#bargainremainvo)|
|**batches_label**  <br>*可选*|固定字符串输出：线路-选择套餐类型/日期；酒套-选择套餐日期和人数：  <br>**样例** : `"string"`|string|
|**batches_list**  <br>*可选*|线路-批次列表  <br>**样例** : `[ "[productbatchesvo](#productbatchesvo)" ]`|< [ProductBatchesVo](#productbatchesvo) > array|
|**batches_url**  <br>*可选*|线路-定制url  <br>**样例** : `"string"`|string|
|**childAgeDescribe**  <br>*可选*|线路-儿童年龄适用  <br>**样例** : `"string"`|string|
|**childNum**  <br>*可选*|酒套-选择的儿童数量  <br>**样例** : `0`|integer (int32)|
|**comment**  <br>*可选*|最新评价  <br>**样例** : `"[productcommentvo](#productcommentvo)"`|[ProductCommentVo](#productcommentvo)|
|**commentListUrl**  <br>*可选*|酒套-评价列表h5url  <br>**样例** : `"string"`|string|
|**coupon**  <br>*可选*|线路-代金券  <br>**样例** : `"[productcouponvo](#productcouponvo)"`|[ProductCouponVo](#productcouponvo)|
|**dailyPkgList**  <br>*可选*|行程套餐列表  <br>**样例** : `[ "[dailypkgvo](#dailypkgvo)" ]`|< [DailyPkgVO](#dailypkgvo) > array|
|**dailypkgUrl**  <br>*可选*|下部分url  <br>**样例** : `"string"`|string|
|**dateList**  <br>*可选*|线路-日期列表  <br>**样例** : `[ "[productdatevo](#productdatevo)" ]`|< [ProductDateVO](#productdatevo) > array|
|**destAddress**  <br>*可选*|目的地经纬度信息  <br>**样例** : `"[destaddressvo](#destaddressvo)"`|[DestAddressVO](#destaddressvo)|
|**discount**  <br>*可选*|优惠信息  <br>**样例** : `[ "[productdiscountvo](#productdiscountvo)" ]`|< [ProductDiscountVo](#productdiscountvo) > array|
|**discountList**  <br>*可选*|线路-优惠信息（不包含完善资料）  <br>**样例** : `[ "[productdiscountvo](#productdiscountvo)" ]`|< [ProductDiscountVo](#productdiscountvo) > array|
|**discuss**  <br>*可选*|线路-最新咨询  <br>**样例** : `"[productdiscussvo](#productdiscussvo)"`|[ProductDiscussVo](#productdiscussvo)|
|**earlybird**  <br>*可选*|线路-早鸟特惠信息  <br>**样例** : `"[productearlybirdvo](#productearlybirdvo)"`|[ProductEarlybirdVo](#productearlybirdvo)|
|**fissionBottom**  <br>*可选*|裂变券底部显示  <br>**样例** : `"string"`|string|
|**fissionList**  <br>*可选*|裂变券集合(为空时说明不参与)  <br>**样例** : `[ "[couponsfissionvo](#couponsfissionvo)" ]`|< [CouponsFissionVO](#couponsfissionvo) > array|
|**fissionRule**  <br>*可选*|裂变券规则  <br>**样例** : `"string"`|string|
|**fissionRuleTitle**  <br>*可选*|裂变券规则标题  <br>**样例** : `"string"`|string|
|**hotel**  <br>*可选*|酒套-酒店信息  <br>**样例** : `"[productdetailhotelvo](#productdetailhotelvo)"`|[ProductDetailHotelVo](#productdetailhotelvo)|
|**is_over**  <br>*可选*|0:活动未结束 -1活动完全结束 -2活动已结束,但最后一批还未结束  <br>**样例** : `0`|integer (int32)|
|**is_sale**  <br>*可选*|线路-特价信息  <br>**样例** : `"[productsalevo](#productsalevo)"`|[ProductSaleVo](#productsalevo)|
|**jihedi_lines**  <br>*可选*|线路-集合地推荐  <br>**样例** : `"[productjihedivo](#productjihedivo)"`|[ProductJihediVo](#productjihedivo)|
|**latest_orders**  <br>*可选*|线路-参与过的  <br>**样例** : `"[productlatestvo](#productlatestvo)"`|[ProductLatestVo](#productlatestvo)|
|**loadTime**  <br>*可选*|下单的时候传过来  <br>**样例** : `"string"`|string|
|**nonEarlybirdList**  <br>*可选*|线路-早鸟特惠查询不适用批次数据  <br>**样例** : `[ "[productnonearlybirditemvo](#productnonearlybirditemvo)" ]`|< [ProductNonEarlybirdItemVo](#productnonearlybirditemvo) > array|
|**non_earlybird**  <br>*可选*|线路-早鸟特惠查询不适用批次html  <br>**样例** : `"string"`|string|
|**perfectDiscount**  <br>*可选*|首次完善资料提醒  <br>**样例** : `"[productdiscountvo](#productdiscountvo)"`|[ProductDiscountVo](#productdiscountvo)|
|**pkgList**  <br>*可选*|酒套-批次套餐  <br>**样例** : `[ "[productdetailpkgvo](#productdetailpkgvo)" ]`|< [ProductDetailPkgVo](#productdetailpkgvo) > array|
|**product**  <br>*可选*|产品  <br>**样例** : `"[productvo](#productvo)"`|[ProductVo](#productvo)|
|**productBargainShowVo**  <br>*可选*|线路-砍价  <br>**样例** : `"[productbargainshowvo](#productbargainshowvo)"`|[ProductBargainShowVo](#productbargainshowvo)|
|**productBargainVo**  <br>*可选*|线路-砍价（小程序使用）  <br>**样例** : `"[productbargainvo](#productbargainvo)"`|[ProductBargainVo](#productbargainvo)|
|**productCache**  <br>*可选*|预览缓存app用  <br>**样例** : `"[productjihedidatavo](#productjihedidatavo)"`|[ProductJihediDataVo](#productjihedidatavo)|
|**productCard**  <br>*可选*|权益卡相关  <br>**样例** : `"[productcardvo](#productcardvo)"`|[ProductCardVO](#productcardvo)|
|**productDiscounts**  <br>*可选*|线路-优惠  <br>**样例** : `"[productdiscountsvo](#productdiscountsvo)"`|[ProductDiscountsVO](#productdiscountsvo)|
|**productIPShow**  <br>*可选*|线路-IP系列  <br>**样例** : `"[productipshowvo](#productipshowvo)"`|[ProductIPShowVO](#productipshowvo)|
|**productMarketing**  <br>*可选*|线路-营销相关  <br>**样例** : `"[productmarketingvo](#productmarketingvo)"`|[ProductMarketingVO](#productmarketingvo)|
|**productMarketingV2**  <br>*可选*|线路-营销相关V2  <br>**样例** : `"[productmarketingv2vo](#productmarketingv2vo)"`|[ProductMarketingV2VO](#productmarketingv2vo)|
|**productOutdoorLevel**  <br>*可选*|线路-户外难度等级  <br>**样例** : `"[productoutdoorlevelvo](#productoutdoorlevelvo)"`|[ProductOutdoorLevelVo](#productoutdoorlevelvo)|
|**productServes**  <br>*可选*|线路-服务（新）  <br>**样例** : `"[productservevo](#productservevo)"`|[ProductServeVO](#productservevo)|
|**productVoucherVO**  <br>*可选*|线路券相关  <br>**样例** : `"[productvouchervo](#productvouchervo)"`|[ProductVoucherVO](#productvouchervo)|
|**recommend**  <br>*可选*|产品推荐信息/当地行程推荐  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**recommend_title**  <br>*可选*|推荐提示语  <br>**样例** : `"string"`|string|
|**remindMobile**  <br>*可选*|短信提醒手机号  <br>**样例** : `"string"`|string|
|**saleMsgTitle**  <br>*可选*|特惠提醒弹框文案  <br>**样例** : `"string"`|string|
|**saleRemind**  <br>*可选*|特惠是否设置了短信提醒:0没有 1有  <br>**样例** : `0`|integer (int32)|
|**saleStatusTitle**  <br>*可选*|特惠提醒状态文案  <br>**样例** : `"string"`|string|
|**serveList**  <br>*可选*|线路-服务  <br>**样例** : `[ "[productdiscountvo](#productdiscountvo)" ]`|< [ProductDiscountVo](#productdiscountvo) > array|
|**tickets**  <br>*可选*|酒套-套餐门票信息  <br>**样例** : `"[productdetailticketsvo](#productdetailticketsvo)"`|[ProductDetailTicketsVo](#productdetailticketsvo)|
|**type**  <br>*可选*|产品类型：1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**view_id**  <br>*可选*|线路-弃用  <br>**样例** : `0`|integer (int32)|
|**visaRecommend**  <br>*可选*|线路-签证推荐  <br>**样例** : `[ "[visabasevo](#visabasevo)" ]`|< [VisaBaseVO](#visabasevo) > array|


<a name="productdiscountvo"></a>
### ProductDiscountVo

|名称|说明|类型|
|---|---|---|
|**explain**  <br>*可选*|弹出框说明内容（可能是富文本）  <br>**样例** : `"string"`|string|
|**explainTitle**  <br>*可选*|弹出框说明title  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|handler  <br>**样例** : `"string"`|string|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**leftTitle**  <br>*可选*|左边标题  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|酒套中1确认方式2退款政策/线路中1立减2抵扣3早鸟/填写订单页面中1游侠币2砍价  <br>**样例** : `0`|integer (int32)|
|**typeValue**  <br>*可选*|酒套中1确认方式2退款政策的值  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|h5url  <br>**样例** : `"string"`|string|


<a name="productdiscountsvo"></a>
### ProductDiscountsVO

|名称|说明|类型|
|---|---|---|
|**explain**  <br>*可选*|弹出框说明内容（可能是富文本）  <br>**样例** : `"string"`|string|
|**infoList**  <br>*可选*|优惠信息简述  <br>**样例** : `[ "string" ]`|< string > array|
|**maxSale**  <br>*可选*|**样例** : `0.0`|number|


<a name="productdiscusscommentvo"></a>
### ProductDiscussCommentVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|咨询时间  <br>**样例** : `0`|integer (int64)|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**avatar**  <br>*可选*|咨询人头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**dis_id**  <br>*可选*|dis_id  <br>**样例** : `0`|integer (int32)|
|**sub**  <br>*可选*|回复信息  <br>**样例** : `[ "[productdiscusssubvo](#productdiscusssubvo)" ]`|< [ProductDiscussSubVo](#productdiscusssubvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|咨询人用户名  <br>**样例** : `"string"`|string|


<a name="productdiscusssubvo"></a>
### ProductDiscussSubVo

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|回复时间  <br>**样例** : `0`|integer (int64)|
|**content**  <br>*可选*|回复内容  <br>**样例** : `"string"`|string|
|**dis_id**  <br>*可选*|dis_id  <br>**样例** : `0`|integer (int32)|
|**reid**  <br>*可选*|reid  <br>**样例** : `0`|integer (int32)|
|**reuid**  <br>*可选*|回复用户id  <br>**样例** : `0`|integer (int32)|
|**reuname**  <br>*可选*|回复用户名  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**uname**  <br>*可选*|回复用户名  <br>**样例** : `"string"`|string|


<a name="productdiscussvo"></a>
### ProductDiscussVo

|名称|说明|类型|
|---|---|---|
|**answerNum**  <br>*可选*|回答数量  <br>**样例** : `0`|integer (int32)|
|**comment**  <br>*可选*|最新咨询  <br>**样例** : `"[productdiscusscommentvo](#productdiscusscommentvo)"`|[ProductDiscussCommentVo](#productdiscusscommentvo)|
|**commentList**  <br>*可选*|最新咨询列表  <br>**样例** : `[ "[productdiscusscommentvo](#productdiscusscommentvo)" ]`|< [ProductDiscussCommentVo](#productdiscusscommentvo) > array|
|**num**  <br>*可选*|咨询数量  <br>**样例** : `0`|integer (int32)|
|**sub**  <br>*可选*|最新咨询回复  <br>**样例** : `"[productdiscusssubvo](#productdiscusssubvo)"`|[ProductDiscussSubVo](#productdiscusssubvo)|


<a name="productearlybirdvo"></a>
### ProductEarlybirdVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|特惠信息语  <br>**样例** : `[ "string" ]`|< string > array|
|**maxAmountLabel**  <br>*可选*|**样例** : `"string"`|string|
|**timeLimitStr**  <br>*可选*|例如：活动时间：2020-04-01 00:00:00 - 2020-04-30 23:59:59  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|早鸟特惠提示语  <br>**样例** : `"string"`|string|


<a name="productevaluationdetailvo"></a>
### ProductEvaluationDetailVO

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评价时间  <br>**样例** : `0`|integer (int32)|
|**avatar**  <br>*可选*|评价人头像  <br>**样例** : `"string"`|string|
|**averageStar**  <br>*可选*|平均星级  <br>**样例** : `0.0`|number|
|**batchesTime**  <br>*可选*|批次时间  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评价内容  <br>**样例** : `"string"`|string|
|**editDeadline**  <br>*可选*|修改评价截止时间  <br>**样例** : `"string"`|string|
|**editTip**  <br>*可选*|例如：改为好评  <br>**样例** : `"string"`|string|
|**imgs**  <br>*可选*|评价图片  <br>**样例** : `[ "[imagevo](#imagevo)" ]`|< [ImageVO](#imagevo) > array|
|**isTalent**  <br>*可选*|是否加V  <br>**样例** : `true`|boolean|
|**pic**  <br>*可选*|线路封面图  <br>**样例** : `"string"`|string|
|**pkgname**  <br>*可选*|套餐名称  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**quality**  <br>*可选*|是否优质评价  <br>**样例** : `0`|integer (int32)|
|**reply**  <br>*可选*|回复内容  <br>**样例** : `"string"`|string|
|**stars**  <br>*可选*|评价星级  <br>**样例** : `[ "[hotelfavoritedetailstarvo](#hotelfavoritedetailstarvo)" ]`|< [HotelFavoriteDetailStarVo](#hotelfavoritedetailstarvo) > array|
|**startTime**  <br>*可选*|出行时间  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|评价人用户名  <br>**样例** : `"string"`|string|


<a name="productevaluationedittagvo"></a>
### ProductEvaluationEditTagVo

|名称|说明|类型|
|---|---|---|
|**canEdit**  <br>*可选*|是否可以修改  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|评价提示  <br>**样例** : `"string"`|string|
|**leader**  <br>*可选*|领队  <br>**样例** : `"[productleadervo](#productleadervo)"`|[ProductLeaderVo](#productleadervo)|
|**pdId**  <br>*可选*|pdId  <br>**样例** : `0`|integer (int32)|
|**selectedStar**  <br>*可选*|选中星级  <br>**样例** : `0`|integer (int32)|
|**stars**  <br>*可选*|评价星级  <br>**样例** : `[ "[evaluationstareditvo](#evaluationstareditvo)" ]`|< [EvaluationStarEditVO](#evaluationstareditvo) > array|
|**type**  <br>*可选*|标签类型：1领队2地接导游3行程4产品5酒店  <br>**样例** : `0`|integer (int32)|


<a name="productfeatureimagesvo"></a>
### ProductFeatureImagesVo

|名称|说明|类型|
|---|---|---|
|**img_description**  <br>*可选*|**样例** : `"string"`|string|
|**img_url**  <br>*可选*|**样例** : `"string"`|string|


<a name="productipshowvo"></a>
### ProductIPShowVO

|名称|说明|类型|
|---|---|---|
|**imgUrl**  <br>*可选*|图片链接  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转链接  <br>**样例** : `"string"`|string|


<a name="productimagesvo"></a>
### ProductImagesVo

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|目标链接类型  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|幻灯片  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|目标链接地址  <br>**样例** : `"string"`|string|


<a name="productitemmodel"></a>
### ProductItemModel

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**data**  <br>*可选*|**样例** : `[ "[appdataitemvo](#appdataitemvo)" ]`|< [AppDataItemVO](#appdataitemvo) > array|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**showSearch**  <br>*可选*|跳webview是否显示右上角搜索按钮  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="productjihedidatavo"></a>
### ProductJihediDataVo

|名称|说明|类型|
|---|---|---|
|**ageLabel**  <br>*可选*|亲子年龄  <br>**样例** : `"string"`|string|
|**brandTag**  <br>*可选*|品牌类标签（文字），例如：王牌线路、4钻产品  <br>**样例** : `[ "string" ]`|< string > array|
|**checking**  <br>*可选*|价格是否预报名  <br>**样例** : `0`|integer (int32)|
|**class_theme_id**  <br>*可选*|产品性质id（作废）  <br>**样例** : `0`|integer (int32)|
|**days**  <br>*可选*|活动天数  <br>**样例** : `"string"`|string|
|**firstBatchStatus**  <br>*可选*|最近一个批次的状态，可报名 或者 确定成行  <br>**样例** : `"string"`|string|
|**free**  <br>*可选*|产品是否免费，1免费0收费  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**isFree**  <br>*可选*|是否免费  <br>**样例** : `0`|integer (int32)|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**liangdianLabel**  <br>*可选*|亮点词展示，两个两点词中间逗号隔开  <br>**样例** : `"string"`|string|
|**linquan**  <br>*可选*|未设置  <br>**样例** : `"string"`|string|
|**listColor**  <br>*可选*|列表框营销颜色  <br>**样例** : `"string"`|string|
|**listColorV2**  <br>*可选*|列表框营销颜色v2，如果图片是v2的颜色也用v2  <br>**样例** : `"string"`|string|
|**listImgUrl**  <br>*可选*|列表页营销图片地址  <br>**样例** : `"string"`|string|
|**listImgUrlV2**  <br>*可选*|列表页营销图片地址V2，v2有值用v2，没有再用listImgUrl  <br>**样例** : `"string"`|string|
|**marketingIco**  <br>*可选*|营销标（新版）  <br>**样例** : `"string"`|string|
|**marketingList**  <br>*可选*|营销信息（新版），例如：1人：最高减￥100  <br>**样例** : `[ "string" ]`|< string > array|
|**marketingTag**  <br>*可选*|营销活动标签（图片链接），例如：618大促的图片链接  <br>**样例** : `"string"`|string|
|**marketingTagName**  <br>*可选*|营销活动标签（文字），例如：618大促  <br>**样例** : `"string"`|string|
|**maxPrice**  <br>*可选*|最大价格不带￥和起，可能出现免费和预报名  <br>**样例** : `"string"`|string|
|**outDoorLabel**  <br>*可选*|户外星级  <br>**样例** : `"string"`|string|
|**peopleCount**  <br>*可选*|当前报名人数，含马甲  <br>**样例** : `0`|integer (int32)|
|**peopleCountLabel**  <br>*可选*|当前报名人数，含马甲（上万的话会显示例如：1.1万）  <br>**样例** : `"string"`|string|
|**peopleCountLabelFull**  <br>*可选*|当前报名人数完整信息，含马甲（上万的话会显示例如：1.1万xxx），酒套显示：1.1万已售，线路显示：1.1万人已报名  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**price_label**  <br>*可选*|价格，可能出现免费和预报名  <br>**样例** : `"string"`|string|
|**pro_pic**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**productPreferentialList**  <br>*可选*|优惠信息  <br>**样例** : `[ "[productpreferentialvo](#productpreferentialvo)" ]`|< [ProductPreferentialVo](#productpreferentialvo) > array|
|**product_cat**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**product_type2**  <br>*可选*|产品类型二级  <br>**样例** : `"string"`|string|
|**psid**  <br>*可选*|psid  <br>**样例** : `0`|integer (int32)|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**showStatus**  <br>*可选*|产品上架状态，1-上架，其余-1/0为下架  <br>**样例** : `0`|integer (int32)|
|**simpleName**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**starttime**  <br>*可选*|产品未结束批次第一批出发时间  <br>**样例** : `"string"`|string (date-time)|
|**sub_name**  <br>*可选*|产品副标题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**thumbList**  <br>*可选*|封面列表  <br>**样例** : `[ "string" ]`|< string > array|
|**type**  <br>*可选*|产品类型：1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**type_or_cat**  <br>*可选*|类型或者性质，跟团游显示活动性质，其他显示活动类型  <br>**样例** : `"string"`|string|
|**typetwoOrCat**  <br>*可选*|二级活动类型/活动性质，跟团游显示活动性质，如深度游；当地玩乐、自由行、邮轮显示二级活动类型；分享会不显示；  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|
|**weight**  <br>*可选*|产品排序权重  <br>**样例** : `0.0`|number (double)|


<a name="productjihedivo"></a>
### ProductJihediVo

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|产品线路  <br>**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**title**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|


<a name="productlatestvo"></a>
### ProductLatestVo

|名称|说明|类型|
|---|---|---|
|**psid_cnt**  <br>*可选*|参与过的人数（包含标准库数量）  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|参与过的html指向url  <br>**样例** : `"string"`|string|
|**users**  <br>*可选*|活动最近报名的5个人  <br>**样例** : `[ "string" ]`|< string > array|


<a name="productleadervo"></a>
### ProductLeaderVo

|名称|说明|类型|
|---|---|---|
|**lid**  <br>*可选*|lid  <br>**样例** : `0`|integer (int32)|
|**lname**  <br>*可选*|领队名称  <br>**样例** : `"string"`|string|


<a name="productline"></a>
### ProductLine

|名称|说明|类型|
|---|---|---|
|**products**  <br>*可选*|产品  <br>**样例** : `[ "[indexflowitemvo](#indexflowitemvo)" ]`|< [IndexFlowItemVo](#indexflowitemvo) > array|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|


<a name="productmarketingv2vo"></a>
### ProductMarketingV2VO

|名称|说明|类型|
|---|---|---|
|**backgroundImage**  <br>*可选*|头部营销背景图url  <br>**样例** : `"string"`|string|
|**distanceOvertime**  <br>*可选*|距结束多少秒  <br>**样例** : `0`|integer (int64)|
|**distanceStarttime**  <br>*可选*|距开始多少秒  <br>**样例** : `0`|integer (int64)|
|**leftTip**  <br>*可选*|tipUrl不为空时展示，例如：此产品正在参与618特惠，尽快报名  <br>**样例** : `"string"`|string|
|**logoImage**  <br>*可选*|营销logo  <br>**样例** : `"string"`|string|
|**overtime**  <br>*可选*|大促结束时间戳  <br>**样例** : `0`|integer (int64)|
|**priceStyle**  <br>*可选*|价格样式1只显示图片上优惠后价格2显示图片上优惠后价格且下面原价也显示3显示图片上优惠后价格且旁边显示划线原价  <br>**样例** : `0`|integer (int32)|
|**priceTip**  <br>*可选*|空不显示，例如：预计到手价  <br>**样例** : `"string"`|string|
|**rightTip**  <br>*可选*|tipUrl不为空时展示，例如：主会场  <br>**样例** : `"string"`|string|
|**saleAdultAmount**  <br>*可选*|优惠后成人价格  <br>**样例** : `"string"`|string|
|**saleChildAmount**  <br>*可选*|优惠后儿童价格  <br>**样例** : `"string"`|string|
|**saleInfoList**  <br>*可选*|优惠信息  <br>**样例** : `[ "[productsaleshowvo](#productsaleshowvo)" ]`|< [ProductSaleShowVO](#productsaleshowvo) > array|
|**servertime**  <br>*可选*|服务器时间戳  <br>**样例** : `0`|integer (int64)|
|**starttime**  <br>*可选*|大促开始时间戳  <br>**样例** : `0`|integer (int64)|
|**styleType**  <br>*可选*|营销文案样式类型，1无任何优惠2只有砍价3横向展示4有加号形式数组第一个为最高减  <br>**样例** : `0`|integer (int32)|
|**tipBackground**  <br>*可选*|tip的背景图  <br>**样例** : `"string"`|string|
|**tipUrl**  <br>*可选*|主会场跳转url  <br>**样例** : `"string"`|string|


<a name="productmarketingvo"></a>
### ProductMarketingVO

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|成人价，无￥和起  <br>**样例** : `"string"`|string|
|**backgroundImage**  <br>*可选*|营销背景图url  <br>**样例** : `"string"`|string|
|**childprice**  <br>*可选*|儿童价，无￥和起  <br>**样例** : `"string"`|string|
|**explain**  <br>*可选*|弹出框说明内容（可能是富文本）  <br>**样例** : `"string"`|string|
|**leftTip**  <br>*可选*|tipUrl不为空时展示，例如：此产品正在参与618特惠，尽快报名  <br>**样例** : `"string"`|string|
|**maxReduceAmount**  <br>*可选*|最高减的金额，例如：￥2000  <br>**样例** : `"string"`|string|
|**rightTip**  <br>*可选*|tipUrl不为空时展示，例如：主会场  <br>**样例** : `"string"`|string|
|**tipUrl**  <br>*可选*|主会场跳转url  <br>**样例** : `"string"`|string|


<a name="productnonearlybirditemvo"></a>
### ProductNonEarlybirdItemVo

|名称|说明|类型|
|---|---|---|
|**overtime**  <br>*可选*|**样例** : `"string"`|string|
|**pkgname**  <br>*可选*|**样例** : `"string"`|string|
|**starttime**  <br>*可选*|**样例** : `"string"`|string|


<a name="productorderdetailrecommendvo"></a>
### ProductOrderDetailRecommendVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|数据  <br>**样例** : `[ "[dataitemvo](#dataitemvo)" ]`|< [DataItemVo](#dataitemvo) > array|
|**productList**  <br>*可选*|目的地产品转化为瀑布流通用model（非集市）  <br>**样例** : `[ "[indexflowitemvo](#indexflowitemvo)" ]`|< [IndexFlowItemVo](#indexflowitemvo) > array|
|**recommendTags**  <br>*可选*|标签列表，type为0时返回  <br>**样例** : `[ "[ordersrecommendtagsvo](#ordersrecommendtagsvo)" ]`|< [OrdersRecommendTagsVo](#ordersrecommendtagsvo) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="productoutdoorlevelvo"></a>
### ProductOutdoorLevelVo

|名称|说明|类型|
|---|---|---|
|**hollowStar**  <br>*可选*|空心星星数量  <br>**样例** : `0`|integer (int32)|
|**leftTitle**  <br>*可选*|例如：难度星级：  <br>**样例** : `"string"`|string|
|**levelTip**  <br>*可选*|例如：挑战级难度  <br>**样例** : `"string"`|string|
|**popupContent**  <br>*可选*|弹出框内容  <br>**样例** : `"string"`|string|
|**popupTitle**  <br>*可选*|弹出框标题，例如：星级说明  <br>**样例** : `"string"`|string|
|**solidStar**  <br>*可选*|实心星星数量  <br>**样例** : `0`|integer (int32)|


<a name="productpreferentialvo"></a>
### ProductPreferentialVo

|名称|说明|类型|
|---|---|---|
|**couponAmount**  <br>*可选*|代金券金额  <br>**样例** : `0.0`|number|
|**detailRemark**  <br>*可选*|详细优惠信息，例如：最高砍200  <br>**样例** : `"string"`|string|
|**shortRemark**  <br>*可选*|简略优惠信息，例如：砍价  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|优惠类型1、早鸟优惠 2、满减优惠 3、领卷优惠 4、下单送券 5、限时特惠 6、砍价优惠  <br>**样例** : `0`|integer (int32)|


<a name="productqiyuvo"></a>
### ProductQiyuVo

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**groupid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="productrecomendresponsevo"></a>
### ProductRecomendResponseVO

|名称|说明|类型|
|---|---|---|
|**adultprice**  <br>*可选*|成人价格  <br>**样例** : `0.0`|number|
|**class_theme_id**  <br>*可选*|主题  <br>**样例** : `0`|integer (int32)|
|**days_label**  <br>*可选*|活动几天几夜  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|出发地或者集合地  <br>**样例** : `"string"`|string|
|**price_label**  <br>*可选*|价格标签  <br>**样例** : `"string"`|string|
|**product_cat**  <br>*可选*|如：深度游  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**product_type**  <br>*可选*|类型 如 跟团游  <br>**样例** : `"string"`|string|
|**shortTitle**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|**样例** : `"string"`|string|
|**sub_name**  <br>*可选*|副表题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="productrecommendvo"></a>
### ProductRecommendVo

|名称|说明|类型|
|---|---|---|
|**days**  <br>*可选*|线路天数  <br>**样例** : `"string"`|string|
|**img**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|线路产品id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|线路产品目的地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|商品价格label  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|类型  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|**样例** : `"string"`|string|


<a name="productsaleshowvo"></a>
### ProductSaleShowVO

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|文案：￥200  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tip**  <br>*可选*|文案：最高减/1人：最高减  <br>**样例** : `"string"`|string|


<a name="productsalevo"></a>
### ProductSaleVo

|名称|说明|类型|
|---|---|---|
|**adultAmount**  <br>*可选*|成人立减  <br>**样例** : `0.0`|number|
|**adult_num**  <br>*可选*|成人限购数量  <br>**样例** : `0`|integer (int32)|
|**canApply**  <br>*可选*|特惠未开始时是否可以正常原价报名1可以  <br>**样例** : `0`|integer (int32)|
|**childAmount**  <br>*可选*|儿童立减  <br>**样例** : `0.0`|number|
|**child_num**  <br>*可选*|儿童限购数量  <br>**样例** : `0`|integer (int32)|
|**foreshow**  <br>*可选*|特惠未开始前是否以预告形式展示  <br>**样例** : `0`|integer (int32)|
|**joinType**  <br>*可选*|类型：参与方式 1仅限APP，其他端按原价 2所有移动端都可报名  <br>**样例** : `0`|integer (int32)|
|**overtime**  <br>*可选*|距离结束时间多少秒  <br>**样例** : `0`|integer (int64)|
|**price**  <br>*可选*|优惠后成人价格  <br>**样例** : `"string"`|string|
|**price_child**  <br>*可选*|优惠后儿童价  <br>**样例** : `"string"`|string|
|**saleInfo**  <br>*可选*|立减文案，例如：成人立减 ￥100  <br>**样例** : `"string"`|string|
|**saleOvertime**  <br>*可选*|特惠结束时间戳  <br>**样例** : `0`|integer (int64)|
|**saleStarttime**  <br>*可选*|特惠开始时间戳  <br>**样例** : `0`|integer (int64)|
|**starttime**  <br>*可选*|距离开始时间多少秒  <br>**样例** : `0`|integer (int64)|
|**status**  <br>*可选*|特惠状态（弃用）  <br>**样例** : `0`|integer (int32)|
|**tip**  <br>*可选*|例如：特惠活动一个ID限报名3成人3儿童，仅限新用户  <br>**样例** : `"string"`|string|
|**userTip**  <br>*可选*|为空不显示，文案，例如：首单专享  <br>**样例** : `"string"`|string|
|**userType**  <br>*可选*|类型：0、无限制；1、仅限新用户  <br>**样例** : `0`|integer (int32)|


<a name="productsearchmddrespvo"></a>
### ProductSearchMddRespVo

|名称|说明|类型|
|---|---|---|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**targetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|
|**wantedNum**  <br>*可选*|种草人数  <br>**样例** : `"string"`|string|


<a name="productservevo"></a>
### ProductServeVO

|名称|说明|类型|
|---|---|---|
|**explain**  <br>*可选*|弹出框说明内容（可能是富文本）  <br>**样例** : `"string"`|string|
|**infoList**  <br>*可选*|服务信息简述  <br>**样例** : `[ "string" ]`|< string > array|
|**serviceUrl**  <br>*可选*|h5链接  <br>**样例** : `"string"`|string|


<a name="producttagsvo"></a>
### ProductTagsVo

|名称|说明|类型|
|---|---|---|
|**img_url**  <br>*可选*|标签图标  <br>**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|tag_id  <br>**样例** : `0`|integer (int32)|
|**tag_name**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|


<a name="producttypecount"></a>
### ProductTypeCount

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|数量  <br>**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int64)|


<a name="productvo"></a>
### ProductVO

|名称|说明|类型|
|---|---|---|
|**dayAndNights**  <br>*可选*|几天几夜  <br>**样例** : `"string"`|string|
|**days**  <br>*可选*|天数  <br>**样例** : `"string"`|string|
|**minpric**  <br>*可选*|线路最低价  <br>**样例** : `"string"`|string|
|**nights**  <br>*可选*|夜数  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|线路id  <br>**样例** : `0`|integer (int32)|
|**place_label**  <br>*可选*|线路标签  <br>**样例** : `"string"`|string|
|**pro_pic**  <br>*可选*|线路图片地址  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计标识  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|线路标题  <br>**样例** : `"string"`|string|


<a name="productvobean"></a>
### ProductVOBean

|名称|说明|类型|
|---|---|---|
|**days**  <br>*可选*|天数  <br>**样例** : `0`|integer (int32)|
|**duration**  <br>*可选*|活动持续时间  <br>**样例** : `"string"`|string|
|**minpric**  <br>*可选*|最低价  <br>**样例** : `"string"`|string|
|**nights**  <br>*可选*|夜数  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|产品id  <br>**样例** : `"string"`|string|
|**place_label**  <br>*可选*|产品标签  <br>**样例** : `"string"`|string|
|**pro_pic**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型：1：线路；2：酒套  <br>**样例** : `0`|integer (int32)|


<a name="productvo_1"></a>
### ProductVO_1

|名称|说明|类型|
|---|---|---|
|**batchesTime**  <br>*可选*|批次时间  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|线路名称  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|线路封面图  <br>**样例** : `"string"`|string|


<a name="productvo_2"></a>
### ProductVO_2

|名称|说明|类型|
|---|---|---|
|**batchesTime**  <br>*可选*|批次时间  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|线路名称  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|线路封面图  <br>**样例** : `"string"`|string|


<a name="productvo"></a>
### ProductVo

|名称|说明|类型|
|---|---|---|
|**aboard_point**  <br>*可选*|固定字符串：出行日期  <br>**样例** : `"string"`|string|
|**adultprice**  <br>*可选*|线路-成人价，带￥和起，可能出现核算中、免费，为空表示没有价格  <br>**样例** : `"string"`|string|
|**brandTag**  <br>*可选*|品牌类标签（文字）  <br>**样例** : `"string"`|string|
|**childprice**  <br>*可选*|线路-儿童价，带￥和起，可能出现核算中、免费，为空表示没有价格  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|市  <br>**样例** : `"string"`|string|
|**closeShare**  <br>*可选*|关闭分享，1关闭  <br>**样例** : `0`|integer (int32)|
|**companyName**  <br>*可选*|商家信息  <br>**样例** : `"string"`|string|
|**companyUrl**  <br>*可选*|商家资质url  <br>**样例** : `"string"`|string|
|**dailyAdultPrice**  <br>*可选*|线路-日常成人价  <br>**样例** : `"string"`|string|
|**dailyChildPrice**  <br>*可选*|线路-日常儿童价  <br>**样例** : `"string"`|string|
|**days**  <br>*可选*|活动天数  <br>**样例** : `0`|integer (int32)|
|**daysLabel**  <br>*可选*|几天几晚显示  <br>**样例** : `"string"`|string|
|**detailColor**  <br>*可选*|详情框营销颜色  <br>**样例** : `"string"`|string|
|**detailImgUrl**  <br>*可选*|详情页营销图片地址  <br>**样例** : `"string"`|string|
|**favorite**  <br>*可选*|是否收藏：yes或者no  <br>**样例** : `"string"`|string|
|**flash_pic**  <br>*可选*|幻灯片  <br>**样例** : `[ "string" ]`|< string > array|
|**html_details**  <br>*可选*|多行程html  <br>**样例** : `"string"`|string|
|**imagesDetail**  <br>*可选*|顶部图片查看详情  <br>**样例** : `[ "[productfeatureimagesvo](#productfeatureimagesvo)" ]`|< [ProductFeatureImagesVo](#productfeatureimagesvo) > array|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**lineQrcodeUrl**  <br>*可选*|群二维码链接，有就显示进群  <br>**样例** : `"string"`|string|
|**lowPriceTip**  <br>*可选*|线路-起价说明（富文本）  <br>**样例** : `"string"`|string|
|**marketingTag**  <br>*可选*|营销活动标签（图片链接）  <br>**样例** : `"string"`|string|
|**minPrice**  <br>*可选*|最小价格数字  <br>**样例** : `0.0`|number|
|**minPriceLabel**  <br>*可选*|最小价格字符串  <br>**样例** : `"string"`|string|
|**minPriceTip**  <br>*可选*|酒套-起价说明  <br>**样例** : `[ "string" ]`|< string > array|
|**minPriceTitle**  <br>*可选*|标题：起价说明  <br>**样例** : `"string"`|string|
|**mini_app_cover**  <br>*可选*|分享封面  <br>**样例** : `"string"`|string|
|**mini_app_id**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**mini_app_url**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|
|**nights**  <br>*可选*|活动夜数  <br>**样例** : `0`|integer (int32)|
|**online_service_id**  <br>*可选*|在线客服  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**product_cate_type**  <br>*可选*|产品主题  <br>**样例** : `[ "string" ]`|< string > array|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**province**  <br>*可选*|省  <br>**样例** : `"string"`|string|
|**qiyu**  <br>*可选*|其他信息  <br>**样例** : `"[productqiyuvo](#productqiyuvo)"`|[ProductQiyuVo](#productqiyuvo)|
|**registrationPolicy**  <br>*可选*|报名说明  <br>**样例** : `"string"`|string|
|**sellNum**  <br>*可选*|已售数量如：1.4万  <br>**样例** : `"string"`|string|
|**serial_id**  <br>*可选*|产品编号  <br>**样例** : `0`|integer (int32)|
|**shareOtherPareams**  <br>*可选*|用于分享链接后面拼接参数，key类别：fzlj（复制链接）、wxhy（微信好友）、wxpyq（微信朋友圈）、qq（QQ）、qqkj（QQ空间）、xlwb（新浪微博）、zjlxr（最近联系人，内部跳转特殊处理）  <br>**样例** : `{<br>  "string" : "string"<br>}`|< string, string > map|
|**share_cover**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**sitecode**  <br>*可选*|所属分站  <br>**样例** : `0`|integer (int32)|
|**sub_name**  <br>*可选*|产品副标题  <br>**样例** : `"string"`|string|
|**topVideo**  <br>*可选*|头部视频  <br>**样例** : `"string"`|string|
|**url_string**  <br>*可选*|产品web端url  <br>**样例** : `"string"`|string|
|**yxbTip**  <br>*可选*|为空不显示，例如：下单送258游侠币  <br>**样例** : `"string"`|string|


<a name="productvouchervo"></a>
### ProductVoucherVO

|名称|说明|类型|
|---|---|---|
|**bottomBtnLabel**  <br>*可选*|底部按钮文案，例如：屯券  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|文案,当前产品可以参加购买预售券活动  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|按钮跳转链接  <br>**样例** : `"string"`|string|


<a name="productsrecommend"></a>
### ProductsRecommend

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格  <br>**样例** : `"string"`|string|
|**productId**  <br>*可选*|线路id  <br>**样例** : `0`|integer (int32)|
|**productName**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**startPlace**  <br>*可选*|出发地  <br>**样例** : `"string"`|string|


<a name="projectbean"></a>
### ProjectBean

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**project_id**  <br>*可选*|专题id  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="qiniu"></a>
### Qiniu

|名称|说明|类型|
|---|---|---|
|**src**  <br>*可选*|七牛地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|七牛标题  <br>**样例** : `"string"`|string|


<a name="qiniuprivatevo"></a>
### QiniuPrivateVo

|名称|说明|类型|
|---|---|---|
|**domain**  <br>*可选*|域名  <br>**样例** : `"string"`|string|
|**path**  <br>*可选*|上传路径  <br>**样例** : `"string"`|string|
|**token**  <br>*可选*|七牛token  <br>**样例** : `"string"`|string|


<a name="qiyubean"></a>
### QiyuBean

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**groupid**  <br>*可选*|**样例** : `"string"`|string|


<a name="qiyumodel"></a>
### QiyuModel

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|data  <br>**样例** : `"string"`|string|
|**groupId**  <br>*可选*|groupId  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|链接地址  <br>**样例** : `"string"`|string|


<a name="raiseduobaovo"></a>
### RaiseDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**endTime**  <br>*可选*|下注截止时间  <br>**样例** : `0`|integer (int64)|
|**join**  <br>*可选*|是否参与  true为已参与  <br>**样例** : `true`|boolean|
|**joinNum**  <br>*可选*|参与人数  <br>**样例** : `0`|integer (int32)|
|**needCredit**  <br>*可选*|需要消耗的积分  <br>**样例** : `0`|integer (int32)|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**openTime**  <br>*可选*|开奖时间  <br>**样例** : `0`|integer (int64)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**shouZhuFree**  <br>*可选*|是否首注免费  <br>**样例** : `true`|boolean|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|


<a name="recentduobaovo"></a>
### RecentDuobaoVO

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝活动id  <br>**样例** : `0`|integer (int32)|
|**duobaoTitle**  <br>*可选*|夺宝活动标题  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|期数  <br>**样例** : `0`|integer (int32)|
|**openTime**  <br>*可选*|开奖时间  <br>**样例** : `0`|integer (int64)|
|**placeIssued**  <br>*可选*|夺宝活动出发地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价值  <br>**样例** : `0.0`|number|
|**rewardUsers**  <br>*可选*|获奖用户  <br>**样例** : `[ "[rewarduser](#rewarduser)" ]`|< [RewardUser](#rewarduser) > array|
|**snakes**  <br>*可选*|已投注数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1筹集中  2 待开奖 3已开奖  4 筹集失败  <br>**样例** : `0`|integer (int32)|
|**winStakes**  <br>*可选*|中奖名额  <br>**样例** : `0`|integer (int32)|


<a name="recomalbumsvo"></a>
### RecomAlbumsVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|推荐列表名称  <br>**样例** : `0`|integer (int32)|
|**copyright**  <br>*可选*|推荐  <br>**样例** : `"[copyright](#copyright)"`|[Copyright](#copyright)|
|**copyrightInt**  <br>*可选*|版权id  <br>**样例** : `0`|integer (int32)|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否可选择  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|作品名称  <br>**样例** : `"string"`|string|


<a name="recomendmore"></a>
### RecomendMore

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|摄影作品推荐列表  <br>**样例** : `[ "[recomalbumsvo](#recomalbumsvo)" ]`|< [RecomAlbumsVO](#recomalbumsvo) > array|
|**themeName**  <br>*可选*|推荐列表名称  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="recommendmastervo"></a>
### RecommendMasterVO

|名称|说明|类型|
|---|---|---|
|**albumVOS**  <br>*可选*|摄影作品  <br>**样例** : `[ "[masteralbumvo](#masteralbumvo)" ]`|< [MasterAlbumVO](#masteralbumvo) > array|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**certBeans**  <br>*可选*|认证标识  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|
|**fanCount**  <br>*可选*|粉丝数  <br>**样例** : `0`|integer (int32)|
|**followCount**  <br>*可选*|关注数  <br>**样例** : `0`|integer (int32)|
|**intro**  <br>*可选*|简介  <br>**样例** : `"string"`|string|
|**isFollow**  <br>*可选*|是否关注  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|名称  <br>**样例** : `"string"`|string|


<a name="recommendmastervo_1"></a>
### RecommendMasterVO_1

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**block_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**block_sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**blockname**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**leader_sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**nick**  <br>*可选*|**样例** : `"string"`|string|
|**relation**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**uname**  <br>*可选*|**样例** : `"string"`|string|
|**upic**  <br>*可选*|**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|


<a name="recommendmodule"></a>
### RecommendModule

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|模块数据  <br>**样例** : `[ "object" ]`|< object > array|
|**name**  <br>*可选*|模块名  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|模块类型  <br>**样例** : `0`|integer (int32)|


<a name="recommendproductvo"></a>
### RecommendProductVO

|名称|说明|类型|
|---|---|---|
|**days**  <br>*可选*|活动天数  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**index**  <br>*可选*|索引值  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**priceLabel**  <br>*可选*|价格，可能出行免费和核算中  <br>**样例** : `"string"`|string|
|**productCat**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**simpleName**  <br>*可选*|短标题  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|**样例** : `"string"`|string|
|**subName**  <br>*可选*|产品副标题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|


<a name="refunddesc"></a>
### RefundDesc

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|**样例** : `"string"`|string|


<a name="regvo"></a>
### RegVO

|名称|说明|类型|
|---|---|---|
|**reged**  <br>*可选*|**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="reginentity"></a>
### ReginEntity

|名称|说明|类型|
|---|---|---|
|**class_region_id**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|更多按钮协议  <br>**样例** : `"string"`|string|
|**items**  <br>*可选*|**样例** : `[ "[tagitementity](#tagitementity)" ]`|< [TagItemEntity](#tagitementity) > array|
|**mcurTagPosition**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|更多按钮协议  <br>**样例** : `"string"`|string|


<a name="regionvo"></a>
### RegionVO

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**value**  <br>*可选*|区号  <br>**样例** : `0`|integer (int32)|


<a name="resultcompetition"></a>
### ResultCompetition

|名称|说明|类型|
|---|---|---|
|**competitions**  <br>*可选*|比赛列表  <br>**样例** : `[ "[competition](#competition)" ]`|< [Competition](#competition) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="rewarddetailvo"></a>
### RewardDetailVO

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|奖励内容  <br>**样例** : `[ "[c35401ca6ac4034af0ed24e16e092a9a](#c35401ca6ac4034af0ed24e16e092a9a)" ]`|< [奖励内容](#c35401ca6ac4034af0ed24e16e092a9a) > array|
|**finishNum**  <br>*可选*|已完成个数  <br>**样例** : `0`|integer (int32)|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**isComplete**  <br>*可选*|是否完成  <br>**样例** : `true`|boolean|
|**num**  <br>*可选*|总数量  <br>**样例** : `0`|integer (int32)|
|**rewardName**  <br>*可选*|任务名  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转链接  <br>**样例** : `"string"`|string|


<a name="rewardsetvo"></a>
### RewardSetVO

|名称|说明|类型|
|---|---|---|
|**excelTotal**  <br>*可选*|经验总数  <br>**样例** : `0`|integer (int32)|
|**goldTotal**  <br>*可选*|游侠币总数  <br>**样例** : `0`|integer (int32)|
|**integralTotal**  <br>*可选*|积分总数  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|类别名  <br>**样例** : `"string"`|string|
|**rewards**  <br>*可选*|任务  <br>**样例** : `[ "[rewarddetailvo](#rewarddetailvo)" ]`|< [RewardDetailVO](#rewarddetailvo) > array|


<a name="rewardtasklistvo"></a>
### RewardTaskListVO

|名称|说明|类型|
|---|---|---|
|**getedIntegral**  <br>*可选*|今日已赚  <br>**样例** : `0`|integer (int32)|
|**integralTotal**  <br>*可选*|今日最高可赚  <br>**样例** : `0`|integer (int32)|
|**rewards**  <br>*可选*|任务  <br>**样例** : `[ "[rewardsetvo](#rewardsetvo)" ]`|< [RewardSetVO](#rewardsetvo) > array|


<a name="rewarduser"></a>
### RewardUser

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|中奖者用户头像  <br>**样例** : `"string"`|string|
|**openTime**  <br>*可选*|中奖时间  <br>**样例** : `0`|integer (int64)|
|**username**  <br>*可选*|中奖者用户名  <br>**样例** : `"string"`|string|


<a name="ronghistoryvo"></a>
### RongHistoryVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[rongmessage](#rongmessage)" ]`|< [RongMessage](#rongmessage) > array|
|**pageNumber**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**unread_count**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="rongmessage"></a>
### RongMessage

|名称|说明|类型|
|---|---|---|
|**channelType**  <br>*可选*|**样例** : `"string"`|string|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**fromUserId**  <br>*可选*|**样例** : `"string"`|string|
|**groupUserIds**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**msgTimestamp**  <br>*可选*|**样例** : `"string"`|string|
|**msgUID**  <br>*可选*|**样例** : `"string"`|string|
|**objectName**  <br>*可选*|**样例** : `"string"`|string|
|**sensitiveType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**source**  <br>*可选*|**样例** : `"string"`|string|
|**toUserId**  <br>*可选*|**样例** : `"string"`|string|


<a name="rpcommentlistvo"></a>
### RpCommentListVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|评论列表  <br>**样例** : `[ "[visacommentvo](#visacommentvo)" ]`|< [VisaCommentVO](#visacommentvo) > array|
|**num**  <br>*可选*|总数目  <br>**样例** : `0`|integer (int32)|
|**pagesize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**product_name**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**totalpage**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="rphtmlvo"></a>
### RpHtmlVO

|名称|说明|类型|
|---|---|---|
|**url**  <br>*可选*|链接  <br>**样例** : `"string"`|string|


<a name="rpmembervo"></a>
### RpMemberVO

|名称|说明|类型|
|---|---|---|
|**isSuccess**  <br>*可选*|是否成功 0失败 1成功  <br>**样例** : `0`|integer (int32)|
|**message**  <br>*可选*|恢复消息  <br>**样例** : `"string"`|string|


<a name="rpvisafavoritestatusvo"></a>
### RpVisaFavoriteStatusVO

|名称|说明|类型|
|---|---|---|
|**isFavorite**  <br>*可选*|是否收藏 false未收藏 true已收藏  <br>**样例** : `true`|boolean|


<a name="rqmembervo"></a>
### RqMemberVO

|名称|说明|类型|
|---|---|---|
|**birth**  <br>*可选*|出生年月日  <br>**样例** : `0`|integer (int64)|
|**cardexp**  <br>*可选*|护照有效期  <br>**样例** : `0`|integer (int64)|
|**cardno**  <br>*可选*|护照号码  <br>**样例** : `"string"`|string|
|**mid**  <br>*可选*|编号 新增时为空  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**passportCid**  <br>*可选*|护照签发地  <br>**样例** : `0`|integer (int32)|
|**sex**  <br>*可选*|性别 1、男，2、女  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|常用联系人类型：1、成人，2、儿童  <br>**样例** : `0`|integer (int32)|


<a name="salebean"></a>
### SaleBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|特惠金额  <br>**样例** : `0.0`|number|
|**appSpecial**  <br>*可选*|是否app专享  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|文案：特惠立减  <br>**样例** : `"string"`|string|
|**firstSpecial**  <br>*可选*|是否首单专享  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|说明文案  <br>**样例** : `[ "string" ]`|< string > array|
|**saleId**  <br>*可选*|特惠id  <br>**样例** : `0`|integer (int32)|
|**saleSn**  <br>*可选*|特惠是否是快照（修改订单使用）  <br>**样例** : `0`|integer (int32)|
|**unusable**  <br>*可选*|是否不可用，1不可用  <br>**样例** : `0`|integer (int32)|


<a name="saleentity"></a>
### SaleEntity

|名称|说明|类型|
|---|---|---|
|**free**  <br>*可选*|**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|**样例** : `"string"`|string|
|**orig_price**  <br>*可选*|**样例** : `0.0`|number|
|**orig_price_child**  <br>*可选*|**样例** : `0.0`|number|
|**overtime**  <br>*可选*|**样例** : `0`|integer (int64)|
|**pid**  <br>*可选*|**样例** : `0`|integer (int64)|
|**place_label**  <br>*可选*|**样例** : `"string"`|string|
|**pname**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `0.0`|number|
|**starttime**  <br>*可选*|**样例** : `0`|integer (int64)|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**stock**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="saleinfobean"></a>
### SaleInfoBean

|名称|说明|类型|
|---|---|---|
|**card**  <br>*可选*|权益卡信息  <br>**样例** : `"[cardbean](#cardbean)"`|[CardBean](#cardbean)|
|**change_label**  <br>*可选*|如果优惠有变化提示，例如：您的优惠发生了变化  <br>**样例** : `"string"`|string|
|**coupon**  <br>*可选*|优惠券信息  <br>**样例** : `"[couponbean](#couponbean)"`|[CouponBean](#couponbean)|
|**couponShow**  <br>*可选*|是否显示优惠券，1是0否  <br>**样例** : `0`|integer (int32)|
|**couponStatus**  <br>*可选*|优惠券使用信息 1:暂无可用  <br>**样例** : `0`|integer (int32)|
|**couponStatuslabel**  <br>*可选*|优惠券使用信息显示  <br>**样例** : `"string"`|string|
|**discount**  <br>*可选*|满减信息  <br>**样例** : `"[discountbean](#discountbean)"`|[DiscountBean](#discountbean)|
|**earlybird**  <br>*可选*|早鸟信息  <br>**样例** : `"[earlybirdbean](#earlybirdbean)"`|[EarlybirdBean](#earlybirdbean)|
|**sale**  <br>*可选*|特惠信息  <br>**样例** : `"[salebean](#salebean)"`|[SaleBean](#salebean)|
|**type**  <br>*可选*|选中的优惠：1:早鸟  2 满减  3 优惠券  <br>**样例** : `0`|integer (int32)|
|**voucherBean**  <br>*可选*|预售券抵扣信息  <br>**样例** : `"[voucherbean](#voucherbean)"`|[VoucherBean](#voucherbean)|


<a name="samelinefriendvo"></a>
### SameLineFriendVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**city**  <br>*可选*|出生城市  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**lineList**  <br>*可选*|线路详情  <br>**样例** : `[ "[lineinfo](#lineinfo)" ]`|< [LineInfo](#lineinfo) > array|
|**linesCount**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|出生省份  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真是姓名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|用户关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagsitemvo](#tagsitemvo)" ]`|< [TagsItemVO](#tagsitemvo) > array|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|身份标签  <br>**样例** : `[ "[certificationvo](#certificationvo)" ]`|< [CertificationVO](#certificationvo) > array|


<a name="savevo"></a>
### SaveVO

|名称|说明|类型|
|---|---|---|
|**oid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**priceInfo**  <br>*可选*|价格变动信息  <br>**样例** : `"string"`|string|


<a name="searchfrontvo"></a>
### SearchFrontVo

|名称|说明|类型|
|---|---|---|
|**hotSerach**  <br>*可选*|热搜排行  <br>**样例** : `[ "[searchrecommend](#searchrecommend)" ]`|< [SearchRecommend](#searchrecommend) > array|
|**pageSize**  <br>*可选*|分页数量  <br>**样例** : `0`|integer (int32)|
|**productNewRecommends**  <br>*可选*|新品推荐  <br>**样例** : `[ "[productrecommendvo](#productrecommendvo)" ]`|< [ProductRecommendVo](#productrecommendvo) > array|
|**recommendSearch**  <br>*可选*|搜索推荐  <br>**样例** : `[ "[searchrecommend](#searchrecommend)" ]`|< [SearchRecommend](#searchrecommend) > array|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="searchmddrespvo"></a>
### SearchMddRespVo

|名称|说明|类型|
|---|---|---|
|**lat**  <br>*可选*|纬度  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**lng**  <br>*可选*|经度  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**mddPic**  <br>*可选*|目的地图片  <br>**样例** : `"string"`|string|
|**pointWord**  <br>*可选*|亮点词  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1为景点  <br>**样例** : `0`|integer (int32)|


<a name="searchrecommend"></a>
### SearchRecommend

|名称|说明|类型|
|---|---|---|
|**cover**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**targetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="searchtagvo"></a>
### SearchTagVo

|名称|说明|类型|
|---|---|---|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tag](#tag)" ]`|< [Tag](#tag) > array|


<a name="searchvo"></a>
### SearchVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|标签列表  <br>**样例** : `[ "[tags](#tags)" ]`|< [Tags](#tags) > array|
|**total_page**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="sharebean"></a>
### ShareBean

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**links**  <br>*可选*|链接url  <br>**样例** : `"string"`|string|
|**mini_app_cover**  <br>*可选*|分享封面  <br>**样例** : `"string"`|string|
|**mini_app_id**  <br>*可选*|小程序id  <br>**样例** : `"string"`|string|
|**mini_app_url**  <br>*可选*|分享url  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="shareitemvo"></a>
### ShareItemVO

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**phone**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**shareId**  <br>*可选*|共享ID  <br>**样例** : `0`|integer (int32)|
|**statusLabel**  <br>*可选*|分享状态 存在值：待接收、已共享  <br>**样例** : `"string"`|string|


<a name="sharerelvo"></a>
### ShareRelVO

|名称|说明|类型|
|---|---|---|
|**lines**  <br>*可选*|**样例** : `[ "[productbasicmodel](#productbasicmodel)" ]`|< [ProductBasicModel](#productbasicmodel) > array|
|**strategys**  <br>*可选*|**样例** : `[ "[specialnewsrelvo](#specialnewsrelvo)" ]`|< [SpecialNewsRelVO](#specialnewsrelvo) > array|


<a name="showcouponvo"></a>
### ShowCouponVO

|名称|说明|类型|
|---|---|---|
|**isShowCoupon**  <br>*可选*|是否显示388券信息  <br>**样例** : `0`|integer (int32)|
|**overTime**  <br>*可选*|优惠券到期时间戳  <br>**样例** : `0`|integer (int64)|
|**startTime**  <br>*可选*|优惠券开始时间戳  <br>**样例** : `0`|integer (int64)|


<a name="signintagvo"></a>
### SignInTagVO

|名称|说明|类型|
|---|---|---|
|**button**  <br>*可选*|去签到 or 已签到  <br>**样例** : `"string"`|string|
|**description**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|协议  <br>**样例** : `"string"`|string|
|**hasSignIn**  <br>*可选*|是否已经签到  <br>**样例** : `true`|boolean|
|**num**  <br>*可选*|积分数  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|


<a name="simplediscuvo"></a>
### SimpleDiscuVO

|名称|说明|类型|
|---|---|---|
|**discuId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="simpleuservo"></a>
### SimpleUserVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个人简介  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|true 为达人  <br>**样例** : `true`|boolean|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="singledismoresamebatchesvo"></a>
### SingleDisMoreSameBatchesVO

|名称|说明|类型|
|---|---|---|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|产品价格无符号  <br>**样例** : `"string"`|string|
|**productName**  <br>*可选*|产品名称  <br>**样例** : `"string"`|string|
|**startTimeLabel**  <br>*可选*|批次出发时间  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品封面  <br>**样例** : `"string"`|string|


<a name="singlemedaldetailvo"></a>
### SingleMedalDetailVO

|名称|说明|类型|
|---|---|---|
|**conditionDesc**  <br>*可选*|获得条件限制说明  <br>**样例** : `"string"`|string|
|**getTime**  <br>*可选*|获得时间  <br>**样例** : `"string"`|string|
|**getWay**  <br>*可选*|获得方法  <br>**样例** : `"string"`|string|
|**geted**  <br>*可选*|勋章样式 1 点亮 0 未点亮  <br>**样例** : `0`|integer (int32)|
|**getedDesc**  <br>*可选*|获得后说明  <br>**样例** : `"string"`|string|
|**getedNum**  <br>*可选*|该勋章获得的次数  <br>**样例** : `0`|integer (int32)|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**medalCategory**  <br>*可选*|勋章品类: 1为活动 2为社区  <br>**样例** : `0`|integer (int32)|
|**medalDesc**  <br>*可选*|勋章描述  <br>**样例** : `"string"`|string|
|**medalId**  <br>*可选*|勋章id  <br>**样例** : `0`|integer (int32)|
|**personCount**  <br>*可选*|获得该勋章的人数  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|勋章图标  <br>**样例** : `"string"`|string|
|**redirectTarget**  <br>*可选*|跳转目标，只有是勋章品类为社区时才有  <br>**样例** : `"string"`|string|
|**redirectTargetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|勋章名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|勋章类型 1为独立勋章  2为合成勋章 3晋级勋章  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="slideimagesvo"></a>
### SlideImagesVO

|名称|说明|类型|
|---|---|---|
|**color**  <br>*可选*|**样例** : `"string"`|string|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**url**  <br>*可选*|**样例** : `"string"`|string|


<a name="specialnewsrelvo"></a>
### SpecialNewsRelVO

|名称|说明|类型|
|---|---|---|
|**comment**  <br>*可选*|**样例** : `"string"`|string|
|**label**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**news_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**view**  <br>*可选*|**样例** : `"string"`|string|


<a name="sportsignvo"></a>
### SportSignVo

|名称|说明|类型|
|---|---|---|
|**isCheck**  <br>*可选*|是否已验证  <br>**样例** : `0`|integer (int32)|
|**qrcodeTip**  <br>*可选*|底部提示文案  <br>**样例** : `"string"`|string|
|**qrcodeUrl**  <br>*可选*|二维码链接  <br>**样例** : `"string"`|string|


<a name="stationarymodule"></a>
### StationaryModule

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|类型 1摄影大赛，2名师推荐，3摄影活动  <br>**样例** : `0`|integer (int32)|


<a name="statusstep"></a>
### StatusStep

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|流程名称  <br>**样例** : `"string"`|string|
|**pass**  <br>*可选*|是否通过  <br>**样例** : `0`|integer (int32)|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|


<a name="sub"></a>
### Sub

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|二级类型名称  <br>**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|二级类型id  <br>**样例** : `0`|integer (int32)|


<a name="subthemesmodel"></a>
### SubThemesModel

|名称|说明|类型|
|---|---|---|
|**isMore**  <br>*可选*|**样例** : `true`|boolean|
|**last_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**productlist**  <br>*可选*|**样例** : `[ "[hoteltbasicmodel](#hoteltbasicmodel)" ]`|< [HoteltBasicModel](#hoteltbasicmodel) > array|


<a name="systemmessagedetailvo"></a>
### SystemMessageDetailVo

|名称|说明|类型|
|---|---|---|
|**action**  <br>*可选*|**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**detail**  <br>*可选*|**样例** : `"string"`|string|
|**gmt_create**  <br>*可选*|**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|**样例** : `"string"`|string|
|**handler_type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**handler_url**  <br>*可选*|**样例** : `"string"`|string|
|**img**  <br>*可选*|**样例** : `"string"`|string|
|**is_read**  <br>*可选*|**样例** : `0`|integer (int32)|
|**is_show**  <br>*可选*|**样例** : `0`|integer (int32)|
|**msg_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**origin_content**  <br>*可选*|**样例** : `"string"`|string|
|**origin_id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**origin_title**  <br>*可选*|**样例** : `"string"`|string|
|**pic**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `0.0`|number|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**tuid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|**样例** : `"string"`|string|
|**video**  <br>*可选*|**样例** : `"string"`|string|


<a name="systemmessagevo"></a>
### SystemMessageVo

|名称|说明|类型|
|---|---|---|
|**notify**  <br>*可选*|**样例** : `[ "[systemmessagedetailvo](#systemmessagedetailvo)" ]`|< [SystemMessageDetailVo](#systemmessagedetailvo) > array|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="tag"></a>
### Tag

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|数量  <br>**样例** : `0`|integer (int64)|
|**subTag**  <br>*可选*|二级标签  <br>**样例** : `[ "[tag](#tag)" ]`|< [Tag](#tag) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int64)|


<a name="tagitementity"></a>
### TagItemEntity

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|**样例** : `"string"`|string|


<a name="tagitemvo"></a>
### TagItemVO

|名称|说明|类型|
|---|---|---|
|**tagcolor**  <br>*可选*|标签颜色  <br>**样例** : `"string"`|string|
|**tagid**  <br>*可选*|标签id  <br>**样例** : `0`|integer (int32)|
|**tagname**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|


<a name="tagvo"></a>
### TagVO

|名称|说明|类型|
|---|---|---|
|**tag_list**  <br>*可选*|**样例** : `[ "[filmtagvo](#filmtagvo)" ]`|< [FilmTagVO](#filmtagvo) > array|


<a name="tagvo_1"></a>
### TagVO_1

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="tag_1"></a>
### Tag_1

|名称|说明|类型|
|---|---|---|
|**color**  <br>*可选*|**样例** : `"string"`|string|
|**icon**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|


<a name="tags"></a>
### Tags

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|
|**tag_id**  <br>*可选*|标签id  <br>**样例** : `0`|integer (int32)|


<a name="tagsitemvo"></a>
### TagsItemVO

|名称|说明|类型|
|---|---|---|
|**tagcolor**  <br>*可选*|标签颜色  <br>**样例** : `"string"`|string|
|**tagid**  <br>*可选*|标签id  <br>**样例** : `0`|integer (int32)|
|**tagname**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|


<a name="taklvo"></a>
### TaklVo

|名称|说明|类型|
|---|---|---|
|**tip**  <br>*可选*|**样例** : `"string"`|string|


<a name="teaminfovo"></a>
### TeamInfoVO

|名称|说明|类型|
|---|---|---|
|**bus**  <br>*可选*|车次  <br>**样例** : `0`|integer (int32)|
|**copyTeamId**  <br>*可选*|当teamId为空 bus 和 copyTeamId 就为一个唯一纬度  <br>**样例** : `0`|integer (int32)|
|**endTime**  <br>*可选*|活动结束时间  <br>**样例** : `"string"`|string|
|**startTime**  <br>*可选*|活动开始时间  <br>**样例** : `"string"`|string|
|**teamDesc**  <br>*可选*|产品介绍  <br>**样例** : `"string"`|string|
|**teamId**  <br>*可选*|同团id  <br>**样例** : `0`|integer (int32)|


<a name="themecategoryvo"></a>
### ThemeCategoryVO

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|标签列表  <br>**样例** : `[ "[tags](#tags)" ]`|< [Tags](#tags) > array|


<a name="themevo"></a>
### ThemeVO

|名称|说明|类型|
|---|---|---|
|**descripe**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**newsThemes**  <br>*可选*|预览主题列表  <br>**样例** : `[ "[newsthemevo](#newsthemevo)" ]`|< [NewsThemeVO](#newsthemevo) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**total**  <br>*可选*|主题总数量  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|主题类型  <br>**样例** : `0`|integer (int32)|


<a name="themevo_1"></a>
### ThemeVO_1

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|
|**copyright**  <br>*可选*|版权  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|封面id  <br>**样例** : `0`|integer (int32)|
|**editor_choice**  <br>*可选*|是否可下载  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|封面url  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|作品标题  <br>**样例** : `"string"`|string|


<a name="themesbean"></a>
### ThemesBean

|名称|说明|类型|
|---|---|---|
|**albums**  <br>*可选*|作品集合  <br>**样例** : `[ "[albumsvo](#albumsvo)" ]`|< [AlbumsVO](#albumsvo) > array|
|**more_url**  <br>*可选*|更多链接  <br>**样例** : `"string"`|string|
|**themeName**  <br>*可选*|主题名称  <br>**样例** : `"string"`|string|


<a name="thumbbean"></a>
### ThumbBean

|名称|说明|类型|
|---|---|---|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**label**  <br>*可选*|标签列表  <br>**样例** : `[ "string" ]`|< string > array|
|**labelStr**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**newdetail**  <br>*可选*|h5地址  <br>**样例** : `"string"`|string|
|**news_id**  <br>*可选*|攻略id  <br>**样例** : `0`|integer (int32)|
|**thumb**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**view**  <br>*可选*|浏览转化数  <br>**样例** : `"string"`|string|
|**viewInt**  <br>*可选*|浏览数  <br>**样例** : `0`|integer (int64)|


<a name="timeserachresultvo"></a>
### TimeSerachResultVo

|名称|说明|类型|
|---|---|---|
|**list**  <br>*可选*|**样例** : `[ "[typemodel](#typemodel)" ]`|< [TypeModel](#typemodel) > array|
|**productRecommend**  <br>*可选*|**样例** : `[ "[productrecommendvo](#productrecommendvo)" ]`|< [ProductRecommendVo](#productrecommendvo) > array|


<a name="timevo"></a>
### TimeVO

|名称|说明|类型|
|---|---|---|
|**month**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**year**  <br>*可选*|**样例** : `"string"`|string|


<a name="topcalendervo"></a>
### TopCalenderVO

|名称|说明|类型|
|---|---|---|
|**imageUrl**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**index**  <br>*可选*|日期序号  <br>**样例** : `"string"`|string|
|**tid**  <br>*可选*|游记id  <br>**样例** : `0`|integer (int64)|


<a name="topproductwrapvo"></a>
### TopProductWrapVO

|名称|说明|类型|
|---|---|---|
|**recommendAd**  <br>*可选*|小众推荐广告位  <br>**样例** : `[ "[b6e44956354acb2ff4edba87b043212e](#b6e44956354acb2ff4edba87b043212e)" ]`|< [广告位_2](#b6e44956354acb2ff4edba87b043212e) > array|
|**recommendProduct**  <br>*可选*|小众推荐产品  <br>**样例** : `[ "[recommendproductvo](#recommendproductvo)" ]`|< [RecommendProductVO](#recommendproductvo) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="topvo"></a>
### TopVO

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**hint**  <br>*可选*|如何成为侠魁提示语  <br>**样例** : `"string"`|string|
|**hintTid**  <br>*可选*|如何成为侠魁跳转的游记id  <br>**样例** : `0`|integer (int64)|
|**shareDescription**  <br>*可选*|分享描述  <br>**样例** : `"string"`|string|
|**shareImageUrl**  <br>*可选*|分享背景图链接  <br>**样例** : `"string"`|string|
|**shareRedirectUrl**  <br>*可选*|分享链接  <br>**样例** : `"string"`|string|
|**shareTitle**  <br>*可选*|分享标题  <br>**样例** : `"string"`|string|
|**times**  <br>*可选*|年月份  <br>**样例** : `[ "[timevo](#timevo)" ]`|< [TimeVO](#timevo) > array|
|**weekTopVos**  <br>*可选*|侠魁数据  <br>**样例** : `[ "[weektopvo](#weektopvo)" ]`|< [WeekTopVO](#weektopvo) > array|


<a name="topicjoinervo"></a>
### TopicJoinerVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|**样例** : `"string"`|string|
|**discoverList**  <br>*可选*|遇见  <br>**样例** : `[ "[discoversimplevo](#discoversimplevo)" ]`|< [DiscoverSimpleVO](#discoversimplevo) > array|
|**discovers**  <br>*可选*|遇见  <br>**样例** : `[ "[basediscovervo](#basediscovervo)" ]`|< [BaseDiscoverVO](#basediscovervo) > array|
|**intro**  <br>*可选*|个人介绍  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|双方粉丝关系  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|达人标识 1为加V  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="topicsquare"></a>
### TopicSquare

|名称|说明|类型|
|---|---|---|
|**end**  <br>*可选*|true 为活动结束  <br>**样例** : `true`|boolean|
|**endTime**  <br>*可选*|距离活动结束时间剩余毫秒数 -1表示投票没时间限制  <br>**样例** : `0`|integer (int64)|
|**hasPrise**  <br>*可选*|1 无奖 2 有奖  <br>**样例** : `0`|integer (int32)|
|**optionInfo**  <br>*可选*|观点投票统计  <br>**样例** : `[ "[attitudeoptioninfovo](#attitudeoptioninfovo)" ]`|< [AttitudeOptionInfoVO](#attitudeoptioninfovo) > array|
|**options**  <br>*可选*|观点选项  <br>**样例** : `[ "[attitudeoptionvo](#attitudeoptionvo)" ]`|< [AttitudeOptionVO](#attitudeoptionvo) > array|
|**publishedContent**  <br>*可选*|true 为发表了观点内容  <br>**样例** : `true`|boolean|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**topicId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|态度话题类型 1pk 2投票  <br>**样例** : `0`|integer (int32)|
|**userCount**  <br>*可选*|参与人数  <br>**样例** : `"string"`|string|
|**voted**  <br>*可选*|true 为已投票  <br>**样例** : `true`|boolean|


<a name="topicvo"></a>
### TopicVO

|名称|说明|类型|
|---|---|---|
|**bigimg**  <br>*可选*|话题头图  <br>**样例** : `"string"`|string|
|**bigimgType**  <br>*可选*|话题头图类型1 通用背景型（简介覆盖在图片之上）2 广告突出型（简介在图片区域下方）  <br>**样例** : `0`|integer (int32)|
|**desc**  <br>*可选*|说明  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|说明--安卓分享用  <br>**样例** : `"string"`|string|
|**detailHandler**  <br>*可选*|简介跳转协议  <br>**样例** : `"string"`|string|
|**detailTargetUrl**  <br>*可选*|简介跳转url  <br>**样例** : `"string"`|string|
|**did**  <br>*可选*|**样例** : `0`|integer (int32)|
|**discoverCount**  <br>*可选*|遇见数  <br>**样例** : `"string"`|string|
|**discu_id**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**followNum**  <br>*可选*|关注人数  <br>**样例** : `"string"`|string|
|**followed**  <br>*可选*|0未关注  1已关注  <br>**样例** : `0`|integer (int32)|
|**handler**  <br>*可选*|链接跳转类型  <br>**样例** : `"string"`|string|
|**hot**  <br>*可选*|1为显示hot标签 0为普通  <br>**样例** : `0`|integer (int32)|
|**img**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**joinNum**  <br>*可选*|参与人数  <br>**样例** : `"string"`|string|
|**reward**  <br>*可选*|1为有奖 0为普通  <br>**样例** : `0`|integer (int32)|
|**rewardBanners**  <br>*可选*|奖品banner  <br>**样例** : `[ "string" ]`|< string > array|
|**target_url**  <br>*可选*|链接地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 0普通 1 推荐 2征集  <br>**样例** : `0`|integer (int32)|
|**views**  <br>*可选*|浏览量  <br>**样例** : `"string"`|string|


<a name="travelindraftboxvo"></a>
### TravelInDraftBoxVO

|名称|说明|类型|
|---|---|---|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**fid**  <br>*可选*|目的地id  <br>**样例** : `"string"`|string|
|**imageAndVideo**  <br>*可选*|图片和视频地址  <br>**样例** : `[ "[2d711b09bd0db0ad240cc83b30dd8014](#2d711b09bd0db0ad240cc83b30dd8014)" ]`|< [内容](#2d711b09bd0db0ad240cc83b30dd8014) > array|
|**imageCount**  <br>*可选*|图片总数  <br>**样例** : `0`|integer (int32)|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**tid**  <br>*可选*|游记id  <br>**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**yxkid**  <br>*可选*|yxkid  <br>**样例** : `0`|integer (int64)|


<a name="traveltiphomevo"></a>
### TravelTipHomeVO

|名称|说明|类型|
|---|---|---|
|**adCatalog**  <br>*可选*|目的地推荐  <br>**样例** : `"[9bf3074fe642eea9e733f50c579ee952](#9bf3074fe642eea9e733f50c579ee952)"`|[推荐位目录板块](#9bf3074fe642eea9e733f50c579ee952)|
|**pageSize**  <br>*可选*|页面大小  <br>**样例** : `0`|integer (int32)|
|**theme**  <br>*可选*|推荐主题  <br>**样例** : `"[themevo](#themevo)"`|[ThemeVO](#themevo)|
|**thumblist**  <br>*可选*|封面图列表  <br>**样例** : `[ "[thumbbean](#thumbbean)" ]`|< [ThumbBean](#thumbbean) > array|
|**total**  <br>*可选*|记录总数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**travelTipsAndDestList**  <br>*可选*|攻略和目的地列表  <br>**样例** : `[ "[basebbsindexvo](#basebbsindexvo)" ]`|< [BaseBbsIndexVO](#basebbsindexvo) > array|


<a name="travelarticlecommentsrespvo"></a>
### TravelarticleCommentsRespVo

|名称|说明|类型|
|---|---|---|
|**curPage**  <br>*可选*|当前页  <br>**样例** : `0`|integer (int32)|
|**list**  <br>*可选*|评论数据  <br>**样例** : `[ "[009dac8e28b632f81c4309d510b2e713](#009dac8e28b632f81c4309d510b2e713)" ]`|< [评论参数对象](#009dac8e28b632f81c4309d510b2e713) > array|
|**recordCount**  <br>*可选*|总记录数  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="travelarticlecontentsvo"></a>
### TravelarticleContentsVo

|名称|说明|类型|
|---|---|---|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|游记内容  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|表id  <br>**样例** : `0`|integer (int32)|
|**picInfo**  <br>*可选*|**样例** : `"[picinfovo](#picinfovo)"`|[PicInfoVO](#picinfovo)|
|**seq**  <br>*可选*|seq唯一标识  <br>**样例** : `0`|integer (int64)|
|**thumb**  <br>*可选*|视频封面  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|内容类型 1文字 2段落标题 3图片 4视频  <br>**样例** : `"string"`|string|
|**typeValue**  <br>*可选*|额外参数  <br>**样例** : `"string"`|string|


<a name="travelarticlesdetailvo"></a>
### TravelarticlesDetailVO

|名称|说明|类型|
|---|---|---|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**authorName**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**authorid**  <br>*可选*|用户id  <br>**样例** : `"string"`|string|
|**contents**  <br>*可选*|游记内容  <br>**样例** : `[ "[travelarticlecontentsvo](#travelarticlecontentsvo)" ]`|< [TravelarticleContentsVo](#travelarticlecontentsvo) > array|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**departureDate**  <br>*可选*|出发时间  <br>**样例** : `"string"`|string|
|**displayorder**  <br>*可选*|发布状态 0 已发布 9 待发布 10 草稿  <br>**样例** : `"string"`|string|
|**favorite**  <br>*可选*|是否收藏过  <br>**样例** : `true`|boolean|
|**fid**  <br>*可选*|目的地id  <br>**样例** : `"string"`|string|
|**groupTitle**  <br>*可选*|组名称  <br>**样例** : `"string"`|string|
|**identifyName**  <br>*可选*|身份标签  <br>**样例** : `"string"`|string|
|**mddName**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**musicName**  <br>*可选*|音乐名称  <br>**样例** : `"string"`|string|
|**musicUrl**  <br>*可选*|音乐地址  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|用户头像图片  <br>**样例** : `"string"`|string|
|**picUrl**  <br>*可选*|游记封页图地址  <br>**样例** : `"string"`|string|
|**replies**  <br>*可选*|回复数  <br>**样例** : `"string"`|string|
|**shareTip**  <br>*可选*|分享提示信息  <br>**样例** : `"string"`|string|
|**shareVo**  <br>*可选*|分享内容  <br>**样例** : `"[travelarticlessharevo](#travelarticlessharevo)"`|[TravelarticlesShareVo](#travelarticlessharevo)|
|**shouldComplete**  <br>*可选*|提示是否显示完善出行信息  <br>**样例** : `true`|boolean|
|**stars**  <br>*可选*|等级  <br>**样例** : `"string"`|string|
|**tid**  <br>*可选*|游记id  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**tripDays**  <br>*可选*|出行天数  <br>**样例** : `"string"`|string|
|**tripPlace**  <br>*可选*|集合地  <br>**样例** : `"string"`|string|
|**tripPrice**  <br>*可选*|人均费用  <br>**样例** : `"string"`|string|
|**tripType**  <br>*可选*|出发类型  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览数  <br>**样例** : `"string"`|string|
|**xiaKui**  <br>*可选*|是否为侠魁  <br>**样例** : `true`|boolean|
|**yxkid**  <br>*可选*|yxkid  <br>**样例** : `0`|integer (int64)|


<a name="travelarticlessharevo"></a>
### TravelarticlesShareVo

|名称|说明|类型|
|---|---|---|
|**shareDesc**  <br>*可选*|分享描述  <br>**样例** : `"string"`|string|
|**shareImage**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**shareTitle**  <br>*可选*|分享标题 格式 游记标题 - 游侠客社区  <br>**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|分享跳转指定url  <br>**样例** : `"string"`|string|


<a name="travelarticlesvo"></a>
### TravelarticlesVo

|名称|说明|类型|
|---|---|---|
|**authorName**  <br>*可选*|作者名  <br>**样例** : `"string"`|string|
|**authorid**  <br>*可选*|作者id  <br>**样例** : `0`|integer (int64)|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**digest**  <br>*可选*|是否为精华 1为精华,2优质，3侠魁  <br>**样例** : `0`|integer (int32)|
|**displayorder**  <br>*可选*|游记状态  0 为正常 10为草稿 11为回收站  9为待审核 12为审核不通过,20管理员删除  <br>**样例** : `"string"`|string|
|**fid**  <br>*可选*|目的地id  <br>**样例** : `"string"`|string|
|**mddName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**msg**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|用户头像图片  <br>**样例** : `"string"`|string|
|**replies**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**summary**  <br>*可选*|游记的文字概述  <br>**样例** : `"string"`|string|
|**talent**  <br>*可选*|是否为达人，1达人，0不是  <br>**样例** : `0`|integer (int32)|
|**tid**  <br>*可选*|游记id  <br>**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|实体类型  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|游记封页图地址  <br>**样例** : `"string"`|string|
|**views**  <br>*可选*|浏览数  <br>**样例** : `"string"`|string|
|**yxkid**  <br>*可选*|**样例** : `"string"`|string|


<a name="typemodel"></a>
### TypeModel

|名称|说明|类型|
|---|---|---|
|**desc**  <br>*可选*|说明  <br>**样例** : `"string"`|string|
|**handle**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**label**  <br>*可选*|签证标签  <br>**样例** : `[ "string" ]`|< string > array|
|**mddLevel**  <br>*可选*|目的地上级  <br>**样例** : `"string"`|string|
|**productTypeCounts**  <br>*可选*|旅游产品相关类型数量  <br>**样例** : `[ "[producttypecount](#producttypecount)" ]`|< [ProductTypeCount](#producttypecount) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型 1游记 2攻略 3视频 4摄影作品 5频道页 6签证 7目的地  8游侠 9旅游产品  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转地址  <br>**样例** : `"string"`|string|


<a name="typevaluevo"></a>
### TypeValueVO

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|值  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="useraccountdetailbean"></a>
### UserAccountDetailBean

|名称|说明|类型|
|---|---|---|
|**amount**  <br>*可选*|**样例** : `0.0`|number|
|**amountAfter**  <br>*可选*|**样例** : `0.0`|number|
|**amountAfterStr**  <br>*可选*|**样例** : `"string"`|string|
|**amountBefore**  <br>*可选*|**样例** : `0.0`|number|
|**amountBeforeStr**  <br>*可选*|**样例** : `"string"`|string|
|**amountStr**  <br>*可选*|**样例** : `"string"`|string|
|**channel**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createdAt**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**expensesType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**incomeType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**originalId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="useraccountdetailvo"></a>
### UserAccountDetailVO

|名称|说明|类型|
|---|---|---|
|**account**  <br>*可选*|账户余额  <br>**样例** : `0.0`|number|
|**accountStr**  <br>*可选*|账户余额字符串  <br>**样例** : `"string"`|string|
|**curMinMonth**  <br>*可选*|当前页面最小月份  <br>**样例** : `"string"`|string|
|**page**  <br>*可选*|页数  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**userDetailBeans**  <br>*可选*|账户明细  <br>**样例** : `[ "[details](#details)" ]`|< [Details](#details) > array|


<a name="useraccountsafevo"></a>
### UserAccountsafeVo

|名称|说明|类型|
|---|---|---|
|**email**  <br>*可选*|email  <br>**样例** : `"string"`|string|
|**getcoupon**  <br>*可选*|资料完善代金券发放进度  <br>**样例** : `"object"`|object|
|**logoutNote**  <br>*可选*|注销提示  <br>**样例** : `"string"`|string|
|**mobile**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**qq**  <br>*可选*|qq号  <br>**样例** : `0`|integer (int32)|
|**wechart**  <br>*可选*|微信号  <br>**样例** : `0`|integer (int32)|
|**weibo**  <br>*可选*|微博号  <br>**样例** : `0`|integer (int32)|


<a name="useravatarconfvo"></a>
### UserAvatarConfVO

|名称|说明|类型|
|---|---|---|
|**defaultAvatars**  <br>*可选*|默认头像列表  <br>**样例** : `[ "[defaultavatarvo](#defaultavatarvo)" ]`|< [DefaultAvatarVO](#defaultavatarvo) > array|
|**userPic**  <br>*可选*|用户头像url  <br>**样例** : `"string"`|string|


<a name="userbasicinfo"></a>
### UserBasicInfo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|**样例** : `"string"`|string|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**intro**  <br>*可选*|**样例** : `"string"`|string|
|**livecity**  <br>*可选*|**样例** : `"string"`|string|
|**liveprovince**  <br>*可选*|**样例** : `"string"`|string|
|**mobilePhone**  <br>*可选*|**样例** : `"string"`|string|
|**registTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**sex**  <br>*可选*|**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**trueName**  <br>*可选*|**样例** : `"string"`|string|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|**样例** : `"string"`|string|


<a name="userbeanvo"></a>
### UserBeanVO

|名称|说明|类型|
|---|---|---|
|**applyBtn**  <br>*可选*|申请退款  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**passport**  <br>*可选*|护照号码  <br>**样例** : `"string"`|string|
|**progress**  <br>*可选*|进度描述  1=>'等待寄送材料',<br>        2=>'确认收到材料',<br>        3=>'材料不完整',<br>        4=>'已审核完成',<br>        5=>'已送签',<br>        6=>'拒签',<br>        7=>'已出签',//等于发货<br>        8=>'已签收',<br>        9=>'已自取',<br>        0=>'待付款'  <br>**最小值** : `-128`  <br>**最大值** : `127`  <br>**样例** : `0`|integer (int32)|
|**progressDetail**  <br>*可选*|进度描述  <br>**样例** : `"string"`|string|
|**progressUrl**  <br>*可选*|跟踪进度url  <br>**样例** : `"string"`|string|
|**refundUrl**  <br>*可选*|退款url  <br>**样例** : `"string"`|string|
|**traceBtn**  <br>*可选*|跟踪进度  <br>**样例** : `0`|integer (int32)|
|**viewBtn**  <br>*可选*|查看退款  <br>**样例** : `0`|integer (int32)|


<a name="usercommentvo"></a>
### UserCommentVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|评论人图像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**create_time**  <br>*可选*|创建时间  <br>**样例** : `0`|integer (int64)|
|**level**  <br>*可选*|评论人等级  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|评论人id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|评论人名称  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|游侠标识  <br>**样例** : `[ "[certificationmodel](#certificationmodel)" ]`|< [CertificationModel](#certificationmodel) > array|


<a name="usercontactbeanvo"></a>
### UserContactBeanVO

|名称|说明|类型|
|---|---|---|
|**email**  <br>*可选*|邮箱  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**note**  <br>*可选*|**样例** : `"string"`|string|
|**phone**  <br>*可选*|电话  <br>**样例** : `"string"`|string|


<a name="userdailymaterialdetailvo"></a>
### UserDailyMaterialDetailVO

|名称|说明|类型|
|---|---|---|
|**imgAuthor**  <br>*可选*|图片作者  <br>**样例** : `"string"`|string|
|**imgContent**  <br>*可选*|图片标题  <br>**样例** : `"string"`|string|
|**imgId**  <br>*可选*|图片Id  <br>**样例** : `0`|integer (int32)|
|**imgUrl**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**materialId**  <br>*可选*|图文id  <br>**样例** : `0`|integer (int32)|
|**receivedTime**  <br>*可选*|领取时间  <br>**样例** : `0`|integer (int64)|
|**textAuthor**  <br>*可选*|内容作者  <br>**样例** : `"string"`|string|
|**textContent**  <br>*可选*|内容文案  <br>**样例** : `"string"`|string|
|**textId**  <br>*可选*|文案id  <br>**样例** : `0`|integer (int32)|
|**userAvatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**userDaysNum**  <br>*可选*|用户注册天数  <br>**样例** : `0`|integer (int32)|
|**userDaysTip**  <br>*可选*|用户注册天数文案  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userdiscovercountvo"></a>
### UserDiscoverCountVO

|名称|说明|类型|
|---|---|---|
|**beCollectCount**  <br>*可选*|遇见被收藏总数量  <br>**样例** : `0`|integer (int32)|
|**beCommentCount**  <br>*可选*|遇见被评论总数量  <br>**样例** : `0`|integer (int32)|
|**beLikeCount**  <br>*可选*|遇见被点赞总数量  <br>**样例** : `0`|integer (int32)|
|**discoverCount**  <br>*可选*|遇见总数量  <br>**样例** : `0`|integer (int32)|
|**discoverGuideUrl**  <br>*可选*|写遇见的帮助指导  <br>**样例** : `"string"`|string|
|**precedePercent**  <br>*可选*|遇见排名百分比  <br>**样例** : `"string"`|string|


<a name="userdiscoverfriendvo"></a>
### UserDiscoverFriendVO

|名称|说明|类型|
|---|---|---|
|**addTime**  <br>*可选*|注册时间  <br>**样例** : `"string"`|string|
|**isJoin**  <br>*可选*|是否加入:true为加入  <br>**样例** : `true`|boolean|
|**isTalent**  <br>*可选*|V标识:true为V表示  <br>**样例** : `true`|boolean|
|**mobile**  <br>*可选*|手机号码  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|关注状态  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**userTongxunName**  <br>*可选*|通讯录名称  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userduobaologvo"></a>
### UserDuobaoLogVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|夺宝线路封面图  <br>**样例** : `"string"`|string|
|**duobaoId**  <br>*可选*|夺宝ID  <br>**样例** : `0`|integer (int32)|
|**duobaoTitle**  <br>*可选*|夺宝活动名  <br>**样例** : `"string"`|string|
|**joinTime**  <br>*可选*|参与时间  <br>**样例** : `0`|integer (int64)|
|**stakes**  <br>*可选*|投注数  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userentity"></a>
### UserEntity

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**meetManage**  <br>*可选*|是否为遇见管理员  true or false  <br>**样例** : `true`|boolean|
|**uid**  <br>*可选*|uid  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userexchangelistvo"></a>
### UserExchangeListVO

|名称|说明|类型|
|---|---|---|
|**exchangeId**  <br>*可选*|兑换物id  <br>**样例** : `0`|integer (int32)|
|**exchangeImage**  <br>*可选*|兑换物图标  <br>**样例** : `"string"`|string|
|**exchangeIntegral**  <br>*可选*|兑换积分  <br>**样例** : `0`|integer (int32)|
|**exchangeName**  <br>*可选*|兑换物名称  <br>**样例** : `"string"`|string|
|**exchangeTime**  <br>*可选*|兑换时间  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|券面额  <br>**样例** : `0.0`|number|


<a name="userfansitemvo"></a>
### UserFansItemVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个人签名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|双方关注关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|个人标签  <br>**样例** : `[ "[tagitemvo](#tagitemvo)" ]`|< [TagItemVO](#tagitemvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userfansvo"></a>
### UserFansVo

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|**样例** : `0`|integer (int32)|
|**is_unread**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|**样例** : `0`|integer (int32)|
|**userList**  <br>*可选*|列表  <br>**样例** : `[ "[userfansitemvo](#userfansitemvo)" ]`|< [UserFansItemVo](#userfansitemvo) > array|


<a name="userinfovo"></a>
### UserInfoVo

|名称|说明|类型|
|---|---|---|
|**appBgPic**  <br>*可选*|背景图  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**birth**  <br>*可选*|生日格式化  <br>**样例** : `"string"`|string|
|**birthday**  <br>*可选*|生日时间戳  <br>**样例** : `0`|integer (int64)|
|**canUpdateBirth**  <br>*可选*|是否能修改生日 0 不能修改 1 能修改  <br>**样例** : `0`|integer (int32)|
|**city**  <br>*可选*|市  <br>**样例** : `"string"`|string|
|**communityLevel**  <br>*可选*|社区等级，例如：20 恒山  <br>**样例** : `"string"`|string|
|**countFollower**  <br>*可选*|粉丝数  <br>**样例** : `0`|integer (int32)|
|**countFollowing**  <br>*可选*|关注数  <br>**样例** : `0`|integer (int32)|
|**countPhoto**  <br>*可选*|摄影数  <br>**样例** : `0`|integer (int32)|
|**countPost**  <br>*可选*|游记数  <br>**样例** : `0`|integer (int32)|
|**countQuote**  <br>*可选*|遇见数+遇见举报数  <br>**样例** : `0`|integer (int32)|
|**education**  <br>*可选*|学历  <br>**样例** : `"string"`|string|
|**educationArr**  <br>*可选*|学历选项  <br>**样例** : `[ "string" ]`|< string > array|
|**email**  <br>*可选*|email  <br>**样例** : `"string"`|string|
|**getcoupon**  <br>*可选*|完善信息代金券发放进度  <br>**样例** : `"object"`|object|
|**group_video_permission**  <br>*可选*|**样例** : `0`|integer (int32)|
|**grouptitle**  <br>*可选*|头衔（等级）  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个性签名  <br>**样例** : `"string"`|string|
|**isHasCoupon**  <br>*可选*|是否已经获取过完善资料的代金券  <br>**样例** : `0`|integer (int32)|
|**is_has_mobile**  <br>*可选*|是否有手机  <br>**样例** : `0`|integer (int32)|
|**mark**  <br>*可选*|xx后  <br>**样例** : `"string"`|string|
|**medalCount**  <br>*可选*|勋章数  <br>**样例** : `0`|integer (int32)|
|**medalTargetUrl**  <br>*可选*|勋章跳转地址  <br>**样例** : `"string"`|string|
|**mobile**  <br>*可选*|手机号  <br>**样例** : `"string"`|string|
|**msg**  <br>*可选*|不能修改的提示  <br>**样例** : `"string"`|string|
|**nick**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**notice**  <br>*可选*|提示语  <br>**样例** : `"string"`|string|
|**occupation**  <br>*可选*|职业  <br>**样例** : `"string"`|string|
|**occupationArr**  <br>*可选*|职业选项  <br>**样例** : `[ "string" ]`|< string > array|
|**percent**  <br>*可选*|资料完成度  <br>**样例** : `0`|integer (int32)|
|**private_video_permission**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|省  <br>**样例** : `"string"`|string|
|**realname**  <br>*可选*|真实姓名  <br>**样例** : `"string"`|string|
|**revenue**  <br>*可选*|年收入  <br>**样例** : `"string"`|string|
|**revenueArr**  <br>*可选*|年收入选项  <br>**样例** : `[ "string" ]`|< string > array|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**shop_address**  <br>*可选*|收货地址菜单  <br>**样例** : `"object"`|object|
|**shop_menu**  <br>*可选*|集市菜单  <br>**样例** : `"object"`|object|
|**show_back**  <br>*可选*|**样例** : `0`|integer (int32)|
|**show_information**  <br>*可选*|**样例** : `0`|integer (int32)|
|**show_page**  <br>*可选*|**样例** : `0`|integer (int32)|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagitemvo](#tagitemvo)" ]`|< [TagItemVO](#tagitemvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**updateBirthMsg**  <br>*可选*|修改提示警告  <br>**样例** : `"string"`|string|
|**user_type**  <br>*可选*|用户类型：1员工0普通  <br>**样例** : `0`|integer (int32)|
|**xz**  <br>*可选*|星座  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|认证身份  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|


<a name="userluckynumber"></a>
### UserLuckyNumber

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**betTime**  <br>*可选*|下注时间  <br>**样例** : `0`|integer (int64)|
|**luckyNumber**  <br>*可选*|幸运号码  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="userprizehistoryvo"></a>
### UserPrizeHistoryVO

|名称|说明|类型|
|---|---|---|
|**activityName**  <br>*可选*|地点（兑换类型）  <br>**样例** : `"string"`|string|
|**amount**  <br>*可选*|优惠券金额  <br>**样例** : `0.0`|number|
|**costCredit**  <br>*可选*|积分变化  <br>**样例** : `0`|integer (int32)|
|**couponCategory**  <br>*可选*|使用品类1：线路；2：签证；3：门票；4：体育赛事  <br>**样例** : `0`|integer (int32)|
|**createdAt**  <br>*可选*|时间  <br>**样例** : `"string"`|string|
|**exchangeType**  <br>*可选*|兑换物类型：1 代金券 2 实物  <br>**样例** : `0`|integer (int32)|
|**imageUrl**  <br>*可选*|物品图片地址  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|名称  <br>**样例** : `"string"`|string|


<a name="userservicefollowvo"></a>
### UserServiceFollowVO

|名称|说明|类型|
|---|---|---|
|**isFollow**  <br>*可选*|是否已关注1已关注不显示提醒  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|二维码url  <br>**样例** : `"string"`|string|


<a name="usersimplicityinfovo"></a>
### UserSimplicityInfoVo

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**nick**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|


<a name="usersummeryvo"></a>
### UserSummeryVo

|名称|说明|类型|
|---|---|---|
|**appBgPic**  <br>*可选*|app个人主页背景图  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**bgPic**  <br>*可选*|背景图  <br>**样例** : `"string"`|string|
|**communityLevel**  <br>*可选*|社区等级头衔  <br>**样例** : `"string"`|string|
|**countFollower**  <br>*可选*|粉丝数  <br>**样例** : `"string"`|string|
|**countFollowing**  <br>*可选*|关注数  <br>**样例** : `"string"`|string|
|**countPhoto**  <br>*可选*|摄影数量  <br>**样例** : `0`|integer (int32)|
|**countPost**  <br>*可选*|游记数量  <br>**样例** : `0`|integer (int32)|
|**countQuote**  <br>*可选*|遇见数+遇见举报数  <br>**样例** : `"string"`|string|
|**draftBox**  <br>*可选*|草稿箱  <br>**样例** : `[ "[22b4334f915541755261249f38d0df9b](#22b4334f915541755261249f38d0df9b)" ]`|< [草稿](#22b4334f915541755261249f38d0df9b) > array|
|**email**  <br>*可选*|email  <br>**样例** : `"string"`|string|
|**grouptitle**  <br>*可选*|头衔（等级）  <br>**样例** : `"string"`|string|
|**homepage**  <br>*可选*|个人主页url  <br>**样例** : `"string"`|string|
|**intro**  <br>*可选*|个人签名  <br>**样例** : `"string"`|string|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**is_show_share**  <br>*可选*|是否显示分享  <br>**样例** : `0`|integer (int32)|
|**medalNum**  <br>*可选*|勋章数  <br>**样例** : `0`|integer (int32)|
|**mobile**  <br>*可选*|电话  <br>**样例** : `"string"`|string|
|**myMedalUrl**  <br>*可选*|我的勋章页  <br>**样例** : `"string"`|string|
|**newhomepage**  <br>*可选*|个人主页url  <br>**样例** : `"string"`|string|
|**newintro**  <br>*可选*|攻略里面的个性签名  <br>**样例** : `"string"`|string|
|**nick**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**relation**  <br>*可选*|双方关注关系  <br>**样例** : `"string"`|string|
|**sex**  <br>*可选*|性别  <br>**样例** : `0`|integer (int32)|
|**small_avatar**  <br>*可选*|小头像  <br>**样例** : `"string"`|string|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[tagitemvo](#tagitemvo)" ]`|< [TagItemVO](#tagitemvo) > array|
|**uid**  <br>*可选*|uid  <br>**样例** : `0`|integer (int32)|
|**userTravelInfoVO**  <br>*可选*|旅行信息  <br>**样例** : `"[6fc452290c6a517b1ec80d61e4397167](#6fc452290c6a517b1ec80d61e4397167)"`|[个人主页旅行统计信息](#6fc452290c6a517b1ec80d61e4397167)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**yxkCert**  <br>*可选*|认证身份  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|


<a name="usertagvo"></a>
### UserTagVo

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|标签使用数  <br>**样例** : `0`|integer (int32)|
|**img_url**  <br>*可选*|标签图标  <br>**样例** : `"string"`|string|
|**selected**  <br>*可选*|是否选中  <br>**样例** : `0`|integer (int32)|
|**tagid**  <br>*可选*|tagid  <br>**样例** : `0`|integer (int32)|
|**tagname**  <br>*可选*|标签名称  <br>**样例** : `"string"`|string|


<a name="usertongxuntotalmsgvo"></a>
### UserTongXunTotalMsgVO

|名称|说明|类型|
|---|---|---|
|**friendsNumber**  <br>*可选*|通讯录中加入游侠客的总数  <br>**样例** : `0`|integer (int32)|
|**note**  <br>*可选*|邀请文案  <br>**样例** : `"string"`|string|


<a name="view"></a>
### View

|名称|说明|类型|
|---|---|---|
|**contentType**  <br>*可选*|**样例** : `"string"`|string|


<a name="viewpointsamplevo"></a>
### ViewpointSampleVO

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**viewpointContent**  <br>*可选*|观点  <br>**样例** : `"string"`|string|


<a name="vipleveldiscount"></a>
### VipLevelDiscount

|名称|说明|类型|
|---|---|---|
|**discount**  <br>*可选*|折扣  <br>**样例** : `0`|integer (int32)|
|**discountTip**  <br>*可选*|折扣文案  <br>**样例** : `"string"`|string|
|**level**  <br>*可选*|等级  <br>**样例** : `0`|integer (int32)|
|**levelName**  <br>*可选*|等级名称  <br>**样例** : `"string"`|string|


<a name="visaaboutproductvo"></a>
### VisaAboutProductVO

|名称|说明|类型|
|---|---|---|
|**minpric**  <br>*可选*|最小价格  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|pid  <br>**样例** : `0`|integer (int32)|
|**price_label**  <br>*可选*|价格标签  <br>**样例** : `"string"`|string|
|**pro_pic**  <br>*可选*|封面  <br>**样例** : `"string"`|string|
|**product_name**  <br>*可选*|产品标题  <br>**样例** : `"string"`|string|
|**thumb**  <br>*可选*|产品图片  <br>**样例** : `"string"`|string|


<a name="visabasevo"></a>
### VisaBaseVO

|名称|说明|类型|
|---|---|---|
|**countLabel**  <br>*可选*|例如：1人已报名  <br>**样例** : `"string"`|string|
|**coverImg**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|签证状态 1为报名中 2为已下架 3为被删除  <br>**样例** : `0`|integer (int32)|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|
|**visaName**  <br>*可选*|签证标题  <br>**样例** : `"string"`|string|
|**visaPrice**  <br>*可选*|价格  <br>**样例** : `0.0`|number|


<a name="visabookdetailvo"></a>
### VisaBookDetailVO

|名称|说明|类型|
|---|---|---|
|**address_url**  <br>*可选*|选择地址url  <br>**样例** : `"string"`|string|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**city**  <br>*可选*|送签地  <br>**样例** : `"string"`|string|
|**endTime**  <br>*可选*|结束时间  <br>**样例** : `"string"`|string|
|**expressTip**  <br>*可选*|例如：电子签将发送至您邮箱，收签信息选自取避免产生邮费  <br>**样例** : `"string"`|string|
|**matterAddr**  <br>*可选*|自取地址  <br>**样例** : `"string"`|string|
|**notes**  <br>*可选*|预订须知  <br>**样例** : `"string"`|string|
|**passport_exp**  <br>*可选*|签证有效日期  <br>**样例** : `0`|integer (int32)|
|**passport_tip**  <br>*可选*|签证有效日期提示  <br>**样例** : `"string"`|string|
|**pkgName**  <br>*可选*|签证套餐名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|产品价格  <br>**样例** : `0.0`|number|
|**startTime**  <br>*可选*|出发时间  <br>**样例** : `"string"`|string|
|**userinfo**  <br>*可选*|联系人信息  <br>**样例** : `"[usercontactbeanvo](#usercontactbeanvo)"`|[UserContactBeanVO](#usercontactbeanvo)|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|
|**visaName**  <br>*可选*|签证产品名称  <br>**样例** : `"string"`|string|


<a name="visabookvo"></a>
### VisaBookVO

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**endTime**  <br>*可选*|结束时间  <br>**样例** : `"string"`|string|
|**startTime**  <br>*可选*|出发时间  <br>**样例** : `"string"`|string|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|


<a name="visachannelbase"></a>
### VisaChannelBase

|名称|说明|类型|
|---|---|---|
|**hotCountry**  <br>*可选*|热门国家  <br>**样例** : `[ "[4af34500f9ee1f3bb65b707df9ffc521](#4af34500f9ee1f3bb65b707df9ffc521)" ]`|< [频道推荐](#4af34500f9ee1f3bb65b707df9ffc521) > array|
|**hotLines**  <br>*可选*|热门线路  <br>**样例** : `[ "[4af34500f9ee1f3bb65b707df9ffc521](#4af34500f9ee1f3bb65b707df9ffc521)" ]`|< [频道推荐](#4af34500f9ee1f3bb65b707df9ffc521) > array|
|**specialRecommend**  <br>*可选*|特别推荐  <br>**样例** : `[ "[4af34500f9ee1f3bb65b707df9ffc521](#4af34500f9ee1f3bb65b707df9ffc521)" ]`|< [频道推荐](#4af34500f9ee1f3bb65b707df9ffc521) > array|


<a name="visacommentvo"></a>
### VisaCommentVO

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评论时间  <br>**样例** : `0`|integer (int64)|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**rank**  <br>*可选*|评级  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|昵称  <br>**样例** : `"string"`|string|


<a name="visacommentvo_1"></a>
### VisaCommentVO_1

|名称|说明|类型|
|---|---|---|
|**addtime**  <br>*可选*|评论时间  <br>**样例** : `0`|integer (int64)|
|**avatar**  <br>*可选*|头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|评论内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**productName**  <br>*可选*|签证名称  <br>**样例** : `"string"`|string|
|**rank**  <br>*可选*|评级  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|昵称  <br>**样例** : `"string"`|string|


<a name="visacountry"></a>
### VisaCountry

|名称|说明|类型|
|---|---|---|
|**belongType**  <br>*可选*|所属筛选类型 热门/亚洲/欧美澳非/免签落地签/海岛  <br>**样例** : `"string"`|string|
|**countryId**  <br>*可选*|国家编号  <br>**样例** : `0`|integer (int32)|
|**countryName**  <br>*可选*|国家名称  <br>**样例** : `"string"`|string|
|**destName**  <br>*可选*|目的地名称(除海岛外，目的地即国家名称)  <br>**样例** : `"string"`|string|
|**parentType**  <br>*可选*|所属顶部类型 1热门 2亚洲 3欧美澳非 4免签落地签 5海岛  <br>**样例** : `0`|integer (int32)|


<a name="visacountrybase"></a>
### VisaCountryBase

|名称|说明|类型|
|---|---|---|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**visaCountries**  <br>*可选*|**样例** : `[ "[visacountry](#visacountry)" ]`|< [VisaCountry](#visacountry) > array|


<a name="visacountrypackvo"></a>
### VisaCountryPackVO

|名称|说明|类型|
|---|---|---|
|**countryName**  <br>*可选*|国家名称  <br>**样例** : `"string"`|string|
|**qzFlag**  <br>*可选*|国旗  <br>**样例** : `"string"`|string|
|**qzShowTabs**  <br>*可选*|显示栏位  <br>**样例** : `[ "string" ]`|< string > array|
|**qzTips**  <br>*可选*|签证小贴士  <br>**样例** : `"string"`|string|
|**qzType**  <br>*可选*|签证类型  免签/落地签/提前签证  <br>**样例** : `"string"`|string|
|**qzWay**  <br>*可选*|电子签/贴签 逗号隔开  <br>**样例** : `"string"`|string|


<a name="visacouponvo"></a>
### VisaCouponVO

|名称|说明|类型|
|---|---|---|
|**icon**  <br>*可选*|图标  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|title名称  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|


<a name="visacreatedealvo"></a>
### VisaCreateDealVO

|名称|说明|类型|
|---|---|---|
|**appId**  <br>*可选*|**样例** : `"string"`|string|
|**appid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**codeUrl**  <br>*可选*|微信支付-pc使用，使用时按照URL格式转成二维码即可  <br>**样例** : `"string"`|string|
|**errorUrl**  <br>*可选*|**样例** : `"string"`|string|
|**html**  <br>*可选*|快钱-使用  <br>**样例** : `"string"`|string|
|**isInnerPaySuccess**  <br>*可选*|是否内部交易支付成功，例如：0元和余额支付，成功后直接跳转支付成功页面  <br>**样例** : `0`|integer (int32)|
|**net**  <br>*可选*|**样例** : `"string"`|string|
|**nonceStr**  <br>*可选*|**样例** : `"string"`|string|
|**noncestr**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**orderString**  <br>*可选*|支付宝-使用  <br>**样例** : `"string"`|string|
|**package**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**partnerid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**paySign**  <br>*可选*|**样例** : `"string"`|string|
|**prepayid**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**sign**  <br>*可选*|微信-使用  <br>**样例** : `"string"`|string|
|**signType**  <br>*可选*|**样例** : `"string"`|string|
|**successUrl**  <br>*可选*|**样例** : `"string"`|string|
|**timeStamp**  <br>*可选*|**样例** : `"string"`|string|
|**timestamp**  <br>*可选*|微信-使用  <br>**样例** : `0`|integer (int32)|


<a name="visafavoritevo"></a>
### VisaFavoriteVO

|名称|说明|类型|
|---|---|---|
|**isSuccess**  <br>*可选*|是否成功 true成功 false 失败  <br>**样例** : `true`|boolean|
|**msg**  <br>*可选*|详细消息  <br>**样例** : `"string"`|string|


<a name="visainfovo"></a>
### VisaInfoVO

|名称|说明|类型|
|---|---|---|
|**acceptScope**  <br>*可选*|受理范围  <br>**样例** : `"string"`|string|
|**approvalRate**  <br>*可选*|出签率 后台暂时返回 固定值 99.9%  <br>**样例** : `"string"`|string|
|**canstaydays**  <br>*可选*|可停留天数  <br>**样例** : `"string"`|string|
|**commentCount**  <br>*可选*|评论数量  <br>**样例** : `0`|integer (int64)|
|**costInclude**  <br>*可选*|费用包含  <br>**样例** : `"string"`|string|
|**costNotInclude**  <br>*可选*|费用不含  <br>**样例** : `"string"`|string|
|**coverImgs**  <br>*可选*|封面图片  <br>**样例** : `[ "object" ]`|< object > array|
|**detailH5Url**  <br>*可选*|签证详情底部h5页面  <br>**样例** : `"string"`|string|
|**discount**  <br>*可选*|签证优惠信息  <br>**样例** : `"[visacouponvo](#visacouponvo)"`|[VisaCouponVO](#visacouponvo)|
|**id**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|
|**isFavorite**  <br>*可选*|是否收藏 true已收藏 false未收藏  <br>**样例** : `true`|boolean|
|**materialAddr**  <br>*可选*|邮寄地址  <br>**样例** : `"string"`|string|
|**maxPrice**  <br>*可选*|最高价格  <br>**样例** : `0.0`|number|
|**minPrice**  <br>*可选*|最低价格  <br>**样例** : `0.0`|number|
|**mostprocesslength**  <br>*可选*|最迟办理天数  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|签证名  <br>**样例** : `"string"`|string|
|**otherpic**  <br>*可选*|其他图片  <br>**样例** : `"string"`|string|
|**packs**  <br>*可选*|套餐  <br>**样例** : `[ "[visapackvo](#visapackvo)" ]`|< [VisaPackVO](#visapackvo) > array|
|**processlength**  <br>*可选*|办理时长 单位天数  <br>**样例** : `"string"`|string|
|**qa**  <br>*可选*|常见问题  <br>**样例** : `"string"`|string|
|**qiyu**  <br>*可选*|七余客服信息  <br>**样例** : `"[qiyumodel](#qiyumodel)"`|[QiyuModel](#qiyumodel)|
|**requirement**  <br>*可选*|所需材料  <br>**样例** : `[ "[visarequiredmaterialsvo](#visarequiredmaterialsvo)" ]`|< [VisaRequiredmaterialsVO](#visarequiredmaterialsvo) > array|
|**reservationNotes**  <br>*可选*|预订须知  <br>**样例** : `"string"`|string|
|**shareCover**  <br>*可选*|签证详情分享图片  <br>**样例** : `"string"`|string|
|**shareMsg**  <br>*可选*|签证详情分享信息  <br>**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|签证详情分享链接  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|商品状态 1为报名中 2为已下架 3为被删除  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|签证详情H5链接  <br>**样例** : `"string"`|string|
|**validperiod**  <br>*可选*|签证有效期  <br>**样例** : `"string"`|string|
|**visaOrdercomment**  <br>*可选*|签证详情内查找四星及四星以上的创建时间最近的一条  <br>**样例** : `"[visacommentvo](#visacommentvo)"`|[VisaCommentVO](#visacommentvo)|
|**visaType**  <br>*可选*|签证类型 1为个人旅游签证 2为探访亲友签证 3为商务签证  这是一个json字符串 因为是多选的  <br>**样例** : `"string"`|string|
|**visacollar**  <br>*可选*|签证领区(送签地)  <br>**样例** : `"string"`|string|


<a name="visaorderdetailvo"></a>
### VisaOrderDetailVO

|名称|说明|类型|
|---|---|---|
|**addr**  <br>*可选*|收货地址  <br>**样例** : `"string"`|string|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**cancelbtn**  <br>*可选*|取消订单按钮  <br>**样例** : `0`|integer (int32)|
|**commentbtn**  <br>*可选*|评价按钮  <br>**样例** : `0`|integer (int32)|
|**ctreatTime**  <br>*可选*|下单时间  <br>**样例** : `"string"`|string (date-time)|
|**deleteMsg**  <br>*可选*|提示删除信息  <br>**样例** : `"string"`|string|
|**deletebtn**  <br>*可选*|删除订单按钮  <br>**样例** : `0`|integer (int32)|
|**email**  <br>*可选*|联系人邮箱  <br>**样例** : `"string"`|string|
|**express**  <br>*可选*|领取方式 ：快递:1   自取:2  <br>**样例** : `0`|integer (int32)|
|**invoiceEnabledbtn**  <br>*可选*|判断是否能索取发票  <br>**样例** : `0`|integer (int32)|
|**invoiceMsg**  <br>*可选*|提示索取发票信息  <br>**样例** : `"string"`|string|
|**invoicebtn**  <br>*可选*|索取发票按钮  <br>**样例** : `0`|integer (int32)|
|**matterAddr**  <br>*可选*|自取地址  <br>**样例** : `"string"`|string|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**orderNo**  <br>*可选*|订单编号  <br>**样例** : `"string"`|string|
|**orderNum**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**paybtn**  <br>*可选*|去付款按钮  <br>**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|联系人电话  <br>**样例** : `"string"`|string|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**pkgName**  <br>*可选*|签证套餐名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|产品价格  <br>**样例** : `0.0`|number|
|**qiyuData**  <br>*可选*|**样例** : `"string"`|string|
|**qiyuUrl**  <br>*可选*|**样例** : `"string"`|string|
|**qiyuroupId**  <br>*可选*|**样例** : `"string"`|string|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|七鱼url  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|订单状态1未支付 2已付款 3已删除 4已关闭 5完全退款 6已送签 7交易成功结束 8退款中 9待收货 10待自取  <br>**样例** : `0`|integer (int32)|
|**statusDesc**  <br>*可选*|订单状态文字描述 1未支付 2已付款 3已删除 4已关闭 5完全退款 6已送签 7交易成功结束 8退款中 9待收货 10待自取  <br>**样例** : `"string"`|string|
|**sureMsg**  <br>*可选*|提示确认收货按钮信息  <br>**样例** : `"string"`|string|
|**surebtn**  <br>*可选*|确认收货按钮  <br>**样例** : `0`|integer (int32)|
|**unitPrice**  <br>*可选*|单价  <br>**样例** : `0.0`|number|
|**userList**  <br>*可选*|办签人列表  <br>**样例** : `[ "[userbeanvo](#userbeanvo)" ]`|< [UserBeanVO](#userbeanvo) > array|
|**userName**  <br>*可选*|联系人名称  <br>**样例** : `"string"`|string|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|
|**viewCommentbtn**  <br>*可选*|查看评价按钮  <br>**样例** : `0`|integer (int32)|
|**viewInvoicebtn**  <br>*可选*|查看发票按钮  <br>**样例** : `0`|integer (int32)|
|**visaDesc**  <br>*可选*|产品描述  <br>**样例** : `"string"`|string|
|**visaName**  <br>*可选*|签证产品名称  <br>**样例** : `"string"`|string|


<a name="visaorderlistitemvo"></a>
### VisaOrderListItemVO

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**cancelbtn**  <br>*可选*|取消订单按钮  <br>**样例** : `0`|integer (int32)|
|**commentbtn**  <br>*可选*|评价按钮  <br>**样例** : `0`|integer (int32)|
|**deleteMsg**  <br>*可选*|提示删除信息  <br>**样例** : `"string"`|string|
|**deletebtn**  <br>*可选*|删除订单按钮  <br>**样例** : `0`|integer (int32)|
|**invoiceEnabledbtn**  <br>*可选*|判断是否能索取发票  <br>**样例** : `0`|integer (int32)|
|**invoiceMsg**  <br>*可选*|提示索取发票信息  <br>**样例** : `"string"`|string|
|**invoicebtn**  <br>*可选*|索取发票按钮  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|订单id  <br>**样例** : `0`|integer (int32)|
|**orderNo**  <br>*可选*|订单编号  <br>**样例** : `"string"`|string|
|**orderNum**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**paybtn**  <br>*可选*|去付款按钮  <br>**样例** : `0`|integer (int32)|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**pkgName**  <br>*可选*|签证套餐名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|产品价格  <br>**样例** : `0.0`|number|
|**qiyuData**  <br>*可选*|**样例** : `"string"`|string|
|**qiyuUrl**  <br>*可选*|**样例** : `"string"`|string|
|**qiyuroupId**  <br>*可选*|**样例** : `"string"`|string|
|**shareUrl**  <br>*可选*|七鱼url  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|订单状态1未支付 2已付款 3已删除 4已关闭 5完全退款 6已送签 7交易成功结束 8退款中 9待收货 10待自取  <br>**样例** : `0`|integer (int32)|
|**statusDesc**  <br>*可选*|订单状态文字描述 1未支付 2已付款 3已删除 4已关闭 5完全退款 6已送签 7交易成功结束 8退款中 9待收货 10待自取  <br>**样例** : `"string"`|string|
|**sureMsg**  <br>*可选*|提示确认收货按钮信息  <br>**样例** : `"string"`|string|
|**surebtn**  <br>*可选*|确认收货按钮  <br>**样例** : `0`|integer (int32)|
|**unitPrice**  <br>*可选*|单价  <br>**样例** : `0.0`|number|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|
|**viewCommentbtn**  <br>*可选*|查看评价按钮  <br>**样例** : `0`|integer (int32)|
|**viewInvoicebtn**  <br>*可选*|查看发票按钮  <br>**样例** : `0`|integer (int32)|
|**visaName**  <br>*可选*|签证产品名称  <br>**样例** : `"string"`|string|


<a name="visaorderpaydetailvo"></a>
### VisaOrderPayDetailVO

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|订单价格  <br>**样例** : `0`|integer (int32)|
|**pkgName**  <br>*可选*|签证套餐名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**sec**  <br>*可选*|还剩下多少秒  <br>**样例** : `0`|integer (int32)|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|
|**visaName**  <br>*可选*|签证产品名称  <br>**样例** : `"string"`|string|


<a name="visaordersavevo"></a>
### VisaOrderSaveVO

|名称|说明|类型|
|---|---|---|
|**bid**  <br>*可选*|签证套餐id  <br>**样例** : `0`|integer (int32)|
|**oid**  <br>*可选*|订单价格  <br>**样例** : `0`|integer (int32)|
|**pkgName**  <br>*可选*|签证套餐名称  <br>**样例** : `"string"`|string|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**sec**  <br>*可选*|还剩下多少秒  <br>**样例** : `0`|integer (int32)|
|**vid**  <br>*可选*|签证产品id  <br>**样例** : `0`|integer (int32)|
|**visaName**  <br>*可选*|签证产品名称  <br>**样例** : `"string"`|string|


<a name="visapackvo"></a>
### VisaPackVO

|名称|说明|类型|
|---|---|---|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**deletedAt**  <br>*可选*|删除时间  <br>**样例** : `"string"`|string (date-time)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**info**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**isDefault**  <br>*可选*|是否默认 1为是 2为否  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|套餐名  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|显示排序  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**updatedAt**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|


<a name="visarequiredmaterialsmodel"></a>
### VisaRequiredmaterialsModel

|名称|说明|类型|
|---|---|---|
|**attachments**  <br>*可选*|材料图片  <br>**样例** : `"string"`|string|
|**certType**  <br>*可选*|1原件2复印件  <br>**样例** : `true`|boolean|
|**content**  <br>*可选*|材料内容  <br>**样例** : `"string"`|string|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**deletedAt**  <br>*可选*|删除时间  <br>**样例** : `"string"`|string (date-time)|
|**file**  <br>*可选*|可下载材料的文件地址  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|所属材料编号  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|材料名  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**required**  <br>*可选*|是否必须 1为是 2为否  <br>**样例** : `true`|boolean|
|**type**  <br>*可选*|1在职人员 2学生 3家庭主妇 4退休人员 5无业人员  <br>**样例** : `0`|integer (int32)|
|**updatedAt**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|


<a name="visarequiredmaterialsvo"></a>
### VisaRequiredmaterialsVO

|名称|说明|类型|
|---|---|---|
|**attachments**  <br>*可选*|材料图片  <br>**样例** : `"string"`|string|
|**certType**  <br>*可选*|1原件2复印件  <br>**样例** : `true`|boolean|
|**content**  <br>*可选*|材料内容  <br>**样例** : `"string"`|string|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**deletedAt**  <br>*可选*|删除时间  <br>**样例** : `"string"`|string (date-time)|
|**file**  <br>*可选*|可下载材料的文件地址  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|材料名  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**required**  <br>*可选*|是否必须 1为是 2为否  <br>**样例** : `true`|boolean|
|**type**  <br>*可选*|1在职人员 2学生 3家庭主妇 4退休人员 5无业人员  <br>**样例** : `0`|integer (int32)|
|**updatedAt**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|


<a name="visasearchvo"></a>
### VisaSearchVO

|名称|说明|类型|
|---|---|---|
|**isCountry**  <br>*可选*|isCountry true是国家 false 不是国家  <br>**样例** : `true`|boolean|
|**search**  <br>*可选*|搜索词  <br>**样例** : `"string"`|string|


<a name="votevo"></a>
### VoteVO

|名称|说明|类型|
|---|---|---|
|**h5LeftVote**  <br>*可选*|h5剩余票数  <br>**样例** : `0`|integer (int32)|
|**left_vote**  <br>*可选*|剩余投票数  <br>**样例** : `0`|integer (int32)|
|**msg**  <br>*可选*|返回消息  <br>**样例** : `"string"`|string|
|**voted**  <br>*可选*|已投票数  <br>**样例** : `0`|integer (int32)|


<a name="voucherbean"></a>
### VoucherBean

|名称|说明|类型|
|---|---|---|
|**voucherAmount**  <br>*可选*|预售券抵扣金额  <br>**样例** : `0.0`|number|
|**voucherIncreaseAmount**  <br>*可选*|预售券加价金额  <br>**样例** : `0.0`|number|


<a name="voucherfavoritelistvo"></a>
### VoucherFavoriteListVO

|名称|说明|类型|
|---|---|---|
|**dest**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**destId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**imageUrl**  <br>*可选*|图片url  <br>**样例** : `"string"`|string|
|**murl**  <br>*可选*|**样例** : `"string"`|string|
|**peopleCountTip**  <br>*可选*|销售人数  <br>**样例** : `"string"`|string|
|**salePrice**  <br>*可选*|起售价  <br>**样例** : `"string"`|string|
|**tag**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**voucherId**  <br>*可选*|房券id  <br>**样例** : `0`|integer (int32)|
|**voucherName**  <br>*可选*|房券名称  <br>**样例** : `"string"`|string|


<a name="weektopcalendervo"></a>
### WeekTopCalenderVO

|名称|说明|类型|
|---|---|---|
|**calender**  <br>*可选*|日历数据  <br>**样例** : `[ "[topcalendervo](#topcalendervo)" ]`|< [TopCalenderVO](#topcalendervo) > array|
|**month**  <br>*可选*|月份  <br>**样例** : `"string"`|string|


<a name="weektopvo"></a>
### WeekTopVO

|名称|说明|类型|
|---|---|---|
|**imageUrl**  <br>*可选*|**样例** : `"string"`|string|
|**price**  <br>*可选*|**样例** : `"string"`|string|
|**tid**  <br>*可选*|**样例** : `0`|integer (int64)|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="worksvo"></a>
### WorksVO

|名称|说明|类型|
|---|---|---|
|**album_id**  <br>*可选*|作品id  <br>**样例** : `0`|integer (int32)|


<a name="yxkapiresponse"></a>
### YXkApiResponse

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7536f48ef38c068c213d9a0b951986dc"></a>
### YXkApiResponse«APPEvaluationListV2VO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[appevaluationlistv2vo](#appevaluationlistv2vo)"`|[APPEvaluationListV2VO](#appevaluationlistv2vo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="201876c8b1077a568b78de7137a68f5b"></a>
### YXkApiResponse«AddressDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[addressdetailvo](#addressdetailvo)"`|[AddressDetailVO](#addressdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5f7d77b0abc396b3ee8ca0c32bd2dcde"></a>
### YXkApiResponse«AdvanceMedalDetail»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[advancemedaldetail](#advancemedaldetail)"`|[AdvanceMedalDetail](#advancemedaldetail)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d4ad47d988f29595942e266646661912"></a>
### YXkApiResponse«AlbumCollectsVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[albumcollectsvo](#albumcollectsvo)"`|[AlbumCollectsVO](#albumcollectsvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="075c5bf8fca4669e913c5c196aec3063"></a>
### YXkApiResponse«AlbumCommentPriseVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[albumcommentprisevo](#albumcommentprisevo)"`|[AlbumCommentPriseVO](#albumcommentprisevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0035572b474fb39036a3560a75977ad2"></a>
### YXkApiResponse«AlbumShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[albumsharevo](#albumsharevo)"`|[AlbumShareVO](#albumsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2e6b98cc9339954d0c56b9799f165d3d"></a>
### YXkApiResponse«AlbumSubcribesVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[albumsubcribesvo](#albumsubcribesvo)"`|[AlbumSubcribesVO](#albumsubcribesvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5ee497f1b23078bcdb54e8c38348dc87"></a>
### YXkApiResponse«AlbumsMineVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[albumsminevo](#albumsminevo)"`|[AlbumsMineVO](#albumsminevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="14390a3c12056d9b00983afaeb6a2fd7"></a>
### YXkApiResponse«AppDestinationVOV2»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[appdestinationvov2](#appdestinationvov2)"`|[AppDestinationVOV2](#appdestinationvov2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5601bc96e9ad4d8e18ccaaed821dc529"></a>
### YXkApiResponse«AppDestinationVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[appdestinationvo](#appdestinationvo)"`|[AppDestinationVO](#appdestinationvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="387eb4137e861d14f0ee4861e617a2cb"></a>
### YXkApiResponse«AppIndexVOV2»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[appindexvov2](#appindexvov2)"`|[AppIndexVOV2](#appindexvov2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9968eca6c78cce44459eaabac6701786"></a>
### YXkApiResponse«AppIndexVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[appindexvo](#appindexvo)"`|[AppIndexVO](#appindexvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8c7d77039420ccebd1bc9ab6820bedb8"></a>
### YXkApiResponse«AppLocationVOV2»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[applocationvov2](#applocationvov2)"`|[AppLocationVOV2](#applocationvov2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="dae707ec27b934b18684f11d85b97ae6"></a>
### YXkApiResponse«AroundCalendarIndexVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[aroundcalendarindexvo](#aroundcalendarindexvo)"`|[AroundCalendarIndexVO](#aroundcalendarindexvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="db7d013ad1c9f444764e80ed61966732"></a>
### YXkApiResponse«AroundCalendarProductVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[aroundcalendarproductvo](#aroundcalendarproductvo)"`|[AroundCalendarProductVO](#aroundcalendarproductvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="263d48e0ec10fbb873b00aac95da4533"></a>
### YXkApiResponse«AroundFlowVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[aroundflowvo](#aroundflowvo)"`|[AroundFlowVO](#aroundflowvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="63a00f29feee684cd87d72e4dd99ef6e"></a>
### YXkApiResponse«AroundIndexVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[aroundindexvo](#aroundindexvo)"`|[AroundIndexVO](#aroundindexvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f5c28d5e448240fbdf91e072238d8a2f"></a>
### YXkApiResponse«AthleticsRankVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[athleticsrankvo](#athleticsrankvo)"`|[AthleticsRankVo](#athleticsrankvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="20c628d7090875eba82213d7a027a7d5"></a>
### YXkApiResponse«AthleticsSelfVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[athleticsselfvo](#athleticsselfvo)"`|[AthleticsSelfVo](#athleticsselfvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="378e368206ef02692f59785bd844d911"></a>
### YXkApiResponse«AttitudePriseVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[attitudeprisevo](#attitudeprisevo)"`|[AttitudePriseVO](#attitudeprisevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="676c1adf5015a50317a09e88d769ac87"></a>
### YXkApiResponse«BargainShareVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[bargainsharevo](#bargainsharevo)"`|[BargainShareVo](#bargainsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="583de3d5a8de483e67b8cf351b7f483f"></a>
### YXkApiResponse«BaseHandlerVO«Line»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[3bb47610c281a7f2281f17c774d8fdcf](#3bb47610c281a7f2281f17c774d8fdcf)"`|[BaseHandlerVO«Line»](#3bb47610c281a7f2281f17c774d8fdcf)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0db0671a175b1a07f3c5eb2687a6ed8e"></a>
### YXkApiResponse«BaseListVO«List«ProductBasicModel»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[be213280871aede5915764e60485a5b6](#be213280871aede5915764e60485a5b6)"`|[BaseListVO«List«ProductBasicModel»»](#be213280871aede5915764e60485a5b6)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3920d0dec6109dfd06986e3ec90b995c"></a>
### YXkApiResponse«BaseListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[baselistvo](#baselistvo)"`|[BaseListVO](#baselistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9893df699525fda07ffb7d7e87269062"></a>
### YXkApiResponse«BatchCalendarVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[batchcalendarvo](#batchcalendarvo)"`|[BatchCalendarVo](#batchcalendarvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="84fd746c996da1374cdab823a17638ba"></a>
### YXkApiResponse«BbsPageVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[bbspagevo](#bbspagevo)"`|[BbsPageVO](#bbspagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ddc16b312df5b8836e614287ed2ab926"></a>
### YXkApiResponse«CardUserListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[carduserlistvo](#carduserlistvo)"`|[CardUserListVO](#carduserlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1933e72e4b08a423b6b4177eb876174b"></a>
### YXkApiResponse«CategorysVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[categorysvo](#categorysvo)"`|[CategorysVO](#categorysvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="915155a840b4a8befaf23255819ee383"></a>
### YXkApiResponse«CertificationApplyResultTypeVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[certificationapplyresulttypevo](#certificationapplyresulttypevo)"`|[CertificationApplyResultTypeVO](#certificationapplyresulttypevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="53bd6c814fdbfe3d329271b542d58610"></a>
### YXkApiResponse«CertificationIntroductionVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[certificationintroductionvo](#certificationintroductionvo)"`|[CertificationIntroductionVO](#certificationintroductionvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1385a4373356650c281ca5f342bfb701"></a>
### YXkApiResponse«ChannelRecommendListVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[channelrecommendlistvo](#channelrecommendlistvo)"`|[ChannelRecommendListVo](#channelrecommendlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="be62a56510bb3fa67c317e609259e34b"></a>
### YXkApiResponse«ChannelShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[channelsharevo](#channelsharevo)"`|[ChannelShareVO](#channelsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a07c4cbd17284c37acf8618c93bef124"></a>
### YXkApiResponse«ChannelVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[channelvo](#channelvo)"`|[ChannelVo](#channelvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e90244e39c47f6bbcd9df9055a6ab0c7"></a>
### YXkApiResponse«CheckinSuccessVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[checkinsuccessvo](#checkinsuccessvo)"`|[CheckinSuccessVO](#checkinsuccessvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e506b589b2766397c4dee5307141774f"></a>
### YXkApiResponse«CheckinVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[checkinvo](#checkinvo)"`|[CheckinVo](#checkinvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f98f7759c3d210d05fc027c1b90eaa56"></a>
### YXkApiResponse«ChildFlowTags»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[childflowtags](#childflowtags)"`|[ChildFlowTags](#childflowtags)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="549a8552408992a4a154dbb51cd4c74e"></a>
### YXkApiResponse«CollectVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[collectvo](#collectvo)"`|[CollectVO](#collectvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ee83231e7dbbed7b5db02023be80e0ae"></a>
### YXkApiResponse«CommentDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[commentdetailvo](#commentdetailvo)"`|[CommentDetailVO](#commentdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4b5676b0ba913f5a9321cf942bcd9b02"></a>
### YXkApiResponse«Commentslist»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[commentslist](#commentslist)"`|[Commentslist](#commentslist)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d476abf8ac24741fc9a63d03b9545b89"></a>
### YXkApiResponse«CompetitionAward»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[competitionaward](#competitionaward)"`|[CompetitionAward](#competitionaward)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3fc5c34983a590a5741d6d66f48c0b81"></a>
### YXkApiResponse«CompetitionDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[competitiondetailvo](#competitiondetailvo)"`|[CompetitionDetailVO](#competitiondetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="759ad692e66af465deef6527c26a6d1a"></a>
### YXkApiResponse«ConfigVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[configvo](#configvo)"`|[ConfigVo](#configvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3590c6f02c7b22e034921d9a7f5dba25"></a>
### YXkApiResponse«ConpoundMedalDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[conpoundmedaldetailvo](#conpoundmedaldetailvo)"`|[ConpoundMedalDetailVO](#conpoundmedaldetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="391c2078025b47781c87175983609c67"></a>
### YXkApiResponse«ConstellationDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[constellationdetailvo](#constellationdetailvo)"`|[ConstellationDetailVO](#constellationdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d98c140eac5a3aed40ebb0627d22dbc4"></a>
### YXkApiResponse«ContentCountResponseVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[contentcountresponsevo](#contentcountresponsevo)"`|[ContentCountResponseVo](#contentcountresponsevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="dd474b544e41675fa44db79db55271c2"></a>
### YXkApiResponse«ContentFilterVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[contentfiltervo](#contentfiltervo)"`|[ContentFilterVO](#contentfiltervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c72fcad652706c546ddd09f9ffba5f4e"></a>
### YXkApiResponse«CopyrightsVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[copyrightsvo](#copyrightsvo)"`|[CopyrightsVO](#copyrightsvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2fe36982d42bf93f927036c34b77bbac"></a>
### YXkApiResponse«CountdownTaskDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[countdowntaskdetailvo](#countdowntaskdetailvo)"`|[CountdownTaskDetailVO](#countdowntaskdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ab4579c07e57133427a95651976b9e8d"></a>
### YXkApiResponse«CouponShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[couponsharevo](#couponsharevo)"`|[CouponShareVO](#couponsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="797a5b8f20c319e465c19d199344f2fb"></a>
### YXkApiResponse«CouponsLinesListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[couponslineslistvo](#couponslineslistvo)"`|[CouponsLinesListVO](#couponslineslistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="09d5cfd503fd13c1ac96dbf157ff4988"></a>
### YXkApiResponse«CouponsListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[couponslistvo](#couponslistvo)"`|[CouponsListVO](#couponslistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e9ff13b518da5568b2ff3fbb26974a27"></a>
### YXkApiResponse«CreditsDuobaoVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[creditsduobaovo](#creditsduobaovo)"`|[CreditsDuobaoVO](#creditsduobaovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e6c3566bdb0be0fb6eebab11bf8a4c02"></a>
### YXkApiResponse«CreditsMallVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[creditsmallvo](#creditsmallvo)"`|[CreditsMallVO](#creditsmallvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a379177c1e45665344132a3e8f7d1dc9"></a>
### YXkApiResponse«DestBaseRespVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destbaserespvo](#destbaserespvo)"`|[DestBaseRespVO](#destbaserespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="95b40ddf135eb33db233c900598c6367"></a>
### YXkApiResponse«DestDetailRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destdetailrespvo](#destdetailrespvo)"`|[DestDetailRespVo](#destdetailrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="529de1bafe496d40af70bdfcb8d0c0da"></a>
### YXkApiResponse«DestFilmRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destfilmrespvo](#destfilmrespvo)"`|[DestFilmRespVo](#destfilmrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="06076300bceb822ba5430dd6a7e34513"></a>
### YXkApiResponse«DestIndexVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destindexvo](#destindexvo)"`|[DestIndexVO](#destindexvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9d2436a24b1b555cb0525ec7ba5c3e44"></a>
### YXkApiResponse«DestSearchRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destsearchrespvo](#destsearchrespvo)"`|[DestSearchRespVo](#destsearchrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ea305cfe181231c45d1dab1ab819fa00"></a>
### YXkApiResponse«DestSecenPhotosRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destsecenphotosrespvo](#destsecenphotosrespvo)"`|[DestSecenPhotosRespVo](#destsecenphotosrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="da90bb0b81ba968ca7c1234493ca6af3"></a>
### YXkApiResponse«DestSpnewsRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destspnewsrespvo](#destspnewsrespvo)"`|[DestSpnewsRespVo](#destspnewsrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="366843752598fc74e330d1009a71d641"></a>
### YXkApiResponse«DestThemeBaseRespVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destthemebaserespvo](#destthemebaserespvo)"`|[DestThemeBaseRespVO](#destthemebaserespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e736cafd6a2153e26c243aa585a29c5f"></a>
### YXkApiResponse«DestTravelRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[desttravelrespvo](#desttravelrespvo)"`|[DestTravelRespVo](#desttravelrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6f3b4d8128204d102b31f7f8c2b2a34c"></a>
### YXkApiResponse«DestWantRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destwantrespvo](#destwantrespvo)"`|[DestWantRespVo](#destwantrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6afab422bc0c06653a46ded3c43c37df"></a>
### YXkApiResponse«DestinationVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[destinationvo](#destinationvo)"`|[DestinationVO](#destinationvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0d904e3f77f5c2da2359283e48e91d31"></a>
### YXkApiResponse«DetailCommentVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[detailcommentvo](#detailcommentvo)"`|[DetailCommentVO](#detailcommentvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e61cc728b1a88fb7f7b9a10e578d5ee2"></a>
### YXkApiResponse«DirectoryVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[directoryvo](#directoryvo)"`|[DirectoryVO](#directoryvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="32fd3903778bd69500fc4f298ed6ccef"></a>
### YXkApiResponse«DiscoverColumnDetailUpVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovercolumndetailupvo](#discovercolumndetailupvo)"`|[DiscoverColumnDetailUpVO](#discovercolumndetailupvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="09704f64358f20ea9704f09394d198f8"></a>
### YXkApiResponse«DiscoverColumnListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovercolumnlistvo](#discovercolumnlistvo)"`|[DiscoverColumnListVO](#discovercolumnlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a57bab2e9022143272e5a3fc708b5c2c"></a>
### YXkApiResponse«DiscoverCommentDelVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovercommentdelvo](#discovercommentdelvo)"`|[DiscoverCommentDelVO](#discovercommentdelvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="375e519fcd801ed37a6f23035cef4a2d"></a>
### YXkApiResponse«DiscoverCommentPriseResultVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovercommentpriseresultvo](#discovercommentpriseresultvo)"`|[DiscoverCommentPriseResultVO](#discovercommentpriseresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="29e0810781853dbdbcf732d72c6d897c"></a>
### YXkApiResponse«DiscoverCommentVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovercommentvo_1](#discovercommentvo_1)"`|[DiscoverCommentVO_1](#discovercommentvo_1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ed5fd6803e07bcd7150003bf752ef2df"></a>
### YXkApiResponse«DiscoverFavariteVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverfavaritevo](#discoverfavaritevo)"`|[DiscoverFavariteVO](#discoverfavaritevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="db8d5b8385268f730ca9777bb149720d"></a>
### YXkApiResponse«DiscoverFollowedTopVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverfollowedtopvo](#discoverfollowedtopvo)"`|[DiscoverFollowedTopVo](#discoverfollowedtopvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5d166f76bd7e06a3dfe1373dde9ae291"></a>
### YXkApiResponse«DiscoverHotResponseVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverhotresponsevo](#discoverhotresponsevo)"`|[DiscoverHotResponseVo](#discoverhotresponsevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7f3c788dee0c7b23230270c974bd15f7"></a>
### YXkApiResponse«DiscoverModifyVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovermodifyvo](#discovermodifyvo)"`|[DiscoverModifyVO](#discovermodifyvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4371d25fc95d42c2c7616f6cbe2f5999"></a>
### YXkApiResponse«DiscoverPicShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverpicsharevo](#discoverpicsharevo)"`|[DiscoverPicShareVO](#discoverpicsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7615e411ce0d267f8edbd00fa55a9278"></a>
### YXkApiResponse«DiscoverPublishResultVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverpublishresultvo](#discoverpublishresultvo)"`|[DiscoverPublishResultVO](#discoverpublishresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3859c0f796e187a8677a20fc58929535"></a>
### YXkApiResponse«DiscoverVideoDetailResVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discovervideodetailresvo](#discovervideodetailresvo)"`|[DiscoverVideoDetailResVO](#discovervideodetailresvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="cfe2cf1eae89803d9d17173315cdc90b"></a>
### YXkApiResponse«DiscoverWeekListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discoverweeklistvo](#discoverweeklistvo)"`|[DiscoverWeekListVO](#discoverweeklistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c717033d19b0509e03c227c3222c45f3"></a>
### YXkApiResponse«DiscuDataVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discudatavo](#discudatavo)"`|[DiscuDataVo](#discudatavo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3e99f19760a774ace9066971b24bb321"></a>
### YXkApiResponse«DiscuDataVo»_1

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discudatavo_1](#discudatavo_1)"`|[DiscuDataVo_1](#discudatavo_1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b2a5c799854805a3091897dfb41e964b"></a>
### YXkApiResponse«DiscussListVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discusslistvo](#discusslistvo)"`|[DiscussListVo](#discusslistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="69d4bca98df10171999620a8c31eaa42"></a>
### YXkApiResponse«DiscussSaveVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[discusssavevo](#discusssavevo)"`|[DiscussSaveVo](#discusssavevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="43ac19b283a4bbdcf4b15483798561b0"></a>
### YXkApiResponse«DoingCompetitionlistVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[doingcompetitionlistvo](#doingcompetitionlistvo)"`|[DoingCompetitionlistVO](#doingcompetitionlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a1c38e3cd320a3ea3cbf918fc3753178"></a>
### YXkApiResponse«DuobaoDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[duobaodetailvo](#duobaodetailvo)"`|[DuobaoDetailVO](#duobaodetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="169ed5637cff408042ece837feb29cfc"></a>
### YXkApiResponse«EncourageSummaryVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[encouragesummaryvo](#encouragesummaryvo)"`|[EncourageSummaryVO](#encouragesummaryvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b293e8c139c5806f7c072a3cd3466839"></a>
### YXkApiResponse«EvaluationListVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[evaluationlistvo](#evaluationlistvo)"`|[EvaluationListVo](#evaluationlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7fb298d629fea5c3b8077505bc0b891b"></a>
### YXkApiResponse«ExchangeCouponDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[exchangecoupondetailvo](#exchangecoupondetailvo)"`|[ExchangeCouponDetailVO](#exchangecoupondetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1224c53a00df66d3b4b6d10cbbb65294"></a>
### YXkApiResponse«ExchangeCouponResultVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[exchangecouponresultvo](#exchangecouponresultvo)"`|[ExchangeCouponResultVO](#exchangecouponresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="82fb46d05fad99593a9b9278d6423b23"></a>
### YXkApiResponse«FavoritListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[favoritlistvo](#favoritlistvo)"`|[FavoritListVO](#favoritlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="06a6cf6b484aa37b6204e05a0add961b"></a>
### YXkApiResponse«FeeVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[feevo](#feevo)"`|[FeeVO](#feevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c64371de0b859e52f53532fa7865aaad"></a>
### YXkApiResponse«FilmCommentBean»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[filmcommentbean](#filmcommentbean)"`|[FilmCommentBean](#filmcommentbean)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="29f8223a3d2d073f3e2fc0c801aacee3"></a>
### YXkApiResponse«FilmCommentDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[filmcommentdetailvo](#filmcommentdetailvo)"`|[FilmCommentDetailVO](#filmcommentdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ddc72b7667888191afc831df255f0839"></a>
### YXkApiResponse«FilmProjectVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[filmprojectvo](#filmprojectvo)"`|[FilmProjectVO](#filmprojectvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fb8360cbfada09083a7bebae99482ce1"></a>
### YXkApiResponse«FilmlistVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[filmlistvo](#filmlistvo)"`|[FilmlistVO](#filmlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b98b94d6b5af50ebed1b3474a95db878"></a>
### YXkApiResponse«Film»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[film](#film)"`|[Film](#film)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fd7b183d07552d4fb670736264df387c"></a>
### YXkApiResponse«GoldVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[goldvo](#goldvo)"`|[GoldVo](#goldvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d7342cc7cd3f6c11aaa313340b9c07ea"></a>
### YXkApiResponse«GroupMemberInfoVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[groupmemberinfovo](#groupmemberinfovo)"`|[GroupMemberInfoVo](#groupmemberinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9b3fa6195e881a08b2813f9728d27220"></a>
### YXkApiResponse«GroupMembersWrapVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[groupmemberswrapvo](#groupmemberswrapvo)"`|[GroupMembersWrapVo](#groupmemberswrapvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="44bfb162c6a53ec2bbf560e759023b9f"></a>
### YXkApiResponse«GroupsListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[groupslistvo](#groupslistvo)"`|[GroupsListVO](#groupslistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f89ff859e6fd8474902daa45bc7afe4e"></a>
### YXkApiResponse«HWProductsVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hwproductsvo](#hwproductsvo)"`|[HWProductsVo](#hwproductsvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fe6f1977bb4d94e22130450552b8a7cd"></a>
### YXkApiResponse«HashMap«string,object»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b6403a414d6f3961772d44a78eb32165"></a>
### YXkApiResponse«HashMap»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="dd1da550a76e863c721232363b9f9d6b"></a>
### YXkApiResponse«HotTagVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hottagvo](#hottagvo)"`|[HotTagVO](#hottagvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="193b902feee13f2d26d1a5c3435e1b2f"></a>
### YXkApiResponse«HotelDetailVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hoteldetailvo](#hoteldetailvo)"`|[HotelDetailVo](#hoteldetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1a40739b3d8455e54da1bce0ca12e3f0"></a>
### YXkApiResponse«HotelEvaluationAddVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hotelevaluationaddvo](#hotelevaluationaddvo)"`|[HotelEvaluationAddVo](#hotelevaluationaddvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="14033ce1b583c4eae38b8fd1fbc15520"></a>
### YXkApiResponse«HotelEvaluationlistVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hotelevaluationlistvo](#hotelevaluationlistvo)"`|[HotelEvaluationlistVo](#hotelevaluationlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b1cd6a0a5f7c71a1b09d08ed040806b3"></a>
### YXkApiResponse«HotelFavoriteDetailVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[hotelfavoritedetailvo](#hotelfavoritedetailvo)"`|[HotelFavoriteDetailVo](#hotelfavoritedetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="958ce38781bac00c1ea784091aadb1c1"></a>
### YXkApiResponse«HtmlVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[htmlvo](#htmlvo)"`|[HtmlVO](#htmlvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="23beb4e6bf0c038bfea7ffc2cd42df35"></a>
### YXkApiResponse«ImGroupDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imgroupdetailvo](#imgroupdetailvo)"`|[ImGroupDetailVO](#imgroupdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c599ca8a1c1e8b13b361244cddcbba9a"></a>
### YXkApiResponse«ImGroupMemberInfoDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imgroupmemberinfodetailvo](#imgroupmemberinfodetailvo)"`|[ImGroupMemberInfoDetailVO](#imgroupmemberinfodetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9c485ec3a6cab700370b4367a11f90c4"></a>
### YXkApiResponse«ImGroupProviderVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imgroupprovidervo](#imgroupprovidervo)"`|[ImGroupProviderVO](#imgroupprovidervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="daae46f4611664c1670577493734a266"></a>
### YXkApiResponse«ImGroupProviderVO»_1

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imgroupprovidervo_1](#imgroupprovidervo_1)"`|[ImGroupProviderVO_1](#imgroupprovidervo_1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="79329ebea9676c1baaac6e1247b9c6fb"></a>
### YXkApiResponse«ImShareDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imsharedetailvo](#imsharedetailvo)"`|[ImShareDetailVO](#imsharedetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1420198f86bd9ec1e8ec59066b9705b2"></a>
### YXkApiResponse«ImUserProviderVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[imuserprovidervo](#imuserprovidervo)"`|[ImUserProviderVO](#imuserprovidervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="eab4d283c212b5a592ef06754f96ac65"></a>
### YXkApiResponse«InsuranceBean»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[insurancebean](#insurancebean)"`|[InsuranceBean](#insurancebean)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0a8331047610d3a4eef21bf4543e3c8f"></a>
### YXkApiResponse«IntegralVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[integralvo](#integralvo)"`|[IntegralVo](#integralvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b9cfdf3bb5f4d7e0e59c564087eb5341"></a>
### YXkApiResponse«InteractionMessageVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[interactionmessagevo](#interactionmessagevo)"`|[InteractionMessageVo](#interactionmessagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e7733121e4348970787c1e7e0380f7c8"></a>
### YXkApiResponse«InvoiceInfoAddVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[invoiceinfoaddvo](#invoiceinfoaddvo)"`|[InvoiceInfoAddVo](#invoiceinfoaddvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="79a5558a7910c415eeb04197ffd52fe3"></a>
### YXkApiResponse«JSONObject»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b2b36f0c4f1fe10c07e9ee3c47c88c21"></a>
### YXkApiResponse«JiuTaoIndexVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[jiutaoindexvo](#jiutaoindexvo)"`|[JiuTaoIndexVO](#jiutaoindexvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6043d791fb87ceb9961ab35dfc7797de"></a>
### YXkApiResponse«LikedVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[likedvo](#likedvo)"`|[LikedVO](#likedvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9a612ab35633d6cac22d8ce3973be9b7"></a>
### YXkApiResponse«LinesVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[linesvo](#linesvo)"`|[LinesVO](#linesvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="74ba9f3cc4ea8efa56e25601fae0d07d"></a>
### YXkApiResponse«LinkOpenVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[linkopenvo](#linkopenvo)"`|[LinkOpenVo](#linkopenvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="386c44bf73617bdbd00a47e20e392db6"></a>
### YXkApiResponse«ListWrapperVO«AttitudeOptionInfoVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[c1784e926c4dc6bf69cd19d03b6edd69](#c1784e926c4dc6bf69cd19d03b6edd69)"`|[ListWrapperVO«AttitudeOptionInfoVO»](#c1784e926c4dc6bf69cd19d03b6edd69)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="10c8c5c6da2279c3bb7419997ce188f3"></a>
### YXkApiResponse«ListWrapperVO«ColumnMedalVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8102d3a89a4937d148907ff41ba989e1](#8102d3a89a4937d148907ff41ba989e1)"`|[ListWrapperVO«ColumnMedalVO»](#8102d3a89a4937d148907ff41ba989e1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="aaa7c2930ab328c83baef7071bf5d837"></a>
### YXkApiResponse«ListWrapperVO«DestBaseRespVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[26242f50f44d27a951e8e8b25c1c3403](#26242f50f44d27a951e8e8b25c1c3403)"`|[ListWrapperVO«DestBaseRespVO»](#26242f50f44d27a951e8e8b25c1c3403)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0ab4c38b9517bc39e70dcefceb00d1aa"></a>
### YXkApiResponse«ListWrapperVO«DestThemeBaseRespVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ae3247fa63925560430b4170785d3621](#ae3247fa63925560430b4170785d3621)"`|[ListWrapperVO«DestThemeBaseRespVO»](#ae3247fa63925560430b4170785d3621)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4770def41a02138d4eea4b271081feee"></a>
### YXkApiResponse«ListWrapperVO«DiscoverEncourageVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[4b767e087e2f8b7dc2551333ec25b9f7](#4b767e087e2f8b7dc2551333ec25b9f7)"`|[ListWrapperVO«DiscoverEncourageVO»](#4b767e087e2f8b7dc2551333ec25b9f7)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="25d867cc3f6cf42d5e85ed4399139cd0"></a>
### YXkApiResponse«ListWrapperVO«DiscoverRankListVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[f419814316a0a49481f929bc62f6e922](#f419814316a0a49481f929bc62f6e922)"`|[ListWrapperVO«DiscoverRankListVO»](#f419814316a0a49481f929bc62f6e922)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0e1ae4e8fd10a10dbb111ffa42d5f78f"></a>
### YXkApiResponse«ListWrapperVO«DiscoverRelationVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[a87cbdb17c7f1ddfed6ccfc3e019a683](#a87cbdb17c7f1ddfed6ccfc3e019a683)"`|[ListWrapperVO«DiscoverRelationVO»](#a87cbdb17c7f1ddfed6ccfc3e019a683)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d0ef3a81bf167f494482ac162b80cd14"></a>
### YXkApiResponse«ListWrapperVO«EncourageConfigVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[f5387830381c3a091630e84100bd7eea](#f5387830381c3a091630e84100bd7eea)"`|[ListWrapperVO«EncourageConfigVO»](#f5387830381c3a091630e84100bd7eea)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="05ce6b1d1360031975a1a6238976523a"></a>
### YXkApiResponse«ListWrapperVO«ExchangeCouponVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[33ca0f8027225ed783299a3196cd29fe](#33ca0f8027225ed783299a3196cd29fe)"`|[ListWrapperVO«ExchangeCouponVO»](#33ca0f8027225ed783299a3196cd29fe)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="bc4c4a638cff159e4f7409d0e9700501"></a>
### YXkApiResponse«ListWrapperVO«ProductRecomendResponseVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[6824e42f0190565d2bd091310d710bb2](#6824e42f0190565d2bd091310d710bb2)"`|[ListWrapperVO«ProductRecomendResponseVO»](#6824e42f0190565d2bd091310d710bb2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7a533194db27fef8f4109442e44546a9"></a>
### YXkApiResponse«ListWrapperVO«TopicVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d2180bc1aa7b80eaacfa5b493cf0e4f6](#d2180bc1aa7b80eaacfa5b493cf0e4f6)"`|[ListWrapperVO«TopicVO»](#d2180bc1aa7b80eaacfa5b493cf0e4f6)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ab45821157c7c0be0d89f710d60ed785"></a>
### YXkApiResponse«ListWrapperVO«string»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[dbf4c8bed9d00872f14902a4aca5e221](#dbf4c8bed9d00872f14902a4aca5e221)"`|[ListWrapperVO«string»](#dbf4c8bed9d00872f14902a4aca5e221)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6cbea751f81cb148765cfaa325a3b196"></a>
### YXkApiResponse«ListWrapperVO«弹窗提示信息»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[07720a02134041bc59194abf8cab4e13](#07720a02134041bc59194abf8cab4e13)"`|[ListWrapperVO«弹窗提示信息»](#07720a02134041bc59194abf8cab4e13)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a8a4a11b97b9318e7849bc4addce6fce"></a>
### YXkApiResponse«ListWrapperVO«话题分类»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d525741561f5bc65ab488c2fcb59d567](#d525741561f5bc65ab488c2fcb59d567)"`|[ListWrapperVO«话题分类»](#d525741561f5bc65ab488c2fcb59d567)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1cc0f657ef365b61ecf65e4d57c34109"></a>
### YXkApiResponse«List«AddressListVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "[addresslistvo](#addresslistvo)" ]`|< [AddressListVO](#addresslistvo) > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4409d2e1be5155bdd3a8f88b4fdcada2"></a>
### YXkApiResponse«List«CheckinCalendarVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "[checkincalendarvo](#checkincalendarvo)" ]`|< [CheckinCalendarVO](#checkincalendarvo) > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="552513fa234afd3a057fcf20e5cd5f1c"></a>
### YXkApiResponse«List«Map«string,object»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="25fd5bbc22cb291fd54e0a5b8422795b"></a>
### YXkApiResponse«List«ProductJihediDataVo»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "[productjihedidatavo](#productjihedidatavo)" ]`|< [ProductJihediDataVo](#productjihedidatavo) > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6ffd8389eff659e536213f3e67208034"></a>
### YXkApiResponse«List«UserExchangeListVO»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "[userexchangelistvo](#userexchangelistvo)" ]`|< [UserExchangeListVO](#userexchangelistvo) > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="633fe231c28490a61bee7bf32422df2b"></a>
### YXkApiResponse«List«string»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1146ae92ebe6b4cb7f56e8c380b5ac9e"></a>
### YXkApiResponse«LoginVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[loginvo](#loginvo)"`|[LoginVO](#loginvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e5ee1d83142f10e0c1d715e0b8b24535"></a>
### YXkApiResponse«LucyNumberResultVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[lucynumberresultvo](#lucynumberresultvo)"`|[LucyNumberResultVO](#lucynumberresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0e2bbe3ebe18ecdfe59636a4c682dfd2"></a>
### YXkApiResponse«MallCreateDealVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[mallcreatedealvo](#mallcreatedealvo)"`|[MallCreateDealVO](#mallcreatedealvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="752c610fe8367188f536950d4145a1d2"></a>
### YXkApiResponse«MallOrderPayInfoVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[mallorderpayinfovo](#mallorderpayinfovo)"`|[MallOrderPayInfoVo](#mallorderpayinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e8c96c61c9c4852787a428f81f4f557a"></a>
### YXkApiResponse«Map«string,List«VisaCountryBase»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `{<br>  "string" : [ "[visacountrybase](#visacountrybase)" ]<br>}`|< string, < [VisaCountryBase](#visacountrybase) > array > map|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c5178aa99976e09b035635435e8ab8c3"></a>
### YXkApiResponse«Map«string,int»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `{<br>  "string" : 0<br>}`|< string, integer (int32) > map|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a4dc8b3d9ef0de21b689160822d74fa7"></a>
### YXkApiResponse«Map«string,object»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3dccc854d4a3cea726ec1555eb184bbc"></a>
### YXkApiResponse«MddMoreHotRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[mddmorehotrespvo](#mddmorehotrespvo)"`|[MddMoreHotRespVo](#mddmorehotrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c27878141557da53f12681b097819653"></a>
### YXkApiResponse«MddNearSceneRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[mddnearscenerespvo](#mddnearscenerespvo)"`|[MddNearSceneRespVo](#mddnearscenerespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="04218f761cc2fd3d44aefc76a8f0052c"></a>
### YXkApiResponse«MddNearSearchRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[mddnearsearchrespvo](#mddnearsearchrespvo)"`|[MddNearSearchRespVo](#mddnearsearchrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2c690b23e81688b76b6924963c256f30"></a>
### YXkApiResponse«MedalHomeShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[medalhomesharevo](#medalhomesharevo)"`|[MedalHomeShareVO](#medalhomesharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3ee49fed99313572248f55f37ff8bafe"></a>
### YXkApiResponse«MedalHomeVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[medalhomevo](#medalhomevo)"`|[MedalHomeVO](#medalhomevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3a00a6e87978b07613fc4b39ccddf36a"></a>
### YXkApiResponse«MedalProductLineVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[medalproductlinevo](#medalproductlinevo)"`|[MedalProductLineVO](#medalproductlinevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6dc56a9fcb9420f98eb464f3497f8baa"></a>
### YXkApiResponse«MedalShareVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[medalsharevo](#medalsharevo)"`|[MedalShareVO](#medalsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6dc56a9fcb9420f98eb464f3497f8baa"></a>
### YXkApiResponse«MedalShareVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[medalsharevo](#medalsharevo)"`|[MedalShareVo](#medalsharevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a7914e23751b432124a198bd9d65c257"></a>
### YXkApiResponse«MeetMessageVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[meetmessagevo](#meetmessagevo)"`|[MeetMessageVo](#meetmessagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="12f482d156516bd37cae32a1f043f35e"></a>
### YXkApiResponse«MemberCentreRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[membercentrerespvo](#membercentrerespvo)"`|[MemberCentreRespVo](#membercentrerespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c4903219c3d4b945fc1b6aca420160f9"></a>
### YXkApiResponse«MemberFirstAidCardSaveRQ»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[memberfirstaidcardsaverq](#memberfirstaidcardsaverq)"`|[MemberFirstAidCardSaveRQ](#memberfirstaidcardsaverq)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="405d871c8b95dff441f6c3c423dc846e"></a>
### YXkApiResponse«MemberFirstAidCardVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[memberfirstaidcardvo](#memberfirstaidcardvo)"`|[MemberFirstAidCardVO](#memberfirstaidcardvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1292baa76b41787f599699b4dd7dc839"></a>
### YXkApiResponse«MessageCountVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[messagecountvo](#messagecountvo)"`|[MessageCountVo](#messagecountvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a0ea3146e5f42576c426f8b000caedaa"></a>
### YXkApiResponse«MicroBargainReminVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[microbargainreminvo](#microbargainreminvo)"`|[MicroBargainReminVO](#microbargainreminvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7b225571eb8e871754353d47b1a31984"></a>
### YXkApiResponse«MicroPagerWrap«List«OrderBaseListItemVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[1db124577e78efec0763933556489419](#1db124577e78efec0763933556489419)"`|[MicroPagerWrap«List«OrderBaseListItemVO»»](#1db124577e78efec0763933556489419)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="eea3a9df38ae68a3096f24735cad4ddf"></a>
### YXkApiResponse«MyselfNoLoginVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[myselfnologinvo](#myselfnologinvo)"`|[MyselfNoLoginVo](#myselfnologinvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d4870e8feacfcc0d986db7303fe49415"></a>
### YXkApiResponse«MyselfVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[myselfvo](#myselfvo)"`|[MyselfVo](#myselfvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3b06395816b9536353413040e44eaa2d"></a>
### YXkApiResponse«NewsDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[newsdetailvo](#newsdetailvo)"`|[NewsDetailVO](#newsdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4317beed6b57ed93659c05462bace440"></a>
### YXkApiResponse«NewsVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[newsvo](#newsvo)"`|[NewsVO](#newsvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8da8ba2e6a6bed80899e05d0e01ed323"></a>
### YXkApiResponse«OfficePagerVO«List«UserPrizeHistoryVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[1d171ed9badb0073fcd2050e6b974aaa](#1d171ed9badb0073fcd2050e6b974aaa)"`|[OfficePagerVO«List«UserPrizeHistoryVO»»](#1d171ed9badb0073fcd2050e6b974aaa)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="04b047444596d3a1f302e273f42975d3"></a>
### YXkApiResponse«OneLoginVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[oneloginvo](#oneloginvo)"`|[OneLoginVO](#oneloginvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="372cfbe1a96ffc690aa83a23fe03bcc6"></a>
### YXkApiResponse«OrderBaseCountVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderbasecountvo](#orderbasecountvo)"`|[OrderBaseCountVO](#orderbasecountvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="29f88c21ab6522f962492b74d0087382"></a>
### YXkApiResponse«OrderBaseTabVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderbasetabvo](#orderbasetabvo)"`|[OrderBaseTabVO](#orderbasetabvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3ef1e4e14144b8c1bca95d203f300ebd"></a>
### YXkApiResponse«OrderBestSignContractVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderbestsigncontractvo](#orderbestsigncontractvo)"`|[OrderBestSignContractVO](#orderbestsigncontractvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4d444dcfd0b700c6dbca0abee5030a82"></a>
### YXkApiResponse«OrderCardVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordercardvo](#ordercardvo)"`|[OrderCardVO](#ordercardvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d2659752d7e5e12801f6357d36da10a9"></a>
### YXkApiResponse«OrderConfirmVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderconfirmvo](#orderconfirmvo)"`|[OrderConfirmVO](#orderconfirmvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="afffb9df3357973a25439cdbd6471bd0"></a>
### YXkApiResponse«OrderContractSignRemindVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordercontractsignremindvo](#ordercontractsignremindvo)"`|[OrderContractSignRemindVO](#ordercontractsignremindvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5596891877c8a0e87a1e2e77d9fb7cf4"></a>
### YXkApiResponse«OrderCouponVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordercouponvo](#ordercouponvo)"`|[OrderCouponVO](#ordercouponvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b8c66e0d83e78a9055069c7fefb08753"></a>
### YXkApiResponse«OrderDeductionVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderdeductionvo](#orderdeductionvo)"`|[OrderDeductionVo](#orderdeductionvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4870d16b33051bec7dcaa992b52d698b"></a>
### YXkApiResponse«OrderDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderdetailvo](#orderdetailvo)"`|[OrderDetailVO](#orderdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="dde1adad2722f259f864fb89be9fb8a0"></a>
### YXkApiResponse«OrderEditVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordereditvo](#ordereditvo)"`|[OrderEditVO](#ordereditvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7a08ed05a7212de00b980ce9e4f801ea"></a>
### YXkApiResponse«OrderEvaluationAddVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderevaluationaddvo](#orderevaluationaddvo)"`|[OrderEvaluationAddVO](#orderevaluationaddvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="941ce74641f8fab79d499ad1c23ca8d7"></a>
### YXkApiResponse«OrderEvaluationEditVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderevaluationeditvo](#orderevaluationeditvo)"`|[OrderEvaluationEditVO](#orderevaluationeditvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="714dfbe252930b30fb56f7974ec46d0d"></a>
### YXkApiResponse«OrderEvaluationSaveVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderevaluationsavevo](#orderevaluationsavevo)"`|[OrderEvaluationSaveVO](#orderevaluationsavevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6e119281cecf6033a4b210131df22295"></a>
### YXkApiResponse«OrderInvoiceDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderinvoicedetailvo](#orderinvoicedetailvo)"`|[OrderInvoiceDetailVO](#orderinvoicedetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="23f42eb5e079ff856b51375e384a291a"></a>
### YXkApiResponse«OrderInvoiceInfoVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderinvoiceinfovo](#orderinvoiceinfovo)"`|[OrderInvoiceInfoVO](#orderinvoiceinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="687973f6fa47c82445ca6a4c576b9279"></a>
### YXkApiResponse«OrderMemberVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordermembervo](#ordermembervo)"`|[OrderMemberVO](#ordermembervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2e076bab857d6779fa9c7401c6376208"></a>
### YXkApiResponse«OrderMessageVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordermessagevo](#ordermessagevo)"`|[OrderMessageVo](#ordermessagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a94b9b00ac875562f5ecf39216482ef5"></a>
### YXkApiResponse«OrderShareInfoVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordershareinfovo](#ordershareinfovo)"`|[OrderShareInfoVO](#ordershareinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1d8f39c65872ef184e8efe782fe9e0f8"></a>
### YXkApiResponse«OrderSharedVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordersharedvo](#ordersharedvo)"`|[OrderSharedVO](#ordersharedvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b1f72884929986e641a11513d2327e0e"></a>
### YXkApiResponse«OrderVoucherVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ordervouchervo](#ordervouchervo)"`|[OrderVoucherVO](#ordervouchervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="db81068fcffb101f2b022e190af14599"></a>
### YXkApiResponse«OrdersCountVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[orderscountvo](#orderscountvo)"`|[OrdersCountVo](#orderscountvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="db2967874c4a9d2b21239ff4904796dd"></a>
### YXkApiResponse«PageVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[pagevo](#pagevo)"`|[PageVO](#pagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="12dc45fb3cbb62f3ca901847360f615e"></a>
### YXkApiResponse«PagerInfoListWrap«CouponProductInfoVO,List«CouponProductVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[36b06f27b3d4004461f192e3f5fd961b](#36b06f27b3d4004461f192e3f5fd961b)"`|[PagerInfoListWrap«CouponProductInfoVO,List«CouponProductVO»»](#36b06f27b3d4004461f192e3f5fd961b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7976f528ea4964f7a5a7961be8657c0b"></a>
### YXkApiResponse«PagerInfoListWrap«JSONObject,List«Map«string,object»»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[fcfb73d37a4702f24345037cc315b022](#fcfb73d37a4702f24345037cc315b022)"`|[PagerInfoListWrap«JSONObject,List«Map«string,object»»»](#fcfb73d37a4702f24345037cc315b022)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4a95302c7f9da47b16fe6fd64a2d0b72"></a>
### YXkApiResponse«PagerInfoListWrap«List«AlbumCommentVO»,List«AlbumCommentVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0e45e5b064ffcc587dbc381968bd0e20](#0e45e5b064ffcc587dbc381968bd0e20)"`|[PagerInfoListWrap«List«AlbumCommentVO»,List«AlbumCommentVO»»](#0e45e5b064ffcc587dbc381968bd0e20)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9cd69a1db05b7bf401b51230a3dc495f"></a>
### YXkApiResponse«PagerInfoListWrap«VisaCountryPackVO,List«VisaBaseVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[2abcceb5d1e27724447423d65bc27188](#2abcceb5d1e27724447423d65bc27188)"`|[PagerInfoListWrap«VisaCountryPackVO,List«VisaBaseVO»»](#2abcceb5d1e27724447423d65bc27188)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="94346ff1226f6a5b8148aefb73cbc031"></a>
### YXkApiResponse«PagerMapWrap«AroundHistoryExtVo,List«ProductAroundVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[a800d509b7f43b015fe2b9b29090ff4d](#a800d509b7f43b015fe2b9b29090ff4d)"`|[PagerMapWrap«AroundHistoryExtVo,List«ProductAroundVO»»](#a800d509b7f43b015fe2b9b29090ff4d)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b969a7acd54295a60dd88a09db766a90"></a>
### YXkApiResponse«PagerMapWrap«DiscoverQuoteItemVO,List«DiscoverQuoteVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[e9ee47f0344f4ce2ee3cf82ea4854626](#e9ee47f0344f4ce2ee3cf82ea4854626)"`|[PagerMapWrap«DiscoverQuoteItemVO,List«DiscoverQuoteVO»»](#e9ee47f0344f4ce2ee3cf82ea4854626)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e3c0fdd6dae5629ddcc0d8e26190fc05"></a>
### YXkApiResponse«PagerMapWrap«DiscoverStarsNoteVO,List«DiscoverStarsVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[9e1c5ad63ca2268cdb58088b5864271b](#9e1c5ad63ca2268cdb58088b5864271b)"`|[PagerMapWrap«DiscoverStarsNoteVO,List«DiscoverStarsVO»»](#9e1c5ad63ca2268cdb58088b5864271b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9d5c5b737fabeed536b725ab989dfaba"></a>
### YXkApiResponse«PagerMapWrap«SingleDisMoreSameBatchesVO,List«DiscoverYouxiaSimpleVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[df8172ec1398c575095e0e03ab790bf9](#df8172ec1398c575095e0e03ab790bf9)"`|[PagerMapWrap«SingleDisMoreSameBatchesVO,List«DiscoverYouxiaSimpleVO»»](#df8172ec1398c575095e0e03ab790bf9)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="33bc55aa1abd1f0bacc133b8d6c3198c"></a>
### YXkApiResponse«PagerMapWrap«UserTongXunTotalMsgVO,List«UserDiscoverFriendVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8961214af50064296114de299156b61c](#8961214af50064296114de299156b61c)"`|[PagerMapWrap«UserTongXunTotalMsgVO,List«UserDiscoverFriendVO»»](#8961214af50064296114de299156b61c)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ff9ef2492d89370edfdc66eadd8a76a4"></a>
### YXkApiResponse«PagerMapWrap«草稿,List«DiscoverQuoteUserCenterVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8e1c6527a9278bb5994cb70cfd8b23f9](#8e1c6527a9278bb5994cb70cfd8b23f9)"`|[PagerMapWrap«草稿,List«DiscoverQuoteUserCenterVO»»](#8e1c6527a9278bb5994cb70cfd8b23f9)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c54663377528f01625968b2ed62c88e2"></a>
### YXkApiResponse«PagerMapWrap«草稿,List«TravelarticlesVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[f0ca3967da73a0748cb833ef84fbaf4b](#f0ca3967da73a0748cb833ef84fbaf4b)"`|[PagerMapWrap«草稿,List«TravelarticlesVo»»](#f0ca3967da73a0748cb833ef84fbaf4b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5a7d56fb4585544a13abceccfc0b4440"></a>
### YXkApiResponse«PagerWrap«List«AthleticsIndexItemVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[bc707fa8c03a5f92ad79f4aa818fb5ca](#bc707fa8c03a5f92ad79f4aa818fb5ca)"`|[PagerWrap«List«AthleticsIndexItemVo»»](#bc707fa8c03a5f92ad79f4aa818fb5ca)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e6f7e97039e08dbfcec81c93d7512b01"></a>
### YXkApiResponse«PagerWrap«List«AttitudeUserCollectVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[55094d02d8cc4733e4a21ac779aecb1e](#55094d02d8cc4733e4a21ac779aecb1e)"`|[PagerWrap«List«AttitudeUserCollectVO»»](#55094d02d8cc4733e4a21ac779aecb1e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6d6db7e7bf0f0a721c1ab0c9616e20fa"></a>
### YXkApiResponse«PagerWrap«List«AttitudeViewPointSingleVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0bcdcd92584eae022c6d2e74440bad89](#0bcdcd92584eae022c6d2e74440bad89)"`|[PagerWrap«List«AttitudeViewPointSingleVO»»](#0bcdcd92584eae022c6d2e74440bad89)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0f46104bf7980f07f9f5b5334bbaf91e"></a>
### YXkApiResponse«PagerWrap«List«ContactSearchVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d9c4cf17aa79c8264a1d09a5375de865](#d9c4cf17aa79c8264a1d09a5375de865)"`|[PagerWrap«List«ContactSearchVO»»](#d9c4cf17aa79c8264a1d09a5375de865)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1e02fffb95a96159ac74e894bf87bd15"></a>
### YXkApiResponse«PagerWrap«List«ContactVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[44cfe2b91e373ce98b3b858ba3b9753f](#44cfe2b91e373ce98b3b858ba3b9753f)"`|[PagerWrap«List«ContactVO»»](#44cfe2b91e373ce98b3b858ba3b9753f)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ec4a56bf083eec985000c11b8463cbbf"></a>
### YXkApiResponse«PagerWrap«List«CouponsLinesListVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[39223028404f1f263fb3f786577b8681](#39223028404f1f263fb3f786577b8681)"`|[PagerWrap«List«CouponsLinesListVO»»](#39223028404f1f263fb3f786577b8681)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e7dd2a33152c9aaad5ba7d09fcce40ae"></a>
### YXkApiResponse«PagerWrap«List«CouponsListVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cd1b99a529ff302d5a90aeaaf34dab3a](#cd1b99a529ff302d5a90aeaaf34dab3a)"`|[PagerWrap«List«CouponsListVO»»](#cd1b99a529ff302d5a90aeaaf34dab3a)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="615244cbfa192106dc54102fda7e41eb"></a>
### YXkApiResponse«PagerWrap«List«DailyMaterialVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[3539945c4f3b73aea34f69639847c014](#3539945c4f3b73aea34f69639847c014)"`|[PagerWrap«List«DailyMaterialVO»»](#3539945c4f3b73aea34f69639847c014)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="35b01b9c9fc53f418f713de0d4930da6"></a>
### YXkApiResponse«PagerWrap«List«DestFavoriteRespVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8182b77277e4c4af2847a52869a47943](#8182b77277e4c4af2847a52869a47943)"`|[PagerWrap«List«DestFavoriteRespVO»»](#8182b77277e4c4af2847a52869a47943)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f757c2ba6e7f969c396a1151b7f4c04b"></a>
### YXkApiResponse«PagerWrap«List«DiscoverCommentVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[43978e5e0e8159167a3e9b70d7efde6a](#43978e5e0e8159167a3e9b70d7efde6a)"`|[PagerWrap«List«DiscoverCommentVO»»](#43978e5e0e8159167a3e9b70d7efde6a)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6a7365d0a0b9d83fe235d4e497ec7ca6"></a>
### YXkApiResponse«PagerWrap«List«DiscoverCommentVO»»»_1

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[bd1c9d3b6342a291f3140e719102b785](#bd1c9d3b6342a291f3140e719102b785)"`|[PagerWrap«List«DiscoverCommentVO»»_1](#bd1c9d3b6342a291f3140e719102b785)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="bc66c3cb048d5e03c4a616e1e792a731"></a>
### YXkApiResponse«PagerWrap«List«DiscoverDestCountVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[bec207636cc29d81205f837884a36e80](#bec207636cc29d81205f837884a36e80)"`|[PagerWrap«List«DiscoverDestCountVO»»](#bec207636cc29d81205f837884a36e80)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1c8ec6bb81f3bff3276722e89c78b368"></a>
### YXkApiResponse«PagerWrap«List«DiscoverDraftVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[4d6f61ddce11a210cee463a78eb636fd](#4d6f61ddce11a210cee463a78eb636fd)"`|[PagerWrap«List«DiscoverDraftVO»»](#4d6f61ddce11a210cee463a78eb636fd)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fc110923fee70c13e299ca1a67ec3e0e"></a>
### YXkApiResponse«PagerWrap«List«DiscoverFavoritesVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[54b2da266169fc8606dd1a813afd64b5](#54b2da266169fc8606dd1a813afd64b5)"`|[PagerWrap«List«DiscoverFavoritesVO»»](#54b2da266169fc8606dd1a813afd64b5)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="97909c02edc67ee69d6cb538bb8a77a3"></a>
### YXkApiResponse«PagerWrap«List«DiscoverHotVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d5d662f3564daafca3d5b8cfb3f17ead](#d5d662f3564daafca3d5b8cfb3f17ead)"`|[PagerWrap«List«DiscoverHotVO»»](#d5d662f3564daafca3d5b8cfb3f17ead)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4f550bb6ed47c1c5d42772fecbc4670f"></a>
### YXkApiResponse«PagerWrap«List«DiscoverLatestVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cb1d9bdc9e475182aaf6bec87d0ac32e](#cb1d9bdc9e475182aaf6bec87d0ac32e)"`|[PagerWrap«List«DiscoverLatestVO»»](#cb1d9bdc9e475182aaf6bec87d0ac32e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8248dd64068b5d9392c7ec82020b8827"></a>
### YXkApiResponse«PagerWrap«List«DiscoverLevyVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[b688c80c0f40a71f4b54b061c5c5b868](#b688c80c0f40a71f4b54b061c5c5b868)"`|[PagerWrap«List«DiscoverLevyVO»»](#b688c80c0f40a71f4b54b061c5c5b868)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1b6c4af847ea085d1d0390ceab96060d"></a>
### YXkApiResponse«PagerWrap«List«DiscoverPraiseListVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[5b930730a848940d22876788171f63b0](#5b930730a848940d22876788171f63b0)"`|[PagerWrap«List«DiscoverPraiseListVO»»](#5b930730a848940d22876788171f63b0)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="baef15e38c6e7a7ebc1ee2dca1784562"></a>
### YXkApiResponse«PagerWrap«List«DiscoverSameBatchesYouxiaVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[13fa7fc22a40cbdd8a805d193d9c6adb](#13fa7fc22a40cbdd8a805d193d9c6adb)"`|[PagerWrap«List«DiscoverSameBatchesYouxiaVO»»](#13fa7fc22a40cbdd8a805d193d9c6adb)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="756c206223164c4813e770e5cc618e4f"></a>
### YXkApiResponse«PagerWrap«List«DiscoverTopicVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[6c303ea31269f7654c694f9b9d8a6529](#6c303ea31269f7654c694f9b9d8a6529)"`|[PagerWrap«List«DiscoverTopicVO»»](#6c303ea31269f7654c694f9b9d8a6529)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1a8414d7fee3f075c99d4d9ef9a15ff7"></a>
### YXkApiResponse«PagerWrap«List«DiscoverVideoDetailResVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[64a05293ee16b160fc527e7c4eeb50d9](#64a05293ee16b160fc527e7c4eeb50d9)"`|[PagerWrap«List«DiscoverVideoDetailResVO»»](#64a05293ee16b160fc527e7c4eeb50d9)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4e1cdd5d08626a99d64030a9b162c320"></a>
### YXkApiResponse«PagerWrap«List«DiscoverYouxiaTuijianVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0d13c733e031a159bd96319c9349dd39](#0d13c733e031a159bd96319c9349dd39)"`|[PagerWrap«List«DiscoverYouxiaTuijianVO»»](#0d13c733e031a159bd96319c9349dd39)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4af018e6441c5f5308771613a4754b9e"></a>
### YXkApiResponse«PagerWrap«List«FriendBaseVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cadb607d5f50e170180fd42985df5af5](#cadb607d5f50e170180fd42985df5af5)"`|[PagerWrap«List«FriendBaseVo»»](#cadb607d5f50e170180fd42985df5af5)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="06bc57e02a295d8d274e55593f8b1b67"></a>
### YXkApiResponse«PagerWrap«List«HistoryDuobaoVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[c0599795b75769aa80762c4c7db1f696](#c0599795b75769aa80762c4c7db1f696)"`|[PagerWrap«List«HistoryDuobaoVO»»](#c0599795b75769aa80762c4c7db1f696)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="74b358cb117939376575ce8310035cc4"></a>
### YXkApiResponse«PagerWrap«List«ImShareReviewListVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0d45a37ac87d4c658c8ec57f6f21b252](#0d45a37ac87d4c658c8ec57f6f21b252)"`|[PagerWrap«List«ImShareReviewListVO»»](#0d45a37ac87d4c658c8ec57f6f21b252)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a10316c5ec49162a98473687984bfece"></a>
### YXkApiResponse«PagerWrap«List«IndexFlowItemVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[3fe8efeebbdc441b9def3bf1931ae1a4](#3fe8efeebbdc441b9def3bf1931ae1a4)"`|[PagerWrap«List«IndexFlowItemVo»»](#3fe8efeebbdc441b9def3bf1931ae1a4)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7c9651dce4e2460451eb76fe3b1be4b8"></a>
### YXkApiResponse«PagerWrap«List«InvoiceInfoListItemVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cf87e7295f48a19443da2ecc5cb8e4f2](#cf87e7295f48a19443da2ecc5cb8e4f2)"`|[PagerWrap«List«InvoiceInfoListItemVo»»](#cf87e7295f48a19443da2ecc5cb8e4f2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2e871a2f1c7024459c395f7553bc29b5"></a>
### YXkApiResponse«PagerWrap«List«Map«string,object»»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0af4c52a631ed2a4f53c7367e5659ff8](#0af4c52a631ed2a4f53c7367e5659ff8)"`|[PagerWrap«List«Map«string,object»»»](#0af4c52a631ed2a4f53c7367e5659ff8)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="669984b59537d0f07fdce8a6da7fa8db"></a>
### YXkApiResponse«PagerWrap«List«MddInfoVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ca22f7a7cdd8b9a0b0e9e1b69578142a](#ca22f7a7cdd8b9a0b0e9e1b69578142a)"`|[PagerWrap«List«MddInfoVO»»](#ca22f7a7cdd8b9a0b0e9e1b69578142a)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c04e9d2b7ee475f7d267cca1ea5f7b23"></a>
### YXkApiResponse«PagerWrap«List«MembersExtPO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[c68dbeff9e68af06c02f4c3ada6044f1](#c68dbeff9e68af06c02f4c3ada6044f1)"`|[PagerWrap«List«MembersExtPO»»](#c68dbeff9e68af06c02f4c3ada6044f1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="12a596767963e5b3a9a5a4b902285953"></a>
### YXkApiResponse«PagerWrap«List«MyselfDuobaoVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[9835fb0c5f4591cc91d074430c03b86d](#9835fb0c5f4591cc91d074430c03b86d)"`|[PagerWrap«List«MyselfDuobaoVO»»](#9835fb0c5f4591cc91d074430c03b86d)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="30cd723696b4053ef6bbda1bf229d040"></a>
### YXkApiResponse«PagerWrap«List«NearbyFriendVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[85bdae39c6cf088f38817bde38dcf7f1](#85bdae39c6cf088f38817bde38dcf7f1)"`|[PagerWrap«List«NearbyFriendVO»»](#85bdae39c6cf088f38817bde38dcf7f1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e390009ee46a0f7df3d0e3dab11e2f07"></a>
### YXkApiResponse«PagerWrap«List«OrdersListItemVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[49e72275f55946461852a9ceb82723dd](#49e72275f55946461852a9ceb82723dd)"`|[PagerWrap«List«OrdersListItemVo»»](#49e72275f55946461852a9ceb82723dd)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ae18996960c89b2cfe30d4f0363f1ae6"></a>
### YXkApiResponse«PagerWrap«List«PhotoCompetitionVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[6f343d312f19f323d400892b9e685279](#6f343d312f19f323d400892b9e685279)"`|[PagerWrap«List«PhotoCompetitionVO»»](#6f343d312f19f323d400892b9e685279)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0c1e323d6393141844102aadd4eec5b5"></a>
### YXkApiResponse«PagerWrap«List«ProductBasicModel»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[c32f13daedba24e680fd327d24a3cf8e](#c32f13daedba24e680fd327d24a3cf8e)"`|[PagerWrap«List«ProductBasicModel»»](#c32f13daedba24e680fd327d24a3cf8e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e8ea83804a7d1a373c6b6f58d54683cf"></a>
### YXkApiResponse«PagerWrap«List«ProductJihediDataVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[fd1d80fbb800d5af1ba351fdf7cab97b](#fd1d80fbb800d5af1ba351fdf7cab97b)"`|[PagerWrap«List«ProductJihediDataVo»»](#fd1d80fbb800d5af1ba351fdf7cab97b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="91a8a669a6cbfde993565aea094f3a88"></a>
### YXkApiResponse«PagerWrap«List«RecommendMasterVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d566b09a6ec526c8726fa338d79a14f3](#d566b09a6ec526c8726fa338d79a14f3)"`|[PagerWrap«List«RecommendMasterVO»»](#d566b09a6ec526c8726fa338d79a14f3)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="dfd393a2634dfe90fc95fce6f056df5e"></a>
### YXkApiResponse«PagerWrap«List«SameLineFriendVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cf81157697fa7785818a310edb0455b4](#cf81157697fa7785818a310edb0455b4)"`|[PagerWrap«List«SameLineFriendVo»»](#cf81157697fa7785818a310edb0455b4)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4f7016b6e636e4a49637949ddbdea6fc"></a>
### YXkApiResponse«PagerWrap«List«TopicJoinerVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[889ce99cb60eaac8384af4853cac7883](#889ce99cb60eaac8384af4853cac7883)"`|[PagerWrap«List«TopicJoinerVO»»](#889ce99cb60eaac8384af4853cac7883)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="30d645c5ed3a461b1c03ad63a25cc6da"></a>
### YXkApiResponse«PagerWrap«List«TravelInDraftBoxVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[f863f6a1e52abfdc544b7ed565bdf137](#f863f6a1e52abfdc544b7ed565bdf137)"`|[PagerWrap«List«TravelInDraftBoxVO»»](#f863f6a1e52abfdc544b7ed565bdf137)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="2a6aabed42a408850bd0118753927af7"></a>
### YXkApiResponse«PagerWrap«List«TravelarticlesVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[5a708f34be5cad07dba228440893b101](#5a708f34be5cad07dba228440893b101)"`|[PagerWrap«List«TravelarticlesVo»»](#5a708f34be5cad07dba228440893b101)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="cee83dd07c7f7841a6fa33c6009558ac"></a>
### YXkApiResponse«PagerWrap«List«UserBasicInfo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0ead40c3a5d663d00365a02a9376839c](#0ead40c3a5d663d00365a02a9376839c)"`|[PagerWrap«List«UserBasicInfo»»](#0ead40c3a5d663d00365a02a9376839c)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e7cf16bc6df3666fbb12fedc344b815f"></a>
### YXkApiResponse«PagerWrap«List«UserTagVo»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[5155ba49df1dcab33e24c823f781b4bc](#5155ba49df1dcab33e24c823f781b4bc)"`|[PagerWrap«List«UserTagVo»»](#5155ba49df1dcab33e24c823f781b4bc)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="91ac26539adedf8a4d2744438b137b93"></a>
### YXkApiResponse«PagerWrap«List«VisaBaseVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cdd8a857e5382f20e8c570f475601ca2](#cdd8a857e5382f20e8c570f475601ca2)"`|[PagerWrap«List«VisaBaseVO»»](#cdd8a857e5382f20e8c570f475601ca2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0944bcacc05f203f8d0ef329cc6dea8a"></a>
### YXkApiResponse«PagerWrap«List«VisaOrderListItemVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[fa0595c1c24dcc559a935772a3dd5b90](#fa0595c1c24dcc559a935772a3dd5b90)"`|[PagerWrap«List«VisaOrderListItemVO»»](#fa0595c1c24dcc559a935772a3dd5b90)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d66e2cda9bdfa81948d8ec8df6c25b26"></a>
### YXkApiResponse«PagerWrap«List«VoucherFavoriteListVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[019d6bd8a6cced211b80cb5ae458efa5](#019d6bd8a6cced211b80cb5ae458efa5)"`|[PagerWrap«List«VoucherFavoriteListVO»»](#019d6bd8a6cced211b80cb5ae458efa5)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c1703258849e7a5b1efd30f1b090caaf"></a>
### YXkApiResponse«PagerWrap«List«WeekTopCalenderVO»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[54815fdd45161ecc83748d5d9d9103b3](#54815fdd45161ecc83748d5d9d9103b3)"`|[PagerWrap«List«WeekTopCalenderVO»»](#54815fdd45161ecc83748d5d9d9103b3)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="c96fa89e872a7e4ca784cf0cfb006eb9"></a>
### YXkApiResponse«PagerWrap«List«object»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[21fc12d14f6d160333e62f82eebbd1b3](#21fc12d14f6d160333e62f82eebbd1b3)"`|[PagerWrap«List«object»»](#21fc12d14f6d160333e62f82eebbd1b3)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ad0c913e1185074fad13a042f119771a"></a>
### YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[2df75ffb97d4715a168ad3186391873b](#2df75ffb97d4715a168ad3186391873b)"`|[PagerWrap«List«遇见瀑布流数据»»](#2df75ffb97d4715a168ad3186391873b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="57eba1c1e2353734fb97131a99590b38"></a>
### YXkApiResponse«PagerWrap«List«遇见瀑布流数据»»»_1

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8a08457c90b4698d4bfe4504aa48516b](#8a08457c90b4698d4bfe4504aa48516b)"`|[PagerWrap«List«遇见瀑布流数据»»_1](#8a08457c90b4698d4bfe4504aa48516b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7fdddea69a68d87b489caa1e9cca84c2"></a>
### YXkApiResponse«PagerWrap»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[pagerwrap](#pagerwrap)"`|[PagerWrap](#pagerwrap)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ce66b091e2316ac6b57348400217d711"></a>
### YXkApiResponse«PassengerListItemVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[passengerlistitemvo](#passengerlistitemvo)"`|[PassengerListItemVO](#passengerlistitemvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="63ffd914d0877e3ffd6680669e9e34c1"></a>
### YXkApiResponse«PassengerListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[passengerlistvo](#passengerlistvo)"`|[PassengerListVO](#passengerlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="bf948d6f4eb6f3bc4cf6c6047ce8d7ad"></a>
### YXkApiResponse«PayInfoVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[payinfovo](#payinfovo)"`|[PayInfoVO](#payinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f3d700c68eb3e00a84b7472cbdfdd1a1"></a>
### YXkApiResponse«PayResultVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[payresultvo](#payresultvo)"`|[PayResultVo](#payresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e44122db173aadcc806832731746b4ff"></a>
### YXkApiResponse«PaySuccInfoVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[paysuccinfovo](#paysuccinfovo)"`|[PaySuccInfoVO](#paysuccinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="18ec2982b0181e16958c8a79e0d1dd8e"></a>
### YXkApiResponse«PhotoAllVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photoallvo](#photoallvo)"`|[PhotoAllVO](#photoallvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0349e9dc332676b173a24892aac0b2a6"></a>
### YXkApiResponse«PhotoDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photodetailvo_1](#photodetailvo_1)"`|[PhotoDetailVO_1](#photodetailvo_1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3601db249da1fef0f3bd2bade6b982ce"></a>
### YXkApiResponse«PhotoHomeVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photohomevo](#photohomevo)"`|[PhotoHomeVO](#photohomevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="cbde5ebe1be99c7349b1f46937dc4ba6"></a>
### YXkApiResponse«PhotoMasterVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photomastervo](#photomastervo)"`|[PhotoMasterVO](#photomastervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0bfdfa7eaed5e8ed0ec9b52c7c42dba3"></a>
### YXkApiResponse«PhotoRecomentationVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photorecomentationvo](#photorecomentationvo)"`|[PhotoRecomentationVO](#photorecomentationvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ac9354935a57daaeec9429add2a4c262"></a>
### YXkApiResponse«PhotoSubjectVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[photosubjectvo](#photosubjectvo)"`|[PhotoSubjectVO](#photosubjectvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e8183e692f24e5780eaaf43c548eac64"></a>
### YXkApiResponse«PlaceVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[placevo_1](#placevo_1)"`|[PlaceVO_1](#placevo_1)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="190020b33f4d72234298ccc74c7c375b"></a>
### YXkApiResponse«PrivacyListVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[privacylistvo](#privacylistvo)"`|[PrivacyListVo](#privacylistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a3e27cb4fa350b0400a87fcf82422b55"></a>
### YXkApiResponse«ProductCalendarBatchV2VO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productcalendarbatchv2vo](#productcalendarbatchv2vo)"`|[ProductCalendarBatchV2VO](#productcalendarbatchv2vo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d681e08a83d1b81b16a0ae80b1e0f0f7"></a>
### YXkApiResponse«ProductCalendarBatchVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productcalendarbatchvo](#productcalendarbatchvo)"`|[ProductCalendarBatchVO](#productcalendarbatchvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="819b590049e106d4ae767186a2ad4694"></a>
### YXkApiResponse«ProductDetailBatchSelectVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productdetailbatchselectvo](#productdetailbatchselectvo)"`|[ProductDetailBatchSelectVo](#productdetailbatchselectvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="74298bc756f082d52f85f091a4aa10bf"></a>
### YXkApiResponse«ProductDetailRoomSelectVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productdetailroomselectvo](#productdetailroomselectvo)"`|[ProductDetailRoomSelectVo](#productdetailroomselectvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4efa0b0cc1071f9b9eb2a91510d27d6d"></a>
### YXkApiResponse«ProductDetailVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productdetailvo](#productdetailvo)"`|[ProductDetailVo](#productdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e41293f4f8eafacd0830f79f9d5d83df"></a>
### YXkApiResponse«ProductEvaluationDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productevaluationdetailvo](#productevaluationdetailvo)"`|[ProductEvaluationDetailVO](#productevaluationdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0d3247e79c52b6b59e4ce4b0c7625511"></a>
### YXkApiResponse«ProductOrderDetailRecommendVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productorderdetailrecommendvo](#productorderdetailrecommendvo)"`|[ProductOrderDetailRecommendVo](#productorderdetailrecommendvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ce3d901f3d085c4b9883651b5cebe0b6"></a>
### YXkApiResponse«ProductQiyuVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[productqiyuvo](#productqiyuvo)"`|[ProductQiyuVo](#productqiyuvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="02b0beca1ed87e13b590ba392aa2bb47"></a>
### YXkApiResponse«QiniuPrivateVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[qiniuprivatevo](#qiniuprivatevo)"`|[QiniuPrivateVo](#qiniuprivatevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="513916ad466d764306d5e08b5d08617b"></a>
### YXkApiResponse«RecomendMore»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[recomendmore](#recomendmore)"`|[RecomendMore](#recomendmore)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ea2d7b7359137608f57920c4876916b7"></a>
### YXkApiResponse«RegVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[regvo](#regvo)"`|[RegVO](#regvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ec8a4a805152fe0c0b398dfa85c43565"></a>
### YXkApiResponse«ResultCompetition»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[resultcompetition](#resultcompetition)"`|[ResultCompetition](#resultcompetition)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8d54b66fb442cfa992b5b02c7264585b"></a>
### YXkApiResponse«RewardTaskListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rewardtasklistvo](#rewardtasklistvo)"`|[RewardTaskListVO](#rewardtasklistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0b8a58ea0e56b53d8418b350fb922eed"></a>
### YXkApiResponse«RongHistoryVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[ronghistoryvo](#ronghistoryvo)"`|[RongHistoryVO](#ronghistoryvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="bdd074083ed58fbf159aada3841903ba"></a>
### YXkApiResponse«RpCommentListVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rpcommentlistvo](#rpcommentlistvo)"`|[RpCommentListVO](#rpcommentlistvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1cdbe531f9928b9708710096f06551f9"></a>
### YXkApiResponse«RpHtmlVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rphtmlvo](#rphtmlvo)"`|[RpHtmlVO](#rphtmlvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="86fa1c8c3659967ec95ac20f8f237c66"></a>
### YXkApiResponse«RpMemberVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rpmembervo](#rpmembervo)"`|[RpMemberVO](#rpmembervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="517202a7e5acf3f974688386cecda5fe"></a>
### YXkApiResponse«RpVisaFavoriteStatusVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rpvisafavoritestatusvo](#rpvisafavoritestatusvo)"`|[RpVisaFavoriteStatusVO](#rpvisafavoritestatusvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6f9984ecd02fb8244d53f501fd4bc8b6"></a>
### YXkApiResponse«RqMemberVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[rqmembervo](#rqmembervo)"`|[RqMemberVO](#rqmembervo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a4d33377db10310822c392b74139f98e"></a>
### YXkApiResponse«SaleInfoBean»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[saleinfobean](#saleinfobean)"`|[SaleInfoBean](#saleinfobean)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fbf374364bcef5e5a7fd29354ab436f3"></a>
### YXkApiResponse«SaveVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[savevo](#savevo)"`|[SaveVO](#savevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5fc2b56707a5fb8722d93853ec37cd37"></a>
### YXkApiResponse«SearchFrontVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[searchfrontvo](#searchfrontvo)"`|[SearchFrontVo](#searchfrontvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3a3cb77563e5e22f8b135ee98454d92f"></a>
### YXkApiResponse«SearchTagVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[searchtagvo](#searchtagvo)"`|[SearchTagVo](#searchtagvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e1a6acebcb57d0bbde3fee591605ed42"></a>
### YXkApiResponse«SearchVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[searchvo](#searchvo)"`|[SearchVO](#searchvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="68a03ebb7a2b8bd63657fdafd467062b"></a>
### YXkApiResponse«ShareRelVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[sharerelvo](#sharerelvo)"`|[ShareRelVO](#sharerelvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d1f420ca01398f4ba0b1085af4b9596c"></a>
### YXkApiResponse«ShowCouponVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[showcouponvo](#showcouponvo)"`|[ShowCouponVO](#showcouponvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="76096f63dffe607a66f426fe5124aff0"></a>
### YXkApiResponse«SingleMedalDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[singlemedaldetailvo](#singlemedaldetailvo)"`|[SingleMedalDetailVO](#singlemedaldetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0d345251a170b8cd378ef833e850cd2f"></a>
### YXkApiResponse«SystemMessageVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[systemmessagevo](#systemmessagevo)"`|[SystemMessageVo](#systemmessagevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9bf61f8ebb34d02509ea4e8b6030b382"></a>
### YXkApiResponse«TaklVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[taklvo](#taklvo)"`|[TaklVo](#taklvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="542bce0c04a167ca40349dc01621c27b"></a>
### YXkApiResponse«ThemeCategoryVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[themecategoryvo](#themecategoryvo)"`|[ThemeCategoryVO](#themecategoryvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="0926cafe5e63f49c2e28933ad6d7f073"></a>
### YXkApiResponse«TimeSerachResultVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[timeserachresultvo](#timeserachresultvo)"`|[TimeSerachResultVo](#timeserachresultvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="3f7cc6c276e531650e4dae58b42e08ee"></a>
### YXkApiResponse«TopVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[topvo](#topvo)"`|[TopVO](#topvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="cbfd7367ef47e486d0859a93b269a3bd"></a>
### YXkApiResponse«TravelTipHomeVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[traveltiphomevo](#traveltiphomevo)"`|[TravelTipHomeVO](#traveltiphomevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a8b8c6836c9e857c270804e30846603c"></a>
### YXkApiResponse«TravelarticleCommentsRespVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[travelarticlecommentsrespvo](#travelarticlecommentsrespvo)"`|[TravelarticleCommentsRespVo](#travelarticlecommentsrespvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="b37d596337abea9c147bb4bfe0406735"></a>
### YXkApiResponse«TravelarticlesDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[travelarticlesdetailvo](#travelarticlesdetailvo)"`|[TravelarticlesDetailVO](#travelarticlesdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7fe99923c29d3405c5f7b31095d79f3c"></a>
### YXkApiResponse«UserAccountDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[useraccountdetailvo](#useraccountdetailvo)"`|[UserAccountDetailVO](#useraccountdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9ef7b8d35f525f7c4719a33c2a89afde"></a>
### YXkApiResponse«UserAccountsafeVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[useraccountsafevo](#useraccountsafevo)"`|[UserAccountsafeVo](#useraccountsafevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8e26f39a73a8d7c4bbfcf97ab0cbf234"></a>
### YXkApiResponse«UserAvatarConfVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[useravatarconfvo](#useravatarconfvo)"`|[UserAvatarConfVO](#useravatarconfvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fcc2d75fa03165f4f8933e4c239c030b"></a>
### YXkApiResponse«UserDailyMaterialDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[userdailymaterialdetailvo](#userdailymaterialdetailvo)"`|[UserDailyMaterialDetailVO](#userdailymaterialdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6220c583a57a8722198b601374be2954"></a>
### YXkApiResponse«UserFansVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[userfansvo](#userfansvo)"`|[UserFansVo](#userfansvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="cb9b5355da682e4a29c93704942c4e8b"></a>
### YXkApiResponse«UserInfoVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[userinfovo](#userinfovo)"`|[UserInfoVo](#userinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1f97da85cdb6d0176025365fcf396469"></a>
### YXkApiResponse«UserServiceFollowVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[userservicefollowvo](#userservicefollowvo)"`|[UserServiceFollowVO](#userservicefollowvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="59f426a739af10f181b19d04dd658155"></a>
### YXkApiResponse«UserSimplicityInfoVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[usersimplicityinfovo](#usersimplicityinfovo)"`|[UserSimplicityInfoVo](#usersimplicityinfovo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="d8c56bc3bbfa9679bce1a1eb8a73031a"></a>
### YXkApiResponse«UserSummeryVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[usersummeryvo](#usersummeryvo)"`|[UserSummeryVo](#usersummeryvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="36a5c6f9fa43747b6abd5d5499853f1b"></a>
### YXkApiResponse«VisaBookDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visabookdetailvo](#visabookdetailvo)"`|[VisaBookDetailVO](#visabookdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="74adfc07af4747f914c87060e761c0fa"></a>
### YXkApiResponse«VisaBookVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visabookvo](#visabookvo)"`|[VisaBookVO](#visabookvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="25a2a1842990e020757653ef5d750755"></a>
### YXkApiResponse«VisaChannelBase»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visachannelbase](#visachannelbase)"`|[VisaChannelBase](#visachannelbase)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e3578ec8a44223266baab29f1ee501a9"></a>
### YXkApiResponse«VisaCreateDealVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visacreatedealvo](#visacreatedealvo)"`|[VisaCreateDealVO](#visacreatedealvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="60bc73866ddb4c0fef23ca0da9ff2f4a"></a>
### YXkApiResponse«VisaFavoriteVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visafavoritevo](#visafavoritevo)"`|[VisaFavoriteVO](#visafavoritevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e17c25719167ddb8d5e627d0c2e74583"></a>
### YXkApiResponse«VisaOrderDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visaorderdetailvo](#visaorderdetailvo)"`|[VisaOrderDetailVO](#visaorderdetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="9e3d0855be9a9260f0a227e032409a66"></a>
### YXkApiResponse«VisaOrderPayDetailVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visaorderpaydetailvo](#visaorderpaydetailvo)"`|[VisaOrderPayDetailVO](#visaorderpaydetailvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ce79a2397b6fff8ecbfdccf8ca5a68f6"></a>
### YXkApiResponse«VisaOrderSaveVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visaordersavevo](#visaordersavevo)"`|[VisaOrderSaveVO](#visaordersavevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e8a4e1147303e8d4b31bfb967d1eba17"></a>
### YXkApiResponse«VisaSearchVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[visasearchvo](#visasearchvo)"`|[VisaSearchVO](#visasearchvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="fa01049b9eb873c46814d71e9fb130ae"></a>
### YXkApiResponse«VoteVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[votevo](#votevo)"`|[VoteVO](#votevo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="1d1fc831dcb6c9d2b908828bb6ed6b35"></a>
### YXkApiResponse«WorksVO»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[worksvo](#worksvo)"`|[WorksVO](#worksvo)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ac2ebde87f19e340b49a5f87f378f635"></a>
### YXkApiResponse«int»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `0`|integer (int32)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="bb4d20a43e68c5300443488c67d9b56d"></a>
### YXkApiResponse«object»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="88ce995f16678bc660cc2af146abdb26"></a>
### YXkApiResponse«string»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e9086b58222fbeb35e08305852a96825"></a>
### YXkApiResponse«亲子游 首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[4a6a6cb083c5f05a32ec2dd2f111ad00](#4a6a6cb083c5f05a32ec2dd2f111ad00)"`|[亲子游 首页](#4a6a6cb083c5f05a32ec2dd2f111ad00)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="db4d9b889d18c7e11686b90dec15088e"></a>
### YXkApiResponse«出行信息»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[499974a6697b58fc1718a844f120fd12](#499974a6697b58fc1718a844f120fd12)"`|[出行信息](#499974a6697b58fc1718a844f120fd12)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5d5ebb626ebc93e77da168ab76fa1257"></a>
### YXkApiResponse«周边游首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[aca7eff81aff62407ac951ccfe1b1bd2](#aca7eff81aff62407ac951ccfe1b1bd2)"`|[周边游首页](#aca7eff81aff62407ac951ccfe1b1bd2)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6fcdd2aca07da75f06ab793a87b83bde"></a>
### YXkApiResponse«国内游/出境游 首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[d7065cf0199ecba0b87cb27292f30fbf](#d7065cf0199ecba0b87cb27292f30fbf)"`|[国内游/出境游 首页](#d7065cf0199ecba0b87cb27292f30fbf)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="866ca28db429090114c6c3248a345859"></a>
### YXkApiResponse«弹窗提示信息»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[cc0bdf0c8751a972d7ae8256b962f12e](#cc0bdf0c8751a972d7ae8256b962f12e)"`|[弹窗提示信息](#cc0bdf0c8751a972d7ae8256b962f12e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="7a4d0035df24cdb07e8b368330af5515"></a>
### YXkApiResponse«态度广场列表»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[8776fa155b9f5cf1f96f1e4f4e5e1b00](#8776fa155b9f5cf1f96f1e4f4e5e1b00)"`|[态度广场列表](#8776fa155b9f5cf1f96f1e4f4e5e1b00)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e0087654e33a58fc698b20303a981e7b"></a>
### YXkApiResponse«态度话题观点详情»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[1228556b0fe1c3f920a78346c188cd9b](#1228556b0fe1c3f920a78346c188cd9b)"`|[态度话题观点详情](#1228556b0fe1c3f920a78346c188cd9b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="8b5d3d4023081ccaab4539ac1bbe9a63"></a>
### YXkApiResponse«态度话题详情»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[6e55a64bd5b351f9a7afa09c5866577a](#6e55a64bd5b351f9a7afa09c5866577a)"`|[态度话题详情](#6e55a64bd5b351f9a7afa09c5866577a)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="e997e31e799d06f52f124d1f65df7bac"></a>
### YXkApiResponse«户外游 首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[f9e8eb8476e77757ebe82680be6c4d67](#f9e8eb8476e77757ebe82680be6c4d67)"`|[户外游 首页](#f9e8eb8476e77757ebe82680be6c4d67)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a59134b1918799cbf44b73aa70fb0494"></a>
### YXkApiResponse«摄影游 首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[21e1f1e44640a470c19a9d1e3a3c5878](#21e1f1e44640a470c19a9d1e3a3c5878)"`|[摄影游 首页](#21e1f1e44640a470c19a9d1e3a3c5878)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="173780dd7dbf3dda97bb31d8be4d7084"></a>
### YXkApiResponse«攻略带货卡片»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[240812a6f55b3669378d67303af90986](#240812a6f55b3669378d67303af90986)"`|[攻略带货卡片](#240812a6f55b3669378d67303af90986)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="a8c92d21fb8446e95a04a1505ebb61d1"></a>
### YXkApiResponse«星座»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[4491b0642d391d480f9ee8e6c27c0b7b](#4491b0642d391d480f9ee8e6c27c0b7b)"`|[星座](#4491b0642d391d480f9ee8e6c27c0b7b)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="43485fe4142feb5196f01e81e68f94f3"></a>
### YXkApiResponse«榜单»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[31a76ef05a82597c79626e4fbf8750fb](#31a76ef05a82597c79626e4fbf8750fb)"`|[榜单](#31a76ef05a82597c79626e4fbf8750fb)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="f87b0a10eedffd3a1152d77528d4fb09"></a>
### YXkApiResponse«目的地遇见聚合»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[33efe7124d8a0c9e38b5a762a9321a69](#33efe7124d8a0c9e38b5a762a9321a69)"`|[目的地遇见聚合](#33efe7124d8a0c9e38b5a762a9321a69)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="ea40868c7b346660b5e56698afafcecd"></a>
### YXkApiResponse«线路:0    频道:5  签证产品:6»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0bf878a2ed1d69acaee015cecc780236](#0bf878a2ed1d69acaee015cecc780236)"`|[线路:0    频道:5  签证产品:6](#0bf878a2ed1d69acaee015cecc780236)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="5be77b317fe9893f2907b13485ed8798"></a>
### YXkApiResponse«编辑页面内容»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[9e0c7176e56910ff60ef06a37c92029e](#9e0c7176e56910ff60ef06a37c92029e)"`|[编辑页面内容](#9e0c7176e56910ff60ef06a37c92029e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="115158d149c89d58ed4750533d5480d0"></a>
### YXkApiResponse«自由行首页»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[34a4e3083533dc4c42f070d3abea7113](#34a4e3083533dc4c42f070d3abea7113)"`|[自由行首页](#34a4e3083533dc4c42f070d3abea7113)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6842d638cdfb9206496ea34ca86724a5"></a>
### YXkApiResponse«话题»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[b00a65e94a223b1cc173ea1fbbfc0e7a](#b00a65e94a223b1cc173ea1fbbfc0e7a)"`|[话题](#b00a65e94a223b1cc173ea1fbbfc0e7a)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="74c3a54c8e9c4875b37d3df0f6d59cf6"></a>
### YXkApiResponse«话题广场»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[6be0a811ae2c9608db75f16d2604ec64](#6be0a811ae2c9608db75f16d2604ec64)"`|[话题广场](#6be0a811ae2c9608db75f16d2604ec64)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="4305f159eb67c5f5649f95fcdee9162f"></a>
### YXkApiResponse«遇见发现页上半部分数据»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[0b011531c01a8737606be9b8e693d22e](#0b011531c01a8737606be9b8e693d22e)"`|[遇见发现页上半部分数据](#0b011531c01a8737606be9b8e693d22e)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="6e36a8bbe49f6ab42b048f437898def5"></a>
### YXkApiResponse«遇见详情»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"[1a81090208e905aa23bf505a9c31fdf4](#1a81090208e905aa23bf505a9c31fdf4)"`|[遇见详情](#1a81090208e905aa23bf505a9c31fdf4)|
|**msg**  <br>*可选*|**样例** : `"string"`|string|


<a name="yiyu8bean"></a>
### Yiyu8Bean

|名称|说明|类型|
|---|---|---|
|**car_name**  <br>*可选*|叫车按钮名称  <br>**样例** : `"string"`|string|
|**car_status**  <br>*可选*|是否显示叫车按钮  <br>**样例** : `0`|integer (int32)|
|**car_url**  <br>*可选*|叫车按钮url  <br>**样例** : `"string"`|string|


<a name="yxbtipvo"></a>
### YxbTipVo

|名称|说明|类型|
|---|---|---|
|**amountTip**  <br>*可选*|例如：200  <br>**样例** : `"string"`|string|
|**percentTip**  <br>*可选*|例如：50%  <br>**样例** : `"string"`|string|
|**tip**  <br>*可选*|例如：游侠币总计：200，订单支付时可直接抵扣  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|例如：游侠币抵扣  <br>**样例** : `"string"`|string|


<a name="yxkcertbean"></a>
### YxkCertBean

|名称|说明|类型|
|---|---|---|
|**certTitle**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**certType**  <br>*可选*|id  <br>**样例** : `0`|integer (int32)|


<a name="packs"></a>
### packs

|名称|说明|类型|
|---|---|---|
|**createdAt**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**deletedAt**  <br>*可选*|删除时间  <br>**样例** : `"string"`|string (date-time)|
|**id**  <br>*可选*|套餐编号  <br>**样例** : `0`|integer (int32)|
|**info**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**isDefault**  <br>*可选*|是否默认 1为是 2为否  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|套餐名  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|显示排序  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**updatedAt**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string (date-time)|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|


<a name="6fc452290c6a517b1ec80d61e4397167"></a>
### 个人主页旅行统计信息

|名称|说明|类型|
|---|---|---|
|**cityNum**  <br>*可选*|去过的城市数  <br>**样例** : `"string"`|string|
|**countryNameStr**  <br>*可选*|去过的前三个国家  <br>**样例** : `"string"`|string|
|**countryNum**  <br>*可选*|去过的国家数  <br>**样例** : `"string"`|string|


<a name="4a6a6cb083c5f05a32ec2dd2f111ad00"></a>
### 亲子游 首页

|名称|说明|类型|
|---|---|---|
|**ageList**  <br>*可选*|适合年龄  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**allFlowTags**  <br>*可选*|亲子游瀑布流所有标签  <br>**样例** : `[ "[childflowtags](#childflowtags)" ]`|< [ChildFlowTags](#childflowtags) > array|
|**banner**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**flowTags**  <br>*可选*|亲子游瀑布流标签  <br>**样例** : `"[childflowtags](#childflowtags)"`|[ChildFlowTags](#childflowtags)|
|**hotTheme**  <br>*可选*|热门主题  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**reserveAd**  <br>*可选*|预留广告位  <br>**样例** : `"[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)"`|[广告位_1](#b11c184172f598526fa266c6a995db52)|


<a name="18200de7cdf43619db9263c39673362d"></a>
### 优惠信息

|名称|说明|类型|
|---|---|---|
|**detailRemark**  <br>*可选*|详细优惠信息，例如：最高砍200  <br>**样例** : `"string"`|string|
|**otId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**shortRemark**  <br>*可选*|简略优惠信息，例如：砍价  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|优惠类型1、早鸟优惠 2、满减优惠 3、领卷优惠 4、下单送券 5、限时特惠 6、砍价优惠  <br>**样例** : `0`|integer (int32)|


<a name="2d711b09bd0db0ad240cc83b30dd8014"></a>
### 内容

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型3图片，4视频  <br>**样例** : `0`|integer (int32)|


<a name="499974a6697b58fc1718a844f120fd12"></a>
### 出行信息

|名称|说明|类型|
|---|---|---|
|**completionDetail**  <br>*可选*|游记完成度类型 1 创建新游记 2 添加游记头图 3 至少关联一张照片关联地 4 至少添加一个段落目录 5 设置游记封面6 添加头图视频 7 添加音乐  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**completionValue**  <br>*可选*|完成度  <br>**样例** : `"string"`|string|
|**contentLableMdds**  <br>*可选*|游记内容中提取的目的地  <br>**样例** : `[ "[mddinfovo](#mddinfovo)" ]`|< [MddInfoVO](#mddinfovo) > array|
|**countContent**  <br>*可选*|文字数量内容(文字第一段)  <br>**样例** : `"string"`|string|
|**departureDate**  <br>*必填*|出发时间  <br>**样例** : `"string"`|string|
|**descContent**  <br>*可选*|等级描述内容(文字第三段)  <br>**样例** : `"string"`|string|
|**displayorder**  <br>*可选*|发布状态 0发布 9待审核 10草稿  <br>**样例** : `0`|integer (int32)|
|**leader**  <br>*可选*|true 领队 flase 不是领队  <br>**样例** : `true`|boolean|
|**mddInfos**  <br>*可选*|出行目的地  <br>**样例** : `[ "[mddinfovo](#mddinfovo)" ]`|< [MddInfoVO](#mddinfovo) > array|
|**mddMaxSize**  <br>*可选*|目的地最大个数  <br>**样例** : `0`|integer (int32)|
|**myLeadedTeam**  <br>*可选*|我带过的团  <br>**样例** : `[ "[teaminfovo](#teaminfovo)" ]`|< [TeamInfoVO](#teaminfovo) > array|
|**myTeam**  <br>*可选*|同团好友  <br>**样例** : `[ "[teaminfovo](#teaminfovo)" ]`|< [TeamInfoVO](#teaminfovo) > array|
|**sendMessage**  <br>*可选*|true 发送过 flase 未发送  <br>**样例** : `true`|boolean|
|**tripDays**  <br>*必填*|出发天数  <br>**样例** : `"string"`|string|
|**tripPlace**  <br>*可选*|集合地  <br>**样例** : `"string"`|string|
|**tripPrice**  <br>*可选*|人均费用  <br>**样例** : `"string"`|string|
|**tripType**  <br>*必填*|人物  <br>**样例** : `"string"`|string|
|**typeValues**  <br>*可选*|人物集合  <br>**样例** : `[ "[typevaluevo](#typevaluevo)" ]`|< [TypeValueVO](#typevaluevo) > array|
|**vistorContent**  <br>*可选*|游客数量内容（文字第二段）  <br>**样例** : `"string"`|string|


<a name="aca7eff81aff62407ac951ccfe1b1bd2"></a>
### 周边游首页

|名称|说明|类型|
|---|---|---|
|**flashList**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**flowTag**  <br>*可选*|瀑布流选择标签  <br>**样例** : `"[aroundflowtagvo](#aroundflowtagvo)"`|[AroundFlowTagVO](#aroundflowtagvo)|
|**plate**  <br>*可选*|板块  <br>**样例** : `"[aroundplatevo](#aroundplatevo)"`|[AroundPlateVO](#aroundplatevo)|
|**popularPlay**  <br>*可选*|人气玩法  <br>**样例** : `"[aroundpopularplayvo](#aroundpopularplayvo)"`|[AroundPopularPlayVO](#aroundpopularplayvo)|


<a name="d7065cf0199ecba0b87cb27292f30fbf"></a>
### 国内游/出境游 首页

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**flowTags**  <br>*可选*|国内游瀑布流标签  <br>**样例** : `"[1b7a7ae9a5c68b04f7f389444f39baaa](#1b7a7ae9a5c68b04f7f389444f39baaa)"`|[国内游瀑布流标签](#1b7a7ae9a5c68b04f7f389444f39baaa)|
|**mdd**  <br>*可选*|当季目的地  <br>**样例** : `"[mddwrapvo](#mddwrapvo)"`|[MddWrapVO](#mddwrapvo)|
|**reserveAd**  <br>*可选*|预留广告位  <br>**样例** : `"[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)"`|[广告位_1](#b11c184172f598526fa266c6a995db52)|
|**topProduct**  <br>*可选*|人气尖货  <br>**样例** : `"[cnchanneltopproduct](#cnchanneltopproduct)"`|[CNChannelTopProduct](#cnchanneltopproduct)|
|**topProductWrap**  <br>*可选*|小众推荐  <br>**样例** : `"[topproductwrapvo](#topproductwrapvo)"`|[TopProductWrapVO](#topproductwrapvo)|


<a name="3c01af109ffe3f801ebf6edda8a4f489"></a>
### 国内游/出境游瀑布流标签

|名称|说明|类型|
|---|---|---|
|**dayTags**  <br>*可选*|行程天数  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**startDateTags**  <br>*可选*|出行日期  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**themeTags**  <br>*可选*|主题玩法  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|


<a name="1b7a7ae9a5c68b04f7f389444f39baaa"></a>
### 国内游瀑布流标签

|名称|说明|类型|
|---|---|---|
|**dayTags**  <br>*可选*|行程天数  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**mddTags**  <br>*可选*|国内游瀑布流目的地标签  <br>**样例** : `[ "[45ac8b33c76f5154a09a4744f39525f5](#45ac8b33c76f5154a09a4744f39525f5)" ]`|< [国内游瀑布流目的地标签](#45ac8b33c76f5154a09a4744f39525f5) > array|
|**startDateTags**  <br>*可选*|出行日期  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|
|**themeTags**  <br>*可选*|主题玩法  <br>**样例** : `[ "[channelidandnamevo](#channelidandnamevo)" ]`|< [ChannelIdAndNameVO](#channelidandnamevo) > array|


<a name="45ac8b33c76f5154a09a4744f39525f5"></a>
### 国内游瀑布流目的地标签

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="c35401ca6ac4034af0ed24e16e092a9a"></a>
### 奖励内容

|名称|说明|类型|
|---|---|---|
|**message**  <br>*可选*|补充信息  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|奖励数量，如果是优惠券，则是优惠券id  <br>**样例** : `0`|integer (int32)|
|**rewardName**  <br>*可选*|奖励实体  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|积分0，经验1，游侠币2，优惠券3  <br>**样例** : `0`|integer (int32)|


<a name="314e431ed9d44b52e7c7fc814c35401c"></a>
### 广告位

|名称|说明|类型|
|---|---|---|
|**ageRange**  <br>*可选*|搜索条件-亲子年龄  <br>**样例** : `"string"`|string|
|**blockId**  <br>*可选*|广告位关联的板块id  <br>**样例** : `0`|integer (int32)|
|**day**  <br>*可选*|日期，例如：24  <br>**样例** : `"string"`|string|
|**exp**  <br>*可选*|过期日期时间戳，0表示永久  <br>**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**imageSecond**  <br>*可选*|图片第二张，可能是背景图片等  <br>**样例** : `"string"`|string|
|**mediaImage**  <br>*可选*|视频封面地址  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**month**  <br>*可选*|月份英文，例如：Oct.  <br>**样例** : `"string"`|string|
|**navType**  <br>*可选*|导航样式类型：2突出3new4hot  <br>**样例** : `0`|integer (int32)|
|**outLevel**  <br>*可选*|搜索条件-户外星级  <br>**样例** : `0`|integer (int32)|
|**statisticsCode**  <br>*可选*|线路统计相关；搜索来源统计前缀，需要拼接上‘&pid’  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**subType**  <br>*可选*|搜索栏2级  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|搜索栏1级  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="b11c184172f598526fa266c6a995db52"></a>
### 广告位_1

|名称|说明|类型|
|---|---|---|
|**ageRange**  <br>*可选*|搜索条件-亲子年龄  <br>**样例** : `"string"`|string|
|**blockId**  <br>*可选*|广告位关联的板块id  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|过期日期时间戳，0表示永久  <br>**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**imageSecond**  <br>*可选*|图片第二张，可能是背景图片等  <br>**样例** : `"string"`|string|
|**mediaImage**  <br>*可选*|视频封面地址  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**navType**  <br>*可选*|导航样式类型：2突出3new4hot  <br>**样例** : `0`|integer (int32)|
|**outLevel**  <br>*可选*|搜索条件-户外星级  <br>**样例** : `0`|integer (int32)|
|**statisticsCode**  <br>*可选*|线路统计相关；搜索来源统计前缀，需要拼接上‘&pid’  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**subType**  <br>*可选*|搜索栏2级  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|搜索栏1级  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="b6e44956354acb2ff4edba87b043212e"></a>
### 广告位_2

|名称|说明|类型|
|---|---|---|
|**ageRange**  <br>*可选*|搜索条件-亲子年龄  <br>**样例** : `"string"`|string|
|**blockId**  <br>*可选*|广告位关联的板块id  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|过期日期时间戳，0表示永久  <br>**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**imageSecond**  <br>*可选*|图片第二张，可能是背景图片等  <br>**样例** : `"string"`|string|
|**index**  <br>*可选*|索引值  <br>**样例** : `0`|integer (int32)|
|**mediaImage**  <br>*可选*|视频封面地址  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**navType**  <br>*可选*|导航样式类型：2突出3new4hot  <br>**样例** : `0`|integer (int32)|
|**outLevel**  <br>*可选*|搜索条件-户外星级  <br>**样例** : `0`|integer (int32)|
|**statisticsCode**  <br>*可选*|线路统计相关；搜索来源统计前缀，需要拼接上‘&pid’  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**subType**  <br>*可选*|搜索栏2级  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|搜索栏1级  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="8035f39760f39ca3fb4255fb4dfe9233"></a>
### 广告位_3

|名称|说明|类型|
|---|---|---|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**targetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|目标地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**titleColor**  <br>*可选*|标题文字色值  <br>**样例** : `"string"`|string|


<a name="13aea96aa619329e8b1cb9f397ced4c9"></a>
### 广告位_4

|名称|说明|类型|
|---|---|---|
|**pic**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**targetType**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**targetUrl**  <br>*可选*|目标地址  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="cc0bdf0c8751a972d7ae8256b962f12e"></a>
### 弹窗提示信息

|名称|说明|类型|
|---|---|---|
|**type**  <br>*可选*|提示信息类型，1：等级升级，2获得勋章  <br>**样例** : `0`|integer (int32)|


<a name="8776fa155b9f5cf1f96f1e4f4e5e1b00"></a>
### 态度广场列表

|名称|说明|类型|
|---|---|---|
|**tags**  <br>*可选*|标签  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|
|**topics**  <br>*可选*|话题  <br>**样例** : `[ "[topicsquare](#topicsquare)" ]`|< [TopicSquare](#topicsquare) > array|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="19e755d657a6ee5273ad80af3a938b2c"></a>
### 态度话题观点

|名称|说明|类型|
|---|---|---|
|**auditStatus**  <br>*可选*|审核状态：1-审核中 2-审核成功 3-审核失败  <br>**样例** : `0`|integer (int32)|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|观点内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|发表时间  <br>**样例** : `"string"`|string|
|**createdAt**  <br>*可选*|发表时间，秒级时间戳  <br>**样例** : `0`|integer (int64)|
|**favorited**  <br>*可选*|true 为已收藏  <br>**样例** : `true`|boolean|
|**followed**  <br>*可选*|true 为已关注  <br>**样例** : `true`|boolean|
|**id**  <br>*可选*|观点id  <br>**样例** : `0`|integer (int32)|
|**images**  <br>*可选*|图片  <br>**样例** : `[ "[picvo](#picvo)" ]`|< [PicVO](#picvo) > array|
|**isReported**  <br>*可选*|false正常  true为被举报删除  <br>**样例** : `true`|boolean|
|**notInterested**  <br>*可选*|true 添加至不感兴趣  <br>**样例** : `true`|boolean|
|**optionColor**  <br>*可选*|1为红发 2为蓝方  <br>**样例** : `0`|integer (int32)|
|**optionContent**  <br>*可选*|选中的观点内容  <br>**样例** : `"string"`|string|
|**optionId**  <br>*可选*|选择的观点选项id  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**priseUserAvatar**  <br>*可选*|点赞用户头像  <br>**样例** : `[ "[discoverpraisevo](#discoverpraisevo)" ]`|< [DiscoverPraiseVO](#discoverpraisevo) > array|
|**prised**  <br>*可选*|true 为已点赞  <br>**样例** : `true`|boolean|
|**talent**  <br>*可选*|1 为达人  <br>**样例** : `0`|integer (int32)|
|**topicId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**topicType**  <br>*可选*|态度话题类型 1pk 2投票  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型 1 常规 2 经典 3 精彩  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|用户id  <br>**样例** : `0`|integer (int32)|
|**userGroup**  <br>*可选*|用户组  <br>**样例** : `[ "[yxkcertbean](#yxkcertbean)" ]`|< [YxkCertBean](#yxkcertbean) > array|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="1228556b0fe1c3f920a78346c188cd9b"></a>
### 态度话题观点详情

|名称|说明|类型|
|---|---|---|
|**attitudeViewPointVO**  <br>*可选*|观点详情  <br>**样例** : `"[19e755d657a6ee5273ad80af3a938b2c](#19e755d657a6ee5273ad80af3a938b2c)"`|[态度话题观点](#19e755d657a6ee5273ad80af3a938b2c)|
|**discoverComments**  <br>*可选*|评论  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**isMoreComment**  <br>*可选*|是否有更多评论  <br>**样例** : `true`|boolean|
|**remainFloorNum**  <br>*可选*|剩余楼层数  <br>**样例** : `0`|integer (int32)|
|**topicOrMdd**  <br>*可选*|话题和目的地，话题：topic，目的地：mdd  <br>**样例** : `[ "[b9842b7e7bafdd3f108cf03c5f61e1b2](#b9842b7e7bafdd3f108cf03c5f61e1b2)" ]`|< [Map«string,object»](#b9842b7e7bafdd3f108cf03c5f61e1b2) > array|


<a name="6e55a64bd5b351f9a7afa09c5866577a"></a>
### 态度话题详情

|名称|说明|类型|
|---|---|---|
|**activity**  <br>*可选*|活动  <br>**样例** : `"[activity](#activity)"`|[Activity](#activity)|
|**desc**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**end**  <br>*可选*|true 为活动结束  <br>**样例** : `true`|boolean|
|**endTime**  <br>*可选*|距离活动结束时间剩余毫秒数 -1表示投票没时间限制  <br>**样例** : `0`|integer (int64)|
|**hasPrise**  <br>*可选*|1 无奖 2 有奖  <br>**样例** : `0`|integer (int32)|
|**miniShareVO**  <br>*可选*|小程序分享链接  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**optionInfo**  <br>*可选*|观点投票统计  <br>**样例** : `[ "[attitudeoptioninfovo](#attitudeoptioninfovo)" ]`|< [AttitudeOptionInfoVO](#attitudeoptioninfovo) > array|
|**options**  <br>*可选*|观点选项  <br>**样例** : `[ "[attitudeoptionvo](#attitudeoptionvo)" ]`|< [AttitudeOptionVO](#attitudeoptionvo) > array|
|**publishTip**  <br>*可选*|发布引导词  <br>**样例** : `"string"`|string|
|**publishedContent**  <br>*可选*|true 为发表了观点内容  <br>**样例** : `true`|boolean|
|**showViewpointCarousel**  <br>*可选*|展示观点替代选项  <br>**样例** : `true`|boolean|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**topicId**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|态度话题类型 1pk 2投票  <br>**样例** : `0`|integer (int32)|
|**userCount**  <br>*可选*|参与人数  <br>**样例** : `"string"`|string|
|**viewPoints**  <br>*可选*|观点  <br>**样例** : `[ "[19e755d657a6ee5273ad80af3a938b2c](#19e755d657a6ee5273ad80af3a938b2c)" ]`|< [态度话题观点](#19e755d657a6ee5273ad80af3a938b2c) > array|
|**viewpointCarousel**  <br>*可选*|观点轮播  <br>**样例** : `[ "[viewpointsamplevo](#viewpointsamplevo)" ]`|< [ViewpointSampleVO](#viewpointsamplevo) > array|
|**voted**  <br>*可选*|true 为已投票  <br>**样例** : `true`|boolean|


<a name="f9e8eb8476e77757ebe82680be6c4d67"></a>
### 户外游 首页

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**flowTags**  <br>*可选*|户外游瀑布流标签  <br>**样例** : `"[outdoorflowtagvo](#outdoorflowtagvo)"`|[OutdoorFlowTagVO](#outdoorflowtagvo)|
|**hotTheme**  <br>*可选*|热门主题  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**mdd**  <br>*可选*|当季目的地  <br>**样例** : `"[mddwrapvo](#mddwrapvo)"`|[MddWrapVO](#mddwrapvo)|
|**nav**  <br>*可选*|导航分类  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**outdoorLevel**  <br>*可选*|徒步星级  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**reserveAd**  <br>*可选*|预留广告位  <br>**样例** : `"[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)"`|[广告位_1](#b11c184172f598526fa266c6a995db52)|
|**showNav**  <br>*可选*|是否隐藏导航分类:true(显示)  false(不显示)  <br>**样例** : `true`|boolean|


<a name="b44642352895b8a32c709c003f7d3cd4"></a>
### 户外游瀑布性质标签

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|二级模板id  <br>**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="9bf3074fe642eea9e733f50c579ee952"></a>
### 推荐位目录板块

|名称|说明|类型|
|---|---|---|
|**destAds**  <br>*可选*|数据列  <br>**样例** : `[ "[4af669a3d5bb99ef7152def05001455e](#4af669a3d5bb99ef7152def05001455e)" ]`|< [推荐目的地](#4af669a3d5bb99ef7152def05001455e) > array|
|**list**  <br>*可选*|子板块  <br>**样例** : `[ "[9bf3074fe642eea9e733f50c579ee952](#9bf3074fe642eea9e733f50c579ee952)" ]`|< [推荐位目录板块](#9bf3074fe642eea9e733f50c579ee952) > array|
|**plateDesc**  <br>*可选*|板块描述  <br>**样例** : `"string"`|string|
|**plateName**  <br>*可选*|板块名  <br>**样例** : `"string"`|string|


<a name="4af669a3d5bb99ef7152def05001455e"></a>
### 推荐目的地

|名称|说明|类型|
|---|---|---|
|**colorValue**  <br>*可选*|图片蒙图颜色值  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|自定义图片  <br>**样例** : `"string"`|string|
|**link**  <br>*可选*|链接  <br>**样例** : `"string"`|string|
|**mddDesc**  <br>*可选*|目的地简介  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地ID  <br>**样例** : `0`|integer (int64)|
|**mddName**  <br>*可选*|目的地名  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|实体类型  <br>**样例** : `0`|integer (int32)|


<a name="21e1f1e44640a470c19a9d1e3a3c5878"></a>
### 摄影游 首页

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**hotTheme**  <br>*可选*|热门主题  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**mdd**  <br>*可选*|当季目的地  <br>**样例** : `"[mddwrapvo](#mddwrapvo)"`|[MddWrapVO](#mddwrapvo)|
|**photoAd**  <br>*可选*|摄影风采  <br>**样例** : `"[photoadvo](#photoadvo)"`|[PhotoAdVO](#photoadvo)|
|**segmentTags**  <br>*可选*|摄影游瀑布流搜索标签  <br>**样例** : `[ "[f03bf1cafcb4e043b12412955a1a4f2b](#f03bf1cafcb4e043b12412955a1a4f2b)" ]`|< [摄影游瀑布流搜索标签_1](#f03bf1cafcb4e043b12412955a1a4f2b) > array|


<a name="92688d46a8f27f22d3e47069606bf451"></a>
### 摄影游瀑布流搜索标签

|名称|说明|类型|
|---|---|---|
|**child**  <br>*可选*|**样例** : `[ "[45ac8b33c76f5154a09a4744f39525f5](#45ac8b33c76f5154a09a4744f39525f5)" ]`|< [国内游瀑布流目的地标签](#45ac8b33c76f5154a09a4744f39525f5) > array|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|


<a name="f03bf1cafcb4e043b12412955a1a4f2b"></a>
### 摄影游瀑布流搜索标签_1

|名称|说明|类型|
|---|---|---|
|**child**  <br>*可选*|**样例** : `[ "[45ac8b33c76f5154a09a4744f39525f5](#45ac8b33c76f5154a09a4744f39525f5)" ]`|< [国内游瀑布流目的地标签](#45ac8b33c76f5154a09a4744f39525f5) > array|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|默认0 摄影性质1  <br>**样例** : `0`|integer (int32)|


<a name="b4425fd96b3bc32e4ffdc242d00d017a"></a>
### 摄影风采广告位

|名称|说明|类型|
|---|---|---|
|**ageRange**  <br>*可选*|搜索条件-亲子年龄  <br>**样例** : `"string"`|string|
|**blockId**  <br>*可选*|广告位关联的板块id  <br>**样例** : `0`|integer (int32)|
|**exp**  <br>*可选*|过期日期时间戳，0表示永久  <br>**样例** : `0`|integer (int64)|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**imageSecond**  <br>*可选*|图片第二张，可能是背景图片等  <br>**样例** : `"string"`|string|
|**mediaImage**  <br>*可选*|视频封面地址  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|视频地址  <br>**样例** : `"string"`|string|
|**navType**  <br>*可选*|导航样式类型：2突出3new4hot  <br>**样例** : `0`|integer (int32)|
|**outLevel**  <br>*可选*|搜索条件-户外星级  <br>**样例** : `0`|integer (int32)|
|**statisticsCode**  <br>*可选*|线路统计相关；搜索来源统计前缀，需要拼接上‘&pid’  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**subType**  <br>*可选*|搜索栏2级  <br>**样例** : `0`|integer (int32)|
|**tagName**  <br>*可选*|摄影风采标签显示  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|搜索栏1级  <br>**样例** : `0`|integer (int32)|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="240812a6f55b3669378d67303af90986"></a>
### 攻略带货卡片

|名称|说明|类型|
|---|---|---|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**recommendModules**  <br>*可选*|卡片列表  <br>**样例** : `[ "[recommendmodule](#recommendmodule)" ]`|< [RecommendModule](#recommendmodule) > array|


<a name="4491b0642d391d480f9ee8e6c27c0b7b"></a>
### 星座

|名称|说明|类型|
|---|---|---|
|**allDesc**  <br>*可选*|综合运势概述  <br>**样例** : `"string"`|string|
|**allRank**  <br>*可选*|综合运势等级  <br>**样例** : `0`|integer (int32)|
|**careerDesc**  <br>*可选*|事业运势概述  <br>**样例** : `"string"`|string|
|**careerRank**  <br>*可选*|事业运势等级  <br>**样例** : `0`|integer (int32)|
|**loveDesc**  <br>*可选*|爱情运势概述  <br>**样例** : `"string"`|string|
|**loveRank**  <br>*可选*|爱情运势等级  <br>**样例** : `0`|integer (int32)|
|**mdd**  <br>*可选*|事业运势概述  <br>**样例** : `"[constellationmddvo](#constellationmddvo)"`|[ConstellationMddVO](#constellationmddvo)|
|**name**  <br>*可选*|星座名称  <br>**样例** : `"string"`|string|
|**nameCode**  <br>*可选*|星座对应code  <br>**样例** : `"string"`|string|
|**wealthDesc**  <br>*可选*|财富运势概述  <br>**样例** : `"string"`|string|
|**wealthRank**  <br>*可选*|财富运势等级  <br>**样例** : `0`|integer (int32)|


<a name="2e2e901a4b734fb6cae6a7471f44ecd1"></a>
### 标题包装类

|名称|说明|类型|
|---|---|---|
|**handlerList**  <br>*可选*|数据  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="31a76ef05a82597c79626e4fbf8750fb"></a>
### 榜单

|名称|说明|类型|
|---|---|---|
|**myRank**  <br>*可选*|我的排行  <br>**样例** : `"[discoverstarsvo](#discoverstarsvo)"`|[DiscoverStarsVO](#discoverstarsvo)|
|**note**  <br>*可选*|遇见红人榜文案  <br>**样例** : `"string"`|string|
|**rankList**  <br>*可选*|排行榜  <br>**样例** : `[ "[discoverstarsvo](#discoverstarsvo)" ]`|< [DiscoverStarsVO](#discoverstarsvo) > array|


<a name="6112942568e4385162840aabea263386"></a>
### 瀑布流-专题

|名称|说明|类型|
|---|---|---|
|**blurColor**  <br>*可选*|虚化颜色  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|专题唯一标识  <br>**样例** : `0`|integer (int32)|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="4bc747f446fe11cbd9ed2378a732f644"></a>
### 瀑布流-侠魁游记

|名称|说明|类型|
|---|---|---|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万人浏览  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**talent**  <br>*可选*|是否为达人，1达人，0不是  <br>**样例** : `0`|integer (int32)|
|**tid**  <br>*可选*|游记id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="89d1f32b205b128dbb4fc4539183c9be"></a>
### 瀑布流-房券引导

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**priceLabel**  <br>*可选*|价格不带￥和起，可能出现免费或核算中  <br>**样例** : `"string"`|string|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="24334c3f36be041b6e63aab0a09f2b4d"></a>
### 瀑布流-攻略

|名称|说明|类型|
|---|---|---|
|**ad**  <br>*可选*|**样例** : `true`|boolean|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**newsId**  <br>*可选*|攻略id  <br>**样例** : `0`|integer (int32)|
|**numLabel**  <br>*可选*|例如：1.1万人种草  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|


<a name="26211fe73d4c0d64b89f84a9ab2becc4"></a>
### 瀑布流-榜单

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|榜单唯一标识  <br>**样例** : `0`|integer (int32)|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="c34f42db49443c24259b5f590ab029a4"></a>
### 瀑布流-目的地

|名称|说明|类型|
|---|---|---|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万人种草  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|


<a name="308a7797247ef3f38e961a3de8798d34"></a>
### 瀑布流-线路或者酒套

|名称|说明|类型|
|---|---|---|
|**ageLabel**  <br>*可选*|亲子年龄  <br>**样例** : `"string"`|string|
|**days**  <br>*可选*|活动天数，例如3天2晚  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**listColor**  <br>*可选*|列表框颜色  <br>**样例** : `"string"`|string|
|**listColorV2**  <br>*可选*|列表框营销颜色v2，如果图片是v2的颜色也用v2  <br>**样例** : `"string"`|string|
|**listImgUrl**  <br>*可选*|列表页图片地址  <br>**样例** : `"string"`|string|
|**listImgUrlV2**  <br>*可选*|列表页营销图片地址V2，v2有值用v2，没有再用listImgUrl  <br>**样例** : `"string"`|string|
|**marketingIco**  <br>*可选*|营销标（新版）  <br>**样例** : `"string"`|string|
|**marketingList**  <br>*可选*|营销信息（新版），例如：1人：最高减￥100  <br>**样例** : `[ "string" ]`|< string > array|
|**marketingTag**  <br>*可选*|营销活动标签（图片链接）  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万已报名/1.1万已售  <br>**样例** : `"string"`|string|
|**outDoorLabel**  <br>*可选*|户外星级  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地，例如：杭州出发  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格不带￥和起，可能出现免费或核算中  <br>**样例** : `"string"`|string|
|**productCat**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**saleOne**  <br>*可选*|限时特惠/砍价优惠  <br>**样例** : `"[18200de7cdf43619db9263c39673362d](#18200de7cdf43619db9263c39673362d)"`|[优惠信息](#18200de7cdf43619db9263c39673362d)|
|**saleOtherList**  <br>*可选*|其他优惠列表  <br>**样例** : `[ "[18200de7cdf43619db9263c39673362d](#18200de7cdf43619db9263c39673362d)" ]`|< [优惠信息](#18200de7cdf43619db9263c39673362d) > array|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|批次状态，1可报名2确定成行  <br>**样例** : `0`|integer (int32)|
|**statusLabel**  <br>*可选*|批次状态文案  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型：1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**typetwoOrCat**  <br>*可选*|二级活动类型/活动性质，分享会没值  <br>**样例** : `"string"`|string|


<a name="c821dd8e1e8fe318546a114f9cda8557"></a>
### 瀑布流-线路或者酒套_1

|名称|说明|类型|
|---|---|---|
|**ageLabel**  <br>*可选*|亲子年龄  <br>**样例** : `"string"`|string|
|**days**  <br>*可选*|活动天数，例如3天2晚  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**liangdian**  <br>*可选*|亮点词  <br>**样例** : `[ "string" ]`|< string > array|
|**listColor**  <br>*可选*|列表框颜色  <br>**样例** : `"string"`|string|
|**listColorV2**  <br>*可选*|列表框营销颜色v2，如果图片是v2的颜色也用v2  <br>**样例** : `"string"`|string|
|**listImgUrl**  <br>*可选*|列表页图片地址  <br>**样例** : `"string"`|string|
|**listImgUrlV2**  <br>*可选*|列表页营销图片地址V2，v2有值用v2，没有再用listImgUrl  <br>**样例** : `"string"`|string|
|**marketingIco**  <br>*可选*|营销标（新版）  <br>**样例** : `"string"`|string|
|**marketingList**  <br>*可选*|营销信息（新版），例如：1人：最高减￥100  <br>**样例** : `[ "string" ]`|< string > array|
|**marketingTag**  <br>*可选*|营销活动标签（图片链接）  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万已报名/1.1万已售  <br>**样例** : `"string"`|string|
|**outDoorLabel**  <br>*可选*|户外星级  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|产品id  <br>**样例** : `0`|integer (int32)|
|**placeLabel**  <br>*可选*|目的地，例如：杭州出发  <br>**样例** : `"string"`|string|
|**priceLabel**  <br>*可选*|价格不带￥和起，可能出现免费或核算中  <br>**样例** : `"string"`|string|
|**productCat**  <br>*可选*|产品性质  <br>**样例** : `"string"`|string|
|**productType**  <br>*可选*|产品类型  <br>**样例** : `"string"`|string|
|**saleOne**  <br>*可选*|限时特惠/砍价优惠  <br>**样例** : `"[18200de7cdf43619db9263c39673362d](#18200de7cdf43619db9263c39673362d)"`|[优惠信息](#18200de7cdf43619db9263c39673362d)|
|**saleOtherList**  <br>*可选*|其他优惠列表  <br>**样例** : `[ "[18200de7cdf43619db9263c39673362d](#18200de7cdf43619db9263c39673362d)" ]`|< [优惠信息](#18200de7cdf43619db9263c39673362d) > array|
|**salePriceLabel**  <br>*可选*|优惠后价格不带￥和起，为空时只显示原价  <br>**样例** : `"string"`|string|
|**statisticsCode**  <br>*可选*|线路统计相关  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|产品类型：1线路2酒套  <br>**样例** : `0`|integer (int32)|
|**typetwoOrCat**  <br>*可选*|二级活动类型/活动性质，分享会没值  <br>**样例** : `"string"`|string|


<a name="f8a769f0258a2040cb48e81b6a97de3c"></a>
### 瀑布流-视频

|名称|说明|类型|
|---|---|---|
|**ad**  <br>*可选*|**样例** : `true`|boolean|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**fid**  <br>*可选*|视频id  <br>**样例** : `0`|integer (int32)|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**mediaUrl**  <br>*可选*|七牛视频地址  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|例如：1.1万次播放  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**timeLabel**  <br>*可选*|视频时长  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|


<a name="93d4285e55a84bf81fdbbdcec0c32b38"></a>
### 瀑布流-遇见

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|位置信息  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**did**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**discus**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**numLabel**  <br>*可选*|点赞数量，例如：1.1万  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**talent**  <br>*可选*|是否为达人，1达人，0不是  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|


<a name="8ee2164a46f04fa4907ffd0b66ed7393"></a>
### 瀑布流-频道引导

|名称|说明|类型|
|---|---|---|
|**handler**  <br>*可选*|跳转协议  <br>**样例** : `"string"`|string|
|**image**  <br>*可选*|图片  <br>**样例** : `"string"`|string|
|**subTitle**  <br>*可选*|副标题  <br>**样例** : `"string"`|string|
|**tagList**  <br>*可选*|标签  <br>**样例** : `[ "string" ]`|< string > array|
|**title**  <br>*可选*|主标题  <br>**样例** : `"string"`|string|
|**typeImage**  <br>*可选*|类型图片  <br>**样例** : `"string"`|string|
|**typeImageV2**  <br>*可选*|类型图片V2  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|跳转协议参数  <br>**样例** : `"string"`|string|


<a name="33efe7124d8a0c9e38b5a762a9321a69"></a>
### 目的地遇见聚合

|名称|说明|类型|
|---|---|---|
|**destName**  <br>*可选*|目的地名称  <br>**样例** : `"string"`|string|
|**discoverPage**  <br>*可选*|遇见列  <br>**样例** : `[ "[9bb7ba4540155bd75efcfdb3fa551d2e](#9bb7ba4540155bd75efcfdb3fa551d2e)" ]`|< [遇见、话题UI类型区分](#9bb7ba4540155bd75efcfdb3fa551d2e) > array|
|**hottestDiscover**  <br>*可选*|最热遇见  <br>**样例** : `"[01fe8ae64880e81a71a4095f07bcda71](#01fe8ae64880e81a71a4095f07bcda71)"`|[遇见、话题UI类型区分_1](#01fe8ae64880e81a71a4095f07bcda71)|
|**mddId**  <br>*可选*|目的地id  <br>**样例** : `0`|integer (int32)|
|**recordCount**  <br>*可选*|总遇见数  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="0bf878a2ed1d69acaee015cecc780236"></a>
### 线路:0    频道:5  签证产品:6

|名称|说明|类型|
|---|---|---|
|**advertisement**  <br>*可选*|广告位  <br>**样例** : `[ "[13aea96aa619329e8b1cb9f397ced4c9](#13aea96aa619329e8b1cb9f397ced4c9)" ]`|< [广告位_4](#13aea96aa619329e8b1cb9f397ced4c9) > array|
|**bbs**  <br>*可选*|**样例** : `"[12b7e123f8a7596e63273392d43bf5b3](#12b7e123f8a7596e63273392d43bf5b3)"`|[BaseHandlerVO«Map«string,object»»](#12b7e123f8a7596e63273392d43bf5b3)|
|**dests**  <br>*可选*|**样例** : `[ "[productsearchmddrespvo](#productsearchmddrespvo)" ]`|< [ProductSearchMddRespVo](#productsearchmddrespvo) > array|
|**film**  <br>*可选*|**样例** : `"[12b7e123f8a7596e63273392d43bf5b3](#12b7e123f8a7596e63273392d43bf5b3)"`|[BaseHandlerVO«Map«string,object»»](#12b7e123f8a7596e63273392d43bf5b3)|
|**lines**  <br>*可选*|**样例** : `"[3bb47610c281a7f2281f17c774d8fdcf](#3bb47610c281a7f2281f17c774d8fdcf)"`|[BaseHandlerVO«Line»](#3bb47610c281a7f2281f17c774d8fdcf)|
|**news**  <br>*可选*|**样例** : `"[12b7e123f8a7596e63273392d43bf5b3](#12b7e123f8a7596e63273392d43bf5b3)"`|[BaseHandlerVO«Map«string,object»»](#12b7e123f8a7596e63273392d43bf5b3)|
|**photo**  <br>*可选*|**样例** : `"[12b7e123f8a7596e63273392d43bf5b3](#12b7e123f8a7596e63273392d43bf5b3)"`|[BaseHandlerVO«Map«string,object»»](#12b7e123f8a7596e63273392d43bf5b3)|


<a name="9e0c7176e56910ff60ef06a37c92029e"></a>
### 编辑页面内容

|名称|说明|类型|
|---|---|---|
|**contentList**  <br>*可选*|游记内容  <br>**样例** : `[ "[travelarticlecontentsvo](#travelarticlecontentsvo)" ]`|< [TravelarticleContentsVo](#travelarticlecontentsvo) > array|
|**coverImage**  <br>*可选*|封面图  <br>**样例** : `"string"`|string|
|**displayorder**  <br>*可选*|游记状态 0为发布 9为审核中 10为草稿  <br>**样例** : `0`|integer (int32)|
|**musicName**  <br>*可选*|背景音乐名称  <br>**样例** : `"string"`|string|
|**musicUrl**  <br>*可选*|背景音乐  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|内容排序  <br>**样例** : `"string"`|string|
|**title**  <br>*可选*|游记标题  <br>**样例** : `"string"`|string|
|**yxkid**  <br>*可选*|yxkid  <br>**样例** : `0`|integer (int64)|


<a name="5de5eea7574a65248d597d9b0f032ce4"></a>
### 自由行瀑布流搜索标签

|名称|说明|类型|
|---|---|---|
|**child**  <br>*可选*|**样例** : `[ "[45ac8b33c76f5154a09a4744f39525f5](#45ac8b33c76f5154a09a4744f39525f5)" ]`|< [国内游瀑布流目的地标签](#45ac8b33c76f5154a09a4744f39525f5) > array|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTitle**  <br>*可选*|**样例** : `"string"`|string|
|**title**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|0：默认为目的地 1:标签(海岛)  <br>**样例** : `0`|integer (int32)|


<a name="34a4e3083533dc4c42f070d3abea7113"></a>
### 自由行首页

|名称|说明|类型|
|---|---|---|
|**banner**  <br>*可选*|头部幻灯片  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**nav**  <br>*可选*|导航分类  <br>**样例** : `[ "[b11c184172f598526fa266c6a995db52](#b11c184172f598526fa266c6a995db52)" ]`|< [广告位_1](#b11c184172f598526fa266c6a995db52) > array|
|**outdoorNavWrap**  <br>*可选*|出行必备  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**segmentTags**  <br>*可选*|自由行-瀑布流搜索标签  <br>**样例** : `[ "[5de5eea7574a65248d597d9b0f032ce4](#5de5eea7574a65248d597d9b0f032ce4)" ]`|< [自由行瀑布流搜索标签](#5de5eea7574a65248d597d9b0f032ce4) > array|
|**themeWrap**  <br>*可选*|主题游玩  <br>**样例** : `"[2e2e901a4b734fb6cae6a7471f44ecd1](#2e2e901a4b734fb6cae6a7471f44ecd1)"`|[标题包装类](#2e2e901a4b734fb6cae6a7471f44ecd1)|
|**topCNProduct**  <br>*可选*|国内-人气尖货  <br>**样例** : `"[cnchanneltopproduct](#cnchanneltopproduct)"`|[CNChannelTopProduct](#cnchanneltopproduct)|
|**topOutProduct**  <br>*可选*|出境-人气尖货  <br>**样例** : `"[cnchanneltopproduct](#cnchanneltopproduct)"`|[CNChannelTopProduct](#cnchanneltopproduct)|


<a name="22b4334f915541755261249f38d0df9b"></a>
### 草稿

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**num**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|类型，遇见：1，游记：2  <br>**样例** : `0`|integer (int32)|


<a name="009dac8e28b632f81c4309d510b2e713"></a>
### 评论参数对象
评论参数对象


|名称|说明|类型|
|---|---|---|
|**authorName**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|
|**authorid**  <br>*可选*|用户id  <br>**样例** : `"string"`|string|
|**createdAt**  <br>*可选*|评论创建时间  <br>**样例** : `"string"`|string|
|**groupTitle**  <br>*可选*|用户组名  <br>**样例** : `"string"`|string|
|**message**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**pid**  <br>*可选*|评论id  <br>**样例** : `"string"`|string|
|**quoteHeadLine**  <br>*可选*|回复内容第一行  <br>**样例** : `"string"`|string|
|**quoteId**  <br>*可选*|被回复的评论的id  <br>**样例** : `"string"`|string|
|**quoteMessage**  <br>*可选*|回复引用的内容  <br>**样例** : `"string"`|string|
|**stars**  <br>*可选*|组等级  <br>**样例** : `"string"`|string|
|**tid**  <br>*可选*|游记id  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|回复类型 1针对游记 2针对评论  <br>**样例** : `"string"`|string|
|**userPic**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**yxkid**  <br>*可选*|yxkid  <br>**样例** : `"string"`|string|


<a name="b00a65e94a223b1cc173ea1fbbfc0e7a"></a>
### 话题

|名称|说明|类型|
|---|---|---|
|**banners**  <br>*可选*|态度话题推荐  <br>**样例** : `[ "[attitudeadbannervo](#attitudeadbannervo)" ]`|< [AttitudeAdBannerVO](#attitudeadbannervo) > array|
|**hotTopic**  <br>*可选*|热度话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|
|**normalTopic**  <br>*可选*|普通话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|
|**topic**  <br>*可选*|征集推荐话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|


<a name="ef893f696a22e4a5259fe47e337161fc"></a>
### 话题分类

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|话题id  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="6be0a811ae2c9608db75f16d2604ec64"></a>
### 话题广场

|名称|说明|类型|
|---|---|---|
|**levyTopic**  <br>*可选*|征集话题  <br>**样例** : `"[topicvo](#topicvo)"`|[TopicVO](#topicvo)|
|**pageSize**  <br>*可选*|分页数量  <br>**样例** : `0`|integer (int32)|
|**topic**  <br>*可选*|话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|
|**total**  <br>*可选*|总记录数  <br>**样例** : `0`|integer (int64)|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="f9b05da97d8da8dff2197439527682cd"></a>
### 选择标签

|名称|说明|类型|
|---|---|---|
|**sortTags**  <br>*可选*|排序  <br>**样例** : `[ "[f9b05da97d8da8dff2197439527682cd](#f9b05da97d8da8dff2197439527682cd)" ]`|< [选择标签](#f9b05da97d8da8dff2197439527682cd) > array|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|类型  <br>**样例** : `0`|integer (int32)|


<a name="9bb7ba4540155bd75efcfdb3fa551d2e"></a>
### 遇见、话题UI类型区分

|名称|说明|类型|
|---|---|---|
|**uiType**  <br>*可选*|ui展示类型 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|


<a name="01fe8ae64880e81a71a4095f07bcda71"></a>
### 遇见、话题UI类型区分_1

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**comment**  <br>*可选*|评论数  <br>**样例** : `0`|integer (int32)|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面图  <br>**样例** : `"string"`|string|
|**discus**  <br>*可选*|话题  <br>**样例** : `[ "[discussvo](#discussvo)" ]`|< [DiscussVO](#discussvo) > array|
|**featured**  <br>*可选*|是否精选  <br>**样例** : `0`|integer (int32)|
|**firstImg**  <br>*可选*|遇见首图  <br>**样例** : `"[imagevo](#imagevo)"`|[ImageVO](#imagevo)|
|**isV**  <br>*可选*|是否加v  <br>**样例** : `true`|boolean|
|**noticeUsers**  <br>*可选*|@用户列  <br>**样例** : `[ "[noticeuservo](#noticeuservo)" ]`|< [NoticeUserVO](#noticeuservo) > array|
|**prise**  <br>*可选*|点赞数  <br>**样例** : `"string"`|string|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quoteId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**uiType**  <br>*可选*|ui展示类型 1遇见，2遇见话题  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|


<a name="c9c9224079f080b01e9319067bc8c230"></a>
### 遇见分类

|名称|说明|类型|
|---|---|---|
|**boardTime**  <br>*可选*|榜单时间  <br>**样例** : `[ "[group](#group)" ]`|< [Group](#group) > array|
|**categoryId**  <br>*可选*|id  1 热门 2最新 3精选 4榜单  <br>**样例** : `0`|integer (int32)|
|**title**  <br>*可选*|标题  <br>**样例** : `"string"`|string|


<a name="0b011531c01a8737606be9b8e693d22e"></a>
### 遇见发现页上半部分数据

|名称|说明|类型|
|---|---|---|
|**rankList**  <br>*可选*|遇见红人榜  <br>**样例** : `[ "[discoverrankvo](#discoverrankvo)" ]`|< [DiscoverRankVO](#discoverrankvo) > array|
|**topic**  <br>*可选*|征集推荐话题  <br>**样例** : `[ "[topicvo](#topicvo)" ]`|< [TopicVO](#topicvo) > array|
|**weekList**  <br>*可选*|遇见周榜  <br>**样例** : `[ "[discoverrankvo](#discoverrankvo)" ]`|< [DiscoverRankVO](#discoverrankvo) > array|


<a name="867fbdaaca71777af457191849e51819"></a>
### 遇见瀑布流数据

|名称|说明|类型|
|---|---|---|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|


<a name="50146ca4ab2b0b329bfabd3143cf2422"></a>
### 遇见瀑布流数据_1

|名称|说明|类型|
|---|---|---|
|**activityType**  <br>*可选*|0:普通，1：营销活动，2：推广  <br>**样例** : `0`|integer (int32)|
|**address**  <br>*可选*|目的地  <br>**样例** : `"string"`|string|
|**avatar**  <br>*可选*|用户头像  <br>**样例** : `"string"`|string|
|**content**  <br>*可选*|遇见内容  <br>**样例** : `"string"`|string|
|**cover**  <br>*可选*|遇见封面  <br>**样例** : `"string"`|string|
|**discuss**  <br>*可选*|话题  <br>**样例** : `"string"`|string|
|**featured**  <br>*可选*|1为精选 0为普通  <br>**样例** : `0`|integer (int32)|
|**firstImg**  <br>*可选*|遇见首图  <br>**样例** : `"[imagevo](#imagevo)"`|[ImageVO](#imagevo)|
|**isTalent**  <br>*可选*|是否是达人  <br>**样例** : `true`|boolean|
|**panoramaPercent**  <br>*可选*|全景图起始位置百分比  <br>**样例** : `"string"`|string|
|**panoramaStatus**  <br>*可选*|1为全景图  <br>**样例** : `0`|integer (int32)|
|**prise**  <br>*可选*|点数赞  <br>**样例** : `0`|integer (int32)|
|**prised**  <br>*可选*|是否点赞  <br>**样例** : `true`|boolean|
|**quoteId**  <br>*可选*|遇见id  <br>**样例** : `0`|integer (int32)|
|**recordingDuration**  <br>*可选*|录音时长  <br>**样例** : `0`|integer (int32)|
|**uid**  <br>*可选*|发表遇见用户id  <br>**样例** : `0`|integer (int32)|
|**uitype**  <br>*可选*|ui类型 0：遇见<br> 1:话题集合<br>2:单个话题<br>3:推荐用户  <br>**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|用户名  <br>**样例** : `"string"`|string|
|**video**  <br>*可选*|小视频地址  <br>**样例** : `"string"`|string|


<a name="1a81090208e905aa23bf505a9c31fdf4"></a>
### 遇见详情

|名称|说明|类型|
|---|---|---|
|**auditStatus**  <br>*可选*|审核状态：-1违规，0->审核中，1->审核通过  <br>**样例** : `0`|integer (int32)|
|**comments**  <br>*可选*|comments  <br>**样例** : `[ "[discovercommentvo](#discovercommentvo)" ]`|< [DiscoverCommentVO](#discovercommentvo) > array|
|**discoverBillboard**  <br>*可选*|榜单  <br>**样例** : `"[discoverbillboardvo](#discoverbillboardvo)"`|[DiscoverBillboardVO](#discoverbillboardvo)|
|**isOwn**  <br>*可选*|是否是自己的遇见  <br>**样例** : `true`|boolean|
|**mdds**  <br>*可选*|目的地，如果是景点，景点在第一个，它的上级在第二个  <br>**样例** : `[ "[discoverdetailmddvo](#discoverdetailmddvo)" ]`|< [DiscoverDetailMddVO](#discoverdetailmddvo) > array|
|**miniShareVO**  <br>*可选*|分享小程序  <br>**样例** : `"[minisharevo](#minisharevo)"`|[MiniShareVO](#minisharevo)|
|**page**  <br>*可选*|当前页码  <br>**样例** : `0`|integer (int32)|
|**praises**  <br>*可选*|praises  <br>**样例** : `[ "[discoverpraisevo](#discoverpraisevo)" ]`|< [DiscoverPraiseVO](#discoverpraisevo) > array|
|**product**  <br>*可选*|目的地+线路商品 type : mdd  & type : product  <br>**样例** : `[ "object" ]`|< object > array|
|**quote**  <br>*可选*|quote  <br>**样例** : `"[discoverdetailquotevo](#discoverdetailquotevo)"`|[DiscoverDetailQuoteVO](#discoverdetailquotevo)|
|**recordCount**  <br>*可选*|每页数  <br>**样例** : `0`|integer (int32)|
|**remainFloorNum**  <br>*可选*|剩余楼层数  <br>**样例** : `0`|integer (int32)|
|**shareTip**  <br>*可选*|分享提示信息  <br>**样例** : `"string"`|string|
|**totalPage**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="4af34500f9ee1f3bb65b707df9ffc521"></a>
### 频道推荐

|名称|说明|类型|
|---|---|---|
|**countryId**  <br>*可选*|国家  <br>**样例** : `"string"`|string|
|**coverImg**  <br>*可选*|频道页封面图  <br>**样例** : `"string"`|string|
|**handler**  <br>*可选*|跳转类型  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**orderCount**  <br>*可选*|销量  <br>**样例** : `0`|integer (int64)|
|**pid**  <br>*可选*|线路编号  <br>**样例** : `0`|integer (int32)|
|**position**  <br>*可选*|推荐位  <br>**样例** : `0`|integer (int32)|
|**price**  <br>*可选*|价格  <br>**样例** : `0.0`|number|
|**productType**  <br>*可选*|线路类型 1 免签 2 落地签 3 提前签  <br>**样例** : `"string"`|string|
|**url**  <br>*可选*|url  <br>**样例** : `"string"`|string|
|**visaId**  <br>*可选*|签证编号  <br>**样例** : `0`|integer (int32)|



