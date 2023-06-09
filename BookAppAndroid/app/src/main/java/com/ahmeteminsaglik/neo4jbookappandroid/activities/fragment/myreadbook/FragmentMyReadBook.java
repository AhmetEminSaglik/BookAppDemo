package com.ahmeteminsaglik.neo4jbookappandroid.activities.fragment.myreadbook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmeteminsaglik.neo4jbookappandroid.R;
import com.ahmeteminsaglik.neo4jbookappandroid.activities.fragment.myreadbook.adapter.BookRVAdapter;
import com.ahmeteminsaglik.neo4jbookappandroid.activities.fragment.myreadbook.adapter.MyReadBookPageBookRVAdapter;
import com.ahmeteminsaglik.neo4jbookappandroid.model.Book;
import com.ahmeteminsaglik.neo4jbookappandroid.model.EnumRecommendReason;
import com.ahmeteminsaglik.neo4jbookappandroid.model.RecommendedBook;

import java.util.ArrayList;
import java.util.List;

public class FragmentMyReadBook extends Fragment {
    private final AppCompatActivity activity;
    private RecyclerView rv;
    public BookRVAdapter adapter;
//    Fragment fragment;

    /*public FragmentMyReadBook(*//*Fragment fragment,*//* AppCompatActivity activity) {
        this.fragment = fragment;
        this.activity = activity;
    }*/

    public FragmentMyReadBook(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.standart_fragment_layout, container, false); // is used to connect desing in layout
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        createRecycleView(view);
        List<Book> bookList = getReadBookList();
//        List<RecommendedBook> recommendedBookList = convertBookListToRecommedBookList(bookList);
        adapter = new MyReadBookPageBookRVAdapter(activity, bookList);//new BookRVAdapter(fragment, activity, recommendedBookList);
        rv.setAdapter(adapter);
    }

    private void createRecycleView(View view) {
        rv = view.findViewById(R.id.standardRecyleView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }

    private List<Book> getReadBookList() {
        FragmentMyReadBookProcess fragmentMyReadBookProcess = new FragmentMyReadBookProcess(activity.getApplicationContext());
        List<Book> bookList = fragmentMyReadBookProcess.getReadBookList();
        return bookList;
    }

    private List<RecommendedBook> convertBookListToRecommedBookList(List<Book> bookList) {
        List<RecommendedBook> recommendedBookList = new ArrayList<>();
        for (Book book : bookList) {
            String recommendReason = EnumRecommendReason.No_Recommend.getName();
            RecommendedBook recBook = new RecommendedBook(book, recommendReason);
            recommendedBookList.add(recBook);
        }
        return recommendedBookList;
    }
}
