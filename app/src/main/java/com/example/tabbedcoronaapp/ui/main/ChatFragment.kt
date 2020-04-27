package com.example.tabbedcoronaapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabbedcoronaapp.CustomAdapter
import com.example.tabbedcoronaapp.Item

import com.example.tabbedcoronaapp.R
import kotlinx.android.synthetic.main.fragment_chat.*


/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        create an array that will inflate the layout
        val chats : ArrayList<Item> = ArrayList()

        chats.add(Item(R.drawable.usertwo,"John Doe", "Programming is awesome", "11:00am"))
        chats.add(Item(R.drawable.usertwo,"Winstone Geek", "Do you have a php book?", "12:00pm"))
        chats.add(Item(R.drawable.usertwo,"Allan Coder", "Did you checkout react js", "3:40pm"))
        chats.add(Item(R.drawable.usertwo,"Babe", "Yes, Niko quarantine", "11:00am"))
        chats.add(Item(R.drawable.usertwo,"Landlord", "Nitapata rent yangu lini ?", "11:00am"))
        chats.add(Item(R.drawable.usertwo,"Dad", "I need you to talk to your younger brother", "11:00am"))
        chats.add(Item(R.drawable.userthree, "Paul Show" ,"I received the package", "11:00"))
        chats.add(Item(R.drawable.userfour, "Albert Einstns" ,"I would love to meet her", "2:00"))
        chats.add(Item(R.drawable.userfive, "Mike Swizz" ,"30 days of code is awesome", "9:40"))
        chats.add(Item(R.drawable.userseven, "Steve Jobs" ,"Love what you do", "11:43"))
        chats.add(Item(R.drawable.userthree, "Steve Wozniack" ,"Everyone shoule learn computer", "12:03"))
        chats.add(Item(R.drawable.usertwo, "Antony Injila" ,"Learner n developer", "15:43"))
        chats.add(Item(R.drawable.userseven, "Robert Tesla" ,"Corona hit us hard", "13:43"))

        chatList.adapter = this@ChatFragment.context?.let{
            CustomAdapter(
                it, chats
            )
        }

        super.onViewCreated(view, savedInstanceState)
    }
}
