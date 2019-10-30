package com.example.lhy.wanandroid.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by usercwq on 2019/10/23.
 */

public class MathBean {

    /**
     * code : 200
     * data : {"2019-10-23":[{"awayGround":"巴伦西亚","awayHistory":"10|4|3|3",
     * "awayIcon":"https://cdn.scaiwl.top/teamicon/t1/巴伦西亚_00595.png","change":"9082",
     * "data":"131774","homeCourt":"里尔","homeHistory":"10|3|3|4","homeIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/里尔_00918.png","homeVsAway":"2|0|0|2","is":"1","isCollect":false,
     * "isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3","matchRe":"",
     * "matchSn":"周三017","matchStatus":"0","matchTime":"2019-10-24 03:00:00","model":"120",
     * "odds":"{\"0\":2.40,\"1\":3.15,\"3\":2.56}","period":"2019-10-23","prob":"71",
     * "rowKey":"11138020214693002","update":"0"},{"awayGround":"里昂","awayHistory":"10|2|4|4",
     * "awayIcon":"https://cdn.scaiwl.top/teamicon/t1/里昂_00927.png","change":"6145",
     * "data":"178044","homeCourt":"本菲卡","homeHistory":"10|6|1|3","homeIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/本菲卡_01246.png","homeVsAway":"0|0|0|0","is":"1","isCollect":false,
     * "isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3,0","matchRe":"",
     * "matchSn":"周三016","matchStatus":"0","matchTime":"2019-10-24 03:00:00","model":"165",
     * "odds":"{\"0\":3.10,\"1\":3.45,\"3\":1.96}","period":"2019-10-23","prob":"92",
     * "rowKey":"11138020214683002","update":"0"},{"awayGround":"巴塞罗那","awayHistory":"10|6|2|2",
     * "awayIcon":"https://cdn.scaiwl.top/teamicon/t1/巴塞罗那_00588.png","change":"7877",
     * "data":"161123","homeCourt":"布拉格斯拉维亚","homeHistory":"10|7|2|1","homeIcon":"https://cdn
     * .scaiwl.top/teamicon/t1/布拉格斯拉维亚_02003.png","homeVsAway":"0|0|0|0","is":"1",
     * "isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"1,0",
     * "matchRe":"","matchSn":"周三015","matchStatus":"0","matchTime":"2019-10-24 03:00:00",
     * "model":"169","odds":"{\"0\":1.28,\"1\":4.80,\"3\":7.40}","period":"2019-10-23",
     * "prob":"93","rowKey":"11138020214673002","update":"0"},{"awayGround":"多特蒙德",
     * "awayHistory":"10|5|4|1","awayIcon":"https://cdn.scaiwl.top/teamicon/t1/多特蒙德_00753.png",
     * "change":"8337","data":"151437","homeCourt":"国际米兰","homeHistory":"10|7|1|2",
     * "homeIcon":"https://cdn.scaiwl.top/teamicon/t1/国际米兰_00429.png","homeVsAway":"0|0|0|0",
     * "is":"1","isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠",
     * "matchProb":"3","matchRe":"","matchSn":"周三014","matchStatus":"0","matchTime":"2019-10-24
     * 03:00:00","model":"150","odds":"{\"0\":2.91,\"1\":3.30,\"3\":2.03}","period":"2019-10-23",
     * "prob":"79","rowKey":"11138020214673001","update":"0"},{"awayGround":"利物浦",
     * "awayHistory":"10|9|0|1","awayIcon":"https://cdn.scaiwl.top/teamicon/t1/利物浦_00022.png",
     * "change":"7667","data":"179473","homeCourt":"亨克","homeHistory":"10|5|2|3",
     * "homeIcon":"https://cdn.scaiwl.top/teamicon/t1/亨克_01867.png","homeVsAway":"0|0|0|0",
     * "is":"1","isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"1,
     * 0","matchRe":"","matchSn":"周三013","matchStatus":"0","matchTime":"2019-10-24 03:00:00",
     * "model":"151","odds":"{\"0\":1.19,\"1\":5.65,\"3\":9.30}","period":"2019-10-23",
     * "prob":"90","rowKey":"11138020214663002","update":"0"},{"awayGround":"那不勒斯",
     * "awayHistory":"10|5|2|3","awayIcon":"https://cdn.scaiwl.top/teamicon/t1/那不勒斯_00452.png",
     * "change":"6795","data":"162658","homeCourt":"萨尔茨堡","homeHistory":"10|7|2|1",
     * "homeIcon":"https://cdn.scaiwl.top/teamicon/t1/萨尔茨堡_02898.png","homeVsAway":"0|0|0|0",
     * "is":"1","isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3,
     * 0","matchRe":"","matchSn":"周三012","matchStatus":"0","matchTime":"2019-10-24 03:00:00",
     * "model":"154","odds":"{\"0\":2.25,\"1\":3.65,\"3\":2.48}","period":"2019-10-23",
     * "prob":"90","rowKey":"11138020214663001","update":"0"},{"awayGround":"切尔西",
     * "awayHistory":"10|6|2|2","awayIcon":"https://cdn.scaiwl.top/teamicon/t1/切尔西_00002.png",
     * "change":"7211","data":"147310","homeCourt":"阿贾克斯","homeHistory":"10|8|2|0",
     * "homeIcon":"https://cdn.scaiwl.top/teamicon/t1/阿贾克斯_01558.png","homeVsAway":"0|0|0|0",
     * "is":"1","isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3,
     * 0","matchRe":"","matchSn":"周三006","matchStatus":"0","matchTime":"2019-10-24 00:55:00",
     * "model":"144","odds":"{\"0\":2.80,\"1\":3.45,\"3\":2.10}","period":"2019-10-23",
     * "prob":"94","rowKey":"11138020214693001","update":"0"},{"awayGround":"圣彼得堡泽尼特",
     * "awayHistory":"10|7|2|1","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/圣彼得堡泽尼特_01634.png","change":"9340","data":"176485","homeCourt":"莱比锡红牛",
     * "homeHistory":"10|5|3|2","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/莱比锡红牛_00765.png",
     * "homeVsAway":"2|1|1|0","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"3,1","matchRe":"","matchSn":"周三005","matchStatus":"0",
     * "matchTime":"2019-10-24 00:55:00","model":"126","odds":"{\"0\":4.75,\"1\":3.90,
     * \"3\":1.52}","period":"2019-10-23","prob":"91","rowKey":"11138020214683001",
     * "update":"0"}],"2019-10-22":[{"awayGround":"莫斯科火车头","awayHistory":"10|7|2|1",
     * "awayIcon":"https://cdn.scaiwl.top/teamicon/t1/莫斯科火车头_01647.png","change":"7624",
     * "data":"132261","homeCourt":"尤文图斯","homeHistory":"10|2|4|4","homeIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/尤文图斯_00437.png","homeVsAway":"0|0|0|0","is":"1","isCollect":false,
     * "isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3,1","matchRe":"3",
     * "matchSn":"周二015","matchStatus":"2","matchTime":"2019-10-23 03:00:00","model":"180",
     * "odds":"{\"0\":14.50,\"1\":6.15,\"3\":1.12}","period":"2019-10-22","prob":"91",
     * "rowKey":"11138020214653002","update":"0"},{"awayGround":"亚特兰大","awayHistory":"10|6|1|3",
     * "awayIcon":"https://cdn.scaiwl.top/teamicon/t1/亚特兰大_00427.png","change":"8050",
     * "data":"143378","homeCourt":"曼彻斯特城","homeHistory":"10|9|0|1","homeIcon":"https://cdn
     * .scaiwl.top/teamicon/t1/曼彻斯特城_00005.png","homeVsAway":"0|0|0|0","is":"1",
     * "isCollect":false,"isShow":"","leagueId":"1138","leagueName":"欧冠","matchProb":"3",
     * "matchRe":"3","matchSn":"周二014","matchStatus":"2","matchTime":"2019-10-23 03:00:00",
     * "model":"154","odds":"{\"0\":13.50,\"1\":7.50,\"3\":1.09}","period":"2019-10-22",
     * "prob":"87","rowKey":"11138020214643002","update":"0"},{"awayGround":"贝尔格莱德红星",
     * "awayHistory":"10|2|4|4","awayIcon":"","change":"6195","data":"143847","homeCourt":"热刺",
     * "homeHistory":"10|2|4|4","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/热刺_00013.png",
     * "homeVsAway":"0|0|0|0","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"3,1","matchRe":"3","matchSn":"周二013","matchStatus":"2",
     * "matchTime":"2019-10-23 03:00:00","model":"130","odds":"{\"0\":9.75,\"1\":5.75,
     * \"3\":1.18}","period":"2019-10-22","prob":"93","rowKey":"11138020214633001","update":"0"},
     * {"awayGround":"拜仁慕尼黑","awayHistory":"10|8|2|0","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/拜仁慕尼黑_00755.png","change":"8623","data":"139229","homeCourt":"奥林匹亚科斯",
     * "homeHistory":"10|7|2|1","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/奥林匹亚科斯_02370.png",
     * "homeVsAway":"2|0|0|2","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"1,0","matchRe":"0","matchSn":"周二012","matchStatus":"2",
     * "matchTime":"2019-10-23 03:00:00","model":"159","odds":"{\"0\":1.19,\"1\":5.50,
     * \"3\":9.75}","period":"2019-10-22","prob":"91","rowKey":"11138020214633002","update":"0"},
     * {"awayGround":"皇家马德里","awayHistory":"10|4|2|4","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/皇家马德里_00598.png","change":"9292","data":"189348","homeCourt":"加拉塔萨雷",
     * "homeHistory":"10|2|5|3","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/加拉塔萨雷_02199.png",
     * "homeVsAway":"4|1|0|3","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"0","matchRe":"0","matchSn":"周二011","matchStatus":"2",
     * "matchTime":"2019-10-23 03:00:00","model":"120","odds":"{\"0\":1.53,\"1\":3.80,
     * \"3\":4.50}","period":"2019-10-22","prob":"85","rowKey":"11138020214623002","update":"0"},
     * {"awayGround":"巴黎圣日尔曼","awayHistory":"10|3|3|4","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/巴黎圣日尔曼_00935.png","change":"7933","data":"158718","homeCourt":"布鲁日",
     * "homeHistory":"10|7|3|0","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/布鲁日_01870.png",
     * "homeVsAway":"0|0|0|0","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"1,0","matchRe":"0","matchSn":"周二010","matchStatus":"2",
     * "matchTime":"2019-10-23 03:00:00","model":"162","odds":"{\"0\":1.45,\"1\":4.00,
     * \"3\":5.40}","period":"2019-10-22","prob":"92","rowKey":"11138020214623001","update":"0"},
     * {"awayGround":"勒沃库森","awayHistory":"10|4|2|4","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/勒沃库森_00771.png","change":"6233","data":"150074","homeCourt":"马德里竞技",
     * "homeHistory":"10|6|2|2","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/马德里竞技_00680.png",
     * "homeVsAway":"0|0|0|0","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"3,1","matchRe":"3","matchSn":"周二003","matchStatus":"2",
     * "matchTime":"2019-10-23 00:55:00","model":"189","odds":"{\"0\":5.55,\"1\":3.55,
     * \"3\":1.51}","period":"2019-10-22","prob":"90","rowKey":"11138020214653001","update":"0"},
     * {"awayGround":"萨格勒布迪纳摩","awayHistory":"10|5|4|1","awayIcon":"https://cdn.scaiwl
     * .top/teamicon/t1/萨格勒布迪纳摩_04602.png","change":"6020","data":"155636","homeCourt":"顿涅茨克矿工",
     * "homeHistory":"10|9|0|1","homeIcon":"https://cdn.scaiwl.top/teamicon/t1/顿涅茨克矿工_04580.png",
     * "homeVsAway":"0|0|0|0","is":"1","isCollect":false,"isShow":"","leagueId":"1138",
     * "leagueName":"欧冠","matchProb":"3,1","matchRe":"1","matchSn":"周二002","matchStatus":"2",
     * "matchTime":"2019-10-23 00:55:00","model":"188","odds":"{\"0\":4.45,\"1\":3.55,
     * \"3\":1.62}","period":"2019-10-22","prob":"90","rowKey":"11138020214643001","update":"0"}]}
     * message : 成功
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        @SerializedName("2019-10-23")
        private List<_$20191023Bean> _$20191023;
        @SerializedName("2019-10-22")
        private List<_$20191022Bean> _$20191022;

        public List<_$20191023Bean> get_$20191023() {
            return _$20191023;
        }

        public void set_$20191023(List<_$20191023Bean> _$20191023) {
            this._$20191023 = _$20191023;
        }

        public List<_$20191022Bean> get_$20191022() {
            return _$20191022;
        }

        public void set_$20191022(List<_$20191022Bean> _$20191022) {
            this._$20191022 = _$20191022;
        }

        public static class _$20191023Bean {
            /**
             * awayGround : 巴伦西亚
             * awayHistory : 10|4|3|3
             * awayIcon : https://cdn.scaiwl.top/teamicon/t1/巴伦西亚_00595.png
             * change : 9082
             * data : 131774
             * homeCourt : 里尔
             * homeHistory : 10|3|3|4
             * homeIcon : https://cdn.scaiwl.top/teamicon/t1/里尔_00918.png
             * homeVsAway : 2|0|0|2
             * is : 1
             * isCollect : false
             * isShow :
             * leagueId : 1138
             * leagueName : 欧冠
             * matchProb : 3
             * matchRe :
             * matchSn : 周三017
             * matchStatus : 0
             * matchTime : 2019-10-24 03:00:00
             * model : 120
             * odds : {"0":2.40,"1":3.15,"3":2.56}
             * period : 2019-10-23
             * prob : 71
             * rowKey : 11138020214693002
             * update : 0
             */

