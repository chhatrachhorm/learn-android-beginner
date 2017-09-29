package chhatrachhorm.onenterprise.iout.mediaplayer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    private boolean pauseBtnState = false;
    public MainFragment() {
        // Required empty public constructor
    }

    private PlayerListener playerListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_main, container, false);;
        playerListener = (PlayerListener) getActivity();
        mView.findViewById(R.id.frag_main_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerListener.onSongListBtnClick();
            }
        });
        final ImageButton PausePlay =mView.findViewById(R.id.frag_main_play_pause);
        PausePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!pauseBtnState){
                    playerListener.onPlayBtnClick();
                    pauseBtnState = true;
                    PausePlay.setImageResource(android.R.drawable.ic_media_pause);
                }
                else {
                    playerListener.onPauseBtnClick();
                    pauseBtnState = false;
                    PausePlay.setImageResource(android.R.drawable.ic_media_play);
                }
            }
        });
        return mView;
    }

}
