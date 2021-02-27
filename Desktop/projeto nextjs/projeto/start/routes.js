'use strict'



/** @type {typeof import('@adonisjs/framework/src/Route/Manager')} */
const Route = use('Route')

Route.on('/').render('welcome')
Route.post("/register","AuthController.register");
Route.post("/authenticate","AuthController.authenticate");

Route.get("/cursos","CursoController.index");
Route.get("/alunos/:id","AlunoController.show");

Route.group(() => {
    Route.resource("alunos","AlunoController").only([
        "index",
        "store",
        "update",
        "destroy",
    
    ]);

}).middleware(["auth"]);



