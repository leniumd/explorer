/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VotingRound implements Serializable {

    private static final long serialVersionUID = 488472101;

    private UInteger  id;
    private UInteger  day;
    private UInteger  month;
    private UInteger  year;
    private UInteger  round;
    private Timestamp startDate;
    private Timestamp endDate;
    private Timestamp syncStart;
    private Timestamp syncEnd;
    private ULong     voteCount;

    public VotingRound() {}

    public VotingRound(VotingRound value) {
        this.id = value.id;
        this.day = value.day;
        this.month = value.month;
        this.year = value.year;
        this.round = value.round;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.syncStart = value.syncStart;
        this.syncEnd = value.syncEnd;
        this.voteCount = value.voteCount;
    }

    public VotingRound(
        UInteger  id,
        UInteger  day,
        UInteger  month,
        UInteger  year,
        UInteger  round,
        Timestamp startDate,
        Timestamp endDate,
        Timestamp syncStart,
        Timestamp syncEnd,
        ULong     voteCount
    ) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.round = round;
        this.startDate = startDate;
        this.endDate = endDate;
        this.syncStart = syncStart;
        this.syncEnd = syncEnd;
        this.voteCount = voteCount;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getDay() {
        return this.day;
    }

    public void setDay(UInteger day) {
        this.day = day;
    }

    public UInteger getMonth() {
        return this.month;
    }

    public void setMonth(UInteger month) {
        this.month = month;
    }

    public UInteger getYear() {
        return this.year;
    }

    public void setYear(UInteger year) {
        this.year = year;
    }

    public UInteger getRound() {
        return this.round;
    }

    public void setRound(UInteger round) {
        this.round = round;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getSyncStart() {
        return this.syncStart;
    }

    public void setSyncStart(Timestamp syncStart) {
        this.syncStart = syncStart;
    }

    public Timestamp getSyncEnd() {
        return this.syncEnd;
    }

    public void setSyncEnd(Timestamp syncEnd) {
        this.syncEnd = syncEnd;
    }

    public ULong getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(ULong voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VotingRound (");

        sb.append(id);
        sb.append(", ").append(day);
        sb.append(", ").append(month);
        sb.append(", ").append(year);
        sb.append(", ").append(round);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(syncStart);
        sb.append(", ").append(syncEnd);
        sb.append(", ").append(voteCount);

        sb.append(")");
        return sb.toString();
    }
}