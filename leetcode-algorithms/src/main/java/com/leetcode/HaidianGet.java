package com.leetcode;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-29 14:36
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class HaidianGet {

    public static void main(String[] args) throws InterruptedException, IOException {
        int nuli = 0;
        while (true) {

            try {
                String cmd = "curl -v --cookie \"yunsuo_session_verify=e71ac165651f5733ba5f5e114f7e7ad2; ASP.NET_SessionId=qqxzrcua0mtogosuaekpp3ii; CNZZDATA1257130924=497571863-1480296700-%7C1480318436; LoginOn=zZAX2TMsxZq0fqhgwPeONKPqKAgG+Zrg4yvcnmkLap3DcPprTEE3bKALibwoDAlzCp2Y6lDKWBpjBzzjzqlHJOMr3J5pC2qdtEhk1YxhfBFZSK+o4KO1Oq3V8DpTVlmwJOQbv2cvbkIARLjAbgnK5jK3Dheva8HBaBekneuaD2hgG89TjAoufyVCEFZ4aABwuGO8M7YtD0pnxjof2q+5khwBJVo+K/Frwjjutx5/NGi+6S8txdJDe9gajn9P1ZD24f3ZQTn8pkzYVc8XSIG71+9EnMV2GPve+rDw9hEzU7EO1ZJd9FZxgkbk3DCTO4nt2IWKY6duC6cJR0V6N4Dv2CCwBdBJ1NZNGtnungINwEbrzgEBIJB9OgnadRtGk1svojW2R/HEoSnNE6WGmTNRdzqrzEE+isROZTuWNiG4nwWJD7SVVBoKegwU8sI/bbXdlzYZa22Tj2Wx3T/oiENcrMOGqW4aNGH90s+05T1Bqbxvs6miUBJH2D3hke4EPEnjDiqf+7SqlBf9l4TiCyqwzHfL0UpjnCJdSVXk/HMUldAIOCiroFloPjBfaiwHUvRwogCwFeAkPNhViAwqyhlg17PqaA5U7Gac6VmdJcFoWUrmkrwuTIphtJfbGnbbHAROENHpCmArmxddsya8CCdMcF5yKg/AVyos; CNZZDATA5234107=cnzz_eid%3D186966679-1480296142-http%253A%252F%252Fhaijia.bjxueche.net%252F%26ntime%3D1480323540; ImgCode=RPEYbRuC/qM=\" \"http://haijia.bjxueche.net/ych2.aspx\"";
                //String cmd = "netstat -nat|grep -i \"80\"";
                String[] cmdA = {"/bin/sh", "-c", cmd};
                Process p = Runtime.getRuntime().exec(cmdA);
                p.waitFor();
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String info;
                StringBuilder sb = new StringBuilder(100);
                int count = 0;
                while ((info = br.readLine()) != null) {
                    sb.append(info);
                    if (info.contains(">无<")) {
                        info = info.substring(info.indexOf("2016-11-30"));
                        char[] a = info.toCharArray();
                        for (int i = 0; i < a.length; i++) {
                            if (a[i] == '无') {
                                count++;
                            }
                        }
                    }
                }
                if (sb.toString().contains("Object moved")) {
                    while (true) {
                        System.out.println("请重新登陆");
                        String sayCmd = "say 请重新登陆";
                        String[] cmdB = {"/bin/sh", "-c", sayCmd};
                        Runtime.getRuntime().exec(cmdB);
                        TimeUnit.SECONDS.sleep(10);
                    }
                }
                if (count < (24 - 6)) {
                    if (sb.toString().contains(">无<")) {
                        System.out.println("有车啦,赶紧去看看吧");
                        String sayCmd = "say 有车啦，赶紧去看看吧";
                        String[] cmdB = {"/bin/sh", "-c", sayCmd};
                        Runtime.getRuntime().exec(cmdB).waitFor();
                        System.exit(1);
                    } else if (sb.toString().contains("很抱歉，您的电脑或所在的局域网络有异常的访问")) {
                        System.out.println("哎,又访问异常啦,先休息休息一下吧");
                        String sayCmd = "say 哎，又访问异常啦，先休息休息一下吧";
                        String[] cmdB = {"/bin/sh", "-c", sayCmd};
                        Runtime.getRuntime().exec(cmdB).waitFor();
                        System.out.println(nuli);
                        if (nuli == 1) {
                            System.exit(0);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            TimeUnit.SECONDS.sleep(15);
            nuli++;
            if (nuli % 10 == 0) {
                String sayCmd = "say 已经查看了" + nuli + "次了，继续哦";
                String[] cmdB = {"/bin/sh", "-c", sayCmd};
                Runtime.getRuntime().exec(cmdB);
            }
        }
    }

}
