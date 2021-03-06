package com.nith.appteam.nimbus2021.Fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.nith.appteam.nimbus2021.Activities.CoreTeamActivity;
import com.nith.appteam.nimbus2021.Activities.Event_Choose;
import com.nith.appteam.nimbus2021.Activities.Exhhibition;
import com.nith.appteam.nimbus2021.Activities.QuizMainActivity;
import com.nith.appteam.nimbus2021.Activities.Talks;
import com.nith.appteam.nimbus2021.Activities.Videocall_Joining;
import com.nith.appteam.nimbus2021.Activities.Web;
import com.nith.appteam.nimbus2021.Activities.Workshops;
import com.nith.appteam.nimbus2021.Activities.contributorsActivity;
import com.nith.appteam.nimbus2021.R;

import org.sufficientlysecure.htmltextview.HtmlTextView;


public class Dashboard extends Fragment {
    Animation animation, animation1, animation2, animation3,animation4,animation5;
    private HtmlTextView  event_text, campus_text, developers_text, core_team_text, contact_us_text;
    private CardView quiz_card, workshop_card, exhibition_card, talk_card,omegle;
    private ImageView t_n, t_k, e_n, e_k,omg_n,omg_k;
    private AlertDialog.Builder alertDialogBuilder;
    private AlertDialog dialog;

    public Dashboard() {
        
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);

//        quote1 = rootView.findViewById(R.id.quote1);

//        quote2 = rootView.findViewById(R.id.quote2);
        event_text = rootView.findViewById(R.id.event_text);
//        campus_text = rootView.findViewById(R.id.campus_text);
        core_team_text = rootView.findViewById(R.id.core_team);
        contact_us_text = rootView.findViewById(R.id.contact_us);
        quiz_card = rootView.findViewById(R.id.quiz_card);
        workshop_card = rootView.findViewById(R.id.workshop_card);
        exhibition_card = rootView.findViewById(R.id.exhibition_card);
        talk_card = rootView.findViewById(R.id.talk_card);
        developers_text = rootView.findViewById(R.id.developers_text);
        omegle = rootView.findViewById(R.id.omgl_card);

        t_n = rootView.findViewById(R.id.t_n);
        t_k = rootView.findViewById(R.id.t_k);
        e_n = rootView.findViewById(R.id.e_n);
        e_k = rootView.findViewById(R.id.e_k);
        omg_n = rootView.findViewById(R.id.omg_n);
        omg_k = rootView.findViewById(R.id.omg_k);

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fast_anim);
        animation1 = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slow_anim);
        animation2 = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fast_anim_v);
        animation3 = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slow_anim_v);
        animation4 = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fast_anim_v2);
        animation5 = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slow_anim_v2);

        e_n.startAnimation(animation);
        e_k.startAnimation(animation1);
        t_n.startAnimation(animation2);
        t_k.startAnimation(animation3);
        omg_n.startAnimation(animation4);
        omg_k.startAnimation(animation5);


//        quote2.setHtml(
//                "<p>\"HOW YOU <font color=\"#2fc0d1\">CODIN'</font> \uD83D\uDCBB ?!\" "
//                        + "<small><i><font color=\"#888888\"> ~ <strike>JOEY</strike> "
//                        + "NIMBUS</font></i></small></p>");

        developers_text.setHtml("<p>\"MEET THE<font color=\"#2fc0d1\"> DEVELOPERS</font> \uD83D\uDCBB\"</p>");

//        campus_text.setHtml(
//                "<p>\"ARE YOU A <font color=\"#2fc0d1\">CAMPUS AMBASSADOR</font> \uD83D\uDEA9"
//                        + " ?\"</p>");

        core_team_text.setHtml("<p>\"MEET THE<font color=\"#2fc0d1\"> CORE TEAM</font> \uD83D\uDD76\"</p>");

        contact_us_text.setHtml("<p>\"<font color=\"#2fc0d1\">CONTACT US</font>\"</p>");

        event_text.setHtml(
                "<p>\"SNEAK PEAK \uD83D\uDD76 OUR <font color=\"#2fc0d1\">EVENTS</font> "
                        + "!\"</p>");


//        quote1.setHtml(
//                "<p>\"I AM <strike>IRON MAN</strike> <font color=\"#2fc0d1\">SCOPUS</font>"
//                        + " \uD83D\uDE80 !\" <small><i><font color=\"#888888\"> ~ "
//                        + "NIMBUS</font></i></small></p>");

        quiz_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), QuizMainActivity.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
        workshop_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Workshops.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
        talk_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Talks.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
        exhibition_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Exhhibition.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
        event_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Event_Choose.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
//        campus_text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity(), CampusAmbassador.class);
//                startActivity(i);
//                context.overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
//            }
//        });
        core_team_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CoreTeamActivity.class);
                startActivity(i);
                getActivity().overridePendingTransition(R.anim.ease_in, R.anim.ease_out);
            }
        });
        contact_us_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Web.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("url", "https://festnimbus.com/contact");
                getContext().startActivity(intent);
            }
        });
        developers_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), contributorsActivity.class);
                startActivity(i);
            }
        });
        omegle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Videocall_Joining.class);
                startActivity(i);
            }
        });


//        quote1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                alertDialogBuilder = new AlertDialog.Builder(getActivity());
//                View view = getLayoutInflater().inflate(R.layout.dialog_scopus, null);
//                alertDialogBuilder.setView(view);
//                dialog = alertDialogBuilder.create();
//                dialog.show();
////                view.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View view) {
////                        dialog.dismiss();
////                    }
////                });
//            }
//        });
        return rootView;
    }
}
