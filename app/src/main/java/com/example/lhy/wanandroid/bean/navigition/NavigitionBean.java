package com.example.lhy.wanandroid.bean.navigition;

import java.util.List;

/**
 * Created by usercwq on 2019/10/27.
 */

public class NavigitionBean {

    /**
     * data : [{"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1848,"link":"https://developers.google.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515322795000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Google开发者","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1849,"link":"http://www.github.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515322817000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Github","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1850,"link":"https://stackoverflow.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515322829000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"stackoverflow","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1851,"link":"https://juejin.im/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323408000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"掘金","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1852,"link":"https://www.csdn.net/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323423000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"CSDN","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1853,"link":"https://www.jianshu.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323438000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"简书","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1854,"link":"http://www.androidweekly.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323568000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"开发技术周报","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1855,"link":"https://toutiao.io/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323607000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"开发者头条","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1856,"link":"https://segmentfault.com/t/android",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323635000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"segmentfault","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1857,"link":"http://www.androiddevtools.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323651000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"androiddevtools","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1858,"link":"https://developers.googleblog.cn/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323695000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Google中文Blog","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"gank.io",
     * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":1859,"link":"http://gank.io/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515323720000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"干货集中营","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1862,"link":"http://a.codekk.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324437000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"CodeKK","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1863,"link":"https://xiaozhuanlan.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324456000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"小专栏","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1864,"link":"http://www.wanandroid.com/article/list/0?cid=176",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324541000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"国内大牛","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1865,"link":"https://github.com/android-cn/android-dev-com",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324559000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"国外大牛","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1866,"link":"https://www.androidos.net.cn/sourcecode",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324594000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Android源码","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1867,"link":"http://design.1sters.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515324880000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Material Design 中文版","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1868,"link":"https://leetcode.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325010000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"leetcode","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2405,"link":"https://dl.google.com/dl/android/maven2/index.html",
     * "niceDate":"2018-02-25","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1519537704000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"google mvn仓库","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2406,"link":"http://jcenter.bintray.com/","niceDate":"2018-02-25",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1519537722000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"jcenter仓库","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,
     * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":3469,"link":"https://mvnrepository.com/artifact/com.google.code
     * .gson/gson","niceDate":"2018-10-10","niceShareDate":"未知时间","origin":"","prefix":"",
     * "projectLink":"","publishTime":1539139799000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"maven仓库",
     * "type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编",
     * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":8104,"link":"https://maven.aliyun.com/mvn/search",
     * "niceDate":"2019-03-20","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1553095634000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"maven仓库 阿里云托管","type":0,
     * "userId":-1,"visible":1,"zan":0}],"cid":272,"name":"常用网站"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":281,"chapterName":"公司博客","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1894,"link":"https://tech
     * .meituan.com/","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
     * "projectLink":"","publishTime":1515326436000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"美团点评","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":281,
     * "chapterName":"公司博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1895,"link":"https://joyrun.github.io/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326464000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"悦跑圈技术团队","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":281,
     * "chapterName":"公司博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2438,"link":"https://kaolamobile.github.io/","niceDate":"2018-03-03",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1520088338000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"网易考拉移动端团队","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":281,
     * "chapterName":"公司博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2681,"link":"https://tech.youzan.com/","niceDate":"2018-03-19",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1521469203000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"有赞技术团队","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":281,
     * "chapterName":"公司博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8387,"link":"https://zhuanlan.zhihu.com/p/56086941",
     * "niceDate":"2019-05-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1557633412000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"网易云音乐开发组","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":281,
     * "chapterName":"公司博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8388,"link":"https://zhuanlan.zhihu.com/hackers",
     * "niceDate":"2019-05-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1557642620000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"知乎技术专栏","type":0,"userId":-1,
     * "visible":1,"zan":0}],"cid":281,"name":"公司博客"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":280,"chapterName":"开发社区","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":1869,"link":"https://juejin
     * .im/timeline/android","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1515325108000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"掘金","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1870,"link":"http://www.oschina.net/android/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325156000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"开源中国","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1872,"link":"http://www.apkbus.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325199000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"ApkBus","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1873,"link":"http://www.chinagdg.com/forum-36-1.html",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325224000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"中国谷歌开发者社区","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1874,"link":"https://www.csdn.net/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325249000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"CSDN","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1875,"link":"https://www.v2ex.com/go/android","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325276000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"v2ex","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":280,
     * "chapterName":"开发社区","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1876,"link":"http://bbs.51cto.com/forum-291-1.html",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325295000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"51cto Android论坛","type":0,
     * "userId":-1,"visible":0,"zan":0}],"cid":280,"name":"开发社区"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":274,"chapterName":"个人博客","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1877,"link":"http://blog.csdn
     * .net/luoshengyang/","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1515325685000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"罗升阳","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1878,"link":"http://www.cnblogs.com/innost/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325704000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"邓凡平","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1879,"link":"http://blog.csdn.net/guolin_blog","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325724000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"郭霖","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1880,"link":"http://blog.csdn.net/lmj623565791\n",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325735000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"鸿洋","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1881,"link":"http://blog.csdn.net/aigestudio","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325752000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"AigeStudio","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1882,"link":"http://blog.csdn.net/qibin0506","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325775000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"亓斌","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1883,"link":"http://blog.csdn.net/eclipsexys","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325826000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"徐医生","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1884,"link":"http://www.ruanyifeng.com/blog/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325838000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"阮一峰","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1885,"link":"http://blog.csdn.net/bboyfeiyu","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325853000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"MrSimp1e","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1886,"link":"http://blog.csdn.net/ns_code","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325875000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"兰亭风雨","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1887,"link":"http://hukai.me/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325883000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"胡凯","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1888,"link":"http://droidyue.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515325916000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"技术小黑屋","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1889,"link":"http://blog.csdn.net/singwhatiwanna",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326219000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"任玉刚","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1890,"link":"https://kymjs.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326233000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"张涛","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1891,"link":"http://weishu.me/archives/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326283000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Weishu","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1892,"link":"http://gityuan.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326303000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"gityuan","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1893,"link":"http://www.gcssloop.com/timeline","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326325000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"GcsSloop","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2038,"link":"http://www.wjdiankong.cn/","niceDate":"2018-01-11",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515642561000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"尼古拉斯.赵四","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2039,"link":"http://hencoder.com/","niceDate":"2018-01-11",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515667963000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"hencoder","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2197,"link":"http://www.jowanxu.top/archives/","niceDate":"2018-01-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516275071000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"叫我旺仔","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2243,"link":"http://blog.csdn.net/qq_17250009/",
     * "niceDate":"2018-01-30","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1517279352000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"一口仨馍","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2244,"link":"https://guolei1130.github.io/","niceDate":"2018-01-30",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1517280401000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"_StriveG 博客","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2321,"link":"https://www.jianshu.com/u/383970bef0a0",
     * "niceDate":"2018-02-06","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1517884084000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Carson_Ho","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2407,"link":"http://yifeng.studio/archives/","niceDate":"2018-02-25",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1519548179000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"亦枫","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2956,"link":"http://prototypez.github.io/","niceDate":"2018-05-29",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527559418000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"prototypez","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2963,"link":"http://www.androidperformance.com/",
     * "niceDate":"2018-05-30","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527657176000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Gracker_Gao的个人博客","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":3130,"link":"http://toughcoder.net/","niceDate":"2018-07-11",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1531277695000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"稀有猿诉","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":3310,"link":"http://wl9739.github.io/archives/",
     * "niceDate":"2018-08-23","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1535031480000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Eateeer的笔记屋","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":3418,"link":"http://www.androidblog.cn/","niceDate":"2018-09-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1537272011000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Android Blog 周刊 ","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8126,"link":"https://yrom.net/archives/","niceDate":"2019-03-25",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1553496389000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"yrom","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8127,"link":"http://kaedea.com/","niceDate":"2019-03-25",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1553496405000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"kaedea","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8128,"link":"http://yifeiyuan.me/","niceDate":"2019-03-25",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1553496441000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"程序亦非猿","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8176,"link":"https://pqpo.me/","niceDate":"2019-03-31",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1554021197000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"pqpo","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8308,"link":"https://yutiantina.github.io/archives/",
     * "niceDate":"2019-04-27","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1556352099000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"天晴日无风","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8489,"link":"https://blog.imallen.wang/","niceDate":"2019-05-24",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1558686683000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"AllenWang的个人博客","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":274,
     * "chapterName":"个人博客","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":8499,"link":"http://wossoneri.github.io/archives/",
     * "niceDate":"2019-05-28","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1559020194000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Wossoneri`s Blog","type":0,
     * "userId":-1,"visible":1,"zan":0}],"cid":274,"name":"个人博客"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":275,"chapterName":"常用工具","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1896,"link":"http://www
     * .wanandroid.com/tools/bejson","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1515326568000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"JSON格式化",
     * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
     * "chapterId":275,"chapterName":"常用工具","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":1897,"link":"http://www.wanandroid.com/tools/digit",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326592000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"md5&sha","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1898,"link":"http://www.wanandroid.com/tools/base64",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326602000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"base64","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1899,"link":"http://www.wanandroid.com/tools/qrcode",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326611000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"二维码","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1900,"link":"http://www.wanandroid.com/tools/color",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326620000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"取色器","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1901,"link":"http://www.wanandroid.com/tools/decimal",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326630000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"进制转化","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1902,"link":"http://www.iconfont.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326643000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"iconfont","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1903,"link":"https://tinypng.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326665000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"tinypng","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1904,"link":"https://translate.google.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326686000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"在线翻译","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2979,"link":"https://www.pdfpai.com/","niceDate":"2018-06-03",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527991551000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"pdf派文档互转","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2980,"link":"https://ezgif.com/","niceDate":"2018-06-03",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527991569000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"视频转gif,gif优化等","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":275,
     * "chapterName":"常用工具","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2981,"link":"http://www.aigei.com/bgremover/","niceDate":"2018-06-03",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527991584000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"图片背景透明","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":275,"name":"常用工具"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":276,"chapterName":"在线学习","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":1905,"link":"http://www.imooc
     * .com/course/list?c=android\n","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1515326864000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"慕课网","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1906,"link":"http://study.163.com/category/android",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326894000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"网易云课程","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1907,"link":"http://www.jikexueyuan.com/course/android/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326911000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"极客学院","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1908,"link":"https://ke.qq.com/course/list?mt=1001&st=2003&tt=3021",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326930000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯课堂","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1909,"link":"http://www.maiziedu.com/course/android/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326958000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"麦子学院","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1910,"link":"http://mooc
     * .study.163.com/smartSpec/detail/1001319001.htm","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515326974000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"人工智能","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1911,"link":"https://www.nowcoder.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515327060000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"牛客网","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1912,"link":"http://luo.apkbus.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515327262000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"老罗视频教程","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1913,"link":"http://mars.apkbus.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515327273000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"mars视频","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":276,
     * "chapterName":"在线学习","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2087,"link":"http://gitbook.cn/gitchat/free","niceDate":"2018-01-16",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516074811000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"gitchat免费区","type":0,
     * "userId":-1,"visible":0,"zan":0}],"cid":276,"name":"在线学习"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":393,"chapterName":"查看源码","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3141,
     * "link":"http://androidxref.com/","niceDate":"2018-07-15","niceShareDate":"未知时间",
     * "origin":"","prefix":"","projectLink":"","publishTime":1531646433000,"selfVisible":0,
     * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
     * "title":"androidxref","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,
     * "author":"小编","chapterId":393,"chapterName":"查看源码","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":3142,"link":"https://www.androidos.net
     * .cn/sourcecode","niceDate":"2018-07-15","niceShareDate":"未知时间","origin":"","prefix":"",
     * "projectLink":"","publishTime":1531646458000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"androidos 源码站",
     * "type":0,"userId":-1,"visible":1,"zan":0}],"cid":393,"name":"查看源码"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":277,"chapterName":"开放平台",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8983,
     * "link":"https://www.upyun.com/","niceDate":"2012-08-17","niceShareDate":"未知时间",
     * "origin":"","prefix":"","projectLink":"","publishTime":1345187245000,"selfVisible":0,
     * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
     * "title":"又拍云","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,
     * "author":"小编","chapterId":277,"chapterName":"开放平台","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":1916,"link":"https://www.bmob.cn/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328010000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"bmob后端云","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1917,"link":"https://fir.im/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328049000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"fir.im","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1918,"link":"http://www.rongcloud.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328061000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"融云","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1919,"link":"http://www.easemob.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328070000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"环信","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1920,"link":"http://www.xfyun.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328087000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"讯飞开放平台","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1921,"link":"https://www.faceplusplus.com.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328102000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Face++","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1922,"link":"https://www.qiniu.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328116000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"七牛云","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1923,"link":"https://www.pgyer.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328132000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"蒲公英","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1924,"link":"https://bugly.qq.com/v2/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328152000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"bugly","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1925,"link":"http://developer.baidu.com/platform/s7",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328204000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"百度云推送","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1926,"link":"https://www.juhe.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328216000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"聚合数据","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1927,"link":"https://dev.mi.com/doc/?page_id=1670",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328238000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"小米推送","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1928,"link":"https://www.jiguang.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328255000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"极光推送","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1929,"link":"https://tutucloud.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328289000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"涂图","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1940,"link":"http://xg.qq.com/xg","niceDate":"2018-01-08",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515377195000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯信鸽","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":277,
     * "chapterName":"开放平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1914,"link":"http://www.umeng.com/","niceDate":"2018-01-15",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516019143000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"UMeng","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":277,"name":"开放平台"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":278,"chapterName":"互联网资讯","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":1930,"link":"https://readhub.me/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328355000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"ReadHub","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":278,
     * "chapterName":"互联网资讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1931,"link":"http://wwv.cyzone.cn/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328388000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"创业邦","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":278,
     * "chapterName":"互联网资讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1932,"link":"http://36kr.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328420000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"36kr","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":278,
     * "chapterName":"互联网资讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1933,"link":"http://www.pingwest.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328455000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"品玩","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":278,
     * "chapterName":"互联网资讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1934,"link":"https://sspai.com/tag/android","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328469000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"少数派","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":278,
     * "chapterName":"互联网资讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1942,"link":"http://www.pmtown.com/","niceDate":"2018-01-08",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515377239000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"泡面小镇","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":278,"name":"互联网资讯"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":279,"chapterName":"求职招聘","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":1935,"link":"https://www.zhaopin.com/",
     * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328518000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"智联","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":279,
     * "chapterName":"求职招聘","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1936,"link":"https://www.lagou.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328542000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"拉钩","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":279,
     * "chapterName":"求职招聘","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1937,"link":"https://cn.100offer.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328560000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"100offer","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":279,
     * "chapterName":"求职招聘","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1938,"link":"http://www.neitui.me/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328570000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"内推网","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":279,
     * "chapterName":"求职招聘","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":1939,"link":"http://www.zhipin.com/","niceDate":"2018-01-07",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515328602000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Boss直聘","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":279,"name":"求职招聘"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":282,"chapterName":"应用加固","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2042,"link":"http://jiagu.360.cn/",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749693000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"360加固","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":282,
     * "chapterName":"应用加固","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2043,"link":"http://dun.163.com/product/android-reinforce",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749716000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"网易云易盾","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":282,
     * "chapterName":"应用加固","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2044,"link":"http://www.ijiami.cn/","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749738000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"爱加密","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":282,"name":"应用加固"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":283,"chapterName":"三方支付","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2045,"link":"https://pay.weixin.qq
     * .com/wiki/doc/api/index.html","niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1515749782000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"微信","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":283,
     * "chapterName":"三方支付","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2046,"link":"https://open.alipay
     * .com/developmentAccess/developmentAccess.htm","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749794000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"支付宝","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":283,"name":"三方支付"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":284,"chapterName":"推送平台","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2048,"link":"https://dev.mi
     * .com/console/appservice/push.html","niceDate":"2018-01-12","niceShareDate":"未知时间",
     * "origin":"","prefix":"","projectLink":"","publishTime":1515749861000,"selfVisible":0,
     * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
     * "title":"小米推送","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,
     * "author":"小编","chapterId":284,"chapterName":"推送平台","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2049,"link":"https://www.jiguang.cn/push",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749879000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"极光推送","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":284,
     * "chapterName":"推送平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2050,"link":"http://developer.huawei.com/push","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749902000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"华为推送","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":284,
     * "chapterName":"推送平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2051,"link":"http://push.baidu.com/","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515749929000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"百度云推送","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":284,"name":"推送平台"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":285,"chapterName":"三方分享","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2052,"link":"http://sharesdk.mob.com/",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750020000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Share SDK","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":285,
     * "chapterName":"三方分享","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2053,"link":"http://mobile.umeng.com/social","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750055000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"友盟分享","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":285,"name":"三方分享"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":286,"chapterName":"地图平台","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2054,"link":"http://lbs.amap.com/",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750091000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"高德地图","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":286,
     * "chapterName":"地图平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2055,"link":"http://lbsyun.baidu.com/","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750104000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"百度地图","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":286,
     * "chapterName":"地图平台","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2056,"link":"http://lbs.qq.com/guides/maps.html",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750147000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯地图","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":286,"name":"地图平台"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":287,"chapterName":"直播SDK","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":3011,"link":"https://www.upyun
     * .com/products/live","niceDate":"2018-01-01","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1514787828000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"又拍云 UPLive",
     * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
     * "chapterId":287,"chapterName":"直播SDK","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":2057,"link":"https://www.qiniu.com/products/pili",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750406000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"七牛直播云","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":287,
     * "chapterName":"直播SDK","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2058,"link":"https://cloud.tencent.com/product/LVB",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750463000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯直播LVB","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":287,
     * "chapterName":"直播SDK","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2059,"link":"https://cloud.baidu.com/product/lss.html",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750500000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"百度音视频LSS","type":0,
     * "userId":-1,"visible":0,"zan":0}],"cid":287,"name":"直播SDK"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":288,"chapterName":"IM即时通讯","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2060,"link":"http://www
     * .easemob.com/","niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"",
     * "projectLink":"","publishTime":1515750559000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"环信","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":288,
     * "chapterName":"IM即时通讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2061,"link":"http://baichuan.taobao.com/product/im.htm",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750591000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"百川云旺","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":288,
     * "chapterName":"IM即时通讯","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2062,"link":"http://www.rongcloud.cn/","niceDate":"2018-01-12",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750612000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"融云","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":288,"name":"IM即时通讯"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":289,"chapterName":"Bug管理","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2063,"link":"https://bugly.qq.com/v2/",
     * "niceDate":"2018-01-12","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515750992000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯Bugly","type":0,"userId":-1,
     * "visible":1,"zan":0}],"cid":289,"name":"Bug管理"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":290,"chapterName":"后端云","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":2065,"link":"https://www.bmob.cn/",
     * "niceDate":"2018-01-13","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515830036000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"bmob后端云","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":290,
     * "chapterName":"后端云","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2066,"link":"https://leancloud.cn/","niceDate":"2018-01-13",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515830052000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"LeanCloud","type":0,
     * "userId":-1,"visible":1,"zan":0}],"cid":290,"name":"后端云"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":291,"chapterName":"WebView内核","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2068,
     * "link":"https://x5.tencent.com/tbs/index.html","niceDate":"2018-01-14",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1515912023000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯x5","type":0,"userId":-1,
     * "visible":1,"zan":0}],"cid":291,"name":"WebView内核"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":299,"chapterName":"创意&素材","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2190,"link":"http://baozoumanhua.com/",
     * "niceDate":"2018-01-18","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516252192000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"暴走漫画制作器","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":299,
     * "chapterName":"创意&素材","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2191,"link":"https://www.chuangkit.com/startdesign",
     * "niceDate":"2018-01-18","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516252240000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"素材设计","type":0,"userId":-1,
     * "visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":299,
     * "chapterName":"创意&素材","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2192,"link":"https://unsplash.com/","niceDate":"2018-01-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516252267000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"无版权素材站","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":299,
     * "chapterName":"创意&素材","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2202,"link":"http://www.iconfont.cn/","niceDate":"2018-01-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516289466000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"iconfont","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":299,
     * "chapterName":"创意&素材","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2203,"link":"https://iconstore.co/","niceDate":"2018-01-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516289486000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"iconstore","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":299,
     * "chapterName":"创意&素材","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2204,"link":"https://www.uplabs.com/android","niceDate":"2018-01-18",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516289539000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"Material Design设计模板与素材",
     * "type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编",
     * "chapterId":299,"chapterName":"创意&素材","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":2205,"link":"https://github
     * .com/gztchan/awesome-design/","niceDate":"2018-01-18","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1516289555000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
     * "title":"awesome-design","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":299,"chapterName":"创意&素材","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2450,"link":"https://www
     * .lottiefiles.com/","niceDate":"2018-03-05","niceShareDate":"未知时间","origin":"","prefix":"",
     * "projectLink":"","publishTime":1520262753000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"lottie素材库",
     * "type":0,"userId":-1,"visible":1,"zan":0}],"cid":299,"name":"创意&素材"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":300,"chapterName":"互联网统计",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2193,
     * "link":"http://cn.data.cmcm.com/rank","niceDate":"2018-01-18","niceShareDate":"未知时间",
     * "origin":"","prefix":"","projectLink":"","publishTime":1516266420000,"selfVisible":0,
     * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
     * "title":"猎豹大数据","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,
     * "author":"小编","chapterId":300,"chapterName":"互联网统计","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":2194,"link":"https://mtj.baidu
     * .com/data/mobile/device","niceDate":"2018-01-18","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1516266460000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"百度移动统计",
     * "type":0,"userId":-1,"visible":1,"zan":0}],"cid":300,"name":"互联网统计"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":301,"chapterName":"快速开发",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2206,
     * "link":"http://qmuiteam.com/android/page/index.html","niceDate":"2018-01-19",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516328190000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"QMUI Android","type":0,
     * "userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":301,
     * "chapterName":"快速开发","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2217,"link":"https://github.com/jpush/aurora-imui",
     * "niceDate":"2018-01-23","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1516687965000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"通用IM UI组件","type":0,
     * "userId":-1,"visible":1,"zan":0}],"cid":301,"name":"快速开发"},{"articles":[{"apkLink":"",
     * "audit":1,"author":"小编","chapterId":359,"chapterName":"应用发布","collect":false,
     * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2873,
     * "link":"http://dev.360.cn/","niceDate":"2018-04-25","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1524666305000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"360开发者",
     * "type":0,"userId":-1,"visible":0,"zan":0}],"cid":359,"name":"应用发布"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":365,"chapterName":"反馈平台",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2976,
     * "link":"https://tucao.qq.com","niceDate":"2018-06-03","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1527991466000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"一站式解决用户反馈问题",
     * "type":0,"userId":-1,"visible":1,"zan":0}],"cid":365,"name":"反馈平台"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":366,"chapterName":"在线文档",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2977,
     * "link":"https://docs.qq.com","niceDate":"2018-06-03","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1527991506000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"腾讯文档","type":0,
     * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":366,
     * "chapterName":"在线文档","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":2978,"link":"https://yuque.com","niceDate":"2018-06-03",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1527991521000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":"阿里文档语雀","type":0,"userId":-1,
     * "visible":0,"zan":0}],"cid":366,"name":"在线文档"},{"articles":[{"apkLink":"","audit":1,
     * "author":"小编","chapterId":369,"chapterName":"短视频SDK","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":3012,"link":"https://www.upyun
     * .com/products/short-video","niceDate":"2018-06-15","niceShareDate":"未知时间","origin":"",
     * "prefix":"","projectLink":"","publishTime":1529043871000,"selfVisible":0,"shareDate":null,
     * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"又拍云短视频",
     * "type":0,"userId":-1,"visible":0,"zan":0}],"cid":369,"name":"短视频SDK"},
     * {"articles":[{"apkLink":"","audit":1,"author":"小编","chapterId":430,
     * "chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"",
     * "fresh":false,"id":7921,"link":"http://flutter.link/","niceDate":"2019-01-31",
     * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
     * "publishTime":1548931492000,"selfVisible":0,"shareDate":null,"shareUser":"",
     * "superChapterId":0,"superChapterName":"","tags":[],"title":" Flutter开发者","type":0,
     * "userId":-1,"visible":1,"zan":0}],"cid":430,"name":"Flutter"}]
     * errorCode : 0
     * errorMsg :
     */