            private String awayGround;
            private String awayHistory;
            private String awayIcon;
            private String change;
            private String data;
            private String homeCourt;
            private String homeHistory;
            private String homeIcon;
            private String homeVsAway;
            private String is;
            private boolean isCollect;
            private String isShow;
            private String leagueId;
            private String leagueName;
            private String matchProb;
            private String matchRe;
            private String matchSn;
            private String matchStatus;
            private String matchTime;
            private String model;
            private String odds;
            private String period;
            private String prob;
            private String rowKey;
            private String update;

            public String getAwayGround() {
                return awayGround;
            }

            public void setAwayGround(String awayGround) {
                this.awayGround = awayGround;
            }

            public String getAwayHistory() {
                return awayHistory;
            }

            public void setAwayHistory(String awayHistory) {
                this.awayHistory = awayHistory;
            }

            public String getAwayIcon() {
                return awayIcon;
            }

            public void setAwayIcon(String awayIcon) {
                this.awayIcon = awayIcon;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getHomeCourt() {
                return homeCourt;
            }

            public void setHomeCourt(String homeCourt) {
                this.homeCourt = homeCourt;
            }

            public String getHomeHistory() {
                return homeHistory;
            }

            public void setHomeHistory(String homeHistory) {
                this.homeHistory = homeHistory;
            }

            public String getHomeIcon() {
                return homeIcon;
            }

            public void setHomeIcon(String homeIcon) {
                this.homeIcon = homeIcon;
            }

            public String getHomeVsAway() {
                return homeVsAway;
            }

            public void setHomeVsAway(String homeVsAway) {
                this.homeVsAway = homeVsAway;
            }

            public String getIs() {
                return is;
            }

            public void setIs(String is) {
                this.is = is;
            }

            public boolean isIsCollect() {
                return isCollect;
            }

            public void setIsCollect(boolean isCollect) {
                this.isCollect = isCollect;
            }

            public String getIsShow() {
                return isShow;
            }

            public void setIsShow(String isShow) {
                this.isShow = isShow;
            }

            public String getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(String leagueId) {
                this.leagueId = leagueId;
            }

            public String getLeagueName() {
                return leagueName;
            }

            public void setLeagueName(String leagueName) {
                this.leagueName = leagueName;
            }

            public String getMatchProb() {
                return matchProb;
            }

            public void setMatchProb(String matchProb) {
                this.matchProb = matchProb;
            }

            public String getMatchRe() {
                return matchRe;
            }

            public void setMatchRe(String matchRe) {
                this.matchRe = matchRe;
            }

            public String getMatchSn() {
                return matchSn;
            }

            public void setMatchSn(String matchSn) {
                this.matchSn = matchSn;
            }

            public String getMatchStatus() {
                return matchStatus;
            }

            public void setMatchStatus(String matchStatus) {
                this.matchStatus = matchStatus;
            }

            public String getMatchTime() {
                return matchTime;
            }

            public void setMatchTime(String matchTime) {
                this.matchTime = matchTime;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getOdds() {
                return odds;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public String getProb() {
                return prob;
            }

            public void setProb(String prob) {
                this.prob = prob;
            }

            public String getRowKey() {
                return rowKey;
            }

            public void setRowKey(String rowKey) {
                this.rowKey = rowKey;
            }

            public String getUpdate() {
                return update;
            }

            public void setUpdate(String update) {
                this.update = update;
            }
        }

        public static class _$20191022Bean {
            /**
             * awayGround : 莫斯科火车头
             * awayHistory : 10|7|2|1
             * awayIcon : https://cdn.scaiwl.top/teamicon/t1/莫斯科火车头_01647.png
             * change : 7624
             * data : 132261
             * homeCourt : 尤文图斯
             * homeHistory : 10|2|4|4
             * homeIcon : https://cdn.scaiwl.top/teamicon/t1/尤文图斯_00437.png
             * homeVsAway : 0|0|0|0
             * is : 1
             * isCollect : false
             * isShow :
             * leagueId : 1138
             * leagueName : 欧冠
             * matchProb : 3,1
             * matchRe : 3
             * matchSn : 周二015
             * matchStatus : 2
             * matchTime : 2019-10-23 03:00:00
             * model : 180
             * odds : {"0":14.50,"1":6.15,"3":1.12}
             * period : 2019-10-22
             * prob : 91
             * rowKey : 11138020214653002
             * update : 0
             */

            private String awayGround;
            private String awayHistory;
            private String awayIcon;
            private String change;
            private String data;
            private String homeCourt;
            private String homeHistory;
            private String homeIcon;
            private String homeVsAway;
            private String is;
            private boolean isCollect;
            private String isShow;
            private String leagueId;
            private String leagueName;
            private String matchProb;
            private String matchRe;
            private String matchSn;
            private String matchStatus;
            private String matchTime;
            private String model;
            private String odds;
            private String period;
            private String prob;
            private String rowKey;
            private String update;

            public String getAwayGround() {
                return awayGround;
            }

            public void setAwayGround(String awayGround) {
                this.awayGround = awayGround;
            }

            public String getAwayHistory() {
                return awayHistory;
            }

            public void setAwayHistory(String awayHistory) {
                this.awayHistory = awayHistory;
            }

            public String getAwayIcon() {
                return awayIcon;
            }

            public void setAwayIcon(String awayIcon) {
                this.awayIcon = awayIcon;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getHomeCourt() {
                return homeCourt;
            }

            public void setHomeCourt(String homeCourt) {
                this.homeCourt = homeCourt;
            }

            public String getHomeHistory() {
                return homeHistory;
            }

            public void setHomeHistory(String homeHistory) {
                this.homeHistory = homeHistory;
            }

            public String getHomeIcon() {
                return homeIcon;
            }

            public void setHomeIcon(String homeIcon) {
                this.homeIcon = homeIcon;
            }

            public String getHomeVsAway() {
                return homeVsAway;
            }

            public void setHomeVsAway(String homeVsAway) {
                this.homeVsAway = homeVsAway;
            }

            public String getIs() {
                return is;
            }

            public void setIs(String is) {
                this.is = is;
            }

            public boolean isIsCollect() {
                return isCollect;
            }

            public void setIsCollect(boolean isCollect) {
                this.isCollect = isCollect;
            }

            public String getIsShow() {
                return isShow;
            }

            public void setIsShow(String isShow) {
                this.isShow = isShow;
            }

            public String getLeagueId() {
                return leagueId;
            }

            public void setLeagueId(String leagueId) {
                this.leagueId = leagueId;
            }

            public String getLeagueName() {
                return leagueName;
            }

            public void setLeagueName(String leagueName) {
                this.leagueName = leagueName;
            }

            public String getMatchProb() {
                return matchProb;
            }

            public void setMatchProb(String matchProb) {
                this.matchProb = matchProb;
            }

            public String getMatchRe() {
                return matchRe;
            }

            public void setMatchRe(String matchRe) {
                this.matchRe = matchRe;
            }

            public String getMatchSn() {
                return matchSn;
            }

            public void setMatchSn(String matchSn) {
                this.matchSn = matchSn;
            }

            public String getMatchStatus() {
                return matchStatus;
            }

            public void setMatchStatus(String matchStatus) {
                this.matchStatus = matchStatus;
            }

            public String getMatchTime() {
                return matchTime;
            }

            public void setMatchTime(String matchTime) {
                this.matchTime = matchTime;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getOdds() {
                return odds;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public String getProb() {
                return prob;
            }

            public void setProb(String prob) {
                this.prob = prob;
            }

            public String getRowKey() {
                return rowKey;
            }

            public void setRowKey(String rowKey) {
                this.rowKey = rowKey;
            }

            public String getUpdate() {
                return update;
            }

            public void setUpdate(String update) {
                this.update = update;
            }
        }
    }
}
