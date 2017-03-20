<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta name="viewport" content="width=device-width,maximum-scale=1.0, minimum-scale=1.0,user-scalable=no" />
    <title>
        好好学习
    </title>
    <meta name="keywords" content="{{ $settings['site_keywords'] }}" />
    <meta name="description" content="{{ $settings['short_intro'] }}" />
    <meta content='True' name='HandheldFriendly'>
    <#include "head-meta.ftl">
    <@block name="head"></@block>
</head>
<body>

    <@block name="main"></@block>

    <@block name="script">这里是脚本</@block>
</body>
</html>