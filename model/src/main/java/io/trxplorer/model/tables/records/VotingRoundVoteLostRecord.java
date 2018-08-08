/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.VotingRoundVoteLost;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class VotingRoundVoteLostRecord extends UpdatableRecordImpl<VotingRoundVoteLostRecord> implements Record6<ULong, UInteger, String, String, ULong, Timestamp> {

    private static final long serialVersionUID = -1971935816;

    /**
     * Setter for <code>tmp.voting_round_vote_lost.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.voting_round_vote_lost.voting_round_id</code>.
     */
    public void setVotingRoundId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.voting_round_id</code>.
     */
    public UInteger getVotingRoundId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>tmp.voting_round_vote_lost.owner_address</code>.
     */
    public void setOwnerAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.owner_address</code>.
     */
    public String getOwnerAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmp.voting_round_vote_lost.vote_address</code>.
     */
    public void setVoteAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.vote_address</code>.
     */
    public String getVoteAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tmp.voting_round_vote_lost.vote_count</code>.
     */
    public void setVoteCount(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.vote_count</code>.
     */
    public ULong getVoteCount() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>tmp.voting_round_vote_lost.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.voting_round_vote_lost.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, UInteger, String, String, ULong, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, UInteger, String, String, ULong, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTING_ROUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.OWNER_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.VOTE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getVotingRoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOwnerAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVoteAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getVoteCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value2(UInteger value) {
        setVotingRoundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value3(String value) {
        setOwnerAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value4(String value) {
        setVoteAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value5(ULong value) {
        setVoteCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord value6(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VotingRoundVoteLostRecord values(ULong value1, UInteger value2, String value3, String value4, ULong value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VotingRoundVoteLostRecord
     */
    public VotingRoundVoteLostRecord() {
        super(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST);
    }

    /**
     * Create a detached, initialised VotingRoundVoteLostRecord
     */
    public VotingRoundVoteLostRecord(ULong id, UInteger votingRoundId, String ownerAddress, String voteAddress, ULong voteCount, Timestamp timestamp) {
        super(VotingRoundVoteLost.VOTING_ROUND_VOTE_LOST);

        set(0, id);
        set(1, votingRoundId);
        set(2, ownerAddress);
        set(3, voteAddress);
        set(4, voteCount);
        set(5, timestamp);
    }
}