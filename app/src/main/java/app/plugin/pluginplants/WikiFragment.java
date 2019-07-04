package app.plugin.pluginplants;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WikiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_wiki, container, false);
        View rootView = inflater.inflate(R.layout.fragment_wiki, container, false);
        return rootView;
    }

    public void pindahDetail(View view){
        Intent intent = new Intent(getActivity(), DetailWikiActivity.class);
        getActivity().startActivity(intent);
    }
}
