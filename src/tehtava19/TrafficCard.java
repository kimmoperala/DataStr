/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava19;

import java.util.*;

/**
 *
 * @author kamaj, Kimmo Perälä
 */
public class TrafficCard implements Comparable<Object> {
    int mTravellerNumber;
    String mOwnerName;
    float mBalance;
    
    public TrafficCard(int tNumber, String oName, float balance){
        mTravellerNumber = tNumber;
        mOwnerName = oName;
        mBalance = balance;
    }
    
    @Override
    public int compareTo(Object obj) {
    	TrafficCard tc = (TrafficCard) obj;
    	if (mTravellerNumber == tc.mTravellerNumber) {
    		return 0;
    	}
    	else if (mTravellerNumber > tc.mTravellerNumber) {
    		return 1;
    	}
    	else {
    		return -1;
    	}
    }
    
    @Override
    public String toString(){
        return "owner: "+mOwnerName+" number: "+mTravellerNumber+" balance: "+mBalance;
    }
}
