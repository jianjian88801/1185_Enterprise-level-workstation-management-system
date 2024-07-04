const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"部门信息","menuJump":"列表","tableName":"bumenxinxi"}],"menu":"部门信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"工位信息","menuJump":"列表","tableName":"gongweixinxi"}],"menu":"工位信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"使用情况","menuJump":"列表","tableName":"shiyongqingkuang"}],"menu":"使用情况管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"工位分配","menuJump":"列表","tableName":"gongweifenpei"}],"menu":"工位分配管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"部门信息","menuJump":"列表","tableName":"bumenxinxi"}],"menu":"部门信息管理"},{"child":[{"buttons":["查看"],"menu":"工位分配","menuJump":"列表","tableName":"gongweifenpei"}],"menu":"工位分配管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]
    }
}
export default menu;
