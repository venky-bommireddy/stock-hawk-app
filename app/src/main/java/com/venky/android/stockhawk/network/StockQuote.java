/*
 * Copyright 2016.  venky-bommireddy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.venky.android.stockhawk.network;

import com.google.gson.annotations.SerializedName;

/**
 * Created by venky-bommireddy on 4/10/16.
 * <p/>
 * For storing response from Yahoo API.
 */
@SuppressWarnings("unused")
public class StockQuote {

    @SerializedName("Change")
    private String mChange;

    @SerializedName("symbol")
    private String mSymbol;

    @SerializedName("Name")
    private String mName;

    @SerializedName("Bid")
    private String mBid;

    @SerializedName("ChangeinPercent")
    private String mChangeInPercent;

    public String getChange() {
        return mChange;
    }

    public String getBid() {
        return mBid;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public String getChangeInPercent() {
        return mChangeInPercent;
    }

    public String getName() {
        return mName;
    }
}
