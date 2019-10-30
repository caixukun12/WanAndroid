package com.example.lhy.wanandroid.bean.homebean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by usercwq on 2019/10/26.
 */

public class HomeBean implements Serializable {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,
     * "chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":9929,"link":"https://mp.weixin.qq.com/s/_4a-VSaM2TYRkKNAXblUVA","niceDate":"1天前",
     * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571932800000,"selfVisible":0,"shareDate":1572008055000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/409/1"}],"title":"Kotlin的自定义View，实现带弧形的进度条","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,
     * "chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9937,"link":"https://mp.weixin.qq.com/s/L5lnZroOJ8_Y0HYIAwzw0w",
     * "niceDate":"1天前","niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571932800000,"selfVisible":0,"shareDate":1572008478000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/414/1"}],"title":"看完这几张图，保你懂循环、递归、二分检索","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":360,
     * "chapterName":"小编发布","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9911,"link":"https://www.wanandroid.com/blog/show/2699",
     * "niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571931614000,"selfVisible":0,"shareDate":1571931471000,"shareUser":"",
     * "superChapterId":298,"superChapterName":"原创文章","tags":[],
     * "title":"本站为wanandroid开源项目提供无限支持！","type":0,"userId":-1,"visible":1,"zan":0},
     * {"apkLink":"","audit":1,"author":"","chapterId":500,"chapterName":"正则","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9902,"link":"https://juejin
     * .im/post/5db082b9f265da4cf900c64c","niceDate":"1天前","niceShareDate":"2天前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571931190000,"selfVisible":0,
     * "shareDate":1571875907000,"shareUser":"张风捷特烈","superChapterId":245,
     * "superChapterName":"Java深入","tags":[],"title":"正则十八式-第一式：直捣黄龙","type":0,"userId":31634,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":296,
     * "chapterName":"阅读","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":9904,"link":"https://www.jianshu.com/p/5680a3d20050","niceDate":"1天前",
     * "niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571931157000,"selfVisible":0,"shareDate":1571877109000,
     * "shareUser":"于慢慢家的吴蜀黍","superChapterId":181,"superChapterName":"延伸技术","tags":[],
     * "title":"中台到底是个什么鬼？","type":0,"userId":1260,"visible":1,"zan":0},{"apkLink":"","audit":1,
     * "author":"","chapterId":313,"chapterName":"字节码","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":9909,"link":"https://juejin
     * .im/post/5d049bc0e51d454d1d628510","niceDate":"1天前","niceShareDate":"2天前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571931128000,"selfVisible":0,
     * "shareDate":1571893915000,"shareUser":"秉心说___","superChapterId":245,
     * "superChapterName":"Java深入","tags":[],"title":"全网最全 Dalvik 指令集解析 ！","type":0,
     * "userId":22057,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,
     * "chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":9925,"link":"https://mp.weixin.qq.com/s/Pg4pKhSScK8NgtT2RDw2uQ","niceDate":"2天前",
     * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571846400000,"selfVisible":0,"shareDate":1572007879000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/408/1"}],"title":"终于找到一篇极佳的 NDK 入门文章","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,
     * "chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9935,"link":"https://mp.weixin.qq.com/s/---xvG2521teyTyMvYl3IA",
     * "niceDate":"2天前","niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571846400000,"selfVisible":0,"shareDate":1572008446000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/414/1"}],"title":"6. Jetpack---Paging你知道怎样上拉加载吗？","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生",
     * "chapterId":434,"chapterName":"Gityuan","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":9936,"link":"https://mp.weixin.qq
     * .com/s/UZQU-PWM5JEb3dYtZKT6Cw","niceDate":"2天前","niceShareDate":"18小时前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571846400000,"selfVisible":0,
     * "shareDate":1572008465000,"shareUser":"","superChapterId":408,"superChapterName":"公众号",
     * "tags":[{"name":"公众号","url":"/wxarticle/list/434/1"}],"title":"跨平台技术演进及 Flutter 未来",
     * "type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察",
     * "chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":9940,"link":"https://mp.weixin.qq
     * .com/s/G5Syqq1Ofxp4VFwEJOHSbg","niceDate":"2天前","niceShareDate":"18小时前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571846400000,"selfVisible":0,
     * "shareDate":1572008753000,"shareUser":"","superChapterId":408,"superChapterName":"公众号",
     * "tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"阿里巴巴的技术专家，是如何画好架构图的？",
     * "type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"",
     * "chapterId":423,"chapterName":"Architecture","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":9897,"link":"https://juejin
     * .im/post/5dafc49b6fb9a04e17209922","niceDate":"2天前","niceShareDate":"2天前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571843657000,"selfVisible":0,
     * "shareDate":1571818634000,"shareUser":"KunMinX","superChapterId":423,
     * "superChapterName":"Jetpack","tags":[],"title":"是让人耳目一新的 Jetpack MVVM 精讲啊！","type":0,
     * "userId":12482,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":198,
     * "chapterName":"基础概念","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9899,"link":"https://juejin.im/post/5dafc0416fb9a04ddf2c5101#comment",
     * "niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571843616000,"selfVisible":0,"shareDate":1571843197000,"shareUser":"鸿洋",
     * "superChapterId":168,"superChapterName":"基础知识","tags":[],"title":"Android 中不应该使用 Enum 吗？",
     * "type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"",
     * "chapterId":76,"chapterName":"项目架构","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":9900,"link":"https://juejin
     * .im/post/5daefe9a51882568691fba2d","niceDate":"2天前","niceShareDate":"2天前","origin":"",
     * "prefix":"","projectLink":"","publishTime":1571843602000,"selfVisible":0,
     * "shareDate":1571843424000,"shareUser":"鸿洋","superChapterId":75,"superChapterName":"热门专题",
     * "tags":[],"title":"安居客 Android App 走向平台化","type":0,"userId":2,"visible":1,"zan":0},
     * {"apkLink":"","audit":1,"author":"","chapterId":71,"chapterName":"数据解析","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9874,"link":"https://juejin
     * .im/post/5dadac2ae51d4524c3745219","niceDate":"2019-10-23","niceShareDate":"2019-10-22",
     * "origin":"","prefix":"","projectLink":"","publishTime":1571760968000,"selfVisible":0,
     * "shareDate":1571708032000,"shareUser":"DylanCai","superChapterId":98,
     * "superChapterName":"网络访问","tags":[],"title":"Android 优雅地处理后台返回的骚数据","type":0,
     * "userId":27680,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":487,
     * "chapterName":"ViewModel","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9875,"link":"https://juejin.im/post/5dadd1c451882504006322d5",
     * "niceDate":"2019-10-23","niceShareDate":"2019-10-22","origin":"","prefix":"",
     * "projectLink":"","publishTime":1571760946000,"selfVisible":0,"shareDate":1571710385000,
     * "shareUser":"DaveBoy","superChapterId":423,"superChapterName":"Jetpack","tags":[],
     * "title":"【Medium 万赞好文】ViewModel 和 LiveData：模式 + 反模式","type":0,"userId":7809,"visible":1,
     * "zan":0},{"apkLink":"","audit":1,"author":"","chapterId":157,"chapterName":"获取设备唯一标识",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9881,
     * "link":"https://juejin.im/post/5dac31ce518825208707f636","niceDate":"2019-10-23",
     * "niceShareDate":"2019-10-22","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571760913000,"selfVisible":0,"shareDate":1571744872000,
     * "shareUser":"Loong_T","superChapterId":135,"superChapterName":"项目必备","tags":[],
     * "title":"一篇关于 Android 获取运营商的全面笔记","type":0,"userId":32541,"visible":1,"zan":0},
     * {"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方",
     * "collect":false,"courseId":13,"desc":"<p>上一道题目，关于 BadTokenException，很多同学指出 Toast
     * 可能会出现这个问题，我们需要修复一下。<\/p>\r\n<p>我们自己的代码，没问题，可以修复，假设这个 toast 在
     * SDK里面调用的，我们也没有源码，怎么处理呢？<\/p>\r\n<p>有什么思路吗？<\/p>","envelopePic":"","fresh":false,"id":9844,
     * "link":"https://www.wanandroid.com/wenda/show/9844","niceDate":"2019-10-23",
     * "niceShareDate":"2019-10-20","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571760643000,"selfVisible":0,"shareDate":1571586263000,"shareUser":"",
     * "superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答",
     * "url":"/article/list/0?cid=440"}],"title":"每日一问 SDK 的问题 怪我咯？","type":0,"userId":2,
     * "visible":1,"zan":8},{"apkLink":"","audit":1,"author":"互联网侦察","chapterId":421,
     * "chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":9939,"link":"https://mp.weixin.qq.com/s/TQ05xCcQjSp9-BFYoQWOqw",
     * "niceDate":"2019-10-23","niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571760000000,"selfVisible":0,"shareDate":1572008735000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/421/1"}],"title":"线程的来龙去脉，你了解吗？","type":0,"userId":-1,"visible":1,
     * "zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9924,
     * "link":"https://mp.weixin.qq.com/s/6zLLtY6ooMbujpF3bJFPPw","niceDate":"2019-10-22",
     * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571673600000,"selfVisible":0,"shareDate":1572007860000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/408/1"}],"title":"基于Jetpack的全系列加实战 app 教程","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,
     * "chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":9928,"link":"https://mp.weixin.qq.com/s/ymuLKtyr_8GCRVsBTylL1Q",
     * "niceDate":"2019-10-22","niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
     * "publishTime":1571673600000,"selfVisible":0,"shareDate":1572008040000,"shareUser":"",
     * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
     * "url":"/wxarticle/list/409/1"}],"title":"Android 现在还能执行后台任务吗？试试 WorkManager 吧","type":0,
     * "userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":369,"size":20,
     * "total":7371}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean implements Serializable{
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9929,
         * "link":"https://mp.weixin.qq.com/s/_4a-VSaM2TYRkKNAXblUVA","niceDate":"1天前",
         * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571932800000,"selfVisible":0,"shareDate":1572008055000,"shareUser":"",
         * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
         * "url":"/wxarticle/list/409/1"}],"title":"Kotlin的自定义View，实现带弧形的进度条","type":0,
         * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生",
         * "chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":9937,"link":"https://mp.weixin.qq
         * .com/s/L5lnZroOJ8_Y0HYIAwzw0w","niceDate":"1天前","niceShareDate":"18小时前","origin":"",
         * "prefix":"","projectLink":"","publishTime":1571932800000,"selfVisible":0,
         * "shareDate":1572008478000,"shareUser":"","superChapterId":408,
         * "superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],
         * "title":"看完这几张图，保你懂循环、递归、二分检索","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"xiaoyang","chapterId":360,"chapterName":"小编发布",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9911,
         * "link":"https://www.wanandroid.com/blog/show/2699","niceDate":"1天前",
         * "niceShareDate":"1天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571931614000,"selfVisible":0,"shareDate":1571931471000,"shareUser":"",
         * "superChapterId":298,"superChapterName":"原创文章","tags":[],
         * "title":"本站为wanandroid开源项目提供无限支持！","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"","chapterId":500,"chapterName":"正则",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9902,
         * "link":"https://juejin.im/post/5db082b9f265da4cf900c64c","niceDate":"1天前",
         * "niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571931190000,"selfVisible":0,"shareDate":1571875907000,
         * "shareUser":"张风捷特烈","superChapterId":245,"superChapterName":"Java深入","tags":[],
         * "title":"正则十八式-第一式：直捣黄龙","type":0,"userId":31634,"visible":1,"zan":0},{"apkLink":"",
         * "audit":1,"author":"","chapterId":296,"chapterName":"阅读","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9904,"link":"https://www
         * .jianshu.com/p/5680a3d20050","niceDate":"1天前","niceShareDate":"2天前","origin":"",
         * "prefix":"","projectLink":"","publishTime":1571931157000,"selfVisible":0,
         * "shareDate":1571877109000,"shareUser":"于慢慢家的吴蜀黍","superChapterId":181,
         * "superChapterName":"延伸技术","tags":[],"title":"中台到底是个什么鬼？","type":0,"userId":1260,
         * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":313,
         * "chapterName":"字节码","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":9909,"link":"https://juejin.im/post/5d049bc0e51d454d1d628510",
         * "niceDate":"1天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571931128000,"selfVisible":0,"shareDate":1571893915000,
         * "shareUser":"秉心说___","superChapterId":245,"superChapterName":"Java深入","tags":[],
         * "title":"全网最全 Dalvik 指令集解析 ！","type":0,"userId":22057,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9925,
         * "link":"https://mp.weixin.qq.com/s/Pg4pKhSScK8NgtT2RDw2uQ","niceDate":"2天前",
         * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571846400000,"selfVisible":0,"shareDate":1572007879000,"shareUser":"",
         * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
         * "url":"/wxarticle/list/408/1"}],"title":"终于找到一篇极佳的 NDK 入门文章","type":0,"userId":-1,
         * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,
         * "chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":9935,"link":"https://mp.weixin.qq.com/s/---xvG2521teyTyMvYl3IA",
         * "niceDate":"2天前","niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571846400000,"selfVisible":0,"shareDate":1572008446000,"shareUser":"",
         * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
         * "url":"/wxarticle/list/414/1"}],"title":"6. Jetpack---Paging你知道怎样上拉加载吗？","type":0,
         * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生",
         * "chapterId":434,"chapterName":"Gityuan","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":9936,"link":"https://mp.weixin.qq
         * .com/s/UZQU-PWM5JEb3dYtZKT6Cw","niceDate":"2天前","niceShareDate":"18小时前","origin":"",
         * "prefix":"","projectLink":"","publishTime":1571846400000,"selfVisible":0,
         * "shareDate":1572008465000,"shareUser":"","superChapterId":408,
         * "superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/434/1"}],
         * "title":"跨平台技术演进及 Flutter 未来","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"",
         * "audit":1,"author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9940,"link":"https://mp
         * .weixin.qq.com/s/G5Syqq1Ofxp4VFwEJOHSbg","niceDate":"2天前","niceShareDate":"18小时前",
         * "origin":"","prefix":"","projectLink":"","publishTime":1571846400000,"selfVisible":0,
         * "shareDate":1572008753000,"shareUser":"","superChapterId":408,
         * "superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],
         * "title":"阿里巴巴的技术专家，是如何画好架构图的？","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"","chapterId":423,"chapterName":"Architecture",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9897,
         * "link":"https://juejin.im/post/5dafc49b6fb9a04e17209922","niceDate":"2天前",
         * "niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571843657000,"selfVisible":0,"shareDate":1571818634000,
         * "shareUser":"KunMinX","superChapterId":423,"superChapterName":"Jetpack","tags":[],
         * "title":"是让人耳目一新的 Jetpack MVVM 精讲啊！","type":0,"userId":12482,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"","chapterId":198,"chapterName":"基础概念",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9899,
         * "link":"https://juejin.im/post/5dafc0416fb9a04ddf2c5101#comment","niceDate":"2天前",
         * "niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571843616000,"selfVisible":0,"shareDate":1571843197000,
         * "shareUser":"鸿洋","superChapterId":168,"superChapterName":"基础知识","tags":[],
         * "title":"Android 中不应该使用 Enum 吗？","type":0,"userId":2,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"","chapterId":76,"chapterName":"项目架构",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9900,
         * "link":"https://juejin.im/post/5daefe9a51882568691fba2d","niceDate":"2天前",
         * "niceShareDate":"2天前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571843602000,"selfVisible":0,"shareDate":1571843424000,
         * "shareUser":"鸿洋","superChapterId":75,"superChapterName":"热门专题","tags":[],"title":"安居客
         * Android App 走向平台化","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,
         * "author":"","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":9874,"link":"https://juejin
         * .im/post/5dadac2ae51d4524c3745219","niceDate":"2019-10-23",
         * "niceShareDate":"2019-10-22","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571760968000,"selfVisible":0,"shareDate":1571708032000,
         * "shareUser":"DylanCai","superChapterId":98,"superChapterName":"网络访问","tags":[],
         * "title":"Android 优雅地处理后台返回的骚数据","type":0,"userId":27680,"visible":1,"zan":0},
         * {"apkLink":"","audit":1,"author":"","chapterId":487,"chapterName":"ViewModel",
         * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9875,
         * "link":"https://juejin.im/post/5dadd1c451882504006322d5","niceDate":"2019-10-23",
         * "niceShareDate":"2019-10-22","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571760946000,"selfVisible":0,"shareDate":1571710385000,
         * "shareUser":"DaveBoy","superChapterId":423,"superChapterName":"Jetpack","tags":[],
         * "title":"【Medium 万赞好文】ViewModel 和 LiveData：模式 + 反模式","type":0,"userId":7809,
         * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":157,
         * "chapterName":"获取设备唯一标识","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":9881,"link":"https://juejin.im/post/5dac31ce518825208707f636",
         * "niceDate":"2019-10-23","niceShareDate":"2019-10-22","origin":"","prefix":"",
         * "projectLink":"","publishTime":1571760913000,"selfVisible":0,
         * "shareDate":1571744872000,"shareUser":"Loong_T","superChapterId":135,
         * "superChapterName":"项目必备","tags":[],"title":"一篇关于 Android 获取运营商的全面笔记","type":0,
         * "userId":32541,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang",
         * "chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上一道题目，关于
         * BadTokenException，很多同学指出 Toast 可能会出现这个问题，我们需要修复一下。<\/p>\r\n<p>我们自己的代码，没问题，可以修复，假设这个
         * toast 在 SDK里面调用的，我们也没有源码，怎么处理呢？<\/p>\r\n<p>有什么思路吗？<\/p>","envelopePic":"",
         * "fresh":false,"id":9844,"link":"https://www.wanandroid.com/wenda/show/9844",
         * "niceDate":"2019-10-23","niceShareDate":"2019-10-20","origin":"","prefix":"",
         * "projectLink":"","publishTime":1571760643000,"selfVisible":0,
         * "shareDate":1571586263000,"shareUser":"","superChapterId":440,"superChapterName":"问答",
         * "tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 SDK 的问题 怪我咯？",
         * "type":0,"userId":2,"visible":1,"zan":8},{"apkLink":"","audit":1,"author":"互联网侦察",
         * "chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":9939,"link":"https://mp.weixin.qq
         * .com/s/TQ05xCcQjSp9-BFYoQWOqw","niceDate":"2019-10-23","niceShareDate":"18小时前",
         * "origin":"","prefix":"","projectLink":"","publishTime":1571760000000,"selfVisible":0,
         * "shareDate":1572008735000,"shareUser":"","superChapterId":408,
         * "superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],
         * "title":"线程的来龙去脉，你了解吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"",
         * "audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9924,"link":"https://mp
         * .weixin.qq.com/s/6zLLtY6ooMbujpF3bJFPPw","niceDate":"2019-10-22",
         * "niceShareDate":"18小时前","origin":"","prefix":"","projectLink":"",
         * "publishTime":1571673600000,"selfVisible":0,"shareDate":1572007860000,"shareUser":"",
         * "superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号",
         * "url":"/wxarticle/list/408/1"}],"title":"基于Jetpack的全系列加实战 app 教程","type":0,
         * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖",
         * "chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":9928,"link":"https://mp.weixin.qq
         * .com/s/ymuLKtyr_8GCRVsBTylL1Q","niceDate":"2019-10-22","niceShareDate":"18小时前",
         * "origin":"","prefix":"","projectLink":"","publishTime":1571673600000,"selfVisible":0,
         * "shareDate":1572008040000,"shareUser":"","superChapterId":408,
         * "superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],
         * "title":"Android 现在还能执行后台任务吗？试试 WorkManager 吧","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 369
         * size : 20
         * total : 7371
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean implements Serializable {
            /**
             * apkLink :
             * audit : 1
             * author : 郭霖
             * chapterId : 409
             * chapterName : 郭霖
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : false
             * id : 9929
             * link : https://mp.weixin.qq.com/s/_4a-VSaM2TYRkKNAXblUVA
             * niceDate : 1天前
             * niceShareDate : 18小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1571932800000
             * selfVisible : 0
             * shareDate : 1572008055000
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
             * title : Kotlin的自定义View，实现带弧形的进度条
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean implements Serializable{
                /**
                 * name : 公众号
                 * url : /wxarticle/list/409/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