    private int errorCode;
    private String errorMsg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * articles : [{"apkLink":"","audit":1,"author":"小编","chapterId":272,
         * "chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":1848,"link":"https://developers.google.cn/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515322795000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"Google开发者",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1849,"link":"http://www.github.com/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515322817000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"Github",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1850,"link":"https://stackoverflow.com/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515322829000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"stackoverflow","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"",
         * "audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1851,
         * "link":"https://juejin.im/","niceDate":"2018-01-07","niceShareDate":"未知时间",
         * "origin":"","prefix":"","projectLink":"","publishTime":1515323408000,"selfVisible":0,
         * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"掘金","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,
         * "author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":1852,"link":"https://www.csdn.net/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323423000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"CSDN",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1853,"link":"https://www.jianshu.com/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323438000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"简书",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1854,"link":"http://www.androidweekly.cn/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323568000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"开发技术周报",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1855,"link":"https://toutiao.io/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323607000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"开发者头条",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1856,"link":"https://segmentfault.com/t/android",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323635000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"segmentfault","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"",
         * "audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1857,"link":"http://www
         * .androiddevtools.cn/","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
         * "prefix":"","projectLink":"","publishTime":1515323651000,"selfVisible":0,
         * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"androiddevtools","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"",
         * "audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1858,
         * "link":"https://developers.googleblog.cn/","niceDate":"2018-01-07",
         * "niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"",
         * "publishTime":1515323695000,"selfVisible":0,"shareDate":null,"shareUser":"",
         * "superChapterId":0,"superChapterName":"","tags":[],"title":"Google中文Blog","type":0,
         * "userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"gank.io",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1859,"link":"http://gank.io/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515323720000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"干货集中营",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1862,"link":"http://a.codekk.com/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515324437000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"CodeKK",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1863,"link":"https://xiaozhuanlan.com/",
         * "niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"",
         * "projectLink":"","publishTime":1515324456000,"selfVisible":0,"shareDate":null,
         * "shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"小专栏",
         * "type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编",
         * "chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":1864,"link":"http://www.wanandroid
         * .com/article/list/0?cid=176","niceDate":"2018-01-07","niceShareDate":"未知时间",
         * "origin":"","prefix":"","projectLink":"","publishTime":1515324541000,"selfVisible":0,
         * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"国内大牛","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,
         * "author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":1865,"link":"https://github
         * .com/android-cn/android-dev-com","niceDate":"2018-01-07","niceShareDate":"未知时间",
         * "origin":"","prefix":"","projectLink":"","publishTime":1515324559000,"selfVisible":0,
         * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],
         * "title":"国外大牛","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,
         * "author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":1866,"link":"https://www.androidos.net
         * .cn/sourcecode","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"",
         * "prefix":"","projectLink":"","publishTime":1515324594000,"selfVisible":0,
         * "shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"Android源码","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1867,"link":"http://design.1sters.com/","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1515324880000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"Material Design 中文版","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":1868,"link":"https://leetcode.com/","niceDate":"2018-01-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1515325010000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"leetcode","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2405,"link":"https://dl.google.com/dl/android/maven2/index.html","niceDate":"2018-02-25","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1519537704000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"google mvn仓库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":2406,"link":"http://jcenter.bintray.com/","niceDate":"2018-02-25","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1519537722000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"jcenter仓库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3469,"link":"https://mvnrepository.com/artifact/com.google.code.gson/gson","niceDate":"2018-10-10","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1539139799000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"maven仓库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8104,"link":"https://maven.aliyun.com/mvn/search","niceDate":"2019-03-20","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1553095634000,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"maven仓库 阿里云托管","type":0,"userId":-1,"visible":1,"zan":0}]
         * cid : 272
         * name : 常用网站
         */

        private int cid;
        private String name;
        private List<ArticlesBean> articles;

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ArticlesBean> getArticles() {
            return articles;
        }

        public void setArticles(List<ArticlesBean> articles) {
            this.articles = articles;
        }

        public static class ArticlesBean {
            /**
             * apkLink :
             * audit : 1
             * author : 小编
             * chapterId : 272
             * chapterName : 常用网站
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : false
             * id : 1848
             * link : https://developers.google.cn/
             * niceDate : 2018-01-07
             * niceShareDate : 未知时间
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1515322795000
             * selfVisible : 0
             * shareDate : null
             * shareUser :
             * superChapterId : 0
             * superChapterName :
             * tags : []
             * title : Google开发者
             * type : 0
             * userId : -1
             * visible : 0
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
            private Object shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

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

            public Object getShareDate() {
                return shareDate;
            }

            public void setShareDate(Object shareDate) {
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

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }

    @Override
    public String toString() {
        return "NavigitionBean{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
