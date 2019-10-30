package com.example.lhy.wanandroid.bean;

import java.util.List;

/**
 * Created by usercwq on 2019/10/23.
 */

public class AnalysisBean {


    /**
     * code : 200
     * data : [{"leagueIcon":"https://cdn.scaiwl.top/teamicon/t2/欧冠_1138.png","leagueName":"欧冠",
     * "leagueParent":"欧洲赛事","leagueSn":"03/04赛季","leagueType":"2","rowKey":"111138004"},
     * {"leagueIcon":"https://cdn.scaiwl.top/teamicon/t2/亚冠杯_1163.png","leagueName":"亚冠杯",
     * "leagueParent":"亚洲赛事","leagueSn":"2007赛季","leagueType":"2","rowKey":"111163056"},
     * {"leagueIcon":"","leagueName":"澳足总杯","leagueParent":"澳大利亚","leagueSn":"2014赛季",
     * "leagueType":"2","rowKey":"111135063"},{"leagueIcon":"https://cdn.scaiwl
     * .top/teamicon/t2/天皇杯_1127.png","leagueName":"天皇杯","leagueParent":"日本","leagueSn":"2006赛季",
     * "leagueType":"2","rowKey":"111127055"},{"leagueIcon":"https://cdn.scaiwl
     * .top/teamicon/t2/英冠_1002.png","leagueName":"英冠","leagueParent":"英格兰","leagueSn":"00/01赛季",
     * "leagueType":"1","rowKey":"111002001"},{"leagueIcon":"https://cdn.scaiwl
     * .top/teamicon/t2/美职_1114.png","leagueName":"美职","leagueParent":"美国","leagueSn":"2003赛季",
     * "leagueType":"1","rowKey":"111114052"},{"leagueIcon":"https://cdn.scaiwl
     * .top/teamicon/t2/解放者杯_1157.png","leagueName":"解放者杯","leagueParent":"美洲赛事",
     * "leagueSn":"2005赛季","leagueType":"2","rowKey":"111157054"},{"leagueIcon":"https://cdn
     * .scaiwl.top/teamicon/t2/欧洲联赛_1139.png","leagueName":"欧洲联赛","leagueParent":"欧洲赛事",
     * "leagueSn":"03/04赛季","leagueType":"2","rowKey":"111139004"}]
     * message : 成功
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * leagueIcon : https://cdn.scaiwl.top/teamicon/t2/欧冠_1138.png
         * leagueName : 欧冠
         * leagueParent : 欧洲赛事
         * leagueSn : 03/04赛季
         * leagueType : 2
         * rowKey : 111138004
         */

        private String leagueIcon;
        private String leagueName;
        private String leagueParent;
        private String leagueSn;
        private String leagueType;
        private String rowKey;

        public String getLeagueIcon() {
            return leagueIcon;
        }

        public void setLeagueIcon(String leagueIcon) {
            this.leagueIcon = leagueIcon;
        }

        public String getLeagueName() {
            return leagueName;
        }

        public void setLeagueName(String leagueName) {
            this.leagueName = leagueName;
        }

        public String getLeagueParent() {
            return leagueParent;
        }

        public void setLeagueParent(String leagueParent) {
            this.leagueParent = leagueParent;
        }

        public String getLeagueSn() {
            return leagueSn;
        }

        public void setLeagueSn(String leagueSn) {
            this.leagueSn = leagueSn;
        }

        public String getLeagueType() {
            return leagueType;
        }

        public void setLeagueType(String leagueType) {
            this.leagueType = leagueType;
        }

        public String getRowKey() {
            return rowKey;
        }

        public void setRowKey(String rowKey) {
            this.rowKey = rowKey;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "leagueIcon='" + leagueIcon + '\'' +
                    ", leagueName='" + leagueName + '\'' +
                    ", leagueParent='" + leagueParent + '\'' +
                    ", leagueSn='" + leagueSn + '\'' +
                    ", leagueType='" + leagueType + '\'' +
                    ", rowKey='" + rowKey + '\'' +
                    '}';
        }
    }
}
