/*
 The MIT License (MIT)
 
 Copyright (c) 2013, 2014 by ggbusto@gmx.com

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package org.noo4j.core;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;

public class BtcTransactionTemplate implements Serializable {
	private static final long serialVersionUID = 691792420399697789L;
	private String data = "";
	private long[] depends = new long[] {};
	private BigDecimal fee = BigDecimal.ZERO;
	private String hash = "";
	private boolean required = false;
	private long signatureOperations = 0;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = BtcUtil.notNull(data);
	}

	public long[] getDepends() {
		return depends;
	}

	public void setDepends(long[] depends) {
		this.depends = BtcUtil.notNull(depends);
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = BtcUtil.notNull(fee);
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = BtcUtil.notNull(hash);
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public long getSignatureOperations() {
		return signatureOperations;
	}

	public void setSignatureOperations(long signatureOperations) {
		this.signatureOperations = signatureOperations;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BtcTransactionTemplate [data=");
		builder.append(data);
		builder.append(", depends=");
		builder.append(Arrays.toString(depends));
		builder.append(", fee=");
		builder.append(fee);
		builder.append(", hash=");
		builder.append(hash);
		builder.append(", required=");
		builder.append(required);
		builder.append(", signatureOperations=");
		builder.append(signatureOperations);
		builder.append("]");
		return builder.toString();
	}
}
