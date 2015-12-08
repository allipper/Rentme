package com.android.youhu.ui.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.youhu.R;
import com.android.youhu.ui.base.BaseActivity;

/**
 * Created by allipper on 2015/10/8.
 */
public class AgreementActivity extends BaseActivity {
    private TextView tvContent;
    private TextView titleContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tvContent = (TextView) findViewById(R.id.content);
        titleContent = (TextView) findViewById(R.id.title);
        tvContent.setText("软件安装协议\n" +
                "\n" +
                "\n" +
                "　　本协议由友乎App官方制作，用户通过运行本安装程序并点击一下“我同意”的按钮，这表示用户接受以下所有条款。用户应认真阅读本《软件许可协议》(下称《协议》)" +
                "中各条款。请您审阅并接受或不接受本《协议》(未成年人应在法定监护人陪同下审阅)" +
                "。除非您接受本《协议》条款，否则您无权下载、安装或使用本软件及其相关服务。您的安装使用行为将视为对本《协议》的接受，并同意接受本《协议》各项条款的约束。\n" +
                "    " +
                "本《协议》可随时更新，且会另行通知。本《协议》条款一旦发生变更，在本软件上公布更新内容。更新后的协议内容一旦公布即有效代替原来的协议条款。您可随时登陆本软件查阅最新版协议条款。\n" +
                "\n" +
                "1     知识产权声明\n" +
                "\n" +
                "1.1 " +
                "“软件”的一切版权等知识产权，以及与“软件”相关的所有信息内容，包括但不限于：文字表述及其组合、图标、图饰、图表、色彩、界面设计、版面框架、有关数据、印刷材料、或电子文档等均受著作权法和国际著作权条约以及其他知识产权法律法规的保护。\n" +
                "\n" +
                "2     “软件”授权范围\n" +
                "\n" +
                "2.1   用户可以在单一一台计算机、终端机、工作站或其他数字电子仪器(下统称“计算机”)上安装、使用、显示、运行本“软件”。\n" +
                "2.2  " +
                "除本《协议》有明确规定外，本《协议》并未对利用本“软件”的其他服务规定相关的服务条款，对于这些服务可能有单独的服务条款加以规范，请用户在使用有关服务时另行了解与确认。如用户使用该服务，视为对相关服务条款的接受。\n" +
                "\n" +
                "3     用户使用须知\n" +
                "\n" +
                "3.1   用户应保证用户注册登记软件或合作单位提供的服务时提供的资料均为真实无误。\n" +
                "\n" +
                "3.2   用户在遵守法律及本协议的前提下可依本《协议》使用本“软件”。用户无权实施包括但不限于下列行为：\n" +
                "\n" +
                "3.2.1删除本“软件”所有关于版权的信息、内容；\n" +
                "\n" +
                "3.2.2利用本“软件”发表、传送、传播、储存违反国家法律、危害国家安全、祖国统一、社会稳定的内容，或侮辱诽谤、色情、暴力及任何违反国家法律法规政策的内容。\n" +
                "\n" +
                "3.2.3利用本“软件”发表、传送、传播、储存侵害他人知识产权、商业秘密等合法权利的内容。\n" +
                "\n" +
                "3.2.4未经官方授权以任何形式变更、发行、播放、转载、复制、重制、散布、表演、展示本软件的图片、音频、视频及其他资源和捕捉图片、音频、视频和其他资源而形成的视频、音频、图象及相关的商业行为。否则将视作侵权，依法追究法律责任。\n" +
                "\n" +
                "3.3  " +
                "使用本“软件”必须遵守国家有关法律和政策等，维护国家利益，保护国家安全，并遵守本协议，对于用户违法或违反本协议的使用而引起的一切责任，由用户负全部责任。\n" +
                "\n" +
                "3.4未经同意，不得对本“软件”进行反向工程、反向汇编、反向编译等。\n" +
                "\n" +
                "4     其他条款\n" +
                "\n" +
                "4.1   本协议所定的任何条款的部分或全部无效者，不影响其它条款的效力");
        titleContent.setText("服务条款");
    }

    public void back(View v) {
        onBackPressed();
    }
}