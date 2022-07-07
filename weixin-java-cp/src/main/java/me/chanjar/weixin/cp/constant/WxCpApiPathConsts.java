package me.chanjar.weixin.cp.constant;


/**
 * <pre>
 *  企业微信api地址常量类
 *  Created by BinaryWang on 2019-06-02.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
public interface WxCpApiPathConsts {
  String DEFAULT_CP_BASE_URL = "https://qyapi.weixin.qq.com";

  String GET_JSAPI_TICKET = "/cgi-bin/get_jsapi_ticket";
  String GET_AGENT_CONFIG_TICKET = "/cgi-bin/ticket/get?&type=agent_config";
  String GET_CALLBACK_IP = "/cgi-bin/getcallbackip";
  String BATCH_REPLACE_PARTY = "/cgi-bin/batch/replaceparty";
  String BATCH_SYNC_USER = "/cgi-bin/batch/syncuser";
  String BATCH_REPLACE_USER = "/cgi-bin/batch/replaceuser";
  String BATCH_GET_RESULT = "/cgi-bin/batch/getresult?jobid=";
  String JSCODE_TO_SESSION = "/cgi-bin/miniprogram/jscode2session";
  String GET_TOKEN = "/cgi-bin/gettoken?corpid=%s&corpsecret=%s";
  String WEBHOOK_SEND = "/cgi-bin/webhook/send?key=";

  /**
   * 消息推送相关接口
   * https://work.weixin.qq.com/api/doc/90000/90135/90235
   */
  interface Message {

    /**
     * 发送应用消息
     */
    String MESSAGE_SEND = "/cgi-bin/message/send";

    /**
     * 查询应用消息发送统计
     */
    String GET_STATISTICS = "/cgi-bin/message/get_statistics";

    /**
     * 互联企业发送应用消息
     * https://developer.work.weixin.qq.com/document/path/90250
     */
    String LINKEDCORP_MESSAGE_SEND = "/cgi-bin/linkedcorp/message/send";

    /**
     * 发送「学校通知」
     * https://developer.work.weixin.qq.com/document/path/92321
     */
    String EXTERNAL_CONTACT_MESSAGE_SEND = "/cgi-bin/externalcontact/message/send";

  }

  interface Agent {
    String AGENT_GET = "/cgi-bin/agent/get?agentid=%d";
    String AGENT_SET = "/cgi-bin/agent/set";
    String AGENT_LIST = "/cgi-bin/agent/list";
  }

  interface WorkBench {
    String WORKBENCH_TEMPLATE_SET = "/cgi-bin/agent/set_workbench_template";
    String WORKBENCH_TEMPLATE_GET = "/cgi-bin/agent/get_workbench_template";
    String WORKBENCH_DATA_SET = "/cgi-bin/agent/set_workbench_data";
  }

  interface OAuth2 {
    String GET_USER_INFO = "/cgi-bin/user/getuserinfo?code=%s&agentid=%d";
    String GET_USER_DETAIL = "/cgi-bin/user/getuserdetail";
    String URL_OAUTH2_AUTHORIZE = "https://open.weixin.qq.com/connect/oauth2/authorize";
  }

  interface Chat {
    String APPCHAT_CREATE = "/cgi-bin/appchat/create";
    String APPCHAT_UPDATE = "/cgi-bin/appchat/update";
    String APPCHAT_GET_CHATID = "/cgi-bin/appchat/get?chatid=";
    String APPCHAT_SEND = "/cgi-bin/appchat/send";
  }

  interface Department {
    String DEPARTMENT_CREATE = "/cgi-bin/department/create";
    String DEPARTMENT_UPDATE = "/cgi-bin/department/update";
    String DEPARTMENT_GET = "/cgi-bin/department/get?id=%d";
    String DEPARTMENT_DELETE = "/cgi-bin/department/delete?id=%d";
    String DEPARTMENT_LIST = "/cgi-bin/department/list";
    String DEPARTMENT_SIMPLE_LIST = "/cgi-bin/department/simplelist";
  }

  interface Media {
    String MEDIA_GET = "/cgi-bin/media/get";
    String MEDIA_UPLOAD = "/cgi-bin/media/upload?type=";
    String IMG_UPLOAD = "/cgi-bin/media/uploadimg";
    String JSSDK_MEDIA_GET = "/cgi-bin/media/get/jssdk";
  }

  interface Menu {
    String MENU_CREATE = "/cgi-bin/menu/create?agentid=%d";
    String MENU_DELETE = "/cgi-bin/menu/delete?agentid=%d";
    String MENU_GET = "/cgi-bin/menu/get?agentid=%d";
  }

  interface Oa {
    /**
     * 打卡
     * https://developer.work.weixin.qq.com/document/path/94204
     */
    String GET_CORP_CHECKIN_OPTION = "/cgi-bin/checkin/getcorpcheckinoption";
    String GET_CHECKIN_DATA = "/cgi-bin/checkin/getcheckindata";
    String GET_CHECKIN_OPTION = "/cgi-bin/checkin/getcheckinoption";
    String GET_CHECKIN_DAY_DATA = "/cgi-bin/checkin/getcheckin_daydata";
    String GET_CHECKIN_MONTH_DATA = "/cgi-bin/checkin/getcheckin_monthdata";
    String GET_CHECKIN_SCHEDULE_DATA = "/cgi-bin/checkin/getcheckinschedulist";
    String SET_CHECKIN_SCHEDULE_DATA = "/cgi-bin/checkin/setcheckinschedulist";
    String ADD_CHECK_IN_USER_FACE = "/cgi-bin/checkin/addcheckinuserface";

    /**
     * 审批
     * https://developer.work.weixin.qq.com/document/path/91956
     */
    String COPY_TEMPLATE = "/cgi-bin/oa/approval/copytemplate";
    String GET_TEMPLATE_DETAIL = "/cgi-bin/oa/gettemplatedetail";
    String APPLY_EVENT = "/cgi-bin/oa/applyevent";
    String GET_APPROVAL_INFO = "/cgi-bin/oa/getapprovalinfo";
    String GET_APPROVAL_DETAIL = "/cgi-bin/oa/getapprovaldetail";
    String GET_APPROVAL_DATA = "/cgi-bin/oa/getapprovaldata";

    String GET_CORP_CONF = "/cgi-bin/oa/vacation/getcorpconf";
    String GET_USER_VACATION_QUOTA = "/cgi-bin/oa/vacation/getuservacationquota";
    String SET_ONE_USER_QUOTA = "/cgi-bin/oa/vacation/setoneuserquota";

    /**
     * 公费电话
     * https://developer.work.weixin.qq.com/document/path/93662
     */
    String GET_DIAL_RECORD = "/cgi-bin/dial/get_dial_record";

    /**
     * 日程
     * https://developer.work.weixin.qq.com/document/path/93624
     */
    String CALENDAR_ADD = "/cgi-bin/oa/calendar/add";
    String CALENDAR_UPDATE = "/cgi-bin/oa/calendar/update";
    String CALENDAR_GET = "/cgi-bin/oa/calendar/get";
    String CALENDAR_DEL = "/cgi-bin/oa/calendar/del";

    String SCHEDULE_ADD = "/cgi-bin/oa/schedule/add";
    String SCHEDULE_UPDATE = "/cgi-bin/oa/schedule/update";
    String SCHEDULE_GET = "/cgi-bin/oa/schedule/get";
    String SCHEDULE_DEL = "/cgi-bin/oa/schedule/del";
    String SCHEDULE_LIST = "/cgi-bin/oa/schedule/get_by_calendar";

    /**
     * 微盘
     * https://developer.work.weixin.qq.com/document/path/93654
     */
    String SPACE_CREATE = "/cgi-bin/wedrive/space_create";
    String SPACE_RENAME = "/cgi-bin/wedrive/space_rename";
    String SPACE_DISMISS = "/cgi-bin/wedrive/space_dismiss";
    String SPACE_INFO = "/cgi-bin/wedrive/space_info";
    String SPACE_ACL_ADD = "/cgi-bin/wedrive/space_acl_add";
    String SPACE_ACL_DEL = "/cgi-bin/wedrive/space_acl_del";
    String SPACE_SETTING = "/cgi-bin/wedrive/space_setting";
    String SPACE_SHARE = "/cgi-bin/wedrive/space_share";
    String FILE_LIST = "/cgi-bin/wedrive/file_list";
    String FILE_UPLOAD = "/cgi-bin/wedrive/file_upload";
    String FILE_DOWNLOAD = "/cgi-bin/wedrive/file_download";
    String FILE_RENAME = "/cgi-bin/wedrive/file_rename";
    String FILE_CREATE = "/cgi-bin/wedrive/file_create";
    String FILE_MOVE = "/cgi-bin/wedrive/file_move";
    String FILE_DELETE = "/cgi-bin/wedrive/file_delete";
    String FILE_INFO = "/cgi-bin/wedrive/file_info";
    String FILE_ACL_ADD = "/cgi-bin/wedrive/file_acl_add";
    String FILE_ACL_DEL = "/cgi-bin/wedrive/file_acl_del";
    String FILE_SETTING = "/cgi-bin/wedrive/file_setting";
    String FILE_SHARE = "/cgi-bin/wedrive/file_share";

    /**
     * 审批流程引擎
     * https://developer.work.weixin.qq.com/document/path/90269
     */
    String GET_OPEN_APPROVAL_DATA = "/cgi-bin/corp/getopenapprovaldata";
  }

  interface School {
    String GET_HEALTH_REPORT_STAT = "/cgi-bin/health/get_health_report_stat";
    String GET_REPORT_JOBIDS = "/cgi-bin/health/get_report_jobids";
    String GET_REPORT_JOB_INFO = "/cgi-bin/health/get_report_job_info";
    String GET_REPORT_ANSWER = "/cgi-bin/health/get_report_answer";

    String GET_TEACHER_CUSTOMIZE_HEALTH_INFO = "/cgi-bin/school/user/get_teacher_customize_health_info";
    String GET_STUDENT_CUSTOMIZE_HEALTH_INFO = "/cgi-bin/school/user/get_student_customize_health_info";
    String GET_HEALTH_QRCODE = "/cgi-bin/school/user/get_health_qrcode";

    String BATCH_CREATE_STUDENT = "/cgi-bin/school/user/batch_create_student";
    String BATCH_DELETE_STUDENT = "/cgi-bin/school/user/batch_delete_student";
    String BATCH_UPDATE_STUDENT = "/cgi-bin/school/user/batch_update_student";

    String CREATE_STUDENT = "/cgi-bin/school/user/create_student";
    String DELETE_STUDENT = "/cgi-bin/school/user/delete_student?userid=";
    String UPDATE_STUDENT = "/cgi-bin/school/user/update_student";
    String CREATE_PARENT = "/cgi-bin/school/user/create_parent";
    String UPDATE_PARENT = "/cgi-bin/school/user/update_parent";
    String DELETE_PARENT = "/cgi-bin/school/user/delete_parent?userid=";
    String SET_ARCH_SYNC_MODE = "/cgi-bin/school/set_arch_sync_mode";
    String SET_UPGRADE_INFO = "/cgi-bin/school/set_upgrade_info";

    String DEPARTMENT_CREATE = "/cgi-bin/school/department/create";
    String DEPARTMENT_UPDATE = "/cgi-bin/school/department/update";
    String DEPARTMENT_DELETE = "/cgi-bin/school/department/delete?id=";
    String DEPARTMENT_LIST = "/cgi-bin/school/department/list?id=";

    String GET_PAYMENT_RESULT = "/cgi-bin/school/get_payment_result";
    String GET_TRADE = "/cgi-bin/school/get_trade";
    String GET_ALLOW_SCOPE = "/cgi-bin/school/agent/get_allow_scope?agentid=";

    /**
     * 上课直播
     */
    String GET_LIVING_INFO = "/cgi-bin/school/living/get_living_info?livingid=";
    String GET_WATCH_STAT = "/cgi-bin/school/living/get_watch_stat";
    String GET_UNWATCH_STAT = "/cgi-bin/school/living/get_unwatch_stat";
  }

  interface Living {
    String GET_LIVING_CODE = "/cgi-bin/living/get_living_code";
    String GET_LIVING_INFO = "/cgi-bin/living/get_living_info?livingid=";
    String GET_WATCH_STAT = "/cgi-bin/living/get_watch_stat";
    String GET_LIVING_SHARE_INFO = "/cgi-bin/living/get_living_share_info";
    String GET_USER_ALL_LIVINGID = "/cgi-bin/living/get_user_all_livingid";

    String CREATE = "/cgi-bin/living/create";
    String MODIFY = "/cgi-bin/living/modify";
    String CANCEL = "/cgi-bin/living/cancel";
    String DELETE_REPLAY_DATA = "/cgi-bin/living/delete_replay_data";
  }

  interface MsgAudit {
    String GET_PERMIT_USER_LIST = "/cgi-bin/msgaudit/get_permit_user_list";
    String GET_GROUP_CHAT = "/cgi-bin/msgaudit/groupchat/get";
    String CHECK_SINGLE_AGREE = "/cgi-bin/msgaudit/check_single_agree";
  }

  interface Tag {
    String TAG_CREATE = "/cgi-bin/tag/create";
    String TAG_UPDATE = "/cgi-bin/tag/update";
    String TAG_DELETE = "/cgi-bin/tag/delete?tagid=%s";
    String TAG_LIST = "/cgi-bin/tag/list";
    String TAG_GET = "/cgi-bin/tag/get?tagid=%s";
    String TAG_ADD_TAG_USERS = "/cgi-bin/tag/addtagusers";
    String TAG_DEL_TAG_USERS = "/cgi-bin/tag/deltagusers";
  }

  interface TaskCard {
    String UPDATE_TASK_CARD = "/cgi-bin/message/update_taskcard";
    String UPDATE_TEMPLATE_CARD = "/cgi-bin/message/update_template_card";
  }

  interface Tp {
    String JSCODE_TO_SESSION = "/cgi-bin/service/miniprogram/jscode2session";
    String GET_CORP_TOKEN = "/cgi-bin/service/get_corp_token";
    String GET_PERMANENT_CODE = "/cgi-bin/service/get_permanent_code";
    String GET_SUITE_TOKEN = "/cgi-bin/service/get_suite_token";
    String GET_PROVIDER_TOKEN = "/cgi-bin/service/get_provider_token";
    String GET_PREAUTH_CODE = "/cgi-bin/service/get_pre_auth_code";
    String GET_AUTH_INFO = "/cgi-bin/service/get_auth_info";
    String GET_AUTH_CORP_JSAPI_TICKET = "/cgi-bin/get_jsapi_ticket";
    String GET_SUITE_JSAPI_TICKET = "/cgi-bin/ticket/get";
    String GET_USERINFO3RD = "/cgi-bin/service/getuserinfo3rd";
    String GET_USERDETAIL3RD = "/cgi-bin/service/getuserdetail3rd";
    String GET_LOGIN_INFO = "/cgi-bin/service/get_login_info";


    String CONTACT_SEARCH = "/cgi-bin/service/contact/search";
    String GET_ADMIN_LIST = "/cgi-bin/service/get_admin_list";

    // 获取订单详情
    String GET_ORDER = "/cgi-bin/service/get_order";

    // 获取订单列表
    String GET_ORDER_LIST = "/cgi-bin/service/get_order_list";

    // 延长试用期
    String PROLONG_TRY = "/cgi-bin/service/prolong_try";

  }

  interface License {
    String CREATE_NEW_ORDER = "/cgi-bin/license/create_new_order";
    String CREATE_RENEW_ORDER_JOB = "/cgi-bin/license/create_renew_order_job";
    String SUBMIT_ORDER_JOB = "/cgi-bin/license/submit_order_job";
    String LIST_ORDER = "/cgi-bin/license/list_order";
    String GET_ORDER = "/cgi-bin/license/get_order";
    String LIST_ORDER_ACCOUNT = "/cgi-bin/license/list_order_account";
    String ACTIVE_ACCOUNT = "/cgi-bin/license/active_account";
    String BATCH_ACTIVE_ACCOUNT = "/cgi-bin/license/batch_active_account";
    String GET_ACTIVE_INFO_BY_CODE = "/cgi-bin/license/get_active_info_by_code";
    String BATCH_GET_ACTIVE_INFO_BY_CODE = "/cgi-bin/license/batch_get_active_info_by_code";
    String LIST_ACTIVED_ACCOUNT = "/cgi-bin/license/list_actived_account";
    String GET_ACTIVE_INFO_BY_USER = "/cgi-bin/license/get_active_info_by_user";
    String BATCH_TRANSFER_LICENSE = "/cgi-bin/license/batch_transfer_license";
  }

  interface User {
    String USER_AUTHENTICATE = "/cgi-bin/user/authsucc?userid=";
    String USER_CREATE = "/cgi-bin/user/create";
    String USER_UPDATE = "/cgi-bin/user/update";
    String USER_DELETE = "/cgi-bin/user/delete?userid=";
    String USER_BATCH_DELETE = "/cgi-bin/user/batchdelete";
    String USER_GET = "/cgi-bin/user/get?userid=";
    String USER_LIST = "/cgi-bin/user/list?department_id=";
    String USER_SIMPLE_LIST = "/cgi-bin/user/simplelist?department_id=";
    String BATCH_INVITE = "/cgi-bin/batch/invite";
    String USER_CONVERT_TO_OPENID = "/cgi-bin/user/convert_to_openid";
    String USER_CONVERT_TO_USERID = "/cgi-bin/user/convert_to_userid";
    String GET_USER_ID = "/cgi-bin/user/getuserid";
    String GET_EXTERNAL_CONTACT = "/cgi-bin/crm/get_external_contact?external_userid=";
    String GET_JOIN_QR_CODE = "/cgi-bin/corp/get_join_qrcode?size_type=";
    String GET_ACTIVE_STAT = "/cgi-bin/user/get_active_stat";
  }

  interface ExternalContact {
    @Deprecated
    String GET_EXTERNAL_CONTACT = "/cgi-bin/crm/get_external_contact?external_userid=";

    String ADD_CONTACT_WAY = "/cgi-bin/externalcontact/add_contact_way";
    String GET_CONTACT_WAY = "/cgi-bin/externalcontact/get_contact_way";
    String UPDATE_CONTACT_WAY = "/cgi-bin/externalcontact/update_contact_way";
    String DEL_CONTACT_WAY = "/cgi-bin/externalcontact/del_contact_way";
    String CLOSE_TEMP_CHAT = "/cgi-bin/externalcontact/close_temp_chat";
    String GET_FOLLOW_USER_LIST = "/cgi-bin/externalcontact/get_follow_user_list";
    String GET_CONTACT_DETAIL = "/cgi-bin/externalcontact/get?external_userid=";
    String CONVERT_TO_OPENID = "/cgi-bin/externalcontact/convert_to_openid";
    String UNIONID_TO_EXTERNAL_USERID = "/cgi-bin/externalcontact/unionid_to_external_userid";
    String UNIONID_TO_EXTERNAL_USERID_3RD = "/cgi-bin/service/externalcontact/unionid_to_external_userid_3rd";
    String GET_NEW_EXTERNAL_USERID = "/cgi-bin/service/externalcontact/get_new_external_userid";
    String TO_SERVICE_EXTERNAL_USERID = "/cgi-bin/externalcontact/to_service_external_userid";
    String FINISH_EXTERNAL_USERID_MIGRATION = "/cgi-bin/externalcontact/finish_external_userid_migration";
    String GET_CONTACT_DETAIL_BATCH = "/cgi-bin/externalcontact/batch/get_by_user?";
    String UPDATE_REMARK = "/cgi-bin/externalcontact/remark";
    String LIST_EXTERNAL_CONTACT = "/cgi-bin/externalcontact/list?userid=";
    String LIST_UNASSIGNED_CONTACT = "/cgi-bin/externalcontact/get_unassigned_list";

    @Deprecated
    String TRANSFER_UNASSIGNED_CONTACT = "/cgi-bin/externalcontact/transfer";
    String TRANSFER_CUSTOMER = "/cgi-bin/externalcontact/transfer_customer";
    String TRANSFER_RESULT = "/cgi-bin/externalcontact/transfer_result";
    String RESIGNED_TRANSFER_CUSTOMER = "/cgi-bin/externalcontact/resigned/transfer_customer";
    String RESIGNED_TRANSFER_RESULT = "/cgi-bin/externalcontact/resigned/transfer_result";
    String GROUP_CHAT_LIST = "/cgi-bin/externalcontact/groupchat/list";
    String GROUP_CHAT_INFO = "/cgi-bin/externalcontact/groupchat/get";
    String OPENID_TO_CHATID= "/cgi-bin/externalcontact/opengid_to_chatid";
    String GROUP_CHAT_TRANSFER = "/cgi-bin/externalcontact/groupchat/transfer";
    String LIST_USER_BEHAVIOR_DATA = "/cgi-bin/externalcontact/get_user_behavior_data";
    String LIST_GROUP_CHAT_DATA = "/cgi-bin/externalcontact/groupchat/statistic";
    String ADD_JOIN_WAY = "/cgi-bin/externalcontact/groupchat/add_join_way";
    String GET_JOIN_WAY = "/cgi-bin/externalcontact/groupchat/get_join_way";
    String UPDATE_JOIN_WAY = "/cgi-bin/externalcontact/groupchat/update_join_way";
    String DEL_JOIN_WAY = "/cgi-bin/externalcontact/groupchat/del_join_way";
    String ADD_MSG_TEMPLATE = "/cgi-bin/externalcontact/add_msg_template";
    String SEND_WELCOME_MSG = "/cgi-bin/externalcontact/send_welcome_msg";

    String GET_CORP_TAG_LIST = "/cgi-bin/externalcontact/get_corp_tag_list";
    String ADD_CORP_TAG = "/cgi-bin/externalcontact/add_corp_tag";
    String EDIT_CORP_TAG = "/cgi-bin/externalcontact/edit_corp_tag";
    String DEL_CORP_TAG = "/cgi-bin/externalcontact/del_corp_tag";
    String MARK_TAG = "/cgi-bin/externalcontact/mark_tag";

    String ADD_MOMENT_TASK = "/cgi-bin/externalcontact/add_moment_task";
    String GET_MOMENT_TASK_RESULT = "/cgi-bin/externalcontact/get_moment_task_result";
    String GET_MOMENT_LIST = "/cgi-bin/externalcontact/get_moment_list";
    String GET_MOMENT_TASK = "/cgi-bin/externalcontact/get_moment_task";
    String GET_MOMENT_CUSTOMER_LIST = "/cgi-bin/externalcontact/get_moment_customer_list";
    String GET_MOMENT_SEND_RESULT = "/cgi-bin/externalcontact/get_moment_send_result";
    String GET_MOMENT_COMMENTS = "/cgi-bin/externalcontact/get_moment_comments";

    String GET_GROUP_MSG_SEND_RESULT = "/cgi-bin/externalcontact/get_groupmsg_send_result";
    String GET_GROUP_MSG_TASK = "/cgi-bin/externalcontact/get_groupmsg_task";
    String GET_GROUP_MSG_LIST_V2 = "/cgi-bin/externalcontact/get_groupmsg_list_v2";
    String GET_GROUP_MSG_RESULT = "/cgi-bin/externalcontact/get_group_msg_result";


    String GET_PRODUCT_ALBUM = "/cgi-bin/externalcontact/get_product_album";
    String GET_PRODUCT_ALBUM_LIST = "/cgi-bin/externalcontact/get_product_album_list";
    String ADD_PRODUCT_ALBUM = "/cgi-bin/externalcontact/add_product_album";
    String UPDATE_PRODUCT_ALBUM = "/cgi-bin/externalcontact/update_product_album";
    String DELETE_PRODUCT_ALBUM = "/cgi-bin/externalcontact/delete_product_album";

    String GROUP_WELCOME_TEMPLATE_ADD = "/cgi-bin/externalcontact/group_welcome_template/add";
    String GROUP_WELCOME_TEMPLATE_EDIT = "/cgi-bin/externalcontact/group_welcome_template/edit";
    String GROUP_WELCOME_TEMPLATE_GET = "/cgi-bin/externalcontact/group_welcome_template/get";
    String GROUP_WELCOME_TEMPLATE_DEL = "/cgi-bin/externalcontact/group_welcome_template/del";

    String UPLOAD_ATTACHMENT = "/cgi-bin/media/upload_attachment";

    String GET_SUBSCRIBE_QR_CODE = "/cgi-bin/externalcontact/get_subscribe_qr_code";
    String SET_SUBSCRIBE_MODE = "/cgi-bin/externalcontact/set_subscribe_mode";
    String GET_SUBSCRIBE_MODE = "/cgi-bin/externalcontact/get_subscribe_mode";
    String EXTERNAL_CONTACT_GET = "/cgi-bin/externalcontact/get?external_userid=";

    String ADD_INTERCEPT_RULE = "/cgi-bin/externalcontact/add_intercept_rule";
    String UPDATE_INTERCEPT_RULE = "/cgi-bin/externalcontact/update_intercept_rule";
    String DEL_INTERCEPT_RULE = "/cgi-bin/externalcontact/del_intercept_rule";

  }

  interface Kf {
    String ACCOUNT_ADD = "/cgi-bin/kf/account/add";
    String ACCOUNT_UPD = "/cgi-bin/kf/account/update";
    String ACCOUNT_DEL = "/cgi-bin/kf/account/del";
    String ACCOUNT_LIST = "/cgi-bin/kf/account/list";
    String ADD_CONTACT_WAY = "/cgi-bin/kf/add_contact_way";

    String SERVICER_ADD = "/cgi-bin/kf/servicer/add";
    String SERVICER_DEL = "/cgi-bin/kf/servicer/del";
    String SERVICER_LIST = "/cgi-bin/kf/servicer/list?open_kfid=";

    String SERVICE_STATE_GET = "/cgi-bin/kf/service_state/get";
    String SERVICE_STATE_TRANS = "/cgi-bin/kf/service_state/trans";

    String SYNC_MSG = "/cgi-bin/kf/sync_msg";
    String SEND_MSG = "/cgi-bin/kf/send_msg";

    String SEND_MSG_ON_EVENT = "/cgi-bin/kf/send_msg_on_event";
    String CUSTOMER_BATCH_GET = "/cgi-bin/kf/customer/batchget";
    String GET_CORP_STATISTIC = "/cgi-bin/kf/get_corp_statistic";
    String CUSTOMER_GET_UPGRADE_SERVICE_CONFIG = "/cgi-bin/kf/customer/get_upgrade_service_config";
    String CUSTOMER_UPGRADE_SERVICE = "/cgi-bin/kf/customer/upgrade_service";
    String CUSTOMER_CANCEL_UPGRADE_SERVICE = "/cgi-bin/kf/customer/cancel_upgrade_service";

  }

  interface Export {
    String SIMPLE_USER = "/cgi-bin/export/simple_user";
    String USER = "/cgi-bin/export/user";
    String DEPARTMENT = "/cgi-bin/export/department";
    String TAG_USER = "/cgi-bin/export/taguser";
    String GET_RESULT = "/cgi-bin/export/get_result?jobid=%s";
  }
}
