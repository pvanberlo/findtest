define([
    'backbone',
    'text!find/templates/app/footer/footer-pane.html'
], function(Backbone, template) {

    return Backbone.View.extend({

        template: _.template(template),

        render: function() {
            this.$el.html(this.template());
        }

    });

})