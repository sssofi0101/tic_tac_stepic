package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.TableLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here
        var all_zeros_count: Int = 0
        var all_crosses_count: Int = 0

        fun getResult() {
            if ((all_zeros_count > all_crosses_count + 1) or (all_crosses_count > all_zeros_count + 1)) {
                status.text = "Invalid"
            } else {
                var oWon: Boolean = false
                var xWon: Boolean = false
                if ((spinner11.selectedItem != "") and (spinner12.selectedItem != "") and
                    (spinner13.selectedItem != "") and (spinner21.selectedItem != "") and
                    (spinner22.selectedItem != "") and (spinner23.selectedItem != "") and
                    (spinner31.selectedItem != "") and (spinner32.selectedItem != "")
                    and (spinner33.selectedItem != "")
                ) {
                    if ((spinner11.selectedItem == "0") and (spinner12.selectedItem == "0")
                        and (spinner13.selectedItem == "0")
                    ) {
                        status.text = "0 won"
                        oWon = true
                    } else {
                        if ((spinner21.selectedItem == "0") and (spinner22.selectedItem == "0")
                            and (spinner23.selectedItem == "0")
                        ) {
                            status.text = "0 won"
                            oWon = true
                        } else {
                            if ((spinner31.selectedItem == "0") and (spinner32.selectedItem == "0")
                                and (spinner33.selectedItem == "0")
                            ) {
                                status.text = "0 won"
                                oWon = true
                            } else {
                                if ((spinner11.selectedItem == "0") and (spinner21.selectedItem == "0")
                                    and (spinner31.selectedItem == "0")
                                ) {
                                    status.text = "0 won"
                                    oWon = true
                                } else {
                                    if ((spinner12.selectedItem == "0") and (spinner22.selectedItem == "0")
                                        and (spinner32.selectedItem == "0")
                                    ) {
                                        status.text = "0 won"
                                        oWon = true
                                    } else {
                                        if ((spinner13.selectedItem == "0") and (spinner23.selectedItem == "0")
                                            and (spinner33.selectedItem == "0")
                                        ) {
                                            status.text = "0 won"
                                            oWon = true
                                        } else {
                                            if ((spinner11.selectedItem == "0") and (spinner22.selectedItem == "0")
                                                and (spinner33.selectedItem == "0")
                                            ) {
                                                status.text = "0 won"
                                                oWon = true
                                            } else {
                                                if ((spinner31.selectedItem == "0") and (spinner22.selectedItem == "0")
                                                    and (spinner13.selectedItem == "0")
                                                ) {
                                                    status.text = "0 won"
                                                    oWon = true
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
                else{status.text = ""
                return}
                if ((spinner11.selectedItem != "") and (spinner12.selectedItem != "") and
                    (spinner13.selectedItem != "") and (spinner21.selectedItem != "") and
                    (spinner22.selectedItem != "") and (spinner23.selectedItem != "") and
                    (spinner31.selectedItem != "") and (spinner32.selectedItem != "")
                    and (spinner33.selectedItem != "")
                ) {
                    if ((spinner11.selectedItem == "X") and (spinner12.selectedItem == "X")
                        and (spinner13.selectedItem == "X")
                    ) {
                        status.text = "X won"
                        xWon = true
                    } else {
                        if ((spinner21.selectedItem == "X") and (spinner22.selectedItem == "X")
                            and (spinner23.selectedItem == "X")
                        ) {
                            status.text = "X won"
                            xWon = true
                        } else {
                            if ((spinner31.selectedItem == "X") and (spinner32.selectedItem == "X")
                                and (spinner33.selectedItem == "X")
                            ) {
                                status.text = "X won"
                                xWon = true
                            } else {
                                if ((spinner11.selectedItem == "X") and (spinner21.selectedItem == "X")
                                    and (spinner31.selectedItem == "X")
                                ) {
                                    status.text = "X won"
                                    xWon = true
                                } else {
                                    if ((spinner12.selectedItem == "X") and (spinner22.selectedItem == "X")
                                        and (spinner32.selectedItem == "X")
                                    ) {
                                        status.text = "X won"
                                        xWon = true
                                    } else {
                                        if ((spinner13.selectedItem == "X") and (spinner23.selectedItem == "X")
                                            and (spinner33.selectedItem == "X")
                                        ) {
                                            status.text = "X won"
                                            xWon = true
                                        } else {
                                            if ((spinner11.selectedItem == "X") and (spinner22.selectedItem == "X")
                                                and (spinner33.selectedItem == "X")
                                            ) {
                                                status.text = "X won"
                                                xWon = true
                                            } else {
                                                if ((spinner31.selectedItem == "X") and (spinner22.selectedItem == "X")
                                                    and (spinner13.selectedItem == "X")
                                                ) {
                                                    status.text = "X won"
                                                    xWon = true
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else{ status.text = ""
                    return}
                if (((xWon==true) and (oWon==true)) or ((xWon==false)and(oWon==false))){
                    status.text="Draw"
                }
            }
        }

        spinner11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        spinner12.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
        spinner13.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        spinner21.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        spinner22.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        spinner23.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        spinner31.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        spinner32.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        spinner33.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position == 1) {
                    all_zeros_count += 1
                }
                else {
                    if (position == 2) {
                        all_crosses_count += 1
                    }
                }
                getResult()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}
