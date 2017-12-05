package io.app.hasura.imad.namanyadav123.mydtu;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NotesAllYears extends AppCompatActivity {
DownloadManager dm;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.first145, R.string.first189));
        words.add(new Word(R.string.first146, R.string.first188));
        words.add(new Word(R.string.first147, R.string.first104));
        words.add(new Word(R.string.first148, R.string.first105));
        words.add(new Word(R.string.first149, R.string.first106));
        words.add(new Word(R.string.first150, R.string.first107));
        words.add(new Word(R.string.first151, R.string.first108));
        words.add(new Word(R.string.first152, R.string.first109));
        words.add(new Word(R.string.first153, R.string.first110));
        words.add(new Word(R.string.first154, R.string.first111));
        words.add(new Word(R.string.first155, R.string.first112));
        words.add(new Word(R.string.first156, R.string.first113));
        words.add(new Word(R.string.first157, R.string.first114));
        words.add(new Word(R.string.first158, R.string.first115));
        words.add(new Word(R.string.first159, R.string.first116));
        words.add(new Word(R.string.first160, R.string.first117));
        words.add(new Word(R.string.first161, R.string.first118));
        words.add(new Word(R.string.first162 ,R.string.first119));
        words.add(new Word(R.string.first163 ,R.string.first120));
        words.add(new Word(R.string.first164, R.string.first121));
        words.add(new Word(R.string.first166, R.string.first122));
        words.add(new Word(R.string.first167, R.string.first123));
        words.add(new Word(R.string.first168, R.string.first124));
        words.add(new Word(R.string.first169, R.string.first125));
        words.add(new Word(R.string.first170, R.string.first126));
        words.add(new Word(R.string.first171, R.string.first127));
        words.add(new Word(R.string.first172, R.string.first128));
        words.add(new Word(R.string.first173, R.string.first129));
        words.add(new Word(R.string.first174, R.string.first130));
        words.add(new Word(R.string.first175, R.string.first131));
        words.add(new Word(R.string.first176, R.string.first132));
        words.add(new Word(R.string.first177, R.string.first133));
        words.add(new Word(R.string.first178, R.string.first134));
        words.add(new Word(R.string.first179, R.string.first135));
        words.add(new Word(R.string.first180, R.string.first136));
        words.add(new Word(R.string.first181, R.string.first137));
        words.add(new Word(R.string.first182, R.string.first138));
        words.add(new Word(R.string.first183, R.string.first139));
        words.add(new Word(R.string.first184, R.string.first140));
        words.add(new Word(R.string.first185, R.string.first141));
        words.add(new Word(R.string.first186, R.string.first142));
        words.add(new Word(R.string.first187, R.string.first143));
        words.add(new Word(R.string.first187, R.string.first144));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(NotesAllYears.this, words, R.color.colorAccent7);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i){

                    case 0:


                                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Mathematical%20Physics.pdf?alt=media&token=9074b837-848d-49dd-b420-ea09b8f4837b");
                                DownloadManager.Request request = new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                                Long reference = dm.enqueue(request);
                                 break;




                    case 1:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Classical%20physics.pdf?alt=media&token=c045a139-e03a-4825-ab18-07cd38b0ff17");
                        DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                        request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference1 = dm.enqueue(request1);
                        break;

                    case 2:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Condensed%20matter%20physics.pdf?alt=media&token=4bf1d3cb-00ca-49a6-8369-a4cdebb49049");
                        DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                        request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference2 = dm.enqueue(request2);
                        break;
                    case 3:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Optics.pdf?alt=media&token=7b7defdd-ad16-4c80-a041-0c9d60bc27e7");
                        DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                        request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference3 = dm.enqueue(request3);
                        break;
                    case 4:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/N5625_1.pdf?alt=media&token=dd460bfa-53e2-4536-9fd5-fdb950bb89a7");
                        DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                        request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference4 = dm.enqueue(request4);
                        break;
                    case 5:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/matlab%20notes.pdf?alt=media&token=f1638fd1-ef4d-4abd-8a38-3ab56645ee50");
                        DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                        request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference5 = dm.enqueue(request5);
                        break;
                    case 6:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Electromagnetic%20field%20theory.pdf?alt=media&token=f54be063-61ef-400b-92fe-ce1c5f42749d");
                        DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                        request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference6 = dm.enqueue(request6);
                        break;
                    case 7:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Asyn.%20And%20Sync.%20Machines.pdf?alt=media&token=6208704e-9124-47e2-a918-9d97a9764ad1");
                        DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                        request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference7 = dm.enqueue(request7);
                        break;
                    case 8:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Linear%20integrated%20circuit.pdf?alt=media&token=b67b59a0-c81a-4446-a60a-9ce1bbda8252");
                        DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                        request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference8 = dm.enqueue(request8);
                        break;
                    case 9:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Control%20system.pdf?alt=media&token=90ab0da9-f9c3-4010-8adf-a6bb1bec9eae");
                        DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                        request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference9 = dm.enqueue(request9);
                        break;
                    case 10:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog_1.pdf?alt=media&token=82a38a87-b8c6-4325-99b8-e9c176adbb35");
                        DownloadManager.Request request10 = new DownloadManager.Request(uri10);
                        request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference10 = dm.enqueue(request10);
                        break;
                    case 11:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog_2.pdf?alt=media&token=9372d92e-2b54-4c6c-9690-ad82cb23cc79");
                        DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                        request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference11 = dm.enqueue(request11);
                        break;
                    case 12:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog_3.pdf?alt=media&token=1b384d34-42a7-44c3-ae8c-894771919249");
                        DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                        request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference12 = dm.enqueue(request12);
                        break;
                    case 13:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/analog_4.pdf?alt=media&token=f7b13fe7-3bac-4ae8-9ca5-b7f6c72d6791");
                        DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                        request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference13 = dm.enqueue(request13);

                        break;
                    case 14:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/digital_electronics_1.pdf?alt=media&token=0dc9eac9-75b9-421b-a791-8ffb4ca98d95");
                        DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                        request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference14 = dm.enqueue(request14);
                        break;
                    case 15:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/digital_electronics_2.pdf?alt=media&token=9bff4f2d-61b6-4e4f-b2f8-ad23060e7b0d");
                        DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                        request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference15 = dm.enqueue(request15);
                        break;
                    case 16:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/digital_electronics_3.pdf?alt=media&token=18cf356b-8a22-46d4-af6e-e588d761743c");
                        DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                        request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference16 = dm.enqueue(request16);
                        break;
                    case 17:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/network_theory_1.pdf?alt=media&token=c9ee2062-f221-4f62-91ef-8aab2124b756");
                        DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                        request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference17 = dm.enqueue(request17);
                        break;
                    case 18:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri18 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/network_theory_2.pdf?alt=media&token=8f8eece3-78ad-4246-8940-f1b90ca4afe0");
                        DownloadManager.Request request18 = new DownloadManager.Request(uri18);
                        request18.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference18 = dm.enqueue(request18);
                        break;
                    case 19:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri19 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/network_theory_3.pdf?alt=media&token=096e7369-3efa-4929-87df-bb84e8bc3090");
                        DownloadManager.Request request19 = new DownloadManager.Request(uri19);
                        request19.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference19 = dm.enqueue(request19);
                        break;
                    case 20:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri20 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/network_theory_4.pdf?alt=media&token=291953ae-d286-40ba-b807-ae84a9e2b3f7");
                        DownloadManager.Request request20 = new DownloadManager.Request(uri20);
                        request20.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference20 = dm.enqueue(request20);
                        break;
                    case 21:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri21 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Electrochemical%20conversion.pdf?alt=media&token=eec98799-e04f-4a7b-b22f-442c7f0549d0");
                        DownloadManager.Request request21 = new DownloadManager.Request(uri21);
                        request21.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference21 = dm.enqueue(request21);
                        break;
                    case 22:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri22 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Basic%20electrical%20engineering.pdf?alt=media&token=c99ac0ec-6b94-47d9-9851-9211db68154b");
                        DownloadManager.Request request22 = new DownloadManager.Request(uri22);
                        request22.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference22 = dm.enqueue(request22);
                        break;
                    case 23:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri23 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/signal_system_1.pdf?alt=media&token=72d3d4a4-1167-419a-a01e-6d317f03dd32");
                        DownloadManager.Request request23 = new DownloadManager.Request(uri23);
                        request23.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference23 = dm.enqueue(request23);
                        break;
                    case 24:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri24 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/signal_system_2.pdf?alt=media&token=451e1780-f5c0-486c-85bc-8d848ad4351f");
                        DownloadManager.Request request24 = new DownloadManager.Request(uri24);
                        request24.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference24 = dm.enqueue(request24);
                        break;
                    case 25:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri25 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/signal_system_3.pdf?alt=media&token=1f69cd86-17aa-4b92-9ac5-4225ac97d122");
                        DownloadManager.Request request25 = new DownloadManager.Request(uri25);
                        request25.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference25 = dm.enqueue(request25);
                        break;
                    case 26:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri26 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/signal_system_4.pdf?alt=media&token=cc26c0e7-5c6a-4fe3-af48-aec97d3c38a3");
                        DownloadManager.Request request26 = new DownloadManager.Request(uri26);
                        request26.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference26 = dm.enqueue(request26);
                        break;
                    case 27:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri27 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/EIM%20for%20ECE.pdf?alt=media&token=54399396-7e4f-4e06-b529-9d99506e3a6a");
                        DownloadManager.Request request27 = new DownloadManager.Request(uri27);
                        request27.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference27 = dm.enqueue(request27);
                        break;
                    case 28:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri28 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Sitmulation%20and%20modelling.pdf?alt=media&token=adbf530f-f956-4391-b0f4-548251c26c64");
                        DownloadManager.Request request28 = new DownloadManager.Request(uri28);
                        request28.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference28 = dm.enqueue(request28);
                        break;
                    case 29:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri29 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/SOFTWARE%20ENGINEERING.pdf?alt=media&token=df0bdb94-30e0-4da3-8470-8bef41a34ad3");
                        DownloadManager.Request request29 = new DownloadManager.Request(uri29);
                        request29.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference29 = dm.enqueue(request29);
                        break;
                    case 30:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri30 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Computer%20network.pdf?alt=media&token=e5bcd27a-1d19-4cd6-a8a5-be845a85c5aa");
                        DownloadManager.Request request30 = new DownloadManager.Request(uri30);
                        request30.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference30 = dm.enqueue(request30);
                        break;
                    case 31:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri31 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Web%20technology.pdf?alt=media&token=0b4f87e6-934d-48c1-9100-ffaff423fdb8");
                        DownloadManager.Request request31 = new DownloadManager.Request(uri31);
                        request31.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference31 = dm.enqueue(request31);
                        break;
                    case 32:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri32 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Design%20and%20algorithm.pdf?alt=media&token=9c8a5553-413d-4403-ba67-5bc4f33e14ca");
                        DownloadManager.Request request32 = new DownloadManager.Request(uri32);
                        request32.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference32 = dm.enqueue(request32);
                        break;
                    case 33:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri33 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Computer%20design%20Architech.pdf?alt=media&token=455c2dd9-52cd-462d-9553-ce78d13daec8");
                        DownloadManager.Request request33 = new DownloadManager.Request(uri33);
                        request33.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference33 = dm.enqueue(request33);
                        break;
                    case 34:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri34 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Operatiing%20System.pdf?alt=media&token=31cf40a9-1157-441b-9cc7-3a001f56c1df");
                        DownloadManager.Request request34 = new DownloadManager.Request(uri34);
                        request34.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference34 = dm.enqueue(request34);
                        break;
                    case 35:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri35 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Power%20plant%20engineering.pdf?alt=media&token=66f348a4-72de-4e69-8f33-62ccf56da131");
                        DownloadManager.Request request35 = new DownloadManager.Request(uri35);
                        request35.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference35 = dm.enqueue(request35);
                        break;
                    case 36:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri36 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Power%20plant%20engineering%202.pdf?alt=media&token=1f7b1ac9-7a7f-4e21-b152-b110779aa657");
                        DownloadManager.Request request36 = new DownloadManager.Request(uri36);
                        request36.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference36 = dm.enqueue(request36);
                        break;
                    case 37:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri37 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Power%20plant%20engineering%203.pdf?alt=media&token=a5336f73-65f8-4763-8608-1c8a6524f4ac");
                        DownloadManager.Request request37 = new DownloadManager.Request(uri37);
                        request37.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference37 = dm.enqueue(request37);
                        break;
                    case 38:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri38 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Power%20plant%20engineering%204.pdf?alt=media&token=6a371366-d04c-4d46-8f5e-6c3414dbfd19");
                        DownloadManager.Request request38 = new DownloadManager.Request(uri38);
                        request38.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference38 = dm.enqueue(request38);
                        break;
                    case 39:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri39 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Power%20plant%20engineering%205.pdf?alt=media&token=27e6501d-02a8-4819-8df5-550f1e4f79bc");
                        DownloadManager.Request request39 = new DownloadManager.Request(uri39);
                        request39.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference39 = dm.enqueue(request39);
                        break;
                    case 40:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri40 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Database%20and%20structure%201.pdf?alt=media&token=95f2b4f2-5e13-4cf9-ae93-17f66e75dcb5");
                        DownloadManager.Request request40 = new DownloadManager.Request(uri40);
                        request40.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference40 = dm.enqueue(request40);
                        break;
                    case 41:

                        dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri41 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/Database%20and%20structure%202.pdf?alt=media&token=947730be-94e1-4c34-8cd2-7359579f32e6");
                        DownloadManager.Request request41 = new DownloadManager.Request(uri41);
                        request41.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference41 = dm.enqueue(request41);
                        break;
                    case 42:

                                dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri42 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-dtu.appspot.com/o/OOPS.pdf?alt=media&token=b12d32b9-f32b-480f-a2b2-0a89f5c7e496");
                        DownloadManager.Request request42 = new DownloadManager.Request(uri42);
                        request42.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        Long reference42 = dm.enqueue(request42);
                        break;

                }



            }
        });
    }


}


