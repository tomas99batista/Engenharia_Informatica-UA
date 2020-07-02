define(['plugins/router', 'durandal/app'], function (router, app) {
    return {
        router: router,
        activate: function () {
            router.map([
                { route: '', title: 'Ínicio', moduleId: 'viewmodels/welcome', nav: false, menu: '' },
                { route: 'autores', moduleId: 'viewmodels/autores', nav: true, menu: '<i class="glyphicon glyphicon-pencil"></i> Autores' },
                { route: 'livros', moduleId: 'viewmodels/livros', nav: true, menu: '<i class="glyphicon glyphicon-book"></i> Livros' },
                { route: 'vendas', moduleId: 'viewmodels/vendas', nav: true, menu: '<i class="fa fa-eur"></i> Vendas' },
                { route: 'info', moduleId: 'viewmodels/info', nav: false, menu: ''},
                { route: 'welcome', moduleId: 'viewmodels/welcome', nav: false, menu: '' },
            ]).buildNavigationModel();

            return router.activate();
        }
      
    }; 
});

                    

