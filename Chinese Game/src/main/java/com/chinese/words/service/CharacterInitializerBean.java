package com.chinese.words.service;

import com.chinese.words.ChineseApp;
import com.chinese.words.model.Hanzi;
import com.chinese.words.model.Word;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;

@Component
public class CharacterInitializerBean {

    public CharacterInitializerBean(ChineseAppService chineseAppService) throws ParseException {
/*
        chineseAppService.saveHanzi("好","hao3");
        chineseAppService.saveHanzi("八", "ba1");
        chineseAppService.saveHanzi("爱", "ai4");
        chineseAppService.saveHanzi("爸", "ba4");
        chineseAppService.saveHanzi("杯", "bei1");
        chineseAppService.saveHanzi("子", "zi");
        chineseAppService.saveHanzi("北", "bei3");
        chineseAppService.saveHanzi("京", "jing1");

        chineseAppService.saveWord("ni3hao3", "hi");


     /*   chineseAppService.saveHanzi("本", "ben3");
        chineseAppService.saveHanzi("不", "bu4");
        chineseAppService.saveHanzi("客", "ke4");
        chineseAppService.saveHanzi("气", "qi");
        chineseAppService.saveHanzi("菜", "cai4");
        chineseAppService.saveHanzi("茶", "cha2");
        chineseAppService.saveHanzi("吃", "chi1");
        chineseAppService.saveHanzi("出", "chu1");
        chineseAppService.saveHanzi("租", "zu1");
        chineseAppService.saveHanzi("车", "che1");
        chineseAppService.saveHanzi("打", "da3");
        chineseAppService.saveHanzi("电", "dian4");
        chineseAppService.saveHanzi("话", "hua4");
        chineseAppService.saveHanzi("大", "da4");
        chineseAppService.saveHanzi("的", "de");
        chineseAppService.saveHanzi("点", "dian3");
        chineseAppService.saveHanzi("脑", "nao3");
        chineseAppService.saveHanzi("视", "shi4");
        chineseAppService.saveHanzi("影", "ying3");
        chineseAppService.saveHanzi("东", "dong1");
        chineseAppService.saveHanzi("西", "xi");
        chineseAppService.saveHanzi("都", "dou1");
        chineseAppService.saveHanzi("读", "du");
        chineseAppService.saveHanzi("对", "dui4");
        chineseAppService.saveHanzi("起", "qi3");
        chineseAppService.saveHanzi("多", "duo1");
        chineseAppService.saveHanzi("少", "shao3");
        chineseAppService.saveHanzi("儿", "er2");
        chineseAppService.saveHanzi("二", "er4");
        chineseAppService.saveHanzi("饭", "fan4");
        chineseAppService.saveHanzi("馆", "guan3");
        chineseAppService.saveHanzi("飞", "fei1");
        chineseAppService.saveHanzi("机", "ji1");
        chineseAppService.saveHanzi("分", "fen1");
        chineseAppService.saveHanzi("钟", "zhong1");
        chineseAppService.saveHanzi("高", "gao1");
        chineseAppService.saveHanzi("兴", "xing4");
        chineseAppService.saveHanzi("个", "ge4");
        chineseAppService.saveHanzi("工", "gong1");
        chineseAppService.saveHanzi("作", "zuo4");
        chineseAppService.saveHanzi("狗", "gou3");
        chineseAppService.saveHanzi("汉", "han4");
        chineseAppService.saveHanzi("喝", "he1");
        chineseAppService.saveHanzi("和", "he2");
        chineseAppService.saveHanzi("很", "hen3");
        chineseAppService.saveHanzi("后", "hou4");
        chineseAppService.saveHanzi("面", "mian");
        chineseAppService.saveHanzi("回", "hui2");
        chineseAppService.saveHanzi("会", "hui4");
        chineseAppService.saveHanzi("火", "huo3");
        chineseAppService.saveHanzi("站", "zhan");
        chineseAppService.saveHanzi("几", "ji3");
        chineseAppService.saveHanzi("家", "jia1");
        chineseAppService.saveHanzi("叫", "jiao4");
        chineseAppService.saveHanzi("今", "jin1");
        chineseAppService.saveHanzi("天", "tian1");
        chineseAppService.saveHanzi("九", "jiu3");
        chineseAppService.saveHanzi("开", "kai1");
        chineseAppService.saveHanzi("看", "kan1");
        chineseAppService.saveHanzi("见", "jian4");
        chineseAppService.saveHanzi("块", "kuai4");
        chineseAppService.saveHanzi("来", "lai2");
        chineseAppService.saveHanzi("老", "lao3");
        chineseAppService.saveHanzi("师", "shi1");
        chineseAppService.saveHanzi("了", "le");
        chineseAppService.saveHanzi("冷", "leng3");
        chineseAppService.saveHanzi("里", "li3");
        chineseAppService.saveHanzi("零", "ling2");
        chineseAppService.saveHanzi("六", "liu4");
        chineseAppService.saveHanzi("妈", "ma1");
        chineseAppService.saveHanzi("吗", "ma");
        chineseAppService.saveHanzi("买", "mai3");
        chineseAppService.saveHanzi("猫", "mao1");
        chineseAppService.saveHanzi("没", "mei2");
        chineseAppService.saveHanzi("关", "guan1");
        chineseAppService.saveHanzi("系", "xi");
        chineseAppService.saveHanzi("米", "mi3");
        chineseAppService.saveHanzi("饭", "fan4");
        chineseAppService.saveHanzi("明", "ming2");
        chineseAppService.saveHanzi("名", "ming2");
        chineseAppService.saveHanzi("哪", "na2");
        chineseAppService.saveHanzi("儿", "er2");
        chineseAppService.saveHanzi("那", "na4");
        chineseAppService.saveHanzi("呢", "ne");
        chineseAppService.saveHanzi("能", "neng2");
        chineseAppService.saveHanzi("你", "ni3");
        chineseAppService.saveHanzi("年", "nian2");
        chineseAppService.saveHanzi("女", "nv3");
        chineseAppService.saveHanzi("朋", "peng2");
        chineseAppService.saveHanzi("友", "you");
        chineseAppService.saveHanzi("漂", "piao4");
        chineseAppService.saveHanzi("亮", "liang");
        chineseAppService.saveHanzi("苹", "ping2");
        chineseAppService.saveHanzi("果", "guo3");
        chineseAppService.saveHanzi("七", "qi1");
        chineseAppService.saveHanzi("钱", "qian2");
        chineseAppService.saveHanzi("前", "qian2");
        chineseAppService.saveHanzi("请", "qing3");
        chineseAppService.saveHanzi("去", "qu4");
        chineseAppService.saveHanzi("热", "re4");
        chineseAppService.saveHanzi("人", "ren2");
        chineseAppService.saveHanzi("认", "ren4");
        chineseAppService.saveHanzi("识", "shi5");
        chineseAppService.saveHanzi("日", "ri4");
        chineseAppService.saveHanzi("三", "san1");
        chineseAppService.saveHanzi("商", "shang1");
        chineseAppService.saveHanzi("店", "dian4");
        chineseAppService.saveHanzi("上", "shang4");
        chineseAppService.saveHanzi("午", "wu3");
        chineseAppService.saveHanzi("谁", "shei2");
        chineseAppService.saveHanzi("什", "shen2");
        chineseAppService.saveHanzi("么", "me");
        chineseAppService.saveHanzi("十", "shi2");
        chineseAppService.saveHanzi("时", "shi2");
        chineseAppService.saveHanzi("候", "hou");
        chineseAppService.saveHanzi("是", "shi4");
        chineseAppService.saveHanzi("书", "shu1");
        chineseAppService.saveHanzi("水", "shui3");
        chineseAppService.saveHanzi("睡", "shui4");
        chineseAppService.saveHanzi("觉", "jiao4");
        chineseAppService.saveHanzi("说", "shuo1");
        chineseAppService.saveHanzi("四", "si4");
        chineseAppService.saveHanzi("岁", "sui4");
        chineseAppService.saveHanzi("他", "ta1");
        chineseAppService.saveHanzi("她", "ta1");
        chineseAppService.saveHanzi("太", "tai4");
        chineseAppService.saveHanzi("气", "qi4");
        chineseAppService.saveHanzi("听", "ting1");
        chineseAppService.saveHanzi("学", "xue2");
        chineseAppService.saveHanzi("喂", "wei4");
        chineseAppService.saveHanzi("我", "wo3");
        chineseAppService.saveHanzi("们", "men");
        chineseAppService.saveHanzi("五", "wu3");
        chineseAppService.saveHanzi("喜", "xi3");
        chineseAppService.saveHanzi("欢", "huan");
        chineseAppService.saveHanzi("下", "xia4");
        chineseAppService.saveHanzi("雨", "yu3");
        chineseAppService.saveHanzi("先", "xian1");
        chineseAppService.saveHanzi("生", "sheng");
        chineseAppService.saveHanzi("现", "xian4");
        chineseAppService.saveHanzi("在", "zai4");
        chineseAppService.saveHanzi("想", "xiang3");
        chineseAppService.saveHanzi("小", "xiao3");
        chineseAppService.saveHanzi("姐", "jie");
        chineseAppService.saveHanzi("些", "xie1");
        chineseAppService.saveHanzi("写", "xie3");
        chineseAppService.saveHanzi("谢", "xie4");
        chineseAppService.saveHanzi("星", "xing1");
        chineseAppService.saveHanzi("期", "qi1");
        chineseAppService.saveHanzi("学", "xue2");
        chineseAppService.saveHanzi("习", "xi2");
        chineseAppService.saveHanzi("校", "xiao4");
        chineseAppService.saveHanzi("一", "yi1");
        chineseAppService.saveHanzi("衣", "yi1");
        chineseAppService.saveHanzi("服", "fu");
        chineseAppService.saveHanzi("医", "yi1");
        chineseAppService.saveHanzi("院", "yuan4");
        chineseAppService.saveHanzi("椅", "yi3");
        chineseAppService.saveHanzi("有", "you3");
        chineseAppService.saveHanzi("月", "yue4");
        chineseAppService.saveHanzi("再", "zai4");
        chineseAppService.saveHanzi("怎", "zen3");
        chineseAppService.saveHanzi("样", "yang4");
        chineseAppService.saveHanzi("这", "zhe4");
        chineseAppService.saveHanzi("中", "zhong1");
        chineseAppService.saveHanzi("国", "guo2");
        chineseAppService.saveHanzi("住", "zhu4");
        chineseAppService.saveHanzi("桌", "zhuo1");
        chineseAppService.saveHanzi("昨", "zuo2");
        chineseAppService.saveHanzi("做", "zuo4");
        chineseAppService.saveHanzi("坐", "zuo4"); */

    }

}
