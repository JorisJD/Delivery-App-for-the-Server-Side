package com.example.sirojiddinjumaev.niholeatitserver.Service;

import com.example.sirojiddinjumaev.niholeatitserver.Common.Common;
import com.example.sirojiddinjumaev.niholeatitserver.Model.Token;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateToServer(refreshedToken);

    }

    private void updateToServer(String refreshedToken) {

        //Copy Code from Client Side
        if (Common.currentUser != null)
        {
            FirebaseDatabase db = FirebaseDatabase.getInstance();
            DatabaseReference tokens = db.getReference("Tokens");
            Token data = new Token(refreshedToken, true); //true because this token send from Server side
            tokens.child(Common.currentUser.getPhone()).setValue(data);

        }



    }
}
