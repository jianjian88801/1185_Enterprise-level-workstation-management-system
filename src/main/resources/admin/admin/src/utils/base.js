const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooti8ts3/",
            name: "springbooti8ts3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooti8ts3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "企业级工位管理系统"
        } 
    }
}
export default base
