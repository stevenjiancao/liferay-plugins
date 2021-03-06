/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.model.impl;

import com.liferay.opensocial.model.OAuthToken;
import com.liferay.opensocial.model.OAuthTokenModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the OAuthToken service. Represents a row in the &quot;OpenSocial_OAuthToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.opensocial.model.OAuthTokenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OAuthTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenImpl
 * @see com.liferay.opensocial.model.OAuthToken
 * @see com.liferay.opensocial.model.OAuthTokenModel
 * @generated
 */
public class OAuthTokenModelImpl extends BaseModelImpl<OAuthToken>
	implements OAuthTokenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o auth token model instance should use the {@link com.liferay.opensocial.model.OAuthToken} interface instead.
	 */
	public static final String TABLE_NAME = "OpenSocial_OAuthToken";
	public static final Object[][] TABLE_COLUMNS = {
			{ "oAuthTokenId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "gadgetKey", Types.VARCHAR },
			{ "serviceName", Types.VARCHAR },
			{ "moduleId", Types.BIGINT },
			{ "accessToken", Types.VARCHAR },
			{ "tokenName", Types.VARCHAR },
			{ "tokenSecret", Types.VARCHAR },
			{ "sessionHandle", Types.VARCHAR },
			{ "expiration", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table OpenSocial_OAuthToken (oAuthTokenId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,gadgetKey VARCHAR(75) null,serviceName VARCHAR(75) null,moduleId LONG,accessToken VARCHAR(75) null,tokenName VARCHAR(75) null,tokenSecret VARCHAR(75) null,sessionHandle VARCHAR(75) null,expiration LONG)";
	public static final String TABLE_SQL_DROP = "drop table OpenSocial_OAuthToken";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.opensocial.model.OAuthToken"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.opensocial.model.OAuthToken"),
			true);

	public Class<?> getModelClass() {
		return OAuthToken.class;
	}

	public String getModelClassName() {
		return OAuthToken.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.opensocial.model.OAuthToken"));

	public OAuthTokenModelImpl() {
	}

	public long getPrimaryKey() {
		return _oAuthTokenId;
	}

	public void setPrimaryKey(long primaryKey) {
		setOAuthTokenId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_oAuthTokenId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getOAuthTokenId() {
		return _oAuthTokenId;
	}

	public void setOAuthTokenId(long oAuthTokenId) {
		_oAuthTokenId = oAuthTokenId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getGadgetKey() {
		if (_gadgetKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _gadgetKey;
		}
	}

	public void setGadgetKey(String gadgetKey) {
		if (_originalGadgetKey == null) {
			_originalGadgetKey = _gadgetKey;
		}

		_gadgetKey = gadgetKey;
	}

	public String getOriginalGadgetKey() {
		return GetterUtil.getString(_originalGadgetKey);
	}

	public String getServiceName() {
		if (_serviceName == null) {
			return StringPool.BLANK;
		}
		else {
			return _serviceName;
		}
	}

	public void setServiceName(String serviceName) {
		if (_originalServiceName == null) {
			_originalServiceName = _serviceName;
		}

		_serviceName = serviceName;
	}

	public String getOriginalServiceName() {
		return GetterUtil.getString(_originalServiceName);
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		if (!_setOriginalModuleId) {
			_setOriginalModuleId = true;

			_originalModuleId = _moduleId;
		}

		_moduleId = moduleId;
	}

	public long getOriginalModuleId() {
		return _originalModuleId;
	}

	public String getAccessToken() {
		if (_accessToken == null) {
			return StringPool.BLANK;
		}
		else {
			return _accessToken;
		}
	}

	public void setAccessToken(String accessToken) {
		_accessToken = accessToken;
	}

	public String getTokenName() {
		if (_tokenName == null) {
			return StringPool.BLANK;
		}
		else {
			return _tokenName;
		}
	}

	public void setTokenName(String tokenName) {
		if (_originalTokenName == null) {
			_originalTokenName = _tokenName;
		}

		_tokenName = tokenName;
	}

	public String getOriginalTokenName() {
		return GetterUtil.getString(_originalTokenName);
	}

	public String getTokenSecret() {
		if (_tokenSecret == null) {
			return StringPool.BLANK;
		}
		else {
			return _tokenSecret;
		}
	}

	public void setTokenSecret(String tokenSecret) {
		_tokenSecret = tokenSecret;
	}

	public String getSessionHandle() {
		if (_sessionHandle == null) {
			return StringPool.BLANK;
		}
		else {
			return _sessionHandle;
		}
	}

	public void setSessionHandle(String sessionHandle) {
		_sessionHandle = sessionHandle;
	}

	public long getExpiration() {
		return _expiration;
	}

	public void setExpiration(long expiration) {
		_expiration = expiration;
	}

	@Override
	public OAuthToken toEscapedModel() {
		if (isEscapedModel()) {
			return (OAuthToken)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (OAuthToken)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					OAuthToken.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		OAuthTokenImpl oAuthTokenImpl = new OAuthTokenImpl();

		oAuthTokenImpl.setOAuthTokenId(getOAuthTokenId());
		oAuthTokenImpl.setCompanyId(getCompanyId());
		oAuthTokenImpl.setUserId(getUserId());
		oAuthTokenImpl.setUserName(getUserName());
		oAuthTokenImpl.setCreateDate(getCreateDate());
		oAuthTokenImpl.setModifiedDate(getModifiedDate());
		oAuthTokenImpl.setGadgetKey(getGadgetKey());
		oAuthTokenImpl.setServiceName(getServiceName());
		oAuthTokenImpl.setModuleId(getModuleId());
		oAuthTokenImpl.setAccessToken(getAccessToken());
		oAuthTokenImpl.setTokenName(getTokenName());
		oAuthTokenImpl.setTokenSecret(getTokenSecret());
		oAuthTokenImpl.setSessionHandle(getSessionHandle());
		oAuthTokenImpl.setExpiration(getExpiration());

		oAuthTokenImpl.resetOriginalValues();

		return oAuthTokenImpl;
	}

	public int compareTo(OAuthToken oAuthToken) {
		long primaryKey = oAuthToken.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		OAuthToken oAuthToken = null;

		try {
			oAuthToken = (OAuthToken)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = oAuthToken.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		OAuthTokenModelImpl oAuthTokenModelImpl = this;

		oAuthTokenModelImpl._originalUserId = oAuthTokenModelImpl._userId;

		oAuthTokenModelImpl._setOriginalUserId = false;

		oAuthTokenModelImpl._originalGadgetKey = oAuthTokenModelImpl._gadgetKey;

		oAuthTokenModelImpl._originalServiceName = oAuthTokenModelImpl._serviceName;

		oAuthTokenModelImpl._originalModuleId = oAuthTokenModelImpl._moduleId;

		oAuthTokenModelImpl._setOriginalModuleId = false;

		oAuthTokenModelImpl._originalTokenName = oAuthTokenModelImpl._tokenName;
	}

	@Override
	public CacheModel<OAuthToken> toCacheModel() {
		OAuthTokenCacheModel oAuthTokenCacheModel = new OAuthTokenCacheModel();

		oAuthTokenCacheModel.oAuthTokenId = getOAuthTokenId();

		oAuthTokenCacheModel.companyId = getCompanyId();

		oAuthTokenCacheModel.userId = getUserId();

		oAuthTokenCacheModel.userName = getUserName();

		String userName = oAuthTokenCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			oAuthTokenCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			oAuthTokenCacheModel.createDate = createDate.getTime();
		}
		else {
			oAuthTokenCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			oAuthTokenCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			oAuthTokenCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		oAuthTokenCacheModel.gadgetKey = getGadgetKey();

		String gadgetKey = oAuthTokenCacheModel.gadgetKey;

		if ((gadgetKey != null) && (gadgetKey.length() == 0)) {
			oAuthTokenCacheModel.gadgetKey = null;
		}

		oAuthTokenCacheModel.serviceName = getServiceName();

		String serviceName = oAuthTokenCacheModel.serviceName;

		if ((serviceName != null) && (serviceName.length() == 0)) {
			oAuthTokenCacheModel.serviceName = null;
		}

		oAuthTokenCacheModel.moduleId = getModuleId();

		oAuthTokenCacheModel.accessToken = getAccessToken();

		String accessToken = oAuthTokenCacheModel.accessToken;

		if ((accessToken != null) && (accessToken.length() == 0)) {
			oAuthTokenCacheModel.accessToken = null;
		}

		oAuthTokenCacheModel.tokenName = getTokenName();

		String tokenName = oAuthTokenCacheModel.tokenName;

		if ((tokenName != null) && (tokenName.length() == 0)) {
			oAuthTokenCacheModel.tokenName = null;
		}

		oAuthTokenCacheModel.tokenSecret = getTokenSecret();

		String tokenSecret = oAuthTokenCacheModel.tokenSecret;

		if ((tokenSecret != null) && (tokenSecret.length() == 0)) {
			oAuthTokenCacheModel.tokenSecret = null;
		}

		oAuthTokenCacheModel.sessionHandle = getSessionHandle();

		String sessionHandle = oAuthTokenCacheModel.sessionHandle;

		if ((sessionHandle != null) && (sessionHandle.length() == 0)) {
			oAuthTokenCacheModel.sessionHandle = null;
		}

		oAuthTokenCacheModel.expiration = getExpiration();

		return oAuthTokenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{oAuthTokenId=");
		sb.append(getOAuthTokenId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", gadgetKey=");
		sb.append(getGadgetKey());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", moduleId=");
		sb.append(getModuleId());
		sb.append(", accessToken=");
		sb.append(getAccessToken());
		sb.append(", tokenName=");
		sb.append(getTokenName());
		sb.append(", tokenSecret=");
		sb.append(getTokenSecret());
		sb.append(", sessionHandle=");
		sb.append(getSessionHandle());
		sb.append(", expiration=");
		sb.append(getExpiration());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.opensocial.model.OAuthToken");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oAuthTokenId</column-name><column-value><![CDATA[");
		sb.append(getOAuthTokenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gadgetKey</column-name><column-value><![CDATA[");
		sb.append(getGadgetKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moduleId</column-name><column-value><![CDATA[");
		sb.append(getModuleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessToken</column-name><column-value><![CDATA[");
		sb.append(getAccessToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenName</column-name><column-value><![CDATA[");
		sb.append(getTokenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenSecret</column-name><column-value><![CDATA[");
		sb.append(getTokenSecret());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionHandle</column-name><column-value><![CDATA[");
		sb.append(getSessionHandle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiration</column-name><column-value><![CDATA[");
		sb.append(getExpiration());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = OAuthToken.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			OAuthToken.class
		};
	private long _oAuthTokenId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _gadgetKey;
	private String _originalGadgetKey;
	private String _serviceName;
	private String _originalServiceName;
	private long _moduleId;
	private long _originalModuleId;
	private boolean _setOriginalModuleId;
	private String _accessToken;
	private String _tokenName;
	private String _originalTokenName;
	private String _tokenSecret;
	private String _sessionHandle;
	private long _expiration;
	private transient ExpandoBridge _expandoBridge;
	private OAuthToken _escapedModelProxy;
}